import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
	public int anInt2028;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "[Lclient!sc;")
	public Class66[] aClass66Array11;

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
	public int anInt2038;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
	public int anInt2030 = 0;

	@OriginalMember(owner = "client!nc", name = "sb", descriptor = "Lclient!sc;")
	public Class66 aClass66_1105 = Static112.aClass66_1522;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!mc;)V")
	private void method1420(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2028 = arg1.method1190();
		} else if (arg0 == 2) {
			this.anInt2037 = arg1.method1190();
		} else if (arg0 == 3) {
			this.aClass66_1105 = arg1.method1214();
		} else if (arg0 == 4) {
			this.anInt2038 = arg1.method1210();
		} else {
			@Pc(61) int local61;
			if (arg0 == 5) {
				this.anInt2030 = arg1.method1176();
				this.aClass66Array11 = new Class66[this.anInt2030];
				this.anIntArray333 = new int[this.anInt2030];
				for (local61 = 0; local61 < this.anInt2030; local61++) {
					this.anIntArray333[local61] = arg1.method1210();
					this.aClass66Array11[local61] = arg1.method1214();
				}
			} else if (arg0 == 6) {
				this.anInt2030 = arg1.method1176();
				this.anIntArray333 = new int[this.anInt2030];
				this.anIntArray332 = new int[this.anInt2030];
				for (local61 = 0; local61 < this.anInt2030; local61++) {
					this.anIntArray333[local61] = arg1.method1210();
					this.anIntArray332[local61] = arg1.method1210();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method1422(@OriginalArg(0) Class1_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1190();
			if (local9 == 0) {
				return;
			}
			this.method1420(local9, arg0);
		}
	}
}
