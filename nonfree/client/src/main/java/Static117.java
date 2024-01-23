import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!df;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!ej;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!jb;")
	public static Class28 aClass28_47;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_696 = Static231.method3737("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_697 = Static231.method3737("not yet implemented");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	public static void method2012(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static189.anInt4168; local3++) {
			@Pc(14) long local14 = (long) Static37.anIntArray82[local3] << 32 | 0x20000000L;
			@Pc(20) Class5_Sub5_Sub2 local20 = Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local3]];
			if (local20 != null && local20.method2308() && arg0 == local20.aClass30_1.aBoolean93 && local20.aClass30_1.method873()) {
				@Pc(49) int local49 = local20.anInt3021 >> 7;
				@Pc(54) int local54 = local20.anInt3044 >> 7;
				if (local49 >= 0 && local49 < 104 && local54 >= 0 && local54 < 104) {
					if (local20.anInt2997 == 1 && (local20.anInt3021 & 0x7F) == 64 && (local20.anInt3044 & 0x7F) == 64) {
						if (Static140.anIntArrayArray12[local49][local54] == Static157.anInt3451) {
							continue;
						}
						Static140.anIntArrayArray12[local49][local54] = Static157.anInt3451;
					}
					if (!local20.aClass30_1.aBoolean94) {
						local14 |= Long.MIN_VALUE;
					}
					local20.anInt3000 = Static130.method2174(Static191.anInt4237, local20.anInt3044, local20.anInt3021);
					Static58.method1127(Static191.anInt4237, local20.anInt3021, local20.anInt3044, local20.anInt3000, (local20.anInt2997 - 1) * 64 + 60, local20, local20.anInt3040, local14, local20.aBoolean257);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lg;Lclient!dg;IB)V")
	public static void method2014(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class120 local9 = Static192.aClass120_19;
		synchronized (Static192.aClass120_19) {
			for (@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) Static192.aClass120_19.method3564(); local16 != null; local16 = (Class1_Sub3) Static192.aClass120_19.method3561()) {
				if (local16.aLong177 == (long) arg2 && local16.aClass73_1 == arg0 && local16.anInt254 == 0) {
					local7 = local16.aByteArray1;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg0.method2092(arg2);
			arg1.method854(arg0, arg2, true, local71);
		} else {
			arg1.method854(arg0, arg2, true, local7);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
	public static void method2015() {
		Static7.aClass61_9.method1695(5);
	}
}
