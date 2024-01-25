import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!no", name = "Pb", descriptor = "Lclient!ps;")
	public static Class2_Sub29 aClass2_Sub29_6;

	@OriginalMember(owner = "client!no", name = "Kb", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_62 = new Class243(19, -1);

	@OriginalMember(owner = "client!no", name = "Nb", descriptor = "I")
	public static int anInt6154 = 0;

	@OriginalMember(owner = "client!no", name = "Ob", descriptor = "Ljava/lang/String;")
	public static String aString132 = "";

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BILclient!qba;I)Lclient!on;")
	public static Class216 method5236(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class39_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local16);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static245.anIntArray424, 0);
		if (Static245.anIntArray424[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class216(arg1, 34336, local16);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5240(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local11 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local11 || Static278.method4396(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local11 <= local25 - 1 || Static278.method4396(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(72) byte[] local72 = new byte[local31];
		Static109.method2115(0, arg0, local72);
		return local72;
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "(II)Lclient!cr;")
	public static Class44 method5246(@OriginalArg(0) int arg0) {
		@Pc(12) Class44 local12 = (Class44) Static227.aClass231_40.method6228((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static469.aClass53_135.method1616(arg0, 0);
		local12 = new Class44();
		if (local22 != null) {
			local12.method1461(new Class2_Sub29(local22));
		}
		local12.method1463();
		Static227.aClass231_40.method6232(local12, (long) arg0);
		return local12;
	}
}
