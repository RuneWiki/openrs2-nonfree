import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!j", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_523 = Static38.method685(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Lclient!ai;")
	public static Class6 aClass6_524 = Static38.method685("T");

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Lclient!vb;")
	public static Class84 aClass84_3 = new Class84();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1123() {
		aByteArrayArrayArray4 = null;
		aClass6_524 = null;
		aClass6_523 = null;
		aClass84_3 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1124(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)I")
	public static int method1125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class2_Sub17 local20 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg0);
		if (local20 == null) {
			return -1;
		} else if (arg1 >= 0 && local20.anIntArray240.length > arg1) {
			return local20.anIntArray240[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Lclient!wa;")
	public static Class87 method1126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class87 local12 = Static57.method940(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass87Array2 == null || local12.aClass87Array2.length <= arg1) {
			return null;
		} else {
			return local12.aClass87Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[BLclient!je;B)V")
	public static void method1127(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(7) Class2_Sub12 local7 = new Class2_Sub12();
		local7.anInt1762 = 0;
		local7.aByteArray7 = arg1;
		local7.aLong241 = arg0;
		local7.aClass40_1 = arg2;
		@Pc(22) Class84 local22 = Static25.aClass84_2;
		synchronized (Static25.aClass84_2) {
			Static25.aClass84_2.method2701(local7);
		}
		Static113.method1831();
	}
}
