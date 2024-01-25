import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class170 {

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "[I")
	public static final int[] anIntArray271 = new int[256];

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "[[Lclient!db;")
	private Class71[][] aClass71ArrayArray1;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_15;

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lclient!qq;")
	private final Class35_Sub3 aClass35_Sub3_2;

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
	public final int anInt4650;

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
	private final int anInt4652;

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
	private final int anInt4646;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
	private final int anInt4641;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
	private final int anInt4644;

	static {
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(23) int local23 = local20;
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				if ((local23 & 0x1) == 1) {
					local23 = local23 >>> 1 ^ 0xEDB88320;
				} else {
					local23 >>>= 0x1;
				}
			}
			anIntArray271[local20] = local23;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!ee;Lclient!qq;)V")
	public Class170(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class35_Sub3 arg1) {
		this.aClass95_Sub1_15 = arg0;
		this.aClass35_Sub3_2 = arg1;
		this.anInt4650 = (this.aClass35_Sub3_2.anInt9149 * this.aClass35_Sub3_2.anInt9152 >> this.aClass95_Sub1_15.anInt10055) + 2;
		this.anInt4652 = (this.aClass35_Sub3_2.anInt9148 * this.aClass35_Sub3_2.anInt9152 >> this.aClass95_Sub1_15.anInt10055) + 2;
		this.aByteArray40 = new byte[this.anInt4652 * this.anInt4650];
		this.anInt4646 = this.aClass95_Sub1_15.anInt10055 + 7 - this.aClass35_Sub3_2.anInt9154;
		this.anInt4641 = this.aClass35_Sub3_2.anInt9149 >> this.anInt4646;
		this.anInt4644 = this.aClass35_Sub3_2.anInt9148 >> this.anInt4646;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	public void method3986() {
		this.aClass71ArrayArray1 = new Class71[this.anInt4641][this.anInt4644];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4644; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4641; local20++) {
				this.aClass71ArrayArray1[local20][local14] = new Class71(this.aClass95_Sub1_15, this, this.aClass35_Sub3_2, local20, local14, this.anInt4646, local20 * 128 + 1, local14 * 128 + 1);
				if (this.aClass71ArrayArray1[local20][local14].anInt1945 == 0) {
					this.aClass71ArrayArray1[local20][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIII)V")
	private void method3988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass71ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg2 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(53) int local53 = local15; local53 <= local26; local53++) {
			@Pc(60) Class71[] local60 = this.aClass71ArrayArray1[local53];
			for (@Pc(62) int local62 = local32; local62 <= local42; local62++) {
				if (local60[local62] != null) {
					local60[local62].aBoolean154 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!r;III)V")
	public void method3989(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub5_Sub11_Sub2 local6 = (Class3_Sub5_Sub11_Sub2) arg0;
		arg1 += local6.anInt8274 + 1;
		arg2 += local6.anInt8266 + 1;
		@Pc(28) int local28 = arg1 + this.anInt4650 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt8273;
		@Pc(36) int local36 = local6.anInt8268;
		@Pc(48) int local48 = this.anInt4650 - local36;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local30 = local57 * local36;
			local28 += this.anInt4650 * local57;
			arg2 = 1;
			local33 -= local57;
		}
		if (arg2 + local33 >= this.anInt4652) {
			local57 = arg2 + local33 + 1 - this.anInt4652;
			local33 -= local57;
		}
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			local48 += local57;
			local30 += local57;
			local50 = local57;
			local28 += local57;
			arg1 = 1;
			local36 -= local57;
		}
		if (this.anInt4650 <= arg1 + local36) {
			local57 = arg1 + local36 + 1 - this.anInt4650;
			local36 -= local57;
			local48 += local57;
			local50 += local57;
		}
		if (local36 > 0 && local33 > 0) {
			Static109.method1709(local30, local33, local6.aByteArray69, this.aByteArray40, local36, local48, local50, local28);
			this.method3988(local36, arg1, arg2, local33);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!r;I)V")
	public void method3990(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub5_Sub11_Sub2 local6 = (Class3_Sub5_Sub11_Sub2) arg1;
		arg0 += local6.anInt8274 + 1;
		arg2 += local6.anInt8266 + 1;
		@Pc(27) int local27 = this.anInt4650 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8273;
		@Pc(35) int local35 = local6.anInt8268;
		@Pc(41) int local41 = this.anInt4650 - local35;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local32 -= local51;
			local27 += this.anInt4650 * local51;
			local29 = local35 * local51;
			arg2 = 1;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt4652 <= arg2 + local32) {
			local51 = arg2 + local32 + 1 - this.anInt4652;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local72 = local51;
			local27 += local51;
			local35 -= local51;
			local41 += local51;
			local29 += local51;
			arg0 = 1;
		}
		if (local35 + arg0 >= this.anInt4650) {
			local51 = arg0 + local35 + 1 - this.anInt4650;
			local72 += local51;
			local35 -= local51;
			local41 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static487.method6427(local6.aByteArray69, local32, local72, local41, local27, local29, this.aByteArray40, local35);
			this.method3988(local35, arg0, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([[ZZIIII)V")
	public void method3992(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass95_Sub1_15.method8163(false);
		this.aClass95_Sub1_15.method8095(false);
		this.aClass95_Sub1_15.method8162(1);
		this.aClass95_Sub1_15.method8129(1);
		this.aClass95_Sub1_15.method8118(false, -2, false);
		@Pc(52) float local52 = 1.0F / (float) (this.aClass95_Sub1_15.anInt10048 * 128);
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(72) int local72;
		if (arg1) {
			for (local56 = 0; local56 < this.anInt4644; local56++) {
				local63 = local56 << this.anInt4646;
				local70 = local56 + 1 << this.anInt4646;
				label138: for (local72 = 0; local72 < this.anInt4641; local72++) {
					if (this.aClass71ArrayArray1[local72][local56] != null) {
						@Pc(86) int local86 = local72 << this.anInt4646;
						@Pc(93) int local93 = local72 + 1 << this.anInt4646;
						for (@Pc(95) int local95 = local86; local95 < local93; local95++) {
							if (-arg2 <= local95 - arg3 && local95 - arg3 <= arg2) {
								for (@Pc(110) int local110 = local63; local110 < local70; local110++) {
									if (local110 - arg4 >= -arg2 && local110 - arg4 <= arg2 && arg0[local95 + arg2 - arg3][local110 + arg2 - arg4]) {
										@Pc(156) Class17_Sub2 local156 = this.aClass95_Sub1_15.method8141();
										local156.method5843(local52, local52, 1.0F);
										local156.method6235(-local72, -local56, 0);
										this.aClass95_Sub1_15.method8148(Static345.aClass366_6);
										this.aClass71ArrayArray1[local72][local56].method1626();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local56 = 0; local56 < this.anInt4644; local56++) {
				local63 = local56 << this.anInt4646;
				local70 = local56 + 1 << this.anInt4646;
				for (local72 = 0; local72 < this.anInt4641; local72++) {
					@Pc(239) Class71 local239 = this.aClass71ArrayArray1[local72][local56];
					if (local239 != null) {
						@Pc(250) Interface22 local250 = this.aClass95_Sub1_15.method8161(local239.anInt1945 * 3);
						@Pc(255) Buffer local255 = local250.method7405();
						if (local255 != null) {
							@Pc(263) Stream local263 = this.aClass95_Sub1_15.method8157(local255);
							@Pc(265) int local265 = 0;
							@Pc(270) int local270 = local72 << this.anInt4646;
							@Pc(277) int local277 = local72 + 1 << this.anInt4646;
							for (@Pc(279) int local279 = local63; local279 < local70; local279++) {
								if (local279 - arg4 >= -arg2 && local279 - arg4 <= arg2) {
									@Pc(302) int local302 = local270 + this.aClass35_Sub3_2.anInt9149 * local279;
									for (@Pc(304) int local304 = local270; local304 < local277; local304++) {
										if (-arg2 <= local304 - arg3 && arg2 >= local304 - arg3 && arg0[local304 + arg2 - arg3][arg2 + local279 - arg4]) {
											@Pc(349) short[] local349 = this.aClass35_Sub3_2.aShortArrayArray10[local302];
											if (local349 != null) {
												@Pc(355) int local355;
												if (Stream.b()) {
													for (local355 = 0; local355 < local349.length; local355++) {
														local263.a(local349[local355] & 0xFFFF);
														local265++;
													}
												} else {
													for (local355 = 0; local355 < local349.length; local355++) {
														local263.e(local349[local355] & 0xFFFF);
														local265++;
													}
												}
											}
										}
										local302++;
									}
								}
							}
							local263.a();
							if (local250.method7407() && local265 > 0) {
								@Pc(418) Class17_Sub2 local418 = this.aClass95_Sub1_15.method8141();
								local418.method5843(local52, local52, 1.0F);
								local418.method6235(-local72, -local56, 0);
								this.aClass95_Sub1_15.method8148(Static345.aClass366_6);
								local239.method1622(local250, local265 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass95_Sub1_15.method8142();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lclient!r;III)Z")
	public boolean method3993(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub5_Sub11_Sub2 local6 = (Class3_Sub5_Sub11_Sub2) arg0;
		arg2 += local6.anInt8274 + 1;
		arg1 += local6.anInt8266 + 1;
		@Pc(27) int local27 = arg2 + arg1 * this.anInt4650;
		@Pc(30) int local30 = local6.anInt8273;
		@Pc(33) int local33 = local6.anInt8268;
		@Pc(39) int local39 = this.anInt4650 - local33;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local30 -= local48;
			local27 += local48 * this.anInt4650;
		}
		if (this.anInt4652 <= arg1 + local30) {
			local48 = arg1 + local30 + 1 - this.anInt4652;
			local30 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local39 += local48;
			arg2 = 1;
			local33 -= local48;
			local27 += local48;
		}
		if (local33 + arg2 >= this.anInt4650) {
			local48 = arg2 + local33 + 1 - this.anInt4650;
			local39 += local48;
			local33 -= local48;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt4650 * 7;
			return Static281.method4099(local39, local30, local27, this.aByteArray40, local33);
		} else {
			return false;
		}
	}
}
