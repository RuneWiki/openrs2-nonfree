import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class211 {

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "[[Lclient!hq;")
	private Class126[][] aClass126ArrayArray1;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_13;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!ha;")
	private final Class52_Sub2 aClass52_Sub2_3;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public final int anInt6457;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private final int anInt6449;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	private final int anInt6458;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private final int anInt6451;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	private final int anInt6452;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!tu;Lclient!ha;)V")
	public Class211(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class52_Sub2 arg1) {
		this.aClass5_Sub3_13 = arg0;
		this.aClass52_Sub2_3 = arg1;
		this.anInt6457 = (this.aClass52_Sub2_3.anInt9491 * this.aClass52_Sub2_3.anInt9493 >> this.aClass5_Sub3_13.anInt7761) + 2;
		this.anInt6449 = (this.aClass52_Sub2_3.anInt9493 * this.aClass52_Sub2_3.anInt9492 >> this.aClass5_Sub3_13.anInt7761) + 2;
		this.anInt6458 = this.aClass5_Sub3_13.anInt7761 + 7 - this.aClass52_Sub2_3.anInt9494;
		this.aByteArray62 = new byte[this.anInt6457 * this.anInt6449];
		this.anInt6451 = this.aClass52_Sub2_3.anInt9491 >> this.anInt6458;
		this.anInt6452 = this.aClass52_Sub2_3.anInt9492 >> this.anInt6458;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLclient!w;)Z")
	public boolean method5430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub10_Sub18 arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub1 local6 = (Class3_Sub10_Sub18_Sub1) arg2;
		arg1 += local6.anInt9112 + 1;
		arg0 += local6.anInt9114 + 1;
		@Pc(32) int local32 = this.anInt6457 * arg1 + arg0;
		@Pc(35) int local35 = local6.anInt9108;
		@Pc(38) int local38 = local6.anInt9104;
		@Pc(45) int local45;
		if (arg1 <= 0) {
			local45 = 1 - arg1;
			local32 += local45 * this.anInt6457;
			local35 -= local45;
			arg1 = 1;
		}
		@Pc(63) int local63 = this.anInt6457 - local38;
		if (this.anInt6449 <= local35 + arg1) {
			local45 = arg1 + local35 + 1 - this.anInt6449;
			local35 -= local45;
		}
		if (arg0 <= 0) {
			local45 = 1 - arg0;
			local38 -= local45;
			local32 += local45;
			arg0 = 1;
			local63 += local45;
		}
		if (this.anInt6457 <= arg0 + local38) {
			local45 = local38 + arg0 + 1 - this.anInt6457;
			local38 -= local45;
			local63 += local45;
		}
		if (local38 > 0 && local35 > 0) {
			local63 += this.anInt6457 * 7;
			return Static174.method3320(this.aByteArray62, local35, local63, local38, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	private void method5431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass126ArrayArray1 == null) {
			return;
		}
		@Pc(23) int local23 = arg0 - 1 >> 7;
		@Pc(34) int local34 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg2 - 1 >> 7;
		@Pc(50) int local50 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local23; local52 <= local34; local52++) {
			@Pc(59) Class126[] local59 = this.aClass126ArrayArray1[local52];
			for (@Pc(61) int local61 = local40; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean316 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBILclient!w;)V")
	public void method5432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub10_Sub18 arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub1 local6 = (Class3_Sub10_Sub18_Sub1) arg2;
		arg0 += local6.anInt9114 + 1;
		arg1 += local6.anInt9112 + 1;
		@Pc(27) int local27 = this.anInt6457 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9108;
		@Pc(35) int local35 = local6.anInt9104;
		@Pc(41) int local41 = this.anInt6457 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local29 = local51 * local35;
			local32 -= local51;
			local27 += this.anInt6457 * local51;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg1 >= this.anInt6449) {
			local51 = arg1 + local32 + 1 - this.anInt6449;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local29 += local51;
			local41 += local51;
			local35 -= local51;
			local72 = local51;
			arg0 = 1;
			local27 += local51;
		}
		if (arg0 + local35 >= this.anInt6457) {
			local51 = local35 + arg0 + 1 - this.anInt6457;
			local35 -= local51;
			local72 += local51;
			local41 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static72.method1462(local41, local29, local6.aByteArray113, local72, local32, local35, local27, this.aByteArray62);
			this.method5431(arg0, local35, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5434() {
		this.aClass126ArrayArray1 = new Class126[this.anInt6451][this.anInt6452];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6452; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt6451; local22++) {
				this.aClass126ArrayArray1[local22][local18] = new Class126(this.aClass5_Sub3_13, this, this.aClass52_Sub2_3, local22, local18, this.anInt6458, local22 * 128 + 1, local18 * 128 + 1);
				if (this.aClass126ArrayArray1[local22][local18].anInt4267 == 0) {
					this.aClass126ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ[[ZB)V")
	public void method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[][] arg4) {
		this.aClass5_Sub3_13.method6349(false);
		this.aClass5_Sub3_13.method6311(false);
		this.aClass5_Sub3_13.method6398(1);
		this.aClass5_Sub3_13.method6309(1);
		this.aClass5_Sub3_13.method6299(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass5_Sub3_13.anInt7770 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg3) {
			for (local45 = 0; local45 < this.anInt6452; local45++) {
				local52 = local45 << this.anInt6458;
				local59 = local45 + 1 << this.anInt6458;
				label138: for (local61 = 0; local61 < this.anInt6451; local61++) {
					if (this.aClass126ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt6458;
						@Pc(82) int local82 = local61 + 1 << this.anInt6458;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (local84 - arg0 >= -arg2 && local84 - arg0 <= arg2) {
								for (@Pc(100) int local100 = local52; local100 < local59; local100++) {
									if (-arg2 <= local100 - arg1 && local100 - arg1 <= arg2 && arg4[local84 + arg2 - arg0][local100 + arg2 - arg1]) {
										@Pc(143) Class205_Sub1 local143 = this.aClass5_Sub3_13.method6348();
										local143.method5240(1.0F, local41, local41);
										local143.G(-local61, -local45, 0);
										this.aClass5_Sub3_13.method6355(Static124.aClass243_13);
										this.aClass126ArrayArray1[local61][local45].method3529();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt6452; local45++) {
				local52 = local45 << this.anInt6458;
				local59 = local45 + 1 << this.anInt6458;
				for (local61 = 0; local61 < this.anInt6451; local61++) {
					@Pc(222) Class126 local222 = this.aClass126ArrayArray1[local61][local45];
					if (local222 != null) {
						@Pc(233) Interface14 local233 = this.aClass5_Sub3_13.method6341(local222.anInt4267 * 3);
						@Pc(238) Buffer local238 = local233.method3136();
						if (local238 != null) {
							@Pc(246) Stream local246 = this.aClass5_Sub3_13.method6352(local238);
							@Pc(248) int local248 = 0;
							@Pc(253) int local253 = local61 << this.anInt6458;
							@Pc(260) int local260 = local61 + 1 << this.anInt6458;
							for (@Pc(262) int local262 = local52; local262 < local59; local262++) {
								if (local262 - arg1 >= -arg2 && arg2 >= local262 - arg1) {
									@Pc(292) int local292 = local253 + local262 * this.aClass52_Sub2_3.anInt9491;
									for (@Pc(294) int local294 = local253; local294 < local260; local294++) {
										if (-arg2 <= local294 - arg0 && arg2 >= local294 - arg0 && arg4[local294 + arg2 - arg0][arg2 + local262 - arg1]) {
											@Pc(329) short[] local329 = this.aClass52_Sub2_3.aShortArrayArray3[local292];
											if (local329 != null) {
												@Pc(335) int local335;
												if (Stream.c()) {
													for (local335 = 0; local335 < local329.length; local335++) {
														local246.c(local329[local335] & 0xFFFF);
														local248++;
													}
												} else {
													for (local335 = 0; local335 < local329.length; local335++) {
														local246.b(local329[local335] & 0xFFFF);
														local248++;
													}
												}
											}
										}
										local292++;
									}
								}
							}
							local246.a();
							if (local233.method3135() && local248 > 0) {
								@Pc(402) Class205_Sub1 local402 = this.aClass5_Sub3_13.method6348();
								local402.method5240(1.0F, local41, local41);
								local402.G(-local61, -local45, 0);
								this.aClass5_Sub3_13.method6355(Static124.aClass243_13);
								local222.method3525(local233, local248 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass5_Sub3_13.method6376();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!w;III)V")
	public void method5437(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub1 local6 = (Class3_Sub10_Sub18_Sub1) arg0;
		arg1 += local6.anInt9112 + 1;
		arg2 += local6.anInt9114 + 1;
		@Pc(27) int local27 = arg2 + this.anInt6457 * arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9108;
		@Pc(35) int local35 = local6.anInt9104;
		@Pc(40) int local40 = this.anInt6457 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local29 = local49 * local35;
			arg1 = 1;
			local27 += local49 * this.anInt6457;
			local32 -= local49;
		}
		if (arg1 + local32 >= this.anInt6449) {
			local49 = local32 + arg1 + 1 - this.anInt6449;
			local32 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local40 += local49;
			local27 += local49;
			local29 += local49;
			local42 = local49;
			local35 -= local49;
		}
		if (local35 + arg2 >= this.anInt6457) {
			local49 = arg2 + local35 + 1 - this.anInt6457;
			local40 += local49;
			local42 += local49;
			local35 -= local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static182.method3478(local32, this.aByteArray62, local40, local6.aByteArray113, local29, local35, local27, local42);
			this.method5431(arg2, local35, arg1, local32);
		}
	}
}
