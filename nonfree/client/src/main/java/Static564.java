import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!lb;")
	public static Class221 aClass221_143;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_159 = new Class186(40, 0);

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "[I")
	public static final int[] anIntArray517 = new int[1];

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_160 = new Class186(14, 2);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IJ)V")
	public static void method7845(@OriginalArg(1) long arg0) {
		if ((long) 0 >= arg0) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static128.method2157(arg0 - 1L);
			Static128.method2157(1L);
		} else {
			Static128.method2157(arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!lv;I)Z")
	public static boolean method7846(@OriginalArg(0) Class3_Sub32 arg0) {
		if (arg0 == null) {
			return true;
		}
		if (Static110.aClass3_Sub32_1 != arg0) {
			Static110.aClass3_Sub32_1 = arg0;
			Static386.anInt4765 = 0;
		}
		@Pc(19) Class3_Sub22_Sub5 local19 = Static671.aClass3_Sub22_Sub5_3;
		if (Static713.aClass3_Sub22_Sub5_4 != null) {
			local19 = Static713.aClass3_Sub22_Sub5_4;
		}
		if (Static386.anInt4765 == 0) {
			if (Static595.aClass86_1 == null) {
				Static595.aClass86_1 = new Class86(Static386.aClass221_79, Static300.aClass221_86);
			}
			local19.method9318();
			Static386.anInt4765 = 1;
		}
		if (Static386.anInt4765 == 1) {
			if (!local19.method9334(Static595.aClass86_1, arg0, Static343.aClass221_97)) {
				return false;
			}
			Static112.anInt2244 = 0;
			Static386.anInt4765 = 2;
			Static110.aClass3_Sub32_1 = null;
		}
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([Lclient!bka;I)V")
	public static void method7847(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) int arg1) {
		Static447.anInt7862 = arg0.length;
		Static432.aClass9Array28 = new Class9[Static447.anInt7862 + 10];
		Static28.anIntArray18 = new int[Static447.anInt7862 + 10];
		Static735.method9183(arg0, 0, Static432.aClass9Array28, arg1, Static447.anInt7862);
		for (@Pc(26) int local26 = 0; local26 < Static447.anInt7862; local26++) {
			Static28.anIntArray18[local26] = Static432.aClass9Array28[local26].method8613();
		}
		for (@Pc(47) int local47 = Static447.anInt7862; local47 < Static432.aClass9Array28.length; local47++) {
			Static28.anIntArray18[local47] = 12;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!lk;II)V")
	public static void method7849(@OriginalArg(0) Class3_Sub28_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static3.anInt30 = 0;
		Static626.aBoolean734 = false;
		Static378.method5695(arg0);
		Static570.method7904(32768, arg0);
		if (Static626.aBoolean734) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt6241) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6241 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIILclient!hca;)V")
	public static void method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class144 arg3) {
		for (@Pc(10) Class3_Sub49 local10 = (Class3_Sub49) Static352.aClass357_30.method8391(); local10 != null; local10 = (Class3_Sub49) Static352.aClass357_30.method8392()) {
			if (arg0 == local10.anInt9911 && arg2 << 9 == local10.anInt9904 && local10.anInt9906 == arg1 << 9 && local10.aClass144_1.anInt4397 == arg3.anInt4397) {
				if (local10.aClass3_Sub22_Sub1_3 != null) {
					Static155.aClass3_Sub22_Sub4_1.method9062(local10.aClass3_Sub22_Sub1_3);
					local10.aClass3_Sub22_Sub1_3 = null;
				}
				if (local10.aClass3_Sub22_Sub1_4 != null) {
					Static155.aClass3_Sub22_Sub4_1.method9062(local10.aClass3_Sub22_Sub1_4);
					local10.aClass3_Sub22_Sub1_4 = null;
				}
				local10.method9446();
				return;
			}
		}
		if (2 != 2) {
			method7847((Class9[]) null, -119);
		}
	}
}
