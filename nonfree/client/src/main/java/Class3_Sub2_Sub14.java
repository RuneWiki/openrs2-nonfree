import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "[Lclient!eh;")
	public Class28[] aClass28Array16;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public int anInt2753;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!eh;")
	public Class28 aClass28_885 = Static167.aClass28_1416;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	public int anInt2750 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!hd;I)V")
	public void method2174(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1545();
			if (local7 == 0) {
				return;
			}
			this.method2176(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!hd;I)V")
	private void method2176(@OriginalArg(1) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2752 = arg0.method1545();
		} else if (arg1 == 2) {
			this.anInt2753 = arg0.method1545();
		} else if (arg1 == 3) {
			this.aClass28_885 = arg0.method1516();
		} else if (arg1 == 4) {
			this.anInt2749 = arg0.method1540();
		} else {
			@Pc(50) int local50;
			if (arg1 == 5) {
				this.anInt2750 = arg0.method1510();
				this.anIntArray484 = new int[this.anInt2750];
				this.aClass28Array16 = new Class28[this.anInt2750];
				for (local50 = 0; local50 < this.anInt2750; local50++) {
					this.anIntArray484[local50] = arg0.method1540();
					this.aClass28Array16[local50] = arg0.method1516();
				}
			} else if (arg1 == 6) {
				this.anInt2750 = arg0.method1510();
				this.anIntArray485 = new int[this.anInt2750];
				this.anIntArray484 = new int[this.anInt2750];
				for (local50 = 0; local50 < this.anInt2750; local50++) {
					this.anIntArray484[local50] = arg0.method1540();
					this.anIntArray485[local50] = arg0.method1540();
				}
			}
		}
	}
}
