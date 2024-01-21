import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array46;

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "Lclient!ja;")
	public static Class33 aClass33_32;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_14;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "Lclient!oe;")
	public static Class1_Sub12 aClass1_Sub12_9;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1430 = Static23.method501("null");

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1436 = Static23.method501("Enter message to send to ");

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1431 = aClass42_1436;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1432 = null;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1434 = Static23.method501("Connecting to friendserver");

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1433 = aClass42_1434;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1435 = Static23.method501("runes");

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "[I")
	public static int[] anIntArray402 = new int[4000];

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1437 = Static23.method501("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1438 = Static23.method501(":");

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[I")
	public static int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public static void method1834() {
		aClass1_Sub1_Sub1_Sub1_14 = null;
		aClass42_1434 = null;
		aClass42_1433 = null;
		aClass33_32 = null;
		aClass1_Sub1_Sub1_Sub1Array46 = null;
		aClass42_1435 = null;
		anIntArray403 = null;
		aClass42_1438 = null;
		aClass42_1432 = null;
		anIntArray402 = null;
		aClass42_1436 = null;
		aClass42_1430 = null;
		aClass42_1431 = null;
		aClass1_Sub12_9 = null;
		aClass42_1437 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BZIII)V")
	public static void method1836(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static30.aClass14_1 == null) {
			return;
		}
		if (Static74.anInt1895 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static61.anInt1457 = arg2;
			if (Static74.anInt1895 == 0) {
				Static56.anInt1421 = 0;
			} else {
				@Pc(33) int local33 = Static87.method1575(Static74.anInt1895);
				@Pc(37) int local37 = local33 - Static24.anInt718;
				Static56.anInt1421 = (local37 + Static56.anInt1421 + 3600 - 1) / Static56.anInt1421;
			}
			Static45.aByteArray25 = arg0;
			Static49.aBoolean78 = arg1;
			Static36.anInt904 = arg3;
		} else if (Static61.anInt1457 == 0) {
			Static1.method1(arg1, arg3, arg0);
		} else {
			Static45.aByteArray25 = arg0;
			Static36.anInt904 = arg3;
			Static49.aBoolean78 = arg1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 method1837() {
		@Pc(20) Class1_Sub1_Sub1_Sub3 local20 = new Class1_Sub1_Sub1_Sub3(Static36.anIntArray124, Static83.anIntArray340, Static29.anIntArray98, Static69.anIntArray243, Static98.aByteArrayArray10);
		Static34.method590();
		return local20;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Lclient!ob;")
	public static Class1_Sub1_Sub11 method1838(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub11 local15 = (Class1_Sub1_Sub11) Static34.aClass37_12.method982((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static56.aClass33_16.method1305(arg0, 13);
		local15 = new Class1_Sub1_Sub11();
		local15.anInt1776 = arg0;
		if (local25 != null) {
			local15.method1260(new Class1_Sub8(local25));
		}
		Static34.aClass37_12.method981((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!p;I)V")
	public static void method1839(@OriginalArg(1) Class33_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static67.aClass1_Sub8_1 == null) {
			Static88.method1617(255, 0, 255, true, (byte) 0, null);
			Static15.aClass33_Sub1Array1[arg1] = arg0;
		} else {
			Static67.aClass1_Sub8_1.anInt1692 = arg1 * 4 + 5;
			@Pc(25) int local25 = Static67.aClass1_Sub8_1.method1188();
			arg0.method1327(local25);
		}
	}
}
