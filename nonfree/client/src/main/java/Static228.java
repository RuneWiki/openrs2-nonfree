import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!wo;")
	public static Class216 aClass216_78;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public static int anInt4739;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public static int anInt4741;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array17;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public static int anInt4746;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "[I")
	public static final int[] anIntArray427 = new int[4096];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!al;")
	public static Class1_Sub4_Sub1 method4245() {
		return Static79.aClass1_Sub4_Sub1_3;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)I")
	public static int method4247(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub19 local14 = Static274.method4804(arg0, false);
		if (local14 == null) {
			return Static316.method5545(arg0).anInt3202;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local14.anIntArray247.length; local25++) {
			if (local14.anIntArray247[local25] == -1) {
				local23++;
			}
		}
		return local23 + Static316.method5545(arg0).anInt3202 - local14.anIntArray247.length;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public static void method4248() {
		Static1.anInt36 = 0;
		@Pc(13) int local13 = (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7) + Static234.anInt4783;
		@Pc(20) int local20 = Static32.anInt2224 + (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static1.anInt36 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static1.anInt36 = 1;
		}
		if (Static1.anInt36 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static1.anInt36 = 0;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method4249() {
		@Pc(1) Class87 local1 = Static115.aClass87_23;
		synchronized (Static115.aClass87_23) {
			Static115.aClass87_23.method2473(5);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4250(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 3);
		local8.method1869();
		local8.aString23 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIIILclient!wo;I)V")
	public static void method4251(@OriginalArg(3) int arg0, @OriginalArg(4) Class216 arg1, @OriginalArg(5) int arg2) {
		Static188.anInt4068 = arg2;
		Static103.anInt2461 = 0;
		Static33.anInt1108 = 1;
		Static175.anInt3790 = 10000;
		Static285.aBoolean421 = false;
		Static70.aClass216_23 = arg1;
		Static28.anInt1014 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I")
	public static int method4253(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Z")
	public static boolean method4254(@OriginalArg(1) int arg0) {
		return arg0 == 58 || arg0 == 57 || arg0 == 1010 || arg0 == 10 || arg0 == 2;
	}
}
