import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1782(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static451.anInt7905 = 9;
		Static201.anInt3950 = 0x1 << Static451.anInt7905;
		Static122.anInt2483 = Static201.anInt3950 >> 1;
		Static417.anInt7344 = (int) Math.sqrt((double) (Static122.anInt2483 * Static122.anInt2483 + Static122.anInt2483 * Static122.anInt2483));
		Static161.anInt2922 = Static201.anInt3950 >> 2;
		Static54.anInt1078 = Static201.anInt3950;
		Static93.anInt1898 = arg0;
		Static382.anInt6965 = arg1;
		Static251.anInt4913 = arg2;
		Static222.aClass255ArrayArrayArray1 = new Class255[4][Static93.anInt1898][Static382.anInt6965];
		Static16.aClass205Array1 = new Class205[4];
		if (arg3) {
			Static193.anIntArrayArray95 = new int[Static93.anInt1898][Static382.anInt6965];
			Static347.aByteArrayArray18 = new byte[Static93.anInt1898][Static382.anInt6965];
			Static398.aShortArrayArray7 = new short[Static93.anInt1898][Static382.anInt6965];
			Static332.aClass255ArrayArrayArray3 = new Class255[1][Static93.anInt1898][Static382.anInt6965];
			Static209.aClass205Array2 = new Class205[1];
		} else {
			Static193.anIntArrayArray95 = null;
			Static347.aByteArrayArray18 = null;
			Static398.aShortArrayArray7 = null;
			Static332.aClass255ArrayArrayArray3 = null;
			Static209.aClass205Array2 = null;
		}
		if (arg4) {
			Static245.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static447.aClass62Array1 = new Class62[65535];
			Static98.aBooleanArray45 = new boolean[65535];
			Static246.anInt4872 = 0;
		} else {
			Static245.aLongArrayArrayArray1 = null;
			Static447.aClass62Array1 = null;
			Static98.aBooleanArray45 = null;
			Static246.anInt4872 = 0;
		}
		Static76.method1318(false);
		Static224.aClass260Array1 = new Class260[1000];
		Static216.anInt4206 = 0;
		Static251.aClass260Array2 = new Class260[1000];
		Static124.anInt2511 = 0;
		Static87.anIntArrayArrayArray1 = new int[4][Static93.anInt1898 + 1][Static382.anInt6965 + 1];
		Static301.aClass49_Sub2Array3 = new Class49_Sub2[5000];
		Static480.anInt7981 = 0;
		Static149.aBooleanArrayArray5 = new boolean[Static251.anInt4913 + Static251.anInt4913 + 1][Static251.anInt4913 + Static251.anInt4913 + 1];
		Static360.aBooleanArrayArray6 = new boolean[Static251.anInt4913 + Static251.anInt4913 + 2][Static251.anInt4913 + Static251.anInt4913 + 2];
		Static497.aClass75_1 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	public static void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static314.method4912(local35, false, true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!fc;")
	public static Class66 method1786(@OriginalArg(1) Component arg0) {
		return new Class66_Sub1(arg0);
	}
}
