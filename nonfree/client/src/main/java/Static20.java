import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!al", name = "n", descriptor = "[[Lclient!cd;")
	public static Class48[][] aClass48ArrayArray1;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "[Lclient!s;")
	public static Class61[] aClass61Array2;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!al;")
	public static final Class19 aClass19_1 = new Class19(1);

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!al;")
	public static final Class19 aClass19_2 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!al;")
	public static final Class19 aClass19_3 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "h", descriptor = "Lclient!al;")
	public static final Class19 aClass19_4 = new Class19(1);

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!al;")
	public static final Class19 aClass19_5 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!al;")
	public static final Class19 aClass19_6 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!al;")
	public static final Class19 aClass19_7 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!al;")
	public static final Class19 aClass19_8 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!lw;")
	public static final Class223 aClass223_3 = new Class223(3);

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
	public static final int[] anIntArray11 = new int[8];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!ofa;)Ljava/lang/String;")
	public static String method246(@OriginalArg(1) Class5_Sub22 arg0) {
		return Static52.method902(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V")
	public static void method248(@OriginalArg(0) long arg0) {
		@Pc(15) int local15 = Static526.anInt9045 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
		@Pc(20) int local20 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 + Static535.anInt9143;
		if (Static343.anInt5775 - local15 < -2000 || Static343.anInt5775 - local15 > 2000 || Static57.anInt1135 - local20 < -2000 || Static57.anInt1135 - local20 > 2000) {
			Static343.anInt5775 = local15;
			Static57.anInt1135 = local20;
		}
		@Pc(68) int local68;
		@Pc(76) int local76;
		if (Static343.anInt5775 != local15) {
			local68 = local15 - Static343.anInt5775;
			local76 = (int) ((long) local68 * arg0 / 320L);
			if (local68 > 0) {
				if (local76 == 0) {
					local76 = 1;
				} else if (local68 < local76) {
					local76 = local68;
				}
			} else if (local76 == 0) {
				local76 = -1;
			} else if (local76 < local68) {
				local76 = local68;
			}
			Static343.anInt5775 += local76;
		}
		if (local20 != Static57.anInt1135) {
			local68 = local20 - Static57.anInt1135;
			local76 = (int) (arg0 * (long) local68 / 320L);
			if (local68 <= 0) {
				if (local76 == 0) {
					local76 = -1;
				} else if (local76 < local68) {
					local76 = local68;
				}
			} else if (local76 == 0) {
				local76 = 1;
			} else if (local76 > local68) {
				local76 = local68;
			}
			Static57.anInt1135 += local76;
		}
		Static311.aFloat95 += (float) arg0 * Static444.aFloat139 / 6.0F;
		Static552.aFloat176 += (float) arg0 * Static216.aFloat87 / 6.0F;
		Static485.method7194();
	}
}
