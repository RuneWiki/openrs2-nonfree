import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt4280;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public static int anInt4281;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1463 = Static200.method3116("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1466 = Static200.method3116("M");

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1464 = aClass60_1466;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ge;")
	public static Class39 aClass39_24 = new Class39(64);

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1465 = Static200.method3116("<br>");

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1467 = aClass60_1466;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1468 = aClass60_1463;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1469 = Static200.method3116("headicons_pk");

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1470 = Static200.method3116("Wordpack geladen)3");

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
	public static int[] anIntArray559 = new int[5];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ai;Lclient!vf;ZLclient!ai;I)V")
	public static void method3122(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class1_Sub1_Sub14_Sub1_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3) {
		Static217.aBoolean262 = arg2;
		Static133.aClass7_26 = arg3;
		Static165.aClass7_28 = arg0;
		@Pc(15) int local15 = Static165.aClass7_28.method3237() - 1;
		Static203.anInt4318 = local15 * 256 + Static165.aClass7_28.method3246(local15);
		Static2.aClass1_Sub1_Sub14_Sub1_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method3123() {
		@Pc(1) Object local1 = Static130.anObject4;
		synchronized (Static130.anObject4) {
			if (Static217.anInt4668 != 0) {
				Static217.anInt4668 = 1;
				try {
					Static130.anObject4.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!sf;Lclient!vb;)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) Class7_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class19 local9 = Static51.aClass19_8;
		synchronized (Static51.aClass19_8) {
			for (@Pc(21) Class1_Sub24 local21 = (Class1_Sub24) Static51.aClass19_8.method609(); local21 != null; local21 = (Class1_Sub24) Static51.aClass19_8.method615()) {
				if (local21.aLong150 == (long) arg0 && local21.aClass90_2 == arg1 && local21.anInt3600 == 0) {
					local7 = local21.aByteArray47;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(75) byte[] local75 = arg1.method2860(arg0);
			arg2.method3252(true, local75, arg0, arg1);
		} else {
			arg2.method3252(true, local7, arg0, arg1);
		}
	}
}
