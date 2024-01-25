import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class23 {

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "[[Lclient!mj;")
	private Class205[][] aClass205ArrayArray1;

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "Lclient!si;")
	private final Class245_Sub2 aClass245_Sub2_1;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
	public final int anInt827;

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
	private final int anInt826;

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
	private final int anInt821;

	@OriginalMember(owner = "client!bba", name = "n", descriptor = "[B")
	public final byte[] aByteArray5;

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
	private final int anInt825;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
	private final int anInt822;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!uv;Lclient!si;)V")
	public Class23(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class245_Sub2 arg1) {
		this.aClass245_Sub2_1 = arg1;
		this.aClass5_Sub2_1 = arg0;
		this.anInt827 = (this.aClass245_Sub2_1.anInt9291 * this.aClass245_Sub2_1.anInt9289 >> this.aClass5_Sub2_1.anInt4864) + 2;
		this.anInt826 = (this.aClass245_Sub2_1.anInt9290 * this.aClass245_Sub2_1.anInt9291 >> this.aClass5_Sub2_1.anInt4864) + 2;
		this.anInt821 = this.aClass5_Sub2_1.anInt4864 + 7 - this.aClass245_Sub2_1.anInt9286;
		this.aByteArray5 = new byte[this.anInt826 * this.anInt827];
		this.anInt825 = this.aClass245_Sub2_1.anInt9289 >> this.anInt821;
		this.anInt822 = this.aClass245_Sub2_1.anInt9290 >> this.anInt821;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ[[ZIII)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub2_1.method3982(false);
		this.aClass5_Sub2_1.method4000(false);
		this.aClass5_Sub2_1.method4004(1);
		this.aClass5_Sub2_1.method4018(1);
		this.aClass5_Sub2_1.method4042(false, -2, false);
		@Pc(46) float local46 = 1.0F / (float) (this.aClass5_Sub2_1.anInt4858 * 128);
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(66) int local66;
		if (arg1) {
			for (local50 = 0; local50 < this.anInt822; local50++) {
				local57 = local50 << this.anInt821;
				local64 = local50 + 1 << this.anInt821;
				label138: for (local66 = 0; local66 < this.anInt825; local66++) {
					if (this.aClass205ArrayArray1[local66][local50] != null) {
						@Pc(80) int local80 = local66 << this.anInt821;
						@Pc(87) int local87 = local66 + 1 << this.anInt821;
						for (@Pc(89) int local89 = local80; local89 < local87; local89++) {
							if (-arg4 <= local89 - arg0 && arg4 >= local89 - arg0) {
								for (@Pc(105) int local105 = local57; local105 < local64; local105++) {
									if (local105 - arg3 >= -arg4 && arg4 >= local105 - arg3 && arg2[arg4 + local89 - arg0][arg4 + local105 - arg3]) {
										@Pc(139) Class115_Sub3 local139 = this.aClass5_Sub2_1.method3960();
										local139.method6318(local46, local46, 1.0F);
										local139.method6296(-local66, -local50, 0);
										this.aClass5_Sub2_1.method4011(Static557.aClass272_6);
										this.aClass205ArrayArray1[local66][local50].method5740();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local50 = 0; local50 < this.anInt822; local50++) {
				local57 = local50 << this.anInt821;
				local64 = local50 + 1 << this.anInt821;
				for (local66 = 0; local66 < this.anInt825; local66++) {
					@Pc(226) Class205 local226 = this.aClass205ArrayArray1[local66][local50];
					if (local226 != null) {
						@Pc(237) Interface27 local237 = this.aClass5_Sub2_1.method3966(local226.anInt6864 * 3);
						@Pc(242) Buffer local242 = local237.method7962();
						if (local242 != null) {
							@Pc(250) Stream local250 = this.aClass5_Sub2_1.method4046(local242);
							@Pc(252) int local252 = 0;
							@Pc(257) int local257 = local66 << this.anInt821;
							@Pc(264) int local264 = local66 + 1 << this.anInt821;
							for (@Pc(266) int local266 = local57; local266 < local64; local266++) {
								if (-arg4 <= local266 - arg3 && local266 - arg3 <= arg4) {
									@Pc(289) int local289 = this.aClass245_Sub2_1.anInt9289 * local266 + local257;
									for (@Pc(291) int local291 = local257; local291 < local264; local291++) {
										if (local291 - arg0 >= -arg4 && arg4 >= local291 - arg0 && arg2[arg4 + local291 - arg0][local266 + arg4 - arg3]) {
											@Pc(332) short[] local332 = this.aClass245_Sub2_1.aShortArrayArray29[local289];
											if (local332 != null) {
												@Pc(338) int local338;
												if (Stream.a()) {
													for (local338 = 0; local338 < local332.length; local338++) {
														local252++;
														local250.c(local332[local338] & 0xFFFF);
													}
												} else {
													for (local338 = 0; local338 < local332.length; local338++) {
														local252++;
														local250.d(local332[local338] & 0xFFFF);
													}
												}
											}
										}
										local289++;
									}
								}
							}
							local250.c();
							if (local237.method7963() && local252 > 0) {
								@Pc(401) Class115_Sub3 local401 = this.aClass5_Sub2_1.method3960();
								local401.method6318(local46, local46, 1.0F);
								local401.method6296(-local66, -local50, 0);
								this.aClass5_Sub2_1.method4011(Static557.aClass272_6);
								local226.method5742(local237, local252 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass5_Sub2_1.method3988();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
	public void method773() {
		this.aClass205ArrayArray1 = new Class205[this.anInt825][this.anInt822];
		for (@Pc(20) int local20 = 0; local20 < this.anInt822; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt825; local24++) {
				this.aClass205ArrayArray1[local24][local20] = new Class205(this.aClass5_Sub2_1, this, this.aClass245_Sub2_1, local24, local20, this.anInt821, local24 * 128 + 1, local20 * 128 + 1);
				if (this.aClass205ArrayArray1[local24][local20].anInt6864 == 0) {
					this.aClass205ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIII)V")
	private void method774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass205ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(53) int local53 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(55) int local55 = local15; local55 <= local25; local55++) {
			@Pc(62) Class205[] local62 = this.aClass205ArrayArray1[local55];
			for (@Pc(64) int local64 = local31; local64 <= local53; local64++) {
				if (local62[local64] != null) {
					local62[local64].aBoolean549 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!r;IBI)V")
	public void method775(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class6_Sub5_Sub10_Sub2 local11 = (Class6_Sub5_Sub10_Sub2) arg0;
		arg1 += local11.anInt4135 + 1;
		arg2 += local11.anInt4129 + 1;
		@Pc(32) int local32 = arg2 * this.anInt827 + arg1;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local11.anInt4137;
		@Pc(40) int local40 = local11.anInt4130;
		@Pc(46) int local46 = this.anInt827 - local40;
		@Pc(48) int local48 = 0;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			arg2 = 1;
			local37 -= local58;
			local34 = local40 * local58;
			local32 += local58 * this.anInt827;
		}
		if (this.anInt826 <= local37 + arg2) {
			local58 = local37 + arg2 + 1 - this.anInt826;
			local37 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local40 -= local58;
			local32 += local58;
			local34 += local58;
			local48 = local58;
			arg1 = 1;
			local46 += local58;
		}
		if (this.anInt827 <= local40 + arg1) {
			local58 = local40 + arg1 + 1 - this.anInt827;
			local48 += local58;
			local46 += local58;
			local40 -= local58;
		}
		if (local40 > 0 && local37 > 0) {
			Static190.method3514(local34, this.aByteArray5, local37, local46, local40, local48, local11.aByteArray29, local32);
			this.method774(arg2, arg1, local40, local37);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!r;BII)V")
	public void method776(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub2 local6 = (Class6_Sub5_Sub10_Sub2) arg0;
		arg2 += local6.anInt4129 + 1;
		arg1 += local6.anInt4135 + 1;
		@Pc(27) int local27 = this.anInt827 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4137;
		@Pc(43) int local43 = local6.anInt4130;
		@Pc(49) int local49 = this.anInt827 - local43;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			arg2 = 1;
			local29 = local55 * local43;
			local27 += this.anInt827 * local55;
			local32 -= local55;
		}
		@Pc(76) int local76 = 0;
		if (arg2 + local32 >= this.anInt826) {
			local55 = local32 + arg2 + 1 - this.anInt826;
			local32 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local27 += local55;
			local43 -= local55;
			arg1 = 1;
			local76 = local55;
			local49 += local55;
			local29 += local55;
		}
		if (this.anInt827 <= local43 + arg1) {
			local55 = local43 + arg1 + 1 - this.anInt827;
			local43 -= local55;
			local49 += local55;
			local76 += local55;
		}
		if (local43 > 0 && local32 > 0) {
			Static558.method7840(local32, local49, local76, local43, this.aByteArray5, local29, local6.aByteArray29, local27);
			this.method774(arg2, arg1, local43, local32);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method778(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub2 local6 = (Class6_Sub5_Sub10_Sub2) arg1;
		arg2 += local6.anInt4135 + 1;
		arg0 += local6.anInt4129 + 1;
		@Pc(27) int local27 = this.anInt827 * arg0 + arg2;
		@Pc(30) int local30 = local6.anInt4137;
		@Pc(33) int local33 = local6.anInt4130;
		@Pc(43) int local43;
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local27 += local43 * this.anInt827;
			arg0 = 1;
			local30 -= local43;
		}
		@Pc(62) int local62 = this.anInt827 - local33;
		if (arg0 + local30 >= this.anInt826) {
			local43 = arg0 + local30 + 1 - this.anInt826;
			local30 -= local43;
		}
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			arg2 = 1;
			local62 += local43;
			local33 -= local43;
			local27 += local43;
		}
		if (this.anInt827 <= local33 + arg2) {
			local43 = local33 + arg2 + 1 - this.anInt827;
			local62 += local43;
			local33 -= local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt827 * 7;
			return Static228.method4140(local27, local62, local33, this.aByteArray5, local30);
		} else {
			return false;
		}
	}
}
