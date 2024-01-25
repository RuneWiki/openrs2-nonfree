import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public abstract class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	protected int anInt6111;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	protected int anInt6119;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	protected int anInt6124;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	protected int anInt6127;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Lclient!sq;")
	protected final Class55_Sub2 aClass55_Sub2_11;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "I")
	protected final int anInt6126;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	protected final int anInt6107;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!sq;II)V")
	protected Class95_Sub1(@OriginalArg(0) Class55_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass55_Sub2_11 = arg0;
		this.anInt6126 = arg1;
		this.anInt6107 = arg2;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6111 = arg0;
		this.anInt6119 = arg1;
		this.anInt6127 = arg2;
		this.anInt6124 = arg3;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()I")
	@Override
	public final int method5503() {
		return this.anInt6126;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass55_Sub2_11.method5264()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray591 == null) {
			this.anIntArray591 = new int[4];
		}
		this.aClass55_Sub2_11.method5203(this.anIntArray591);
		this.aClass55_Sub2_11.method5162(this.aClass55_Sub2_11.anInt5847, this.aClass55_Sub2_11.anInt5850, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5507();
		@Pc(40) int local40 = this.method5494();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5492(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass55_Sub2_11.method5258(this.anIntArray591[0], this.anIntArray591[1], this.anIntArray591[2], this.anIntArray591[3]);
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "()I")
	@Override
	public final int method5507() {
		return this.anInt6111 + this.anInt6126 + this.anInt6127;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "()I")
	@Override
	public final int method5506() {
		return this.anInt6107;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass55_Sub2_11.method5264()) {
			throw new IllegalStateException();
		}
		this.method5509(arg0, arg1, arg2, arg3, arg4, arg5);
		Static140.anInt6108 = arg7;
		if (arg6 != 0) {
			Static140.anInt6131 = arg7 >>> 24;
			Static140.anInt6134 = 256 - Static140.anInt6131;
			if (arg6 == 1) {
				Static140.anInt6120 = arg7 >> 16 & 0xFF;
				Static140.anInt6112 = arg7 >> 8 & 0xFF;
				Static140.anInt6137 = arg7 & 0xFF;
			} else {
				Static140.anInt6114 = arg7 >>> 24;
				Static140.anInt6122 = 256 - Static140.anInt6114;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static140.anInt6122 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static140.anInt6122 & 0xFF0000;
				Static140.anInt6115 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5511(0);
		} else if (arg6 == 1) {
			this.method5511(1);
		} else if (arg6 == 2) {
			this.method5511(2);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFF)V")
	private void method5509(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6111 + this.anInt6126 + this.anInt6127;
		@Pc(17) int local17 = this.anInt6119 + this.anInt6107 + this.anInt6124;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6126 || local17 != this.anInt6107) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6119;
			local65 = local53 * (float) this.anInt6119;
			local71 = local32 * (float) this.anInt6111;
			local77 = local39 * (float) this.anInt6111;
			@Pc(84) float local84 = -local32 * (float) this.anInt6127;
			@Pc(91) float local91 = -local39 * (float) this.anInt6127;
			@Pc(98) float local98 = -local46 * (float) this.anInt6124;
			@Pc(105) float local105 = -local53 * (float) this.anInt6124;
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
		if (local46 < (float) this.aClass55_Sub2_11.anInt5847) {
			local46 = this.aClass55_Sub2_11.anInt5847;
		}
		if (local53 > (float) this.aClass55_Sub2_11.anInt5829) {
			local53 = this.aClass55_Sub2_11.anInt5829;
		}
		if (local59 < (float) this.aClass55_Sub2_11.anInt5850) {
			local59 = this.aClass55_Sub2_11.anInt5850;
		}
		if (local65 > (float) this.aClass55_Sub2_11.anInt5833) {
			local65 = this.aClass55_Sub2_11.anInt5833;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static140.anInt6118 = this.aClass55_Sub2_11.anInt5838;
		Static140.anInt6117 = (int) ((float) ((int) local59 * Static140.anInt6118) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static140.anInt6130 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6126 / local71);
		Static140.anInt6109 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6107 / local77);
		Static140.anInt6121 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6126 / local77);
		Static140.anInt6133 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6107 / local71);
		Static140.anInt6123 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static140.anInt6110 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static140.anInt6128 = (this.anInt6126 >> 1 << 12) + (Static140.anInt6110 * Static140.anInt6121 >> 4);
		Static140.anInt6136 = (this.anInt6107 >> 1 << 12) + (Static140.anInt6110 * Static140.anInt6133 >> 4);
		Static140.anInt6116 = Static140.anInt6123 * Static140.anInt6130 >> 4;
		Static140.anInt6129 = Static140.anInt6123 * Static140.anInt6109 >> 4;
		Static140.anInt6125 = (int) local46;
		Static140.anInt6113 = (int) local53;
		Static140.anInt6135 = (int) local59;
		Static140.anInt6132 = (int) local65;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFFLclient!de;II)V")
	@Override
	protected final void method5489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass55_Sub2_11.method5264()) {
			throw new IllegalStateException();
		}
		this.method5509(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class46_Sub1 local18 = (Class46_Sub1) arg6;
		this.method5510(local18.anIntArray403, local18.anIntArray402, Static140.anInt6125 - arg7, -arg8 - (Static140.anInt6132 - Static140.anInt6135));
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public abstract void method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([I[III)V")
	protected abstract void method5510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	protected abstract void method5511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!de;II)V")
	public abstract void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
	@Override
	public final int method5494() {
		return this.anInt6119 + this.anInt6107 + this.anInt6124;
	}
}
