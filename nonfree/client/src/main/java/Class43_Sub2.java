import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	protected int anInt10986;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	private int[] anIntArray758;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	protected int anInt10992;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	protected int anInt10995;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	protected int anInt11009;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!lq;")
	protected final Class145_Sub2 aClass145_Sub2_12;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public final int anInt10988;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public final int anInt10991;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!lq;II)V")
	public Class43_Sub2(@OriginalArg(0) Class145_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass145_Sub2_12 = arg0;
		this.anInt10988 = arg1;
		this.anInt10991 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()I")
	@Override
	public final int method9587() {
		return this.anInt10986 + this.anInt10988 + this.anInt10995;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method9606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass145_Sub2_12.method5427()) {
			throw new IllegalStateException();
		} else if (this.method9610(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub3 local22 = (Class1_Sub3) arg6;
			this.method9612(local22.anIntArray669, local22.anIntArray670, Static573.anInt11011 - arg7, -arg8 - (Static573.anInt10987 - Static573.anInt10998));
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	@Override
	public final int method9601() {
		return this.anInt10988;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	protected abstract void method9608(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method9609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method9610(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt10986 + this.anInt10988 + this.anInt10995;
		@Pc(17) int local17 = this.anInt10992 + this.anInt10991 + this.anInt11009;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt10988 || local17 != this.anInt10991) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt10992;
			local67 = local55 * (float) this.anInt10992;
			local73 = local34 * (float) this.anInt10986;
			local79 = local41 * (float) this.anInt10986;
			@Pc(86) float local86 = -local34 * (float) this.anInt10995;
			@Pc(93) float local93 = -local41 * (float) this.anInt10995;
			@Pc(100) float local100 = -local48 * (float) this.anInt11009;
			@Pc(107) float local107 = -local55 * (float) this.anInt11009;
			arg0 += local73 + local61;
			arg1 += local79 + local67;
			arg2 += local86 + local61;
			arg3 += local93 + local67;
			arg4 += local73 + local100;
			arg5 += local79 + local107;
		}
		local34 = arg4 + arg2 - arg0;
		local41 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local48 = arg0;
			local55 = arg2;
		} else {
			local48 = arg2;
			local55 = arg0;
		}
		if (arg4 < local48) {
			local48 = arg4;
		}
		if (local34 < local48) {
			local48 = local34;
		}
		if (arg4 > local55) {
			local55 = arg4;
		}
		if (local34 > local55) {
			local55 = local34;
		}
		if (arg1 < arg3) {
			local61 = arg1;
			local67 = arg3;
		} else {
			local61 = arg3;
			local67 = arg1;
		}
		if (arg5 < local61) {
			local61 = arg5;
		}
		if (local41 < local61) {
			local61 = local41;
		}
		if (arg5 > local67) {
			local67 = arg5;
		}
		if (local41 > local67) {
			local67 = local41;
		}
		if (local48 < (float) this.aClass145_Sub2_12.anInt5997) {
			local48 = (float) this.aClass145_Sub2_12.anInt5997;
		}
		if (local55 > (float) this.aClass145_Sub2_12.anInt6002) {
			local55 = (float) this.aClass145_Sub2_12.anInt6002;
		}
		if (local61 < (float) this.aClass145_Sub2_12.anInt6011) {
			local61 = (float) this.aClass145_Sub2_12.anInt6011;
		}
		if (local67 > (float) this.aClass145_Sub2_12.anInt5993) {
			local67 = (float) this.aClass145_Sub2_12.anInt5993;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static573.anInt11004 = this.aClass145_Sub2_12.lb;
		Static573.anInt11008 = (int) ((float) ((int) local61 * Static573.anInt11004) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static573.anInt11010 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt10988 / local73);
		Static573.anInt10993 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt10991 / local79);
		Static573.anInt11000 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt10988 / local79);
		Static573.anInt10996 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt10991 / local73);
		Static573.anInt10989 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static573.anInt10982 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static573.anInt11003 = (this.anInt10988 >> 1 << 12) + (Static573.anInt10982 * Static573.anInt11000 >> 4);
		Static573.anInt10985 = (this.anInt10991 >> 1 << 12) + (Static573.anInt10982 * Static573.anInt10996 >> 4);
		Static573.anInt11007 = Static573.anInt10989 * Static573.anInt11010 >> 4;
		Static573.anInt11006 = Static573.anInt10989 * Static573.anInt10993 >> 4;
		Static573.anInt11011 = (int) local48;
		Static573.anInt10994 = (int) local55;
		Static573.anInt10998 = (int) local61;
		Static573.anInt10987 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method9611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public abstract void method9583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()I")
	@Override
	public final int method9600() {
		return this.anInt10992 + this.anInt10991 + this.anInt11009;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
	@Override
	public final int method9592() {
		return this.anInt10991;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method9603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass145_Sub2_12.method5427()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray758 == null) {
			this.anIntArray758 = new int[4];
		}
		this.aClass145_Sub2_12.K(this.anIntArray758);
		this.aClass145_Sub2_12.T(this.aClass145_Sub2_12.anInt5997, this.aClass145_Sub2_12.anInt6011, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method9587();
		@Pc(43) int local43 = this.method9600();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method9583(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass145_Sub2_12.KA(this.anIntArray758[0], this.anIntArray758[1], this.anIntArray758[2], this.anIntArray758[3]);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([I)V")
	@Override
	public final void method9599(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10986;
		arg0[1] = this.anInt10992;
		arg0[2] = this.anInt10995;
		arg0[3] = this.anInt11009;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method9586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10986 = arg0;
		this.anInt10992 = arg1;
		this.anInt10995 = arg2;
		this.anInt11009 = arg3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method9585(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass145_Sub2_12.method5427()) {
			throw new IllegalStateException();
		} else if (this.method9610(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static573.anInt11001 = arg7;
			if (arg6 != 1) {
				Static573.anInt11002 = arg7 >>> 24;
				Static573.anInt10997 = 256 - Static573.anInt11002;
				if (arg6 == 0) {
					Static573.anInt10984 = arg7 >> 16 & 0xFF;
					Static573.anInt10983 = arg7 >> 8 & 0xFF;
					Static573.anInt11005 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static573.anInt10981 = arg7 >>> 24;
					Static573.anInt10990 = 256 - Static573.anInt10981;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static573.anInt10990 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static573.anInt10990 & 0xFF0000;
					Static573.anInt10999 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method9608(1);
			} else if (arg6 == 0) {
				this.method9608(0);
			} else if (arg6 == 3) {
				this.method9608(3);
			} else if (arg6 == 2) {
				this.method9608(2);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([I[III)V")
	protected abstract void method9612(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
