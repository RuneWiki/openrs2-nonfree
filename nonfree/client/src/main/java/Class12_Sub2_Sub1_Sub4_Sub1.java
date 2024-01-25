import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class12_Sub2_Sub1_Sub4_Sub1 extends Class12_Sub2_Sub1_Sub4 {

	@OriginalMember(owner = "client!mq", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!mq", name = "ad", descriptor = "Lclient!rm;")
	public Class300 aClass300_1;

	@OriginalMember(owner = "client!mq", name = "bd", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!mq", name = "Bd", descriptor = "I")
	public int anInt5830;

	@OriginalMember(owner = "client!mq", name = "Cd", descriptor = "I")
	private int anInt5831;

	@OriginalMember(owner = "client!mq", name = "Ed", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!mq", name = "Wc", descriptor = "I")
	public int anInt5806 = 0;

	@OriginalMember(owner = "client!mq", name = "fd", descriptor = "I")
	public int anInt5811 = -1;

	@OriginalMember(owner = "client!mq", name = "gd", descriptor = "B")
	private byte aByte77 = 0;

	@OriginalMember(owner = "client!mq", name = "zd", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!mq", name = "sd", descriptor = "I")
	public int anInt5822 = 0;

	@OriginalMember(owner = "client!mq", name = "Qc", descriptor = "I")
	public int anInt5800 = 0;

	@OriginalMember(owner = "client!mq", name = "yd", descriptor = "I")
	public int anInt5828 = -1;

	@OriginalMember(owner = "client!mq", name = "wd", descriptor = "I")
	public int anInt5826 = -1;

	@OriginalMember(owner = "client!mq", name = "cd", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!mq", name = "td", descriptor = "I")
	public int anInt5823 = -1;

	@OriginalMember(owner = "client!mq", name = "Id", descriptor = "B")
	private byte aByte79 = 0;

	@OriginalMember(owner = "client!mq", name = "Jd", descriptor = "Z")
	public boolean aBoolean462 = false;

	@OriginalMember(owner = "client!mq", name = "Dd", descriptor = "I")
	public int anInt5832 = -1;

	@OriginalMember(owner = "client!mq", name = "kd", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!mq", name = "id", descriptor = "I")
	public int anInt5813 = -1;

	@OriginalMember(owner = "client!mq", name = "ld", descriptor = "I")
	public int anInt5815 = -1;

	@OriginalMember(owner = "client!mq", name = "Ad", descriptor = "I")
	public int anInt5829 = 0;

	@OriginalMember(owner = "client!mq", name = "dd", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!mq", name = "rd", descriptor = "I")
	public int anInt5821 = 0;

	@OriginalMember(owner = "client!mq", name = "Gd", descriptor = "B")
	private byte aByte78 = 0;

	@OriginalMember(owner = "client!mq", name = "qd", descriptor = "I")
	public int anInt5820 = 255;

	@OriginalMember(owner = "client!mq", name = "vd", descriptor = "I")
	public int anInt5825 = -1;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!r;I)Z")
	private boolean method4901(@OriginalArg(1) Class162 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class61 local11 = this.method6767();
		@Pc(29) Class148 local29 = super.anInt8394 != -1 && super.anInt8397 == 0 ? Static117.aClass18_1.method296(super.anInt8394) : null;
		@Pc(49) Class148 local49 = super.anInt8351 == -1 || this.aBoolean460 || super.aBoolean710 && local29 != null ? null : Static117.aClass18_1.method296(super.anInt8351);
		@Pc(52) int local52 = local11.anInt1315;
		@Pc(55) int local55 = local11.anInt1323;
		if (local52 != 0 || local55 != 0 || local11.anInt1295 != 0 || local11.anInt1334 != 0) {
			arg1 |= 0x7;
		}
		@Pc(83) int local83 = super.aClass352_7.method7410();
		@Pc(102) boolean local102 = super.aByte119 != 0 && super.anInt8352 <= Static532.anInt8757 && super.anInt8422 > Static532.anInt8757;
		if (local102) {
			arg1 |= 0x80000;
		}
		@Pc(146) Class33 local146 = super.aClass33Array3[0] = this.aClass300_1.method6025(super.anInt8396, arg1, Static380.aClass221_3, Static25.aClass286_1, local83, Static117.aClass18_1, super.anInt8379, arg0, super.anInt8415, super.anInt8376, super.anInt8420, Static426.aClass160_1, super.aClass324Array3, local29, super.anIntArray559, super.anInt8353, local49, Static76.aClass361_1, Static466.aClass130_2);
		@Pc(149) int local149 = Static36.method571();
		if (Static326.anInt7462 < 96 && local149 > 50) {
			Static426.method5673();
		}
		if (Static416.aClass232_7 != Static340.aClass232_14 && local149 < 50) {
			@Pc(180) int local180 = 50 - local149;
			while (local180 > Static464.anInt7426) {
				Static454.aByteArrayArray18[Static464.anInt7426] = new byte[102400];
				Static464.anInt7426++;
			}
			while (Static464.anInt7426 > local180) {
				Static464.anInt7426--;
				Static454.aByteArrayArray18[Static464.anInt7426] = null;
			}
		} else if (Static416.aClass232_7 != Static340.aClass232_14) {
			Static454.aByteArrayArray18 = new byte[50][];
			Static464.anInt7426 = 0;
		}
		if (local146 == null) {
			return false;
		}
		super.anInt8388 = local146.J();
		super.anInt8378 = local146.RA();
		this.method6772(local146);
		if (local52 == 0 && local55 == 0) {
			this.method6768(0, this.method6777() << 9, local83, 0, this.method6777() << 9);
		} else {
			this.method6768(local11.anInt1319, local55, local83, local11.anInt1311, local52);
			if (super.anInt8425 != 0) {
				local146.MA(super.anInt8425);
			}
			if (super.anInt8381 != 0) {
				local146.W(super.anInt8381);
			}
			if (super.anInt8410 != 0) {
				local146.oa(0, super.anInt8410, 0);
			}
		}
		if (local102) {
			local146.method7204(super.aByte121, super.aByte122, super.aByte120, super.aByte119 & 0xFF);
		}
		@Pc(335) Class82 local335;
		@Pc(353) boolean local353;
		@Pc(355) int local355;
		@Pc(395) Class33 local395;
		if (this.aBoolean460 || super.anInt8370 == -1 || super.lb == -1) {
			super.aClass33Array3[1] = null;
		} else {
			local335 = Static62.aClass49_1.method1021(super.anInt8370);
			local353 = local335.aByte23 == 3 && (local52 != 0 || local55 != 0);
			local355 = local7;
			if (local353) {
				local355 = local7 | 0x7;
			} else {
				if (super.anInt8386 != 0) {
					local355 = local7 | 0x5;
				}
				if (super.anInt8361 != 0) {
					local355 |= 0x2;
				}
			}
			local395 = super.aClass33Array3[1] = local335.method1544(super.anInt8405, Static117.aClass18_1, super.anInt8408, local355, arg0, super.lb);
			if (local395 != null) {
				if (super.anInt8361 != 0) {
					local395.oa(0, -super.anInt8361 << 2, 0);
				}
				if (super.anInt8386 != 0) {
					local395.M(super.anInt8386 * 2048);
				}
				if (local353) {
					if (super.anInt8425 != 0) {
						local395.MA(super.anInt8425);
					}
					if (super.anInt8381 != 0) {
						local395.W(super.anInt8381);
					}
					if (super.anInt8410 != 0) {
						local395.oa(0, super.anInt8410, 0);
					}
				}
			}
		}
		if (this.aBoolean460 || super.anInt8366 == -1 || super.anInt8393 == -1) {
			super.aClass33Array3[2] = null;
		} else {
			local335 = Static62.aClass49_1.method1021(super.anInt8366);
			local353 = local335.aByte23 == 3 && (local52 != 0 || local55 != 0);
			local355 = local7;
			if (local353) {
				local355 = local7 | 0x7;
			} else {
				if (super.anInt8390 != 0) {
					local355 = local7 | 0x5;
				}
				if (super.anInt8382 != 0) {
					local355 |= 0x2;
				}
			}
			local395 = super.aClass33Array3[2] = local335.method1541(super.anInt8349, super.anInt8393, Static117.aClass18_1, arg0, local355, super.anInt8398);
			if (local395 != null) {
				if (super.anInt8382 != 0) {
					local395.oa(0, -super.anInt8382 << 2, 0);
				}
				if (super.anInt8390 != 0) {
					local395.M(super.anInt8390 * 2048);
				}
				if (local353) {
					if (super.anInt8425 != 0) {
						local395.MA(super.anInt8425);
					}
					if (super.anInt8381 != 0) {
						local395.W(super.anInt8381);
					}
					if (super.anInt8410 != 0) {
						local395.oa(0, super.anInt8410, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4902() {
		return this.aString75;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
	@Override
	protected int method6765() {
		return this.anInt5831;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!da;Lclient!q;IIZLclient!r;I)V")
	private void method4903(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class162 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg6 * arg6;
		if (local11 < 262144 || arg3 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg0, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class33 local47 = Static119.method1046(super.anInt8410, arg4, arg5, super.anInt8425, local35, super.anInt8381);
		if (local47 != null) {
			arg5.ZA(false);
			local47.method7192(arg2, null, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!q;Lclient!da;IIZILclient!r;II)V")
	private void method4904(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class162 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg3 * arg3 + arg6 * arg6;
		if (local12 < 262144 || local12 > arg7) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg3, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class33 local54 = Static119.method1046(super.anInt8410, arg2, arg5, super.anInt8425, local42, super.anInt8381);
		if (local54 != null) {
			arg5.ZA(false);
			local54.method7183(arg0, null, arg4, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "(I)Z")
	public boolean method4905() {
		return this.aClass300_1 != null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4906() {
		@Pc(7) String local7 = "";
		if (Static577.aStringArray43 != null) {
			local7 = local7 + Static577.aStringArray43[this.aByte77];
		}
		@Pc(29) int[] local29;
		if (this.aByte79 == 1 && Static52.anIntArray102 != null) {
			local29 = Static52.anIntArray102;
		} else {
			local29 = Static463.anIntArray497;
		}
		if (local29 != null && local29[this.aByte77] != -1) {
			@Pc(55) Class108 local55 = Static407.aClass215_1.method4452(local29[this.aByte77]);
			if (local55.aChar3 == 's') {
				local7 = local7 + local55.method1997(this.aByte78 & 0xFF);
			} else {
				Static357.method5094(new Throwable(), "gdn1");
				local29[this.aByte77] = -1;
			}
		}
		local7 = local7 + this.aString76;
		if (Static498.aStringArray38 != null) {
			local7 = local7 + Static498.aStringArray38[this.aByte77];
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		if (this.aClass300_1 == null || !this.method4901(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class25 local19 = arg2.method6862();
		@Pc(24) int local24 = super.aClass352_7.method7410();
		local19.o(local24);
		local19.U(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass33Array3.length; local39++) {
			if (super.aClass33Array3[local39] != null && (Static286.aBoolean372 ? super.aClass33Array3[local39].method7201(arg0, arg1, local19, true, Static578.anInt9366) : super.aClass33Array3[local39].method7193(arg0, arg1, local19, true))) {
				local37 = true;
				break;
			}
		}
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	public void method4907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt8431 = 0;
		super.anInt8430 = 0;
		super.anIntArray566[0] = arg0;
		super.anInt8428 = 0;
		super.anIntArray565[0] = arg1;
		@Pc(26) int local26 = this.method6777();
		super.anInt9375 = super.anIntArray565[0] * 512 + local26 * 256;
		super.anInt9374 = super.anIntArray566[0] * 512 + local26 * 256;
		if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == this) {
			Static113.method1669();
		}
		if (super.aClass12_Sub4_7 != null) {
			super.aClass12_Sub4_7.method4132();
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method4908(@OriginalArg(1) Class2_Sub7 arg0) {
		arg0.anInt5186 = 0;
		@Pc(12) int local12 = arg0.method4464();
		this.aByte79 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean458;
		this.aBoolean458 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method6777();
		this.method6762((local12 >> 3 & 0x7) + 1);
		this.aByte77 = (byte) (local12 >> 6 & 0x3);
		super.anInt9374 += this.method6777() - local45 << 8;
		super.anInt9375 += this.method6777() - local45 << 8;
		this.aByte78 = arg0.method4477();
		this.anInt5828 = arg0.method4477();
		this.anInt5823 = arg0.method4477();
		this.aBoolean461 = arg0.method4477() == 1;
		if (Static340.aClass232_14 == Static416.aClass232_7 && Static11.anInt294 >= 2) {
			this.aBoolean461 = false;
		}
		@Pc(133) int local133 = -1;
		this.anInt5806 = 0;
		@Pc(139) int[] local139 = new int[12];
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(204) int local204;
		for (@Pc(141) int local141 = 0; local141 < 12; local141++) {
			@Pc(147) int local147 = arg0.method4464();
			if (local147 == 0) {
				local139[local141] = 0;
			} else {
				local159 = arg0.method4464();
				local165 = local159 + (local147 << 8);
				if (local141 == 0 && local165 == 65535) {
					local133 = arg0.method4518();
					this.anInt5806 = arg0.method4464();
					break;
				}
				if (local165 >= 32768) {
					local165 = Static112.anIntArray169[local165 - 32768];
					local139[local141] = local165 | 0x40000000;
					local204 = Static466.aClass130_2.method2311(local165).anInt3830;
					if (local204 != 0) {
						this.anInt5806 = local204;
					}
				} else {
					local139[local141] = Integer.MIN_VALUE | local165 - 256;
				}
			}
		}
		@Pc(226) int[] local226 = new int[5];
		for (local159 = 0; local159 < 5; local159++) {
			local165 = arg0.method4464();
			if (Static320.aShortArrayArrayArray3.length < 1 || local165 < 0 || local165 >= Static320.aShortArrayArrayArray3[0][local159].length) {
				local165 = 0;
			}
			local226[local159] = local165;
		}
		this.anInt5831 = arg0.method4518();
		this.aString76 = arg0.method4494();
		this.aString75 = this.aString76;
		this.anInt5822 = arg0.method4464();
		if (local41) {
			this.anInt5829 = arg0.method4518();
			this.anInt5825 = -1;
			if (this.anInt5829 == 65535) {
				this.anInt5829 = -1;
			}
			this.anInt5800 = this.anInt5822;
		} else {
			this.anInt5829 = 0;
			this.anInt5800 = arg0.method4464();
			this.anInt5825 = arg0.method4464();
			if (this.anInt5825 == 255) {
				this.anInt5825 = -1;
			}
		}
		local165 = this.anInt5821;
		this.anInt5821 = arg0.method4464();
		@Pc(350) int local350;
		if (this.anInt5821 == 0) {
			Static331.method4762(this);
		} else {
			local204 = this.anInt5826;
			@Pc(347) int local347 = this.anInt5811;
			local350 = this.anInt5813;
			@Pc(353) int local353 = this.anInt5832;
			@Pc(356) int local356 = this.anInt5820;
			this.anInt5826 = arg0.method4518();
			this.anInt5811 = arg0.method4518();
			this.anInt5813 = arg0.method4518();
			this.anInt5832 = arg0.method4518();
			this.anInt5820 = arg0.method4464();
			if (local21 != this.aBoolean458 || this.anInt5821 != local165 || this.anInt5826 != local204 || this.anInt5811 != local347 || local350 != this.anInt5813 || this.anInt5832 != local353 || this.anInt5820 != local356) {
				Static81.method7178(this);
			}
		}
		if (this.aClass300_1 == null) {
			this.aClass300_1 = new Class300();
		}
		local204 = this.aClass300_1.anInt7482;
		@Pc(453) int[] local453 = this.aClass300_1.anIntArray503;
		this.aClass300_1.method6028(local133, local139, local226, this.aByte79 == 1, this.method6765());
		if (local204 != local133) {
			super.anInt9374 = (super.anIntArray566[0] << 9) + (this.method6777() << 8);
			super.anInt9375 = (super.anIntArray565[0] << 9) + (this.method6777() << 8);
		}
		if (Static18.anInt4109 == super.anInt8406 && local453 != null) {
			for (local350 = 0; local350 < local226.length; local350++) {
				if (local453[local350] != local226[local350]) {
					Static466.aClass130_2.method2313();
					break;
				}
			}
		}
		if (super.aClass12_Sub4_7 != null) {
			super.aClass12_Sub4_7.method4132();
		}
		if (super.anInt8351 == -1 || !super.aBoolean710) {
			return;
		}
		@Pc(556) Class61 local556 = this.method6767();
		if (!local556.method1201(super.anInt8351)) {
			super.anInt8351 = -1;
			super.aBoolean710 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		if (this.aClass300_1 == null || !super.aBoolean711 && !this.method4901(arg0, 0)) {
			return;
		}
		@Pc(26) Class25 local26 = arg0.method6862();
		local26.o(super.aClass352_7.method7410());
		local26.U(super.anInt9374, super.anInt9373 - 5, super.anInt9375);
		this.method6764(local26, arg0, super.aBoolean711, super.aClass33Array3);
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIB)V")
	public void method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8431 < 9) {
			super.anInt8431++;
		}
		for (@Pc(18) int local18 = super.anInt8431; local18 > 0; local18--) {
			super.anIntArray566[local18] = super.anIntArray566[local18 - 1];
			super.anIntArray565[local18] = super.anIntArray565[local18 - 1];
			super.aByteArray92[local18] = super.aByteArray92[local18 - 1];
		}
		super.anIntArray566[0] = arg1;
		super.aByteArray92[0] = arg2;
		super.anIntArray565[0] = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
	@Override
	public int method6775() {
		return -1;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass300_1 == null || !this.method4901(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class25 local19 = arg0.method6862();
		@Pc(24) int local24 = super.aClass352_7.method7410();
		local19.o(local24);
		@Pc(42) Class228 local42 = Static469.aClass228ArrayArrayArray6[super.aByte128][super.anInt9374 >> Static562.anInt9207][super.anInt9375 >> Static562.anInt9207];
		@Pc(55) int local55;
		if (local42 == null || local42.aClass12_Sub2_Sub2_1 == null) {
			super.anInt8365 = (int) ((float) super.anInt8365 - (float) super.anInt8365 / 10.0F);
		} else {
			local55 = super.anInt8365 - local42.aClass12_Sub2_Sub2_1.aShort39;
			super.anInt8365 = (int) ((float) super.anInt8365 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt9374, -super.anInt8365 + super.anInt9373 - 20, super.anInt9375);
		super.aBoolean712 = false;
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean640) {
			@Pc(104) Class61 local104 = this.method6767();
			if (local104.aBoolean91 && (this.aClass300_1.anInt7482 == -1 || Static76.aClass361_1.method7581(this.aClass300_1.anInt7482).aBoolean610)) {
				@Pc(136) Class148 local136 = super.anInt8394 != -1 && super.anInt8397 == 0 ? Static117.aClass18_1.method296(super.anInt8394) : null;
				@Pc(156) Class148 local156 = super.anInt8351 == -1 || this.aBoolean460 || super.aBoolean710 && local136 != null ? null : Static117.aClass18_1.method296(super.anInt8351);
				@Pc(188) Class33 local188 = Static178.method2296(local156 == null ? super.anInt8420 : super.anInt8376, super.anInt8425, arg0, 240, local156 == null ? local136 : local156, 160, 1, super.aClass33Array3[0], 0, super.anInt8381, local24, 0, super.anInt8410);
				if (local188 != null) {
					super.aBoolean712 = true;
					arg0.ZA(false);
					if (Static286.aBoolean372) {
						local188.method7183(local19, null, Static578.anInt9366, 0);
					} else {
						local188.method7192(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == this) {
			local19.NA(super.anInt9374, super.anInt9373, super.anInt9375);
			for (local55 = Static271.aClass80Array1.length - 1; local55 >= 0; local55--) {
				@Pc(236) Class80 local236 = Static271.aClass80Array1[local55];
				if (local236 != null && local236.anInt1803 != -1) {
					@Pc(267) int local267;
					if (local236.anInt1806 == 1) {
						@Pc(255) Class2_Sub5 local255 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local236.anInt1798);
						if (local255 != null) {
							@Pc(260) Class12_Sub2_Sub1_Sub4_Sub2 local260 = local255.aClass12_Sub2_Sub1_Sub4_Sub2_1;
							local267 = local260.anInt9374 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
							@Pc(273) int local273 = local260.anInt9375 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
							if (Static286.aBoolean372) {
								this.method4904(local19, super.aClass33Array3[0], local236.anInt1803, local267, Static578.anInt9366, arg0, local273, 92160000);
							} else {
								this.method4903(local267, super.aClass33Array3[0], local19, 92160000, local236.anInt1803, arg0, local273);
							}
						}
					}
					@Pc(327) int local327;
					if (local236.anInt1806 == 2) {
						@Pc(319) int local319 = local236.anInt1809 + 256 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
						local327 = local236.anInt1802 + 256 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
						local267 = local236.anInt1800 << 9;
						local267 *= local267;
						if (Static286.aBoolean372) {
							this.method4904(local19, super.aClass33Array3[0], local236.anInt1803, local319, Static578.anInt9366, arg0, local327, local267);
						} else {
							this.method4903(local319, super.aClass33Array3[0], local19, local267, local236.anInt1803, arg0, local327);
						}
					}
					if (local236.anInt1806 == 10 && local236.anInt1798 >= 0 && Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1.length > local236.anInt1798) {
						@Pc(386) Class12_Sub2_Sub1_Sub4_Sub1 local386 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local236.anInt1798];
						if (local386 != null) {
							local327 = local386.anInt9374 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374;
							local267 = local386.anInt9375 - Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375;
							if (Static286.aBoolean372) {
								this.method4904(local19, super.aClass33Array3[0], local236.anInt1803, local327, Static578.anInt9366, arg0, local267, 92160000);
							} else {
								this.method4903(local327, super.aClass33Array3[0], local19, 92160000, local236.anInt1803, arg0, local267);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt9374, super.anInt9373, super.anInt9375);
		}
		local19.o(local24);
		local19.U(super.anInt9374, super.anInt9373 - super.anInt8365 - 5, super.anInt9375);
		@Pc(486) Class12_Sub3 local486 = Static443.method5793(super.aClass33Array3.length);
		this.method6764(local19, arg0, false, super.aClass33Array3);
		@Pc(500) int local500;
		if (Static286.aBoolean372) {
			for (local500 = 0; local500 < super.aClass33Array3.length; local500++) {
				if (super.aClass33Array3[local500] != null) {
					super.aClass33Array3[local500].method7183(local19, local486.aClass12_Sub6Array1[local500], Static578.anInt9366, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == this ? 1 : 0);
				}
			}
		} else {
			for (local500 = 0; local500 < super.aClass33Array3.length; local500++) {
				if (super.aClass33Array3[local500] != null) {
					super.aClass33Array3[local500].method7192(local19, local486.aClass12_Sub6Array1[local500], Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass12_Sub4_7 != null) {
			@Pc(570) Class339 local570 = super.aClass12_Sub4_7.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local570, Static578.anInt9366);
			} else {
				arg0.method6860(local570);
			}
		}
		for (local500 = 0; local500 < super.aClass33Array3.length; local500++) {
			if (super.aClass33Array3[local500] != null) {
				super.aBoolean712 |= super.aClass33Array3[local500].LA();
			}
		}
		super.anInt8413 = Static388.anInt6397;
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
		return local486;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIIB)V")
	public void method4910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8394 != -1 && Static117.aClass18_1.method296(super.anInt8394).anInt3052 == 1) {
			super.anIntArray558 = null;
			super.anInt8394 = -1;
		}
		@Pc(35) Class82 local35;
		if (super.anInt8370 != -1) {
			local35 = Static62.aClass49_1.method1021(super.anInt8370);
			if (local35.aBoolean116 && local35.anInt1827 != -1 && Static117.aClass18_1.method296(local35.anInt1827).anInt3052 == 1) {
				super.anInt8370 = -1;
			}
		}
		if (super.anInt8366 != -1) {
			local35 = Static62.aClass49_1.method1021(super.anInt8366);
			if (local35.aBoolean116 && local35.anInt1827 != -1 && Static117.aClass18_1.method296(local35.anInt1827).anInt3052 == 1) {
				super.anInt8366 = -1;
			}
		}
		this.anInt5815 = -1;
		if (arg1 < 0 || arg1 >= Static281.anInt4822 || arg0 < 0 || arg0 >= Static29.anInt491) {
			this.method4907(arg1, arg0);
		} else if (super.anIntArray566[0] >= 0 && super.anIntArray566[0] < Static281.anInt4822 && super.anIntArray565[0] >= 0 && Static29.anInt491 > super.anIntArray565[0]) {
			if (arg2 == 2) {
				Static452.method5886(arg1, arg0, this);
			}
			this.method4909(arg0, arg1, arg2);
		} else {
			this.method4907(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	@Override
	public int method6777() {
		return this.aClass300_1 == null || this.aClass300_1.anInt7482 == -1 ? super.method6777() : Static76.aClass361_1.method7581(this.aClass300_1.anInt7482).anInt7362;
	}
}
