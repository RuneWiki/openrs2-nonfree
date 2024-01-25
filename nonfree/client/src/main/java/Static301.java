import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!td", name = "J", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!am;")
	public static Class11 aClass11_133;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt6084 = -1;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Ljava/lang/String;")
	public static final String aString227 = "white:";

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_34 = new Class198(32);

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Lclient!fd;")
	public static Class72 aClass72_19 = null;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[Lclient!ae;")
	public static final Class6[] aClass6Array1 = new Class6[16];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lclient!ok;")
	public static Class147 method5109(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static42.aFloat26 == 3.0D) {
				return Static170.aClass147_5;
			}
			if ((double) Static42.aFloat26 == 4.0D) {
				return Static292.aClass147_8;
			}
			if ((double) Static42.aFloat26 == 6.0D) {
				return Static135.aClass147_4;
			}
			if ((double) Static42.aFloat26 >= 8.0D) {
				return Static120.aClass147_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static42.aFloat26 == 3.0D) {
				return Static135.aClass147_4;
			}
			if ((double) Static42.aFloat26 == 4.0D) {
				return Static120.aClass147_2;
			}
			if ((double) Static42.aFloat26 == 6.0D) {
				return Static127.aClass147_3;
			}
			if ((double) Static42.aFloat26 >= 8.0D) {
				return Static84.aClass147_1;
			}
		} else if (arg0 == 2) {
			if ((double) Static42.aFloat26 == 3.0D) {
				return Static127.aClass147_3;
			}
			if ((double) Static42.aFloat26 == 4.0D) {
				return Static84.aClass147_1;
			}
			if ((double) Static42.aFloat26 == 6.0D) {
				return Static270.aClass147_9;
			}
			if ((double) Static42.aFloat26 >= 8.0D) {
				return Static282.aClass147_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public static void method5110() {
		for (@Pc(3) int local3 = 0; local3 < Static197.aClass100ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static197.aClass100ArrayArray1[local3].length; local7++) {
				Static197.aClass100ArrayArray1[local3][local7] = Static139.aClass100_2;
			}
		}
	}
}
