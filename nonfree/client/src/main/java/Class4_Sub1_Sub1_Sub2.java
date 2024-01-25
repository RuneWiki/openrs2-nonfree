import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class4_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!pp", name = "Cc", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!pp", name = "Nc", descriptor = "Lclient!h;")
	public Class123 aClass123_1;

	@OriginalMember(owner = "client!pp", name = "Rc", descriptor = "I")
	public int anInt7152;

	@OriginalMember(owner = "client!pp", name = "bd", descriptor = "I")
	public int anInt7160;

	@OriginalMember(owner = "client!pp", name = "id", descriptor = "I")
	private int anInt7166;

	@OriginalMember(owner = "client!pp", name = "nd", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!pp", name = "Ac", descriptor = "B")
	private byte aByte68 = 0;

	@OriginalMember(owner = "client!pp", name = "Ec", descriptor = "I")
	public int anInt7140 = 0;

	@OriginalMember(owner = "client!pp", name = "Ic", descriptor = "I")
	public int anInt7144 = -1;

	@OriginalMember(owner = "client!pp", name = "Uc", descriptor = "I")
	public int anInt7155 = -1;

	@OriginalMember(owner = "client!pp", name = "Dc", descriptor = "I")
	public int anInt7139 = 0;

	@OriginalMember(owner = "client!pp", name = "Vc", descriptor = "Z")
	public boolean aBoolean497 = false;

	@OriginalMember(owner = "client!pp", name = "gd", descriptor = "I")
	public int anInt7164 = -1;

	@OriginalMember(owner = "client!pp", name = "yc", descriptor = "B")
	private byte aByte67 = 0;

	@OriginalMember(owner = "client!pp", name = "ed", descriptor = "Z")
	public boolean aBoolean499 = false;

	@OriginalMember(owner = "client!pp", name = "zc", descriptor = "I")
	public int anInt7137 = 0;

	@OriginalMember(owner = "client!pp", name = "Zc", descriptor = "I")
	public int anInt7159 = -1;

	@OriginalMember(owner = "client!pp", name = "ad", descriptor = "Z")
	public boolean aBoolean498 = false;

	@OriginalMember(owner = "client!pp", name = "Lc", descriptor = "I")
	public int anInt7147 = -1;

	@OriginalMember(owner = "client!pp", name = "pd", descriptor = "I")
	public int anInt7171 = 255;

	@OriginalMember(owner = "client!pp", name = "Bc", descriptor = "I")
	public int anInt7138 = -1;

	@OriginalMember(owner = "client!pp", name = "qd", descriptor = "I")
	public int anInt7172 = -1;

	@OriginalMember(owner = "client!pp", name = "Tc", descriptor = "I")
	public int anInt7154 = 0;

	@OriginalMember(owner = "client!pp", name = "hd", descriptor = "I")
	public int anInt7165 = -1;

	@OriginalMember(owner = "client!pp", name = "sd", descriptor = "B")
	private byte aByte69 = 0;

	@OriginalMember(owner = "client!pp", name = "td", descriptor = "I")
	public int anInt7174 = 0;

	@OriginalMember(owner = "client!pp", name = "vd", descriptor = "Z")
	public boolean aBoolean500 = false;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return super.anInt7093;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILclient!ba;Lclient!oa;IILclient!q;)V")
	private void method5911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class54 arg6) {
		@Pc(11) int local11 = arg5 * arg5 + arg0 * arg0;
		if (local11 < 262144 || local11 > arg1) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class20 local52 = Static272.method4498(arg4, super.anInt7099, super.anInt7108, arg2, local40, super.anInt7102);
		if (local52 != null) {
			arg4.method6880(false);
			local52.method7256(arg6, null, 0);
			arg4.method6880(true);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
	@Override
	public int method5899() {
		return -1;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	public void method5913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7134 = 0;
		super.anIntArray521[0] = arg0;
		super.anInt7132 = 0;
		super.anInt7133 = 0;
		super.anIntArray522[0] = arg1;
		@Pc(30) int local30 = this.method5892();
		super.anInt9542 = super.anIntArray521[0] * 512 + local30 * 256;
		super.anInt9540 = super.anIntArray522[0] * 512 + local30 * 256;
		if (Static328.aClass4_Sub1_Sub1_Sub2_2 == this) {
			Static425.method6109();
		}
		if (super.aClass98_Sub3_4 != null) {
			super.aClass98_Sub3_4.method4540();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZBI)V")
	public void method5914(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7085 != -1 && Static78.aClass298_2.method6521(super.anInt7085).anInt1541 == 1) {
			super.anInt7085 = -1;
			super.anIntArray519 = null;
		}
		@Pc(34) Class10 local34;
		if (super.anInt7069 != -1) {
			local34 = Static289.aClass66_7.method1652(super.anInt7069);
			if (local34.aBoolean21 && local34.anInt334 != -1 && Static78.aClass298_2.method6521(local34.anInt334).anInt1541 == 1) {
				super.anInt7069 = -1;
			}
		}
		if (super.anInt7124 != -1) {
			local34 = Static289.aClass66_7.method1652(super.anInt7124);
			if (local34.aBoolean21 && local34.anInt334 != -1 && Static78.aClass298_2.method6521(local34.anInt334).anInt1541 == 1) {
				super.anInt7124 = -1;
			}
		}
		this.anInt7172 = -1;
		if (arg2 < 0 || arg2 >= Static473.anInt8075 || arg0 < 0 || Static165.anInt6749 <= arg0) {
			this.method5913(arg2, arg0);
		} else if (super.anIntArray521[0] >= 0 && super.anIntArray521[0] < Static473.anInt8075 && super.anIntArray522[0] >= 0 && Static165.anInt6749 > super.anIntArray522[0]) {
			if (arg1 == 2) {
				Static350.method5333(arg2, this, arg0);
			}
			this.method5917(arg1, arg0, arg2);
		} else {
			this.method5913(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass123_1 == null || !this.method5919(131072, arg1)) {
			return false;
		}
		@Pc(27) Class54 local27 = arg1.method6851();
		@Pc(32) int local32 = super.aClass354_7.method7776();
		local27.a(local32);
		local27.G(super.anInt9542, super.anInt9541, super.anInt9540);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass20Array3.length; local47++) {
			if (super.aClass20Array3[local47] != null && super.aClass20Array3[local47].method7266(arg2, arg0, local27, true)) {
				local45 = true;
				break;
			}
		}
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
		return local45;
	}

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)I")
	@Override
	protected int method5897() {
		return this.anInt7166;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass123_1 == null || !this.method5919(2048, arg0)) {
			return null;
		}
		@Pc(27) Class54 local27 = arg0.method6851();
		@Pc(32) int local32 = super.aClass354_7.method7776();
		local27.a(local32);
		local27.G(super.anInt9542, super.anInt9541 - 20, super.anInt9540);
		@Pc(106) int local106;
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean685) {
			@Pc(52) Class118 local52 = this.method5891();
			if (local52.aBoolean250 && (this.aClass123_1.anInt3658 == -1 || Static577.aClass125_2.method3229(this.aClass123_1.anInt3658).aBoolean519)) {
				@Pc(84) Class57 local84 = super.anInt7085 != -1 && super.anInt7107 == 0 ? Static78.aClass298_2.method6521(super.anInt7085) : null;
				@Pc(104) Class57 local104 = super.anInt7100 == -1 || this.aBoolean499 || super.aBoolean495 && local84 != null ? null : Static78.aClass298_2.method6521(super.anInt7100);
				local106 = 0;
				if (super.anInt7074 != 0) {
					local106 = this.method5900();
				}
				@Pc(146) Class20 local146 = Static255.method4297(1, 0, 240, 0, super.anInt7099, arg0, super.anInt7108, super.aClass20Array3[0], super.anInt7102, local104 == null ? super.anInt7112 : super.anInt7120, local106, local32, 160, local104 == null ? local84 : local104);
				if (local146 != null) {
					arg0.method6880(false);
					local146.method7256(local27, null, 0);
					arg0.method6880(true);
				}
			}
		}
		if (Static328.aClass4_Sub1_Sub1_Sub2_2 == this) {
			local27.GA(super.anInt9542, super.anInt9541, super.anInt9540);
			for (@Pc(175) int local175 = Static434.aClass262Array1.length - 1; local175 >= 0; local175--) {
				@Pc(181) Class262 local181 = Static434.aClass262Array1[local175];
				if (local181 != null && local181.anInt7233 != -1) {
					@Pc(211) int local211;
					if (local181.anInt7229 == 1) {
						@Pc(200) Class6_Sub34 local200 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local181.anInt7228);
						if (local200 != null) {
							@Pc(205) Class4_Sub1_Sub1_Sub1 local205 = local200.aClass4_Sub1_Sub1_Sub1_2;
							local211 = local205.anInt9542 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
							@Pc(218) int local218 = local205.anInt9540 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
							this.method5911(local211, 92160000, local181.anInt7233, super.aClass20Array3[0], arg0, local218, local27);
						}
					}
					if (local181.anInt7229 == 2) {
						@Pc(245) int local245 = local181.anInt7232 + 256 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
						local106 = local181.anInt7231 + 256 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
						local211 = local181.anInt7230 << 9;
						local211 *= local211;
						this.method5911(local245, local211, local181.anInt7233, super.aClass20Array3[0], arg0, local106, local27);
					}
					if (local181.anInt7229 == 10 && local181.anInt7228 >= 0 && local181.anInt7228 < Static588.aClass4_Sub1_Sub1_Sub2Array3.length) {
						@Pc(297) Class4_Sub1_Sub1_Sub2 local297 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local181.anInt7228];
						if (local297 != null) {
							local106 = local297.anInt9542 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
							local211 = local297.anInt9540 - Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
							this.method5911(local106, 92160000, local181.anInt7233, super.aClass20Array3[0], arg0, local211, local27);
						}
					}
				}
			}
			local27.a(local32);
			local27.G(super.anInt9542, super.anInt9541, super.anInt9540);
		}
		local27.a(local32);
		local27.G(super.anInt9542, super.anInt9541 - 5, super.anInt9540);
		@Pc(358) Class98_Sub8 local358 = Static348.method5326(super.aClass20Array3.length);
		this.method5896(arg0, false, super.aClass20Array3, local27);
		if (super.aClass98_Sub3_4 == null) {
			arg0.method6885(super.aClass20Array3, local27, local358.aClass98_Sub5Array1, Static328.aClass4_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(373) Class144 local373 = super.aClass98_Sub3_4.method4532();
			arg0.method6872(super.aClass20Array3, local373, local27, local358.aClass98_Sub5Array1, Static328.aClass4_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		}
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
		super.anInt7066 = Static534.anInt8855;
		return local358;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!ji;)V")
	public void method5915(@OriginalArg(1) Class6_Sub21 arg0) {
		arg0.anInt7338 = 0;
		@Pc(12) int local12 = arg0.method6069();
		this.aByte68 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean497;
		this.aBoolean497 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method5892();
		this.method5905((local12 >> 3 & 0x7) + 1);
		this.aByte67 = (byte) (local12 >> 6 & 0x3);
		super.anInt9542 += this.method5892() - local48 << 8;
		super.anInt9540 += this.method5892() - local48 << 8;
		this.aByte69 = arg0.method6055();
		this.anInt7164 = arg0.method6055();
		this.anInt7138 = arg0.method6055();
		this.anInt7137 = 0;
		@Pc(113) int local113 = -1;
		@Pc(116) int[] local116 = new int[12];
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(184) int local184;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = arg0.method6069();
			if (local124 == 0) {
				local116[local118] = 0;
			} else {
				local136 = arg0.method6069();
				local142 = local136 + (local124 << 8);
				if (local118 == 0 && local142 == 65535) {
					local113 = arg0.method6003();
					this.anInt7137 = arg0.method6069();
					break;
				}
				if (local142 >= 32768) {
					local142 = Static381.anIntArray494[local142 - 32768];
					local116[local118] = local142 | 0x40000000;
					local184 = Static444.aClass322_2.method7141(local142).anInt6551;
					if (local184 != 0) {
						this.anInt7137 = local184;
					}
				} else {
					local116[local118] = Integer.MIN_VALUE | local142 - 256;
				}
			}
		}
		@Pc(209) int[] local209 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local142 = arg0.method6069();
			if (Static336.aShortArrayArrayArray2.length < 1 || local142 < 0 || local142 >= Static336.aShortArrayArrayArray2[0][local136].length) {
				local142 = 0;
			}
			local209[local136] = local142;
		}
		this.anInt7166 = arg0.method6003();
		this.aString64 = arg0.method6044();
		this.aString63 = this.aString64;
		this.anInt7139 = arg0.method6069();
		if (local44) {
			this.anInt7154 = arg0.method6003();
			this.anInt7159 = -1;
			if (this.anInt7154 == 65535) {
				this.anInt7154 = -1;
			}
			this.anInt7140 = this.anInt7139;
		} else {
			this.anInt7154 = 0;
			this.anInt7140 = arg0.method6069();
			this.anInt7159 = arg0.method6069();
			if (this.anInt7159 == 255) {
				this.anInt7159 = -1;
			}
		}
		local142 = this.anInt7174;
		this.anInt7174 = arg0.method6069();
		@Pc(337) int local337;
		if (this.anInt7174 == 0) {
			Static294.method4727(this);
		} else {
			local184 = this.anInt7144;
			@Pc(334) int local334 = this.anInt7165;
			local337 = this.anInt7155;
			@Pc(340) int local340 = this.anInt7147;
			@Pc(343) int local343 = this.anInt7171;
			this.anInt7144 = arg0.method6003();
			this.anInt7165 = arg0.method6003();
			this.anInt7155 = arg0.method6003();
			this.anInt7147 = arg0.method6003();
			this.anInt7171 = arg0.method6069();
			if (local21 != this.aBoolean497 || this.anInt7174 != local142 || this.anInt7144 != local184 || this.anInt7165 != local334 || this.anInt7155 != local337 || local340 != this.anInt7147 || local343 != this.anInt7171) {
				Static249.method4260(this);
			}
		}
		if (this.aClass123_1 == null) {
			this.aClass123_1 = new Class123();
		}
		local184 = this.aClass123_1.anInt3658;
		@Pc(435) int[] local435 = this.aClass123_1.anIntArray214;
		this.aClass123_1.method3198(local113, this.aByte68 == 1, this.method5897(), local116, local209);
		if (local184 != local113) {
			super.anInt9542 = (super.anIntArray521[0] << 9) + (this.method5892() << 8);
			super.anInt9540 = (super.anIntArray522[0] << 9) + (this.method5892() << 8);
		}
		if (super.anInt7126 == Static272.anInt5214 && local435 != null) {
			for (local337 = 0; local337 < local209.length; local337++) {
				if (local209[local337] != local435[local337]) {
					Static444.aClass322_2.method7135();
					break;
				}
			}
		}
		if (super.aClass98_Sub3_4 != null) {
			super.aClass98_Sub3_4.method4540();
		}
		if (super.anInt7100 == -1 || !super.aBoolean495) {
			return;
		}
		@Pc(532) Class118 local532 = this.method5891();
		if (!local532.method3172(super.anInt7100)) {
			super.aBoolean495 = false;
			super.anInt7100 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method5916() {
		return this.aString63;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIII)V")
	public void method5917(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt7132 < 9) {
			super.anInt7132++;
		}
		for (@Pc(20) int local20 = super.anInt7132; local20 > 0; local20--) {
			super.anIntArray521[local20] = super.anIntArray521[local20 - 1];
			super.anIntArray522[local20] = super.anIntArray522[local20 - 1];
			super.aByteArray90[local20] = super.aByteArray90[local20 - 1];
		}
		super.anIntArray521[0] = arg2;
		super.aByteArray90[0] = arg0;
		super.anIntArray522[0] = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		if (this.aClass123_1 == null || !super.aBoolean496 && !this.method5919(0, arg0)) {
			return;
		}
		@Pc(20) Class54 local20 = arg0.method6851();
		local20.a(super.aClass354_7.method7776());
		local20.G(super.anInt9542, super.anInt9541 - 5, super.anInt9540);
		this.method5896(arg0, super.aBoolean496, super.aClass20Array3, local20);
		super.aClass20Array3[0] = super.aClass20Array3[1] = super.aClass20Array3[2] = super.aClass20Array3[3] = null;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)I")
	@Override
	public int method5892() {
		return this.aClass123_1 == null || this.aClass123_1.anInt3658 == -1 ? super.method5892() : Static577.aClass125_2.method3229(this.aClass123_1.anInt3658).anInt7439;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!oa;)Z")
	private boolean method5919(@OriginalArg(0) int arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(13) Class118 local13 = this.method5891();
		@Pc(31) Class57 local31 = super.anInt7085 != -1 && super.anInt7107 == 0 ? Static78.aClass298_2.method6521(super.anInt7085) : null;
		@Pc(51) Class57 local51 = super.anInt7100 == -1 || this.aBoolean499 || super.aBoolean495 && local31 != null ? null : Static78.aClass298_2.method6521(super.anInt7100);
		@Pc(54) int local54 = local13.anInt3601;
		@Pc(57) int local57 = local13.anInt3581;
		if (local54 != 0 || local57 != 0 || local13.anInt3580 != 0 || local13.anInt3586 != 0) {
			arg0 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte64 != 0 && Static312.anInt5688 >= super.anInt7125 && super.anInt7078 > Static312.anInt5688;
		if (local90) {
			arg0 |= 0x80000;
		}
		@Pc(131) Class20 local131 = super.aClass20Array3[0] = this.aClass123_1.method3204(arg0, Static444.aClass322_2, super.anInt7081, Static304.aClass333_1, super.anInt7112, super.anInt7054, local31, Static78.aClass298_2, Static577.aClass125_2, super.anInt7083, Static498.aClass101_1, Static333.aClass149_1, super.aClass286Array3, super.anInt7120, local51, super.anInt7101, arg1);
		@Pc(134) int local134 = Static529.method4041();
		if (Static11.anInt321 < 96 && local134 > 50) {
			Static66.method1306();
		}
		@Pc(167) int local167;
		if (Static580.aClass194_7 != Static542.aClass194_5 && local134 < 50) {
			local167 = 50 - local134;
			while (local167 > Static102.anInt1948) {
				Static371.aByteArrayArray21[Static102.anInt1948] = new byte[102400];
				Static102.anInt1948++;
			}
			while (local167 < Static102.anInt1948) {
				Static102.anInt1948--;
				Static371.aByteArrayArray21[Static102.anInt1948] = null;
			}
		} else if (Static580.aClass194_7 != Static542.aClass194_5) {
			Static371.aByteArrayArray21 = new byte[50][];
			Static102.anInt1948 = 0;
		}
		if (local131 == null) {
			return false;
		}
		super.anInt7093 = local131.DA();
		this.method5902(local131);
		local167 = super.aClass354_7.method7776();
		if (local54 == 0 && local57 == 0) {
			this.method5893(this.method5892() << 9, local167, this.method5892() << 9, 0, 0);
		} else {
			this.method5893(local54, local167, local57, local13.anInt3587, local13.anInt3591);
			if (super.anInt7108 != 0) {
				local131.AA(super.anInt7108);
			}
			if (super.anInt7099 != 0) {
				local131.v(super.anInt7099);
			}
			if (super.anInt7102 != 0) {
				local131.m(0, super.anInt7102, 0);
			}
		}
		if (local90) {
			local131.method7260(super.aByte66, super.aByte63, super.aByte65, super.aByte64 & 0xFF);
		}
		@Pc(316) Class10 local316;
		@Pc(333) boolean local333;
		@Pc(335) int local335;
		@Pc(378) Class20 local378;
		if (this.aBoolean499 || super.anInt7069 == -1 || super.anInt7087 == -1) {
			super.aClass20Array3[1] = null;
		} else {
			local316 = Static289.aClass66_7.method1652(super.anInt7069);
			local333 = local316.aByte18 == 3 && (local54 != 0 || local57 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt7116 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt7097 != 0) {
					local335 |= 0x2;
				}
			}
			local378 = super.aClass20Array3[1] = local316.method256(local335, super.anInt7092, Static78.aClass298_2, super.anInt7109, super.anInt7087, arg1);
			if (local378 != null) {
				if (super.anInt7097 != 0) {
					local378.m(0, -super.anInt7097 << 2, 0);
				}
				if (super.anInt7116 != 0) {
					local378.I(super.anInt7116 * 2048);
				}
				if (local333) {
					if (super.anInt7108 != 0) {
						local378.AA(super.anInt7108);
					}
					if (super.anInt7099 != 0) {
						local378.v(super.anInt7099);
					}
					if (super.anInt7102 != 0) {
						local378.m(0, super.anInt7102, 0);
					}
				}
			}
		}
		if (this.aBoolean499 || super.anInt7124 == -1 || super.anInt7077 == -1) {
			super.aClass20Array3[3] = null;
		} else {
			local316 = Static289.aClass66_7.method1652(super.anInt7124);
			local333 = local316.aByte18 == 3 && (local54 != 0 || local57 != 0);
			local335 = local7;
			if (local333) {
				local335 = local7 | 0x7;
			} else {
				if (super.anInt7079 != 0) {
					local335 = local7 | 0x5;
				}
				if (super.anInt7115 != 0) {
					local335 |= 0x2;
				}
			}
			local378 = super.aClass20Array3[3] = local316.method254(local335, super.anInt7077, super.anInt7090, super.anInt7088, Static78.aClass298_2, arg1);
			if (local378 != null) {
				if (super.anInt7115 != 0) {
					local378.m(0, -super.anInt7115 << 2, 0);
				}
				if (super.anInt7079 != 0) {
					local378.I(super.anInt7079 * 2048);
				}
				if (local333) {
					if (super.anInt7108 != 0) {
						local378.AA(super.anInt7108);
					}
					if (super.anInt7099 != 0) {
						local378.v(super.anInt7099);
					}
					if (super.anInt7102 != 0) {
						local378.m(0, super.anInt7102, 0);
					}
				}
			}
		}
		super.aClass20Array3[2] = null;
		if (!this.aBoolean499 && super.aClass6_Sub29_3 != null) {
			if (super.aClass6_Sub29_3.anInt5268 <= Static312.anInt5688) {
				super.aClass6_Sub29_3 = null;
			} else if (super.aClass6_Sub29_3.anInt5275 <= Static312.anInt5688) {
				@Pc(610) Class20 local610 = super.aClass6_Sub29_3.method4565(local7 | 0x7, arg1);
				if (local610 != null) {
					local610.m(super.aClass6_Sub29_3.anInt5264 - super.anInt9542, super.aClass6_Sub29_3.anInt5272 + 5 + -super.anInt9541, -super.anInt9540 + super.aClass6_Sub29_3.anInt5278);
					if (local167 != 0) {
						local610.I(-local167 & 0x3FFF);
					}
					super.aClass20Array3[2] = local610;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(B)Z")
	public boolean method5920() {
		return this.aClass123_1 != null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5922() {
		@Pc(7) String local7 = "";
		if (Static281.aStringArray18 != null) {
			local7 = local7 + Static281.aStringArray18[this.aByte67];
		}
		@Pc(35) int[] local35;
		if (this.aByte68 == 1 && Static490.anIntArray603 != null) {
			local35 = Static490.anIntArray603;
		} else {
			local35 = Static246.anIntArray367;
		}
		if (local35 != null && local35[this.aByte67] != -1) {
			@Pc(56) Class49 local56 = Static594.aClass9_1.method207(local35[this.aByte67]);
			if (local56.aChar3 == 's') {
				local7 = local7 + local56.method1308(this.aByte69 & 0xFF);
			} else {
				Static256.method4328("gdn1", new Throwable());
				local35[this.aByte67] = -1;
			}
		}
		local7 = local7 + this.aString64;
		if (Static145.aStringArray7 != null) {
			local7 = local7 + Static145.aStringArray7[this.aByte67];
		}
		return local7;
	}
}
