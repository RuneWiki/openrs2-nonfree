import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ot", name = "V", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_40 = new Class166(8);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([I[I[ILclient!kd;I)V")
	public static void method6554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class20_Sub2_Sub2_Sub1_Sub2 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) int local18 = arg1[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg0[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg3.aClass113Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass113Array3[local28] = null;
					} else {
						@Pc(52) Class21 local52 = Static294.aClass373_2.method8738(local18);
						@Pc(55) int local55 = local52.anInt351;
						@Pc(60) Class113 local60 = arg3.aClass113Array3[local28];
						if (local60 != null) {
							if (local18 == local60.anInt3650) {
								if (local55 == 0) {
									local60 = arg3.aClass113Array3[local28] = null;
								} else if (local55 == 1) {
									local60.anInt3649 = 0;
									local60.anInt3652 = 0;
									local60.anInt3646 = local26;
									local60.anInt3651 = 1;
									local60.anInt3647 = 0;
									if (!arg3.aBoolean377) {
										Static558.method8052(0, arg3, local52);
									}
								} else if (local55 == 2) {
									local60.anInt3652 = 0;
								}
							} else if (local52.anInt355 >= Static294.aClass373_2.method8738(local60.anInt3650).anInt355) {
								local60 = arg3.aClass113Array3[local28] = null;
							}
						}
						if (local60 == null) {
							local60 = arg3.aClass113Array3[local28] = new Class113();
							local60.anInt3651 = 1;
							local60.anInt3649 = 0;
							local60.anInt3652 = 0;
							local60.anInt3650 = local18;
							local60.anInt3647 = 0;
							local60.anInt3646 = local26;
							if (!arg3.aBoolean377) {
								Static558.method8052(0, arg3, local52);
							}
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZII)V")
	public static void method6556(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Static261.method4650();
		Static179.method3255();
		Static46.method849();
		Static95.method1539(arg2, arg1, arg0);
		Static138.method2251();
		Static633.method8921(Static162.aClass100_7);
		Static549.method7969(Static162.aClass100_7);
		Static569.method8136(Static162.aClass100_7, Static540.aClass353_110);
		Static614.method8520();
		Static429.method6724(Static553.aClass32Array19);
		Static643.method8977();
		Static499.method7443();
		if (Static554.anInt1821 == 3) {
			Static190.method3390(4);
		} else if (Static554.anInt1821 == 7) {
			Static190.method3390(8);
		} else if (Static554.anInt1821 == 10) {
			Static190.method3390(11);
		} else if (Static554.anInt1821 == 1 || Static554.anInt1821 == 2) {
			Static398.method9024();
		}
	}
}
