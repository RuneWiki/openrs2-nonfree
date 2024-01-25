import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!el;[B)Lclient!nm;")
	public static Class222 method4647(@OriginalArg(2) Class14_Sub2_Sub1 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static253.anIntArray376, 0);
		if (Static253.anIntArray376[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class222(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B")
	public static byte[] method4648(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub3 local12 = (Class6_Sub2_Sub3) Static232.aClass94_5.method2647((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static411.method7689(local47, local23);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class6_Sub2_Sub3(local17);
			Static232.aClass94_5.method2643((long) arg0, local12);
		}
		return local12.aByteArray7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method4650() {
		for (@Pc(15) Class6_Sub45 local15 = (Class6_Sub45) Static182.aClass361_23.method7838(); local15 != null; local15 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			if (Static105.method1887(local15.anInt8730)) {
				Static25.method793(local15);
			}
		}
		if (Static421.anInt7365 == 1) {
			Static175.method3221();
			return;
		}
		Static586.method7778(Static574.anInt9422, Static363.anInt6354, Static144.anInt3166, Static397.anInt6954);
		@Pc(51) int local51 = Static555.aClass327_13.method7196(Static230.aClass156_23.method4065(Static25.anInt769));
		for (@Pc(56) Class6_Sub45 local56 = (Class6_Sub45) Static182.aClass361_23.method7838(); local56 != null; local56 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			@Pc(64) int local64 = Static235.method4086(local56);
			if (local51 < local64) {
				local51 = local64;
			}
		}
		Static144.anInt3166 = (Static370.aBoolean454 ? 26 : 22) + Static421.anInt7365 * 16;
		Static363.anInt6354 = local51 + 8;
	}
}
