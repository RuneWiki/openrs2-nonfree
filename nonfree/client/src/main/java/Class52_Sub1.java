import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public abstract class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	protected int anInt4492;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
	protected int anInt4502;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "[I")
	private int[] anIntArray606;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	protected int anInt4503;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
	protected int anInt4511;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!vn;")
	protected final Class89_Sub2 aClass89_Sub2_8;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	protected final int anInt4500;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	protected final int anInt4506;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!vn;II)V")
	protected Class52_Sub1(@OriginalArg(0) Class89_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass89_Sub2_8 = arg0;
		this.anInt4500 = arg1;
		this.anInt4506 = arg2;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4502 = arg0;
		this.anInt4511 = arg1;
		this.anInt4503 = arg2;
		this.anInt4492 = arg3;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public abstract void method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "()I")
	@Override
	public final int method4141() {
		return this.anInt4502 + this.anInt4500 + this.anInt4503;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([I[III)V")
	protected abstract void method3984(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4136(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass89_Sub2_8.method5494()) {
			throw new IllegalStateException();
		}
		this.method3985(arg0, arg1, arg2, arg3, arg4, arg5);
		Static265.anInt4504 = arg7;
		if (arg6 != 0) {
			Static265.anInt4516 = arg7 >>> 24;
			Static265.anInt4501 = 256 - Static265.anInt4516;
			if (arg6 == 1) {
				Static265.anInt4505 = arg7 >> 16 & 0xFF;
				Static265.anInt4521 = arg7 >> 8 & 0xFF;
				Static265.anInt4494 = arg7 & 0xFF;
			} else {
				Static265.anInt4496 = arg7 >>> 24;
				Static265.anInt4512 = 256 - Static265.anInt4496;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static265.anInt4512 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static265.anInt4512 & 0xFF0000;
				Static265.anInt4510 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method3986(0);
		} else if (arg6 == 1) {
			this.method3986(1);
		} else if (arg6 == 2) {
			this.method3986(2);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "()I")
	@Override
	public final int method4124() {
		return this.anInt4500;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFLclient!vj;II)V")
	@Override
	protected final void method4133(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass89_Sub2_8.method5494()) {
			throw new IllegalStateException();
		}
		this.method3985(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class64_Sub1 local18 = (Class64_Sub1) arg6;
		this.method3984(local18.anIntArray246, local18.anIntArray247, Static265.anInt4520 - arg7, -arg8 - (Static265.anInt4517 - Static265.anInt4514));
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFF)V")
	private void method3985(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4502 + this.anInt4500 + this.anInt4503;
		@Pc(17) int local17 = this.anInt4511 + this.anInt4506 + this.anInt4492;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4500 || local17 != this.anInt4506) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4511;
			local65 = local53 * (float) this.anInt4511;
			local71 = local32 * (float) this.anInt4502;
			local77 = local39 * (float) this.anInt4502;
			@Pc(84) float local84 = -local32 * (float) this.anInt4503;
			@Pc(91) float local91 = -local39 * (float) this.anInt4503;
			@Pc(98) float local98 = -local46 * (float) this.anInt4492;
			@Pc(105) float local105 = -local53 * (float) this.anInt4492;
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
		if (local46 < (float) this.aClass89_Sub2_8.anInt6416) {
			local46 = this.aClass89_Sub2_8.anInt6416;
		}
		if (local53 > (float) this.aClass89_Sub2_8.anInt6429) {
			local53 = this.aClass89_Sub2_8.anInt6429;
		}
		if (local59 < (float) this.aClass89_Sub2_8.anInt6405) {
			local59 = this.aClass89_Sub2_8.anInt6405;
		}
		if (local65 > (float) this.aClass89_Sub2_8.anInt6419) {
			local65 = this.aClass89_Sub2_8.anInt6419;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static265.anInt4507 = this.aClass89_Sub2_8.anInt6399;
		Static265.anInt4518 = (int) ((float) ((int) local59 * Static265.anInt4507) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static265.anInt4499 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4500 / local71);
		Static265.anInt4519 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4506 / local77);
		Static265.anInt4498 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4500 / local77);
		Static265.anInt4497 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4506 / local71);
		Static265.anInt4495 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static265.anInt4509 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static265.anInt4493 = (this.anInt4500 >> 1 << 12) + (Static265.anInt4509 * Static265.anInt4498 >> 4);
		Static265.anInt4515 = (this.anInt4506 >> 1 << 12) + (Static265.anInt4509 * Static265.anInt4497 >> 4);
		Static265.anInt4522 = Static265.anInt4495 * Static265.anInt4499 >> 4;
		Static265.anInt4508 = Static265.anInt4495 * Static265.anInt4519 >> 4;
		Static265.anInt4520 = (int) local46;
		Static265.anInt4513 = (int) local53;
		Static265.anInt4514 = (int) local59;
		Static265.anInt4517 = (int) local65;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "()I")
	@Override
	public final int method4134() {
		return this.anInt4506;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass89_Sub2_8.method5494()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray606 == null) {
			this.anIntArray606 = new int[4];
		}
		this.aClass89_Sub2_8.method5421(this.anIntArray606);
		this.aClass89_Sub2_8.method5453(this.aClass89_Sub2_8.anInt6416, this.aClass89_Sub2_8.anInt6405, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4141();
		@Pc(40) int local40 = this.method4140();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4131(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass89_Sub2_8.method5431(this.anIntArray606[0], this.anIntArray606[1], this.anIntArray606[2], this.anIntArray606[3]);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!vj;II)V")
	public abstract void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
	protected abstract void method3986(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "()I")
	@Override
	public final int method4140() {
		return this.anInt4511 + this.anInt4506 + this.anInt4492;
	}
}
