import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public static int anInt9336;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_268 = new Class202(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!qq;")
	public static final Class240 aClass240_11 = new Class240();

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "[Lclient!cba;")
	public static final Class2_Sub11[] aClass2_Sub11Array1 = new Class2_Sub11[1024];

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Z")
	public static boolean aBoolean675 = false;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt9337 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!as;)V")
	public static void method7757(@OriginalArg(1) Class6_Sub2 arg0) {
		arg0.aClass1_Sub1_Sub2_1 = null;
		if (Static102.anInt8588 < 20) {
			Static359.aClass107_6.method2830(arg0);
			Static102.anInt8588++;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
	public static void method7758() {
		for (@Pc(3) int local3 = 0; local3 < Static374.anInt6954; local3++) {
			@Pc(9) Class141 local9 = Static469.aClass141Array1[local3];
			if (local9.aByte59 == 2) {
				if (local9.aClass2_Sub12_Sub3_2 == null) {
					local9.anInt3894 = Integer.MIN_VALUE;
				} else {
					Static288.aClass2_Sub12_Sub2_5.method2088(local9.aClass2_Sub12_Sub3_2);
				}
			}
		}
	}
}
