import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[S")
	public static short[] aShortArray14;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public static int anInt863;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public static int anInt864;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!td;")
	public static Class79 aClass79_3 = new Class79(64);

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
	public static int[] anIntArray108 = new int[2000];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method494() {
		aShortArray14 = null;
		anIntArray108 = null;
		aClass79_3 = null;
		aString1 = null;
		anIntArray109 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!pa;Z)V")
	public static void method495(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(2) int local2 = arg0.anInt3207;
		@Pc(10) int local10 = (int) arg0.aLong140;
		arg0.method3141();
		if (arg1) {
			Static49.method908(local2);
		}
		Static141.method2470(local2);
		@Pc(32) Class60 local32 = Static111.method1964(local10);
		if (local32 != null) {
			Static39.method659(local32);
		}
		Static38.anInt1037 = 0;
		Static164.aBoolean201 = false;
		Static176.method2991(Static94.anInt2451, anInt864, Static112.anInt2868, Static141.anInt3598);
		if (Static165.anInt4050 != -1) {
			Static60.method3140(1, Static165.anInt4050);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZJ)V")
	public static void method496(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static25.aClass1_Sub8_Sub1_1.method919(190);
			Static25.aClass1_Sub8_Sub1_1.method873(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
	public static boolean method497(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!ed;")
	public static Class23 method498(@OriginalArg(0) int arg0) {
		return Static122.method2773(arg0, false);
	}
}
