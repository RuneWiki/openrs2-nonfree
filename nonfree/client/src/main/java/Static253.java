import java.awt.Image;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_57 = new Class215(51, 4);

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	public static void method3676() {
		anImage2 = null;
		Static381.aFont1 = null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3677(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static231.anInt4434 = 7;
		Static4.anInt5935 = 0x1 << Static231.anInt4434;
		Static333.anInt5747 = Static4.anInt5935 >> 1;
		Static93.anInt1873 = (int) Math.sqrt((double) (Static333.anInt5747 * Static333.anInt5747 + Static333.anInt5747 * Static333.anInt5747));
		Static157.anInt3142 = Static4.anInt5935 >> 2;
		Static367.anInt6319 = Static4.anInt5935;
		Static422.anInt6945 = arg0;
		Static171.anInt3361 = arg1;
		Static230.anInt4431 = arg2;
		Static214.aClass164ArrayArrayArray4 = new Class164[4][Static422.anInt6945][Static171.anInt3361];
		Static67.aClass65Array1 = new Class65[4];
		if (arg3) {
			Static447.anIntArrayArray64 = new int[Static422.anInt6945][Static171.anInt3361];
			Static341.aByteArrayArray29 = new byte[Static422.anInt6945][Static171.anInt3361];
			Static346.aByteArrayArray26 = new byte[Static422.anInt6945][Static171.anInt3361];
			Static2.aClass164ArrayArrayArray1 = new Class164[1][Static422.anInt6945][Static171.anInt3361];
			Static285.aClass65Array3 = new Class65[1];
		} else {
			Static447.anIntArrayArray64 = null;
			Static341.aByteArrayArray29 = null;
			Static346.aByteArrayArray26 = null;
			Static2.aClass164ArrayArrayArray1 = null;
			Static285.aClass65Array3 = null;
		}
		if (arg4) {
			Static444.aLongArrayArrayArray2 = new long[4][arg0][arg1];
			Static106.aClass191Array1 = new Class191[65535];
			Static124.aBooleanArray12 = new boolean[65535];
			Static43.anInt7322 = 0;
		} else {
			Static444.aLongArrayArrayArray2 = null;
			Static106.aClass191Array1 = null;
			Static124.aBooleanArray12 = null;
			Static43.anInt7322 = 0;
		}
		Static86.method1547(false);
		Static91.aClass136Array2 = new Class136[1000];
		Static93.anInt1878 = 0;
		Static414.aClass136Array3 = new Class136[1000];
		Static7.anInt5461 = 0;
		Static162.anIntArrayArrayArray13 = new int[4][Static422.anInt6945 + 1][Static171.anInt3361 + 1];
		Static427.aClass16_Sub1Array3 = new Class16_Sub1[5000];
		Static1.anInt6 = 0;
		Static252.aBooleanArrayArray4 = new boolean[Static230.anInt4431 + Static230.anInt4431 + 1][Static230.anInt4431 + Static230.anInt4431 + 1];
		Static440.aBooleanArrayArray6 = new boolean[Static230.anInt4431 + Static230.anInt4431 + 2][Static230.anInt4431 + Static230.anInt4431 + 2];
		Static433.aClass70_1 = null;
	}
}
