import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Z")
	public static boolean aBoolean741;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lclient!nfa;")
	public static Class33_Sub1 method8834() {
		Static233.anInt4297 = 0;
		return Static210.method3644();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public static void method8835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static397.method5885(local7.aClass4_Sub2_Sub3_1);
		Static397.method5885(local7.aClass4_Sub2_Sub3_2);
		if (local7.aClass4_Sub2_Sub3_1 != null) {
			local7.aClass4_Sub2_Sub3_1 = null;
		}
		if (local7.aClass4_Sub2_Sub3_2 != null) {
			local7.aClass4_Sub2_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method8836(@OriginalArg(1) int arg0) {
		if (arg0 == Static102.anInt1994) {
			return;
		}
		Static326.anInt5541 = Static448.anInt7637 = Static628.anIntArray593[arg0];
		Static364.method5405();
		Static269.anIntArrayArrayArray4 = new int[4][Static326.anInt5541 >> 3][Static448.anInt7637 >> 3];
		Static217.anIntArrayArray20 = new int[Static326.anInt5541][Static448.anInt7637];
		Static254.anIntArrayArray24 = new int[Static326.anInt5541][Static448.anInt7637];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static322.aClass352Array1[local46] = Static70.method1148(Static448.anInt7637, Static326.anInt5541);
		}
		Static105.aByteArrayArrayArray3 = new byte[4][Static326.anInt5541][Static448.anInt7637];
		Static103.method1647(Static448.anInt7637, Static326.anInt5541);
		Static235.method3914(Static448.anInt7637 >> 3, Static326.anInt5541 >> 3, Static213.aClass133_5);
		Static102.anInt1994 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method8837() {
		Static12.aClass87_12.method1801();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!ds;Lclient!ds;)V")
	public static void method8838(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_299 != null) {
			arg1.method9047();
		}
		arg1.aClass5_299 = arg0.aClass5_299;
		arg1.aClass5_300 = arg0;
		arg1.aClass5_299.aClass5_300 = arg1;
		arg1.aClass5_300.aClass5_299 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!la;IIB)Lclient!b;")
	public static Class26 method8839(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method4681(arg1, 0);
		return local14 == null ? null : new Class26(local14);
	}
}
