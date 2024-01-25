import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
	public static int anInt8664;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
	public static int anInt8662 = 0;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!er;ILjava/lang/String;)Lclient!ed;")
	public static Class84 method6752(@OriginalArg(1) Class31_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static89.anIntArray76, 0);
		if (Static89.anIntArray76[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class84(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public static void method6753() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static359.aBooleanArray17[local11] = false;
		}
		Static15.anInt134 = 0;
		Static585.anInt10107 = Static397.anInt6998;
		Static481.anInt8356 = -1;
		Static357.anInt6345 = -1;
		Static456.anInt7974 = Static421.anInt7497;
		Static136.anInt3266 = Static568.anInt9808;
		Static188.anInt4080 = 5;
		Static107.anInt2618 = Static418.anInt7466;
		Static299.anInt5597 = 0;
		Static138.anInt3344 = -1;
		Static352.anInt6285 = Static335.anInt6057;
		Static127.anInt2897 = -1;
		Static466.anInt8097 = Static407.anInt7345;
	}
}
