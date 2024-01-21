import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub1_Sub4_Sub1 extends Class1_Sub2_Sub1_Sub4 {

	@OriginalMember(owner = "client!jh", name = "kb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!jh", name = "lb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!jh", name = "nb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!jh", name = "pb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!jh", name = "qb", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!jh", name = "sb", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!jh", name = "tb", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!jh", name = "ub", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!jh", name = "vb", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!jh", name = "xb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!jh", name = "yb", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!jh", name = "Ab", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!jh", name = "rb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!jh", name = "Sb", descriptor = "I")
	private int anInt1946 = 0;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!td;IIIII)V")
	public Class1_Sub2_Sub1_Sub4_Sub1(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2749();
		arg0.method2746();
		super.anInt1944 = arg0.anInt3618;
		super.anIntArray186 = arg0.anIntArray376;
		super.anIntArray188 = arg0.anIntArray375;
		super.anIntArray187 = arg0.anIntArray378;
		super.anInt1943 = arg0.anInt3615;
		this.anIntArray195 = arg0.anIntArray380;
		this.anIntArray198 = arg0.anIntArray379;
		this.anIntArray199 = arg0.anIntArray384;
		this.aByteArray12 = arg0.aByteArray31;
		this.aByteArray13 = arg0.aByteArray36;
		this.aByte3 = arg0.aByte9;
		super.anIntArrayArray14 = arg0.anIntArrayArray33;
		super.anIntArrayArray15 = arg0.anIntArrayArray32;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray192 = new int[super.anInt1943];
		this.anIntArray194 = new int[super.anInt1943];
		this.anIntArray197 = new int[super.anInt1943];
		@Pc(109) int local109;
		if (arg0.aShortArray48 == null) {
			this.aShortArray21 = null;
		} else {
			this.aShortArray21 = new short[super.anInt1943];
			for (local109 = 0; local109 < super.anInt1943; local109++) {
				@Pc(115) short local115 = arg0.aShortArray48[local109];
				if (local115 != -1 && Static22.anInterface3_2.method1029(local115)) {
					this.aShortArray21[local109] = local115;
				} else {
					this.aShortArray21[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt3616 > 0 && arg0.aByteArray34 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt3616];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1943; local155++) {
				if (arg0.aByteArray34[local155] != -1) {
					local153[arg0.aByteArray34[local155] & 0xFF]++;
				}
			}
			this.anInt1946 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt3616; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray38[local184] == 0) {
					this.anInt1946++;
				}
			}
			this.anIntArray193 = new int[this.anInt1946];
			this.anIntArray196 = new int[this.anInt1946];
			this.anIntArray191 = new int[this.anInt1946];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt3616; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray38[local224] == 0) {
					this.anIntArray193[local222] = arg0.aShortArray44[local224] & 0xFFFF;
					this.anIntArray196[local222] = arg0.aShortArray49[local224] & 0xFFFF;
					this.anIntArray191[local222] = arg0.aShortArray42[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray14 = new byte[super.anInt1943];
			for (local286 = 0; local286 < super.anInt1943; local286++) {
				if (arg0.aByteArray34[local286] == -1) {
					this.aByteArray14[local286] = -1;
				} else {
					this.aByteArray14[local286] = (byte) local153[arg0.aByteArray34[local286] & 0xFF];
					if (this.aByteArray14[local286] == -1 && this.aShortArray21 != null) {
						this.aShortArray21[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1943; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray39 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray39[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray36 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray36[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray21 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray21[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class58 local408;
			@Pc(569) Class57 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray46[local109] & 0xFFFF;
					if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray195[local109]] == null) {
						local408 = arg0.aClass58Array2[this.anIntArray195[local109]];
					} else {
						local408 = arg0.aClass58Array1[this.anIntArray195[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
					this.anIntArray192[local109] = Static84.method1466(local389, local286);
					if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray198[local109]] == null) {
						local408 = arg0.aClass58Array2[this.anIntArray198[local109]];
					} else {
						local408 = arg0.aClass58Array1[this.anIntArray198[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
					this.anIntArray194[local109] = Static84.method1466(local389, local286);
					if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray199[local109]] == null) {
						local408 = arg0.aClass58Array2[this.anIntArray199[local109]];
					} else {
						local408 = arg0.aClass58Array1[this.anIntArray199[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
					this.anIntArray197[local109] = Static84.method1466(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass57Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt2506 + arg4 * local569.anInt2510 + arg5 * local569.anInt2511) / (local84 + local84 / 2);
					this.anIntArray192[local109] = Static84.method1466(arg0.aShortArray46[local109] & 0xFFFF, local286);
					this.anIntArray197[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray192[local109] = 128;
					this.anIntArray197[local109] = -1;
				} else {
					this.anIntArray197[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray195[local109]] == null) {
					local408 = arg0.aClass58Array2[this.anIntArray195[local109]];
				} else {
					local408 = arg0.aClass58Array1[this.anIntArray195[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
				this.anIntArray192[local109] = Static84.method1464(local286);
				if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray198[local109]] == null) {
					local408 = arg0.aClass58Array2[this.anIntArray198[local109]];
				} else {
					local408 = arg0.aClass58Array1[this.anIntArray198[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
				this.anIntArray194[local109] = Static84.method1464(local286);
				if (arg0.aClass58Array1 == null || arg0.aClass58Array1[this.anIntArray199[local109]] == null) {
					local408 = arg0.aClass58Array2[this.anIntArray199[local109]];
				} else {
					local408 = arg0.aClass58Array1[this.anIntArray199[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2515 + arg4 * local408.anInt2521 + arg5 * local408.anInt2517) / (local84 * local408.anInt2522);
				this.anIntArray197[local109] = Static84.method1464(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass57Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt2506 + arg4 * local569.anInt2510 + arg5 * local569.anInt2511) / (local84 + local84 / 2);
				this.anIntArray192[local109] = Static84.method1464(local286);
				this.anIntArray197[local109] = -1;
			} else {
				this.anIntArray197[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([Lclient!jh;I)V")
	private Class1_Sub2_Sub1_Sub4_Sub1(@OriginalArg(0) Class1_Sub2_Sub1_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1944 = 0;
		super.anInt1943 = 0;
		this.anInt1946 = 0;
		this.aByte3 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class1_Sub2_Sub1_Sub4_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1944 += local34.anInt1944;
				super.anInt1943 += local34.anInt1943;
				this.anInt1946 += local34.anInt1946;
				if (local34.aByteArray12 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local34.aByte3;
					}
					if (this.aByte3 != local34.aByte3) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray13 != null;
				local13 |= local34.aShortArray21 != null;
				local15 |= local34.aByteArray14 != null;
			}
		}
		super.anIntArray186 = new int[super.anInt1944];
		super.anIntArray188 = new int[super.anInt1944];
		super.anIntArray187 = new int[super.anInt1944];
		this.anIntArray195 = new int[super.anInt1943];
		this.anIntArray198 = new int[super.anInt1943];
		this.anIntArray199 = new int[super.anInt1943];
		this.anIntArray192 = new int[super.anInt1943];
		this.anIntArray194 = new int[super.anInt1943];
		this.anIntArray197 = new int[super.anInt1943];
		if (local9) {
			this.aByteArray12 = new byte[super.anInt1943];
		}
		if (local11) {
			this.aByteArray13 = new byte[super.anInt1943];
		}
		if (local13) {
			this.aShortArray21 = new short[super.anInt1943];
		}
		if (local15) {
			this.aByteArray14 = new byte[super.anInt1943];
		}
		if (this.anInt1946 > 0) {
			this.anIntArray193 = new int[this.anInt1946];
			this.anIntArray196 = new int[this.anInt1946];
			this.anIntArray191 = new int[this.anInt1946];
		}
		super.anInt1944 = 0;
		super.anInt1943 = 0;
		this.anInt1946 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class1_Sub2_Sub1_Sub4_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1943; local220++) {
					this.anIntArray195[super.anInt1943] = local216.anIntArray195[local220] + super.anInt1944;
					this.anIntArray198[super.anInt1943] = local216.anIntArray198[local220] + super.anInt1944;
					this.anIntArray199[super.anInt1943] = local216.anIntArray199[local220] + super.anInt1944;
					this.anIntArray192[super.anInt1943] = local216.anIntArray192[local220];
					this.anIntArray194[super.anInt1943] = local216.anIntArray194[local220];
					this.anIntArray197[super.anInt1943] = local216.anIntArray197[local220];
					if (local9) {
						if (local216.aByteArray12 == null) {
							this.aByteArray12[super.anInt1943] = local216.aByte3;
						} else {
							this.aByteArray12[super.anInt1943] = local216.aByteArray12[local220];
						}
					}
					if (local11 && local216.aByteArray13 != null) {
						this.aByteArray13[super.anInt1943] = local216.aByteArray13[local220];
					}
					if (local13) {
						if (local216.aShortArray21 == null) {
							this.aShortArray21[super.anInt1943] = -1;
						} else {
							this.aShortArray21[super.anInt1943] = local216.aShortArray21[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray14 == null || local216.aByteArray14[local220] == -1) {
							this.aByteArray14[super.anInt1943] = -1;
						} else {
							this.aByteArray14[super.anInt1943] = (byte) (local216.aByteArray14[local220] + this.anInt1946);
						}
					}
					super.anInt1943++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1946; local385++) {
					this.anIntArray193[this.anInt1946] = local216.anIntArray193[local385] + super.anInt1944;
					this.anIntArray196[this.anInt1946] = local216.anIntArray196[local385] + super.anInt1944;
					this.anIntArray191[this.anInt1946] = local216.anIntArray191[local385] + super.anInt1944;
					this.anInt1946++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1944; local435++) {
					super.anIntArray186[super.anInt1944] = local216.anIntArray186[local435];
					super.anIntArray188[super.anInt1944] = local216.anIntArray188[local435];
					super.anIntArray187[super.anInt1944] = local216.anIntArray187[local435];
					super.anInt1944++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[IIII)V")
	private void method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static84.anInt1947 = 0;
			Static84.anInt1945 = 0;
			Static84.anInt1948 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray14.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray14[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static84.anInt1947 += super.anIntArray186[local36];
						Static84.anInt1945 += super.anIntArray188[local36];
						Static84.anInt1948 += super.anIntArray187[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static84.anInt1947 = Static84.anInt1947 / local6 + arg2;
				Static84.anInt1945 = Static84.anInt1945 / local6 + arg3;
				Static84.anInt1948 = Static84.anInt1948 / local6 + arg4;
			} else {
				Static84.anInt1947 = arg2;
				Static84.anInt1945 = arg3;
				Static84.anInt1948 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray14.length) {
					local115 = super.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray186[local31] += arg2;
						super.anIntArray188[local31] += arg3;
						super.anIntArray187[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray14.length) {
					local115 = super.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray186[local31] -= Static84.anInt1947;
						super.anIntArray188[local31] -= Static84.anInt1945;
						super.anIntArray187[local31] -= Static84.anInt1948;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static84.anIntArray201[local225];
							local235 = Static84.anIntArray206[local225];
							local253 = super.anIntArray188[local31] * local231 + super.anIntArray186[local31] * local235 + 32767 >> 16;
							super.anIntArray188[local31] = super.anIntArray188[local31] * local235 + 32767 - super.anIntArray186[local31] * local231 >> 16;
							super.anIntArray186[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static84.anIntArray201[local36];
							local235 = Static84.anIntArray206[local36];
							local253 = super.anIntArray188[local31] * local235 + 32767 - super.anIntArray187[local31] * local231 >> 16;
							super.anIntArray187[local31] = super.anIntArray188[local31] * local231 + super.anIntArray187[local31] * local235 + 32767 >> 16;
							super.anIntArray188[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static84.anIntArray201[local219];
							local235 = Static84.anIntArray206[local219];
							local253 = super.anIntArray187[local31] * local231 + super.anIntArray186[local31] * local235 + 32767 >> 16;
							super.anIntArray187[local31] = super.anIntArray187[local31] * local235 + 32767 - super.anIntArray186[local31] * local231 >> 16;
							super.anIntArray186[local31] = local253;
						}
						super.anIntArray186[local31] += Static84.anInt1947;
						super.anIntArray188[local31] += Static84.anInt1945;
						super.anIntArray187[local31] += Static84.anInt1948;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray14.length) {
					local115 = super.anIntArrayArray14[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray186[local31] -= Static84.anInt1947;
						super.anIntArray188[local31] -= Static84.anInt1945;
						super.anIntArray187[local31] -= Static84.anInt1948;
						super.anIntArray186[local31] = super.anIntArray186[local31] * arg2 / 128;
						super.anIntArray188[local31] = super.anIntArray188[local31] * arg3 / 128;
						super.anIntArray187[local31] = super.anIntArray187[local31] * arg4 / 128;
						super.anIntArray186[local31] += Static84.anInt1947;
						super.anIntArray188[local31] += Static84.anInt1945;
						super.anIntArray187[local31] += Static84.anInt1948;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray15 != null && this.aByteArray13 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray15.length) {
					local115 = super.anIntArrayArray15[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray13[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray13[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Lclient!oh;")
	@Override
	public Class1_Sub2_Sub1_Sub4 method1446(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.aByteArray15.length < super.anInt1943) {
			Static84.aByteArray15 = new byte[super.anInt1943 + 100];
		}
		return this.method1467(arg0, Static84.aClass1_Sub2_Sub1_Sub4_Sub1_1, Static84.aByteArray15);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!fd;I)V")
	@Override
	public void method1448(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray14 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class73 local12 = arg0.aClass73Array1[arg1];
		@Pc(15) Class1_Sub18 local15 = local12.aClass1_Sub18_1;
		Static84.anInt1947 = 0;
		Static84.anInt1945 = 0;
		Static84.anInt1948 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2879; local23++) {
			@Pc(29) short local29 = local12.aShortArray34[local23];
			if (local12.aShortArray32[local23] != -1) {
				this.method1463(0, local15.anIntArrayArray18[local12.aShortArray32[local23]], 0, 0, 0);
			}
			this.method1463(local15.anIntArray220[local29], local15.anIntArrayArray18[local29], local12.aShortArray29[local23], local12.aShortArray30[local23], local12.aShortArray31[local23]);
		}
		super.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)Lclient!oh;")
	@Override
	public Class1_Sub2_Sub1_Sub4 method1461(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.aByteArray16.length < super.anInt1943) {
			Static84.aByteArray16 = new byte[super.anInt1943 + 100];
		}
		return this.method1467(arg0, Static84.aClass1_Sub2_Sub1_Sub4_Sub1_2, Static84.aByteArray16);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!jh;[B)Lclient!jh;")
	private Class1_Sub2_Sub1_Sub4_Sub1 method1467(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1944 = super.anInt1944;
		arg1.anInt1943 = super.anInt1943;
		arg1.anInt1946 = this.anInt1946;
		if (arg1.anIntArray186 == null || arg1.anIntArray186.length < super.anInt1944) {
			arg1.anIntArray186 = new int[super.anInt1944 + 100];
			arg1.anIntArray188 = new int[super.anInt1944 + 100];
			arg1.anIntArray187 = new int[super.anInt1944 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1944; local43++) {
			arg1.anIntArray186[local43] = super.anIntArray186[local43];
			arg1.anIntArray188[local43] = super.anIntArray188[local43];
			arg1.anIntArray187[local43] = super.anIntArray187[local43];
		}
		if (arg0) {
			arg1.aByteArray13 = this.aByteArray13;
		} else {
			arg1.aByteArray13 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray13 == null) {
				for (local88 = 0; local88 < super.anInt1943; local88++) {
					arg1.aByteArray13[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1943; local88++) {
					arg1.aByteArray13[local88] = this.aByteArray13[local88];
				}
			}
		}
		arg1.anIntArray195 = this.anIntArray195;
		arg1.anIntArray198 = this.anIntArray198;
		arg1.anIntArray199 = this.anIntArray199;
		arg1.anIntArray192 = this.anIntArray192;
		arg1.anIntArray194 = this.anIntArray194;
		arg1.anIntArray197 = this.anIntArray197;
		arg1.aByteArray12 = this.aByteArray12;
		arg1.aByteArray14 = this.aByteArray14;
		arg1.aShortArray21 = this.aShortArray21;
		arg1.aByte3 = this.aByte3;
		arg1.anIntArray193 = this.anIntArray193;
		arg1.anIntArray196 = this.anIntArray196;
		arg1.anIntArray191 = this.anIntArray191;
		arg1.anIntArrayArray14 = super.anIntArrayArray14;
		arg1.anIntArrayArray15 = super.anIntArrayArray15;
		arg1.aBoolean81 = super.aBoolean81;
		arg1.aBoolean82 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method1462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1459();
			@Pc(3) int local3 = Static22.anInt575;
			@Pc(5) int local5 = Static22.anInt579;
			@Pc(9) int local9 = Static84.anIntArray201[0];
			@Pc(13) int local13 = Static84.anIntArray206[0];
			@Pc(17) int local17 = Static84.anIntArray201[arg0];
			@Pc(21) int local21 = Static84.anIntArray206[arg0];
			@Pc(25) int local25 = Static84.anIntArray201[arg1];
			@Pc(29) int local29 = Static84.anIntArray206[arg1];
			@Pc(33) int local33 = Static84.anIntArray201[arg2];
			@Pc(37) int local37 = Static84.anIntArray206[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1944; local49++) {
				@Pc(55) int local55 = super.anIntArray186[local49];
				@Pc(60) int local60 = super.anIntArray188[local49];
				@Pc(65) int local65 = super.anIntArray187[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static84.anIntArray202[local49] = local65 - local47;
				Static84.anIntArray212[local49] = local3 + (local55 << 9) / local65;
				Static84.anIntArray203[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt1946 > 0) {
					Static84.anIntArray209[local49] = local55;
					Static84.anIntArray200[local49] = local77;
					Static84.anIntArray208[local49] = local65;
				}
			}
			this.method1469(false, false, 0L, super.aShort21, super.aShort21 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean82) {
			this.method1459();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort24 * arg2 + super.aShort22 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort24 * arg2 + super.aShort36 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort24 << 9;
		if (local78 / local38 <= Static22.anInt576) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort24 << 9;
		if (local91 / local38 >= Static22.anInt573) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort24 * arg1 + super.aShort22 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static22.anInt580) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort24 * arg1 + super.aShort36 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static22.anInt577) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1946 > 0;
		@Pc(172) int local172 = Static22.anInt575;
		@Pc(174) int local174 = Static22.anInt579;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static84.anIntArray201[arg0];
			local178 = Static84.anIntArray206[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static124.aBoolean83 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static124.anInt1940 - Static22.anInt575;
			@Pc(244) int local244 = Static124.anInt1941 - Static22.anInt579;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort19, super.aShort20, super.aShort19, super.aShort20, super.aShort19, super.aShort20, super.aShort19, super.aShort20 };
				@Pc(350) int[] local350 = new int[] { super.aShort25, super.aShort25, super.aShort23, super.aShort23, super.aShort25, super.aShort25, super.aShort23, super.aShort23 };
				@Pc(393) int[] local393 = new int[] { super.aShort36, super.aShort36, super.aShort36, super.aShort36, super.aShort22, super.aShort22, super.aShort22, super.aShort22 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean81) {
						Static124.aLongArray3[Static124.anInt1942++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt1944; local204++) {
			local223 = super.anIntArray186[local204];
			local208 = super.anIntArray188[local204];
			local227 = super.anIntArray187[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static84.anIntArray202[local204] = local227 - local24;
			if (local227 >= 50) {
				Static84.anIntArray212[local204] = local172 + (local223 << 9) / local227;
				Static84.anIntArray203[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static84.anIntArray212[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static84.anIntArray209[local204] = local223;
				Static84.anIntArray200[local204] = local240;
				Static84.anIntArray208[local204] = local227;
			}
		}
		try {
			this.method1469(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZJII)V")
	private void method1469(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static84.anIntArray216[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < super.anInt1943; local16++) {
			if (this.anIntArray197[local16] != -2) {
				local28 = this.anIntArray195[local16];
				local33 = this.anIntArray198[local16];
				local38 = this.anIntArray199[local16];
				local42 = Static84.anIntArray212[local28];
				local46 = Static84.anIntArray212[local33];
				local50 = Static84.anIntArray212[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static84.anIntArray209[local28];
					local69 = Static84.anIntArray209[local33];
					@Pc(73) int local73 = Static84.anIntArray209[local38];
					@Pc(77) int local77 = Static84.anIntArray200[local28];
					local81 = Static84.anIntArray200[local33];
					local85 = Static84.anIntArray200[local38];
					@Pc(89) int local89 = Static84.anIntArray208[local28];
					local93 = Static84.anIntArray208[local33];
					@Pc(97) int local97 = Static84.anIntArray208[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static84.aBooleanArray9[local16] = true;
						@Pc(177) int local177 = (Static84.anIntArray202[local28] + Static84.anIntArray202[local33] + Static84.anIntArray202[local38]) / 3 + arg3;
						Static84.anIntArrayArray17[local177][Static84.anIntArray216[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1465(Static124.anInt1940, Static124.anInt1941, Static84.anIntArray203[local28], Static84.anIntArray203[local33], Static84.anIntArray203[local38], local42, local46, local50)) {
						Static124.aLongArray3[Static124.anInt1942++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static84.anIntArray203[local38] - Static84.anIntArray203[local33]) - (Static84.anIntArray203[local28] - Static84.anIntArray203[local33]) * (local50 - local46) > 0) {
						Static84.aBooleanArray9[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static22.anInt574 && local46 <= Static22.anInt574 && local50 <= Static22.anInt574) {
							Static84.aBooleanArray10[local16] = false;
						} else {
							Static84.aBooleanArray10[local16] = true;
						}
						local65 = (Static84.anIntArray202[local28] + Static84.anIntArray202[local33] + Static84.anIntArray202[local38]) / 3 + arg3;
						Static84.anIntArrayArray17[local65][Static84.anIntArray216[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray12 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static84.anIntArray216[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static84.anIntArrayArray17[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1472(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static84.anIntArray217[local28] = 0;
			Static84.anIntArray204[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static84.anIntArray216[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static84.anIntArrayArray17[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray12[local50];
					local69 = Static84.anIntArray217[local382]++;
					Static84.anIntArrayArray16[local382][local69] = local50;
					if (local382 < 10) {
						Static84.anIntArray204[local382] += local33;
					} else if (local382 == 10) {
						Static84.anIntArray210[local69] = local33;
					} else {
						Static84.anIntArray205[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static84.anIntArray217[1] > 0 || Static84.anIntArray217[2] > 0) {
			local38 = (Static84.anIntArray204[1] + Static84.anIntArray204[2]) / (Static84.anIntArray217[1] + Static84.anIntArray217[2]);
		}
		local42 = 0;
		if (Static84.anIntArray217[3] > 0 || Static84.anIntArray217[4] > 0) {
			local42 = (Static84.anIntArray204[3] + Static84.anIntArray204[4]) / (Static84.anIntArray217[3] + Static84.anIntArray217[4]);
		}
		local46 = 0;
		if (Static84.anIntArray217[6] > 0 || Static84.anIntArray217[8] > 0) {
			local46 = (Static84.anIntArray204[6] + Static84.anIntArray204[8]) / (Static84.anIntArray217[6] + Static84.anIntArray217[8]);
		}
		local65 = 0;
		local69 = Static84.anIntArray217[10];
		@Pc(515) int[] local515 = Static84.anIntArrayArray16[10];
		@Pc(517) int[] local517 = Static84.anIntArray210;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static84.anIntArray217[11];
			local515 = Static84.anIntArrayArray16[11];
			local517 = Static84.anIntArray205;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1472(local515[local65++]);
				if (local65 == local69 && local515 != Static84.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static84.anIntArray217[11];
					local515 = Static84.anIntArrayArray16[11];
					local517 = Static84.anIntArray205;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1472(local515[local65++]);
				if (local65 == local69 && local515 != Static84.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static84.anIntArray217[11];
					local515 = Static84.anIntArrayArray16[11];
					local517 = Static84.anIntArray205;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1472(local515[local65++]);
				if (local65 == local69 && local515 != Static84.anIntArrayArray16[11]) {
					local65 = 0;
					local69 = Static84.anIntArray217[11];
					local515 = Static84.anIntArrayArray16[11];
					local517 = Static84.anIntArray205;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static84.anIntArray217[local81];
			@Pc(680) int[] local680 = Static84.anIntArrayArray16[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1472(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1472(local515[local65++]);
			if (local65 == local69 && local515 != Static84.anIntArrayArray16[11]) {
				local65 = 0;
				local515 = Static84.anIntArrayArray16[11];
				local69 = Static84.anIntArray217[11];
				local517 = Static84.anIntArray205;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([[IIIIZI)Lclient!oh;")
	@Override
	public Class1_Sub2_Sub1_Sub4 method1449(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1459();
		@Pc(6) int local6 = arg1 + super.aShort19;
		@Pc(11) int local11 = arg1 + super.aShort20;
		@Pc(16) int local16 = arg3 + super.aShort25;
		@Pc(21) int local21 = arg3 + super.aShort23;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class1_Sub2_Sub1_Sub4_Sub1 local101;
		if (arg4) {
			local101 = new Class1_Sub2_Sub1_Sub4_Sub1();
			local101.anInt1944 = super.anInt1944;
			local101.anInt1943 = super.anInt1943;
			local101.anInt1946 = this.anInt1946;
			local101.anIntArray186 = super.anIntArray186;
			local101.anIntArray187 = super.anIntArray187;
			local101.anIntArray195 = this.anIntArray195;
			local101.anIntArray198 = this.anIntArray198;
			local101.anIntArray199 = this.anIntArray199;
			local101.anIntArray192 = this.anIntArray192;
			local101.anIntArray194 = this.anIntArray194;
			local101.anIntArray197 = this.anIntArray197;
			local101.aByteArray12 = this.aByteArray12;
			local101.aByteArray13 = this.aByteArray13;
			local101.aByteArray14 = this.aByteArray14;
			local101.aShortArray21 = this.aShortArray21;
			local101.aByte3 = this.aByte3;
			local101.anIntArray193 = this.anIntArray193;
			local101.anIntArray196 = this.anIntArray196;
			local101.anIntArray191 = this.anIntArray191;
			local101.anIntArrayArray14 = super.anIntArrayArray14;
			local101.anIntArrayArray15 = super.anIntArrayArray15;
			local101.aBoolean81 = super.aBoolean81;
			local101.anIntArray188 = new int[local101.anInt1944];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt1944; local201++) {
				local209 = super.anIntArray186[local201] + arg1;
				local216 = super.anIntArray187[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray188[local201] = super.anIntArray188[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1944; local201++) {
				local209 = (super.anIntArray188[local201] << 16) / super.aShort36;
				if (local209 < arg5) {
					local216 = super.anIntArray186[local201] + arg1;
					local220 = super.anIntArray187[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray188[local201] = super.anIntArray188[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray188[local201] = super.anIntArray188[local201];
				}
			}
		}
		super.aBoolean82 = false;
		return local101;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!oh;)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method1470(@OriginalArg(0) Class1_Sub2_Sub1_Sub4 arg0) {
		return new Class1_Sub2_Sub1_Sub4_Sub1(new Class1_Sub2_Sub1_Sub4_Sub1[] { this, (Class1_Sub2_Sub1_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1459();
			@Pc(3) int local3 = Static22.anInt575;
			@Pc(5) int local5 = Static22.anInt579;
			@Pc(9) int local9 = Static84.anIntArray201[0];
			@Pc(13) int local13 = Static84.anIntArray206[0];
			@Pc(17) int local17 = Static84.anIntArray201[arg0];
			@Pc(21) int local21 = Static84.anIntArray206[arg0];
			@Pc(25) int local25 = Static84.anIntArray201[arg1];
			@Pc(29) int local29 = Static84.anIntArray206[arg1];
			@Pc(33) int local33 = Static84.anIntArray201[arg2];
			@Pc(37) int local37 = Static84.anIntArray206[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1944; local49++) {
				@Pc(55) int local55 = super.anIntArray186[local49];
				@Pc(60) int local60 = super.anIntArray188[local49];
				@Pc(65) int local65 = super.anIntArray187[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static84.anIntArray202[local49] = local65 - local47;
				Static84.anIntArray212[local49] = local3 + (local55 << 9) / arg6;
				Static84.anIntArray203[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt1946 > 0) {
					Static84.anIntArray209[local49] = local55;
					Static84.anIntArray200[local49] = local77;
					Static84.anIntArray208[local49] = local65;
				}
			}
			this.method1469(false, false, 0L, super.aShort21, super.aShort21 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
	private void method1471(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static22.anInt575;
		@Pc(3) int local3 = Static22.anInt579;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray195[arg0];
		@Pc(15) int local15 = this.anIntArray198[arg0];
		@Pc(20) int local20 = this.anIntArray199[arg0];
		@Pc(24) int local24 = Static84.anIntArray208[local10];
		@Pc(28) int local28 = Static84.anIntArray208[local15];
		@Pc(32) int local32 = Static84.anIntArray208[local20];
		if (this.aByteArray13 == null) {
			Static22.anInt578 = 0;
		} else {
			Static22.anInt578 = this.aByteArray13[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static84.anIntArray207[0] = Static84.anIntArray212[local10];
			Static84.anIntArray215[0] = Static84.anIntArray203[local10];
			local5++;
			Static84.anIntArray214[0] = this.anIntArray192[arg0];
		} else {
			local73 = Static84.anIntArray209[local10];
			local77 = Static84.anIntArray200[local10];
			local82 = this.anIntArray192[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static84.anIntArray213[local32 - local24];
				Static84.anIntArray207[0] = local1 + (local73 + ((Static84.anIntArray209[local20] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[0] = local3 + (local77 + ((Static84.anIntArray200[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static84.anIntArray214[0] = local82 + ((this.anIntArray197[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static84.anIntArray213[local28 - local24];
				Static84.anIntArray207[local5] = local1 + (local73 + ((Static84.anIntArray209[local15] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[local5] = local3 + (local77 + ((Static84.anIntArray200[local15] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray214[local5++] = local82 + ((this.anIntArray194[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static84.anIntArray207[local5] = Static84.anIntArray212[local15];
			Static84.anIntArray215[local5] = Static84.anIntArray203[local15];
			Static84.anIntArray214[local5++] = this.anIntArray194[arg0];
		} else {
			local73 = Static84.anIntArray209[local15];
			local77 = Static84.anIntArray200[local15];
			local82 = this.anIntArray194[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static84.anIntArray213[local24 - local28];
				Static84.anIntArray207[local5] = local1 + (local73 + ((Static84.anIntArray209[local10] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[local5] = local3 + (local77 + ((Static84.anIntArray200[local10] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray214[local5++] = local82 + ((this.anIntArray192[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static84.anIntArray213[local32 - local28];
				Static84.anIntArray207[local5] = local1 + (local73 + ((Static84.anIntArray209[local20] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[local5] = local3 + (local77 + ((Static84.anIntArray200[local20] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray214[local5++] = local82 + ((this.anIntArray197[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static84.anIntArray207[local5] = Static84.anIntArray212[local20];
			Static84.anIntArray215[local5] = Static84.anIntArray203[local20];
			Static84.anIntArray214[local5++] = this.anIntArray197[arg0];
		} else {
			local73 = Static84.anIntArray209[local20];
			local77 = Static84.anIntArray200[local20];
			local82 = this.anIntArray197[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static84.anIntArray213[local28 - local32];
				Static84.anIntArray207[local5] = local1 + (local73 + ((Static84.anIntArray209[local15] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[local5] = local3 + (local77 + ((Static84.anIntArray200[local15] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray214[local5++] = local82 + ((this.anIntArray194[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static84.anIntArray213[local24 - local32];
				Static84.anIntArray207[local5] = local1 + (local73 + ((Static84.anIntArray209[local10] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray215[local5] = local3 + (local77 + ((Static84.anIntArray200[local10] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray214[local5++] = local82 + ((this.anIntArray192[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static84.anIntArray207[0];
		local77 = Static84.anIntArray207[1];
		local82 = Static84.anIntArray207[2];
		local95 = Static84.anIntArray215[0];
		@Pc(590) int local590 = Static84.anIntArray215[1];
		@Pc(594) int local594 = Static84.anIntArray215[2];
		Static22.aBoolean17 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static22.anInt574 || local77 > Static22.anInt574 || local82 > Static22.anInt574) {
				Static22.aBoolean17 = true;
			}
			if (this.aShortArray21 != null && this.aShortArray21[arg0] != -1) {
				if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray14[arg0] & 0xFF;
					local683 = this.anIntArray193[local678];
					local688 = this.anIntArray196[local678];
					local693 = this.anIntArray191[local678];
				}
				if (this.anIntArray197[arg0] == -1) {
					Static22.method491(local95, local590, local594, local73, local77, local82, this.anIntArray192[arg0], this.anIntArray192[arg0], this.anIntArray192[arg0], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], this.aShortArray21[arg0]);
				} else {
					Static22.method491(local95, local590, local594, local73, local77, local82, Static84.anIntArray214[0], Static84.anIntArray214[1], Static84.anIntArray214[2], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], this.aShortArray21[arg0]);
				}
			} else if (this.anIntArray197[arg0] == -1) {
				Static22.method488(local95, local590, local594, local73, local77, local82, Static84.anIntArray211[this.anIntArray192[arg0]]);
			} else {
				Static22.method498(local95, local590, local594, local73, local77, local82, Static84.anIntArray214[0], Static84.anIntArray214[1], Static84.anIntArray214[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static22.anInt574 || local77 > Static22.anInt574 || local82 > Static22.anInt574 || Static84.anIntArray207[3] < 0 || Static84.anIntArray207[3] > Static22.anInt574) {
			Static22.aBoolean17 = true;
		}
		if (this.aShortArray21 == null || this.aShortArray21[arg0] == -1) {
			if (this.anIntArray197[arg0] == -1) {
				local683 = Static84.anIntArray211[this.anIntArray192[arg0]];
				Static22.method488(local95, local590, local594, local73, local77, local82, local683);
				Static22.method488(local95, local594, Static84.anIntArray215[3], local73, local82, Static84.anIntArray207[3], local683);
				return;
			}
			Static22.method498(local95, local590, local594, local73, local77, local82, Static84.anIntArray214[0], Static84.anIntArray214[1], Static84.anIntArray214[2]);
			Static22.method498(local95, local594, Static84.anIntArray215[3], local73, local82, Static84.anIntArray207[3], Static84.anIntArray214[0], Static84.anIntArray214[2], Static84.anIntArray214[3]);
			return;
		}
		if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray14[arg0] & 0xFF;
			local683 = this.anIntArray193[local678];
			local688 = this.anIntArray196[local678];
			local693 = this.anIntArray191[local678];
		}
		@Pc(956) short local956 = this.aShortArray21[arg0];
		if (this.anIntArray197[arg0] == -1) {
			Static22.method491(local95, local590, local594, local73, local77, local82, this.anIntArray192[arg0], this.anIntArray192[arg0], this.anIntArray192[arg0], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], local956);
			Static22.method491(local95, local594, Static84.anIntArray215[3], local73, local82, Static84.anIntArray207[3], this.anIntArray192[arg0], this.anIntArray192[arg0], this.anIntArray192[arg0], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], local956);
			return;
		}
		Static22.method491(local95, local590, local594, local73, local77, local82, Static84.anIntArray214[0], Static84.anIntArray214[1], Static84.anIntArray214[2], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], local956);
		Static22.method491(local95, local594, Static84.anIntArray215[3], local73, local82, Static84.anIntArray207[3], Static84.anIntArray214[0], Static84.anIntArray214[2], Static84.anIntArray214[3], Static84.anIntArray209[local683], Static84.anIntArray209[local688], Static84.anIntArray209[local693], Static84.anIntArray200[local683], Static84.anIntArray200[local688], Static84.anIntArray200[local693], Static84.anIntArray208[local683], Static84.anIntArray208[local688], Static84.anIntArray208[local693], local956);
	}

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V")
	private void method1472(@OriginalArg(0) int arg0) {
		if (Static84.aBooleanArray9[arg0]) {
			this.method1471(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray195[arg0];
		@Pc(17) int local17 = this.anIntArray198[arg0];
		@Pc(22) int local22 = this.anIntArray199[arg0];
		Static22.aBoolean17 = Static84.aBooleanArray10[arg0];
		if (this.aByteArray13 == null) {
			Static22.anInt578 = 0;
		} else {
			Static22.anInt578 = this.aByteArray13[arg0] & 0xFF;
		}
		if (this.aShortArray21 != null && this.aShortArray21[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray14[arg0] & 0xFF;
				local133 = this.anIntArray193[local128];
				local138 = this.anIntArray196[local128];
				local143 = this.anIntArray191[local128];
			}
			if (this.anIntArray197[arg0] == -1) {
				Static22.method491(Static84.anIntArray203[local12], Static84.anIntArray203[local17], Static84.anIntArray203[local22], Static84.anIntArray212[local12], Static84.anIntArray212[local17], Static84.anIntArray212[local22], this.anIntArray192[arg0], this.anIntArray192[arg0], this.anIntArray192[arg0], Static84.anIntArray209[local133], Static84.anIntArray209[local138], Static84.anIntArray209[local143], Static84.anIntArray200[local133], Static84.anIntArray200[local138], Static84.anIntArray200[local143], Static84.anIntArray208[local133], Static84.anIntArray208[local138], Static84.anIntArray208[local143], this.aShortArray21[arg0]);
			} else {
				Static22.method491(Static84.anIntArray203[local12], Static84.anIntArray203[local17], Static84.anIntArray203[local22], Static84.anIntArray212[local12], Static84.anIntArray212[local17], Static84.anIntArray212[local22], this.anIntArray192[arg0], this.anIntArray194[arg0], this.anIntArray197[arg0], Static84.anIntArray209[local133], Static84.anIntArray209[local138], Static84.anIntArray209[local143], Static84.anIntArray200[local133], Static84.anIntArray200[local138], Static84.anIntArray200[local143], Static84.anIntArray208[local133], Static84.anIntArray208[local138], Static84.anIntArray208[local143], this.aShortArray21[arg0]);
			}
		} else if (this.anIntArray197[arg0] == -1) {
			Static22.method488(Static84.anIntArray203[local12], Static84.anIntArray203[local17], Static84.anIntArray203[local22], Static84.anIntArray212[local12], Static84.anIntArray212[local17], Static84.anIntArray212[local22], Static84.anIntArray211[this.anIntArray192[arg0]]);
		} else {
			Static22.method498(Static84.anIntArray203[local12], Static84.anIntArray203[local17], Static84.anIntArray203[local22], Static84.anIntArray212[local12], Static84.anIntArray212[local17], Static84.anIntArray212[local22], this.anIntArray192[arg0], this.anIntArray194[arg0], this.anIntArray197[arg0]);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!fd;ILclient!fd;I[I)V")
	@Override
	public void method1451(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1448(arg0, arg1);
			return;
		}
		@Pc(18) Class73 local18 = arg0.aClass73Array1[arg1];
		@Pc(23) Class73 local23 = arg2.aClass73Array1[arg3];
		@Pc(26) Class1_Sub18 local26 = local18.aClass1_Sub18_1;
		Static84.anInt1947 = 0;
		Static84.anInt1945 = 0;
		Static84.anInt1948 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2879; local41++) {
			@Pc(47) short local47 = local18.aShortArray34[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray220[local47] == 0) {
				if (local18.aShortArray32[local41] != -1) {
					this.method1463(0, local26.anIntArrayArray18[local18.aShortArray32[local41]], 0, 0, 0);
				}
				this.method1463(local26.anIntArray220[local47], local26.anIntArrayArray18[local47], local18.aShortArray29[local41], local18.aShortArray30[local41], local18.aShortArray31[local41]);
			}
		}
		Static84.anInt1947 = 0;
		Static84.anInt1945 = 0;
		Static84.anInt1948 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2879; local125++) {
			@Pc(131) short local131 = local23.aShortArray34[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray220[local131] == 0) {
				if (local23.aShortArray32[local125] != -1) {
					this.method1463(0, local26.anIntArrayArray18[local23.aShortArray32[local125]], 0, 0, 0);
				}
				this.method1463(local26.anIntArray220[local131], local26.anIntArrayArray18[local131], local23.aShortArray29[local125], local23.aShortArray30[local125], local23.aShortArray31[local125]);
			}
		}
		super.aBoolean82 = false;
	}
}
