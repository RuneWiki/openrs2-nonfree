import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!hg;")
	public static Class132 aClass132_4;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
	public static final int[] anIntArray601 = new int[6];

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "J")
	public static long aLong221 = -1L;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!oa;IILclient!ws;)V")
	public static void method6665(@OriginalArg(1) Class14 arg0, @OriginalArg(4) Class361 arg1) {
		Static243.aClass361_38.method7842();
		if (Static315.aBoolean383) {
			return;
		}
		for (@Pc(25) Class6_Sub17 local25 = (Class6_Sub17) arg1.method7838(); local25 != null; local25 = (Class6_Sub17) arg1.method7845()) {
			@Pc(33) Class176 local33 = Static217.aClass213_2.method5127(local25.anInt2970);
			if (Static543.method7354(local33)) {
				@Pc(47) boolean local47 = Static280.method4613(local25, local33, arg0);
				if (local47) {
					Static324.method6174(local25, local33, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!oa;BI)Lclient!ta;")
	public static Class92 method6666(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class139 local9 = Static2.method57(arg2, arg1, arg0);
		return local9 == null ? null : local9.aClass92_8;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!vw;B)V")
	public static void method6668(@OriginalArg(0) int arg0, @OriginalArg(1) Class348 arg1) {
		if (Static269.aBoolean366) {
			arg0 = 0;
			Static269.aBoolean366 = false;
		}
		if (Static152.aClass348_3 != null && Static152.aClass348_3.method7685(arg1)) {
			return;
		}
		Static152.aClass348_3 = arg1;
		Static110.aLong61 = Static8.method201();
		Static185.anInt3865 = arg0;
		Static225.anInt4648 = arg0;
		if (Static225.anInt4648 == 0) {
			Static97.method1748();
			return;
		}
		Static309.aFloat135 = Static326.aFloat139;
		Static293.anInt5466 = Static88.anInt1753;
		Static418.anInt7259 = Static427.anInt7433;
		Static484.anInt8191 = Static300.anInt5540;
		Static550.aFloat195 = Static99.aFloat23;
		Static461.aClass26_6 = Static284.aClass26_4;
		Static182.aFloat69 = Static55.aFloat15;
		Static588.aFloat24 = Static123.aFloat63;
		Static222.aFloat110 = Static70.aFloat78;
		Static528.aFloat190 = Static89.aFloat22;
	}
}
