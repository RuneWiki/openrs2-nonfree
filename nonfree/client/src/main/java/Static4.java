import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "I", descriptor = "Lclient!wea;")
	public static final Class389 aClass389_16 = new Class389();

	@OriginalMember(owner = "client!aba", name = "G", descriptor = "Lclient!wea;")
	public static final Class389 aClass389_17 = new Class389();

	@OriginalMember(owner = "client!aba", name = "F", descriptor = "[Lclient!wea;")
	public static final Class389[] aClass389Array8 = new Class389[] { aClass389_17, aClass389_16 };

	@OriginalMember(owner = "client!aba", name = "L", descriptor = "[S")
	public static short[] aShortArray135 = new short[256];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!mk;)V")
	public static void method7573(@OriginalArg(1) Class5_Sub1_Sub13 arg0) {
		if (arg0 == null) {
			return;
		}
		Static399.aClass20_33.method370(arg0);
		Static651.anInt10662++;
		@Pc(40) Class5_Sub1_Sub20 local40;
		if (arg0.aBoolean413 || "".equals(arg0.aString74)) {
			local40 = new Class5_Sub1_Sub20(arg0.aString74);
			Static530.anInt8424++;
		} else {
			@Pc(34) long local34 = arg0.aLong177;
			for (local40 = (Class5_Sub1_Sub20) Static99.aClass306_8.method6943(local34); local40 != null && !local40.aString114.equals(arg0.aString74); local40 = (Class5_Sub1_Sub20) Static99.aClass306_8.method6945()) {
			}
			if (local40 == null) {
				local40 = (Class5_Sub1_Sub20) Static529.aClass168_75.method3860(local34);
				if (local40 != null && !local40.aString114.equals(arg0.aString74)) {
					local40 = null;
				}
				if (local40 == null) {
					local40 = new Class5_Sub1_Sub20(arg0.aString74);
				}
				Static99.aClass306_8.method6944(local40, local34, -12002);
				Static530.anInt8424++;
			}
		}
		if (local40.method8389(arg0)) {
			Static19.method290(local40);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BC)Z")
	public static boolean method7574(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
