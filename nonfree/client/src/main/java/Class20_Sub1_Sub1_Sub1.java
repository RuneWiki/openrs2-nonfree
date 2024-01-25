import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class20_Sub1_Sub1_Sub1 extends Class20_Sub1_Sub1 {

	@OriginalMember(owner = "client!av", name = "Jc", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!av", name = "Sc", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!av", name = "ed", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!av", name = "hd", descriptor = "Lclient!pf;")
	public Class225 aClass225_1;

	@OriginalMember(owner = "client!av", name = "vd", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!av", name = "Cd", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!av", name = "Oc", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!av", name = "Rc", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!av", name = "Yc", descriptor = "I")
	public int anInt662 = 0;

	@OriginalMember(owner = "client!av", name = "dd", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!av", name = "Qc", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!av", name = "jd", descriptor = "I")
	public int anInt671 = -1;

	@OriginalMember(owner = "client!av", name = "Pc", descriptor = "I")
	public int anInt657 = -1;

	@OriginalMember(owner = "client!av", name = "pd", descriptor = "I")
	public int anInt677 = -1;

	@OriginalMember(owner = "client!av", name = "Gc", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!av", name = "nd", descriptor = "I")
	public int anInt675 = 0;

	@OriginalMember(owner = "client!av", name = "od", descriptor = "I")
	public int anInt676 = -1;

	@OriginalMember(owner = "client!av", name = "td", descriptor = "I")
	public int anInt681 = 255;

	@OriginalMember(owner = "client!av", name = "Xc", descriptor = "I")
	public int anInt661 = 0;

	@OriginalMember(owner = "client!av", name = "xd", descriptor = "I")
	public int anInt683 = -1;

	@OriginalMember(owner = "client!av", name = "fd", descriptor = "I")
	public int anInt668 = 0;

	@OriginalMember(owner = "client!av", name = "wd", descriptor = "B")
	private byte aByte17 = 0;

	@OriginalMember(owner = "client!av", name = "Ad", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!av", name = "ud", descriptor = "I")
	public int anInt682 = 0;

	@OriginalMember(owner = "client!av", name = "Wc", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!av", name = "Dd", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBII)V")
	public void method721(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt9035 < 9) {
			super.anInt9035++;
		}
		for (@Pc(24) int local24 = super.anInt9035; local24 > 0; local24--) {
			super.anIntArray780[local24] = super.anIntArray780[local24 - 1];
			super.anIntArray781[local24] = super.anIntArray781[local24 - 1];
			super.aByteArray116[local24] = super.aByteArray116[local24 - 1];
		}
		super.anIntArray780[0] = arg2;
		super.aByteArray116[0] = arg1;
		super.anIntArray781[0] = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIILclient!r;Lclient!qa;Lclient!m;)V")
	private void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) Class4 arg5, @OriginalArg(7) Class128 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 < 16384 || arg1 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg0, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class97 local47 = Static421.method6582(local35, super.anInt8987, super.anInt9012, super.anInt9013, arg5, arg3);
		if (local47 != null) {
			arg5.method7214(false);
			local47.method6773(arg6, null, 0);
			arg5.method7214(true);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!os;)V")
	public void method723(@OriginalArg(1) Class1_Sub17 arg0) {
		arg0.anInt4872 = 0;
		@Pc(12) int local12 = arg0.method4487();
		this.aByte16 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(43) int local43 = super.method7808();
		this.method7810((local12 >> 3 & 0x7) + 1);
		this.aByte17 = (byte) (local12 >> 6 & 0x3);
		super.anInt8954 += this.method7808() - local43 << 6;
		super.anInt8949 += this.method7808() - local43 << 6;
		this.aByte15 = arg0.method4482();
		this.anInt666 = arg0.method4482();
		this.anInt686 = arg0.method4482();
		this.anInt662 = 0;
		@Pc(117) int local117 = -1;
		@Pc(120) int[] local120 = new int[12];
		@Pc(140) int local140;
		@Pc(146) int local146;
		@Pc(186) int local186;
		for (@Pc(122) int local122 = 0; local122 < 12; local122++) {
			@Pc(128) int local128 = arg0.method4487();
			if (local128 == 0) {
				local120[local122] = 0;
			} else {
				local140 = arg0.method4487();
				local146 = local140 + (local128 << 8);
				if (local122 == 0 && local146 == 65535) {
					local117 = arg0.method4494();
					this.anInt662 = arg0.method4487();
					break;
				}
				if (local146 >= 32768) {
					local146 = Static388.anIntArray669[local146 - 32768];
					local120[local122] = local146 | 0x40000000;
					local186 = Static181.aClass316_1.method8107(local146).anInt5413;
					if (local186 != 0) {
						this.anInt662 = local186;
					}
				} else {
					local120[local122] = Integer.MIN_VALUE | local146 - 256;
				}
			}
		}
		@Pc(208) int[] local208 = new int[5];
		for (local140 = 0; local140 < 5; local140++) {
			local146 = arg0.method4487();
			if (local146 < 0 || Static407.aShortArrayArray8[local140].length <= local146) {
				local146 = 0;
			}
			local208[local140] = local146;
		}
		this.anInt667 = arg0.method4494();
		this.aString12 = arg0.method4491();
		if (local29) {
			this.aString13 = arg0.method4491();
		} else {
			this.aString13 = this.aString12;
		}
		this.anInt668 = arg0.method4487();
		if (local37) {
			this.anInt675 = arg0.method4494();
			this.anInt676 = -1;
			this.anInt682 = this.anInt668;
		} else {
			this.anInt675 = 0;
			this.anInt682 = arg0.method4487();
			this.anInt676 = arg0.method4487();
			if (this.anInt676 == 255) {
				this.anInt676 = -1;
			}
		}
		local146 = this.anInt661;
		this.anInt661 = arg0.method4487();
		@Pc(330) int local330;
		if (this.anInt661 == 0) {
			Static444.method6883(this);
		} else {
			local186 = this.anInt683;
			@Pc(327) int local327 = this.anInt687;
			local330 = this.anInt677;
			@Pc(333) int local333 = this.anInt671;
			@Pc(336) int local336 = this.anInt681;
			this.anInt683 = arg0.method4494();
			this.anInt687 = arg0.method4494();
			this.anInt677 = arg0.method4494();
			this.anInt671 = arg0.method4494();
			this.anInt681 = arg0.method4487();
			if (this.anInt661 != local146 || this.anInt683 != local186 || local327 != this.anInt687 || local330 != this.anInt677 || this.anInt671 != local333 || this.anInt681 != local336) {
				Static438.method6792(this);
			}
		}
		if (this.aClass225_1 == null) {
			this.aClass225_1 = new Class225();
		}
		local186 = this.aClass225_1.anInt6650;
		@Pc(421) int[] local421 = this.aClass225_1.anIntArray647;
		this.aClass225_1.method5970(this.aByte16 == 1, local208, this.method7822(), local120, local117);
		if (local186 != local117) {
			super.anInt8954 = (super.anIntArray780[0] << 7) + (this.method7808() << 6);
			super.anInt8949 = (super.anIntArray781[0] << 7) + (this.method7808() << 6);
		}
		if (super.anInt8969 == Static16.anInt9513 && local421 != null) {
			for (local330 = 0; local330 < local208.length; local330++) {
				if (local208[local330] != local421[local330]) {
					Static181.aClass316_1.method8105();
					break;
				}
			}
		}
		if (super.aClass46_Sub7_6 != null) {
			super.aClass46_Sub7_6.method7415();
		}
		if (super.anInt9030 == -1 || !super.aBoolean677) {
			return;
		}
		@Pc(523) Class299 local523 = this.method7819();
		if (!local523.method7701(super.anInt9030)) {
			super.aBoolean677 = false;
			super.anInt9030 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return super.anInt8977;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method724() {
		@Pc(7) String local7 = "";
		if (Static520.aStringArray39 != null) {
			local7 = local7 + Static520.aStringArray39[this.aByte17];
		}
		@Pc(29) int[] local29;
		if (this.aByte16 == 1 && Static490.anIntArray757 != null) {
			local29 = Static490.anIntArray757;
		} else {
			local29 = Static396.anIntArray680;
		}
		if (local29 != null && local29[this.aByte17] != -1) {
			@Pc(54) Class153 local54 = Static286.aClass249_1.method6540(local29[this.aByte17]);
			if (local54.aChar4 == 's') {
				local7 = local7 + local54.method4162(this.aByte15 & 0xFF);
			} else {
				Static25.method773(new Throwable(), "gdn1");
				local29[this.aByte17] = -1;
			}
		}
		local7 = local7 + this.aString12;
		if (Static486.aStringArray35 != null) {
			local7 = local7 + Static486.aStringArray35[this.aByte17];
		}
		return local7;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass225_1 == null || !this.method730(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class128 local19 = arg0.method7165();
		@Pc(24) int local24 = super.aClass209_7.method5706();
		local19.ma(local24);
		local19.TA(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(38) float local38 = arg0.P();
		@Pc(46) float local46 = arg0.ra();
		@Pc(112) int local112;
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean530) {
			@Pc(53) Class299 local53 = this.method7819();
			if (local53.aBoolean667 && (this.aClass225_1.anInt6650 == -1 || Static358.aClass95_1.method2362(this.aClass225_1.anInt6650).aBoolean619)) {
				@Pc(89) Class176 local89 = super.anInt9022 != -1 && super.anInt9009 == 0 ? Static35.aClass152_1.method4045(super.anInt9022) : null;
				@Pc(110) Class176 local110 = super.anInt9030 == -1 || this.aBoolean52 || super.aBoolean677 && local89 != null ? null : Static35.aClass152_1.method4045(super.anInt9030);
				local112 = 0;
				if (super.anInt8997 != 0) {
					local112 = this.method7816();
				}
				@Pc(152) Class97 local152 = Static270.method4818(local110 == null ? super.anInt8961 : super.anInt8973, local112, 0, local110 == null ? local89 : local110, 240, super.anInt9013, super.anInt8987, 0, super.aClass97Array3[0], 1, super.anInt9012, 160, local24, arg0);
				if (local152 != null) {
					arg0.la(local38, local46 - 128.0F);
					arg0.method7214(false);
					local152.method6773(local19, null, 0);
					arg0.method7214(true);
				}
			}
		}
		if (Static107.aClass20_Sub1_Sub1_Sub1_1 == this) {
			arg0.la(local38, local46 - 144.0F);
			local19.oa(super.anInt8954, super.anInt8947, super.anInt8949);
			for (@Pc(193) int local193 = Static261.aClass248Array1.length - 1; local193 >= 0; local193--) {
				@Pc(199) Class248 local199 = Static261.aClass248Array1[local193];
				if (local199 != null && local199.anInt7266 != -1) {
					@Pc(230) int local230;
					if (local199.anInt7271 == 1) {
						@Pc(218) Class1_Sub41 local218 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local199.anInt7267);
						if (local218 != null) {
							@Pc(223) Class20_Sub1_Sub1_Sub2 local223 = local218.aClass20_Sub1_Sub1_Sub2_2;
							local230 = local223.anInt8954 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
							@Pc(237) int local237 = local223.anInt8949 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949;
							this.method722(local230, 5760000, local237, local199.anInt7266, super.aClass97Array3[0], arg0, local19);
						}
					}
					if (local199.anInt7271 == 2) {
						@Pc(266) int local266 = local199.anInt7261 + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
						local112 = local199.anInt7264 + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949;
						local230 = local199.anInt7268 << 7;
						local230 *= local230;
						this.method722(local266, local230, local112, local199.anInt7266, super.aClass97Array3[0], arg0, local19);
					}
					if (local199.anInt7271 == 10 && local199.anInt7267 >= 0 && local199.anInt7267 < Static511.aClass20_Sub1_Sub1_Sub1Array1.length) {
						@Pc(318) Class20_Sub1_Sub1_Sub1 local318 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local199.anInt7267];
						if (local318 != null) {
							local112 = local318.anInt8954 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
							local230 = local318.anInt8949 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949;
							this.method722(local112, 5760000, local230, local199.anInt7266, super.aClass97Array3[0], arg0, local19);
						}
					}
				}
			}
			local19.ma(local24);
			local19.TA(super.anInt8954, super.anInt8947, super.anInt8949);
		}
		arg0.la(local38, local46);
		@Pc(372) Class46_Sub6 local372 = Static490.method7528(super.aClass97Array3.length);
		if (super.aClass46_Sub7_6 == null) {
			arg0.method7159(super.aClass97Array3, local19, local372.aClass46_Sub1Array1, Static107.aClass20_Sub1_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(379) Class158 local379 = super.aClass46_Sub7_6.method7408();
			arg0.method7175(super.aClass97Array3, local379, local19, local372.aClass46_Sub1Array1, Static107.aClass20_Sub1_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method7817(false, arg0, super.aClass97Array3);
		super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		super.anInt9017 = Static389.anInt6904;
		return local372;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method725() {
		return this.aString13;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)Z")
	public boolean method726() {
		return this.aClass225_1 != null;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBBI)V")
	public void method727(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt9022 != -1 && Static35.aClass152_1.method4045(super.anInt9022).anInt5285 == 1) {
			super.anInt9022 = -1;
		}
		@Pc(30) Class87 local30;
		if (super.anInt8970 != -1) {
			local30 = Static530.aClass195_2.method5439(super.anInt8970);
			if (local30.aBoolean193 && local30.anInt2314 != -1 && Static35.aClass152_1.method4045(local30.anInt2314).anInt5285 == 1) {
				super.anInt8970 = -1;
			}
		}
		if (super.anInt8967 != -1) {
			local30 = Static530.aClass195_2.method5439(super.anInt8967);
			if (local30.aBoolean193 && local30.anInt2314 != -1 && Static35.aClass152_1.method4045(local30.anInt2314).anInt5285 == 1) {
				super.anInt8967 = -1;
			}
		}
		this.anInt657 = -1;
		if (arg2 < 0 || Static237.anInt4563 <= arg2 || arg0 < 0 || arg0 >= Static373.anInt6694) {
			this.method729(arg2, arg0);
		} else if (super.anIntArray780[0] >= 0 && Static237.anInt4563 > super.anIntArray780[0] && super.anIntArray781[0] >= 0 && Static373.anInt6694 > super.anIntArray781[0]) {
			if (arg1 == 2) {
				Static465.method7067(arg0, this, arg2);
			}
			this.method721(arg0, arg1, arg2);
		} else {
			this.method729(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass225_1 == null || !this.method730(arg0, 131072)) {
			return false;
		}
		@Pc(21) Class128 local21 = arg0.method7165();
		@Pc(26) int local26 = super.aClass209_7.method5706();
		local21.ma(local26);
		local21.TA(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(48) boolean local48 = false;
		for (@Pc(50) int local50 = 0; local50 < super.aClass97Array3.length; local50++) {
			if (super.aClass97Array3[local50] != null && super.aClass97Array3[local50].method6785(arg1, arg2, local21, true)) {
				local48 = true;
				break;
			}
		}
		super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		return local48;
	}

	@OriginalMember(owner = "client!av", name = "k", descriptor = "(I)I")
	@Override
	public int method7813() {
		return -1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		if (this.aClass225_1 != null && (super.aBoolean680 || this.method730(arg0, 0))) {
			this.method7817(super.aBoolean680, arg0, super.aClass97Array3);
			super.aClass97Array3[0] = super.aClass97Array3[1] = super.aClass97Array3[2] = super.aClass97Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	public void method729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt9036 = 0;
		super.anInt9035 = 0;
		super.anIntArray780[0] = arg0;
		super.anInt9037 = 0;
		super.anIntArray781[0] = arg1;
		@Pc(26) int local26 = this.method7808();
		super.anInt8949 = super.anIntArray781[0] * 128 + local26 * 64;
		super.anInt8954 = super.anIntArray780[0] * 128 + local26 * 64;
		if (Static107.aClass20_Sub1_Sub1_Sub1_1 == this) {
			Static22.method601();
		}
		if (super.aClass46_Sub7_6 != null) {
			super.aClass46_Sub7_6.method7415();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method730(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(13) Class299 local13 = this.method7819();
		@Pc(29) Class176 local29 = super.anInt9022 != -1 && super.anInt9009 == 0 ? Static35.aClass152_1.method4045(super.anInt9022) : null;
		@Pc(50) Class176 local50 = super.anInt9030 == -1 || this.aBoolean52 || super.aBoolean677 && local29 != null ? null : Static35.aClass152_1.method4045(super.anInt9030);
		@Pc(53) int local53 = local13.anInt8820;
		@Pc(56) int local56 = local13.anInt8815;
		if (local53 != 0 || local56 != 0 || local13.anInt8822 != 0 || local13.anInt8838 != 0) {
			arg1 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte109 != 0 && super.anInt8990 <= Static445.anInt7791 && Static445.anInt7791 < super.anInt9007;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class97 local141 = super.aClass97Array3[0] = this.aClass225_1.method5976(super.anInt8974, Static358.aClass95_1, super.anInt8961, Static35.aClass152_1, super.anInt8993, local50, Static398.aClass167_1, super.anInt8973, Static181.aClass316_1, arg0, Static10.aClass179_1, arg1, Static417.aClass10_1, super.anInt8979, super.anInt9033, local29, super.aClass286Array3);
		@Pc(144) int local144 = Static449.method6960();
		if (Static520.anInt9181 < 96 && local144 > 50) {
			Static210.method3879();
		}
		@Pc(167) int local167;
		if (Static190.aClass139_1 != Static334.aClass139_4 && local144 < 50) {
			local167 = 50 - local144;
			while (Static291.anInt5559 < local167) {
				Static495.aByteArrayArray26[Static291.anInt5559] = new byte[102400];
				Static291.anInt5559++;
			}
			while (local167 < Static291.anInt5559) {
				Static291.anInt5559--;
				Static495.aByteArrayArray26[Static291.anInt5559] = null;
			}
		} else if (Static190.aClass139_1 != Static334.aClass139_4) {
			Static495.aByteArrayArray26 = new byte[50][];
			Static291.anInt5559 = 0;
		}
		if (local141 == null) {
			return false;
		}
		super.anInt8977 = local141.TA();
		this.method7815(local141);
		local167 = super.aClass209_7.method5706();
		if (local53 == 0 && local56 == 0) {
			this.method7818(this.method7808() << 7, 0, local167, this.method7808() << 7, 0);
		} else {
			this.method7818(local56, local13.anInt8819, local167, local53, local13.anInt8848);
			if (super.anInt9012 != 0) {
				local141.D(super.anInt9012);
			}
			if (super.anInt9013 != 0) {
				local141.b(super.anInt9013);
			}
			if (super.anInt8987 != 0) {
				local141.ca(0, super.anInt8987, 0);
			}
		}
		if (local94) {
			local141.method6779(super.aByte110, super.aByte112, super.aByte111, super.aByte109 & 0xFF);
		}
		@Pc(333) Class87 local333;
		@Pc(350) boolean local350;
		@Pc(352) int local352;
		@Pc(398) Class97 local398;
		if (this.aBoolean52 || super.anInt8970 == -1 || super.anInt9026 == -1) {
			super.aClass97Array3[1] = null;
		} else {
			local333 = Static530.aClass195_2.method5439(super.anInt8970);
			local350 = local333.aByte37 == 3 && (local53 != 0 || local56 != 0);
			local352 = local7;
			if (local350) {
				local352 = local7 | 0x7;
			} else {
				if (super.anInt9005 != 0) {
					local352 = local7 | 0x5;
				}
				if (super.lb != 0) {
					local352 |= 0x2;
				}
			}
			local398 = super.aClass97Array3[1] = local333.method2233(super.anInt8968, super.anInt9027, local352, arg0, Static35.aClass152_1, super.anInt9026);
			if (local398 != null) {
				if (super.lb != 0) {
					local398.ca(0, -super.lb << 0, 0);
				}
				if (super.anInt9005 != 0) {
					local398.OA(super.anInt9005 * 2048);
				}
				if (local350) {
					if (super.anInt9012 != 0) {
						local398.D(super.anInt9012);
					}
					if (super.anInt9013 != 0) {
						local398.b(super.anInt9013);
					}
					if (super.anInt8987 != 0) {
						local398.ca(0, super.anInt8987, 0);
					}
				}
			}
		}
		if (this.aBoolean52 || super.anInt8967 == -1 || super.anInt9011 == -1) {
			super.aClass97Array3[3] = null;
		} else {
			local333 = Static530.aClass195_2.method5439(super.anInt8967);
			local350 = local333.aByte37 == 3 && (local53 != 0 || local56 != 0);
			local352 = local7;
			if (local350) {
				local352 = local7 | 0x7;
			} else {
				if (super.anInt8957 != 0) {
					local352 = local7 | 0x5;
				}
				if (super.anInt9015 != 0) {
					local352 |= 0x2;
				}
			}
			local398 = super.aClass97Array3[3] = local333.method2235(super.anInt8958, local352, Static35.aClass152_1, arg0, super.anInt8984, super.anInt9011);
			if (local398 != null) {
				if (super.anInt9015 != 0) {
					local398.ca(0, -super.anInt9015 << 0, 0);
				}
				if (super.anInt8957 != 0) {
					local398.OA(super.anInt8957 * 2048);
				}
				if (local350) {
					if (super.anInt9012 != 0) {
						local398.D(super.anInt9012);
					}
					if (super.anInt9013 != 0) {
						local398.b(super.anInt9013);
					}
					if (super.anInt8987 != 0) {
						local398.ca(0, super.anInt8987, 0);
					}
				}
			}
		}
		super.aClass97Array3[2] = null;
		if (!this.aBoolean52 && super.aClass1_Sub27_3 != null) {
			if (Static445.anInt7791 >= super.aClass1_Sub27_3.anInt4512) {
				super.aClass1_Sub27_3 = null;
			} else if (super.aClass1_Sub27_3.anInt4507 <= Static445.anInt7791) {
				@Pc(630) Class97 local630 = super.aClass1_Sub27_3.method4188(local7 | 0x7, arg0);
				if (local630 != null) {
					local630.ca(super.aClass1_Sub27_3.anInt4508 - super.anInt8954, -super.anInt8947 + super.aClass1_Sub27_3.anInt4506, super.aClass1_Sub27_3.anInt4502 - super.anInt8949);
					if (local167 != 0) {
						local630.OA(-local167 & 0x3FFF);
					}
					super.aClass97Array3[2] = local630;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I")
	@Override
	public int method7808() {
		return this.aClass225_1 == null || this.aClass225_1.anInt6650 == -1 ? super.method7808() : Static358.aClass95_1.method2362(this.aClass225_1.anInt6650).anInt8439;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
	@Override
	protected int method7822() {
		return this.anInt667;
	}
}
