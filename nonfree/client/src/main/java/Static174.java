import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	public static int anInt3702 = 0;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString217 = null;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString218 = null;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
	public static void method2979() {
		Static225.aClass61_25 = new Class61();
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
	public static void method2980() {
		for (@Pc(3) int local3 = 0; local3 < Static180.anInt3781; local3++) {
			@Pc(14) Class153 local14 = Static240.method3695(local3);
			if (local14 != null && local14.anInt4890 == 0) {
				Static13.anIntArray31[local3] = 0;
				Static128.anIntArray259[local3] = 0;
			}
		}
		Static118.aClass70_8 = new Class70(16);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
	public static void method2981(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static130.method2227(arg0, 10);
		local12.method3911();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)Lclient!j;")
	public static Class72 method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class72 local14 = local7.aClass72_1;
			local7.aClass72_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZB)V")
	public static void method2984(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class1_Sub8 local13;
		for (local13 = (Class1_Sub8) Static185.aClass61_20.method1835(); local13 != null; local13 = (Class1_Sub8) Static185.aClass61_20.method1836()) {
			if (local13.aClass1_Sub5_Sub1_1 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(local13.aClass1_Sub5_Sub1_1);
				local13.aClass1_Sub5_Sub1_1 = null;
			}
			if (local13.aClass1_Sub5_Sub1_2 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(local13.aClass1_Sub5_Sub1_2);
				local13.aClass1_Sub5_Sub1_2 = null;
			}
			local13.method4441();
		}
		if (!arg0) {
			return;
		}
		for (local13 = (Class1_Sub8) Static264.aClass61_28.method1835(); local13 != null; local13 = (Class1_Sub8) Static264.aClass61_28.method1836()) {
			if (local13.aClass1_Sub5_Sub1_1 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(local13.aClass1_Sub5_Sub1_1);
				local13.aClass1_Sub5_Sub1_1 = null;
			}
			local13.method4441();
		}
		for (local13 = (Class1_Sub8) Static179.aClass70_12.method2074(); local13 != null; local13 = (Class1_Sub8) Static179.aClass70_12.method2079()) {
			if (local13.aClass1_Sub5_Sub1_1 != null) {
				Static141.aClass1_Sub5_Sub4_1.method4380(local13.aClass1_Sub5_Sub1_1);
				local13.aClass1_Sub5_Sub1_1 = null;
			}
			local13.method4441();
		}
	}
}
