import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_22 = new Class138();

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_69 = new Class234(71, 8);

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_58 = new Class57("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!us;")
	public static final Class234 aClass234_70 = new Class234(40, 10);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!mj;Ljava/lang/Object;I)V")
	public static void method2842(@OriginalArg(0) Class156 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static37.method613(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method2843() {
		@Pc(13) byte local13 = 0;
		if (Static164.aClass154_Sub1_1.aBoolean463) {
			local13 = 55;
		}
		Static273.method4273(local13);
		Static97.aClass217_4.method5002(local13);
		Static176.aClass78_3.method1642(local13);
		Static90.aClass83_2.method1723(local13);
		Static224.aClass203_2.method4556(local13);
		Static289.method4517(local13);
		Static113.method1833(local13);
		Static151.method2385(local13);
		Static98.method1644(local13);
		if (Static348.anInt4439 == 10) {
			Static310.method4763(28);
		} else if (Static348.anInt4439 == 30) {
			Static310.method4763(25);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static248.method4058(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (arg5 >= Static26.anInt345 && arg5 <= Static272.anInt4750) {
			@Pc(49) int[] local49 = Static325.anIntArrayArray50[arg5];
			local58 = Static97.method1633(arg3 - arg1, Static365.anInt6140, Static221.anInt3917);
			local67 = Static97.method1633(arg3 + arg1, Static365.anInt6140, Static221.anInt3917);
			local76 = Static97.method1633(arg3 - local15, Static365.anInt6140, Static221.anInt3917);
			local84 = Static97.method1633(arg3 + local15, Static365.anInt6140, Static221.anInt3917);
			Static349.method5265(local58, local76, arg4, local49);
			Static349.method5265(local76, local84, arg2, local49);
			Static349.method5265(local84, local67, arg4, local49);
		}
		@Pc(104) int local104 = -1;
		while (local21 > local10) {
			local31 += 2;
			local104 += 2;
			local29 += local104;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static318.anIntArray214[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(201) int local201;
			@Pc(210) int local210;
			@Pc(221) int[] local221;
			@Pc(153) int local153;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local153 = arg5 - local21;
				local58 = arg5 + local21;
				if (local58 >= Static26.anInt345 && Static272.anInt4750 >= local153) {
					if (local21 < local15) {
						local67 = Static318.anIntArray214[local21];
						local76 = Static97.method1633(arg3 + local10, Static365.anInt6140, Static221.anInt3917);
						local84 = Static97.method1633(arg3 - local10, Static365.anInt6140, Static221.anInt3917);
						local201 = Static97.method1633(local67 + arg3, Static365.anInt6140, Static221.anInt3917);
						local210 = Static97.method1633(arg3 - local67, Static365.anInt6140, Static221.anInt3917);
						if (local58 <= Static272.anInt4750) {
							local221 = Static325.anIntArrayArray50[local58];
							Static349.method5265(local84, local210, arg4, local221);
							Static349.method5265(local210, local201, arg2, local221);
							Static349.method5265(local201, local76, arg4, local221);
						}
						if (Static26.anInt345 <= local153) {
							local221 = Static325.anIntArrayArray50[local153];
							Static349.method5265(local84, local210, arg4, local221);
							Static349.method5265(local210, local201, arg2, local221);
							Static349.method5265(local201, local76, arg4, local221);
						}
					} else {
						local67 = Static97.method1633(arg3 + local10, Static365.anInt6140, Static221.anInt3917);
						local76 = Static97.method1633(arg3 - local10, Static365.anInt6140, Static221.anInt3917);
						if (local58 <= Static272.anInt4750) {
							Static349.method5265(local76, local67, arg4, Static325.anIntArrayArray50[local58]);
						}
						if (local153 >= Static26.anInt345) {
							Static349.method5265(local76, local67, arg4, Static325.anIntArrayArray50[local153]);
						}
					}
				}
			}
			local153 = arg5 - local10;
			local58 = local10 + arg5;
			if (Static26.anInt345 <= local58 && local153 <= Static272.anInt4750) {
				local67 = arg3 + local21;
				local76 = arg3 - local21;
				if (Static221.anInt3917 <= local67 && Static365.anInt6140 >= local76) {
					local67 = Static97.method1633(local67, Static365.anInt6140, Static221.anInt3917);
					local76 = Static97.method1633(local76, Static365.anInt6140, Static221.anInt3917);
					if (local15 > local10) {
						local84 = local26 < local10 ? Static318.anIntArray214[local10] : local26;
						local201 = Static97.method1633(arg3 + local84, Static365.anInt6140, Static221.anInt3917);
						local210 = Static97.method1633(arg3 - local84, Static365.anInt6140, Static221.anInt3917);
						if (Static272.anInt4750 >= local58) {
							local221 = Static325.anIntArrayArray50[local58];
							Static349.method5265(local76, local210, arg4, local221);
							Static349.method5265(local210, local201, arg2, local221);
							Static349.method5265(local201, local67, arg4, local221);
						}
						if (local153 >= Static26.anInt345) {
							local221 = Static325.anIntArrayArray50[local153];
							Static349.method5265(local76, local210, arg4, local221);
							Static349.method5265(local210, local201, arg2, local221);
							Static349.method5265(local201, local67, arg4, local221);
						}
					} else {
						if (local58 <= Static272.anInt4750) {
							Static349.method5265(local76, local67, arg4, Static325.anIntArrayArray50[local58]);
						}
						if (Static26.anInt345 <= local153) {
							Static349.method5265(local76, local67, arg4, Static325.anIntArrayArray50[local153]);
						}
					}
				}
			}
		}
	}
}
