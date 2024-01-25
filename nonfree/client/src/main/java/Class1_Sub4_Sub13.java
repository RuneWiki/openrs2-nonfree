import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "[I")
	private final int[] anIntArray200;

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "[I")
	private final int[] anIntArray201;

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "Lclient!po;")
	private final Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "Lclient!po;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "Lclient!po;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "[Lclient!po;")
	private final Class1_Sub1[] aClass1_Sub1Array17;

	static {
		new Class106("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Class106("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	private Class1_Sub4_Sub13() {
		this.anIntArray200 = new int[0];
		this.anIntArray201 = new int[0];
		this.aClass1_Sub1_3 = new Class1_Sub1_Sub36(0);
		this.aClass1_Sub1_3.anInt6964 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub36();
		this.aClass1_Sub1_1.anInt6964 = 1;
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub36();
		this.aClass1_Sub1_2.anInt6964 = 1;
		this.aClass1_Sub1Array17 = new Class1_Sub1[] { this.aClass1_Sub1_1, this.aClass1_Sub1_2, this.aClass1_Sub1_3 };
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class1_Sub4_Sub13(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method2132();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub1Array17 = new Class1_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static125.method2622(arg0);
			if (local26.method6003() >= 0) {
				local9++;
			}
			if (local26.method6011() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method2132();
			}
			this.aClass1_Sub1Array17[local20] = local26;
		}
		this.anIntArray201 = new int[local9];
		local9 = 0;
		this.anIntArray200 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class1_Sub1 local102 = this.aClass1_Sub1Array17[local95];
			local50 = local102.aClass1_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass1_Sub1Array42[local108] = this.aClass1_Sub1Array17[local14[local95][local108]];
			}
			@Pc(134) int local134 = local102.method6003();
			@Pc(138) int local138 = local102.method6011();
			if (local134 > 0) {
				this.anIntArray201[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray200[local11++] = local138;
			}
			local14[local95] = null;
		}
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array17[arg0.method2132()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array17[arg0.method2132()];
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array17[arg0.method2132()];
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ic;Lclient!ct;I)Z")
	public boolean method2620(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class30 arg1) {
		@Pc(10) int local10;
		if (Static318.anInt6106 >= 0) {
			for (local10 = 0; local10 < this.anIntArray201.length; local10++) {
				if (!arg1.method1162(this.anIntArray201[local10], Static318.anInt6106)) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray201.length; local10++) {
				if (!arg1.method1154(this.anIntArray201[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray200.length; local10++) {
			if (!arg0.method5485(this.anIntArray200[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ic;ILclient!ct;ZIDI)[I")
	public int[] method2625(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5) {
		Static8.anInterface3_1 = arg0;
		Static158.aClass30_48 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array17.length; local11++) {
			this.aClass1_Sub1Array17[local11].method6001(arg1, arg4);
		}
		Static336.method5658(arg5);
		Static264.method4800(arg4, arg1);
		@Pc(41) int[] local41 = new int[arg4 * 4 * arg1];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg4; local45++) {
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(63) int[] local63;
			@Pc(57) int[] local57;
			if (this.aClass1_Sub1_1.aBoolean509) {
				local57 = this.aClass1_Sub1_1.method6007(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(73) int[][] local73 = this.aClass1_Sub1_1.method6004(local45);
				local61 = local73[0];
				local63 = local73[2];
				local59 = local73[1];
			}
			if (arg3) {
				local43 = local45;
			}
			if (this.aClass1_Sub1_2.aBoolean509) {
				local57 = this.aClass1_Sub1_2.method6007(local45);
			} else {
				local57 = this.aClass1_Sub1_2.method6004(local45)[0];
			}
			for (@Pc(115) int local115 = arg1 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local61[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(140) int local140 = local59[local115] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(155) int local155 = local63[local115] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local140 = Static62.anIntArray123[local140];
				local123 = Static62.anIntArray123[local123];
				if (local155 < 0) {
					local155 = 0;
				}
				local155 = Static62.anIntArray123[local155];
				@Pc(199) int local199;
				if (local123 == 0 && local140 == 0 && local155 == 0) {
					local199 = 0;
				} else {
					local199 = local57[local115] >> 4;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 < 0) {
						local199 = 0;
					}
				}
				local41[local43++] = (local140 << 8) + (local199 << 24) + (local123 << 16) + local155;
				if (arg3) {
					local43 += arg1 - 1;
				}
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.aClass1_Sub1Array17.length; local253++) {
			this.aClass1_Sub1Array17[local253].method6009();
		}
		return local41;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIIDLclient!ct;ZBLclient!ic;)[I")
	public int[] method2626(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Interface3 arg6) {
		Static8.anInterface3_1 = arg6;
		Static158.aClass30_48 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array17.length; local11++) {
			this.aClass1_Sub1Array17[local11].method6001(arg2, arg1);
		}
		Static336.method5658(arg3);
		Static264.method4800(arg1, arg2);
		@Pc(39) int[] local39 = new int[arg2 * arg1];
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(48) byte local48;
		if (arg5) {
			local48 = -1;
			local52 = arg2 - 1;
			local54 = -1;
		} else {
			local54 = arg2;
			local52 = 0;
			local48 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
			if (arg0) {
				local64 = local66;
			}
			@Pc(88) int[] local88;
			@Pc(84) int[] local84;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub1_1.aBoolean509) {
				@Pc(82) int[] local82 = this.aClass1_Sub1_1.method6007(local66);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass1_Sub1_1.method6004(local66);
				local84 = local96[1];
				local88 = local96[0];
				local86 = local96[2];
			}
			for (@Pc(110) int local110 = local52; local110 != local54; local110 += local48) {
				@Pc(118) int local118 = local88[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(133) int local133 = local84[local110] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(151) int local151 = local86[local110] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				local133 = Static62.anIntArray123[local133];
				local118 = Static62.anIntArray123[local118];
				if (local151 < 0) {
					local151 = 0;
				}
				local151 = Static62.anIntArray123[local151];
				@Pc(185) int local185 = local151 + (local118 << 16) + (local133 << 8);
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local39[local64++] = local185;
				if (arg0) {
					local64 += arg2 - 1;
				}
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.aClass1_Sub1Array17.length; local221++) {
			this.aClass1_Sub1Array17[local221].method6009();
		}
		return local39;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZILclient!ct;Lclient!ic;B)[F")
	public float[] method2627(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) Interface3 arg4) {
		Static8.anInterface3_1 = arg4;
		Static158.aClass30_48 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array17.length; local11++) {
			this.aClass1_Sub1Array17[local11].method6001(arg0, arg2);
		}
		Static264.method4800(arg2, arg0);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg0];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(69) int[] local69;
			if (this.aClass1_Sub1_1.aBoolean509) {
				@Pc(65) int[] local65 = this.aClass1_Sub1_1.method6007(local53);
				local67 = local65;
				local69 = local65;
				local71 = local65;
			} else {
				@Pc(79) int[][] local79 = this.aClass1_Sub1_1.method6004(local53);
				local71 = local79[1];
				local67 = local79[0];
				local69 = local79[2];
			}
			@Pc(103) int[] local103;
			if (this.aClass1_Sub1_2.aBoolean509) {
				local103 = this.aClass1_Sub1_2.method6007(local53);
			} else {
				local103 = this.aClass1_Sub1_2.method6004(local53)[0];
			}
			@Pc(121) int[] local121;
			if (this.aClass1_Sub1_3.aBoolean509) {
				local121 = this.aClass1_Sub1_3.method6007(local53);
			} else {
				local121 = this.aClass1_Sub1_3.method6004(local53)[0];
			}
			if (arg1) {
				local51 = local53 << 2;
			}
			for (@Pc(141) int local141 = arg0 - 1; local141 >= 0; local141--) {
				@Pc(150) float local150 = (float) local103[local141] / 4096.0F;
				@Pc(163) float local163 = ((float) local121[local141] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local150 < 0.0F) {
					local150 = 0.0F;
				} else if (local150 > 1.0F) {
					local150 = 1.0F;
				}
				local42[local51++] = local163 * (float) local67[local141];
				local42[local51++] = local163 * (float) local71[local141];
				local42[local51++] = local163 * (float) local69[local141];
				local42[local51++] = local150;
				if (arg1) {
					local51 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass1_Sub1Array17.length; local235++) {
			this.aClass1_Sub1Array17[local235].method6009();
		}
		return local42;
	}
}
