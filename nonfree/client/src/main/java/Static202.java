import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
	public static boolean aBoolean290;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;")
	public static String method3283(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(22) int local22 = 0;
			while (true) {
				local22 = arg0.indexOf(13, local22);
				if (local22 < 0) {
					break;
				}
				local13 += local17;
				local22++;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local13);
		@Pc(46) int local46 = 0;
		while (true) {
			@Pc(51) int local51 = arg0.indexOf(13, local46);
			if (local51 < 0) {
				local44.append(arg0.substring(local46));
				return local44.toString();
			}
			local44.append(arg0.substring(local46, local51));
			local46 = local51 + 1;
			local44.append(arg1);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!kfa;I)V")
	public static void method3284(@OriginalArg(0) Class7_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static127.anObject37 == null) {
			@Pc(5) Class139_Sub2_Sub2 local5 = new Class139_Sub2_Sub2();
			local12 = local5.method6527();
			Static127.anObject37 = Static111.method2038(local12);
		}
		if (Static517.anObject156 == null) {
			@Pc(27) Class139_Sub1_Sub2 local27 = new Class139_Sub1_Sub2();
			local12 = local27.method4018();
			Static517.anObject156 = Static111.method2038(local12);
		}
		@Pc(42) Class332 local42 = arg0.aClass332_1;
		if (local42.method7541() && Static580.anObject103 == null) {
			local12 = Static439.method6483(16.0F, 4.0F, 0.6F, 0.5F, 4.0F, new Class26_Sub1(419684));
			Static580.anObject103 = Static111.method2038(local12);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([BLclient!ad;II)Lclient!ar;")
	public static Class19 method3285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class7_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static381.anIntArray411, 0);
		if (Static381.anIntArray411[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class19(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
