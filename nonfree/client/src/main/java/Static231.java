import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_57 = new Class32("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
	public static boolean method3740() {
		return Static62.anInt1261 == 0 ? Static273.aBoolean353 : true;
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(II)I")
	public static int method3755(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(35) int local35 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(41) int local41 = local35 + (local35 >>> 8);
		@Pc(47) int local47 = local41 + (local41 >>> 16);
		return local47 & 0xFF;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!up;IIIII)V")
	public static void method3757(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3737 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub17_Sub1Array2[local4] != null) {
				arg0.anInt3737++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3737; local22++) {
			@Pc(31) long local31 = Static223.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub17_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static386.aClass2_Sub17_Sub1Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub17_Sub1Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static223.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static386.aClass2_Sub17_Sub1Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub17_Sub1Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt3737 - 1; local91++) {
				arg0.aClass2_Sub17_Sub1Array2[local91] = arg0.aClass2_Sub17_Sub1Array2[local91 + 1];
			}
			arg0.anInt3737--;
		}
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
	public static void method3768() {
		Static13.aClass5_1.method87();
		Static35.aClass47_1.method943();
		Static192.aClass196_1.method4165();
		Static221.aClass118_6.method2851();
		Static356.aClass48_2.method952();
		Static15.aClass81_1.method2189();
		Static36.aClass236_1.method5399();
		Static149.aClass173_5.method3799();
		Static341.aClass36_1.method797();
		Static215.aClass114_1.method2839();
		Static46.aClass139_1.method3160();
		Static304.aClass206_122.method4421();
		Static158.aClass226_1.method4906();
		Static27.aClass51_1.method1045();
		Static261.aClass125_2.method2924();
		Static341.aClass225_1.method4902();
		Static106.aClass98_1.method2523();
		Static363.aClass228_1.method4976();
		Static332.aClass210_1.method4440();
		Static170.aClass149_1.method3333();
		Static174.method3087();
		Static241.method3900();
		Static238.method3847();
		Static135.method3221();
		Static293.aClass160_62.method3605();
		Static295.aClass160_45.method3605();
		Static167.aClass160_49.method3605();
		Static331.aClass160_52.method3605();
		Static256.aClass160_39.method3605();
	}

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)[Lclient!jd;")
	public static Class117[] method3772() {
		return new Class117[] { Static17.aClass117_1, Static258.aClass117_10, Static47.aClass117_2, Static392.aClass117_15, Static350.aClass117_9 };
	}
}
