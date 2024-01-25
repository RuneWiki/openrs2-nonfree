import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!bda;")
	public static final Class32 aClass32_4 = new Class32();

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[I")
	public static final int[] anIntArray305 = new int[3];

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public static int anInt5094 = 0;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public static int anInt5095 = 0;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!up;Lclient!cs;Lclient!ha;B)V")
	public static void method4477(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(8) Class31 local8 = arg0.method8343(arg2);
		if (local8 == null) {
			return;
		}
		@Pc(14) int local14 = local8.method8801();
		if (local8.method8789() > local14) {
			local14 = local8.method8789();
		}
		@Pc(26) int local26 = arg1.anInt2181;
		@Pc(29) int local29 = arg1.anInt2180;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(49) int local49;
		if (arg0.aString100 != null) {
			local31 = Static539.aClass183_11.method4458(arg0.aString100, Static53.aStringArray3, (int[]) null, (Class31[]) null);
			for (local49 = 0; local49 < local31; local49++) {
				@Pc(54) String local54 = Static53.aStringArray3[local49];
				if (local31 - 1 > local49) {
					local54 = local54.substring(0, local54.length() - 4);
				}
				@Pc(71) int local71 = Static594.aClass63_7.method1823(local54);
				if (local33 < local71) {
					local33 = local71;
				}
			}
			local35 = Static594.aClass63_7.method1824() * local31 + Static594.aClass63_7.method1822() / 2;
		}
		local49 = arg1.anInt2181 + local14 / 2;
		@Pc(100) int local100 = arg1.anInt2180;
		if (Static371.anInt9391 + local14 > local26) {
			local49 = Static371.anInt9391 + local14 / 2 + local33 / 2 + 10 + 5;
			local26 = Static371.anInt9391;
		} else if (Static371.anInt9388 - local14 < local26) {
			local26 = Static371.anInt9388 - local14;
			local49 = Static371.anInt9388 - local14 / 2 - local33 / 2 - 15;
		}
		if (local29 < Static371.anInt9387 + local14) {
			local100 = local14 / 2 + Static371.anInt9387 + 10;
			local29 = Static371.anInt9387;
		} else if (local29 > Static371.anInt9386 - local14) {
			local29 = Static371.anInt9386 - local14;
			local100 = Static371.anInt9386 - local14 / 2 - local35 - 10;
		}
		@Pc(219) int local219 = (int) (Math.atan2((double) (local26 - arg1.anInt2181), (double) (local29 - arg1.anInt2180)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method8809((float) local14 / 2.0F + (float) local26, (float) local14 / 2.0F + (float) local29, 4096, local219);
		@Pc(239) int local239 = -2;
		@Pc(241) int local241 = -2;
		@Pc(243) int local243 = -2;
		@Pc(245) int local245 = -2;
		if (arg0.aString100 != null) {
			local239 = local49 - local33 / 2 - 5;
			local241 = local100;
			local245 = Static594.aClass63_7.method1824() * local31 + local100 + 3;
			local243 = local33 + local239 + 10;
			if (arg0.anInt9809 != 0) {
				arg2.method8164(arg0.anInt9809, local245 - local100, local239, local243 - local239, local100);
			}
			if (arg0.anInt9814 != 0) {
				arg2.method8155(local245 - local100, -local239 + local243, local239, local100, arg0.anInt9814);
			}
			for (@Pc(311) int local311 = 0; local311 < local31; local311++) {
				@Pc(316) String local316 = Static53.aStringArray3[local311];
				if (local31 - 1 > local311) {
					local316 = local316.substring(0, local316.length() - 4);
				}
				Static594.aClass63_7.method1825(arg2, local316, local49, local100, arg0.anInt9822);
				local100 += Static594.aClass63_7.method1824();
			}
		}
		if (arg0.anInt9818 == -1 && arg0.aString100 == null) {
			return;
		}
		@Pc(364) Class2_Sub35 local364 = new Class2_Sub35(arg1);
		local14 >>= 0x1;
		local364.anInt7244 = local239;
		local364.anInt7243 = local241;
		local364.anInt7246 = local243;
		local364.anInt7253 = local26 + local14;
		local364.anInt7247 = local245;
		local364.anInt7252 = local14 + local29;
		local364.anInt7245 = local29 - local14;
		local364.anInt7248 = local26 - local14;
		Static435.aClass114_38.method2771(local364);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public static boolean method4478(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!sh;Lclient!hg;)Lclient!lk;")
	public static Class2_Sub31 method4480(@OriginalArg(1) Class314 arg0, @OriginalArg(2) Class145 arg1) {
		@Pc(13) Class2_Sub31 local13 = Static477.method6770();
		local13.aClass145_100 = arg1;
		local13.anInt5736 = arg1.anInt4029;
		if (local13.anInt5736 == -1) {
			local13.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(260);
		} else if (local13.anInt5736 == -2) {
			local13.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(10000);
		} else if (local13.anInt5736 <= 18) {
			local13.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(20);
		} else if (local13.anInt5736 > 98) {
			local13.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(260);
		} else {
			local13.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(100);
		}
		local13.aClass2_Sub17_Sub1_2.method2452(arg0);
		local13.aClass2_Sub17_Sub1_2.method2454(local13.aClass145_100.method3506());
		local13.anInt5738 = 0;
		return local13;
	}
}
