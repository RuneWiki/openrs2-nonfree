import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
	public int anInt1362;

	@OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
	public int anInt1365;

	@OriginalMember(owner = "client!ej", name = "ab", descriptor = "Lclient!wh;")
	private Class99 aClass99_3;

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "Lclient!oc;")
	private Class65 aClass65_849 = Static82.aClass65_1218;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BILclient!wa;)V")
	private void method888(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt1365 = arg1.method1738();
		} else if (arg0 == 2) {
			this.anInt1362 = arg1.method1738();
		} else if (arg0 == 3) {
			this.aClass65_849 = arg1.method1706();
		} else if (arg0 == 4) {
			this.anInt1364 = arg1.method1700();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(39) int local39 = arg1.method1753();
			this.aClass99_3 = new Class99(Static50.method921(local39));
			for (@Pc(49) int local49 = 0; local49 < local39; local49++) {
				@Pc(54) int local54 = arg1.method1700();
				@Pc(66) Class1 local66;
				if (arg0 == 5) {
					local66 = new Class1_Sub8(arg1.method1706());
				} else {
					local66 = new Class1_Sub21(arg1.method1700());
				}
				this.aClass99_3.method3290(local66, (long) local54);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lclient!oc;")
	public Class65 method889(@OriginalArg(1) int arg0) {
		if (this.aClass99_3 == null) {
			return this.aClass65_849;
		} else {
			@Pc(23) Class1_Sub8 local23 = (Class1_Sub8) this.aClass99_3.method3292((long) arg0);
			return local23 == null ? this.aClass65_849 : local23.aClass65_1073;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!wa;Z)V")
	public void method890(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1738();
			if (local7 == 0) {
				return;
			}
			this.method888(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)I")
	public int method894(@OriginalArg(1) int arg0) {
		if (this.aClass99_3 == null) {
			return this.anInt1364;
		} else {
			@Pc(25) Class1_Sub21 local25 = (Class1_Sub21) this.aClass99_3.method3292((long) arg0);
			return local25 == null ? this.anInt1364 : local25.anInt3504;
		}
	}
}
