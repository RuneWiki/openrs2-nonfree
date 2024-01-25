import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_13 = new Class180(4, 6);

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Z")
	public static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!rb;")
	public static final Class209 aClass209_2 = new Class209("stellardawn", 1);

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_140 = new Class256("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public static int anInt6846 = 1;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "[I")
	public static final int[] anIntArray456 = new int[2048];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!dm;)V")
	public static void method5364(@OriginalArg(0) Class4_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort88; local2 <= arg0.aShort87; local2++) {
			for (@Pc(6) int local6 = arg0.aShort89; local6 <= arg0.aShort86; local6++) {
				@Pc(16) Class113 local16 = Static176.aClass113ArrayArrayArray3[arg0.aByte92][local2][local6];
				if (local16 != null) {
					@Pc(21) Class134 local21 = local16.aClass134_1;
					@Pc(23) Class134 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass134_1 = local21.aClass134_2;
							} else {
								local23.aClass134_2 = local21.aClass134_2;
							}
							local21.method3169();
							break;
						}
						local23 = local21;
						local21 = local21.aClass134_2;
					}
					local16.aByte34 = 0;
					for (@Pc(56) Class134 local56 = local16.aClass134_1; local56 != null; local56 = local56.aClass134_2) {
						local16.aByte34 = (byte) (local16.aByte34 | local56.anInt3955);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	public static void method5365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static176.aClass113ArrayArrayArray3[0][arg1][arg2] != null && Static176.aClass113ArrayArrayArray3[0][arg1][arg2].aClass113_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static176.aClass113ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class113 local46 = Static176.aClass113ArrayArrayArray3[local22][arg1][arg2] = new Class113(local22, arg1, arg2);
				if (local20) {
					local46.aByte33++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)V")
	public static void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static419.anInt7351 == 1) {
			Static139.method2010(arg0, arg1, Static76.aClass2_Sub26_1);
		} else if (Static419.anInt7351 == 2) {
			Static343.method4828(arg1, arg0);
		}
		Static76.aClass2_Sub26_1 = null;
		Static419.anInt7351 = 0;
	}
}
