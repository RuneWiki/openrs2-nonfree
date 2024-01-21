import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!va", name = "U", descriptor = "Lclient!ag;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!va", name = "hb", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_17;

	@OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
	public static int anInt4443;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "Lclient!fc;")
	public static Class25 aClass25_24 = new Class25(64);

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1491 = Static49.method1293("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public static int anInt4439 = 0;

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1492 = Static49.method1293("Okay");

	@OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
	public static int anInt4442 = 0;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ZII)I")
	public static int method3404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub16 local15 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray250.length) {
			return local15.anIntArray250[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V")
	public static void method3405() {
		aClass70_1492 = null;
		aClass25_24 = null;
		aClass76_Sub1_17 = null;
		aClass6_1 = null;
		aClass70_1491 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!sa;I)V")
	public static void method3406(@OriginalArg(0) Class71 arg0) {
		Static114.aClass71_1 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ig;)V")
	public static void method3407(@OriginalArg(1) Class39 arg0) {
		if (Static3.anInt154 == arg0.anInt2322) {
			Static161.aBooleanArray18[arg0.anInt2352] = true;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(ZII)I")
	public static int method3408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 >>> 31;
		return (arg0 + local3) / arg1 - local3;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(II)Lclient!j;")
	public static Class1_Sub1_Sub10 method3409(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub10 local10 = (Class1_Sub1_Sub10) Static74.aClass25_13.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static59.method1447(arg0, Static110.aClass76_91, Static67.aClass76_58);
		if (local10 != null) {
			Static74.aClass25_13.method1299(local10, (long) arg0);
		}
		return local10;
	}
}
