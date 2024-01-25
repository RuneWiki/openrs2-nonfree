import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class28_Sub1_Sub4_Sub2_Sub2 extends Class28_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!jha", name = "nd", descriptor = "I")
	public int anInt5544;

	@OriginalMember(owner = "client!jha", name = "qd", descriptor = "I")
	private int anInt5547;

	@OriginalMember(owner = "client!jha", name = "rd", descriptor = "Lclient!lga;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!jha", name = "xd", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!jha", name = "Ld", descriptor = "I")
	public int anInt5560;

	@OriginalMember(owner = "client!jha", name = "Od", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!jha", name = "Yc", descriptor = "Z")
	public boolean aBoolean474 = false;

	@OriginalMember(owner = "client!jha", name = "Rc", descriptor = "I")
	public int anInt5528 = 0;

	@OriginalMember(owner = "client!jha", name = "Tc", descriptor = "I")
	public int anInt5529 = -1;

	@OriginalMember(owner = "client!jha", name = "ad", descriptor = "I")
	public int anInt5533 = 0;

	@OriginalMember(owner = "client!jha", name = "Uc", descriptor = "Z")
	public boolean aBoolean473 = false;

	@OriginalMember(owner = "client!jha", name = "Sc", descriptor = "B")
	private byte aByte82 = 0;

	@OriginalMember(owner = "client!jha", name = "ld", descriptor = "I")
	public int anInt5542 = 255;

	@OriginalMember(owner = "client!jha", name = "md", descriptor = "I")
	public int anInt5543 = -1;

	@OriginalMember(owner = "client!jha", name = "ud", descriptor = "B")
	private byte aByte83 = 0;

	@OriginalMember(owner = "client!jha", name = "jd", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!jha", name = "dd", descriptor = "I")
	public int anInt5536 = 0;

	@OriginalMember(owner = "client!jha", name = "wd", descriptor = "I")
	public int anInt5550 = -1;

	@OriginalMember(owner = "client!jha", name = "Fd", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!jha", name = "hd", descriptor = "Z")
	public boolean aBoolean475 = false;

	@OriginalMember(owner = "client!jha", name = "Jd", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!jha", name = "td", descriptor = "I")
	public int anInt5548 = -1;

	@OriginalMember(owner = "client!jha", name = "vd", descriptor = "I")
	public int anInt5549 = 0;

	@OriginalMember(owner = "client!jha", name = "Nd", descriptor = "Z")
	public boolean aBoolean478 = false;

	@OriginalMember(owner = "client!jha", name = "cd", descriptor = "I")
	public int anInt5535 = 0;

	@OriginalMember(owner = "client!jha", name = "Rd", descriptor = "I")
	public int anInt5563 = -1;

	@OriginalMember(owner = "client!jha", name = "Pd", descriptor = "I")
	public int anInt5562 = -1;

	@OriginalMember(owner = "client!jha", name = "Zc", descriptor = "I")
	public int anInt5532 = -1;

	@OriginalMember(owner = "client!jha", name = "Sd", descriptor = "I")
	public int anInt5564 = -1;

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jha", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IILclient!ka;ILclient!oha;IIILclient!ha;)V")
	private void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class153 arg2, @OriginalArg(4) Class254 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class65 arg7) {
		@Pc(20) int local20 = arg1 * arg1 + arg4 * arg4;
		if (local20 < 262144 || local20 > arg6) {
			return;
		}
		@Pc(50) int local50 = (int) (Math.atan2((double) arg1, (double) arg4) * 2607.5945876176133D - (double) super.aClass306_7.method7389()) & 0x3FFF;
		@Pc(62) Class153 local62 = Static114.method2122(super.anInt5458, super.anInt5466, arg7, arg5, super.anInt5486, local50);
		if (local62 != null) {
			arg7.C(false);
			local62.method8594(arg3, (Class28_Sub9) null, arg0, 0);
			arg7.C(true);
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIILclient!oha;IILclient!ka;Lclient!ha;)V")
	private void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class254 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class153 arg5, @OriginalArg(7) Class65 arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg1 * arg1;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg1, (double) arg0) * 2607.5945876176133D - (double) super.aClass306_7.method7389()) & 0x3FFF;
		@Pc(52) Class153 local52 = Static114.method2122(super.anInt5458, super.anInt5466, arg6, arg3, super.anInt5486, local40);
		if (local52 != null) {
			arg6.C(false);
			local52.method8585(arg2, (Class28_Sub9) null, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IBBI)V")
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt5482 != -1 && Static591.aClass66_2.method1768(super.anInt5482).anInt5032 == 1) {
			super.anInt5482 = -1;
			super.anIntArray305 = null;
		}
		for (@Pc(32) int local32 = 0; local32 < super.aClass227Array3.length; local32++) {
			if (super.aClass227Array3[local32].anInt6677 != -1) {
				@Pc(50) Class338 local50 = Static239.aClass91_1.method2243(super.aClass227Array3[local32].anInt6677);
				if (local50.aBoolean794 && local50.anInt9376 != -1 && Static591.aClass66_2.method1768(local50.anInt9376).anInt5032 == 1) {
					super.aClass227Array3[local32].anInt6677 = -1;
				}
			}
		}
		this.anInt5543 = -1;
		if (arg0 < 0 || arg0 >= Static201.anInt3834 || arg2 < 0 || Static626.anInt10238 <= arg2) {
			this.method4609(arg2, arg0);
		} else if (super.anIntArray308[0] >= 0 && Static201.anInt3834 > super.anIntArray308[0] && super.anIntArray307[0] >= 0 && super.anIntArray307[0] < Static626.anInt10238) {
			if (arg1 == 2) {
				Static456.method6543(this, arg0, arg2);
			}
			this.method4606(arg2, arg0, arg1);
		} else {
			this.method4609(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method4605(@OriginalArg(0) Class5_Sub41 arg0) {
		arg0.anInt9230 = 0;
		@Pc(10) int local10 = arg0.method7816();
		this.aByte82 = (byte) (local10 & 0x1);
		@Pc(19) boolean local19 = this.aBoolean477;
		this.aBoolean477 = (local10 & 0x2) != 0;
		@Pc(39) boolean local39 = (local10 & 0x4) != 0;
		@Pc(43) int local43 = super.method4599();
		this.method4585((local10 >> 3 & 0x7) + 1);
		this.aByte83 = (byte) (local10 >> 6 & 0x3);
		super.anInt10781 += this.method4599() - local43 << 8;
		super.anInt10784 += this.method4599() - local43 << 8;
		this.aByte84 = arg0.method7861();
		this.anInt5562 = arg0.method7861();
		this.anInt5548 = arg0.method7861();
		this.aBoolean478 = arg0.method7861() == 1;
		if (Static217.aClass187_7 == Static560.aClass187_13 && Static105.anInt2257 >= 2) {
			this.aBoolean478 = false;
		}
		this.anInt5535 = 0;
		@Pc(126) int local126 = -1;
		@Pc(131) int[] local131 = new int[Static600.aClass236_2.anIntArray382.length];
		@Pc(136) Class154[] local136 = new Class154[Static600.aClass236_2.anIntArray382.length];
		@Pc(141) Class238[] local141 = new Class238[Static600.aClass236_2.anIntArray382.length];
		@Pc(154) int local154;
		@Pc(165) int local165;
		@Pc(171) int local171;
		@Pc(215) int local215;
		for (@Pc(143) int local143 = 0; local143 < Static600.aClass236_2.anIntArray382.length; local143++) {
			if (Static600.aClass236_2.anIntArray382[local143] != 1) {
				local154 = arg0.method7816();
				if (local154 == 0) {
					local131[local143] = 0;
				} else {
					local165 = arg0.method7816();
					local171 = local165 + (local154 << 8);
					if (local143 == 0 && local171 == 65535) {
						local126 = arg0.method7860();
						this.anInt5535 = arg0.method7816();
						break;
					}
					if (local171 >= 32768) {
						local171 = Static645.anIntArray593[local171 - 32768];
						local131[local143] = local171 | 0x40000000;
						local141[local143] = Static110.aClass105_1.method2659(local171);
						local215 = local141[local143].anInt6851;
						if (local215 != 0) {
							this.anInt5535 = local215;
						}
					} else {
						local131[local143] = Integer.MIN_VALUE | local171 - 256;
					}
				}
			}
		}
		if (local126 == -1) {
			local154 = arg0.method7860();
			local165 = 0;
			for (local171 = 0; local171 < Static600.aClass236_2.anIntArray382.length; local171++) {
				if (Static600.aClass236_2.anIntArray382[local171] == 0) {
					if ((0x1 << local165 & local154) != 0) {
						local136[local171] = Static372.method5588(arg0, local141[local171]);
					}
					local165++;
				}
			}
		}
		@Pc(284) int[] local284 = new int[5];
		for (local165 = 0; local165 < 5; local165++) {
			local171 = arg0.method7816();
			if (Static551.aShortArrayArrayArray4.length < 1 || local171 < 0 || local171 >= Static551.aShortArrayArrayArray4[0][local165].length) {
				local171 = 0;
			}
			local284[local165] = local171;
		}
		this.anInt5547 = arg0.method7860();
		this.aString44 = arg0.method7847();
		this.aString45 = this.aString44;
		if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == this) {
			Static140.aString14 = this.aString44;
		}
		this.anInt5549 = arg0.method7816();
		if (local39) {
			this.anInt5533 = arg0.method7860();
			if (this.anInt5533 == 65535) {
				this.anInt5533 = -1;
			}
			this.anInt5564 = -1;
			this.anInt5528 = this.anInt5549;
		} else {
			this.anInt5533 = 0;
			this.anInt5528 = arg0.method7816();
			this.anInt5564 = arg0.method7816();
			if (this.anInt5564 == 255) {
				this.anInt5564 = -1;
			}
		}
		local171 = this.anInt5536;
		this.anInt5536 = arg0.method7816();
		@Pc(415) int local415;
		if (this.anInt5536 == 0) {
			Static216.method3440(this);
		} else {
			local215 = this.anInt5563;
			@Pc(412) int local412 = this.anInt5532;
			local415 = this.anInt5550;
			@Pc(418) int local418 = this.anInt5529;
			@Pc(421) int local421 = this.anInt5542;
			this.anInt5563 = arg0.method7860();
			this.anInt5532 = arg0.method7860();
			this.anInt5550 = arg0.method7860();
			this.anInt5529 = arg0.method7860();
			this.anInt5542 = arg0.method7816();
			if (local19 != this.aBoolean477 || local171 != this.anInt5536 || this.anInt5563 != local215 || local412 != this.anInt5532 || local415 != this.anInt5550 || local418 != this.anInt5529 || this.anInt5542 != local421) {
				Static181.method7336(this);
			}
		}
		if (this.aClass213_1 == null) {
			this.aClass213_1 = new Class213();
		}
		local215 = this.aClass213_1.anInt6255;
		@Pc(505) int[] local505 = this.aClass213_1.anIntArray363;
		this.aClass213_1.method5199(this.method4596(), local136, this.aByte82 == 1, local126, local131, local284);
		if (local126 != local215) {
			super.anInt10781 = (super.anIntArray308[0] << 9) + (this.method4599() << 8);
			super.anInt10784 = (super.anIntArray307[0] << 9) + (this.method4599() << 8);
		}
		if (Static216.anInt4046 == super.anInt5512 && local505 != null) {
			for (local415 = 0; local415 < local284.length; local415++) {
				if (local505[local415] != local284[local415]) {
					Static110.aClass105_1.method2647();
					break;
				}
			}
		}
		if (super.aClass28_Sub5_4 != null) {
			super.aClass28_Sub5_4.method5844();
		}
		if (super.anInt5479 == -1 || !super.aBoolean470) {
			return;
		}
		@Pc(609) Class167 local609 = this.method4580();
		if (!local609.method4114(super.anInt5479)) {
			super.anInt5479 = -1;
			super.aBoolean470 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIBI)V")
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt5524 < 9) {
			super.anInt5524++;
		}
		for (@Pc(22) int local22 = super.anInt5524; local22 > 0; local22--) {
			super.anIntArray308[local22] = super.anIntArray308[local22 - 1];
			super.anIntArray307[local22] = super.anIntArray307[local22 - 1];
			super.aByteArray44[local22] = super.aByteArray44[local22 - 1];
		}
		super.anIntArray308[0] = arg1;
		super.anIntArray307[0] = arg0;
		super.aByteArray44[0] = arg2;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		if (this.aClass213_1 == null || !this.method4611(131072, arg2)) {
			return false;
		}
		@Pc(17) Class254 local17 = arg2.method6903();
		@Pc(30) int local30 = super.aClass306_7.method7389();
		local17.method7346(local30);
		local17.method7358(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass153Array3.length; local45++) {
			if (super.aClass153Array3[local45] != null && (Static632.aBoolean877 ? super.aClass153Array3[local45].method8590(arg0, arg1, local17, true, 0, Static483.anInt8094) : super.aClass153Array3[local45].method8593(arg0, arg1, local17, true, 0))) {
				local43 = true;
				break;
			}
		}
		super.aClass153Array3[0] = super.aClass153Array3[1] = super.aClass153Array3[2] = null;
		return local43;
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method4607() {
		@Pc(5) String local5 = "";
		if (Static427.aStringArray44 != null) {
			local5 = local5 + Static427.aStringArray44[this.aByte83];
		}
		@Pc(29) int[] local29;
		if (this.aByte82 == 1 && Static223.anIntArray205 != null) {
			local29 = Static223.anIntArray205;
		} else {
			local29 = Static10.anIntArray11;
		}
		if (local29 != null && local29[this.aByte83] != -1) {
			@Pc(48) Class221 local48 = Static548.aClass190_1.method4808(local29[this.aByte83]);
			if (local48.aChar2 == 's') {
				local5 = local5 + local48.method5370(this.aByte84 & 0xFF);
			} else {
				Static234.method3615(new Throwable(), "gdn1");
				local29[this.aByte83] = -1;
			}
		}
		local5 = local5 + this.aString44;
		if (Static329.aStringArray32 != null) {
			local5 = local5 + Static329.aStringArray32[this.aByte83];
		}
		return local5;
	}

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(B)Z")
	public boolean method4608() {
		return this.aClass213_1 != null;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		if (this.aClass213_1 == null || !super.aBoolean471 && !this.method4611(0, arg0)) {
			return;
		}
		@Pc(27) Class254 local27 = arg0.method6903();
		local27.method7346(super.aClass306_7.method7389());
		local27.method7358(super.anInt10781, super.anInt10779 - 5, super.anInt10784);
		this.method4597(super.aBoolean471, super.aClass153Array3, arg0, local27);
		for (@Pc(54) int local54 = 0; local54 < super.aClass153Array3.length; local54++) {
			super.aClass153Array3[local54] = null;
		}
	}

	@OriginalMember(owner = "client!jha", name = "h", descriptor = "(I)I")
	@Override
	public int method4591() {
		return -1;
	}

	@OriginalMember(owner = "client!jha", name = "d", descriptor = "(III)V")
	public void method4609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray308[0] = arg1;
		super.anInt5522 = 0;
		super.anInt5524 = 0;
		super.anInt5525 = 0;
		super.anIntArray307[0] = arg0;
		@Pc(26) int local26 = this.method4599();
		super.anInt10781 = local26 * 256 + super.anIntArray308[0] * 512;
		super.anInt10784 = local26 * 256 + super.anIntArray307[0] * 512;
		if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == this) {
			Static459.method6575();
		}
		if (super.aClass28_Sub5_4 != null) {
			super.aClass28_Sub5_4.method5844();
		}
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass213_1 == null || !this.method4611(2048, arg0)) {
			return null;
		}
		@Pc(19) Class254 local19 = arg0.method6903();
		@Pc(26) int local26 = super.aClass306_7.method7389();
		local19.method7346(local26);
		@Pc(44) Class226 local44 = Static635.aClass226ArrayArrayArray3[super.aByte145][super.anInt10781 >> Static588.anInt9672][super.anInt10784 >> Static588.anInt9672];
		if (local44 == null || local44.aClass28_Sub1_Sub2_1 == null) {
			super.anInt5455 = (int) ((float) super.anInt5455 - (float) super.anInt5455 / 10.0F);
		} else {
			@Pc(57) int local57 = super.anInt5455 - local44.aClass28_Sub1_Sub2_1.aShort106;
			super.anInt5455 = (int) ((float) super.anInt5455 - (float) local57 / 10.0F);
		}
		local19.method7358(super.anInt10781, -super.anInt5455 + super.anInt10779 - 20, super.anInt10784);
		@Pc(98) Class28_Sub7 local98 = null;
		super.aBoolean472 = false;
		if (Static172.aClass5_Sub50_14.aClass12_Sub18_1.method5001() == 1) {
			@Pc(113) Class167 local113 = this.method4580();
			if (local113.aBoolean416 && (this.aClass213_1.anInt6255 == -1 || Static231.aClass19_2.method274(this.aClass213_1.anInt6255).aBoolean300)) {
				@Pc(145) Class175 local145 = super.anInt5482 != -1 && super.anInt5475 == 0 ? Static591.aClass66_2.method1768(super.anInt5482) : null;
				@Pc(165) Class175 local165 = super.anInt5479 == -1 || this.aBoolean473 || super.aBoolean470 && local145 != null ? null : Static591.aClass66_2.method1768(super.anInt5479);
				@Pc(199) Class153 local199 = Static266.method4129(0, 240, local165 == null ? local145 : local165, super.anInt5486, super.anInt5466, 1, super.aClass153Array3[0], arg0, local165 == null ? super.anInt5498 : super.anInt5499, 0, local26, 160, super.anInt5458);
				if (local199 != null) {
					local98 = Static375.method5607(true, super.aClass153Array3.length + 1);
					super.aBoolean472 = true;
					arg0.C(false);
					if (Static632.aBoolean877) {
						local199.method8594(local19, local98.aClass28_Sub9Array1[super.aClass153Array3.length], Static483.anInt8094, 0);
					} else {
						local199.method8585(local19, local98.aClass28_Sub9Array1[super.aClass153Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(252) int local252;
		if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == this) {
			for (local252 = Static564.aClass371Array6.length - 1; local252 >= 0; local252--) {
				@Pc(258) Class371 local258 = Static564.aClass371Array6[local252];
				if (local258 != null && local258.anInt10321 != -1) {
					@Pc(289) int local289;
					if (local258.anInt10324 == 1) {
						@Pc(277) Class5_Sub25 local277 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local258.anInt10325);
						if (local277 != null) {
							@Pc(282) Class28_Sub1_Sub4_Sub2_Sub1 local282 = local277.aClass28_Sub1_Sub4_Sub2_Sub1_1;
							local289 = local282.anInt10781 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
							@Pc(295) int local295 = local282.anInt10784 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
							if (Static632.aBoolean877) {
								this.method4602(Static483.anInt8094, local289, super.aClass153Array3[0], local19, local295, local258.anInt10321, 92160000, arg0);
							} else {
								this.method4603(local295, local289, local19, local258.anInt10321, 92160000, super.aClass153Array3[0], arg0);
							}
						}
					}
					@Pc(350) int local350;
					if (local258.anInt10324 == 2) {
						@Pc(343) int local343 = local258.anInt10316 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
						local350 = local258.anInt10323 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
						local289 = local258.anInt10317 << 9;
						local289 *= local289;
						if (Static632.aBoolean877) {
							this.method4602(Static483.anInt8094, local343, super.aClass153Array3[0], local19, local350, local258.anInt10321, local289, arg0);
						} else {
							this.method4603(local350, local343, local19, local258.anInt10321, local289, super.aClass153Array3[0], arg0);
						}
					}
					if (local258.anInt10324 == 10 && local258.anInt10325 >= 0 && Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2.length > local258.anInt10325) {
						@Pc(411) Class28_Sub1_Sub4_Sub2_Sub2 local411 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local258.anInt10325];
						if (local411 != null) {
							local350 = local411.anInt10781 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
							local289 = local411.anInt10784 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
							if (Static632.aBoolean877) {
								this.method4602(Static483.anInt8094, local350, super.aClass153Array3[0], local19, local289, local258.anInt10321, 92160000, arg0);
							} else {
								this.method4603(local289, local350, local19, local258.anInt10321, 92160000, super.aClass153Array3[0], arg0);
							}
						}
					}
				}
			}
			local19.method7346(local26);
			local19.method7358(super.anInt10781, super.anInt10779, super.anInt10784);
		}
		local19.method7346(local26);
		local19.method7358(super.anInt10781, -super.anInt5455 + super.anInt10779 - 5, super.anInt10784);
		if (local98 == null) {
			local98 = Static375.method5607(true, super.aClass153Array3.length);
		}
		this.method4597(false, super.aClass153Array3, arg0, local19);
		if (Static632.aBoolean877) {
			for (local252 = 0; super.aClass153Array3.length > local252; local252++) {
				if (super.aClass153Array3[local252] != null) {
					super.aClass153Array3[local252].method8594(local19, local98.aClass28_Sub9Array1[local252], Static483.anInt8094, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local252 = 0; super.aClass153Array3.length > local252; local252++) {
				if (super.aClass153Array3[local252] != null) {
					super.aClass153Array3[local252].method8585(local19, local98.aClass28_Sub9Array1[local252], Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass28_Sub5_4 != null) {
			@Pc(599) Class392 local599 = super.aClass28_Sub5_4.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local599, Static483.anInt8094);
			} else {
				arg0.method6899(local599);
			}
		}
		for (local252 = 0; local252 < super.aClass153Array3.length; local252++) {
			if (super.aClass153Array3[local252] != null) {
				super.aBoolean472 |= super.aClass153Array3[local252].F();
			}
			super.aClass153Array3[local252] = null;
		}
		super.anInt5474 = Static349.anInt6360;
		return local98;
	}

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "(I)I")
	@Override
	protected int method4596() {
		return this.anInt5547;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!ha;B)Z")
	private boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(13) int local13 = arg0;
		@Pc(17) Class167 local17 = this.method4580();
		@Pc(32) Class175 local32 = super.anInt5482 != -1 && super.anInt5475 == 0 ? Static591.aClass66_2.method1768(super.anInt5482) : null;
		@Pc(53) Class175 local53 = super.anInt5479 == -1 || this.aBoolean473 || super.aBoolean470 && local32 != null ? null : Static591.aClass66_2.method1768(super.anInt5479);
		@Pc(56) int local56 = local17.anInt4886;
		@Pc(59) int local59 = local17.anInt4902;
		if (local56 != 0 || local59 != 0 || local17.anInt4885 != 0 || local17.anInt4880 != 0) {
			arg0 |= 0x7;
		}
		@Pc(78) int local78 = super.aClass306_7.method7389();
		@Pc(101) boolean local101 = super.aByte78 != 0 && Static26.anInt350 >= super.anInt5490 && Static26.anInt350 < super.anInt5495;
		if (local101) {
			arg0 |= 0x80000;
		}
		@Pc(145) Class153 local145 = super.aClass153Array3[0] = this.aClass213_1.method5203(local53, super.anInt5504, super.anIntArray306, local32, Static231.aClass19_2, super.anInt5498, arg1, Static161.aClass237_3, Static619.aClass94_2, arg0, super.anInt5477, super.aClass321Array3, Static110.aClass105_1, super.anInt5493, Static299.aClass286_2, super.anInt5456, local78, super.anInt5499, Static591.aClass66_2);
		@Pc(148) int local148 = Static559.method7737();
		if (Static631.anInt10279 < 96 && local148 > 50) {
			Static486.method6993();
		}
		if (Static560.aClass187_13 != Static217.aClass187_7 && local148 < 50) {
			@Pc(179) int local179 = 50 - local148;
			while (Static59.anInt912 < local179) {
				Static171.aByteArrayArray10[Static59.anInt912] = new byte[102400];
				Static59.anInt912++;
			}
			while (local179 < Static59.anInt912) {
				Static59.anInt912--;
				Static171.aByteArrayArray10[Static59.anInt912] = null;
			}
		} else if (Static560.aClass187_13 != Static217.aClass187_7) {
			Static59.anInt912 = 0;
			Static171.aByteArrayArray10 = new byte[50][];
		}
		if (local145 == null) {
			return false;
		}
		super.anInt5516 = local145.fa();
		super.anInt5501 = local145.ma();
		this.method4593(local145);
		if (local56 == 0 && local59 == 0) {
			this.method4600(0, this.method4599() << 9, local78, 0, this.method4599() << 9);
		} else {
			this.method4600(local17.anInt4887, local56, local78, local17.anInt4915, local59);
			if (super.anInt5458 != 0) {
				local145.FA(super.anInt5458);
			}
			if (super.anInt5466 != 0) {
				local145.VA(super.anInt5466);
			}
			if (super.anInt5486 != 0) {
				local145.H(0, super.anInt5486, 0);
			}
		}
		if (local101) {
			local145.method8597(super.aByte81, super.lb, super.aByte80, super.aByte78 & 0xFF);
		}
		if (!this.aBoolean473) {
			this.method4587(local13, local78, local17, local56, arg1, local59);
		}
		return true;
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)I")
	@Override
	public int method4599() {
		return this.aClass213_1 == null || this.aClass213_1.anInt6255 == -1 ? super.method4599() : Static231.aClass19_2.method274(this.aClass213_1.anInt6255).anInt3851;
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method4612() {
		return this.aString45;
	}
}
