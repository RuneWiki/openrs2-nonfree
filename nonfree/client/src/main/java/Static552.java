import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public static int anInt9486;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
	public static int anInt9489;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public static int anInt9484 = 0;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "Lclient!rga;")
	public static final Class290 aClass290_37 = new Class290("game4", 3);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7749(@OriginalArg(0) String arg0) {
		if (Static363.aStringArray36 == null) {
			Static466.method6960();
		}
		Static287.aCalendar1.setTime(new Date(Static582.method8056()));
		@Pc(28) int local28 = Static287.aCalendar1.get(11);
		@Pc(32) int local32 = Static287.aCalendar1.get(12);
		@Pc(36) int local36 = Static287.aCalendar1.get(13);
		@Pc(70) String local70 = Integer.toString(local28 / 10) + local28 % 10 + ":" + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
		@Pc(75) String[] local75 = Static206.method3730(arg0, '\n');
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			for (@Pc(81) int local81 = Static310.anInt1854; local81 > 0; local81--) {
				Static363.aStringArray36[local81] = Static363.aStringArray36[local81 - 1];
			}
			Static363.aStringArray36[0] = local70 + ": " + local75[local77];
			if (Static466.aFileOutputStream1 != null) {
				try {
					Static466.aFileOutputStream1.write(Static1.method5883(Static363.aStringArray36[0] + "\n"));
				} catch (@Pc(130) IOException local130) {
				}
			}
			if (Static310.anInt1854 < Static363.aStringArray36.length - 1) {
				if (Static107.anInt2893 > 0) {
					Static107.anInt2893++;
				}
				Static310.anInt1854++;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([BLclient!hl;II)Lclient!on;")
	public static Class246 method7750(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local16, arg0);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static411.anIntArray382, 0);
		if (Static411.anIntArray382[0] == 0) {
			if (Static411.anIntArray382[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static411.anIntArray382, 1);
			if (Static411.anIntArray382[1] > 1) {
				@Pc(62) byte[] local62 = new byte[Static411.anIntArray382[1]];
				OpenGL.glGetInfoLogARB(local16, Static411.anIntArray382[1], Static411.anIntArray382, 0, local62, 0);
				System.out.println(new String(local62));
			}
			if (Static411.anIntArray382[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class246(arg1, local16, arg2);
	}
}
