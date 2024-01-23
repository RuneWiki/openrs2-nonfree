import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!ua;")
	private Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "Lclient!ua;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "Lclient!ua;")
	private Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "[Lclient!ua;")
	private Class2_Sub1[] aClass2_Sub1Array11;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class2_Sub3_Sub4(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method4261();
		this.aClass2_Sub1Array11 = new Class2_Sub1[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(20) int local20;
		@Pc(31) Class2_Sub1 local31;
		@Pc(47) int local47;
		@Pc(54) int local54;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = Static92.method1716(arg0);
			if (local31.method4945() >= 0) {
				local5++;
			}
			if (local31.method4942() >= 0) {
				local15++;
			}
			local47 = local31.aClass2_Sub1Array42.length;
			local18[local20] = new int[local47];
			for (local54 = 0; local54 < local47; local54++) {
				local18[local20][local54] = arg0.method4261();
			}
			this.aClass2_Sub1Array11[local20] = local31;
		}
		this.anIntArray109 = new int[local5];
		this.anIntArray108 = new int[local15];
		local5 = 0;
		local15 = 0;
		for (local20 = 0; local20 < local9; local20++) {
			local31 = this.aClass2_Sub1Array11[local20];
			local47 = local31.aClass2_Sub1Array42.length;
			for (local54 = 0; local54 < local47; local54++) {
				local31.aClass2_Sub1Array42[local54] = this.aClass2_Sub1Array11[local18[local20][local54]];
			}
			local54 = local31.method4945();
			@Pc(138) int local138 = local31.method4942();
			if (local54 > 0) {
				this.anIntArray109[local5++] = local54;
			}
			if (local138 > 0) {
				this.anIntArray108[local15++] = local138;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array11[arg0.method4261()];
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array11[arg0.method4261()];
		this.aClass2_Sub1_3 = this.aClass2_Sub1Array11[arg0.method4261()];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!jd;Lclient!em;ZIDI)Lclient!af;")
	public Class2_Sub3_Sub1_Sub1 method1284(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(5) double arg3, @OriginalArg(6) int arg4) {
		Static242.method3953(arg3);
		Static260.aClass84_112 = arg1;
		Static155.anInterface1_113 = arg2;
		Static155.method4925(arg0, arg4);
		@Pc(30) Class2_Sub3_Sub1_Sub1 local30 = new Class2_Sub3_Sub1_Sub1(arg0, arg4);
		@Pc(32) int local32;
		for (local32 = 0; local32 < this.aClass2_Sub1Array11.length; local32++) {
			this.aClass2_Sub1Array11[local32].method4944(arg4, arg0);
		}
		local32 = 0;
		@Pc(56) int local56;
		for (local56 = 0; local56 < arg4; local56++) {
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			if (this.aClass2_Sub1_1.aBoolean492) {
				@Pc(97) int[] local97 = this.aClass2_Sub1_1.method4940(local56);
				local81 = local97;
				local85 = local97;
				local89 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub1_1.method4941(local56);
				local81 = local77[0];
				local85 = local77[1];
				local89 = local77[2];
			}
			for (@Pc(105) int local105 = 0; local105 != arg0; local105++) {
				@Pc(114) int local114 = local85[local105] >> 4;
				@Pc(120) int local120 = local81[local105] >> 4;
				@Pc(126) int local126 = local89[local105] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local114 > 255) {
					local114 = 255;
				}
				if (local126 > 255) {
					local126 = 255;
				}
				if (local114 < 0) {
					local114 = 0;
				}
				local114 = Static65.anIntArray107[local114];
				if (local126 < 0) {
					local126 = 0;
				}
				local126 = Static65.anIntArray107[local126];
				if (local120 < 0) {
					local120 = 0;
				}
				local120 = Static65.anIntArray107[local120];
				local30.anIntArray479[local32++] = (local114 << 8) + (local120 << 16) + local126;
			}
		}
		for (local56 = 0; local56 < this.aClass2_Sub1Array11.length; local56++) {
			this.aClass2_Sub1Array11[local56].method4936();
		}
		return local30;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!jd;Lclient!em;IDBZ)Lclient!ud;")
	public Class2_Sub3_Sub1_Sub1_Sub1 method1285(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		Static242.method3953(arg4);
		Static260.aClass84_112 = arg1;
		Static155.anInterface1_113 = arg2;
		Static155.method4925(arg0, arg3);
		@Pc(22) Class2_Sub3_Sub1_Sub1_Sub1 local22 = new Class2_Sub3_Sub1_Sub1_Sub1(arg0, arg3);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass2_Sub1Array11.length; local24++) {
			this.aClass2_Sub1Array11[local24].method4944(arg3, arg0);
		}
		local24 = 0;
		@Pc(48) int local48;
		for (local48 = 0; local48 < arg3; local48++) {
			@Pc(76) int[] local76;
			@Pc(84) int[] local84;
			@Pc(80) int[] local80;
			@Pc(92) int[] local92;
			if (this.aClass2_Sub1_1.aBoolean492) {
				local92 = this.aClass2_Sub1_1.method4940(local48);
				local84 = local92;
				local80 = local92;
				local76 = local92;
			} else {
				@Pc(72) int[][] local72 = this.aClass2_Sub1_1.method4941(local48);
				local76 = local72[0];
				local80 = local72[2];
				local84 = local72[1];
			}
			if (this.aClass2_Sub1_2.aBoolean492) {
				local92 = this.aClass2_Sub1_2.method4940(local48);
			} else {
				local92 = this.aClass2_Sub1_2.method4941(local48)[0];
			}
			for (@Pc(122) int local122 = arg0 - 1; local122 >= 0; local122--) {
				@Pc(133) int local133 = local76[local122] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				@Pc(147) int local147 = local84[local122] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				local133 = Static65.anIntArray107[local133];
				@Pc(173) int local173 = local80[local122] >> 4;
				if (local147 < 0) {
					local147 = 0;
				}
				if (local173 > 255) {
					local173 = 255;
				}
				if (local173 < 0) {
					local173 = 0;
				}
				local173 = Static65.anIntArray107[local173];
				local147 = Static65.anIntArray107[local147];
				@Pc(217) int local217;
				if (local133 == 0 && local147 == 0 && local173 == 0) {
					local217 = 0;
				} else {
					local217 = local92[local122] >> 4;
					if (local217 > 255) {
						local217 = 255;
					}
					if (local217 < 0) {
						local217 = 0;
					}
				}
				local22.anIntArray479[local24++] = (local217 << 24) - (-(local133 << 16) + (-(local147 << 8) - local173));
			}
		}
		for (local48 = 0; local48 < this.aClass2_Sub1Array11.length; local48++) {
			this.aClass2_Sub1Array11[local48].method4936();
		}
		return local22;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILclient!em;IDILclient!jd;)[I")
	public int[] method1286(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(6) Class84 arg5) {
		Static242.method3953(arg4);
		@Pc(23) int[] local23 = new int[arg3 * 4 * arg1];
		Static260.aClass84_112 = arg5;
		Static155.anInterface1_113 = arg2;
		Static155.method4925(arg3, arg1);
		@Pc(33) int local33;
		for (local33 = 0; local33 < this.aClass2_Sub1Array11.length; local33++) {
			this.aClass2_Sub1Array11[local33].method4944(arg1, arg3);
		}
		local33 = 0;
		@Pc(57) int local57;
		for (local57 = 0; local57 < arg1; local57++) {
			if (arg0) {
				local33 = local57;
			}
			@Pc(80) int[] local80;
			@Pc(84) int[] local84;
			@Pc(82) int[] local82;
			@Pc(78) int[] local78;
			if (this.aClass2_Sub1_1.aBoolean492) {
				local78 = this.aClass2_Sub1_1.method4940(local57);
				local80 = local78;
				local82 = local78;
				local84 = local78;
			} else {
				@Pc(92) int[][] local92 = this.aClass2_Sub1_1.method4941(local57);
				local80 = local92[0];
				local84 = local92[1];
				local82 = local92[2];
			}
			if (this.aClass2_Sub1_2.aBoolean492) {
				local78 = this.aClass2_Sub1_2.method4940(local57);
			} else {
				local78 = this.aClass2_Sub1_2.method4941(local57)[0];
			}
			for (@Pc(128) int local128 = arg3 - 1; local128 >= 0; local128--) {
				@Pc(137) int local137 = local80[local128] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				local137 = Static65.anIntArray107[local137];
				@Pc(161) int local161 = local84[local128] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				@Pc(172) int local172 = local82[local128] >> 4;
				if (local172 > 255) {
					local172 = 255;
				}
				if (local172 < 0) {
					local172 = 0;
				}
				local172 = Static65.anIntArray107[local172];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static65.anIntArray107[local161];
				@Pc(216) int local216;
				if (local137 == 0 && local161 == 0 && local172 == 0) {
					local216 = 0;
				} else {
					local216 = local78[local128] >> 4;
					if (local216 > 255) {
						local216 = 255;
					}
					if (local216 < 0) {
						local216 = 0;
					}
				}
				local23[local33++] = local172 + (local161 << 8) + (local137 << 16) + (local216 << 24);
				if (arg0) {
					local33 += arg3 - 1;
				}
			}
		}
		for (local57 = 0; local57 < this.aClass2_Sub1Array11.length; local57++) {
			this.aClass2_Sub1Array11[local57].method4936();
		}
		return local23;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIBLclient!em;Lclient!jd;)[F")
	public float[] method1287(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface1 arg3, @OriginalArg(5) Class84 arg4) {
		@Pc(22) float[] local22 = new float[arg0 * 4 * arg2];
		Static260.aClass84_112 = arg4;
		Static155.anInterface1_113 = arg3;
		Static155.method4925(arg0, arg2);
		@Pc(32) int local32;
		for (local32 = 0; local32 < this.aClass2_Sub1Array11.length; local32++) {
			this.aClass2_Sub1Array11[local32].method4944(arg2, arg0);
		}
		local32 = 0;
		@Pc(56) int local56;
		for (local56 = 0; local56 < arg2; local56++) {
			if (arg1) {
				local32 = local56 << 2;
			}
			@Pc(82) int[] local82;
			@Pc(84) int[] local84;
			@Pc(86) int[] local86;
			if (this.aClass2_Sub1_1.aBoolean492) {
				@Pc(80) int[] local80 = this.aClass2_Sub1_1.method4940(local56);
				local82 = local80;
				local84 = local80;
				local86 = local80;
			} else {
				@Pc(94) int[][] local94 = this.aClass2_Sub1_1.method4941(local56);
				local82 = local94[0];
				local84 = local94[1];
				local86 = local94[2];
			}
			@Pc(118) int[] local118;
			if (this.aClass2_Sub1_2.aBoolean492) {
				local118 = this.aClass2_Sub1_2.method4940(local56);
			} else {
				local118 = this.aClass2_Sub1_2.method4941(local56)[0];
			}
			@Pc(138) int[] local138;
			if (this.aClass2_Sub1_3.aBoolean492) {
				local138 = this.aClass2_Sub1_3.method4940(local56);
			} else {
				local138 = this.aClass2_Sub1_3.method4941(local56)[0];
			}
			for (@Pc(150) int local150 = arg0 - 1; local150 >= 0; local150--) {
				@Pc(162) float local162 = (float) local118[local150] / 4096.0F;
				@Pc(175) float local175 = ((float) local138[local150] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local162 < 0.0F) {
					local162 = 0.0F;
				} else if (local162 > 1.0F) {
					local162 = 1.0F;
				}
				local22[local32++] = local175 * (float) local82[local150];
				local22[local32++] = (float) local84[local150] * local175;
				local22[local32++] = (float) local86[local150] * local175;
				local22[local32++] = local162;
				if (arg1) {
					local32 += (arg0 << 2) - 4;
				}
			}
		}
		for (local56 = 0; local56 < this.aClass2_Sub1Array11.length; local56++) {
			this.aClass2_Sub1Array11[local56].method4936();
		}
		return local22;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILclient!jd;ZZLclient!em;DI)[I")
	public int[] method1288(@OriginalArg(1) int arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface1 arg4, @OriginalArg(6) double arg5, @OriginalArg(7) int arg6) {
		Static242.method3953(arg5);
		@Pc(20) int[] local20 = new int[arg0 * arg6];
		Static260.aClass84_112 = arg1;
		Static155.anInterface1_113 = arg4;
		Static155.method4925(arg0, arg6);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass2_Sub1Array11.length; local30++) {
			this.aClass2_Sub1Array11[local30].method4944(arg6, arg0);
		}
		@Pc(48) int local48 = 0;
		@Pc(58) int local58;
		@Pc(52) byte local52;
		if (arg3) {
			local52 = -1;
			local30 = arg0 - 1;
			local58 = -1;
		} else {
			local52 = 1;
			local58 = arg0;
			local30 = 0;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6; local68++) {
			if (arg2) {
				local48 = local68;
			}
			@Pc(90) int[] local90;
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			if (this.aClass2_Sub1_1.aBoolean492) {
				@Pc(86) int[] local86 = this.aClass2_Sub1_1.method4940(local68);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass2_Sub1_1.method4941(local68);
				local90 = local100[0];
				local92 = local100[1];
				local88 = local100[2];
			}
			for (@Pc(114) int local114 = local30; local114 != local58; local114 += local52) {
				@Pc(127) int local127 = local92[local114] >> 4;
				@Pc(133) int local133 = local90[local114] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local133 > 255) {
					local133 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(159) int local159 = local88[local114] >> 4;
				local127 = Static65.anIntArray107[local127];
				if (local133 < 0) {
					local133 = 0;
				}
				if (local159 > 255) {
					local159 = 255;
				}
				if (local159 < 0) {
					local159 = 0;
				}
				local133 = Static65.anIntArray107[local133];
				local159 = Static65.anIntArray107[local159];
				local20[local48++] = local159 + (local133 << 16) + (local127 << 8);
				if (arg2) {
					local48 += arg0 - 1;
				}
			}
		}
		for (local68 = 0; local68 < this.aClass2_Sub1Array11.length; local68++) {
			this.aClass2_Sub1Array11[local68].method4936();
		}
		return local20;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!jd;ILclient!em;)Z")
	public boolean method1289(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Interface1 arg1) {
		@Pc(10) int local10;
		if (Static149.anInt3178 <= 0) {
			for (local10 = 0; local10 < this.anIntArray109.length; local10++) {
				if (!arg0.method2138(this.anIntArray109[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray109.length; local10++) {
				if (!arg0.method2147(this.anIntArray109[local10], Static149.anInt3178)) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray108.length; local10++) {
			if (!arg1.method3486(this.anIntArray108[local10])) {
				return false;
			}
		}
		return true;
	}
}
