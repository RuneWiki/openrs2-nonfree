import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public abstract class Class178_Sub1 extends Class178 {

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
	protected int anInt8984;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	protected int anInt8987;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	protected int anInt8988;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	protected int anInt8999;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
	private int[] anIntArray656;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Lclient!wda;")
	protected final Class22_Sub3 aClass22_Sub3_9;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public final int anInt8982;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public final int anInt9001;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!wda;II)V")
	public Class178_Sub1(@OriginalArg(0) Class22_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass22_Sub3_9 = arg0;
		this.anInt8982 = arg1;
		this.anInt9001 = arg2;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "()I")
	@Override
	public final int method7632() {
		return this.anInt8984 + this.anInt9001 + this.anInt8988;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()I")
	@Override
	public final int method7636() {
		return this.anInt8982;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()I")
	@Override
	public final int method7618() {
		return this.anInt9001;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public abstract void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8987 + this.anInt8982 + this.anInt8999;
		@Pc(17) int local17 = this.anInt8984 + this.anInt9001 + this.anInt8988;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt8982 || local17 != this.anInt9001) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt8984;
			local67 = local55 * (float) this.anInt8984;
			local73 = local34 * (float) this.anInt8987;
			local79 = local41 * (float) this.anInt8987;
			@Pc(86) float local86 = -local34 * (float) this.anInt8999;
			@Pc(93) float local93 = -local41 * (float) this.anInt8999;
			@Pc(100) float local100 = -local48 * (float) this.anInt8988;
			@Pc(107) float local107 = -local55 * (float) this.anInt8988;
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
		if (local48 < (float) this.aClass22_Sub3_9.anInt11029) {
			local48 = (float) this.aClass22_Sub3_9.anInt11029;
		}
		if (local55 > (float) this.aClass22_Sub3_9.anInt11024) {
			local55 = (float) this.aClass22_Sub3_9.anInt11024;
		}
		if (local61 < (float) this.aClass22_Sub3_9.anInt11031) {
			local61 = (float) this.aClass22_Sub3_9.anInt11031;
		}
		if (local67 > (float) this.aClass22_Sub3_9.anInt11045) {
			local67 = (float) this.aClass22_Sub3_9.anInt11045;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static277.anInt8983 = this.aClass22_Sub3_9.anInt11043;
		Static277.anInt9011 = (int) ((float) ((int) local61 * Static277.anInt8983) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static277.anInt8996 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8982 / local73);
		Static277.anInt8998 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9001 / local79);
		Static277.anInt8989 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8982 / local79);
		Static277.anInt9007 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9001 / local73);
		Static277.anInt9008 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static277.anInt8993 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static277.anInt8991 = (this.anInt8982 >> 1 << 12) + (Static277.anInt8993 * Static277.anInt8989 >> 4);
		Static277.anInt8990 = (this.anInt9001 >> 1 << 12) + (Static277.anInt8993 * Static277.anInt9007 >> 4);
		Static277.anInt8992 = Static277.anInt9008 * Static277.anInt8996 >> 4;
		Static277.anInt9005 = Static277.anInt9008 * Static277.anInt8998 >> 4;
		Static277.anInt9010 = (int) local48;
		Static277.anInt9000 = (int) local55;
		Static277.anInt8985 = (int) local61;
		Static277.anInt9009 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([I[III)V")
	protected abstract void method7639(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass22_Sub3_9.method9425()) {
			throw new IllegalStateException();
		} else if (this.method7638(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static277.anInt9003 = arg7;
			if (arg6 != 1) {
				Static277.anInt8986 = arg7 >>> 24;
				Static277.anInt9004 = 256 - Static277.anInt8986;
				if (arg6 == 0) {
					Static277.anInt9012 = arg7 >> 16 & 0xFF;
					Static277.anInt8997 = arg7 >> 8 & 0xFF;
					Static277.anInt9002 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static277.anInt9006 = arg7 >>> 24;
					Static277.anInt8995 = 256 - Static277.anInt9006;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static277.anInt8995 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static277.anInt8995 & 0xFF0000;
					Static277.anInt8994 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7640(1);
			} else if (arg6 == 0) {
				this.method7640(0);
			} else if (arg6 == 3) {
				this.method7640(3);
			} else if (arg6 == 2) {
				this.method7640(2);
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	protected abstract void method7640(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7614(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass22_Sub3_9.method9425()) {
			throw new IllegalStateException();
		} else if (this.method7638(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg6;
			this.method7639(local22.anIntArray73, local22.anIntArray74, Static277.anInt9010 - arg7, -arg8 - (Static277.anInt9009 - Static277.anInt8985));
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method7629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass22_Sub3_9.method9425()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray656 == null) {
			this.anIntArray656 = new int[4];
		}
		this.aClass22_Sub3_9.K(this.anIntArray656);
		this.aClass22_Sub3_9.T(this.aClass22_Sub3_9.anInt11029, this.aClass22_Sub3_9.anInt11031, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method7627();
		@Pc(43) int local43 = this.method7632();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method7616(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass22_Sub3_9.KA(this.anIntArray656[0], this.anIntArray656[1], this.anIntArray656[2], this.anIntArray656[3]);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
	@Override
	public final int method7627() {
		return this.anInt8987 + this.anInt8982 + this.anInt8999;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method7642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8987 = arg0;
		this.anInt8984 = arg1;
		this.anInt8999 = arg2;
		this.anInt8988 = arg3;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V")
	@Override
	public final void method7625(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8987;
		arg0[1] = this.anInt8984;
		arg0[2] = this.anInt8999;
		arg0[3] = this.anInt8988;
	}
}
