import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	protected int anInt6510;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	protected int anInt6515;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	protected int anInt6520;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	protected int anInt6538;

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "Lclient!ma;")
	protected final Class129_Sub1 aClass129_Sub1_11;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
	protected final int anInt6533;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	protected final int anInt6518;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ma;II)V")
	protected Class97_Sub1(@OriginalArg(0) Class129_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass129_Sub1_11 = arg0;
		this.anInt6533 = arg1;
		this.anInt6518 = arg2;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFLclient!ep;II)V")
	@Override
	protected final void method5561(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class66 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass129_Sub1_11.method3447()) {
			throw new IllegalStateException();
		}
		this.method5564(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class66_Sub1 local18 = (Class66_Sub1) arg6;
		this.method5563(local18.anIntArray305, local18.anIntArray303, Static121.anInt6537 - arg7, -arg8 - (Static121.anInt6521 - Static121.anInt6529));
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass129_Sub1_11.method3447()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray538 == null) {
			this.anIntArray538 = new int[4];
		}
		this.aClass129_Sub1_11.method4920(this.anIntArray538);
		this.aClass129_Sub1_11.method4984(this.aClass129_Sub1_11.anInt3801, this.aClass129_Sub1_11.anInt3825, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5542();
		@Pc(40) int local40 = this.method5557();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5544(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass129_Sub1_11.method4952(this.anIntArray538[0], this.anIntArray538[1], this.anIntArray538[2], this.anIntArray538[3]);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass129_Sub1_11.method3447()) {
			throw new IllegalStateException();
		}
		this.method5564(arg0, arg1, arg2, arg3, arg4, arg5);
		Static121.anInt6532 = arg7;
		if (arg6 != 0) {
			Static121.anInt6516 = arg7 >>> 24;
			Static121.anInt6524 = 256 - Static121.anInt6516;
			if (arg6 == 1) {
				Static121.anInt6514 = arg7 >> 16 & 0xFF;
				Static121.anInt6517 = arg7 >> 8 & 0xFF;
				Static121.anInt6540 = arg7 & 0xFF;
			} else {
				Static121.anInt6535 = arg7 >>> 24;
				Static121.anInt6528 = 256 - Static121.anInt6535;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static121.anInt6528 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static121.anInt6528 & 0xFF0000;
				Static121.anInt6511 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5562(0);
		} else if (arg6 == 1) {
			this.method5562(1);
		} else if (arg6 == 2) {
			this.method5562(2);
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
	protected abstract void method5562(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!ep;II)V")
	public abstract void method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([I[III)V")
	protected abstract void method5563(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6510 = arg0;
		this.anInt6520 = arg1;
		this.anInt6515 = arg2;
		this.anInt6538 = arg3;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
	@Override
	public final int method5557() {
		return this.anInt6520 + this.anInt6518 + this.anInt6538;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
	public abstract void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
	@Override
	public final int method5542() {
		return this.anInt6510 + this.anInt6533 + this.anInt6515;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()I")
	@Override
	public final int method5543() {
		return this.anInt6518;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFF)V")
	private void method5564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6510 + this.anInt6533 + this.anInt6515;
		@Pc(17) int local17 = this.anInt6520 + this.anInt6518 + this.anInt6538;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6533 || local17 != this.anInt6518) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6520;
			local65 = local53 * (float) this.anInt6520;
			local71 = local32 * (float) this.anInt6510;
			local77 = local39 * (float) this.anInt6510;
			@Pc(84) float local84 = -local32 * (float) this.anInt6515;
			@Pc(91) float local91 = -local39 * (float) this.anInt6515;
			@Pc(98) float local98 = -local46 * (float) this.anInt6538;
			@Pc(105) float local105 = -local53 * (float) this.anInt6538;
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
		if (local46 < (float) this.aClass129_Sub1_11.anInt3801) {
			local46 = this.aClass129_Sub1_11.anInt3801;
		}
		if (local53 > (float) this.aClass129_Sub1_11.anInt3798) {
			local53 = this.aClass129_Sub1_11.anInt3798;
		}
		if (local59 < (float) this.aClass129_Sub1_11.anInt3825) {
			local59 = this.aClass129_Sub1_11.anInt3825;
		}
		if (local65 > (float) this.aClass129_Sub1_11.anInt3796) {
			local65 = this.aClass129_Sub1_11.anInt3796;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static121.anInt6536 = this.aClass129_Sub1_11.anInt3800;
		Static121.anInt6512 = (int) ((float) ((int) local59 * Static121.anInt6536) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static121.anInt6534 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6533 / local71);
		Static121.anInt6539 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6518 / local77);
		Static121.anInt6513 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6533 / local77);
		Static121.anInt6525 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6518 / local71);
		Static121.anInt6531 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static121.anInt6527 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static121.anInt6522 = (this.anInt6533 >> 1 << 12) + (Static121.anInt6527 * Static121.anInt6513 >> 4);
		Static121.anInt6526 = (this.anInt6518 >> 1 << 12) + (Static121.anInt6527 * Static121.anInt6525 >> 4);
		Static121.anInt6523 = Static121.anInt6531 * Static121.anInt6534 >> 4;
		Static121.anInt6519 = Static121.anInt6531 * Static121.anInt6539 >> 4;
		Static121.anInt6537 = (int) local46;
		Static121.anInt6530 = (int) local53;
		Static121.anInt6529 = (int) local59;
		Static121.anInt6521 = (int) local65;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "()I")
	@Override
	public final int method5558() {
		return this.anInt6533;
	}
}
