import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "F")
	private float aFloat33;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!dfa", name = "r", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "[[Lclient!fk;")
	private Class100[][] aClass100ArrayArray1;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "[[Lclient!it;")
	private Class153[][] aClass153ArrayArray1;

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!dfa", name = "y", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!dfa", name = "C", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!dfa", name = "D", descriptor = "[[Lclient!iga;")
	private Class145[][] aClass145ArrayArray1;

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "F")
	private float aFloat42;

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "[[Lclient!pfa;")
	private Class255[][] aClass255ArrayArray1;

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
	private int anInt1925 = -1;

	@OriginalMember(owner = "client!dfa", name = "u", descriptor = "Lclient!cc;")
	private final Class45_Sub1 aClass45_Sub1_2;

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
	private final int anInt1924;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!cc;IIII[[I[[II)V")
	public Class34_Sub2(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass45_Sub1_2 = arg0;
		this.anInt1924 = arg2;
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		@Pc(29) int local29 = this.aClass45_Sub1_2.anInt1232 >> 9;
		for (@Pc(31) int local31 = 1; local31 < arg4; local31++) {
			for (@Pc(34) int local34 = 1; local34 < arg3; local34++) {
				@Pc(53) int local53 = arg6[local34 + 1][local31] - arg6[local34 - 1][local31];
				@Pc(69) int local69 = arg6[local34][local31 + 1] - arg6[local34][local31 - 1];
				@Pc(84) int local84 = (int) Math.sqrt((double) (local53 * local53 + arg7 * 512 + local69 * local69));
				@Pc(90) int local90 = (local53 << 8) / local84;
				@Pc(96) int local96 = arg7 * -512 / local84;
				@Pc(102) int local102 = (local69 << 8) / local84;
				@Pc(124) int local124 = local29 + (this.aClass45_Sub1_2.anInt1244 * local90 + this.aClass45_Sub1_2.anInt1236 * local96 + this.aClass45_Sub1_2.anInt1246 * local102 >> 17);
				local124 >>= 0x1;
				if (local124 < 2) {
					local124 = 2;
				} else if (local124 > 126) {
					local124 = 126;
				}
				this.aByteArrayArray5[local34][local31] = (byte) local124;
			}
		}
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!eq;[I)V")
	@Override
	public void method6535(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII[[ZLclient!nw;Lclient!tfa;[I[I)V")
	private void method1737(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class230 arg5, @OriginalArg(9) Class323 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean462;
		this.aClass45_Sub1_2.ZA(false);
		arg6.aBoolean629 = false;
		arg6.aBoolean630 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(78) int local78;
					if (this.aClass100ArrayArray1[local32][local35] != null) {
						@Pc(60) Class100 local60 = this.aClass100ArrayArray1[local32][local35];
						if (local60.aShort42 != -1 && (local60.aByte33 & 0x2) == 0 && local60.anInt3155 == 0) {
							local78 = this.aClass45_Sub1_2.method1180(local60.aShort42);
							arg6.method6835(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static446.method6237(local78, local60.anInt3154), Static446.method6237(local78, local60.anInt3153), Static446.method6237(local78, local60.anInt3151));
							arg6.method6835(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static446.method6237(local78, local60.anInt3152), Static446.method6237(local78, local60.anInt3151), Static446.method6237(local78, local60.anInt3153));
						} else if (local60.anInt3155 == 0) {
							arg6.method6834(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.anInt3154, local60.anInt3153, local60.anInt3151);
							arg6.method6834(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.anInt3152, local60.anInt3151, local60.anInt3153);
						} else {
							local78 = local60.anInt3155;
							arg6.method6834(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static48.method756(local60.anInt3154 & 0xFF000000, local78), Static48.method756(local60.anInt3153 & 0xFF000000, local78), Static48.method756(local60.anInt3151 & 0xFF000000, local78));
							arg6.method6834(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static48.method756(local60.anInt3152 & 0xFF000000, local78), Static48.method756(local60.anInt3151 & 0xFF000000, local78), Static48.method756(local60.anInt3153 & 0xFF000000, local78));
						}
					} else if (this.aClass255ArrayArray1[local32][local35] != null) {
						@Pc(287) Class255 local287 = this.aClass255ArrayArray1[local32][local35];
						for (local78 = 0; local78 < local287.aShort114; local78++) {
							arg7[local78] = local26 + local287.aShortArray104[local78] * 4 / super.anInt7850;
							arg8[local78] = local30 - local287.aShortArray106[local78] * 4 / super.anInt7850;
						}
						for (@Pc(325) int local325 = 0; local325 < local287.aShort115; local325++) {
							@Pc(330) int local330 = local325 * 3;
							@Pc(334) int local334 = local330 + 1;
							@Pc(338) int local338 = local334 + 1;
							@Pc(342) int local342 = arg7[local330];
							@Pc(346) int local346 = arg7[local334];
							@Pc(350) int local350 = arg7[local338];
							@Pc(354) int local354 = arg8[local330];
							@Pc(358) int local358 = arg8[local334];
							@Pc(362) int local362 = arg8[local338];
							@Pc(387) int local387;
							if (local287.anIntArray433 != null && local287.anIntArray433[local325] != 0 && (local287.aShortArray101 == null || local287.aShortArray101 != null && local287.aShortArray101[local325] == -1)) {
								local387 = local287.anIntArray433[local325];
								arg6.method6834(local354, local358, local362, local342, local346, local350, 100, 100, 100, Static48.method756(-(local287.anIntArray432[local330] & -16777216) - 16777216, local387), Static48.method756(-(local287.anIntArray432[local334] & -16777216) - 16777216, local387), Static48.method756(-(local287.anIntArray432[local338] & -16777216) - 16777216, local387));
							} else if (local287.aShortArray101 == null || local287.aShortArray101[local325] == -1) {
								arg6.method6834(local354, local358, local362, local342, local346, local350, 100, 100, 100, local287.anIntArray432[local330], local287.anIntArray432[local334], local287.anIntArray432[local338]);
							} else {
								local387 = this.aClass45_Sub1_2.method1180(local287.aShortArray101[local325]);
								arg6.method6835(local354, local358, local362, local342, local346, local350, 100, 100, 100, local387, local387, local387);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean629 = true;
		this.aClass45_Sub1_2.ZA(local14);
	}

	@OriginalMember(owner = "client!dfa", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		this.aByteArrayArray5 = null;
		this.aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6534(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class230 local4 = this.aClass45_Sub1_2.method1177(Thread.currentThread());
		local4.aClass323_1.anInt8240 = 0;
		if (this.aClass100ArrayArray1 != null) {
			this.method1741(arg0, arg1, local4.aBoolean465, local4, local4.aClass323_1, local4.anIntArray359, local4.anIntArray350, local4.anIntArray360, local4.anIntArray358);
		} else if (this.aClass153ArrayArray1 != null) {
			this.method1740(arg0, arg1, local4.aClass323_1, local4.anIntArray359, local4.anIntArray350, local4.anIntArray360, local4.anIntArray358);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)Z")
	private boolean method1738(@OriginalArg(0) int arg0) {
		if ((this.anInt1924 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class11_Sub3 local3 = this.aClass45_Sub1_2.aClass11_Sub3_1;
		this.anInt1925 = arg5;
		this.aFloat35 = local3.aFloat167;
		this.aFloat37 = local3.aFloat169;
		this.aFloat36 = local3.aFloat165;
		this.aFloat41 = local3.aFloat162;
		this.aFloat32 = local3.aFloat170;
		this.aFloat38 = local3.aFloat161;
		this.aFloat40 = local3.aFloat166;
		this.aFloat43 = local3.aFloat168;
		this.aFloat33 = local3.aFloat163;
		this.aFloat34 = local3.aFloat164;
		this.aFloat42 = local3.aFloat160;
		this.aFloat39 = local3.aFloat171;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt7854 && local78 >= 0 && local78 < super.anInt7852) {
						this.method6527(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6532(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class230 local4 = this.aClass45_Sub1_2.method1177(Thread.currentThread());
		@Pc(7) Class323 local7 = local4.aClass323_1;
		local7.anInt8240 = 0;
		local7.aBoolean633 = false;
		this.aClass45_Sub1_2.ya();
		if (this.aClass100ArrayArray1 != null) {
			this.method1737(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray359, local4.anIntArray350);
		} else if (this.aClass153ArrayArray1 != null) {
			this.method1742(arg0, arg1, arg2, arg3, arg4, local4, local7, local4.anIntArray359, local4.anIntArray350);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!tfa;[I[I[I[I)V")
	private void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class323 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class153 local6 = this.aClass153ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(450) int local450;
		@Pc(480) int local480;
		@Pc(407) float local407;
		@Pc(467) float local467;
		@Pc(73) float local73;
		@Pc(98) float local98;
		@Pc(123) float local123;
		@Pc(774) int local774;
		@Pc(300) int local300;
		@Pc(360) int local360;
		@Pc(420) int local420;
		@Pc(377) float local377;
		@Pc(437) float local437;
		@Pc(287) float local287;
		@Pc(347) float local347;
		if (local6 == null) {
			@Pc(2080) Class145 local2080 = this.aClass145ArrayArray1[arg0][arg1];
			if (local2080 != null) {
				@Pc(2104) short local2104;
				@Pc(2164) float local2164;
				@Pc(2185) float local2185;
				@Pc(2135) float local2135;
				if (this.anInt1925 == -1) {
					for (local450 = 0; local450 < local2080.aShort52; local450++) {
						local24 = local2080.aShortArray63[local450] + (arg0 << super.anInt7856);
						local2104 = local2080.aShortArray60[local450];
						local34 = local2080.aShortArray59[local450] + (arg1 << super.anInt7856);
						local2135 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local2104 + this.aFloat42 * (float) local34;
						if (local2135 <= (float) this.aClass45_Sub1_2.anInt1238) {
							return;
						}
						local2164 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local2104 + this.aFloat36 * (float) local34;
						local2185 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local2104 + this.aFloat40 * (float) local34;
						arg3[local450] = arg2.anInt8239 + (int) (local2164 * (float) this.aClass45_Sub1_2.anInt1225 / local2135);
						arg4[local450] = arg2.anInt8243 + (int) (local2185 * (float) this.aClass45_Sub1_2.anInt1233 / local2135);
						arg5[local450] = (int) local2135;
					}
				} else {
					for (local450 = 0; local450 < local2080.aShort52; local450++) {
						local24 = local2080.aShortArray63[local450] + (arg0 << super.anInt7856);
						local2104 = local2080.aShortArray60[local450];
						local34 = local2080.aShortArray59[local450] + (arg1 << super.anInt7856);
						local2135 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local2104 + this.aFloat42 * (float) local34;
						local2164 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local2104 + this.aFloat36 * (float) local34;
						local2185 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local2104 + this.aFloat40 * (float) local34;
						arg3[local450] = arg2.anInt8239 + (int) (local2164 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
						arg4[local450] = arg2.anInt8243 + (int) (local2185 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
						arg5[local450] = (int) local2135;
					}
				}
				@Pc(2404) int local2404;
				@Pc(2409) int local2409;
				if (local2080.aShortArray61 != null) {
					local450 = super.anIntArrayArray172[arg0][arg1];
					local300 = super.anIntArrayArray172[arg0 + 1][arg1];
					local360 = super.anIntArrayArray172[arg0][arg1 + 1];
					local420 = arg0 * super.anInt7850;
					local480 = local420 + super.anInt7850;
					local2404 = arg1 * super.anInt7850;
					local2409 = local2404 + super.anInt7850;
					local377 = this.aFloat41 + this.aFloat35 * (float) local420 + this.aFloat37 * (float) local450 + this.aFloat36 * (float) local2404;
					local437 = this.aFloat43 + this.aFloat32 * (float) local420 + this.aFloat38 * (float) local450 + this.aFloat40 * (float) local2404;
					local287 = this.aFloat39 + this.aFloat33 * (float) local420 + this.aFloat34 * (float) local450 + this.aFloat42 * (float) local2404;
					local347 = this.aFloat41 + this.aFloat35 * (float) local480 + this.aFloat37 * (float) local300 + this.aFloat36 * (float) local2404;
					local407 = this.aFloat43 + this.aFloat32 * (float) local480 + this.aFloat38 * (float) local300 + this.aFloat40 * (float) local2404;
					local467 = this.aFloat39 + this.aFloat33 * (float) local480 + this.aFloat34 * (float) local300 + this.aFloat42 * (float) local2404;
					local73 = this.aFloat41 + this.aFloat35 * (float) local420 + this.aFloat37 * (float) local360 + this.aFloat36 * (float) local2409;
					local98 = this.aFloat43 + this.aFloat32 * (float) local420 + this.aFloat38 * (float) local360 + this.aFloat40 * (float) local2409;
					local123 = this.aFloat39 + this.aFloat33 * (float) local420 + this.aFloat34 * (float) local360 + this.aFloat42 * (float) local2409;
					@Pc(2604) int local2604;
					@Pc(2610) short local2610;
					@Pc(2615) short local2615;
					@Pc(2620) short local2620;
					@Pc(2628) int local2628;
					@Pc(2632) int local2632;
					@Pc(2636) int local2636;
					@Pc(2640) int local2640;
					@Pc(2644) int local2644;
					@Pc(2688) short local2688;
					@Pc(2761) int local2761;
					if (this.anInt1925 == -1) {
						for (local2604 = 0; local2604 < local2080.aShort51; local2604++) {
							local2610 = local2080.aShortArray56[local2604];
							local2615 = local2080.aShortArray57[local2604];
							local2620 = local2080.aShortArray64[local2604];
							local774 = arg3[local2610];
							local2628 = arg3[local2615];
							local2632 = arg3[local2620];
							local2636 = arg4[local2610];
							local2640 = arg4[local2615];
							local2644 = arg4[local2620];
							if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
								arg2.aBoolean633 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt8244 || local2628 > arg2.anInt8244 || local2632 > arg2.anInt8244;
								local2688 = local2080.aShortArray61[local2604];
								if (local2688 == -1) {
									local2761 = local2080.anIntArray209[local2604];
									if (local2761 != -1) {
										arg2.method6835(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static446.method6237(local2761, local2080.aShortArray58[local2610]), Static446.method6237(local2761, local2080.aShortArray58[local2615]), Static446.method6237(local2761, local2080.aShortArray58[local2620]));
									}
								} else {
									if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local2688).aByte16)) {
										arg2.anInt8240 = 100;
									}
									arg2.method6849(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray58[local2610], local2080.aShortArray58[local2615], local2080.aShortArray58[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, (int) local287, (int) local467, (int) local123, local2688);
									arg2.anInt8240 = 0;
								}
							}
						}
						return;
					}
					for (local2604 = 0; local2604 < local2080.aShort51; local2604++) {
						local2610 = local2080.aShortArray56[local2604];
						local2615 = local2080.aShortArray57[local2604];
						local2620 = local2080.aShortArray64[local2604];
						local774 = arg3[local2610];
						local2628 = arg3[local2615];
						local2632 = arg3[local2620];
						local2636 = arg4[local2610];
						local2640 = arg4[local2615];
						local2644 = arg4[local2620];
						if ((local774 - local2628) * (local2644 - local2640) - (local2636 - local2640) * (local2632 - local2628) > 0) {
							arg2.aBoolean633 = local774 < 0 || local2628 < 0 || local2632 < 0 || local774 > arg2.anInt8244 || local2628 > arg2.anInt8244 || local2632 > arg2.anInt8244;
							local2688 = local2080.aShortArray61[local2604];
							if (local2688 == -1) {
								local2761 = local2080.anIntArray209[local2604];
								if (local2761 != -1) {
									arg2.method6835(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], Static446.method6237(local2761, local2080.aShortArray58[local2610]), Static446.method6237(local2761, local2080.aShortArray58[local2615]), Static446.method6237(local2761, local2080.aShortArray58[local2620]));
								}
							} else {
								if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local2688).aByte16)) {
									arg2.anInt8240 = 100;
								}
								arg2.method6849(local2636, local2640, local2644, local774, local2628, local2632, arg5[local2610], arg5[local2615], arg5[local2620], local2080.aShortArray58[local2610], local2080.aShortArray58[local2615], local2080.aShortArray58[local2620], (int) local377, (int) local347, (int) local73, (int) local437, (int) local407, (int) local98, this.anInt1925, this.anInt1925, this.anInt1925, local2688);
								arg2.anInt8240 = 0;
							}
						}
					}
					return;
				}
				for (local450 = 0; local450 < local2080.aShort51; local450++) {
					@Pc(3022) short local3022 = local2080.aShortArray56[local450];
					@Pc(3027) short local3027 = local2080.aShortArray57[local450];
					@Pc(3032) short local3032 = local2080.aShortArray64[local450];
					local480 = arg3[local3022];
					local2404 = arg3[local3027];
					local2409 = arg3[local3032];
					@Pc(3048) int local3048 = arg4[local3022];
					@Pc(3052) int local3052 = arg4[local3027];
					@Pc(3056) int local3056 = arg4[local3032];
					if ((local480 - local2404) * (local3056 - local3052) - (local3048 - local3052) * (local2409 - local2404) > 0) {
						@Pc(3077) int local3077 = local2080.anIntArray209[local450];
						if (local3077 != -1) {
							arg2.aBoolean633 = local480 < 0 || local2404 < 0 || local2409 < 0 || local480 > arg2.anInt8244 || local2404 > arg2.anInt8244 || local2409 > arg2.anInt8244;
							arg2.method6835(local3048, local3052, local3056, local480, local2404, local2409, arg5[local3022], arg5[local3027], arg5[local3032], Static446.method6237(local3077, local2080.aShortArray58[local3022]), Static446.method6237(local3077, local2080.aShortArray58[local3027]), Static446.method6237(local3077, local2080.aShortArray58[local3032]));
						}
					}
				}
			}
		} else if ((local6.aByte43 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt7850;
			local24 = local19 + super.anInt7850;
			@Pc(29) int local29 = arg1 * super.anInt7850;
			local34 = local29 + super.anInt7850;
			@Pc(270) int local270;
			@Pc(330) int local330;
			@Pc(390) int local390;
			@Pc(257) float local257;
			@Pc(317) float local317;
			@Pc(148) float local148;
			@Pc(46) int local46;
			if ((local6.aByte43 & 0x1) == 0) {
				local46 = super.anIntArrayArray172[arg0][arg1];
				@Pc(754) int local754 = super.anIntArrayArray172[arg0 + 1][arg1];
				@Pc(765) int local765 = super.anIntArrayArray172[arg0 + 1][arg1 + 1];
				local774 = super.anIntArrayArray172[arg0][arg1 + 1];
				if (this.anInt1925 == -1) {
					local73 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local46 + this.aFloat42 * (float) local29;
					if (local73 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local98 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local754 + this.aFloat42 * (float) local29;
					if (local98 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local123 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local765 + this.aFloat42 * (float) local34;
					if (local123 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local148 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local774 + this.aFloat42 * (float) local34;
					if (local148 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local257 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local46 + this.aFloat36 * (float) local29;
					local270 = arg2.anInt8239 + (int) (local257 * (float) this.aClass45_Sub1_2.anInt1225 / local73);
					local287 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local46 + this.aFloat40 * (float) local29;
					local300 = arg2.anInt8243 + (int) (local287 * (float) this.aClass45_Sub1_2.anInt1233 / local73);
					local317 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local754 + this.aFloat36 * (float) local29;
					local330 = arg2.anInt8239 + (int) (local317 * (float) this.aClass45_Sub1_2.anInt1225 / local98);
					local347 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local754 + this.aFloat40 * (float) local29;
					local360 = arg2.anInt8243 + (int) (local347 * (float) this.aClass45_Sub1_2.anInt1233 / local98);
					local377 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local765 + this.aFloat36 * (float) local34;
					local390 = arg2.anInt8239 + (int) (local377 * (float) this.aClass45_Sub1_2.anInt1225 / local123);
					local407 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local765 + this.aFloat40 * (float) local34;
					local420 = arg2.anInt8243 + (int) (local407 * (float) this.aClass45_Sub1_2.anInt1233 / local123);
					local437 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local774 + this.aFloat36 * (float) local34;
					local450 = arg2.anInt8239 + (int) (local437 * (float) this.aClass45_Sub1_2.anInt1225 / local148);
					local467 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local774 + this.aFloat40 * (float) local34;
					local480 = arg2.anInt8243 + (int) (local467 * (float) this.aClass45_Sub1_2.anInt1233 / local148);
				} else {
					local73 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local46 + this.aFloat42 * (float) local29;
					local98 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local754 + this.aFloat42 * (float) local29;
					local123 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local765 + this.aFloat42 * (float) local34;
					local148 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local774 + this.aFloat42 * (float) local34;
					local257 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local46 + this.aFloat36 * (float) local29;
					local270 = arg2.anInt8239 + (int) (local257 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local287 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local46 + this.aFloat40 * (float) local29;
					local300 = arg2.anInt8243 + (int) (local287 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local317 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local754 + this.aFloat36 * (float) local29;
					local330 = arg2.anInt8239 + (int) (local317 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local347 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local754 + this.aFloat40 * (float) local29;
					local360 = arg2.anInt8243 + (int) (local347 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local377 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local765 + this.aFloat36 * (float) local34;
					local390 = arg2.anInt8239 + (int) (local377 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local407 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local765 + this.aFloat40 * (float) local34;
					local420 = arg2.anInt8243 + (int) (local407 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local437 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local774 + this.aFloat36 * (float) local34;
					local450 = arg2.anInt8239 + (int) (local437 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local467 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local774 + this.aFloat40 * (float) local34;
					local480 = arg2.anInt8243 + (int) (local467 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
				}
			} else {
				local46 = super.anIntArrayArray172[arg0][arg1];
				@Pc(52) float local52 = this.aFloat34 * (float) local46;
				if (this.anInt1925 == -1) {
					local73 = this.aFloat39 + this.aFloat33 * (float) local19 + local52 + this.aFloat42 * (float) local29;
					if (local73 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local98 = this.aFloat39 + this.aFloat33 * (float) local24 + local52 + this.aFloat42 * (float) local29;
					if (local98 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local123 = this.aFloat39 + this.aFloat33 * (float) local24 + local52 + this.aFloat42 * (float) local34;
					if (local123 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local148 = this.aFloat39 + this.aFloat33 * (float) local19 + local52 + this.aFloat42 * (float) local34;
					if (local148 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
				} else {
					local73 = this.aFloat39 + this.aFloat33 * (float) local19 + local52 + this.aFloat42 * (float) local29;
					local98 = this.aFloat39 + this.aFloat33 * (float) local24 + local52 + this.aFloat42 * (float) local29;
					local123 = this.aFloat39 + this.aFloat33 * (float) local24 + local52 + this.aFloat42 * (float) local34;
					local148 = this.aFloat39 + this.aFloat33 * (float) local19 + local52 + this.aFloat42 * (float) local34;
				}
				@Pc(230) float local230 = this.aFloat37 * (float) local46;
				@Pc(236) float local236 = this.aFloat38 * (float) local46;
				if (this.anInt1925 == -1) {
					local257 = this.aFloat41 + this.aFloat35 * (float) local19 + local230 + this.aFloat36 * (float) local29;
					local270 = arg2.anInt8239 + (int) (local257 * (float) this.aClass45_Sub1_2.anInt1225 / local73);
					local287 = this.aFloat43 + this.aFloat32 * (float) local19 + local236 + this.aFloat40 * (float) local29;
					local300 = arg2.anInt8243 + (int) (local287 * (float) this.aClass45_Sub1_2.anInt1233 / local73);
					local317 = this.aFloat41 + this.aFloat35 * (float) local24 + local230 + this.aFloat36 * (float) local29;
					local330 = arg2.anInt8239 + (int) (local317 * (float) this.aClass45_Sub1_2.anInt1225 / local98);
					local347 = this.aFloat43 + this.aFloat32 * (float) local24 + local236 + this.aFloat40 * (float) local29;
					local360 = arg2.anInt8243 + (int) (local347 * (float) this.aClass45_Sub1_2.anInt1233 / local98);
					local377 = this.aFloat41 + this.aFloat35 * (float) local24 + local230 + this.aFloat36 * (float) local34;
					local390 = arg2.anInt8239 + (int) (local377 * (float) this.aClass45_Sub1_2.anInt1225 / local123);
					local407 = this.aFloat43 + this.aFloat32 * (float) local24 + local236 + this.aFloat40 * (float) local34;
					local420 = arg2.anInt8243 + (int) (local407 * (float) this.aClass45_Sub1_2.anInt1233 / local123);
					local437 = this.aFloat41 + this.aFloat35 * (float) local19 + local230 + this.aFloat36 * (float) local34;
					local450 = arg2.anInt8239 + (int) (local437 * (float) this.aClass45_Sub1_2.anInt1225 / local148);
					local467 = this.aFloat43 + this.aFloat32 * (float) local19 + local236 + this.aFloat40 * (float) local34;
					local480 = arg2.anInt8243 + (int) (local467 * (float) this.aClass45_Sub1_2.anInt1233 / local148);
				} else {
					local257 = this.aFloat41 + this.aFloat35 * (float) local19 + local230 + this.aFloat36 * (float) local29;
					local270 = arg2.anInt8239 + (int) (local257 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local287 = this.aFloat43 + this.aFloat32 * (float) local19 + local236 + this.aFloat40 * (float) local29;
					local300 = arg2.anInt8243 + (int) (local287 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local317 = this.aFloat41 + this.aFloat35 * (float) local24 + local230 + this.aFloat36 * (float) local29;
					local330 = arg2.anInt8239 + (int) (local317 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local347 = this.aFloat43 + this.aFloat32 * (float) local24 + local236 + this.aFloat40 * (float) local29;
					local360 = arg2.anInt8243 + (int) (local347 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local377 = this.aFloat41 + this.aFloat35 * (float) local24 + local230 + this.aFloat36 * (float) local34;
					local390 = arg2.anInt8239 + (int) (local377 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local407 = this.aFloat43 + this.aFloat32 * (float) local24 + local236 + this.aFloat40 * (float) local34;
					local420 = arg2.anInt8243 + (int) (local407 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local437 = this.aFloat41 + this.aFloat35 * (float) local19 + local230 + this.aFloat36 * (float) local34;
					local450 = arg2.anInt8239 + (int) (local437 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local467 = this.aFloat43 + this.aFloat32 * (float) local19 + local236 + this.aFloat40 * (float) local34;
					local480 = arg2.anInt8243 + (int) (local467 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
				}
			}
			if (this.anInt1925 == -1) {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean633 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt8244 || local450 > arg2.anInt8244 || local330 > arg2.anInt8244;
					if (local6.aShort55 >= 0) {
						if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local6.aShort55).aByte16)) {
							arg2.anInt8240 = 100;
						}
						arg2.method6849(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort57 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort55);
						arg2.anInt8240 = 0;
					} else {
						arg2.method6835(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort57 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean633 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt8244 || local330 > arg2.anInt8244 || local450 > arg2.anInt8244;
					if (local6.aShort55 >= 0) {
						if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local6.aShort55).aByte16)) {
							arg2.anInt8240 = 100;
						}
						arg2.method6849(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort54 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, (int) local73, (int) local98, (int) local148, local6.aShort55);
						arg2.anInt8240 = 0;
						return;
					}
					arg2.method6835(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort54 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF);
					return;
				}
			} else {
				if ((local390 - local450) * (local360 - local480) - (local420 - local480) * (local330 - local450) > 0) {
					arg2.aBoolean633 = local390 < 0 || local450 < 0 || local330 < 0 || local390 > arg2.anInt8244 || local450 > arg2.anInt8244 || local330 > arg2.anInt8244;
					if (local6.aShort55 >= 0) {
						if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local6.aShort55).aByte16)) {
							arg2.anInt8240 = 100;
						}
						arg2.method6849(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort57 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort55);
						arg2.anInt8240 = 0;
					} else {
						arg2.method6835(local420, local480, local360, local390, local450, local330, (int) local123, (int) local148, (int) local98, local6.aShort57 & 0xFFFF, local6.aShort58 & 0xFFFF, local6.aShort56 & 0xFFFF);
					}
				}
				if ((local270 - local330) * (local480 - local360) - (local300 - local360) * (local450 - local330) > 0) {
					arg2.aBoolean633 = local270 < 0 || local330 < 0 || local450 < 0 || local270 > arg2.anInt8244 || local330 > arg2.anInt8244 || local450 > arg2.anInt8244;
					if (local6.aShort55 >= 0) {
						if (this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local6.aShort55).aByte16)) {
							arg2.anInt8240 = 100;
						}
						arg2.method6849(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort54 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF, (int) local257, (int) local317, (int) local437, (int) local287, (int) local347, (int) local467, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort55);
						arg2.anInt8240 = 0;
						return;
					}
					arg2.method6835(local300, local360, local480, local270, local330, local450, (int) local73, (int) local98, (int) local148, local6.aShort54 & 0xFFFF, local6.aShort56 & 0xFFFF, local6.aShort58 & 0xFFFF);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class11_Sub3 local3 = this.aClass45_Sub1_2.aClass11_Sub3_1;
		this.anInt1925 = -1;
		this.aFloat35 = local3.aFloat167;
		this.aFloat37 = local3.aFloat169;
		this.aFloat36 = local3.aFloat165;
		this.aFloat41 = local3.aFloat162;
		this.aFloat32 = local3.aFloat170;
		this.aFloat38 = local3.aFloat161;
		this.aFloat40 = local3.aFloat166;
		this.aFloat43 = local3.aFloat168;
		this.aFloat33 = local3.aFloat163;
		this.aFloat34 = local3.aFloat164;
		this.aFloat42 = local3.aFloat160;
		this.aFloat39 = local3.aFloat171;
		for (@Pc(56) int local56 = 0; local56 < arg2 + arg2; local56++) {
			for (@Pc(59) int local59 = 0; local59 < arg2 + arg2; local59++) {
				if (arg3[local56][local59]) {
					@Pc(72) int local72 = arg0 + local56 - arg2;
					@Pc(78) int local78 = arg1 + local59 - arg2;
					if (local72 >= 0 && local72 < super.anInt7854 && local78 >= 0 && local78 < super.anInt7852) {
						this.method6527(local72, local78);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass100ArrayArray1 == null) {
			this.aClass100ArrayArray1 = new Class100[super.anInt7854][super.anInt7852];
			this.aClass255ArrayArray1 = new Class255[super.anInt7854][super.anInt7852];
		} else if (this.aClass153ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static271.anIntArray256[Static249.method3866(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static271.anIntArray256[Static249.method3866(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt7850 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt7850 && arg4[local116] == super.anInt7850) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt7850) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt7850 && arg2[local244] != arg2[0] - super.anInt7850) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt7850 && arg4[local244] != arg4[0] - super.anInt7850) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class100 local334 = new Class100();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt3155 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte33 = (byte) (local334.aByte33 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0 + 1][arg1] && super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0 + 1][arg1 + 1] && super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0][arg1 + 1]) {
				local334.aByte33 = (byte) (local334.aByte33 | 0x1);
			}
			if (local342 == -1 || (local334.aByte33 & 0x2) != 0 || this.aClass45_Sub1_2.anInterface3_12.method4776(local342).aBoolean144) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3152 = Static253.method3900(arg10, local527, Static599.method1739(arg6[local104] >> 8, this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]));
				if (local334.anInt3155 != 0) {
					local334.anInt3152 |= this.aByteArrayArray6[arg0][arg1] + 255 - this.aByteArrayArray5[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3151 = Static253.method3900(arg10, local527, Static599.method1739(arg6[local106] >> 8, this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]));
				if (local334.anInt3155 != 0) {
					local334.anInt3151 |= this.aByteArrayArray6[arg0 + 1][arg1] + 255 - this.aByteArrayArray5[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3154 = Static253.method3900(arg10, local527, Static599.method1739(arg6[local108] >> 8, this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]));
				if (local334.anInt3155 != 0) {
					local334.anInt3154 |= this.aByteArrayArray6[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray5[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt3153 = Static253.method3900(arg10, local527, Static599.method1739(arg6[local110] >> 8, this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]));
				if (local334.anInt3155 != 0) {
					local334.anInt3153 |= this.aByteArrayArray6[arg0][arg1 + 1] + 255 - this.aByteArrayArray5[arg0][arg1 + 1] << 25;
				}
				local334.aShort42 = -1;
			} else {
				local334.anInt3152 = this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				local334.anInt3151 = this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				local334.anInt3154 = this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				local334.anInt3153 = this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				local334.aShort42 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort40 = (short) arg5[local108];
				local334.aShort38 = (short) arg5[local110];
				local334.aShort39 = (short) arg5[local106];
				local334.aShort41 = (short) arg5[local104];
			}
			this.aClass100ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class255 local888 = new Class255();
		local888.aShort114 = (short) arg2.length;
		local888.aShort115 = (short) (arg2.length / 3);
		local888.aShortArray104 = new short[local888.aShort114];
		local888.aShortArray103 = new short[local888.aShort114];
		local888.aShortArray106 = new short[local888.aShort114];
		local888.anIntArray432 = new int[local888.aShort114];
		if (arg5 != null) {
			local888.aShortArray102 = new short[local888.aShort114];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1227) int local1227;
		for (local244 = 0; local244 < local888.aShort114; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt7850) {
				local958 = this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
			} else if (local342 == super.anInt7850 && local527 == super.anInt7850) {
				local958 = this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt7850 && local527 == 0) {
				local958 = this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (super.anInt7850 - local342) + (this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (super.anInt7850 - local342) + (this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt7850 - local527) + local1126 * local527 >> super.anInt7856 * 2;
			}
			local1079 = (arg0 << super.anInt7856) + local342;
			local1126 = (arg1 << super.anInt7856) + local527;
			local888.aShortArray104[local244] = (short) local342;
			local888.aShortArray106[local244] = (short) local527;
			local888.aShortArray103[local244] = (short) (this.method6530(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(arg8[local244]).aBoolean144) {
				local888.anIntArray432[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1227 = 0;
				if (arg5 != null) {
					@Pc(1239) short local1239 = local888.aShortArray102[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1227 = local1239 * 255 / arg11;
						if (local1227 < 0) {
							local1227 = 0;
						} else if (local1227 > 255) {
							local1227 = 255;
						}
					}
				}
				local888.anIntArray432[local244] = Static253.method3900(arg10, local1227, Static599.method1739(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray432[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray432[local244] = 0;
			} else {
				local888.anIntArray432[local244] = local958 << 25;
			}
		}
		@Pc(1297) boolean local1297 = false;
		for (local527 = 0; local527 < local888.aShort115; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(arg8[local527 * 3]).aBoolean144) {
				local1297 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray433 = new int[local888.aShort115];
		}
		if (local1297) {
			local888.aShortArray101 = new short[local888.aShort115];
			local888.aShortArray105 = new short[local888.aShort115];
		}
		for (local958 = 0; local958 < local888.aShort115; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray433[local958] = arg7[local1079] >> 8;
			}
			if (local1297) {
				local1126 = local1079 + 1;
				local1227 = local1126 + 1;
				@Pc(1379) boolean local1379 = false;
				@Pc(1381) boolean local1381 = true;
				@Pc(1385) int local1385 = arg8[local1079];
				if (local1385 == -1 || this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1126];
				if (local1385 == -1 || this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				local1385 = arg8[local1227];
				if (local1385 == -1 || this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
					local1381 = false;
				} else {
					local1379 = true;
				}
				if (local1381) {
					local888.aShortArray101[local958] = (short) local1385;
					local888.aShortArray105[local958] = (short) arg9[local1079];
				} else {
					if (local1379) {
						local1385 = arg8[local1079];
						if (local1385 != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
							local888.anIntArray432[local1079] = Static271.anIntArray256[Static249.method3866(this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1126];
						if (local1385 != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
							local888.anIntArray432[local1126] = Static271.anIntArray256[Static249.method3866(this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
						local1385 = arg8[local1227];
						if (local1385 != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aBoolean144) {
							local888.anIntArray432[local1227] = Static271.anIntArray256[Static249.method3866(this.aClass45_Sub1_2.anInterface3_12.method4776(local1385).aShort21 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray101[local958] = -1;
				}
			}
		}
		this.aClass255ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZLclient!nw;Lclient!tfa;[I[I[I[I)V")
	private void method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class230 arg3, @OriginalArg(4) Class323 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8) {
		@Pc(6) Class100 local6 = this.aClass100ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(527) int local527;
		@Pc(377) int local377;
		@Pc(437) int local437;
		@Pc(497) int local497;
		@Pc(557) int local557;
		@Pc(484) float local484;
		@Pc(544) float local544;
		@Pc(83) float local83;
		@Pc(108) float local108;
		@Pc(133) float local133;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(244) int local244;
		@Pc(56) int local56;
		@Pc(831) int local831;
		@Pc(842) int local842;
		@Pc(851) int local851;
		@Pc(1080) int local1080;
		@Pc(454) float local454;
		@Pc(514) float local514;
		@Pc(364) float local364;
		@Pc(424) float local424;
		if (local6 == null) {
			@Pc(2770) Class255 local2770 = this.aClass255ArrayArray1[arg0][arg1];
			if (local2770 != null) {
				@Pc(2919) float local2919;
				@Pc(2940) float local2940;
				@Pc(2825) float local2825;
				if (this.anInt1925 == -1) {
					for (local527 = 0; local527 < local2770.aShort114; local527++) {
						local24 = local2770.aShortArray104[local527] + (arg0 << super.anInt7856);
						local29 = local2770.aShortArray103[local527];
						local34 = local2770.aShortArray106[local527] + (arg1 << super.anInt7856);
						local2825 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local29 + this.aFloat42 * (float) local34;
						if (local2825 <= (float) this.aClass45_Sub1_2.anInt1238) {
							return;
						}
						arg8[local527] = 0;
						if (arg2) {
							local377 = (int) (local2825 - (float) arg3.anInt6361);
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray102[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean464) {
							local377 = (int) (local2825 - (float) arg3.anInt6361);
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local29 + this.aFloat36 * (float) local34;
						local2940 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local29 + this.aFloat40 * (float) local34;
						arg5[local527] = arg4.anInt8239 + (int) (local2919 * (float) this.aClass45_Sub1_2.anInt1225 / local2825);
						arg6[local527] = arg4.anInt8243 + (int) (local2940 * (float) this.aClass45_Sub1_2.anInt1233 / local2825);
						arg7[local527] = (int) local2825;
					}
				} else {
					for (local527 = 0; local527 < local2770.aShort114; local527++) {
						local24 = local2770.aShortArray104[local527] + (arg0 << super.anInt7856);
						local29 = local2770.aShortArray103[local527];
						local34 = local2770.aShortArray106[local527] + (arg1 << super.anInt7856);
						local2825 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local29 + this.aFloat42 * (float) local34;
						arg8[local527] = 0;
						if (arg2) {
							local377 = this.anInt1925 - arg3.anInt6361;
							if (local377 > 255) {
								local377 = 255;
							}
							if (local377 > 0) {
								arg8[local527] = local377;
								local437 = local2770.aShortArray102[local527] * local377 / 255;
								if (local437 > 0) {
									local29 -= local437;
								}
							}
						} else if (arg3.aBoolean464) {
							local377 = this.anInt1925 - arg3.anInt6361;
							if (local377 > 0) {
								arg8[local527] = local377;
								if (arg8[local527] > 255) {
									arg8[local527] = 255;
								}
							}
						}
						local2919 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local29 + this.aFloat36 * (float) local34;
						local2940 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local29 + this.aFloat40 * (float) local34;
						arg5[local527] = arg4.anInt8239 + (int) (local2919 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
						arg6[local527] = arg4.anInt8243 + (int) (local2940 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
						arg7[local527] = (int) local2825;
					}
				}
				@Pc(3222) int local3222;
				@Pc(3227) int local3227;
				if (local2770.aShortArray101 != null) {
					local527 = super.anIntArrayArray172[arg0][arg1];
					local377 = super.anIntArrayArray172[arg0 + 1][arg1];
					local437 = super.anIntArrayArray172[arg0][arg1 + 1];
					local497 = arg0 * super.anInt7850;
					local557 = local497 + super.anInt7850;
					local3222 = arg1 * super.anInt7850;
					local3227 = local3222 + super.anInt7850;
					local454 = this.aFloat41 + this.aFloat35 * (float) local497 + this.aFloat37 * (float) local527 + this.aFloat36 * (float) local3222;
					local514 = this.aFloat43 + this.aFloat32 * (float) local497 + this.aFloat38 * (float) local527 + this.aFloat40 * (float) local3222;
					local364 = this.aFloat39 + this.aFloat33 * (float) local497 + this.aFloat34 * (float) local527 + this.aFloat42 * (float) local3222;
					local424 = this.aFloat41 + this.aFloat35 * (float) local557 + this.aFloat37 * (float) local377 + this.aFloat36 * (float) local3222;
					local484 = this.aFloat43 + this.aFloat32 * (float) local557 + this.aFloat38 * (float) local377 + this.aFloat40 * (float) local3222;
					local544 = this.aFloat39 + this.aFloat33 * (float) local557 + this.aFloat34 * (float) local377 + this.aFloat42 * (float) local3222;
					local83 = this.aFloat41 + this.aFloat35 * (float) local497 + this.aFloat37 * (float) local437 + this.aFloat36 * (float) local3227;
					local108 = this.aFloat43 + this.aFloat32 * (float) local497 + this.aFloat38 * (float) local437 + this.aFloat40 * (float) local3227;
					local133 = this.aFloat39 + this.aFloat33 * (float) local497 + this.aFloat34 * (float) local437 + this.aFloat42 * (float) local3227;
					@Pc(3422) int local3422;
					@Pc(3515) short local3515;
					if (this.anInt1925 == -1) {
						for (local3422 = 0; local3422 < local2770.aShort115; local3422++) {
							local36 = local3422 * 3;
							local38 = local36 + 1;
							local40 = local38 + 1;
							local42 = arg5[local36];
							local244 = arg5[local38];
							local56 = arg5[local40];
							local831 = arg6[local36];
							local842 = arg6[local38];
							local851 = arg6[local40];
							local1080 = arg8[local36] + arg8[local38] + arg8[local40];
							if ((local42 - local244) * (local851 - local842) - (local831 - local842) * (local56 - local244) > 0) {
								arg4.aBoolean633 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt8244 || local244 > arg4.anInt8244 || local56 > arg4.anInt8244;
								local3515 = local2770.aShortArray101[local3422];
								if (local1080 < 765) {
									if (local3515 != -1 && this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local3515).aByte16)) {
										arg4.anInt8240 = 100;
									}
									if (local1080 > 0) {
										if (local3515 != -1) {
											arg4.method6842(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt6363, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
										} else if ((local2770.anIntArray432[local36] & 0xFFFFFF) != 0) {
											arg4.method6834(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static48.method756(arg8[local36] << 24 | arg3.anInt6363, local2770.anIntArray432[local36]), Static48.method756(arg8[local38] << 24 | arg3.anInt6363, local2770.anIntArray432[local38]), Static48.method756(arg8[local40] << 24 | arg3.anInt6363, local2770.anIntArray432[local40]));
										}
									} else if (local3515 != -1) {
										arg4.method6849(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, (int) local364, (int) local544, (int) local133, local3515);
									} else if ((local2770.anIntArray432[local36] & 0xFFFFFF) != 0) {
										arg4.method6834(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40]);
									}
									arg4.anInt8240 = 0;
								} else {
									arg4.method6839(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt6363);
								}
							}
						}
						return;
					}
					for (local3422 = 0; local3422 < local2770.aShort115; local3422++) {
						local36 = local3422 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg5[local36];
						local244 = arg5[local38];
						local56 = arg5[local40];
						local831 = arg6[local36];
						local842 = arg6[local38];
						local851 = arg6[local40];
						local1080 = arg8[local36] + arg8[local38] + arg8[local40];
						if ((local42 - local244) * (local851 - local842) - (local831 - local842) * (local56 - local244) > 0) {
							arg4.aBoolean633 = local42 < 0 || local244 < 0 || local56 < 0 || local42 > arg4.anInt8244 || local244 > arg4.anInt8244 || local56 > arg4.anInt8244;
							local3515 = local2770.aShortArray101[local3422];
							if (local1080 < 765) {
								if (local3515 != -1 && this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local3515).aByte16)) {
									arg4.anInt8240 = 100;
								}
								if (local1080 > 0) {
									if (local3515 != -1) {
										arg4.method6842(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt6363, arg8[local36], arg8[local38], arg8[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt1925, this.anInt1925, this.anInt1925, local3515);
									} else if ((local2770.anIntArray432[local36] & 0xFFFFFF) != 0) {
										arg4.method6834(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], Static48.method756(arg8[local36] << 24 | arg3.anInt6363, local2770.anIntArray432[local36]), Static48.method756(arg8[local38] << 24 | arg3.anInt6363, local2770.anIntArray432[local38]), Static48.method756(arg8[local40] << 24 | arg3.anInt6363, local2770.anIntArray432[local40]));
									}
								} else if (local3515 != -1) {
									arg4.method6849(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40], (int) local454, (int) local424, (int) local83, (int) local514, (int) local484, (int) local108, this.anInt1925, this.anInt1925, this.anInt1925, local3515);
								} else if ((local2770.anIntArray432[local36] & 0xFFFFFF) != 0) {
									arg4.method6834(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], local2770.anIntArray432[local36], local2770.anIntArray432[local38], local2770.anIntArray432[local40]);
								}
								arg4.anInt8240 = 0;
							} else {
								arg4.method6839(local831, local842, local851, local42, local244, local56, arg7[local36], arg7[local38], arg7[local40], arg3.anInt6363);
							}
						}
					}
					return;
				}
				for (local527 = 0; local527 < local2770.aShort115; local527++) {
					local377 = local527 * 3;
					local437 = local377 + 1;
					local497 = local437 + 1;
					local557 = arg5[local377];
					local3222 = arg5[local437];
					local3227 = arg5[local497];
					@Pc(4177) int local4177 = arg6[local377];
					@Pc(4181) int local4181 = arg6[local437];
					@Pc(4185) int local4185 = arg6[local497];
					@Pc(4197) int local4197 = arg8[local377] + arg8[local437] + arg8[local497];
					if ((local557 - local3222) * (local4185 - local4181) - (local4177 - local4181) * (local3227 - local3222) > 0) {
						arg4.aBoolean633 = local557 < 0 || local3222 < 0 || local3227 < 0 || local557 > arg4.anInt8244 || local3222 > arg4.anInt8244 || local3227 > arg4.anInt8244;
						if (local4197 >= 765) {
							arg4.method6839(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], arg3.anInt6363);
						} else if (local4197 > 0) {
							if ((local2770.anIntArray432[local377] & 0xFFFFFF) != 0) {
								arg4.method6834(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], Static253.method3900(arg3.anInt6363, arg8[local377], local2770.anIntArray432[local377]), Static253.method3900(arg3.anInt6363, arg8[local437], local2770.anIntArray432[local437]), Static253.method3900(arg3.anInt6363, arg8[local497], local2770.anIntArray432[local497]));
							}
						} else if ((local2770.anIntArray432[local377] & 0xFFFFFF) != 0) {
							arg4.method6834(local4177, local4181, local4185, local557, local3222, local3227, arg7[local377], arg7[local437], arg7[local497], local2770.anIntArray432[local377], local2770.anIntArray432[local437], local2770.anIntArray432[local497]);
						}
					}
				}
			}
		} else if ((local6.aByte33 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt7850;
			local24 = local19 + super.anInt7850;
			local29 = arg1 * super.anInt7850;
			local34 = local29 + super.anInt7850;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			@Pc(347) int local347;
			@Pc(407) int local407;
			@Pc(467) int local467;
			@Pc(334) float local334;
			@Pc(394) float local394;
			@Pc(158) float local158;
			if ((local6.aByte33 & 0x1) == 0 || arg2) {
				local56 = super.anIntArrayArray172[arg0][arg1];
				local831 = super.anIntArrayArray172[arg0 + 1][arg1];
				local842 = super.anIntArrayArray172[arg0 + 1][arg1 + 1];
				local851 = super.anIntArrayArray172[arg0][arg1 + 1];
				if (this.anInt1925 == -1) {
					local83 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local56 + this.aFloat42 * (float) local29;
					if (local83 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local108 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local831 + this.aFloat42 * (float) local29;
					if (local108 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local133 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local842 + this.aFloat42 * (float) local34;
					if (local133 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local158 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local851 + this.aFloat42 * (float) local34;
					if (local158 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
				} else {
					local83 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local56 + this.aFloat42 * (float) local29;
					local108 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local831 + this.aFloat42 * (float) local29;
					local133 = this.aFloat39 + this.aFloat33 * (float) local24 + this.aFloat34 * (float) local842 + this.aFloat42 * (float) local34;
					local158 = this.aFloat39 + this.aFloat33 * (float) local19 + this.aFloat34 * (float) local851 + this.aFloat42 * (float) local34;
				}
				if (arg2) {
					local244 = (int) (local83 - (float) arg3.anInt6361);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local36 = local244;
						local1080 = local6.aShort41 * local244 / 255;
						if (local1080 > 0) {
							local56 -= local1080;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt6361);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local38 = local244;
						local1080 = local6.aShort39 * local244 / 255;
						if (local1080 > 0) {
							local831 -= local1080;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt6361);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local40 = local244;
						local1080 = local6.aShort40 * local244 / 255;
						if (local1080 > 0) {
							local842 -= local1080;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt6361);
					if (local244 > 255) {
						local244 = 255;
					}
					if (local244 > 0) {
						local42 = local244;
						local1080 = local6.aShort38 * local244 / 255;
						if (local1080 > 0) {
							local851 -= local1080;
						}
					}
				} else if (arg3.aBoolean464) {
					local244 = (int) (local83 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				if (this.anInt1925 == -1) {
					local334 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local56 + this.aFloat36 * (float) local29;
					local347 = arg4.anInt8239 + (int) (local334 * (float) this.aClass45_Sub1_2.anInt1225 / local83);
					local364 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local56 + this.aFloat40 * (float) local29;
					local377 = arg4.anInt8243 + (int) (local364 * (float) this.aClass45_Sub1_2.anInt1233 / local83);
					local394 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local831 + this.aFloat36 * (float) local29;
					local407 = arg4.anInt8239 + (int) (local394 * (float) this.aClass45_Sub1_2.anInt1225 / local108);
					local424 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local831 + this.aFloat40 * (float) local29;
					local437 = arg4.anInt8243 + (int) (local424 * (float) this.aClass45_Sub1_2.anInt1233 / local108);
					local454 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local842 + this.aFloat36 * (float) local34;
					local467 = arg4.anInt8239 + (int) (local454 * (float) this.aClass45_Sub1_2.anInt1225 / local133);
					local484 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local842 + this.aFloat40 * (float) local34;
					local497 = arg4.anInt8243 + (int) (local484 * (float) this.aClass45_Sub1_2.anInt1233 / local133);
					local514 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local851 + this.aFloat36 * (float) local34;
					local527 = arg4.anInt8239 + (int) (local514 * (float) this.aClass45_Sub1_2.anInt1225 / local158);
					local544 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local851 + this.aFloat40 * (float) local34;
					local557 = arg4.anInt8243 + (int) (local544 * (float) this.aClass45_Sub1_2.anInt1233 / local158);
				} else {
					local334 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local56 + this.aFloat36 * (float) local29;
					local347 = arg4.anInt8239 + (int) (local334 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local364 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local56 + this.aFloat40 * (float) local29;
					local377 = arg4.anInt8243 + (int) (local364 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local394 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local831 + this.aFloat36 * (float) local29;
					local407 = arg4.anInt8239 + (int) (local394 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local424 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local831 + this.aFloat40 * (float) local29;
					local437 = arg4.anInt8243 + (int) (local424 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local454 = this.aFloat41 + this.aFloat35 * (float) local24 + this.aFloat37 * (float) local842 + this.aFloat36 * (float) local34;
					local467 = arg4.anInt8239 + (int) (local454 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local484 = this.aFloat43 + this.aFloat32 * (float) local24 + this.aFloat38 * (float) local842 + this.aFloat40 * (float) local34;
					local497 = arg4.anInt8243 + (int) (local484 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local514 = this.aFloat41 + this.aFloat35 * (float) local19 + this.aFloat37 * (float) local851 + this.aFloat36 * (float) local34;
					local527 = arg4.anInt8239 + (int) (local514 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local544 = this.aFloat43 + this.aFloat32 * (float) local19 + this.aFloat38 * (float) local851 + this.aFloat40 * (float) local34;
					local557 = arg4.anInt8243 + (int) (local544 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
				}
			} else {
				local56 = super.anIntArrayArray172[arg0][arg1];
				@Pc(62) float local62 = this.aFloat34 * (float) local56;
				if (this.anInt1925 == -1) {
					local83 = this.aFloat39 + this.aFloat33 * (float) local19 + local62 + this.aFloat42 * (float) local29;
					if (local83 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local108 = this.aFloat39 + this.aFloat33 * (float) local24 + local62 + this.aFloat42 * (float) local29;
					if (local108 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local133 = this.aFloat39 + this.aFloat33 * (float) local24 + local62 + this.aFloat42 * (float) local34;
					if (local133 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
					local158 = this.aFloat39 + this.aFloat33 * (float) local19 + local62 + this.aFloat42 * (float) local34;
					if (local158 <= (float) this.aClass45_Sub1_2.anInt1238) {
						return;
					}
				} else {
					local83 = this.aFloat39 + this.aFloat33 * (float) local19 + local62 + this.aFloat42 * (float) local29;
					local108 = this.aFloat39 + this.aFloat33 * (float) local24 + local62 + this.aFloat42 * (float) local29;
					local133 = this.aFloat39 + this.aFloat33 * (float) local24 + local62 + this.aFloat42 * (float) local34;
					local158 = this.aFloat39 + this.aFloat33 * (float) local19 + local62 + this.aFloat42 * (float) local34;
				}
				if (arg3.aBoolean464) {
					local244 = (int) (local83 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local36 = local244;
						if (local244 > 255) {
							local36 = 255;
						}
					}
					local244 = (int) (local108 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local38 = local244;
						if (local244 > 255) {
							local38 = 255;
						}
					}
					local244 = (int) (local133 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local40 = local244;
						if (local244 > 255) {
							local40 = 255;
						}
					}
					local244 = (int) (local158 - (float) arg3.anInt6361);
					if (local244 > 0) {
						local42 = local244;
						if (local244 > 255) {
							local42 = 255;
						}
					}
				}
				@Pc(307) float local307 = this.aFloat37 * (float) local56;
				@Pc(313) float local313 = this.aFloat38 * (float) local56;
				if (this.anInt1925 == -1) {
					local334 = this.aFloat41 + this.aFloat35 * (float) local19 + local307 + this.aFloat36 * (float) local29;
					local347 = arg4.anInt8239 + (int) (local334 * (float) this.aClass45_Sub1_2.anInt1225 / local83);
					local364 = this.aFloat43 + this.aFloat32 * (float) local19 + local313 + this.aFloat40 * (float) local29;
					local377 = arg4.anInt8243 + (int) (local364 * (float) this.aClass45_Sub1_2.anInt1233 / local83);
					local394 = this.aFloat41 + this.aFloat35 * (float) local24 + local307 + this.aFloat36 * (float) local29;
					local407 = arg4.anInt8239 + (int) (local394 * (float) this.aClass45_Sub1_2.anInt1225 / local108);
					local424 = this.aFloat43 + this.aFloat32 * (float) local24 + local313 + this.aFloat40 * (float) local29;
					local437 = arg4.anInt8243 + (int) (local424 * (float) this.aClass45_Sub1_2.anInt1233 / local108);
					local454 = this.aFloat41 + this.aFloat35 * (float) local24 + local307 + this.aFloat36 * (float) local34;
					local467 = arg4.anInt8239 + (int) (local454 * (float) this.aClass45_Sub1_2.anInt1225 / local133);
					local484 = this.aFloat43 + this.aFloat32 * (float) local24 + local313 + this.aFloat40 * (float) local34;
					local497 = arg4.anInt8243 + (int) (local484 * (float) this.aClass45_Sub1_2.anInt1233 / local133);
					local514 = this.aFloat41 + this.aFloat35 * (float) local19 + local307 + this.aFloat36 * (float) local34;
					local527 = arg4.anInt8239 + (int) (local514 * (float) this.aClass45_Sub1_2.anInt1225 / local158);
					local544 = this.aFloat43 + this.aFloat32 * (float) local19 + local313 + this.aFloat40 * (float) local34;
					local557 = arg4.anInt8243 + (int) (local544 * (float) this.aClass45_Sub1_2.anInt1233 / local158);
				} else {
					local334 = this.aFloat41 + this.aFloat35 * (float) local19 + local307 + this.aFloat36 * (float) local29;
					local347 = arg4.anInt8239 + (int) (local334 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local364 = this.aFloat43 + this.aFloat32 * (float) local19 + local313 + this.aFloat40 * (float) local29;
					local377 = arg4.anInt8243 + (int) (local364 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local394 = this.aFloat41 + this.aFloat35 * (float) local24 + local307 + this.aFloat36 * (float) local29;
					local407 = arg4.anInt8239 + (int) (local394 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local424 = this.aFloat43 + this.aFloat32 * (float) local24 + local313 + this.aFloat40 * (float) local29;
					local437 = arg4.anInt8243 + (int) (local424 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local454 = this.aFloat41 + this.aFloat35 * (float) local24 + local307 + this.aFloat36 * (float) local34;
					local467 = arg4.anInt8239 + (int) (local454 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local484 = this.aFloat43 + this.aFloat32 * (float) local24 + local313 + this.aFloat40 * (float) local34;
					local497 = arg4.anInt8243 + (int) (local484 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
					local514 = this.aFloat41 + this.aFloat35 * (float) local19 + local307 + this.aFloat36 * (float) local34;
					local527 = arg4.anInt8239 + (int) (local514 * (float) this.aClass45_Sub1_2.anInt1225 / (float) this.anInt1925);
					local544 = this.aFloat43 + this.aFloat32 * (float) local19 + local313 + this.aFloat40 * (float) local34;
					local557 = arg4.anInt8243 + (int) (local544 * (float) this.aClass45_Sub1_2.anInt1233 / (float) this.anInt1925);
				}
			}
			@Pc(1825) boolean local1825 = local6.aShort42 != -1 && this.method1738(this.aClass45_Sub1_2.anInterface3_12.method4776(local6.aShort42).aByte16);
			if (this.anInt1925 == -1) {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean633 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt8244 || local527 > arg4.anInt8244 || local407 > arg4.anInt8244;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt8240 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort42 >= 0) {
								arg4.method6842(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt6363, local40, local42, local38, local6.anInt3154, local6.anInt3153, local6.anInt3151, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort42);
							} else {
								arg4.method6834(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static48.method756(local40 << 24 | arg3.anInt6363, local6.anInt3154), Static48.method756(local42 << 24 | arg3.anInt6363, local6.anInt3153), Static48.method756(local38 << 24 | arg3.anInt6363, local6.anInt3151));
							}
						} else if (local6.aShort42 >= 0) {
							arg4.method6849(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3154, local6.anInt3153, local6.anInt3151, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, (int) local133, (int) local158, (int) local108, local6.aShort42);
						} else {
							arg4.method6834(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3154, local6.anInt3153, local6.anInt3151);
						}
						arg4.anInt8240 = 0;
					} else {
						arg4.method6839(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt6363);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean633 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt8244 || local407 > arg4.anInt8244 || local527 > arg4.anInt8244;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt8240 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort42 >= 0) {
								arg4.method6842(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt6363, local36, local38, local42, local6.anInt3152, local6.anInt3151, local6.anInt3153, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort42);
							} else {
								arg4.method6834(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static48.method756(local36 << 24 | arg3.anInt6363, local6.anInt3152), Static48.method756(local38 << 24 | arg3.anInt6363, local6.anInt3151), Static48.method756(local42 << 24 | arg3.anInt6363, local6.anInt3153));
							}
						} else if (local6.aShort42 >= 0) {
							arg4.method6849(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3152, local6.anInt3151, local6.anInt3153, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, (int) local83, (int) local108, (int) local158, local6.aShort42);
						} else {
							arg4.method6834(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3152, local6.anInt3151, local6.anInt3153);
						}
						arg4.anInt8240 = 0;
						return;
					}
					arg4.method6839(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt6363);
					return;
				}
			} else {
				local831 = local38 + local40 + local42;
				if ((local467 - local527) * (local437 - local557) - (local497 - local557) * (local407 - local527) > 0) {
					arg4.aBoolean633 = local467 < 0 || local527 < 0 || local407 < 0 || local467 > arg4.anInt8244 || local527 > arg4.anInt8244 || local407 > arg4.anInt8244;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt8240 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort42 >= 0) {
								arg4.method6842(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt6363, local40, local42, local38, local6.anInt3154, local6.anInt3153, local6.anInt3151, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort42);
							} else {
								arg4.method6834(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, Static48.method756(local40 << 24 | arg3.anInt6363, local6.anInt3154), Static48.method756(local42 << 24 | arg3.anInt6363, local6.anInt3153), Static48.method756(local38 << 24 | arg3.anInt6363, local6.anInt3151));
							}
						} else if (local6.aShort42 >= 0) {
							arg4.method6849(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3154, local6.anInt3153, local6.anInt3151, (int) local454, (int) local514, (int) local394, (int) local484, (int) local544, (int) local424, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort42);
						} else {
							arg4.method6834(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, local6.anInt3154, local6.anInt3153, local6.anInt3151);
						}
						arg4.anInt8240 = 0;
					} else {
						arg4.method6839(local497, local557, local437, local467, local527, local407, (int) local133, (int) local158, (int) local108, arg3.anInt6363);
					}
				}
				local831 = local36 + local38 + local42;
				if ((local347 - local407) * (local557 - local437) - (local377 - local437) * (local527 - local407) > 0) {
					arg4.aBoolean633 = local347 < 0 || local407 < 0 || local527 < 0 || local347 > arg4.anInt8244 || local407 > arg4.anInt8244 || local527 > arg4.anInt8244;
					if (local831 < 765) {
						if (local1825) {
							arg4.anInt8240 = 100;
						}
						if (local831 > 0) {
							if (local6.aShort42 >= 0) {
								arg4.method6842(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt6363, local36, local38, local42, local6.anInt3152, local6.anInt3151, local6.anInt3153, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort42);
							} else {
								arg4.method6834(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, Static48.method756(local36 << 24 | arg3.anInt6363, local6.anInt3152), Static48.method756(local38 << 24 | arg3.anInt6363, local6.anInt3151), Static48.method756(local42 << 24 | arg3.anInt6363, local6.anInt3153));
							}
						} else if (local6.aShort42 >= 0) {
							arg4.method6849(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3152, local6.anInt3151, local6.anInt3153, (int) local334, (int) local394, (int) local514, (int) local364, (int) local424, (int) local544, this.anInt1925, this.anInt1925, this.anInt1925, local6.aShort42);
						} else {
							arg4.method6834(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, local6.anInt3152, local6.anInt3151, local6.anInt3153);
						}
						arg4.anInt8240 = 0;
						return;
					}
					arg4.method6839(local377, local437, local557, local347, local407, local527, (int) local83, (int) local108, (int) local158, arg3.anInt6363);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(IIIIIII[[ZLclient!nw;Lclient!tfa;[I[I)V")
	private void method1742(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class230 arg5, @OriginalArg(9) Class323 arg6, @OriginalArg(10) int[] arg7, @OriginalArg(11) int[] arg8) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		@Pc(14) boolean local14 = arg5.aBoolean462;
		this.aClass45_Sub1_2.ZA(false);
		arg6.aBoolean629 = false;
		arg6.aBoolean630 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local7;
		for (@Pc(32) int local32 = arg0; local32 < arg2; local32++) {
			for (@Pc(35) int local35 = arg1; local35 < arg3; local35++) {
				if (arg4[local32 - arg0][local35 - arg1]) {
					@Pc(79) int local79;
					if (this.aClass153ArrayArray1[local32][local35] != null) {
						@Pc(60) Class153 local60 = this.aClass153ArrayArray1[local32][local35];
						if (local60.aShort55 != -1 && (local60.aByte43 & 0x2) == 0 && local60.anInt4143 == -1) {
							local79 = this.aClass45_Sub1_2.method1180(local60.aShort55);
							arg6.method6835(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, Static446.method6237(local79, local60.aShort57 & 0xFFFF), Static446.method6237(local79, local60.aShort58 & 0xFFFF), Static446.method6237(local79, local60.aShort56 & 0xFFFF));
							arg6.method6835(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, Static446.method6237(local79, local60.aShort54 & 0xFFFF), Static446.method6237(local79, local60.aShort56 & 0xFFFF), Static446.method6237(local79, local60.aShort58 & 0xFFFF));
						} else if (local60.anInt4143 == -1) {
							arg6.method6835(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local60.aShort57 & 0xFFFF, local60.aShort58 & 0xFFFF, local60.aShort56 & 0xFFFF);
							arg6.method6835(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local60.aShort54 & 0xFFFF, local60.aShort56 & 0xFFFF, local60.aShort58 & 0xFFFF);
						} else {
							local79 = local60.anInt4143;
							arg6.method6835(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, 100, 100, 100, local79, local79, local79);
							arg6.method6835(local30, local30, local30 - 4, local26, local26 + 4, local26, 100, 100, 100, local79, local79, local79);
						}
					} else if (this.aClass145ArrayArray1[local32][local35] != null) {
						@Pc(277) Class145 local277 = this.aClass145ArrayArray1[local32][local35];
						for (local79 = 0; local79 < local277.aShort52; local79++) {
							arg7[local79] = local26 + local277.aShortArray63[local79] * 4 / super.anInt7850;
							arg8[local79] = local30 - local277.aShortArray59[local79] * 4 / super.anInt7850;
						}
						for (@Pc(315) int local315 = 0; local315 < local277.aShort51; local315++) {
							@Pc(321) short local321 = local277.aShortArray56[local315];
							@Pc(326) short local326 = local277.aShortArray57[local315];
							@Pc(331) short local331 = local277.aShortArray64[local315];
							@Pc(335) int local335 = arg7[local321];
							@Pc(339) int local339 = arg7[local326];
							@Pc(343) int local343 = arg7[local331];
							@Pc(347) int local347 = arg8[local321];
							@Pc(351) int local351 = arg8[local326];
							@Pc(355) int local355 = arg8[local331];
							@Pc(369) int local369;
							if (local277.anIntArray208 != null && local277.anIntArray208[local315] != -1) {
								local369 = local277.anIntArray208[local315];
								arg6.method6835(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static446.method6237(local369, local277.aShortArray58[local321]), Static446.method6237(local369, local277.aShortArray58[local326]), Static446.method6237(local369, local277.aShortArray58[local331]));
							} else if (local277.aShortArray61 == null || local277.aShortArray61[local315] == -1) {
								local369 = local277.anIntArray209[local315];
								arg6.method6835(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static446.method6237(local369, local277.aShortArray58[local321]), Static446.method6237(local369, local277.aShortArray58[local326]), Static446.method6237(local369, local277.aShortArray58[local331]));
							} else {
								local369 = this.aClass45_Sub1_2.method1180(local277.aShortArray61[local315]);
								arg6.method6835(local347, local351, local355, local335, local339, local343, 100, 100, 100, Static446.method6237(local369, local277.aShortArray58[local321]), Static446.method6237(local369, local277.aShortArray58[local326]), Static446.method6237(local369, local277.aShortArray58[local331]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local7;
			local26 += 4;
		}
		arg6.aBoolean629 = true;
		this.aClass45_Sub1_2.ZA(local14);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass153ArrayArray1 == null) {
			this.aClass153ArrayArray1 = new Class153[super.anInt7854][super.anInt7852];
			this.aClass145ArrayArray1 = new Class145[super.anInt7854][super.anInt7852];
		} else if (this.aClass100ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt7850 || local70 != 0 && local70 != super.anInt7850) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class145 local95 = new Class145();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort52 = local99;
			local95.aShortArray58 = new short[local99];
			local95.aShortArray63 = new short[local99];
			local95.aShortArray60 = new short[local99];
			local95.aShortArray59 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt7850) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local129 == super.anInt7850 && local133 == super.anInt7850) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt7850 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (super.anInt7850 - local129) + (this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (super.anInt7850 - local129) + (this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray58[local124] = (short) (local288 * (super.anInt7850 - local133) + local335 * local133 >> super.anInt7856 * 2);
				}
				local288 = (arg0 << super.anInt7856) + local129;
				local335 = (arg1 << super.anInt7856) + local133;
				local95.aShortArray63[local124] = (short) local129;
				local95.aShortArray59[local124] = (short) local133;
				local95.aShortArray60[local124] = (short) (this.method6530(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray58[local124] < 2) {
					local95.aShortArray58[local124] = 2;
				}
			}
			@Pc(416) boolean local416 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass45_Sub1_2.anInterface3_12.method4776(arg11[local288]).aBoolean144) {
					local416 = true;
				}
			}
			local95.anIntArray209 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray208 = new int[local133];
			}
			local95.aShortArray56 = new short[local133];
			local95.aShortArray57 = new short[local133];
			local95.aShortArray64 = new short[local133];
			if (local416) {
				local95.aShortArray61 = new short[local133];
				local95.aShortArray62 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray209[local95.aShort51] = Static249.method3866(arg9[local335]);
					} else {
						local95.anIntArray209[local95.aShort51] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray208[local95.aShort51] = -1;
						} else {
							local95.anIntArray208[local95.aShort51] = Static249.method3866(arg10[local335]);
						}
					}
					local95.aShortArray56[local95.aShort51] = (short) arg6[local335];
					local95.aShortArray57[local95.aShort51] = (short) arg7[local335];
					local95.aShortArray64[local95.aShort51] = (short) arg8[local335];
					if (local416) {
						if (arg11[local335] == -1 || this.aClass45_Sub1_2.anInterface3_12.method4776(arg11[local335]).aBoolean144) {
							local95.aShortArray61[local95.aShort51] = -1;
						} else {
							local95.aShortArray61[local95.aShort51] = (short) arg11[local335];
							local95.aShortArray62[local95.aShort51] = (short) arg12[local335];
						}
					}
					local95.aShort51++;
				}
			}
			this.aClass145ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(645) Class153 local645 = new Class153();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local645.anInt4143 = Static446.method6237(Static249.method3866(arg10[0]), this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local64 == -1) {
					local645.aByte43 = (byte) (local645.aByte43 | 0x2);
				}
			}
			if (super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0 + 1][arg1] && super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0 + 1][arg1 + 1] && super.anIntArrayArray172[arg0][arg1] == super.anIntArrayArray172[arg0][arg1 + 1]) {
				local645.aByte43 = (byte) (local645.aByte43 | 0x1);
			}
			if (local70 == -1 || (local645.aByte43 & 0x2) != 0 || this.aClass45_Sub1_2.anInterface3_12.method4776(local70).aBoolean144) {
				@Pc(846) short local846 = Static249.method3866(local64);
				local645.aShort54 = (short) Static446.method6237(local846, this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local645.aShort56 = (short) Static446.method6237(local846, this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local645.aShort57 = (short) Static446.method6237(local846, this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local645.aShort58 = (short) Static446.method6237(local846, this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local645.aShort55 = -1;
			} else {
				local645.aShort54 = (short) (this.aByteArrayArray5[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local645.aShort56 = (short) (this.aByteArrayArray5[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local645.aShort57 = (short) (this.aByteArrayArray5[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local645.aShort58 = (short) (this.aByteArrayArray5[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local645.aShort55 = (short) local70;
			}
			this.aClass153ArrayArray1[arg0][arg1] = local645;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub13 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub13 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray6[arg0][arg1] < arg2) {
			this.aByteArrayArray6[arg0][arg1] = (byte) arg2;
		}
	}
}
