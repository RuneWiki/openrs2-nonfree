import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class316 {

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "[[Lclient!ln;")
	private Class211[][] aClass211ArrayArray1;

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_21;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "Lclient!daa;")
	private final Class67_Sub1 aClass67_Sub1_3;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
	public final int anInt8457;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	private final int anInt8451;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
	private final int anInt8460;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	private final int anInt8453;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	private final int anInt8452;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!en;Lclient!daa;)V")
	public Class316(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class67_Sub1 arg1) {
		this.aClass100_Sub1_21 = arg0;
		this.aClass67_Sub1_3 = arg1;
		this.anInt8457 = (this.aClass67_Sub1_3.anInt8104 * this.aClass67_Sub1_3.anInt8111 >> this.aClass100_Sub1_21.anInt5756) + 2;
		this.anInt8451 = (this.aClass67_Sub1_3.anInt8104 * this.aClass67_Sub1_3.anInt8110 >> this.aClass100_Sub1_21.anInt5756) + 2;
		this.aByteArray84 = new byte[this.anInt8451 * this.anInt8457];
		this.anInt8460 = this.aClass100_Sub1_21.anInt5756 + 7 - this.aClass67_Sub1_3.anInt8108;
		this.anInt8453 = this.aClass67_Sub1_3.anInt8111 >> this.anInt8460;
		this.anInt8452 = this.aClass67_Sub1_3.anInt8110 >> this.anInt8460;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public void method7028() {
		this.aClass211ArrayArray1 = new Class211[this.anInt8453][this.anInt8452];
		for (@Pc(23) int local23 = 0; local23 < this.anInt8452; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt8453; local27++) {
				this.aClass211ArrayArray1[local27][local23] = new Class211(this.aClass100_Sub1_21, this, this.aClass67_Sub1_3, local27, local23, this.anInt8460, local27 * 128 + 1, local23 * 128 - -1);
				if (this.aClass211ArrayArray1[local27][local23].anInt5885 == 0) {
					this.aClass211ArrayArray1[local27][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILclient!ha;I)V")
	public void method7029(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub1 local6 = (Class2_Sub3_Sub6_Sub1) arg1;
		arg2 += local6.anInt6820 + 1;
		arg0 += local6.anInt6818 + 1;
		@Pc(33) int local33 = arg0 + arg2 * this.anInt8457;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt6826;
		@Pc(41) int local41 = local6.anInt6817;
		@Pc(47) int local47 = this.anInt8457 - local41;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local38 -= local54;
			local35 = local41 * local54;
			local33 += local54 * this.anInt8457;
			arg2 = 1;
		}
		@Pc(75) int local75 = 0;
		if (local38 + arg2 >= this.anInt8451) {
			local54 = arg2 + local38 + 1 - this.anInt8451;
			local38 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local75 = local54;
			local33 += local54;
			local47 += local54;
			arg0 = 1;
			local35 += local54;
			local41 -= local54;
		}
		if (arg0 + local41 >= this.anInt8457) {
			local54 = arg0 + local41 + 1 - this.anInt8457;
			local47 += local54;
			local75 += local54;
			local41 -= local54;
		}
		if (local41 > 0 && local38 > 0) {
			Static305.method4557(local6.aByteArray69, local35, local75, local41, local33, local38, local47, this.aByteArray84);
			this.method7031(local41, arg2, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIII)V")
	private void method7031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass211ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(41) int local41 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class211[] local50 = this.aClass211ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean470 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!ha;BII)Z")
	public boolean method7032(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub1 local6 = (Class2_Sub3_Sub6_Sub1) arg0;
		arg1 += local6.anInt6820 + 1;
		arg2 += local6.anInt6818 + 1;
		@Pc(27) int local27 = arg1 * this.anInt8457 + arg2;
		@Pc(36) int local36 = local6.anInt6826;
		@Pc(39) int local39 = local6.anInt6817;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			arg1 = 1;
			local27 += local46 * this.anInt8457;
			local36 -= local46;
		}
		@Pc(65) int local65 = this.anInt8457 - local39;
		if (arg1 + local36 >= this.anInt8451) {
			local46 = local36 + arg1 + 1 - this.anInt8451;
			local36 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			arg2 = 1;
			local65 += local46;
			local39 -= local46;
			local27 += local46;
		}
		if (this.anInt8457 <= local39 + arg2) {
			local46 = local39 + arg2 + 1 - this.anInt8457;
			local39 -= local46;
			local65 += local46;
		}
		if (local39 > 0 && local36 > 0) {
			local65 += this.anInt8457 * 7;
			return Static250.method3922(local65, local36, this.aByteArray84, local39, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(Lclient!ha;BII)V")
	public void method7033(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub3_Sub6_Sub1 local6 = (Class2_Sub3_Sub6_Sub1) arg0;
		arg1 += local6.anInt6820 + 1;
		arg2 += local6.anInt6818 + 1;
		@Pc(28) int local28 = arg2 + this.anInt8457 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(37) int local37 = local6.anInt6826;
		@Pc(40) int local40 = local6.anInt6817;
		@Pc(46) int local46 = this.anInt8457 - local40;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local30 = local40 * local56;
			local28 += local56 * this.anInt8457;
			local37 -= local56;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt8451 <= arg1 + local37) {
			local56 = local37 + arg1 + 1 - this.anInt8451;
			local37 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local30 += local56;
			arg2 = 1;
			local40 -= local56;
			local46 += local56;
			local77 = local56;
			local28 += local56;
		}
		if (this.anInt8457 <= local40 + arg2) {
			local56 = arg2 + local40 + 1 - this.anInt8457;
			local77 += local56;
			local46 += local56;
			local40 -= local56;
		}
		if (local40 > 0 && local37 > 0) {
			Static391.method5730(local40, local37, local30, local46, local28, local6.aByteArray69, local77, this.aByteArray84);
			this.method7031(local40, arg1, local37, arg2);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIII[[ZZ)V")
	public void method7035(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4) {
		this.aClass100_Sub1_21.method4774(false);
		this.aClass100_Sub1_21.method4871(false);
		this.aClass100_Sub1_21.method4801(1);
		this.aClass100_Sub1_21.method4872(1);
		this.aClass100_Sub1_21.method4761(-2, false, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass100_Sub1_21.anInt5784 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg0) {
			for (local45 = 0; local45 < this.anInt8452; local45++) {
				local52 = local45 << this.anInt8460;
				local59 = local45 + 1 << this.anInt8460;
				label138: for (local61 = 0; local61 < this.anInt8453; local61++) {
					if (this.aClass211ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt8460;
						@Pc(82) int local82 = local61 + 1 << this.anInt8460;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (local84 - arg2 >= -arg1 && arg1 >= local84 - arg2) {
								for (@Pc(105) int local105 = local52; local105 < local59; local105++) {
									if (local105 - arg3 >= -arg1 && local105 - arg3 <= arg1 && arg4[local84 + arg1 - arg2][local105 + arg1 - arg3]) {
										@Pc(142) Class68_Sub2 local142 = this.aClass100_Sub1_21.method4818();
										local142.method5108(local41, local41, 1.0F);
										local142.U(-local61, -local45, 0);
										this.aClass100_Sub1_21.method4758(Static21.aClass190_1);
										this.aClass211ArrayArray1[local61][local45].method4891();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt8452; local45++) {
				local52 = local45 << this.anInt8460;
				local59 = local45 + 1 << this.anInt8460;
				for (local61 = 0; local61 < this.anInt8453; local61++) {
					@Pc(225) Class211 local225 = this.aClass211ArrayArray1[local61][local45];
					if (local225 != null) {
						@Pc(236) Interface11 local236 = this.aClass100_Sub1_21.method4795(local225.anInt5885 * 3);
						@Pc(241) Buffer local241 = local236.method4114();
						if (local241 != null) {
							@Pc(249) Stream local249 = this.aClass100_Sub1_21.method4834(local241);
							@Pc(251) int local251 = 0;
							@Pc(256) int local256 = local61 << this.anInt8460;
							@Pc(263) int local263 = local61 + 1 << this.anInt8460;
							for (@Pc(265) int local265 = local52; local265 < local59; local265++) {
								if (-arg1 <= local265 - arg3 && local265 - arg3 <= arg1) {
									@Pc(292) int local292 = local256 + local265 * this.aClass67_Sub1_3.anInt8111;
									for (@Pc(294) int local294 = local256; local294 < local263; local294++) {
										if (local294 - arg2 >= -arg1 && local294 - arg2 <= arg1 && arg4[local294 + arg1 - arg2][local265 + arg1 - arg3]) {
											@Pc(338) short[] local338 = this.aClass67_Sub1_3.aShortArrayArray1[local292];
											if (local338 != null) {
												@Pc(344) int local344;
												if (Stream.a()) {
													for (local344 = 0; local344 < local338.length; local344++) {
														local249.c(local338[local344] & 0xFFFF);
														local251++;
													}
												} else {
													for (local344 = 0; local344 < local338.length; local344++) {
														local251++;
														local249.e(local338[local344] & 0xFFFF);
													}
												}
											}
										}
										local292++;
									}
								}
							}
							local249.c();
							if (local236.method4118() && local251 > 0) {
								@Pc(412) Class68_Sub2 local412 = this.aClass100_Sub1_21.method4818();
								local412.method5108(local41, local41, 1.0F);
								local412.U(-local61, -local45, 0);
								this.aClass100_Sub1_21.method4758(Static21.aClass190_1);
								local225.method4890(local251 / 3, local236);
							}
						}
					}
				}
			}
		}
		this.aClass100_Sub1_21.method4804();
	}
}
