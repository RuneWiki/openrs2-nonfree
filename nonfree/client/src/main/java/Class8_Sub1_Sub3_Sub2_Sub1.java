import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class8_Sub1_Sub3_Sub2_Sub1 extends Class8_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ic", name = "Td", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!ic", name = "rd", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!ic", name = "Pd", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!ic", name = "Vc", descriptor = "Lclient!ee;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!ic", name = "vd", descriptor = "I")
	public int anInt4214;

	@OriginalMember(owner = "client!ic", name = "bd", descriptor = "I")
	private int anInt4215;

	@OriginalMember(owner = "client!ic", name = "gd", descriptor = "I")
	public int anInt4185 = 0;

	@OriginalMember(owner = "client!ic", name = "Ad", descriptor = "B")
	private byte aByte61 = 0;

	@OriginalMember(owner = "client!ic", name = "Jd", descriptor = "I")
	public int anInt4192 = -1;

	@OriginalMember(owner = "client!ic", name = "td", descriptor = "I")
	public int anInt4199 = -1;

	@OriginalMember(owner = "client!ic", name = "ld", descriptor = "I")
	public int anInt4197 = -1;

	@OriginalMember(owner = "client!ic", name = "Hd", descriptor = "I")
	public int anInt4198 = -1;

	@OriginalMember(owner = "client!ic", name = "Ld", descriptor = "I")
	public int anInt4205 = 0;

	@OriginalMember(owner = "client!ic", name = "zd", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ic", name = "Sc", descriptor = "I")
	public int anInt4190 = 0;

	@OriginalMember(owner = "client!ic", name = "Ed", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!ic", name = "Nd", descriptor = "I")
	public int anInt4210 = -1;

	@OriginalMember(owner = "client!ic", name = "Zc", descriptor = "I")
	public int anInt4203 = -1;

	@OriginalMember(owner = "client!ic", name = "od", descriptor = "B")
	private byte aByte62 = 0;

	@OriginalMember(owner = "client!ic", name = "Bd", descriptor = "I")
	public int anInt4201 = -1;

	@OriginalMember(owner = "client!ic", name = "ud", descriptor = "Z")
	public boolean aBoolean328 = false;

	@OriginalMember(owner = "client!ic", name = "Cd", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!ic", name = "Id", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!ic", name = "id", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!ic", name = "qd", descriptor = "I")
	public int anInt4209 = 255;

	@OriginalMember(owner = "client!ic", name = "Ud", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!ic", name = "Kd", descriptor = "I")
	public int anInt4223 = 0;

	@OriginalMember(owner = "client!ic", name = "fd", descriptor = "I")
	public int anInt4224 = -1;

	@OriginalMember(owner = "client!ic", name = "Yc", descriptor = "I")
	public int anInt4218 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	@Override
	public int method5993() {
		return this.aClass100_1 == null || this.aClass100_1.anInt2158 == -1 ? super.method5993() : Static325.aClass231_1.method5363(this.aClass100_1.anInt2158, 2).anInt6248;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass100_1 == null || !super.aBoolean545 && !this.method3609(0, arg1)) {
			return;
		}
		@Pc(26) Class203 local26 = arg1.method7672();
		local26.method8331(super.aClass270_7.method6422(5));
		local26.method8335(super.anInt10355, super.anInt10357 - 5, super.anInt10363);
		this.method5998(arg1, super.aBoolean545, local26, super.aClass164Array3);
		for (@Pc(53) int local53 = arg0; super.aClass164Array3.length > local53; local53++) {
			super.aClass164Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3599() {
		@Pc(7) String local7 = "";
		if (Static389.aStringArray45 != null) {
			local7 = local7 + Static389.aStringArray45[this.aByte63];
		}
		@Pc(39) int[] local39;
		if (this.aByte61 == 1 && Static110.anIntArray98 != null) {
			local39 = Static110.anIntArray98;
		} else {
			local39 = Static211.anIntArray199;
		}
		if (local39 != null && local39[this.aByte63] != -1) {
			@Pc(62) Class200 local62 = Static102.aClass156_20.method3083(local39[this.aByte63]);
			if (local62.aChar4 == 's') {
				local7 = local7 + local62.method4720(this.aByte62 & 0xFF);
			} else {
				Static405.method5934("gdn1", new Throwable());
				local39[this.aByte63] = -1;
			}
		}
		local7 = local7 + this.aString61;
		if (Static432.aStringArray50 != null) {
			local7 = local7 + Static432.aStringArray50[this.aByte63];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(B)Z")
	public boolean method3600() {
		return this.aClass100_1 != null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		return arg1 < 65 ? null : null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIBI)V")
	public void method3601(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7023 != -1 && Static158.aClass317_1.method7882(super.anInt7023, 100).anInt3912 == 1) {
			super.anIntArray412 = null;
			super.anInt7023 = -1;
		}
		for (@Pc(30) int local30 = 0; local30 < super.aClass150Array3.length; local30++) {
			if (super.aClass150Array3[local30].anInt3303 != -1) {
				@Pc(50) Class160 local50 = Static421.aClass385_2.method9166(super.aClass150Array3[local30].anInt3303);
				if (local50.aBoolean288 && local50.anInt3635 != -1 && Static158.aClass317_1.method7882(local50.anInt3635, 100).anInt3912 == 1) {
					super.aClass150Array3[local30].anInt3303 = -1;
				}
			}
		}
		if (28 != 28) {
			this.anInt4205 = 58;
		}
		this.anInt4199 = -1;
		if (arg2 < 0 || arg2 >= Static544.anInt9261 || arg1 < 0 || arg1 >= Static282.anInt4887) {
			this.method3606(arg2, arg1);
		} else if (super.anIntArray414[0] >= 0 && Static544.anInt9261 > super.anIntArray414[0] && super.anIntArray415[0] >= 0 && super.anIntArray415[0] < Static282.anInt4887) {
			if (arg0 == 2) {
				Static476.method6936(arg2, arg1, this);
			}
			this.method3603(arg0, arg2, arg1);
		} else {
			this.method3606(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ha;IILclient!ka;IIIILclient!qq;)V")
	private void method3602(@OriginalArg(0) Class57 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class164 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class203 arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg5 * arg5;
		if (local11 < 262144 || arg3 < local11) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg4, (double) arg5) * 2607.5945876176133D - (double) super.aClass270_7.method6422(5)) & 0x3FFF;
		@Pc(60) Class164 local60 = Static262.method7570(super.anInt7033, arg0, local40, super.anInt7035, arg6, super.anInt6988);
		if (local60 != null) {
			arg0.C(false);
			local60.method9092(arg7, (Class8_Sub7) null, arg1, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBII)V")
	public void method3603(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7050 < 9) {
			super.anInt7050++;
		}
		for (@Pc(28) int local28 = super.anInt7050; local28 > 0; local28--) {
			super.anIntArray414[local28] = super.anIntArray414[local28 - 1];
			super.anIntArray415[local28] = super.anIntArray415[local28 - 1];
			super.aByteArray64[local28] = super.aByteArray64[local28 - 1];
		}
		super.anIntArray414[0] = arg1;
		super.anIntArray415[0] = arg2;
		super.aByteArray64[0] = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.method8895(96, -120, (Class57) null, (byte) 40);
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 == -38) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ib;)V")
	public void method3604(@OriginalArg(1) Class5_Sub23 arg0) {
		arg0.anInt9869 = 0;
		@Pc(19) int local19 = arg0.method8529();
		this.aByte61 = (byte) (local19 & 0x1);
		@Pc(28) boolean local28 = this.aBoolean330;
		this.aBoolean330 = (local19 & 0x2) != 0;
		@Pc(50) boolean local50 = (local19 & 0x4) != 0;
		@Pc(56) int local56 = super.method5993();
		this.method5987((local19 >> 3 & 0x7) + 1);
		this.aByte63 = (byte) (local19 >> 6 & 0x3);
		super.anInt10355 += this.method5993() - local56 << 8;
		super.anInt10363 += this.method5993() - local56 << 8;
		this.aByte62 = arg0.method8488();
		this.anInt4192 = arg0.method8488();
		this.anInt4203 = arg0.method8488();
		this.aBoolean327 = arg0.method8488() == 1;
		if (Static408.aClass201_8 == Static570.aClass201_10 && Static539.anInt9221 >= 2) {
			this.aBoolean327 = false;
		}
		this.anInt4223 = 0;
		@Pc(150) int local150 = -1;
		@Pc(155) int[] local155 = new int[Static269.aClass196_1.anIntArray290.length];
		@Pc(160) Class306[] local160 = new Class306[Static269.aClass196_1.anIntArray290.length];
		@Pc(165) Class204[] local165 = new Class204[Static269.aClass196_1.anIntArray290.length];
		@Pc(183) int local183;
		@Pc(197) int local197;
		@Pc(203) int local203;
		@Pc(252) int local252;
		for (@Pc(167) int local167 = 0; local167 < Static269.aClass196_1.anIntArray290.length; local167++) {
			if (Static269.aClass196_1.anIntArray290[local167] != 1) {
				local183 = arg0.method8529();
				if (local183 == 0) {
					local155[local167] = 0;
				} else {
					local197 = arg0.method8529();
					local203 = local197 + (local183 << 8);
					if (local167 == 0 && local203 == 65535) {
						local150 = arg0.method8519();
						this.anInt4223 = arg0.method8529();
						break;
					}
					if (local203 >= 32768) {
						local203 = Static646.anIntArray479[local203 - 32768];
						local155[local167] = local203 | 0x40000000;
						local165[local167] = Static201.aClass127_1.method2501(local203);
						local252 = local165[local167].anInt5696;
						if (local252 != 0) {
							this.anInt4223 = local252;
						}
					} else {
						local155[local167] = Integer.MIN_VALUE | local203 - 256;
					}
				}
			}
		}
		if (local150 == -1) {
			local183 = arg0.method8519();
			local197 = 0;
			for (local203 = 0; local203 < Static269.aClass196_1.anIntArray290.length; local203++) {
				if (Static269.aClass196_1.anIntArray290[local203] == 0) {
					if ((local183 & 0x1 << local197) != 0) {
						local160[local203] = Static311.method4729(arg0, local165[local203]);
					}
					local197++;
				}
			}
		}
		@Pc(340) int[] local340 = new int[5];
		for (local197 = 0; local197 < 5; local197++) {
			local203 = arg0.method8529();
			if (Static114.aShortArrayArrayArray1.length < 1 || local203 < 0 || Static114.aShortArrayArrayArray1[0][local197].length <= local203) {
				local203 = 0;
			}
			local340[local197] = local203;
		}
		this.anInt4215 = arg0.method8519();
		this.aString61 = arg0.method8497();
		this.aString62 = this.aString61;
		if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == this) {
			Static183.aString47 = this.aString61;
		}
		this.anInt4205 = arg0.method8529();
		if (local50) {
			this.anInt4218 = arg0.method8519();
			this.anInt4185 = this.anInt4205;
			if (this.anInt4218 == 65535) {
				this.anInt4218 = -1;
			}
			this.anInt4197 = -1;
		} else {
			this.anInt4218 = 0;
			this.anInt4185 = arg0.method8529();
			this.anInt4197 = arg0.method8529();
			if (this.anInt4197 == 255) {
				this.anInt4197 = -1;
			}
		}
		local203 = this.anInt4190;
		this.anInt4190 = arg0.method8529();
		@Pc(490) int local490;
		if (this.anInt4190 == 0) {
			Static593.method8591(this);
		} else {
			local252 = this.anInt4210;
			@Pc(487) int local487 = this.anInt4198;
			local490 = this.anInt4201;
			@Pc(493) int local493 = this.anInt4224;
			@Pc(496) int local496 = this.anInt4209;
			this.anInt4210 = arg0.method8519();
			this.anInt4198 = arg0.method8519();
			this.anInt4201 = arg0.method8519();
			this.anInt4224 = arg0.method8519();
			this.anInt4209 = arg0.method8529();
			if (this.aBoolean330 != local28 || local203 != this.anInt4190 || this.anInt4210 != local252 || local487 != this.anInt4198 || this.anInt4201 != local490 || this.anInt4224 != local493 || local496 != this.anInt4209) {
				Static554.method8007(this);
			}
		}
		if (this.aClass100_1 == null) {
			this.aClass100_1 = new Class100();
		}
		local252 = this.aClass100_1.anInt2158;
		@Pc(609) int[] local609 = this.aClass100_1.anIntArray124;
		this.aClass100_1.method1905(this.aByte61 == 1, local340, this.method5990(), local155, local150, local160);
		if (local150 != local252) {
			super.anInt10355 = (super.anIntArray414[0] << 9) + (this.method5993() << 8);
			super.anInt10363 = (super.anIntArray415[0] << 9) + (this.method5993() << 8);
		}
		if (super.anInt6994 == Static279.anInt4838 && local609 != null) {
			for (local490 = 0; local490 < local340.length; local490++) {
				if (local609[local490] != local340[local490]) {
					Static201.aClass127_1.method2500();
					break;
				}
			}
		}
		if (super.aClass8_Sub5_7 != null) {
			super.aClass8_Sub5_7.method4904();
		}
		if (super.anInt7008 == -1 || !super.aBoolean543) {
			return;
		}
		@Pc(728) Class101 local728 = this.method5991(124);
		if (!local728.method1912(super.anInt7008)) {
			super.aBoolean543 = false;
			super.anInt7008 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5990() {
		return this.anInt4215;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILclient!qq;ILclient!ha;Lclient!ka;)V")
	private void method3605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class203 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) Class164 arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg0 * arg0;
		if (local11 < 262144 || arg4 < local11) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D - (double) super.aClass270_7.method6422(5)) & 0x3FFF;
		@Pc(56) Class164 local56 = Static262.method7570(super.anInt7033, arg5, local44, super.anInt7035, arg2, super.anInt6988);
		if (local56 != null) {
			arg5.C(false);
			local56.method9073(arg3, (Class8_Sub7) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
	public void method3606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7050 = 0;
		super.anInt7049 = 0;
		super.anInt7052 = 0;
		super.anIntArray414[0] = arg0;
		super.anIntArray415[0] = arg1;
		@Pc(26) int local26 = this.method5993();
		super.anInt10363 = local26 * 256 + super.anIntArray415[0] * 512;
		super.anInt10355 = local26 * 256 + super.anIntArray414[0] * 512;
		if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == this) {
			Static277.method4082();
		}
		if (super.aClass8_Sub5_7 != null) {
			super.aClass8_Sub5_7.method4904();
		}
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(B)I")
	@Override
	public int method5992() {
		return -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass100_1 == null || !this.method3609(131072, arg2)) {
			return false;
		}
		@Pc(22) Class203 local22 = arg2.method7672();
		@Pc(27) int local27 = super.aClass270_7.method6422(5);
		local22.method8331(local27);
		local22.method8335(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(40) boolean local40 = false;
		@Pc(42) int local42 = 0;
		if (arg3 >= -43) {
			this.method8898(-92);
		}
		while (super.aClass164Array3.length > local42) {
			if (super.aClass164Array3[local42] != null && (Static565.aBoolean768 ? super.aClass164Array3[local42].method9069(arg1, arg0, local22, true, 0, Static243.anInt4189) : super.aClass164Array3[local42].method9093(arg1, arg0, local22, true, 0))) {
				local40 = true;
				break;
			}
			local42++;
		}
		super.aClass164Array3[0] = super.aClass164Array3[1] = super.aClass164Array3[2] = null;
		return local40;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method3608() {
		return this.aString62;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILclient!ha;)Z")
	private boolean method3609(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class101 local11 = this.method5991(123);
		@Pc(33) Class165 local33 = super.anInt7023 != -1 && super.anInt7045 == 0 ? Static158.aClass317_1.method7882(super.anInt7023, 100) : null;
		@Pc(60) Class165 local60 = super.anInt7008 == -1 || this.aBoolean326 || super.aBoolean543 && local33 != null ? null : Static158.aClass317_1.method7882(super.anInt7008, 100);
		@Pc(63) int local63 = local11.anInt2176;
		@Pc(66) int local66 = local11.anInt2173;
		if (local63 != 0 || local66 != 0 || local11.anInt2178 != 0 || local11.anInt2208 != 0) {
			arg0 |= 0x7;
		}
		@Pc(110) int local110 = super.aClass270_7.method6422(5);
		@Pc(134) boolean local134 = super.aByte118 != 0 && super.anInt7013 <= Static44.anInt740 && super.anInt7029 > Static44.anInt740;
		if (local134) {
			arg0 |= 0x80000;
		}
		@Pc(178) Class164 local178 = super.aClass164Array3[0] = this.aClass100_1.method1902(super.aClass10Array3, Static325.aClass231_1, arg1, local60, Static356.aClass325_2, super.anInt7002, 82, Static413.aClass118_1, local33, Static201.aClass127_1, super.anInt6978, Static133.aClass324_1, super.anIntArray408, super.anInt7028, local110, Static158.aClass317_1, super.anInt6979, super.anInt7006, super.anInt7044, arg0);
		@Pc(181) int local181 = Static568.method8179();
		if (Static329.anInt5875 < 96 && local181 > 50) {
			Static484.method7008();
		}
		if (Static570.aClass201_10 != Static408.aClass201_8 && local181 < 50) {
			@Pc(226) int local226 = 50 - local181;
			while (Static357.anInt6271 < local226) {
				Static138.aByteArrayArray3[Static357.anInt6271] = new byte[102400];
				Static357.anInt6271++;
			}
			while (local226 < Static357.anInt6271) {
				Static357.anInt6271--;
				Static138.aByteArrayArray3[Static357.anInt6271] = null;
			}
		} else if (Static570.aClass201_10 != Static408.aClass201_8) {
			Static357.anInt6271 = 0;
			Static138.aByteArrayArray3 = new byte[50][];
		}
		if (local178 == null) {
			return false;
		}
		super.anInt6993 = local178.fa();
		super.anInt7039 = local178.ma();
		this.method6000(local178, (byte) 30);
		if (local63 == 0 && local66 == 0) {
			this.method5985(0, local110, 0, this.method5993() << 9, this.method5993() << 9);
		} else {
			this.method5985(local11.anInt2189, local110, local11.anInt2204, local66, local63);
			if (super.anInt7033 != 0) {
				local178.FA(super.anInt7033);
			}
			if (super.anInt6988 != 0) {
				local178.VA(super.anInt6988);
			}
			if (super.anInt7035 != 0) {
				local178.H(0, super.anInt7035, 0);
			}
		}
		if (local134) {
			local178.method9082(super.aByte120, super.aByte121, super.aByte119, super.aByte118 & 0xFF);
		}
		if (!this.aBoolean326) {
			this.method5986(local63, local110, local7, local11, arg1, local66);
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass100_1 == null || !this.method3609(2048, arg1)) {
			return null;
		}
		@Pc(22) Class203 local22 = arg1.method7672();
		@Pc(29) int local29 = super.aClass270_7.method6422(arg0 ^ 0xFFFFFF9D);
		local22.method8331(local29);
		@Pc(47) Class174 local47 = Static260.aClass174ArrayArrayArray2[super.aByte145][super.anInt10355 >> Static611.anInt10115][super.anInt10363 >> Static611.anInt10115];
		if (local47 == null || local47.aClass8_Sub1_Sub1_1 == null) {
			super.anInt7016 = (int) ((float) super.anInt7016 - (float) super.anInt7016 / 10.0F);
		} else {
			@Pc(78) int local78 = super.anInt7016 - local47.aClass8_Sub1_Sub1_1.aShort4;
			super.anInt7016 = (int) ((float) super.anInt7016 - (float) local78 / 10.0F);
		}
		local22.method8335(super.anInt10355, -super.anInt7016 + super.anInt10357 - 20, super.anInt10363);
		@Pc(105) Class8_Sub10 local105 = null;
		super.aBoolean544 = false;
		if (Static637.aClass5_Sub20_31.aClass24_Sub19_1.method6612() == 1) {
			@Pc(120) Class101 local120 = this.method5991(arg0 + 211);
			if (local120.aBoolean190 && (this.aClass100_1.anInt2158 == -1 || Static325.aClass231_1.method5363(this.aClass100_1.anInt2158, arg0 + 106).aBoolean468)) {
				@Pc(166) Class165 local166 = super.anInt7023 != -1 && super.anInt7045 == 0 ? Static158.aClass317_1.method7882(super.anInt7023, 100) : null;
				@Pc(195) Class165 local195 = super.anInt7008 == -1 || this.aBoolean326 || super.aBoolean543 && local166 != null ? null : Static158.aClass317_1.method7882(super.anInt7008, arg0 + 204);
				@Pc(231) Class164 local231 = Static262.method7572(local29, local195 == null ? super.anInt7028 : super.anInt6978, 240, local195 == null ? local166 : local195, 1, super.aClass164Array3[0], 0, super.anInt7035, super.anInt7033, 160, arg1, super.anInt6988, 0, arg0 ^ 0x4C72);
				if (local231 != null) {
					local105 = Static213.method3056(true, 0, super.aClass164Array3.length + 1);
					super.aBoolean544 = true;
					arg1.C(false);
					if (Static565.aBoolean768) {
						local231.method9092(local22, local105.aClass8_Sub7Array1[super.aClass164Array3.length], Static243.anInt4189, 0);
					} else {
						local231.method9073(local22, local105.aClass8_Sub7Array1[super.aClass164Array3.length], 0);
					}
					arg1.C(true);
				}
			}
		}
		@Pc(288) int local288;
		if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == this) {
			for (local288 = Static598.aClass28Array1.length - 1; local288 >= 0; local288--) {
				@Pc(294) Class28 local294 = Static598.aClass28Array1[local288];
				if (local294 != null && local294.anInt501 != -1) {
					@Pc(331) int local331;
					if (local294.anInt500 == 1) {
						@Pc(319) Class5_Sub35 local319 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local294.anInt502, arg0 + 105);
						if (local319 != null) {
							@Pc(324) Class8_Sub1_Sub3_Sub2_Sub2 local324 = local319.aClass8_Sub1_Sub3_Sub2_Sub2_2;
							local331 = local324.anInt10355 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
							@Pc(338) int local338 = local324.anInt10363 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
							if (Static565.aBoolean768) {
								this.method3602(arg1, Static243.anInt4189, super.aClass164Array3[0], 92160000, local331, local338, local294.anInt501, local22);
							} else {
								this.method3605(local331, local338, local294.anInt501, local22, 92160000, arg1, super.aClass164Array3[0]);
							}
						}
					}
					@Pc(393) int local393;
					if (local294.anInt500 == 2) {
						@Pc(386) int local386 = local294.anInt503 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
						local393 = local294.anInt498 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
						local331 = local294.anInt504 << 9;
						local331 *= local331;
						if (Static565.aBoolean768) {
							this.method3602(arg1, Static243.anInt4189, super.aClass164Array3[0], local331, local386, local393, local294.anInt501, local22);
						} else {
							this.method3605(local386, local393, local294.anInt501, local22, local331, arg1, super.aClass164Array3[0]);
						}
					}
					if (local294.anInt500 == 10 && local294.anInt502 >= 0 && local294.anInt502 < Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1.length) {
						@Pc(463) Class8_Sub1_Sub3_Sub2_Sub1 local463 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local294.anInt502];
						if (local463 != null) {
							local393 = local463.anInt10355 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
							local331 = local463.anInt10363 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
							if (Static565.aBoolean768) {
								this.method3602(arg1, Static243.anInt4189, super.aClass164Array3[0], 92160000, local393, local331, local294.anInt501, local22);
							} else {
								this.method3605(local393, local331, local294.anInt501, local22, 92160000, arg1, super.aClass164Array3[0]);
							}
						}
					}
				}
			}
			local22.method8331(local29);
			local22.method8335(super.anInt10355, super.anInt10357, super.anInt10363);
		}
		local22.method8331(local29);
		local22.method8335(super.anInt10355, super.anInt10357 - super.anInt7016 - 5, super.anInt10363);
		if (local105 == null) {
			local105 = Static213.method3056(true, arg0 ^ 0xFFFFFF98, super.aClass164Array3.length);
		}
		this.method5998(arg1, false, local22, super.aClass164Array3);
		if (arg0 != -104) {
			Static243.anInt4196 = -85;
		}
		if (Static565.aBoolean768) {
			for (local288 = 0; local288 < super.aClass164Array3.length; local288++) {
				if (super.aClass164Array3[local288] != null) {
					super.aClass164Array3[local288].method9092(local22, local105.aClass8_Sub7Array1[local288], Static243.anInt4189, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local288 = 0; local288 < super.aClass164Array3.length; local288++) {
				if (super.aClass164Array3[local288] != null) {
					super.aClass164Array3[local288].method9073(local22, local105.aClass8_Sub7Array1[local288], Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass8_Sub5_7 != null) {
			@Pc(667) Class193 local667 = super.aClass8_Sub5_7.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local667, Static243.anInt4189);
			} else {
				arg1.method7728(local667);
			}
		}
		for (local288 = 0; super.aClass164Array3.length > local288; local288++) {
			if (super.aClass164Array3[local288] != null) {
				super.aBoolean544 |= super.aClass164Array3[local288].F();
			}
			super.aClass164Array3[local288] = null;
		}
		super.anInt6981 = Static287.anInt5060;
		return local105;
	}
}
