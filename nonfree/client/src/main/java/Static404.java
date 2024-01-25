import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Lclient!ff;")
	public static Class116 aClass116_3;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public static int anInt7172;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "J")
	public static long aLong184 = -1L;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "[Lclient!is;")
	public static final Class5_Sub3_Sub9[] aClass5_Sub3_Sub9Array3 = new Class5_Sub3_Sub9[14];

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	public static int anInt7177 = 0;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lclient!kj;")
	public static Class5_Sub36 method5944() {
		if (Static330.aClass114_6 == null || Static475.aClass47_1 == null) {
			return null;
		}
		Static475.aClass47_1.method748(Static330.aClass114_6);
		@Pc(18) Class5_Sub36 local18 = (Class5_Sub36) Static475.aClass47_1.method749();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class103 local36 = Static330.aClass93_3.method2280(local18.anInt5984);
			return local36 != null && local36.aBoolean235 && local36.method2499(Static330.anInterface2_2) ? local18 : Static242.method3778();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V")
	public static void method5945(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static84.anInt2018 != -1) {
				Static23.method296(Static84.anInt2018);
			}
			for (@Pc(17) Class5_Sub39 local17 = (Class5_Sub39) Static452.aClass300_33.method7182(); local17 != null; local17 = (Class5_Sub39) Static452.aClass300_33.method7192()) {
				if (!local17.method9048()) {
					local17 = (Class5_Sub39) Static452.aClass300_33.method7182();
					if (local17 == null) {
						break;
					}
				}
				Static68.method931(local17, true, false);
			}
			Static84.anInt2018 = -1;
			Static452.aClass300_33 = new Class300(8);
			Static62.method837();
			Static84.anInt2018 = Static43.anInt681;
			Static35.method492(false);
			Static283.method4543();
			Static652.method8737(Static84.anInt2018);
		}
		Static151.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "()V")
	public static void method5946() {
		for (@Pc(1) int local1 = 0; local1 < Static393.aClass204Array1.length; local1++) {
			Static393.aClass204Array1[local1].method5078();
		}
		Static393.aClass204Array1 = null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIII)V")
	public static void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		Static197.method3240(arg0 + arg2, Static16.anIntArrayArray2[arg3], arg0 - arg2, arg1);
		@Pc(31) int local31 = -1;
		while (local13 > local11) {
			local31 += 2;
			local16 += local31;
			local11++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(56) int[] local56 = Static16.anIntArrayArray2[arg3 + local13];
				@Pc(63) int[] local63 = Static16.anIntArrayArray2[arg3 - local13];
				@Pc(68) int local68 = arg0 + local11;
				@Pc(72) int local72 = arg0 - local11;
				Static197.method3240(local68, local56, local72, arg1);
				Static197.method3240(local68, local63, local72, arg1);
			}
			@Pc(88) int local88 = local13 + arg0;
			@Pc(93) int local93 = arg0 - local13;
			@Pc(99) int[] local99 = Static16.anIntArrayArray2[local11 + arg3];
			@Pc(106) int[] local106 = Static16.anIntArrayArray2[arg3 - local11];
			Static197.method3240(local88, local99, local93, arg1);
			Static197.method3240(local88, local106, local93, arg1);
		}
	}
}
