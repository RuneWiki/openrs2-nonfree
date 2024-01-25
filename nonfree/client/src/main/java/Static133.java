import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_44 = new Class57("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_45 = new Class57(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!cj;B)I")
	public static int method2093(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) String local7 = Static380.method5624(arg0);
		@Pc(9) int[] local9 = null;
		if (Static336.method1972(arg0.anInt808)) {
			local9 = Static176.aClass78_3.method1641((int) arg0.aLong17).anIntArray103;
		} else if (arg0.anInt809 != -1) {
			local9 = Static176.aClass78_3.method1641(arg0.anInt809).anIntArray103;
		} else if (Static325.method5003(arg0.anInt808)) {
			@Pc(92) Class28_Sub1_Sub1_Sub1 local92 = Static166.aClass28_Sub1_Sub1_Sub1Array41[(int) arg0.aLong17];
			if (local92 != null) {
				@Pc(97) Class61 local97 = local92.aClass61_1;
				if (local97.anIntArray142 != null) {
					local97 = local97.method1216(Static331.aClass115_1);
				}
				if (local97 != null) {
					local9 = local97.anIntArray144;
				}
			}
		} else if (Static248.method4059(arg0.anInt808)) {
			@Pc(64) Class60 local64;
			if (arg0.anInt808 == 1007) {
				local64 = Static97.aClass217_4.method5007((int) arg0.aLong17);
			} else {
				local64 = Static97.aClass217_4.method5007((int) (arg0.aLong17 >>> 32 & 0x7FFFFFFFL));
			}
			if (local64.anIntArray134 != null) {
				local64 = local64.method1191(Static331.aClass115_1);
			}
			if (local64 != null) {
				local9 = local64.anIntArray136;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static131.method2067(local9);
		}
		@Pc(129) int local129 = Static366.aClass190_7.method4356(Static371.aClass110Array14, local7);
		if (arg0.aBoolean44) {
			local129 += Static362.aClass110_19.method5091() + 4;
		}
		return local129;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method2096(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(8, arg0);
		local13.method3217();
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method2097() {
		for (@Pc(10) Class3_Sub36 local10 = (Class3_Sub36) Static230.aClass138_34.method3051(); local10 != null; local10 = (Class3_Sub36) Static230.aClass138_34.method3050()) {
			if (local10.anInt5101 == -1) {
				local10.anInt5106 = 0;
				Static373.method5558(local10);
			} else {
				local10.method5700();
			}
		}
	}
}
