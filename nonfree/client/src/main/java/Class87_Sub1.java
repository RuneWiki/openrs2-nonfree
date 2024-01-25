import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public abstract class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
	protected int anInt8012;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	protected int anInt8015;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
	protected int anInt8017;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	protected int anInt8020;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
	private int[] anIntArray550;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!lg;")
	protected final Class66_Sub1 aClass66_Sub1_10;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
	protected final int anInt8022;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
	protected final int anInt8035;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!lg;II)V")
	protected Class87_Sub1(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub1_10 = arg0;
		this.anInt8022 = arg1;
		this.anInt8035 = arg2;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!fs;II)V")
	public abstract void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([I[III)V")
	protected abstract void method6574(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "()I")
	@Override
	public final int method6554() {
		return this.anInt8035;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "()I")
	@Override
	public final int method6565() {
		return this.anInt8012 + this.anInt8022 + this.anInt8015;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method6553(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass66_Sub1_10.method3519()) {
			throw new IllegalStateException();
		}
		this.method6575(arg0, arg1, arg2, arg3, arg4, arg5);
		Static424.anInt8034 = arg7;
		if (arg6 != 1) {
			Static424.anInt8032 = arg7 >>> 24;
			Static424.anInt8031 = 256 - Static424.anInt8032;
			if (arg6 == 0) {
				Static424.anInt8030 = arg7 >> 16 & 0xFF;
				Static424.anInt8013 = arg7 >> 8 & 0xFF;
				Static424.anInt8021 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static424.anInt8019 = arg7 >>> 24;
				Static424.anInt8023 = 256 - Static424.anInt8019;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static424.anInt8023 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static424.anInt8023 & 0xFF0000;
				Static424.anInt8027 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method6576(1);
		} else if (arg6 == 0) {
			this.method6576(0);
		} else if (arg6 == 3) {
			this.method6576(3);
		} else if (arg6 == 2) {
			this.method6576(2);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFFLclient!fs;II)V")
	@Override
	protected final void method6558(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass66_Sub1_10.method3519()) {
			throw new IllegalStateException();
		}
		this.method6575(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class22_Sub2 local18 = (Class22_Sub2) arg6;
		this.method6574(local18.anIntArray213, local18.anIntArray214, Static424.anInt8024 - arg7, -arg8 - (Static424.anInt8025 - Static424.anInt8014));
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public abstract void method6560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8012 = arg0;
		this.anInt8017 = arg1;
		this.anInt8015 = arg2;
		this.anInt8020 = arg3;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass66_Sub1_10.method3519()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray550 == null) {
			this.anIntArray550 = new int[4];
		}
		this.aClass66_Sub1_10.method5019(this.anIntArray550);
		this.aClass66_Sub1_10.method5023(this.aClass66_Sub1_10.anInt4147, this.aClass66_Sub1_10.anInt4155, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6565();
		@Pc(40) int local40 = this.method6561();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6560(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass66_Sub1_10.method5044(this.anIntArray550[0], this.anIntArray550[1], this.anIntArray550[2], this.anIntArray550[3]);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "()I")
	@Override
	public final int method6555() {
		return this.anInt8022;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "()I")
	@Override
	public final int method6561() {
		return this.anInt8017 + this.anInt8035 + this.anInt8020;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FFFFFF)V")
	private void method6575(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8012 + this.anInt8022 + this.anInt8015;
		@Pc(17) int local17 = this.anInt8017 + this.anInt8035 + this.anInt8020;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8022 || local17 != this.anInt8035) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8017;
			local65 = local53 * (float) this.anInt8017;
			local71 = local32 * (float) this.anInt8012;
			local77 = local39 * (float) this.anInt8012;
			@Pc(84) float local84 = -local32 * (float) this.anInt8015;
			@Pc(91) float local91 = -local39 * (float) this.anInt8015;
			@Pc(98) float local98 = -local46 * (float) this.anInt8020;
			@Pc(105) float local105 = -local53 * (float) this.anInt8020;
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
		if (local46 < (float) this.aClass66_Sub1_10.anInt4147) {
			local46 = this.aClass66_Sub1_10.anInt4147;
		}
		if (local53 > (float) this.aClass66_Sub1_10.anInt4157) {
			local53 = this.aClass66_Sub1_10.anInt4157;
		}
		if (local59 < (float) this.aClass66_Sub1_10.anInt4155) {
			local59 = this.aClass66_Sub1_10.anInt4155;
		}
		if (local65 > (float) this.aClass66_Sub1_10.anInt4138) {
			local65 = this.aClass66_Sub1_10.anInt4138;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static424.anInt8036 = this.aClass66_Sub1_10.anInt4142;
		Static424.anInt8026 = (int) ((float) ((int) local59 * Static424.anInt8036) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static424.anInt8040 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8022 / local71);
		Static424.anInt8038 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8035 / local77);
		Static424.anInt8037 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8022 / local77);
		Static424.anInt8029 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8035 / local71);
		Static424.anInt8039 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static424.anInt8018 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static424.anInt8028 = (this.anInt8022 >> 1 << 12) + (Static424.anInt8018 * Static424.anInt8037 >> 4);
		Static424.anInt8033 = (this.anInt8035 >> 1 << 12) + (Static424.anInt8018 * Static424.anInt8029 >> 4);
		Static424.anInt8041 = Static424.anInt8039 * Static424.anInt8040 >> 4;
		Static424.anInt8016 = Static424.anInt8039 * Static424.anInt8038 >> 4;
		Static424.anInt8024 = (int) local46;
		Static424.anInt8042 = (int) local53;
		Static424.anInt8014 = (int) local59;
		Static424.anInt8025 = (int) local65;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)V")
	protected abstract void method6576(@OriginalArg(0) int arg0);
}
