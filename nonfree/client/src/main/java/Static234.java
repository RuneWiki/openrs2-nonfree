import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "Lclient!wm;")
	public static Class390 aClass390_55;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
	public static int[] anIntArray216 = new int[2];

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_25 = new Class114();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3615(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static363.method7862(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static81.method1270(local5);
			local5 = Static640.method8651(local5, ":", "%3a");
			local5 = Static640.method8651(local5, "@", "%40");
			local5 = Static640.method8651(local5, "&", "%26");
			local5 = Static640.method8651(local5, "#", "%23");
			if (Static22.anApplet1 != null) {
				@Pc(102) Class331 local102 = Static53.aClass268_1.method6334(new URL(Static22.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static591.anInt9708 + "&u=" + (Static140.aString14 == null ? String.valueOf(Static65.aLong32) : Static140.aString14) + "&v1=" + Static429.aString71 + "&v2=" + Static429.aString66 + "&e=" + local5));
				while (local102.anInt9108 == 0) {
					Static579.method8004(1L);
				}
				if (local102.anInt9108 == 1) {
					@Pc(117) DataInputStream local117 = (DataInputStream) local102.anObject20;
					local117.read();
					local117.close();
				}
			}
		} catch (@Pc(124) Exception local124) {
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		Static562.method7749(arg3, arg4, arg0, (String) null, arg1, arg2, -1, arg5);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Lclient!ck;II)Lclient!oca;")
	public static Class261 method3621(@OriginalArg(0) String arg0, @OriginalArg(1) Class65_Sub1 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static179.anIntArray152, 0);
		if (Static179.anIntArray152[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class261(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
