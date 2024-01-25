import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	public static int anInt7023;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "Lclient!qc;")
	public static Class206 aClass206_2;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_100 = new Class146(11, 16);

	@OriginalMember(owner = "client!us", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!us", name = "h", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)I")
	public static int method5640(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!qn;IIZII)V")
	public static void method5641(@OriginalArg(0) Class211 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static350.anInt5812 = 1;
		Static66.aBoolean66 = false;
		Static252.aClass211_63 = arg0;
		anInt7023 = arg1;
		Static186.anInt3434 = arg2;
		Static403.anInt6562 = 0;
		Static107.anInt2011 = 10000;
	}
}
