import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class128 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public int anInt4065;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public int anInt4072;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public int anInt4067 = -1;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	private int anInt4071 = 0;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	public int anInt4076 = 128;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!cg;I)V")
	public void method3246(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2690();
			if (local5 == 0) {
				return;
			}
			this.method3248(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!cg;II)V")
	private void method3248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4071 = arg1.method2681();
			this.method3249(this.anInt4071);
		} else if (arg2 == 2) {
			this.anInt4067 = arg1.method2691();
			if (this.anInt4067 == 65535) {
				this.anInt4067 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt4076 = arg1.method2691();
		} else if (arg2 == 4) {
			this.aBoolean311 = false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	private void method3249(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local23;
		if (local23 < local14) {
			local39 = local14;
		}
		if (local39 < local37) {
			local39 = local37;
		}
		@Pc(54) double local54 = local23;
		if (local14 < local23) {
			local54 = local14;
		}
		if (local37 < local54) {
			local54 = local37;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local39 + local54) / 2.0D;
		if (local39 != local54) {
			if (local23 == local39) {
				local68 = (local14 - local37) / (-local54 + local39);
			} else if (local39 == local14) {
				local68 = (local37 - local23) / (local39 - local54) + 2.0D;
			} else if (local37 == local39) {
				local68 = (local23 - local14) / (local39 - local54) + 4.0D;
			}
			if (local76 < 0.5D) {
				local70 = (local39 - local54) / (local54 + local39);
			}
			if (local76 >= 0.5D) {
				local70 = (local39 - local54) / (2.0D - local39 - local54);
			}
		}
		this.anInt4062 = (int) (local76 * 256.0D);
		local68 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt4063 = (int) ((1.0D - local76) * 512.0D * local70);
		} else {
			this.anInt4063 = (int) (local76 * 512.0D * local70);
		}
		if (this.anInt4063 < 1) {
			this.anInt4063 = 1;
		}
		this.anInt4072 = (int) (local68 * (double) this.anInt4063);
		this.anInt4065 = (int) (local70 * 256.0D);
		if (this.anInt4062 < 0) {
			this.anInt4062 = 0;
		} else if (this.anInt4062 > 255) {
			this.anInt4062 = 255;
		}
		if (this.anInt4065 < 0) {
			this.anInt4065 = 0;
		} else if (this.anInt4065 > 255) {
			this.anInt4065 = 255;
		}
	}
}
