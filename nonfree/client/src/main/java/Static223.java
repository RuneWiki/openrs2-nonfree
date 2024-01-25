import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!li", name = "G", descriptor = "Lclient!wt;")
	public static Class271 aClass271_7;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "I")
	public static int anInt4063;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_33 = new Class134(32);

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(III)Z")
	public static boolean method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
	public static void method3421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class93 local13 = Static427.aClass93ArrayArray3[arg2][arg0];
		Static311.method4439(local13 == null ? Static269.aClass93_1 : local13, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!kk;)I")
	public static int method3423(@OriginalArg(1) Class31_Sub2_Sub1 arg0) {
		if (arg0.anInt7345 == 0) {
			return 0;
		}
		@Pc(56) int local56;
		@Pc(62) int local62;
		if (arg0.anInt7372 != -1) {
			@Pc(22) Class31_Sub2_Sub1 local22 = null;
			if (arg0.anInt7372 < 32768) {
				local22 = Static98.aClass31_Sub2_Sub1_Sub2Array1[arg0.anInt7372];
			} else if (arg0.anInt7372 >= 32768) {
				local22 = Static458.aClass31_Sub2_Sub1_Sub1Array1[arg0.anInt7372 - 32768];
			}
			if (local22 != null) {
				local56 = arg0.anInt7300 - local22.anInt7300;
				local62 = arg0.anInt7298 - local22.anInt7298;
				if (local56 != 0 || local62 != 0) {
					arg0.method5981((int) (Math.atan2((double) local56, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class31_Sub2_Sub1_Sub1) {
			@Pc(90) Class31_Sub2_Sub1_Sub1 local90 = (Class31_Sub2_Sub1_Sub1) arg0;
			if (local90.anInt1293 != -1 && (local90.anInt7378 == 0 || local90.anInt7380 > 0)) {
				local90.method5981(local90.anInt1293);
				local90.anInt1293 = -1;
			}
		} else if (arg0 instanceof Class31_Sub2_Sub1_Sub2) {
			@Pc(122) Class31_Sub2_Sub1_Sub2 local122 = (Class31_Sub2_Sub1_Sub2) arg0;
			if (local122.anInt7394 != -1 && (local122.anInt7378 == 0 || local122.anInt7380 > 0)) {
				local56 = local122.anInt7300 - (local122.anInt7394 - Static165.anInt3049 - Static165.anInt3049) * 64;
				local62 = local122.anInt7298 - (local122.anInt7397 - Static345.anInt5799 - Static345.anInt5799) * 64;
				if (local56 != 0 || local62 != 0) {
					local122.method5981((int) (Math.atan2((double) local56, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local122.anInt7394 = -1;
			}
		}
		return arg0.method5985();
	}
}
