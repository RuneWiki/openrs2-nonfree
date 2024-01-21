import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public int anInt1392;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "[Lclient!rf;")
	public Class70[] aClass70Array7;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	public int anInt1401;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	public int anInt1400 = 0;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!rf;")
	public Class70 aClass70_453 = Static168.aClass70_721;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!fa;IB)V")
	private void method1024(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1392 = arg0.method1234();
		} else if (arg1 == 2) {
			this.anInt1401 = arg0.method1234();
		} else if (arg1 == 3) {
			this.aClass70_453 = arg0.method1253();
		} else if (arg1 == 4) {
			this.anInt1397 = arg0.method1273();
		} else {
			@Pc(51) int local51;
			if (arg1 == 5) {
				this.anInt1400 = arg0.method1280();
				this.anIntArray129 = new int[this.anInt1400];
				this.aClass70Array7 = new Class70[this.anInt1400];
				for (local51 = 0; local51 < this.anInt1400; local51++) {
					this.anIntArray129[local51] = arg0.method1273();
					this.aClass70Array7[local51] = arg0.method1253();
				}
			} else if (arg1 == 6) {
				this.anInt1400 = arg0.method1280();
				this.anIntArray129 = new int[this.anInt1400];
				this.anIntArray130 = new int[this.anInt1400];
				for (local51 = 0; local51 < this.anInt1400; local51++) {
					this.anIntArray129[local51] = arg0.method1273();
					this.anIntArray130[local51] = arg0.method1273();
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!fa;I)V")
	public void method1027(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1234();
			if (local7 == 0) {
				return;
			}
			this.method1024(arg0, local7);
		}
	}
}
