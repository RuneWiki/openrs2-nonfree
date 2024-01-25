import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public abstract class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	protected int anInt9950;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	protected int anInt9951;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
	private int[] anIntArray549;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	protected int anInt9954;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	protected int anInt9967;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!cba;")
	protected final Class57_Sub1 aClass57_Sub1_10;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public final int anInt9966;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public final int anInt9955;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!cba;II)V")
	public Class134_Sub1(@OriginalArg(0) Class57_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass57_Sub1_10 = arg0;
		this.anInt9966 = arg1;
		this.anInt9955 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method9218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()I")
	@Override
	public final int method9232() {
		return this.anInt9950 + this.anInt9955 + this.anInt9967;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method9222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass57_Sub1_10.method1067()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray549 == null) {
			this.anIntArray549 = new int[4];
		}
		this.aClass57_Sub1_10.K(this.anIntArray549);
		this.aClass57_Sub1_10.T(this.aClass57_Sub1_10.anInt1052, this.aClass57_Sub1_10.anInt1033, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method9231();
		@Pc(43) int local43 = this.method9232();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method9230(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass57_Sub1_10.KA(this.anIntArray549[0], this.anIntArray549[1], this.anIntArray549[2], this.anIntArray549[3]);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
	@Override
	public final int method9219() {
		return this.anInt9955;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([I)V")
	@Override
	public final void method9223(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9951;
		arg0[1] = this.anInt9950;
		arg0[2] = this.anInt9954;
		arg0[3] = this.anInt9967;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
	@Override
	public final int method9236() {
		return this.anInt9966;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method9229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9951 = arg0;
		this.anInt9950 = arg1;
		this.anInt9954 = arg2;
		this.anInt9967 = arg3;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([I[III)V")
	protected abstract void method8580(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method9233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass57_Sub1_10.method1067()) {
			throw new IllegalStateException();
		} else if (this.method8582(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg6;
			this.method8580(local22.anIntArray97, local22.anIntArray95, Static627.anInt9968 - arg7, -arg8 - (Static627.anInt9959 - Static627.anInt9971));
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
	protected abstract void method8581(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	public final int method9231() {
		return this.anInt9951 + this.anInt9966 + this.anInt9954;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8582(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9951 + this.anInt9966 + this.anInt9954;
		@Pc(17) int local17 = this.anInt9950 + this.anInt9955 + this.anInt9967;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt9966 || local17 != this.anInt9955) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt9950;
			local67 = local55 * (float) this.anInt9950;
			local73 = local34 * (float) this.anInt9951;
			local79 = local41 * (float) this.anInt9951;
			@Pc(86) float local86 = -local34 * (float) this.anInt9954;
			@Pc(93) float local93 = -local41 * (float) this.anInt9954;
			@Pc(100) float local100 = -local48 * (float) this.anInt9967;
			@Pc(107) float local107 = -local55 * (float) this.anInt9967;
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
		if (local48 < (float) this.aClass57_Sub1_10.anInt1052) {
			local48 = (float) this.aClass57_Sub1_10.anInt1052;
		}
		if (local55 > (float) this.aClass57_Sub1_10.anInt1037) {
			local55 = (float) this.aClass57_Sub1_10.anInt1037;
		}
		if (local61 < (float) this.aClass57_Sub1_10.anInt1033) {
			local61 = (float) this.aClass57_Sub1_10.anInt1033;
		}
		if (local67 > (float) this.aClass57_Sub1_10.anInt1044) {
			local67 = (float) this.aClass57_Sub1_10.anInt1044;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static627.anInt9962 = this.aClass57_Sub1_10.anInt1042;
		Static627.anInt9963 = (int) ((float) ((int) local61 * Static627.anInt9962) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static627.anInt9953 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9966 / local73);
		Static627.anInt9952 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9955 / local79);
		Static627.anInt9965 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9966 / local79);
		Static627.anInt9970 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9955 / local73);
		Static627.anInt9973 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static627.anInt9964 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static627.anInt9958 = (this.anInt9966 >> 1 << 12) + (Static627.anInt9964 * Static627.anInt9965 >> 4);
		Static627.anInt9957 = (this.anInt9955 >> 1 << 12) + (Static627.anInt9964 * Static627.anInt9970 >> 4);
		Static627.anInt9975 = Static627.anInt9973 * Static627.anInt9953 >> 4;
		Static627.anInt9961 = Static627.anInt9973 * Static627.anInt9952 >> 4;
		Static627.anInt9968 = (int) local48;
		Static627.anInt9960 = (int) local55;
		Static627.anInt9971 = (int) local61;
		Static627.anInt9959 = (int) local67;
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	public abstract void method9230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method9220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method9224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass57_Sub1_10.method1067()) {
			throw new IllegalStateException();
		} else if (this.method8582(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static627.anInt9974 = arg7;
			if (arg6 != 1) {
				Static627.anInt9976 = arg7 >>> 24;
				Static627.anInt9947 = 256 - Static627.anInt9976;
				if (arg6 == 0) {
					Static627.anInt9977 = arg7 >> 16 & 0xFF;
					Static627.anInt9949 = arg7 >> 8 & 0xFF;
					Static627.anInt9956 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static627.anInt9969 = arg7 >>> 24;
					Static627.anInt9972 = 256 - Static627.anInt9969;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static627.anInt9972 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static627.anInt9972 & 0xFF0000;
					Static627.anInt9948 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8581(1);
			} else if (arg6 == 0) {
				this.method8581(0);
			} else if (arg6 == 3) {
				this.method8581(3);
			} else if (arg6 == 2) {
				this.method8581(2);
			}
		}
	}
}
