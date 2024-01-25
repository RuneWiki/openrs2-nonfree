import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class261 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[[Lclient!tw;")
	private Class314[][] aClass314ArrayArray1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!kb;")
	private final Class46_Sub2 aClass46_Sub2_3;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_13;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public final int anInt7447;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	private final int anInt7450;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	private final int anInt7445;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	private final int anInt7444;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private final int anInt7451;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!gj;Lclient!kb;)V")
	public Class261(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class46_Sub2 arg1) {
		this.aClass46_Sub2_3 = arg1;
		this.aClass90_Sub3_13 = arg0;
		this.anInt7447 = (this.aClass46_Sub2_3.anInt9998 * this.aClass46_Sub2_3.anInt9997 >> this.aClass90_Sub3_13.anInt9574) + 2;
		this.anInt7450 = (this.aClass46_Sub2_3.anInt9998 * this.aClass46_Sub2_3.anInt9995 >> this.aClass90_Sub3_13.anInt9574) + 2;
		this.anInt7445 = this.aClass90_Sub3_13.anInt9574 + 7 - this.aClass46_Sub2_3.anInt10000;
		this.aByteArray96 = new byte[this.anInt7447 * this.anInt7450];
		this.anInt7444 = this.aClass46_Sub2_3.anInt9997 >> this.anInt7445;
		this.anInt7451 = this.aClass46_Sub2_3.anInt9995 >> this.anInt7445;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!w;BII)V")
	public void method5939(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub1 local6 = (Class6_Sub5_Sub10_Sub1) arg0;
		arg1 += local6.anInt5249 + 1;
		arg2 += local6.anInt5254 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt7447;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5251;
		@Pc(36) int local36 = local6.anInt5255;
		@Pc(41) int local41 = this.anInt7447 - local36;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local33 -= local51;
			local30 = local36 * local51;
			local28 += local51 * this.anInt7447;
			arg2 = 1;
		}
		@Pc(72) int local72 = 0;
		if (local33 + arg2 >= this.anInt7450) {
			local51 = local33 + arg2 + 1 - this.anInt7450;
			local33 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local28 += local51;
			local72 = local51;
			local41 += local51;
			local36 -= local51;
			local30 += local51;
		}
		if (arg1 + local36 >= this.anInt7447) {
			local51 = arg1 + local36 + 1 - this.anInt7447;
			local72 += local51;
			local36 -= local51;
			local41 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static168.method2674(local41, local36, local30, this.aByteArray96, local33, local72, local28, local6.aByteArray72);
			this.method5941(local36, arg1, local33, arg2);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBII)V")
	private void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass314ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(45) int local45 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class314[] local54 = this.aClass314ArrayArray1[local47];
			for (@Pc(56) int local56 = local31; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean571 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILclient!w;)V")
	public void method5942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub5_Sub10 arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub1 local6 = (Class6_Sub5_Sub10_Sub1) arg2;
		arg0 += local6.anInt5249 + 1;
		arg1 += local6.anInt5254 + 1;
		@Pc(27) int local27 = this.anInt7447 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5251;
		@Pc(35) int local35 = local6.anInt5255;
		@Pc(41) int local41 = this.anInt7447 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local27 += local51 * this.anInt7447;
			local32 -= local51;
			local29 = local35 * local51;
			arg1 = 1;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg1 >= this.anInt7450) {
			local51 = local32 + arg1 + 1 - this.anInt7450;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local29 += local51;
			local27 += local51;
			local41 += local51;
			local72 = local51;
			local35 -= local51;
		}
		if (this.anInt7447 <= arg0 + local35) {
			local51 = local35 + arg0 + 1 - this.anInt7447;
			local35 -= local51;
			local41 += local51;
			local72 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static216.method1059(local35, local27, this.aByteArray96, local29, local72, local32, local6.aByteArray72, local41);
			this.method5941(local35, arg0, local32, arg1);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method5943() {
		this.aClass314ArrayArray1 = new Class314[this.anInt7444][this.anInt7451];
		for (@Pc(22) int local22 = 0; local22 < this.anInt7451; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt7444; local26++) {
				this.aClass314ArrayArray1[local26][local22] = new Class314(this.aClass90_Sub3_13, this, this.aClass46_Sub2_3, local26, local22, this.anInt7445, local26 * 128 + 1, local22 * 128 - -1);
				if (this.aClass314ArrayArray1[local26][local22].anInt8793 == 0) {
					this.aClass314ArrayArray1[local26][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!w;I)Z")
	public boolean method5944(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub5_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub5_Sub10_Sub1 local11 = (Class6_Sub5_Sub10_Sub1) arg1;
		arg2 += local11.anInt5254 + 1;
		arg0 += local11.anInt5249 + 1;
		@Pc(32) int local32 = arg0 + arg2 * this.anInt7447;
		@Pc(35) int local35 = local11.anInt5251;
		@Pc(38) int local38 = local11.anInt5255;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local35 -= local48;
			local32 += this.anInt7447 * local48;
			arg2 = 1;
		}
		@Pc(66) int local66 = this.anInt7447 - local38;
		if (this.anInt7450 <= local35 + arg2) {
			local48 = arg2 + local35 + 1 - this.anInt7450;
			local35 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local38 -= local48;
			arg0 = 1;
			local66 += local48;
			local32 += local48;
		}
		if (local38 + arg0 >= this.anInt7447) {
			local48 = arg0 + local38 + 1 - this.anInt7447;
			local38 -= local48;
			local66 += local48;
		}
		if (local38 > 0 && local35 > 0) {
			local66 += this.anInt7447 * 7;
			return Static409.method5885(local35, local66, this.aByteArray96, local38, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII[[ZII)V")
	public void method5945(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass90_Sub3_13.method7528(false);
		this.aClass90_Sub3_13.method7652(false);
		this.aClass90_Sub3_13.method7640(1);
		this.aClass90_Sub3_13.method7620(1);
		this.aClass90_Sub3_13.method7548(false, -2, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass90_Sub3_13.anInt9570 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg0) {
			for (local53 = 0; local53 < this.anInt7451; local53++) {
				local60 = local53 << this.anInt7445;
				local67 = local53 + 1 << this.anInt7445;
				label87: for (local69 = 0; local69 < this.anInt7444; local69++) {
					if (this.aClass314ArrayArray1[local69][local53] != null) {
						@Pc(328) int local328 = local69 << this.anInt7445;
						@Pc(335) int local335 = local69 + 1 << this.anInt7445;
						for (@Pc(337) int local337 = local328; local337 < local335; local337++) {
							if (-arg4 <= local337 - arg2 && local337 - arg2 <= arg4) {
								for (@Pc(360) int local360 = local60; local360 < local67; local360++) {
									if (local360 - arg1 >= -arg4 && arg4 >= local360 - arg1 && arg3[local337 + arg4 - arg2][arg4 + local360 - arg1]) {
										@Pc(394) Class93_Sub3 local394 = this.aClass90_Sub3_13.method7585();
										local394.method3768(local49, 1.0F, local49);
										local394.G(-local69, -local53, 0);
										this.aClass90_Sub3_13.method7580(Static573.aClass172_11);
										this.aClass314ArrayArray1[local69][local53].method7009();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7451; local53++) {
				local60 = local53 << this.anInt7445;
				local67 = local53 + 1 << this.anInt7445;
				for (local69 = 0; local69 < this.anInt7444; local69++) {
					@Pc(78) Class314 local78 = this.aClass314ArrayArray1[local69][local53];
					if (local78 != null) {
						@Pc(89) Interface9 local89 = this.aClass90_Sub3_13.method7581(local78.anInt8793 * 3);
						@Pc(94) Buffer local94 = local89.method6462();
						if (local94 != null) {
							@Pc(102) Stream local102 = this.aClass90_Sub3_13.method7595(local94);
							@Pc(104) int local104 = 0;
							@Pc(109) int local109 = local69 << this.anInt7445;
							@Pc(116) int local116 = local69 + 1 << this.anInt7445;
							for (@Pc(118) int local118 = local60; local118 < local67; local118++) {
								if (local118 - arg1 >= -arg4 && arg4 >= local118 - arg1) {
									@Pc(140) int local140 = local118 * this.aClass46_Sub2_3.anInt9997 + local109;
									for (@Pc(142) int local142 = local109; local142 < local116; local142++) {
										if (local142 - arg2 >= -arg4 && arg4 >= local142 - arg2 && arg3[arg4 + local142 - arg2][local118 + arg4 - arg1]) {
											@Pc(185) short[] local185 = this.aClass46_Sub2_3.aShortArrayArray19[local140];
											if (local185 != null) {
												@Pc(191) int local191;
												if (Stream.a()) {
													for (local191 = 0; local191 < local185.length; local191++) {
														local102.e(local185[local191] & 0xFFFF);
														local104++;
													}
												} else {
													for (local191 = 0; local191 < local185.length; local191++) {
														local102.a(local185[local191] & 0xFFFF);
														local104++;
													}
												}
											}
										}
										local140++;
									}
								}
							}
							local102.b();
							if (local89.method6460() && local104 > 0) {
								@Pc(255) Class93_Sub3 local255 = this.aClass90_Sub3_13.method7585();
								local255.method3768(local49, 1.0F, local49);
								local255.G(-local69, -local53, 0);
								this.aClass90_Sub3_13.method7580(Static573.aClass172_11);
								local78.method7007(local89, local104 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass90_Sub3_13.method7576();
	}
}
