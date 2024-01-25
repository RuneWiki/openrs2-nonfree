import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class67_Sub3_Sub3_Sub2 extends Class67_Sub3_Sub3 {

	@OriginalMember(owner = "client!qa", name = "Ec", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!qa", name = "Qc", descriptor = "Lclient!nj;")
	public Class140 aClass140_2;

	@OriginalMember(owner = "client!qa", name = "Tc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!qa", name = "dd", descriptor = "I")
	private int anInt5096;

	@OriginalMember(owner = "client!qa", name = "Dc", descriptor = "I")
	public int anInt5077 = -1;

	@OriginalMember(owner = "client!qa", name = "Mc", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!qa", name = "Hc", descriptor = "B")
	private byte aByte61 = 0;

	@OriginalMember(owner = "client!qa", name = "Pc", descriptor = "I")
	public int anInt5085 = 255;

	@OriginalMember(owner = "client!qa", name = "Lc", descriptor = "I")
	public int anInt5082 = 0;

	@OriginalMember(owner = "client!qa", name = "Kc", descriptor = "I")
	public int anInt5081 = 0;

	@OriginalMember(owner = "client!qa", name = "Ic", descriptor = "I")
	public int anInt5080 = -1;

	@OriginalMember(owner = "client!qa", name = "cd", descriptor = "I")
	public int anInt5095 = 0;

	@OriginalMember(owner = "client!qa", name = "Jc", descriptor = "B")
	private byte aByte62 = 0;

	@OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
	public int anInt5104 = -1;

	@OriginalMember(owner = "client!qa", name = "kd", descriptor = "I")
	public int anInt5103 = -1;

	@OriginalMember(owner = "client!qa", name = "nd", descriptor = "I")
	public int anInt5106 = 0;

	@OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
	public int anInt5102 = -1;

	@OriginalMember(owner = "client!qa", name = "qd", descriptor = "I")
	public int anInt5109 = -1;

	@OriginalMember(owner = "client!qa", name = "Gc", descriptor = "I")
	public int anInt5079 = 0;

	@OriginalMember(owner = "client!qa", name = "pd", descriptor = "I")
	public int anInt5108 = -1;

	@OriginalMember(owner = "client!qa", name = "rd", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)Z")
	public boolean method4383() {
		return this.aClass140_2 != null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIII)V")
	public void method4384(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		super.method4376(arg2, arg3, this.method4368(), arg1, arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass140_2 == null || !this.method4388(65536, arg1)) {
			return true;
		}
		@Pc(24) Class61 local24 = arg1.method4979();
		@Pc(29) int local29 = super.aClass17_7.method204();
		local24.method3667(local29);
		local24.method3665(super.anInt6308, super.anInt6313, super.anInt6310);
		for (@Pc(42) int local42 = 0; super.aClass126Array3.length > local42; local42++) {
			if (super.aClass126Array3[local42] != null && super.aClass126Array3[local42].method3160(arg2, arg0, local24, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		if (this.aClass140_2 != null && (super.aBoolean332 || this.method4388(0, arg0))) {
			this.method4372(super.aBoolean332, arg0, super.aClass126Array3);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method4385() {
		@Pc(14) String local14 = "";
		if (Static272.aStringArray41 != null) {
			local14 = local14 + Static272.aStringArray41[this.aByte62];
		}
		@Pc(38) int[] local38;
		if (this.aByte63 == 1 && Static164.anIntArray205 != null) {
			local38 = Static164.anIntArray205;
		} else {
			local38 = Static84.anIntArray102;
		}
		if (local38 != null && local38[this.aByte62] != -1) {
			@Pc(58) Class11_Sub4_Sub19 local58 = Static155.method2502(local38[this.aByte62]);
			if (local58.aChar4 == 's') {
				local14 = local14 + local58.method5329(this.aByte61 & 0xFF);
			} else {
				Static38.method554(new Throwable(), "gdn1");
				local38[this.aByte62] = -1;
			}
		}
		local14 = local14 + this.aString51;
		if (Static192.aStringArray29 != null) {
			local14 = local14 + Static192.aStringArray29[this.aByte62];
		}
		return local14;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIB)V")
	public void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray391[0];
		@Pc(15) int local15 = super.anIntArray392[0];
		if (arg1 == 0) {
			local10--;
			local15++;
		}
		if (arg1 == 1) {
			local15++;
		}
		if (arg1 == 2) {
			local10++;
			local15++;
		}
		if (arg1 == 3) {
			local10--;
		}
		if (arg1 == 4) {
			local10++;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local15--;
		}
		if (arg1 == 7) {
			local15--;
			local10++;
		}
		if (super.anInt5013 != -1 && Static306.method5143(super.anInt5013).anInt2711 == 1) {
			super.anInt5013 = -1;
		}
		if (super.anInt5043 != -1) {
			@Pc(85) Class213 local85 = Static89.method1296(super.anInt5043);
			if (local85.aBoolean424 && local85.anInt6649 != -1 && Static306.method5143(local85.anInt6649).anInt2711 == 1) {
				super.anInt5043 = -1;
			}
		}
		if (super.anInt5074 < 9) {
			super.anInt5074++;
		}
		for (@Pc(117) int local117 = super.anInt5074; local117 > 0; local117--) {
			super.anIntArray391[local117] = super.anIntArray391[local117 - 1];
			super.anIntArray392[local117] = super.anIntArray392[local117 - 1];
			super.aByteArray87[local117] = super.aByteArray87[local117 - 1];
		}
		super.anIntArray391[0] = local10;
		super.aByteArray87[0] = (byte) arg0;
		super.anIntArray392[0] = local15;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return super.anInt5011;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	@Override
	protected int method4373() {
		return this.anInt5096;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass140_2 == null || !this.method4388(1024, arg0)) {
			return null;
		}
		@Pc(19) Class61 local19 = arg0.method4979();
		@Pc(24) int local24 = super.aClass17_7.method204();
		local19.method3667(local24);
		local19.method3665(super.anInt6308, super.anInt6313, super.anInt6310);
		@Pc(38) float local38 = arg0.method4981();
		@Pc(41) float local41 = arg0.method4922();
		if (Static190.aBoolean248) {
			@Pc(47) Class55 local47 = this.method4374();
			if (local47.aBoolean69 && (this.aClass140_2.anInt4279 == -1 || Static156.method2516(this.aClass140_2.anInt4279).aBoolean120)) {
				@Pc(81) Class111 local81 = super.anInt5013 != -1 && super.anInt5001 == 0 ? Static306.method5143(super.anInt5013) : null;
				@Pc(101) Class111 local101 = super.anInt5040 == -1 || this.aBoolean334 || super.aBoolean328 && local81 != null ? null : Static306.method5143(super.anInt5040);
				@Pc(135) Class126 local135 = Static258.method4485(super.anInt5052, super.aClass126Array3[0], 1, arg0, 0, 160, 0, super.aBoolean329, local101 == null ? super.anInt5060 : super.anInt5021, super.anInt5057, local101 == null ? local81 : local101, local24, 240, super.anInt5004);
				if (local135 != null) {
					arg0.method4986(local38, local41 - 128.0F);
					arg0.method4995(false);
					local135.method3139(local19, null, 0);
					arg0.method4995(true);
				}
			}
		}
		if (Static156.aClass67_Sub3_Sub3_Sub2_2 == this) {
			arg0.method4986(local38, local41 - 144.0F);
			local19.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
			for (@Pc(176) int local176 = Static23.aClass119Array1.length - 1; local176 >= 0; local176--) {
				@Pc(182) Class119 local182 = Static23.aClass119Array1[local176];
				if (local182 != null && local182.anInt3335 != -1) {
					@Pc(238) int local238;
					@Pc(227) int local227;
					if (local182.anInt3328 == 1 && local182.anInt3336 >= 0 && Static356.aClass67_Sub3_Sub3_Sub1Array1.length > local182.anInt3336) {
						@Pc(214) Class67_Sub3_Sub3_Sub1 local214 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local182.anInt3336];
						if (local214 != null) {
							local227 = local214.anInt6308 / 32 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 / 32;
							local238 = local214.anInt6310 / 32 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 / 32;
							this.method4389(local182.anInt3335, local19, arg0, local238, super.aClass126Array3[0], 360000, local227);
						}
					}
					if (local182.anInt3328 == 2) {
						@Pc(271) int local271 = (local182.anInt3330 - Static182.anInt3662) * 4 + 2 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 / 32;
						local227 = (local182.anInt3337 - Static169.anInt6312) * 4 + 2 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 / 32;
						local238 = local182.anInt3333 * 4;
						local238 *= local238;
						this.method4389(local182.anInt3335, local19, arg0, local227, super.aClass126Array3[0], local238, local271);
					}
					if (local182.anInt3328 == 10 && local182.anInt3336 >= 0 && Static105.aClass67_Sub3_Sub3_Sub2Array1.length > local182.anInt3336) {
						@Pc(331) Class67_Sub3_Sub3_Sub2 local331 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local182.anInt3336];
						if (local331 != null) {
							local227 = local331.anInt6308 / 32 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 / 32;
							local238 = local331.anInt6310 / 32 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 / 32;
							this.method4389(local182.anInt3335, local19, arg0, local238, super.aClass126Array3[0], 360000, local227);
						}
					}
				}
			}
			local19.method3667(local24);
			local19.method3665(super.anInt6308, super.anInt6313, super.anInt6310);
		}
		arg0.method4986(local38, local41);
		@Pc(395) Class10_Sub1 local395 = Static55.method830(super.aClass126Array3.length);
		if (super.aClass10_Sub2_6 == null) {
			arg0.method4994(super.aClass126Array3, local19, local395.aClass10_Sub8Array1, Static156.aClass67_Sub3_Sub3_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(417) Class136 local417 = super.aClass10_Sub2_6.method981();
			arg0.method5004(super.aClass126Array3, local417, local19, local395.aClass10_Sub8Array1, Static156.aClass67_Sub3_Sub3_Sub2_2 == this ? 1 : 0);
		}
		this.method4372(false, arg0, super.aClass126Array3);
		if (super.aClass126Array3[2] != null) {
			if (local24 != 0) {
				super.aClass126Array3[2].method3125(local24);
			}
			super.aClass126Array3[2].method3128(-super.anInt5068 + super.anInt6308, -super.anInt5073 + super.anInt6313, super.anInt6310 - super.anInt5064);
		}
		return local395;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLclient!uo;)Z")
	private boolean method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(16) Class55 local16 = this.method4374();
		@Pc(34) Class111 local34 = super.anInt5013 != -1 && super.anInt5001 == 0 ? Static306.method5143(super.anInt5013) : null;
		@Pc(53) Class111 local53 = super.anInt5040 == -1 || this.aBoolean334 || super.aBoolean328 && local34 != null ? null : Static306.method5143(super.anInt5040);
		@Pc(56) int local56 = local16.anInt1183;
		@Pc(59) int local59 = local16.anInt1206;
		if (local56 != 0 || local59 != 0 || local16.anInt1209 != 0 || local16.anInt1175 != 0) {
			arg0 |= 0x7;
		}
		super.aClass126Array3[0] = this.aClass140_2.method3754(super.anInt5015, arg0, local34, super.anInt5018, super.aClass72Array3, super.anInt5060, arg1, super.anInt5021, super.anInt5006, super.anInt5005, local53);
		@Pc(103) int local103 = Static119.method1793();
		if (Static355.anInt6753 < 96 && local103 > 50) {
			Static286.method4772();
		}
		@Pc(125) int local125;
		if (Static156.anInt2987 != 0 && local103 < 50) {
			local125 = 50 - local103;
			while (Static237.anInt4756 < local125) {
				Static168.aByteArrayArray23[Static237.anInt4756] = new byte[102400];
				Static237.anInt4756++;
			}
			while (local125 < Static237.anInt4756) {
				Static237.anInt4756--;
				Static168.aByteArrayArray23[Static237.anInt4756] = null;
			}
		} else if (Static156.anInt2987 != 0) {
			Static168.aByteArrayArray23 = new byte[50][];
			Static237.anInt4756 = 0;
		}
		if (super.aClass126Array3[0] == null) {
			return false;
		}
		super.anInt5011 = super.aClass126Array3[0].method3155();
		this.method4378(super.aClass126Array3[0]);
		local125 = super.aClass17_7.method204();
		super.anInt5052 = 0;
		super.anInt5057 = 0;
		super.anInt5004 = 0;
		if (local56 == 0 && local59 == 0) {
			this.method4366(local125, this.method4368() << 7, this.method4368() << 7);
		} else {
			this.method4366(local125, local59, local56);
			if (super.anInt5004 != 0) {
				super.aClass126Array3[0].method3145(super.anInt5004);
			}
			if (super.anInt5052 != 0) {
				super.aClass126Array3[0].method3156(super.anInt5052);
			}
			if (super.anInt5057 != 0) {
				super.aClass126Array3[0].method3128(0, super.anInt5057, 0);
			}
		}
		super.aClass126Array3[1] = null;
		if (!this.aBoolean334 && super.anInt5043 != -1 && super.anInt5039 != -1) {
			@Pc(288) Class213 local288 = Static89.method1296(super.anInt5043);
			@Pc(307) Class126 local307 = local288.method5646(super.anInt5039, arg1, local7 | (local288.aBoolean423 ? 7 : 2), super.anInt5058, super.anInt5007);
			if (local307 != null) {
				local307.method3128(0, -super.anInt5033, 0);
				if (local288.aBoolean423 && (local56 != 0 || local59 != 0)) {
					if (super.anInt5004 != 0) {
						local307.method3145(super.anInt5004);
					}
					if (super.anInt5052 != 0) {
						local307.method3156(super.anInt5052);
					}
					if (super.anInt5057 != 0) {
						local307.method3128(0, super.anInt5057, 0);
					}
				}
				super.aClass126Array3[1] = local307;
			}
		}
		super.aClass126Array3[2] = null;
		if (!this.aBoolean334 && super.anInterface7_3 != null) {
			if (Static293.anInt5807 >= super.anInt5067) {
				super.anInterface7_3 = null;
			}
			if (super.anInt5066 <= Static293.anInt5807 && Static293.anInt5807 < super.anInt5067) {
				@Pc(399) Class126 local399 = super.anInterface7_3.method5411(local7 | 0x7, arg1);
				if (local399 != null) {
					local399.method3128(super.anInt5068 - super.anInt6308, super.anInt5073 + -super.anInt6313, super.anInt5064 - super.anInt6310);
					if (local125 != 0) {
						local399.method3125(-local125 & 0x3FFF);
					}
					super.aClass126Array3[2] = local399;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ic;ILclient!uo;ILclient!mj;II)V")
	private void method4389(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) Class129 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class126 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg6 * arg6;
		if (local11 < 16 || local11 > arg5) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg6, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(48) Class126 local48 = Static232.method4149(super.anInt6308, local29, arg4, super.anInt5057, super.anInt6313, super.anInt5052, arg2, super.anInt5004, arg0, super.anInt6310);
		if (local48 != null) {
			arg2.method4995(false);
			local48.method3139(arg1, null, 0);
			arg2.method4995(true);
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I")
	@Override
	public int method4375() {
		return -1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kh;B)V")
	public void method4390(@OriginalArg(0) Class11_Sub25 arg0) {
		arg0.anInt6076 = 0;
		@Pc(12) int local12 = arg0.method5185();
		this.aByte63 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method4368();
		this.method4367((local12 >> 3 & 0x7) + 1);
		this.aByte62 = (byte) (local12 >> 6 & 0x3);
		super.anInt6308 += (this.method4368() - local44) * 64;
		super.anInt6310 += (this.method4368() - local44) * 64;
		this.aByte61 = arg0.method5175();
		this.anInt5080 = arg0.method5175();
		this.anInt5109 = arg0.method5175();
		@Pc(107) int local107 = -1;
		this.anInt5106 = 0;
		@Pc(113) int[] local113 = new int[12];
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(181) int local181;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method5185();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local133 = arg0.method5185();
				local140 = (local121 << 8) + local133;
				if (local115 == 0 && local140 == 65535) {
					local107 = arg0.method5187();
					this.anInt5106 = arg0.method5185();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static285.anIntArray440[local140 - 32768];
					local113[local115] = local140 | 0x40000000;
					local181 = Static283.method4717(local140).anInt5321;
					if (local181 != 0) {
						this.anInt5106 = local181;
					}
				} else {
					local113[local115] = Integer.MIN_VALUE | local140 - 256;
				}
			}
		}
		@Pc(206) int[] local206 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local140 = arg0.method5185();
			if (local140 < 0 || local140 >= Static229.aShortArrayArray12[local133].length) {
				local140 = 0;
			}
			local206[local133] = local140;
		}
		this.anInt5096 = arg0.method5187();
		this.aString51 = arg0.method5184();
		if (local29) {
			this.aString50 = arg0.method5184();
		} else {
			this.aString50 = this.aString51;
		}
		this.anInt5095 = arg0.method5185();
		if (local40) {
			this.anInt5082 = arg0.method5187();
			this.anInt5081 = this.anInt5095;
			this.anInt5104 = -1;
		} else {
			this.anInt5082 = 0;
			this.anInt5081 = arg0.method5185();
			this.anInt5104 = arg0.method5185();
			if (this.anInt5104 == 255) {
				this.anInt5104 = -1;
			}
		}
		local140 = this.anInt5079;
		this.anInt5079 = arg0.method5185();
		@Pc(335) int local335;
		if (this.anInt5079 == 0) {
			Static308.method5156(this);
		} else {
			local181 = this.anInt5103;
			@Pc(332) int local332 = this.anInt5102;
			local335 = this.anInt5077;
			@Pc(338) int local338 = this.anInt5108;
			@Pc(341) int local341 = this.anInt5085;
			this.anInt5103 = arg0.method5187();
			this.anInt5102 = arg0.method5187();
			this.anInt5077 = arg0.method5187();
			this.anInt5108 = arg0.method5187();
			this.anInt5085 = arg0.method5185();
			if (local140 != this.anInt5079 || local181 != this.anInt5103 || this.anInt5102 != local332 || this.anInt5077 != local335 || local338 != this.anInt5108 || local341 != this.anInt5085) {
				Static137.method2131(this);
			}
		}
		if (this.aClass140_2 == null) {
			this.aClass140_2 = new Class140();
		}
		local181 = this.aClass140_2.anInt4279;
		@Pc(433) int[] local433 = this.aClass140_2.anIntArray328;
		this.aClass140_2.method3762(local206, local107, local113, this.aByte63 == 1, this.method4373());
		if (local181 != local107) {
			super.anInt6308 = super.anIntArray391[0] * 128 + this.method4368() * 64;
			super.anInt6310 = super.anIntArray392[0] * 128 + this.method4368() * 64;
		}
		if (super.anInt5038 == 2047 && local433 != null) {
			for (local335 = 0; local335 < local206.length; local335++) {
				if (local433[local335] != local206[local335]) {
					Static193.method3530();
					break;
				}
			}
		}
		if (super.aClass10_Sub2_6 != null) {
			super.aClass10_Sub2_6.method988();
		}
		if (super.anInt5040 == -1 || !super.aBoolean328) {
			return;
		}
		@Pc(545) Class55 local545 = this.method4374();
		if (!local545.method944(super.anInt5040)) {
			super.anInt5040 = -1;
			super.aBoolean328 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4391() {
		return this.aString50;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)I")
	@Override
	public int method4368() {
		return this.aClass140_2 == null || this.aClass140_2.anInt4279 == -1 ? super.method4368() : Static156.method2516(this.aClass140_2.anInt4279).anInt1871;
	}
}
