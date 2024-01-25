import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	protected int anInt7972;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	protected int anInt7973;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	protected int anInt7974;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	protected int anInt7992;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!rea;")
	protected final Class67_Sub3 aClass67_Sub3_6;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public final int anInt7989;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public final int anInt7980;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!rea;II)V")
	public Class9_Sub1(@OriginalArg(0) Class67_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass67_Sub3_6 = arg0;
		this.anInt7989 = arg1;
		this.anInt7980 = arg2;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6727(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7973 + this.anInt7989 + this.anInt7972;
		@Pc(17) int local17 = this.anInt7992 + this.anInt7980 + this.anInt7974;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt7989 || local17 != this.anInt7980) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt7992;
			local67 = local55 * (float) this.anInt7992;
			local73 = local34 * (float) this.anInt7973;
			local79 = local41 * (float) this.anInt7973;
			@Pc(86) float local86 = -local34 * (float) this.anInt7972;
			@Pc(93) float local93 = -local41 * (float) this.anInt7972;
			@Pc(100) float local100 = -local48 * (float) this.anInt7974;
			@Pc(107) float local107 = -local55 * (float) this.anInt7974;
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
		if (local48 < (float) this.aClass67_Sub3_6.anInt9159) {
			local48 = (float) this.aClass67_Sub3_6.anInt9159;
		}
		if (local55 > (float) this.aClass67_Sub3_6.anInt9153) {
			local55 = (float) this.aClass67_Sub3_6.anInt9153;
		}
		if (local61 < (float) this.aClass67_Sub3_6.anInt9142) {
			local61 = (float) this.aClass67_Sub3_6.anInt9142;
		}
		if (local67 > (float) this.aClass67_Sub3_6.anInt9167) {
			local67 = (float) this.aClass67_Sub3_6.anInt9167;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static199.anInt7987 = this.aClass67_Sub3_6.anInt9165;
		Static199.anInt7976 = (int) ((float) ((int) local61 * Static199.anInt7987) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static199.anInt7994 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7989 / local73);
		Static199.anInt7975 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7980 / local79);
		Static199.anInt7981 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7989 / local79);
		Static199.anInt7988 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7980 / local73);
		Static199.anInt7991 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static199.anInt7969 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static199.anInt7984 = (this.anInt7989 >> 1 << 12) + (Static199.anInt7969 * Static199.anInt7981 >> 4);
		Static199.anInt7986 = (this.anInt7980 >> 1 << 12) + (Static199.anInt7969 * Static199.anInt7988 >> 4);
		Static199.anInt7993 = Static199.anInt7991 * Static199.anInt7994 >> 4;
		Static199.anInt7970 = Static199.anInt7991 * Static199.anInt7975 >> 4;
		Static199.anInt7983 = (int) local48;
		Static199.anInt7998 = (int) local55;
		Static199.anInt7996 = (int) local61;
		Static199.anInt7997 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()I")
	@Override
	public final int method8602() {
		return this.anInt7989;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public abstract void method8621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[III)V")
	protected abstract void method6728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
	@Override
	public final int method8611() {
		return this.anInt7980;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8618(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass67_Sub3_6.method7727()) {
			throw new IllegalStateException();
		} else if (this.method6727(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub2 local22 = (Class1_Sub2) arg6;
			this.method6728(local22.anIntArray310, local22.anIntArray311, Static199.anInt7983 - arg7, -arg8 - (Static199.anInt7997 - Static199.anInt7996));
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass67_Sub3_6.method7727()) {
			throw new IllegalStateException();
		} else if (this.method6727(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static199.anInt7971 = arg7;
			if (arg6 != 1) {
				Static199.anInt7990 = arg7 >>> 24;
				Static199.anInt7978 = 256 - Static199.anInt7990;
				if (arg6 == 0) {
					Static199.anInt7985 = arg7 >> 16 & 0xFF;
					Static199.anInt7982 = arg7 >> 8 & 0xFF;
					Static199.anInt7995 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static199.anInt7977 = arg7 >>> 24;
					Static199.anInt7979 = 256 - Static199.anInt7977;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static199.anInt7979 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static199.anInt7979 & 0xFF0000;
					Static199.anInt7968 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6729(1);
			} else if (arg6 == 0) {
				this.method6729(0);
			} else if (arg6 == 3) {
				this.method6729(3);
			} else if (arg6 == 2) {
				this.method6729(2);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass67_Sub3_6.method7727()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray432 == null) {
			this.anIntArray432 = new int[4];
		}
		this.aClass67_Sub3_6.K(this.anIntArray432);
		this.aClass67_Sub3_6.T(this.aClass67_Sub3_6.anInt9159, this.aClass67_Sub3_6.anInt9142, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method8619();
		@Pc(43) int local43 = this.method8613();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method8621(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass67_Sub3_6.KA(this.anIntArray432[0], this.anIntArray432[1], this.anIntArray432[2], this.anIntArray432[3]);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
	@Override
	public final int method8613() {
		return this.anInt7992 + this.anInt7980 + this.anInt7974;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I)V")
	@Override
	public final void method8616(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7973;
		arg0[1] = this.anInt7992;
		arg0[2] = this.anInt7972;
		arg0[3] = this.anInt7974;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7973 = arg0;
		this.anInt7992 = arg1;
		this.anInt7972 = arg2;
		this.anInt7974 = arg3;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
	@Override
	public final int method8619() {
		return this.anInt7973 + this.anInt7989 + this.anInt7972;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	protected abstract void method6729(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
