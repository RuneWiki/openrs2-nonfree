import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "Lclient!ap;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
	public static int anInt2334 = -1;

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
	public static int anInt2338 = 1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)Lclient!oh;")
	public static Class6_Sub1 method2287(@OriginalArg(0) int arg0) {
		return Static232.aBoolean154 && Static206.anInt6742 <= arg0 && Static237.anInt4637 >= arg0 ? Static343.aClass6_Sub1Array2[arg0 - Static206.anInt6742] : null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method2289(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static118.method2480(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	public static void method2290() {
		for (@Pc(7) int local7 = -1; local7 < Static307.anInt2887; local7++) {
			@Pc(15) int local15;
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static213.anIntArray380[local7];
			}
			@Pc(25) Class10_Sub3_Sub3_Sub2 local25 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local15];
			if (local25 != null && local25.anInt5934 > 0) {
				local25.anInt5934--;
				if (local25.anInt5934 == 0) {
					local25.aString223 = null;
				}
			}
		}
		for (@Pc(63) int local63 = 0; local63 < Static315.anInt6456; local63++) {
			@Pc(69) int local69 = Static98.anIntArray205[local63];
			@Pc(73) Class10_Sub3_Sub3_Sub1 local73 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local69];
			if (local73 != null && local73.anInt5934 > 0) {
				local73.anInt5934--;
				if (local73.anInt5934 == 0) {
					local73.aString223 = null;
				}
			}
		}
	}
}
