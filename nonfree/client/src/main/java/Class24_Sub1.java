import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public abstract class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	protected int anInt9987;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	protected int anInt9997;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	protected int anInt10001;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	protected int anInt10006;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "[I")
	private int[] anIntArray651;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Lclient!sa;")
	protected final Class5_Sub3 aClass5_Sub3_12;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public final int anInt9995;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public final int anInt10002;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!sa;II)V")
	public Class24_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub3_12 = arg0;
		this.anInt9995 = arg1;
		this.anInt10002 = arg2;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method8572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_Sub3_12.method7571()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray651 == null) {
			this.anIntArray651 = new int[4];
		}
		this.aClass5_Sub3_12.K(this.anIntArray651);
		this.aClass5_Sub3_12.T(this.aClass5_Sub3_12.anInt8782, this.aClass5_Sub3_12.anInt8786, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method8576();
		@Pc(40) int local40 = this.method8573();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method8570(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass5_Sub3_12.KA(this.anIntArray651[0], this.anIntArray651[1], this.anIntArray651[2], this.anIntArray651[3]);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([I[III)V")
	protected abstract void method8581(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
	@Override
	public final int method8558() {
		return this.anInt9995;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
	protected abstract void method8582(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass5_Sub3_12.method7571()) {
			throw new IllegalStateException();
		} else if (this.method8584(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static467.anInt10003 = arg7;
			if (arg6 != 1) {
				Static467.anInt10005 = arg7 >>> 24;
				Static467.anInt10008 = 256 - Static467.anInt10005;
				if (arg6 == 0) {
					Static467.anInt9982 = arg7 >> 16 & 0xFF;
					Static467.anInt9984 = arg7 >> 8 & 0xFF;
					Static467.anInt10000 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static467.anInt9992 = arg7 >>> 24;
					Static467.anInt9988 = 256 - Static467.anInt9992;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static467.anInt9988 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static467.anInt9988 & 0xFF0000;
					Static467.anInt10010 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8582(1);
			} else if (arg6 == 0) {
				this.method8582(0);
			} else if (arg6 == 3) {
				this.method8582(3);
			} else if (arg6 == 2) {
				this.method8582(2);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "()I")
	@Override
	public final int method8573() {
		return this.anInt9987 + this.anInt10002 + this.anInt10006;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass5_Sub3_12.method7571()) {
			throw new IllegalStateException();
		} else if (this.method8584(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method8581(local20.anIntArray345, local20.anIntArray343, Static467.anInt10012 - arg7, -arg8 - (Static467.anInt9989 - Static467.anInt9990));
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method8569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10001 = arg0;
		this.anInt9987 = arg1;
		this.anInt9997 = arg2;
		this.anInt10006 = arg3;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "()I")
	@Override
	public final int method8576() {
		return this.anInt10001 + this.anInt9995 + this.anInt9997;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8584(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt10001 + this.anInt9995 + this.anInt9997;
		@Pc(17) int local17 = this.anInt9987 + this.anInt10002 + this.anInt10006;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9995 || local17 != this.anInt10002) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9987;
			local65 = local53 * (float) this.anInt9987;
			local71 = local32 * (float) this.anInt10001;
			local77 = local39 * (float) this.anInt10001;
			@Pc(84) float local84 = -local32 * (float) this.anInt9997;
			@Pc(91) float local91 = -local39 * (float) this.anInt9997;
			@Pc(98) float local98 = -local46 * (float) this.anInt10006;
			@Pc(105) float local105 = -local53 * (float) this.anInt10006;
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
		if (local46 < (float) this.aClass5_Sub3_12.anInt8782) {
			local46 = this.aClass5_Sub3_12.anInt8782;
		}
		if (local53 > (float) this.aClass5_Sub3_12.anInt8788) {
			local53 = this.aClass5_Sub3_12.anInt8788;
		}
		if (local59 < (float) this.aClass5_Sub3_12.anInt8786) {
			local59 = this.aClass5_Sub3_12.anInt8786;
		}
		if (local65 > (float) this.aClass5_Sub3_12.anInt8769) {
			local65 = this.aClass5_Sub3_12.anInt8769;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static467.anInt9998 = this.aClass5_Sub3_12.anInt8789;
		Static467.anInt9986 = (int) ((float) ((int) local59 * Static467.anInt9998) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static467.anInt9985 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9995 / local71);
		Static467.anInt10011 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt10002 / local77);
		Static467.anInt10004 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9995 / local77);
		Static467.anInt9994 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt10002 / local71);
		Static467.anInt9983 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static467.anInt9999 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static467.anInt9991 = (this.anInt9995 >> 1 << 12) + (Static467.anInt9999 * Static467.anInt10004 >> 4);
		Static467.anInt10007 = (this.anInt10002 >> 1 << 12) + (Static467.anInt9999 * Static467.anInt9994 >> 4);
		Static467.anInt9996 = Static467.anInt9983 * Static467.anInt9985 >> 4;
		Static467.anInt10009 = Static467.anInt9983 * Static467.anInt10011 >> 4;
		Static467.anInt10012 = (int) local46;
		Static467.anInt9993 = (int) local53;
		Static467.anInt9990 = (int) local59;
		Static467.anInt9989 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "()I")
	@Override
	public final int method8578() {
		return this.anInt10002;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
	public abstract void method8570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
