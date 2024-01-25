import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	protected int anInt6415;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	protected int anInt6419;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	protected int anInt6426;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	protected int anInt6443;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "Lclient!lh;")
	protected final Class122_Sub1 aClass122_Sub1_10;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
	protected final int anInt6438;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	protected final int anInt6431;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!lh;II)V")
	protected Class57_Sub2(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub1_10 = arg0;
		this.anInt6438 = arg1;
		this.anInt6431 = arg2;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFFLclient!sf;II)V")
	@Override
	protected final void method5439(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass122_Sub1_10.method3212()) {
			throw new IllegalStateException();
		}
		this.method5451(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class74_Sub2 local18 = (Class74_Sub2) arg6;
		this.method5452(local18.anIntArray366, local18.anIntArray365, Static242.anInt6424 - arg7, -arg8 - (Static242.anInt6436 - Static242.anInt6433));
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()I")
	@Override
	public final int method5433() {
		return this.anInt6443 + this.anInt6438 + this.anInt6426;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFF)V")
	private void method5451(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6443 + this.anInt6438 + this.anInt6426;
		@Pc(17) int local17 = this.anInt6419 + this.anInt6431 + this.anInt6415;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6438 || local17 != this.anInt6431) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6419;
			local65 = local53 * (float) this.anInt6419;
			local71 = local32 * (float) this.anInt6443;
			local77 = local39 * (float) this.anInt6443;
			@Pc(84) float local84 = -local32 * (float) this.anInt6426;
			@Pc(91) float local91 = -local39 * (float) this.anInt6426;
			@Pc(98) float local98 = -local46 * (float) this.anInt6415;
			@Pc(105) float local105 = -local53 * (float) this.anInt6415;
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
		if (local46 < (float) this.aClass122_Sub1_10.anInt3837) {
			local46 = this.aClass122_Sub1_10.anInt3837;
		}
		if (local53 > (float) this.aClass122_Sub1_10.anInt3856) {
			local53 = this.aClass122_Sub1_10.anInt3856;
		}
		if (local59 < (float) this.aClass122_Sub1_10.anInt3840) {
			local59 = this.aClass122_Sub1_10.anInt3840;
		}
		if (local65 > (float) this.aClass122_Sub1_10.anInt3839) {
			local65 = this.aClass122_Sub1_10.anInt3839;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static242.anInt6428 = this.aClass122_Sub1_10.anInt3844;
		Static242.anInt6417 = (int) ((float) ((int) local59 * Static242.anInt6428) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static242.anInt6432 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6438 / local71);
		Static242.anInt6416 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6431 / local77);
		Static242.anInt6420 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6438 / local77);
		Static242.anInt6429 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6431 / local71);
		Static242.anInt6434 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static242.anInt6439 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static242.anInt6440 = (this.anInt6438 >> 1 << 12) + (Static242.anInt6439 * Static242.anInt6420 >> 4);
		Static242.anInt6418 = (this.anInt6431 >> 1 << 12) + (Static242.anInt6439 * Static242.anInt6429 >> 4);
		Static242.anInt6425 = Static242.anInt6434 * Static242.anInt6432 >> 4;
		Static242.anInt6442 = Static242.anInt6434 * Static242.anInt6416 >> 4;
		Static242.anInt6424 = (int) local46;
		Static242.anInt6445 = (int) local53;
		Static242.anInt6433 = (int) local59;
		Static242.anInt6436 = (int) local65;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()I")
	@Override
	public final int method5447() {
		return this.anInt6431;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([I[III)V")
	protected abstract void method5452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V")
	protected abstract void method5453(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6443 = arg0;
		this.anInt6419 = arg1;
		this.anInt6426 = arg2;
		this.anInt6415 = arg3;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5436(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass122_Sub1_10.method3212()) {
			throw new IllegalStateException();
		}
		this.method5451(arg0, arg1, arg2, arg3, arg4, arg5);
		Static242.anInt6430 = arg7;
		if (arg6 != 0) {
			Static242.anInt6444 = arg7 >>> 24;
			Static242.anInt6437 = 256 - Static242.anInt6444;
			if (arg6 == 1) {
				Static242.anInt6422 = arg7 >> 16 & 0xFF;
				Static242.anInt6421 = arg7 >> 8 & 0xFF;
				Static242.anInt6435 = arg7 & 0xFF;
			} else {
				Static242.anInt6427 = arg7 >>> 24;
				Static242.anInt6423 = 256 - Static242.anInt6427;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static242.anInt6423 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static242.anInt6423 & 0xFF0000;
				Static242.anInt6441 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5453(0);
		} else if (arg6 == 1) {
			this.method5453(1);
		} else if (arg6 == 2) {
			this.method5453(2);
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
	@Override
	public final int method5441() {
		return this.anInt6419 + this.anInt6431 + this.anInt6415;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
	@Override
	public final int method5440() {
		return this.anInt6438;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!sf;II)V")
	public abstract void method5444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass122_Sub1_10.method3212()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray535 == null) {
			this.anIntArray535 = new int[4];
		}
		this.aClass122_Sub1_10.method4796(this.anIntArray535);
		this.aClass122_Sub1_10.method4704(this.aClass122_Sub1_10.anInt3837, this.aClass122_Sub1_10.anInt3840, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5433();
		@Pc(40) int local40 = this.method5441();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5446(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass122_Sub1_10.method4768(this.anIntArray535[0], this.anIntArray535[1], this.anIntArray535[2], this.anIntArray535[3]);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	public abstract void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
