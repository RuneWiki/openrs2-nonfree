import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "Lclient!kb;")
	public static Class83 aClass83_11;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public static int anInt293 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)Lclient!tf;")
	public static Class152 method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2332; local13++) {
			@Pc(22) Class152 local22 = local7.aClass152Array1[local13];
			if ((local22.aLong181 >> 29 & 0x3L) == 2L && local22.anInt5509 == arg1 && local22.anInt5519 == arg2) {
				Static89.method1539(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V")
	public static void method240(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class1_Sub5 local12;
		for (local12 = (Class1_Sub5) Static130.aClass131_6.method3791(); local12 != null; local12 = (Class1_Sub5) Static130.aClass131_6.method3792()) {
			if (local12.aClass1_Sub3_Sub4_2 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(local12.aClass1_Sub3_Sub4_2);
				local12.aClass1_Sub3_Sub4_2 = null;
			}
			if (local12.aClass1_Sub3_Sub4_1 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(local12.aClass1_Sub3_Sub4_1);
				local12.aClass1_Sub3_Sub4_1 = null;
			}
			local12.method4742();
		}
		if (!arg0) {
			return;
		}
		for (local12 = (Class1_Sub5) Static234.aClass131_16.method3791(); local12 != null; local12 = (Class1_Sub5) Static234.aClass131_16.method3792()) {
			if (local12.aClass1_Sub3_Sub4_2 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(local12.aClass1_Sub3_Sub4_2);
				local12.aClass1_Sub3_Sub4_2 = null;
			}
			local12.method4742();
		}
		for (local12 = (Class1_Sub5) Static156.aClass117_13.method3441(); local12 != null; local12 = (Class1_Sub5) Static156.aClass117_13.method3444()) {
			if (local12.aClass1_Sub3_Sub4_2 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(local12.aClass1_Sub3_Sub4_2);
				local12.aClass1_Sub3_Sub4_2 = null;
			}
			local12.method4742();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public static void method241(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && Static88.aBooleanArray10.length > arg0) {
			Static88.aBooleanArray10[arg0] = !Static88.aBooleanArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)Lclient!mh;")
	public static Class101 method242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class101 local14 = local7.aClass101_1;
			local7.aClass101_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(B)V")
	public static void method245() {
		Static178.aClass155_34.method4354();
		Static18.aClass155_5.method4354();
		Static41.aClass155_9.method4354();
	}
}
