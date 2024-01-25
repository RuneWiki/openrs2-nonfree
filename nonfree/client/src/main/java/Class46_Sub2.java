import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public abstract class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	protected int anInt5943;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	protected int anInt5949;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
	protected int anInt5954;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	protected int anInt5956;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!me;")
	protected final Class37_Sub2 aClass37_Sub2_8;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	protected final int anInt5944;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	protected final int anInt5934;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!me;II)V")
	protected Class46_Sub2(@OriginalArg(0) Class37_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass37_Sub2_8 = arg0;
		this.anInt5944 = arg1;
		this.anInt5934 = arg2;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFFLclient!or;II)V")
	@Override
	protected final void method5035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class124 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass37_Sub2_8.method3754()) {
			throw new IllegalStateException();
		}
		this.method5036(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class124_Sub1 local18 = (Class124_Sub1) arg6;
		this.method5038(local18.anIntArray307, local18.anIntArray305, Static169.anInt5937 - arg7, -arg8 - (Static169.anInt5950 - Static169.anInt5931));
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!or;II)V")
	public abstract void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public abstract void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()I")
	@Override
	public final int method5022() {
		return this.anInt5956 + this.anInt5934 + this.anInt5949;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5943 = arg0;
		this.anInt5956 = arg1;
		this.anInt5954 = arg2;
		this.anInt5949 = arg3;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5028(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass37_Sub2_8.method3754()) {
			throw new IllegalStateException();
		}
		this.method5036(arg0, arg1, arg2, arg3, arg4, arg5);
		Static169.anInt5942 = arg7;
		if (arg6 != 0) {
			Static169.anInt5930 = arg7 >>> 24;
			Static169.anInt5946 = 256 - Static169.anInt5930;
			if (arg6 == 1) {
				Static169.anInt5939 = arg7 >> 16 & 0xFF;
				Static169.anInt5935 = arg7 >> 8 & 0xFF;
				Static169.anInt5928 = arg7 & 0xFF;
			} else {
				Static169.anInt5936 = arg7 >>> 24;
				Static169.anInt5940 = 256 - Static169.anInt5936;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static169.anInt5940 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static169.anInt5940 & 0xFF0000;
				Static169.anInt5941 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5037(0);
		} else if (arg6 == 1) {
			this.method5037(1);
		} else if (arg6 == 2) {
			this.method5037(2);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFF)V")
	private void method5036(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5943 + this.anInt5944 + this.anInt5954;
		@Pc(17) int local17 = this.anInt5956 + this.anInt5934 + this.anInt5949;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5944 || local17 != this.anInt5934) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5956;
			local65 = local53 * (float) this.anInt5956;
			local71 = local32 * (float) this.anInt5943;
			local77 = local39 * (float) this.anInt5943;
			@Pc(84) float local84 = -local32 * (float) this.anInt5954;
			@Pc(91) float local91 = -local39 * (float) this.anInt5954;
			@Pc(98) float local98 = -local46 * (float) this.anInt5949;
			@Pc(105) float local105 = -local53 * (float) this.anInt5949;
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
		if (local46 < (float) this.aClass37_Sub2_8.anInt4334) {
			local46 = this.aClass37_Sub2_8.anInt4334;
		}
		if (local53 > (float) this.aClass37_Sub2_8.anInt4339) {
			local53 = this.aClass37_Sub2_8.anInt4339;
		}
		if (local59 < (float) this.aClass37_Sub2_8.anInt4345) {
			local59 = this.aClass37_Sub2_8.anInt4345;
		}
		if (local65 > (float) this.aClass37_Sub2_8.anInt4326) {
			local65 = this.aClass37_Sub2_8.anInt4326;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static169.anInt5953 = this.aClass37_Sub2_8.lb;
		Static169.anInt5945 = (int) ((float) ((int) local59 * Static169.anInt5953) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static169.anInt5927 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5944 / local71);
		Static169.anInt5929 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5934 / local77);
		Static169.anInt5932 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5944 / local77);
		Static169.anInt5957 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5934 / local71);
		Static169.anInt5951 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static169.anInt5948 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static169.anInt5955 = (this.anInt5944 >> 1 << 12) + (Static169.anInt5948 * Static169.anInt5932 >> 4);
		Static169.anInt5938 = (this.anInt5934 >> 1 << 12) + (Static169.anInt5948 * Static169.anInt5957 >> 4);
		Static169.anInt5952 = Static169.anInt5951 * Static169.anInt5927 >> 4;
		Static169.anInt5933 = Static169.anInt5951 * Static169.anInt5929 >> 4;
		Static169.anInt5937 = (int) local46;
		Static169.anInt5947 = (int) local53;
		Static169.anInt5931 = (int) local59;
		Static169.anInt5950 = (int) local65;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	protected abstract void method5037(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([I[III)V")
	protected abstract void method5038(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "()I")
	@Override
	public final int method5031() {
		return this.anInt5943 + this.anInt5944 + this.anInt5954;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()I")
	@Override
	public final int method5019() {
		return this.anInt5944;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass37_Sub2_8.method3754()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray457 == null) {
			this.anIntArray457 = new int[4];
		}
		this.aClass37_Sub2_8.method3676(this.anIntArray457);
		this.aClass37_Sub2_8.method3696(this.aClass37_Sub2_8.anInt4334, this.aClass37_Sub2_8.anInt4345, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5031();
		@Pc(40) int local40 = this.method5022();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5034(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass37_Sub2_8.method3677(this.anIntArray457[0], this.anIntArray457[1], this.anIntArray457[2], this.anIntArray457[3]);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
	@Override
	public final int method5023() {
		return this.anInt5934;
	}
}
