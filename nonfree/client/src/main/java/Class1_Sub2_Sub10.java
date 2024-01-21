import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Lclient!l;")
	private Class45 aClass45_11;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	private int anInt2848;

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!dd;")
	private Class13 aClass13_947 = Static175.aClass13_1379;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I")
	public int method2032(@OriginalArg(1) int arg0) {
		if (this.aClass45_11 == null) {
			return this.anInt2848;
		} else {
			@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass45_11.method1988((long) arg0);
			return local17 == null ? this.anInt2848 : local17.anInt423;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ce;I)V")
	private void method2033(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt2847 = arg1.method1607();
		} else if (arg0 == 2) {
			this.anInt2845 = arg1.method1607();
		} else if (arg0 == 3) {
			this.aClass13_947 = arg1.method1622();
		} else if (arg0 == 4) {
			this.anInt2848 = arg1.method1626();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(41) int local41 = arg1.method1642();
			this.aClass45_11 = new Class45(Static16.method631(local41));
			for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
				@Pc(57) int local57 = arg1.method1626();
				@Pc(69) Class1 local69;
				if (arg0 == 5) {
					local69 = new Class1_Sub15(arg1.method1622());
				} else {
					local69 = new Class1_Sub6(arg1.method1626());
				}
				this.aClass45_11.method1981(local69, (long) local57);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)Lclient!dd;")
	public Class13 method2034(@OriginalArg(1) int arg0) {
		if (this.aClass45_11 == null) {
			return this.aClass13_947;
		} else {
			@Pc(22) Class1_Sub15 local22 = (Class1_Sub15) this.aClass45_11.method1988((long) arg0);
			return local22 == null ? this.aClass13_947 : local22.aClass13_1026;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method2035(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1607();
			if (local9 == 0) {
				return;
			}
			this.method2033(local9, arg0);
		}
	}
}
