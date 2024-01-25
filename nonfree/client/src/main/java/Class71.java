import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class71 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt2209;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public int anInt2214 = -1;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	private int anInt2217 = 0;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public int anInt2216 = 128;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!bk;IIZ)V")
	private void method2031(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt2217 = arg0.method1843();
			this.method2034(this.anInt2217);
		} else if (arg2 == 2) {
			this.anInt2214 = arg0.method1845();
			if (this.anInt2214 == 65535) {
				this.anInt2214 = -1;
				return;
			}
		} else {
			if (arg2 == 3) {
				this.anInt2216 = arg0.method1845();
			} else if (arg2 == 4) {
				this.aBoolean141 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
	private void method2034(@OriginalArg(1) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local19 > local28) {
			local37 = local28;
		}
		if (local37 > local35) {
			local37 = local35;
		}
		@Pc(51) double local51 = local19;
		if (local19 < local28) {
			local51 = local28;
		}
		if (local35 > local51) {
			local51 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local37 + local51) / 2.0D;
		if (local51 != local37) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local51 + local37);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local37 - local51);
			}
			if (local19 == local51) {
				local65 = (local28 - local35) / (local51 - local37);
			} else if (local51 == local28) {
				local65 = (local35 - local19) / (-local37 + local51) + 2.0D;
			} else if (local35 == local51) {
				local65 = (local19 - local28) / (-local37 + local51) + 4.0D;
			}
		}
		this.anInt2208 = (int) (local67 * 256.0D);
		local65 /= 6.0D;
		this.anInt2210 = (int) (local73 * 256.0D);
		if (local73 > 0.5D) {
			this.anInt2209 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt2209 = (int) (local73 * 512.0D * local67);
		}
		if (this.anInt2208 < 0) {
			this.anInt2208 = 0;
		} else if (this.anInt2208 > 255) {
			this.anInt2208 = 255;
		}
		if (this.anInt2210 < 0) {
			this.anInt2210 = 0;
		} else if (this.anInt2210 > 255) {
			this.anInt2210 = 255;
		}
		if (this.anInt2209 < 1) {
			this.anInt2209 = 1;
		}
		this.anInt2212 = (int) ((double) this.anInt2209 * local65);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!bk;I)V")
	public void method2035(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1832();
			if (local15 == 0) {
				return;
			}
			this.method2031(arg0, arg1, local15);
		}
	}
}
