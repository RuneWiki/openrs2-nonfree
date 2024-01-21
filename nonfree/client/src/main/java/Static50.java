import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	public static int anInt1152 = 0;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_582 = Static32.method683("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_583 = Static32.method683("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!bg;ILclient!bg;)V")
	public static void method897(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static48.aClass11_45 = arg1;
		Static104.aClass11_86 = arg0;
		Static69.anInt1430 = Static48.aClass11_45.method2069(3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int method898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub19 local6 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && local6.anIntArray200.length > arg0) {
			return local6.anIntArray200[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	public static void method900() {
		aClass49_582 = null;
		aClass49_583 = null;
		anIntArray106 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
	public static void method901(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static154.method2556(arg0 - 1L);
			Static154.method2556(1L);
		} else {
			Static154.method2556(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method902() {
		Static8.aByteArrayArrayArray6 = new byte[4][104][104];
		Static165.anIntArrayArrayArray6 = new int[4][105][105];
		Static91.anIntArray197 = new int[104];
		Static163.anIntArray57 = new int[104];
		Static77.anInt1626 = 99;
		Static32.anIntArray77 = new int[104];
		Static126.aByteArrayArrayArray7 = new byte[4][104][104];
		Static180.aByteArrayArrayArray9 = new byte[4][105][105];
		Static94.aByteArrayArrayArray5 = new byte[4][104][104];
		Static36.anIntArray81 = new int[104];
		Static81.aByteArrayArrayArray3 = new byte[4][104][104];
		Static54.anIntArray110 = new int[104];
	}
}
