import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "Lclient!um;")
	public static Class243 aClass243_113;

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
	public static int anInt3310;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
	public static int anInt3319 = -1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILclient!mn;I)V")
	public static void method2657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub27 arg2, @OriginalArg(4) int arg3) {
		@Pc(24) long local24 = (long) (arg3 | arg1 << 28 | arg0 << 14);
		@Pc(30) Class5_Sub24 local30 = (Class5_Sub24) Static400.aClass252_38.method5659(local24);
		if (local30 == null) {
			local30 = new Class5_Sub24();
			Static400.aClass252_38.method5658(local30, local24);
			local30.aClass177_21.method3615(arg2);
			return;
		}
		@Pc(53) Class40 local53 = Static306.aClass67_3.method1452(arg2.anInt4203);
		@Pc(56) int local56 = local53.anInt1176;
		if (local53.anInt1182 == 1) {
			local56 *= arg2.anInt4204 + 1;
		}
		for (@Pc(73) Class5_Sub27 local73 = (Class5_Sub27) local30.aClass177_21.method3618(); local73 != null; local73 = (Class5_Sub27) local30.aClass177_21.method3619()) {
			local53 = Static306.aClass67_3.method1452(local73.anInt4203);
			@Pc(86) int local86 = local53.anInt1176;
			if (local53.anInt1182 == 1) {
				local86 *= local73.anInt4204 + 1;
			}
			if (local56 > local86) {
				Static442.method5809(arg2, local73);
				return;
			}
		}
		local30.aClass177_21.method3615(arg2);
	}
}
