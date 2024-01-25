import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class199 {

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "[[Lclient!jfa;")
	private Class169[][] aClass169ArrayArray1;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_14;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!cj;")
	private final Class51_Sub1 aClass51_Sub1_2;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "I")
	public final int anInt5905;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
	private final int anInt5902;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
	private final int anInt5898;

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
	private final int anInt5903;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!ch;Lclient!cj;)V")
	public Class199(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class51_Sub1 arg1) {
		this.aClass5_Sub1_14 = arg0;
		this.aClass51_Sub1_2 = arg1;
		this.anInt5905 = (this.aClass51_Sub1_2.anInt9118 * this.aClass51_Sub1_2.anInt9121 >> this.aClass5_Sub1_14.anInt6526) + 2;
		this.anInt5901 = (this.aClass51_Sub1_2.anInt9118 * this.aClass51_Sub1_2.anInt9115 >> this.aClass5_Sub1_14.anInt6526) + 2;
		this.aByteArray64 = new byte[this.anInt5901 * this.anInt5905];
		this.anInt5902 = this.aClass5_Sub1_14.anInt6526 + 7 - this.aClass51_Sub1_2.anInt9117;
		this.anInt5898 = this.aClass51_Sub1_2.anInt9121 >> this.anInt5902;
		this.anInt5903 = this.aClass51_Sub1_2.anInt9115 >> this.anInt5902;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!r;II)V")
	public void method5136(@OriginalArg(1) Class3_Sub4_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub2 local6 = (Class3_Sub4_Sub5_Sub2) arg0;
		arg1 += local6.anInt4146 + 1;
		arg2 += local6.anInt4141 + 1;
		@Pc(27) int local27 = arg1 * this.anInt5905 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt4145;
		@Pc(39) int local39 = local6.anInt4150;
		@Pc(44) int local44 = this.anInt5905 - local39;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local29 = local39 * local51;
			local36 -= local51;
			arg1 = 1;
			local27 += this.anInt5905 * local51;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt5901 <= local36 + arg1) {
			local51 = local36 + arg1 + 1 - this.anInt5901;
			local36 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local27 += local51;
			local72 = local51;
			arg2 = 1;
			local39 -= local51;
			local44 += local51;
			local29 += local51;
		}
		if (local39 + arg2 >= this.anInt5905) {
			local51 = local39 + arg2 + 1 - this.anInt5905;
			local39 -= local51;
			local44 += local51;
			local72 += local51;
		}
		if (local39 > 0 && local36 > 0) {
			Static544.method7945(local27, local6.aByteArray52, local39, local72, local29, local36, local44, this.aByteArray64);
			this.method5140(arg2, local39, local36, arg1);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILclient!r;I)V")
	public void method5137(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4_Sub5 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub2 local6 = (Class3_Sub4_Sub5_Sub2) arg1;
		arg0 += local6.anInt4141 + 1;
		arg2 += local6.anInt4146 + 1;
		@Pc(28) int local28 = arg0 + this.anInt5905 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(37) int local37 = local6.anInt4145;
		@Pc(40) int local40 = local6.anInt4150;
		@Pc(46) int local46 = this.anInt5905 - local40;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local28 += this.anInt5905 * local55;
			local30 = local40 * local55;
			local37 -= local55;
			arg2 = 1;
		}
		if (this.anInt5901 <= local37 + arg2) {
			local55 = arg2 + local37 + 1 - this.anInt5901;
			local37 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local46 += local55;
			local30 += local55;
			local48 = local55;
			local28 += local55;
			local40 -= local55;
			arg0 = 1;
		}
		if (arg0 + local40 >= this.anInt5905) {
			local55 = arg0 + local40 + 1 - this.anInt5905;
			local46 += local55;
			local40 -= local55;
			local48 += local55;
		}
		if (local40 > 0 && local37 > 0) {
			Static128.method2507(this.aByteArray64, local40, local28, local46, local6.aByteArray52, local37, local48, local30);
			this.method5140(arg0, local40, local37, arg2);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([[ZIIBIZ)V")
	public void method5138(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass5_Sub1_14.method5630(false);
		this.aClass5_Sub1_14.method5636(false);
		this.aClass5_Sub1_14.method5666(1);
		this.aClass5_Sub1_14.method5697(1);
		this.aClass5_Sub1_14.method5579(false, false, -2);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass5_Sub1_14.anInt6529 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg4) {
			for (local49 = 0; local49 < this.anInt5903; local49++) {
				local56 = local49 << this.anInt5902;
				local63 = local49 + 1 << this.anInt5902;
				label138: for (local65 = 0; local65 < this.anInt5898; local65++) {
					if (this.aClass169ArrayArray1[local65][local49] != null) {
						@Pc(79) int local79 = local65 << this.anInt5902;
						@Pc(86) int local86 = local65 + 1 << this.anInt5902;
						for (@Pc(88) int local88 = local79; local88 < local86; local88++) {
							if (local88 - arg1 >= -arg2 && local88 - arg1 <= arg2) {
								for (@Pc(113) int local113 = local56; local113 < local63; local113++) {
									if (local113 - arg3 >= -arg2 && arg2 >= local113 - arg3 && arg0[arg2 + local88 - arg1][local113 + arg2 - arg3]) {
										@Pc(158) Class39_Sub1 local158 = this.aClass5_Sub1_14.method5678();
										local158.method1551(local45, 1.0F, local45);
										local158.method7244(-local65, -local49, 0);
										this.aClass5_Sub1_14.method5589(Static190.aClass340_2);
										this.aClass169ArrayArray1[local65][local49].method4318();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt5903; local49++) {
				local56 = local49 << this.anInt5902;
				local63 = local49 + 1 << this.anInt5902;
				for (local65 = 0; local65 < this.anInt5898; local65++) {
					@Pc(245) Class169 local245 = this.aClass169ArrayArray1[local65][local49];
					if (local245 != null) {
						@Pc(256) Interface19 local256 = this.aClass5_Sub1_14.method5669(local245.anInt4797 * 3);
						@Pc(261) Buffer local261 = local256.method7984();
						if (local261 != null) {
							@Pc(269) Stream local269 = this.aClass5_Sub1_14.method5647(local261);
							@Pc(271) int local271 = 0;
							@Pc(276) int local276 = local65 << this.anInt5902;
							@Pc(283) int local283 = local65 + 1 << this.anInt5902;
							for (@Pc(285) int local285 = local56; local285 < local63; local285++) {
								if (-arg2 <= local285 - arg3 && local285 - arg3 <= arg2) {
									@Pc(313) int local313 = this.aClass51_Sub1_2.anInt9121 * local285 + local276;
									for (@Pc(315) int local315 = local276; local315 < local283; local315++) {
										if (-arg2 <= local315 - arg1 && local315 - arg1 <= arg2 && arg0[arg2 + local315 - arg1][arg2 + local285 - arg3]) {
											@Pc(356) short[] local356 = this.aClass51_Sub1_2.aShortArrayArray1[local313];
											if (local356 != null) {
												@Pc(362) int local362;
												if (Stream.a()) {
													for (local362 = 0; local362 < local356.length; local362++) {
														local271++;
														local269.e(local356[local362] & 0xFFFF);
													}
												} else {
													for (local362 = 0; local362 < local356.length; local362++) {
														local269.d(local356[local362] & 0xFFFF);
														local271++;
													}
												}
											}
										}
										local313++;
									}
								}
							}
							local269.b();
							if (local256.method7985() && local271 > 0) {
								@Pc(429) Class39_Sub1 local429 = this.aClass5_Sub1_14.method5678();
								local429.method1551(local45, 1.0F, local45);
								local429.method7244(-local65, -local49, 0);
								this.aClass5_Sub1_14.method5589(Static190.aClass340_2);
								local245.method4321(local256, local271 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass5_Sub1_14.method5683();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public void method5139() {
		this.aClass169ArrayArray1 = new Class169[this.anInt5898][this.anInt5903];
		for (@Pc(20) int local20 = 0; local20 < this.anInt5903; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5898; local24++) {
				this.aClass169ArrayArray1[local24][local20] = new Class169(this.aClass5_Sub1_14, this, this.aClass51_Sub1_2, local24, local20, this.anInt5902, local24 * 128 + 1, local20 * 128 - -1);
				if (this.aClass169ArrayArray1[local24][local20].anInt4797 == 0) {
					this.aClass169ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IBIII)V")
	private void method5140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass169ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg3 - 1 >> 7;
		@Pc(50) int local50 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local25; local52++) {
			@Pc(59) Class169[] local59 = this.aClass169ArrayArray1[local52];
			for (@Pc(61) int local61 = local39; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean319 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method5144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4_Sub5 arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub2 local6 = (Class3_Sub4_Sub5_Sub2) arg2;
		arg1 += local6.anInt4146 + 1;
		arg0 += local6.anInt4141 + 1;
		@Pc(27) int local27 = arg0 + arg1 * this.anInt5905;
		@Pc(30) int local30 = local6.anInt4145;
		@Pc(41) int local41 = local6.anInt4150;
		@Pc(47) int local47 = this.anInt5905 - local41;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local30 -= local53;
			local27 += this.anInt5905 * local53;
			arg1 = 1;
		}
		if (this.anInt5901 <= local30 + arg1) {
			local53 = arg1 + local30 + 1 - this.anInt5901;
			local30 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local41 -= local53;
			local47 += local53;
			local27 += local53;
			arg0 = 1;
		}
		if (this.anInt5905 <= arg0 + local41) {
			local53 = arg0 + local41 + 1 - this.anInt5905;
			local41 -= local53;
			local47 += local53;
		}
		if (local41 > 0 && local30 > 0) {
			local47 += this.anInt5905 * 7;
			return Static22.method975(this.aByteArray64, local41, local47, local27, local30);
		} else {
			return false;
		}
	}
}
