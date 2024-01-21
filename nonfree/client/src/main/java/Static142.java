import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray33;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_42;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_44 = new Class66(5);

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public static int anInt3317 = 0;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1218 = Static177.method3050(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[520];

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nb;")
	public static RuntimeException_Sub1 method2440(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIB)I")
	public static int method2441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "(B)V")
	public static void method2442() {
		for (@Pc(15) Class4_Sub1_Sub1_Sub5 local15 = (Class4_Sub1_Sub1_Sub5) Static103.aClass11_10.method274(); local15 != null; local15 = (Class4_Sub1_Sub1_Sub5) Static103.aClass11_10.method271()) {
			if (Static73.anInt1873 != local15.anInt1005 || local15.aBoolean52) {
				local15.method3173();
			} else if (anInt3325 >= local15.anInt1013) {
				local15.method677(Static68.anInt1847);
				if (local15.aBoolean52) {
					local15.method3173();
				} else {
					Static101.method1950(local15.anInt1005, local15.anInt1007, local15.anInt1014, local15.anInt999, 60, local15, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
	public static int method2444(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
