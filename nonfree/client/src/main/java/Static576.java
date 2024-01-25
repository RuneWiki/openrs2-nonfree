import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!um;")
	public static Class343 aClass343_1;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public static int anInt9510 = 0;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public static int anInt9519 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([BIBLclient!eea;)Lclient!tea;")
	public static Class319 method8007(@OriginalArg(0) byte[] arg0, @OriginalArg(3) Class87_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static446.anIntArray541, 0);
		if (Static446.anIntArray541[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class319(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8008(@OriginalArg(0) String arg0) {
		if (Static177.aStringArray9 == null) {
			Static536.method7484();
		}
		Static178.aCalendar1.setTime(new Date(Static438.method6517()));
		@Pc(20) int local20 = Static178.aCalendar1.get(11);
		@Pc(24) int local24 = Static178.aCalendar1.get(12);
		@Pc(34) int local34 = Static178.aCalendar1.get(13);
		@Pc(68) String local68 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local34 / 10 + local34 % 10;
		@Pc(73) String[] local73 = Static218.method3754('\n', arg0);
		for (@Pc(75) int local75 = 0; local75 < local73.length; local75++) {
			for (@Pc(78) int local78 = Static534.anInt8920; local78 > 0; local78--) {
				Static177.aStringArray9[local78] = Static177.aStringArray9[local78 - 1];
			}
			Static177.aStringArray9[0] = local68 + ": " + local73[local75];
			if (Static439.aFileOutputStream1 != null) {
				try {
					Static439.aFileOutputStream1.write(Static313.method4758(Static177.aStringArray9[0] + "\n"));
				} catch (@Pc(126) IOException local126) {
				}
			}
			if (Static534.anInt8920 < Static177.aStringArray9.length - 1) {
				if (Static195.anInt9449 > 0) {
					Static195.anInt9449++;
				}
				Static534.anInt8920++;
			}
		}
	}
}
