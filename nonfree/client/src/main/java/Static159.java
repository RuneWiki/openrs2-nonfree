import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_113 = new Class184(66, -2);

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!ek;")
	public static Class66 aClass66_1 = new Class66();

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_106 = new Class175("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_107 = new Class175("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)I")
	public static int method2739(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)S")
	public static short method2740(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(41) int local41 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(46) int local46 = local19 + local41;
		@Pc(54) int local54;
		if (local46 == 0) {
			local54 = local41 << 1;
		} else {
			local54 = (local41 << 8) / local46;
		}
		return (short) (local9 << 10 | local54 >> 4 << 7 | local46);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIB[BI)Z")
	public static boolean method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(11) boolean local11 = true;
		@Pc(16) Class3_Sub2 local16 = new Class3_Sub2(arg3);
		@Pc(18) int local18 = -1;
		label68: while (true) {
			@Pc(22) int local22 = local16.method6037();
			if (local22 == 0) {
				return local11;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			@Pc(32) boolean local32 = false;
			while (true) {
				@Pc(65) int local65;
				@Pc(99) Class128 local99;
				do {
					@Pc(69) int local69;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(38) int local38;
									while (local32) {
										local38 = local16.method6040();
										if (local38 == 0) {
											continue label68;
										}
										local16.method6053();
									}
									local38 = local16.method6040();
									if (local38 == 0) {
										continue label68;
									}
									local30 += local38 - 1;
									@Pc(53) int local53 = local30 & 0x3F;
									@Pc(59) int local59 = local30 >> 6 & 0x3F;
									local65 = local16.method6053() >> 2;
									local69 = local59 + arg2;
									local73 = arg1 + local53;
								} while (local69 <= 0);
							} while (local73 <= 0);
						} while (arg4 - 1 <= local69);
					} while (local73 >= arg0 - 1);
					local99 = Static55.aClass25_1.method855(local18);
				} while (local65 == 22 && !Static123.aClass21_Sub1_1.aBoolean65 && local99.anInt4009 == 0 && local99.anInt4039 != 1 && !local99.aBoolean322);
				local32 = true;
				if (!local99.method3301()) {
					Static383.anInt6683++;
					local11 = false;
				}
			}
		}
	}
}
