import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
	public static int anInt11039;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!ww", name = "H", descriptor = "Lclient!tr;")
	public static final Class143 aClass143_3 = Static340.method5710();

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray4 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)Lclient!bn;")
	public static Class37 method9443(@OriginalArg(1) int arg0) {
		@Pc(13) Class37[] local13 = Static8.method138();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class37 local21 = local13[local15];
			if (arg0 == local21.anInt1090) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(Z)V")
	public static void method9445() {
		if (Static349.method6047(Static579.anInt10049) || Static43.method7854(Static579.anInt10049)) {
			Static95.method1629(Static598.anInt10387 >> 12, 5000, Static108.anInt1987 >> 12);
		} else {
			@Pc(20) int local20 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] >> 3;
			@Pc(27) int local27 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] >> 3;
			if (local20 >= 0 && Static222.anInt4533 >> 3 > local20 && local27 >= 0 && local27 < Static668.anInt11370 >> 3) {
				Static95.method1629(local27, 5000, local20);
			} else {
				Static95.method1629(Static668.anInt11370 >> 4, 0, Static222.anInt4533 >> 4);
			}
		}
		Static107.method1935();
		Static634.method9358();
		Static14.method7645();
		Static509.method7939();
	}

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "(I)[Lclient!hl;")
	public static Class148[] method9446() {
		return new Class148[] { Static262.aClass148_12, Static553.aClass148_19, Static472.aClass148_17, Static198.aClass148_9, Static601.aClass148_21, Static266.aClass148_13, Static645.aClass148_20, Static135.aClass148_6, Static92.aClass148_22, Static229.aClass148_11 };
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZB)I")
	public static int method9447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class2_Sub42 local12 = Static47.method979(arg2, arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local12.anIntArray351.length) {
			return local12.anIntArray351[arg0];
		} else {
			return 0;
		}
	}
}
