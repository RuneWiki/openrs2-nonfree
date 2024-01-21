import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!pd", name = "sb", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	private int anInt2271 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	public void method1347() {
		this.method1350(this.anInt2271);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!fe;BI)V")
	public void method1349(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(16) int local16 = arg0.method1410();
			if (local16 == 0) {
				return;
			}
			this.method1352(arg0, local16, arg1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	private void method1350(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		if (local23 > local10) {
			local32 = local10;
		}
		@Pc(40) double local40 = local23;
		@Pc(42) double local42 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		if (local10 > local23) {
			local40 = local10;
		}
		if (local30 > local40) {
			local40 = local30;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local32 + local40) / 2.0D;
		if (local40 != local32) {
			if (local40 == local23) {
				local42 = (local10 - local30) / (local40 - local32);
			} else if (local40 == local10) {
				local42 = (local30 - local23) / (-local32 + local40) + 2.0D;
			} else if (local30 == local40) {
				local42 = (local23 - local10) / (-local32 + local40) + 4.0D;
			}
			if (local76 < 0.5D) {
				local70 = (local40 - local32) / (local40 + local32);
			}
			if (local76 >= 0.5D) {
				local70 = (local40 - local32) / (2.0D - local40 - local32);
			}
		}
		local42 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt2268 = (int) ((1.0D - local76) * local70 * 512.0D);
		} else {
			this.anInt2268 = (int) (local70 * 512.0D * local76);
		}
		this.anInt2276 = (int) (local76 * 256.0D);
		if (this.anInt2276 < 0) {
			this.anInt2276 = 0;
		} else if (this.anInt2276 > 255) {
			this.anInt2276 = 255;
		}
		this.anInt2281 = (int) (local70 * 256.0D);
		if (this.anInt2281 < 0) {
			this.anInt2281 = 0;
		} else if (this.anInt2281 > 255) {
			this.anInt2281 = 255;
		}
		if (this.anInt2268 < 1) {
			this.anInt2268 = 1;
		}
		this.anInt2278 = (int) (local42 * (double) this.anInt2268);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!fe;III)V")
	private void method1352(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2271 = arg0.method1388();
		}
	}
}
