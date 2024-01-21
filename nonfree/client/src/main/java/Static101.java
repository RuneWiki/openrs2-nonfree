import java.awt.event.KeyEvent;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!nb;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 aClass1_Sub1_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[[[Lclient!rc;")
	public static Class61[][][] aClass61ArrayArrayArray1 = new Class61[4][104][104];

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1394 = Static106.method1849("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1393 = aClass66_1394;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public static int[] anIntArray421 = new int[1000];

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1395 = Static106.method1849("(U");

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt2503 = 0;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1396 = Static106.method1849("gleiten:");

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1397 = Static106.method1849("_");

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	public static int anInt2506 = 0;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1399 = Static106.method1849("Loading config )2 ");

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1398 = aClass66_1399;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIB)I")
	public static int method1765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg2 /= 2;
		}
		if (arg0 > 192) {
			arg2 /= 2;
		}
		if (arg0 > 217) {
			arg2 /= 2;
		}
		if (arg0 > 243) {
			arg2 /= 2;
		}
		return arg0 / 2 + (arg2 / 32 << 7) + (arg1 / 4 << 10);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int method1766(@OriginalArg(1) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 == 8364) {
			return 128;
		} else {
			if (local11 <= 0 || local11 >= 256) {
				local11 = -1;
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method1767() {
		Static103.anInt2540 = -1;
		Static15.aClass5_93 = null;
		Static39.anInt988 = 0;
		Static16.anInt490 = 2;
		Static23.anInt684 = -1;
		Static3.aBoolean3 = false;
		Static20.anInt622 = 1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method1768() {
		aClass24_2 = null;
		aClass66_1396 = null;
		aClass66_1394 = null;
		aClass66_1393 = null;
		aClass66_1395 = null;
		aClass66_1398 = null;
		anIntArray421 = null;
		aCRC32_2 = null;
		aClass1_Sub1_Sub2_Sub2_Sub1_3 = null;
		aClass66_1399 = null;
		aClass61ArrayArrayArray1 = null;
		aClass66_1397 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lclient!r;")
	public static Class1_Sub1_Sub13 method1769(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub1_Sub13 local19 = (Class1_Sub1_Sub13) Static22.aClass60_28.method1745((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static109.aClass5_80.method107(arg0, 1);
		local19 = new Class1_Sub1_Sub13();
		if (local29 != null) {
			local19.method1725(arg0, new Class1_Sub12(local29));
		}
		local19.method1726();
		Static22.aClass60_28.method1741((long) arg0, local19);
		return local19;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method1770() {
		Static38.anIntArray491 = null;
		Static12.aByteArrayArrayArray5 = null;
		Static92.anIntArray402 = null;
		Static85.aByteArrayArrayArray14 = null;
		Static6.aByteArrayArrayArray4 = null;
		Static29.anIntArray106 = null;
		Static49.anIntArray230 = null;
		Static131.aByteArrayArrayArray16 = null;
		Static96.anIntArray417 = null;
		Static108.anIntArrayArray4 = null;
		Static76.anIntArrayArrayArray6 = null;
		Static22.aByteArrayArrayArray6 = null;
	}
}
