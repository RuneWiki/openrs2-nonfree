import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "[S")
	public static short[] aShortArray7;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	public static int anInt78;

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_30 = Static151.method2243("::clientdrop");

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_31 = Static151.method2243("(Udns");

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_32 = Static151.method2243("::qa_op_test");

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "[I")
	public static final int[] anIntArray4 = new int[100];

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
	public static int method51(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
	public static void method55(@OriginalArg(0) int arg0) {
		if (arg0 == Static87.anInt1821) {
			return;
		}
		if (Static87.anInt1821 == 0) {
			Static26.method2657();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static68.anInt1422 = 0;
			Static15.anInt354 = 0;
			Static166.anInt3523 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static51.aClass36_1 != null) {
			Static51.aClass36_1.method862();
			Static51.aClass36_1 = null;
		}
		if (Static87.anInt1821 == 25) {
			Static112.anInt2448 = 1;
			Static89.anInt1941 = 0;
			Static41.anInt4504 = 0;
			Static33.anInt787 = 0;
			Static119.anInt2616 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static124.method1933(Static139.aCanvas1, Static59.aClass71_Sub1_4, Static56.aClass71_Sub1_3);
		} else {
			Static28.method488();
		}
		Static87.anInt1821 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)Lclient!ge;")
	public static Class2_Sub1_Sub9 method57(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub9 local10 = (Class2_Sub1_Sub9) Static87.aClass53_7.method1648((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static69.aClass71_13.method2130(3, arg0);
		local10 = new Class2_Sub1_Sub9();
		if (local20 != null) {
			local10.method901(new Class2_Sub11(local20));
		}
		Static87.aClass53_7.method1645((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)I")
	public static int method58(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IZ)I")
	public static int method59(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!rd;Z)V")
	public static void method60(@OriginalArg(0) Class42_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static57.anIntArray90.length; local3++) {
			Static57.anIntArray90[local3] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) (Math.random() * 128.0D * (double) 256);
			Static57.anIntArray90[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(69) int local69;
		for (local36 = 0; local36 < 20; local36++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local69 = (local57 << 7) + local61;
					Static170.anIntArray312[local69] = (Static57.anIntArray90[local69 - 128] + Static57.anIntArray90[local69 - 1] + Static57.anIntArray90[local69 + 1] + Static57.anIntArray90[local69 - -128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static57.anIntArray90;
			Static57.anIntArray90 = Static170.anIntArray312;
			Static170.anIntArray312 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt3591; local61++) {
			for (local69 = 0; local69 < arg0.anInt3594; local69++) {
				if (arg0.aByteArray38[local57++] != 0) {
					@Pc(145) int local145 = local69 + arg0.anInt3597 + 16;
					@Pc(152) int local152 = local61 + arg0.anInt3593 + 16;
					@Pc(158) int local158 = (local152 << 7) + local145;
					Static57.anIntArray90[local158] = 0;
				}
			}
		}
	}
}
