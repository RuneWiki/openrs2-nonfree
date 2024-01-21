import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!ib;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!pd;")
	public static Class20 aClass20_37;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "J")
	public static long aLong85;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt1773 = 0;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt1775 = 0;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_932 = Static28.method504("Cabbage");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt1780 = 0;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
	public static int[] anIntArray196 = new int[1000];

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1212() {
		anIntArray196 = null;
		aClass20_37 = null;
		aClass26_2 = null;
		anIntArray195 = null;
		aClass39_932 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method1213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class4_Sub13 local6 = (Class4_Sub13) Static49.aClass42_7.method1055((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray204.length) {
			return local6.anIntArray204[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!ea;ZBI)V")
	public static void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		@Pc(7) long local7 = (long) ((arg1 << 16) + arg2);
		@Pc(13) Class4_Sub2_Sub8 local13 = (Class4_Sub2_Sub8) Static16.aClass42_5.method1055(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class4_Sub2_Sub8) Static104.aClass42_10.method1055(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class4_Sub2_Sub8) Static117.aClass42_12.method1055(local7);
		if (local13 == null) {
			if (!arg4) {
				local13 = (Class4_Sub2_Sub8) Static82.aClass42_9.method1055(local7);
				if (local13 != null) {
					return;
				}
			}
			local13 = new Class4_Sub2_Sub8();
			local13.aClass20_Sub1_7 = arg3;
			local13.aByte3 = arg5;
			local13.anInt1166 = arg0;
			if (arg4) {
				Static16.aClass42_5.method1056(local13, local7);
				Static2.anInt16++;
			} else {
				Static82.aClass7_2.method181(local13);
				Static117.aClass42_12.method1056(local13, local7);
				Static4.anInt65++;
			}
		} else if (arg4) {
			local13.method2201();
			Static16.aClass42_5.method1056(local13, local7);
			Static4.anInt65--;
			Static2.anInt16++;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!pd;)Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 method1216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20 arg2) {
		return Static55.method977(arg1, arg0, arg2) ? Static25.method2195() : null;
	}
}
