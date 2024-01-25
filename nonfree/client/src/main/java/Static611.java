import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public static int anInt10746;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)Lclient!vi;")
	public static Class2_Sub52 method9194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class2_Sub52 local13 = null;
		if (arg1 == 0) {
			local13 = Static311.method5098(Static264.aClass341_56, Static125.aClass179_1);
		}
		if (arg1 == 1) {
			local13 = Static311.method5098(Static206.aClass341_48, Static125.aClass179_1);
		}
		local13.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
		local13.aClass2_Sub8_Sub2_2.method5187(Static640.anInt11085 + arg2);
		local13.aClass2_Sub8_Sub2_2.method5218(arg0 + Static490.anInt8763);
		Static472.anInt8440 = arg0;
		Static587.anInt10248 = arg2;
		Static191.aBoolean318 = false;
		Static277.method9739();
		return local13;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBLclient!lea;Ljava/lang/String;)Lclient!hu;")
	public static Class154 method9195(@OriginalArg(2) Class101_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static55.anIntArray61, 0);
		if (Static55.anIntArray61[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class154(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
