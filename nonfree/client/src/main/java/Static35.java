import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_165 = new Class256("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!bn", name = "W", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_39 = new Class240(32);

	@OriginalMember(owner = "client!bn", name = "Y", descriptor = "[I")
	public static final int[] anIntArray508 = new int[4096];

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(Z)V")
	public static void method5985() {
		Static227.method3517(Static399.aClass167_Sub1_1.aBoolean492);
		Static453.aClass2_Sub18_Sub2_3 = new Class2_Sub18_Sub2();
		Static453.aClass2_Sub18_Sub2_3.method2907();
		Static105.aClass141_2 = Static440.method5945(0, Static303.aClass131_4, Static118.aCanvas3, 22050);
		Static105.aClass141_2.method5196(Static453.aClass2_Sub18_Sub2_3);
		Static433.method5834(Static88.aClass188_28, Static453.aClass2_Sub18_Sub2_3, Static310.aClass188_83, Static10.aClass188_6);
		Static51.aClass141_1 = Static440.method5945(1, Static303.aClass131_4, Static118.aCanvas3, 2048);
		Static360.aClass2_Sub18_Sub4_2 = new Class2_Sub18_Sub4();
		Static51.aClass141_1.method5196(Static360.aClass2_Sub18_Sub4_2);
		Static20.aClass195_1 = new Class195(22050, Static369.anInt6566);
		Static111.anInt2288 = Static329.aClass188_90.method4279("scape main");
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!pc;I)Lclient!kl;")
	public static Class2_Sub2_Sub11 method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		@Pc(19) Class2_Sub20 local19 = new Class2_Sub20(arg2.method4283(arg0, arg1));
		@Pc(50) Class2_Sub2_Sub11 local50 = new Class2_Sub2_Sub11(arg1, local19.method3717(), local19.method3717(), local19.method3731(), local19.method3731(), local19.method3737() == 1, local19.method3737(), local19.method3737());
		@Pc(54) int local54 = local19.method3737();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass265_31.method5999(new Class2_Sub34(local19.method3737(), local19.method3711(), local19.method3711(), local19.method3711(), local19.method3711(), local19.method3711(), local19.method3711(), local19.method3711(), local19.method3711()));
		}
		local50.method3245();
		return local50;
	}
}
