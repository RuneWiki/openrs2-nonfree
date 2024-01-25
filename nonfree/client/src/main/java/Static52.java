import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!ha;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!ij;")
	public static Class93 aClass93_18;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[[[Lclient!r;")
	public static Class174[][][] aClass174ArrayArrayArray1;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt969 = -50;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt972 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method835() {
		for (@Pc(3) int local3 = 0; local3 < Static255.aByteArrayArrayArray13.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static255.aByteArrayArrayArray13[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static255.aByteArrayArrayArray13[0][0].length; local16++) {
					Static255.aByteArrayArrayArray13[local3][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
	public static int method837() {
		if ((double) Static290.aFloat21 == 3.0D) {
			return 37;
		} else if ((double) Static290.aFloat21 == 4.0D) {
			return 50;
		} else if ((double) Static290.aFloat21 == 6.0D) {
			return 75;
		} else if ((double) Static290.aFloat21 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
