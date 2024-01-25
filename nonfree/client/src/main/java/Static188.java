import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)I")
	public static int method3422(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "(I)V")
	public static void method3423() {
		Static74.anInt1598 = 0;
		Static492.aClass208Array1 = new Class208[50];
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!ha;III)Lclient!ka;")
	public static Class25 method3424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class25 local12 = (Class25) Static391.aClass233_31.method5669(local6);
		if (local12 == null) {
			@Pc(22) Class379 local22 = Static614.method8359(arg2, Static625.aClass97_153);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt10284 < 13) {
				local22.method8586();
			}
			local12 = arg3.method7975(local22, 2055, Static509.anInt8576, 64, 768);
			Static391.aClass233_31.method5662(local12, local6);
		}
		local12 = local12.method7732((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.a(arg0);
		}
		if (arg1 != 0) {
			local12.FA(arg1);
		}
		if (arg5 != 0) {
			local12.VA(arg5);
		}
		if (arg4 != 0) {
			local12.H(0, arg4, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method3425(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(30) String local30 = Static70.method1355(arg0);
		if (local30 == null) {
			return;
		}
		for (@Pc(35) int local35 = 0; local35 < Static446.anInt7901; local35++) {
			@Pc(40) String local40 = Static391.aStringArray25[local35];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static70.method1355(local40);
			if (local40 != null && local40.equals(local30)) {
				Static446.anInt7901--;
				for (@Pc(64) int local64 = local35; local64 < Static446.anInt7901; local64++) {
					Static391.aStringArray25[local64] = Static391.aStringArray25[local64 + 1];
					Static488.aStringArray35[local64] = Static488.aStringArray35[local64 + 1];
					Static59.anIntArray128[local64] = Static59.anIntArray128[local64 + 1];
					Static365.aStringArray23[local64] = Static365.aStringArray23[local64 + 1];
					Static22.anIntArray731[local64] = Static22.anIntArray731[local64 + 1];
					Static446.aBooleanArray41[local64] = Static446.aBooleanArray41[local64 + 1];
				}
				Static207.anInt4343 = Static44.anInt975;
				@Pc(128) Class2_Sub50 local128 = Static595.method8194(Static610.aClass310_2, Static141.aClass269_34);
				local128.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0));
				local128.aClass2_Sub34_Sub2_2.method6918(arg0);
				Static311.method4754(local128);
				return;
			}
		}
	}
}
