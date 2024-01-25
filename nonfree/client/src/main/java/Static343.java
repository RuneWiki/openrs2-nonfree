import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Lclient!mn;")
	public static Class171 aClass171_44;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_43 = new Class208(2, -1);

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "[Lclient!nb;")
	public static final Class2_Sub1_Sub12[] aClass2_Sub1_Sub12Array4 = new Class2_Sub1_Sub12[14];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILclient!da;Z)V")
	public static void method2399(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub9 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt1143;
		@Pc(12) int local12 = (int) arg1.aLong401;
		arg1.method6260();
		if (arg0) {
			Static188.method5356(local8);
		}
		Static348.method4907(local8);
		@Pc(27) Class93 local27 = Static160.method2380(local12);
		if (local27 != null) {
			Static383.method5263(local27);
		}
		Static281.method3560();
		if (!arg2 && Static103.anInt5365 != -1) {
			Static233.method3189(Static103.anInt5365, 1);
		}
		@Pc(49) Class204 local49 = new Class204(Static394.aClass220_45);
		for (@Pc(54) Class2_Sub9 local54 = (Class2_Sub9) local49.method4747(); local54 != null; local54 = (Class2_Sub9) local49.method4746()) {
			if (!local54.method6258()) {
				local54 = (Class2_Sub9) local49.method4747();
				if (local54 == null) {
					break;
				}
			}
			if (local54.anInt1142 == 3) {
				@Pc(79) int local79 = (int) local54.aLong401;
				if (local79 >>> 16 == local8) {
					method2399(true, local54, arg2);
				}
			}
		}
	}
}
