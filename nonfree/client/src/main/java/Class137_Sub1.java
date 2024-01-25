import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public abstract class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
	protected int anInt6439;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "[I")
	private int[] anIntArray601;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	protected int anInt6457;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
	protected int anInt6462;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	protected int anInt6466;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "Lclient!hj;")
	protected final Class106_Sub1 aClass106_Sub1_9;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
	protected final int anInt6455;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
	protected final int anInt6447;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!hj;II)V")
	protected Class137_Sub1(@OriginalArg(0) Class106_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass106_Sub1_9 = arg0;
		this.anInt6455 = arg1;
		this.anInt6447 = arg2;
	}

	@OriginalMember(owner = "client!ts", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt6439 + this.anInt6447 + this.anInt6466;
	}

	@OriginalMember(owner = "client!ts", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ts", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt6457 + this.anInt6455 + this.anInt6462;
	}

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass106_Sub1_9.method2581()) {
			throw new IllegalStateException();
		}
		this.method4940(arg0, arg1, arg2, arg3, arg4, arg5);
		Static395.anInt6464 = arg7;
		if (arg6 != 1) {
			Static395.anInt6465 = arg7 >>> 24;
			Static395.anInt6459 = 256 - Static395.anInt6465;
			if (arg6 == 0) {
				Static395.anInt6456 = arg7 >> 16 & 0xFF;
				Static395.anInt6468 = arg7 >> 8 & 0xFF;
				Static395.anInt6448 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static395.anInt6444 = arg7 >>> 24;
				Static395.anInt6452 = 256 - Static395.anInt6444;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static395.anInt6452 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static395.anInt6452 & 0xFF0000;
				Static395.anInt6438 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method4938(1);
		} else if (arg6 == 0) {
			this.method4938(0);
		} else if (arg6 == 3) {
			this.method4938(3);
		} else if (arg6 == 2) {
			this.method4938(2);
		}
	}

	@OriginalMember(owner = "client!ts", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
	protected abstract void method4938(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt6455;
	}

	@OriginalMember(owner = "client!ts", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass106_Sub1_9.method2581()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray601 == null) {
			this.anIntArray601 = new int[4];
		}
		this.aClass106_Sub1_9.MA(this.anIntArray601);
		this.aClass106_Sub1_9.HA(this.aClass106_Sub1_9.anInt3294, this.aClass106_Sub1_9.anInt3305, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.RA();
		@Pc(40) int local40 = this.Q();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.W(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass106_Sub1_9.ba(this.anIntArray601[0], this.anIntArray601[1], this.anIntArray601[2], this.anIntArray601[3]);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([I[III)V")
	protected abstract void method4939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFF)V")
	private void method4940(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6457 + this.anInt6455 + this.anInt6462;
		@Pc(17) int local17 = this.anInt6439 + this.anInt6447 + this.anInt6466;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6455 || local17 != this.anInt6447) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6439;
			local65 = local53 * (float) this.anInt6439;
			local71 = local32 * (float) this.anInt6457;
			local77 = local39 * (float) this.anInt6457;
			@Pc(84) float local84 = -local32 * (float) this.anInt6462;
			@Pc(91) float local91 = -local39 * (float) this.anInt6462;
			@Pc(98) float local98 = -local46 * (float) this.anInt6466;
			@Pc(105) float local105 = -local53 * (float) this.anInt6466;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass106_Sub1_9.anInt3294) {
			local46 = this.aClass106_Sub1_9.anInt3294;
		}
		if (local53 > (float) this.aClass106_Sub1_9.anInt3288) {
			local53 = this.aClass106_Sub1_9.anInt3288;
		}
		if (local59 < (float) this.aClass106_Sub1_9.anInt3305) {
			local59 = this.aClass106_Sub1_9.anInt3305;
		}
		if (local65 > (float) this.aClass106_Sub1_9.anInt3315) {
			local65 = this.aClass106_Sub1_9.anInt3315;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static395.anInt6460 = this.aClass106_Sub1_9.anInt3304;
		Static395.anInt6467 = (int) ((float) ((int) local59 * Static395.anInt6460) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static395.anInt6442 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6455 / local71);
		Static395.anInt6461 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6447 / local77);
		Static395.anInt6446 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6455 / local77);
		Static395.anInt6445 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6447 / local71);
		Static395.anInt6458 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static395.anInt6463 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static395.anInt6449 = (this.anInt6455 >> 1 << 12) + (Static395.anInt6463 * Static395.anInt6446 >> 4);
		Static395.anInt6453 = (this.anInt6447 >> 1 << 12) + (Static395.anInt6463 * Static395.anInt6445 >> 4);
		Static395.anInt6441 = Static395.anInt6458 * Static395.anInt6442 >> 4;
		Static395.anInt6451 = Static395.anInt6458 * Static395.anInt6461 >> 4;
		Static395.anInt6454 = (int) local46;
		Static395.anInt6450 = (int) local53;
		Static395.anInt6440 = (int) local59;
		Static395.anInt6443 = (int) local65;
	}

	@OriginalMember(owner = "client!ts", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6457 = arg0;
		this.anInt6439 = arg1;
		this.anInt6462 = arg2;
		this.anInt6466 = arg3;
	}

	@OriginalMember(owner = "client!ts", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt6447;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass106_Sub1_9.method2581()) {
			throw new IllegalStateException();
		}
		this.method4940(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class24_Sub1 local18 = (Class24_Sub1) arg6;
		this.method4939(local18.anIntArray44, local18.anIntArray46, Static395.anInt6454 - arg7, -arg8 - (Static395.anInt6443 - Static395.anInt6440));
	}
}
