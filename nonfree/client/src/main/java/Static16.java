import java.awt.Canvas;
import java.awt.Dimension;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public static int anInt10139;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public static int anInt10140;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_67 = new Class295(64);

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt10137 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method8267(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static57.method1069(local11.height, local11.width);
		if (Static471.anInt7481 == 1) {
			Static565.aClass95_13.method8028(arg0, Static233.anInt4125, Static320.anInt5358);
		} else {
			Static565.aClass95_13.method8028(arg0, Static8.anInt105, Static516.anInt8123);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!mfa;I)Ljava/lang/String;")
	public static String method8270(@OriginalArg(0) Class3_Sub5_Sub13 arg0) {
		return arg0.aString79 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method8272(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static566.aClass92_6.aBoolean172) {
			Static98.aClass275_2 = new Class275();
			Static98.aClass275_2.aString91 = arg0;
			Static98.aClass275_2.anInt7235 = arg1;
			if (Static228.aClass135_3 != Static256.aClass135_4) {
				Static98.aClass275_2.anInt7236 = Static98.aClass275_2.anInt7235 + 40000;
				Static98.aClass275_2.anInt7232 = Static98.aClass275_2.anInt7235 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static588.aClass236_Sub1Array2.length; local35++) {
				if (Static588.aClass236_Sub1Array2[local35].anInt6389 == arg1) {
					Static622.anInt10292 = Static588.aClass236_Sub1Array2[local35].anInt6386;
				}
			}
			return true;
		}
		@Pc(65) String local65 = "";
		if (Static256.aClass135_4 != Static228.aClass135_3) {
			local65 = ":" + (arg1 + 7000);
		}
		@Pc(80) String local80 = "";
		if (Static360.aString78 != null) {
			local80 = "/p=" + Static360.aString78;
		}
		@Pc(128) String local128 = "http://" + arg0 + local65 + "/l=" + Static654.anInt10668 + "/a=" + Static224.anInt3866 + local80 + "/j" + (Static158.aBoolean218 ? "1" : "0") + ",o" + (Static154.aBoolean424 ? "1" : "0") + ",a2";
		try {
			Static548.aClient1.getAppletContext().showDocument(new URL(local128), "_self");
			return true;
		} catch (@Pc(146) Exception local146) {
			return false;
		}
	}
}
