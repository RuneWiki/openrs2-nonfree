import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class117 {

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
	public int anInt2977;

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
	public int anInt2979;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
	public int anInt2973 = 512;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	private int anInt2981 = 0;

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "Z")
	public boolean aBoolean234 = true;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Z")
	public boolean aBoolean235 = true;

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
	public int anInt2982 = -1;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method2730(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4888();
			if (local9 == 0) {
				return;
			}
			this.method2736(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)V")
	private void method2731(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local14;
		if (local27 < local14) {
			local36 = local27;
		}
		if (local34 < local36) {
			local36 = local34;
		}
		@Pc(50) double local50 = local14;
		if (local14 < local27) {
			local50 = local27;
		}
		if (local34 > local50) {
			local50 = local34;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local50 + local36) / 2.0D;
		if (local36 != local50) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local36 + local50);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local50 - local36);
			}
			if (local50 == local14) {
				local64 = (local27 - local34) / (local50 - local36);
			} else if (local27 == local50) {
				local64 = (local34 - local14) / (local50 - local36) + 2.0D;
			} else if (local50 == local34) {
				local64 = (local14 - local27) / (local50 - local36) + 4.0D;
			}
		}
		this.anInt2983 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		this.anInt2979 = (int) (local72 * 256.0D);
		if (this.anInt2983 < 0) {
			this.anInt2983 = 0;
		} else if (this.anInt2983 > 255) {
			this.anInt2983 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt2976 = (int) ((1.0D - local72) * local66 * 512.0D);
		} else {
			this.anInt2976 = (int) (local72 * 512.0D * local66);
		}
		if (this.anInt2979 < 0) {
			this.anInt2979 = 0;
		} else if (this.anInt2979 > 255) {
			this.anInt2979 = 255;
		}
		if (this.anInt2976 < 1) {
			this.anInt2976 = 1;
		}
		this.anInt2977 = (int) (local64 * (double) this.anInt2976);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method2736(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2981 = arg0.method4862();
			this.method2731(this.anInt2981);
		} else if (arg1 == 2) {
			this.anInt2982 = arg0.method4858();
			if (this.anInt2982 != 65535) {
				return;
			}
			this.anInt2982 = -1;
		} else if (arg1 == 3) {
			this.anInt2973 = arg0.method4858() << 2;
			return;
		} else if (arg1 == 4) {
			this.aBoolean235 = false;
			return;
		} else if (arg1 == 5) {
			this.aBoolean234 = false;
			return;
		}
	}
}
