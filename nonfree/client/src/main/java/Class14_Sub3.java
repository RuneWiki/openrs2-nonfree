import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public abstract class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	protected int anInt7970;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	protected int anInt7973;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[I")
	private int[] anIntArray507;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
	protected int anInt7984;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
	protected int anInt7991;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!cc;")
	protected final Class45_Sub1 aClass45_Sub1_9;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public final int anInt7975;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public final int anInt7982;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!cc;II)V")
	public Class14_Sub3(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub1_9 = arg0;
		this.anInt7975 = arg1;
		this.anInt7982 = arg2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!ua;II)V")
	public abstract void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected final void method7684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class81 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass45_Sub1_9.method1178()) {
			throw new IllegalStateException();
		} else if (this.method6633(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class81_Sub3 local20 = (Class81_Sub3) arg6;
			this.method6634(local20.anIntArray529, local20.anIntArray530, Static276.anInt7985 - arg7, -arg8 - (Static276.anInt7990 - Static276.anInt7989));
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!kg", name = "ca", descriptor = "()I")
	@Override
	public final int ca() {
		return this.anInt7984 + this.anInt7982 + this.anInt7991;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
	protected abstract void method6632(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "()I")
	@Override
	public final int u() {
		return this.anInt7982;
	}

	@OriginalMember(owner = "client!kg", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass45_Sub1_9.method1178()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray507 == null) {
			this.anIntArray507 = new int[4];
		}
		this.aClass45_Sub1_9.oa(this.anIntArray507);
		this.aClass45_Sub1_9.V(this.aClass45_Sub1_9.anInt1227, this.aClass45_Sub1_9.anInt1228, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.A();
		@Pc(40) int local40 = this.ca();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.V(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass45_Sub1_9.da(this.anIntArray507[0], this.anIntArray507[1], this.anIntArray507[2], this.anIntArray507[3]);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6633(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7970 + this.anInt7975 + this.anInt7973;
		@Pc(17) int local17 = this.anInt7984 + this.anInt7982 + this.anInt7991;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7975 || local17 != this.anInt7982) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7984;
			local65 = local53 * (float) this.anInt7984;
			local71 = local32 * (float) this.anInt7970;
			local77 = local39 * (float) this.anInt7970;
			@Pc(84) float local84 = -local32 * (float) this.anInt7973;
			@Pc(91) float local91 = -local39 * (float) this.anInt7973;
			@Pc(98) float local98 = -local46 * (float) this.anInt7991;
			@Pc(105) float local105 = -local53 * (float) this.anInt7991;
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
		if (local46 < (float) this.aClass45_Sub1_9.anInt1227) {
			local46 = this.aClass45_Sub1_9.anInt1227;
		}
		if (local53 > (float) this.aClass45_Sub1_9.anInt1230) {
			local53 = this.aClass45_Sub1_9.anInt1230;
		}
		if (local59 < (float) this.aClass45_Sub1_9.anInt1228) {
			local59 = this.aClass45_Sub1_9.anInt1228;
		}
		if (local65 > (float) this.aClass45_Sub1_9.anInt1240) {
			local65 = this.aClass45_Sub1_9.anInt1240;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static276.anInt7971 = this.aClass45_Sub1_9.anInt1221;
		Static276.anInt7964 = (int) ((float) ((int) local59 * Static276.anInt7971) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static276.anInt7979 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7975 / local71);
		Static276.anInt7993 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7982 / local77);
		Static276.anInt7967 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7975 / local77);
		Static276.anInt7969 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7982 / local71);
		Static276.anInt7988 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static276.anInt7966 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static276.anInt7983 = (this.anInt7975 >> 1 << 12) + (Static276.anInt7966 * Static276.anInt7967 >> 4);
		Static276.anInt7980 = (this.anInt7982 >> 1 << 12) + (Static276.anInt7966 * Static276.anInt7969 >> 4);
		Static276.anInt7986 = Static276.anInt7988 * Static276.anInt7979 >> 4;
		Static276.anInt7978 = Static276.anInt7988 * Static276.anInt7993 >> 4;
		Static276.anInt7985 = (int) local46;
		Static276.anInt7992 = (int) local53;
		Static276.anInt7989 = (int) local59;
		Static276.anInt7990 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([I[III)V")
	protected abstract void method6634(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!kg", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass45_Sub1_9.method1178()) {
			throw new IllegalStateException();
		} else if (this.method6633(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static276.anInt7977 = arg7;
			if (arg6 != 1) {
				Static276.anInt7968 = arg7 >>> 24;
				Static276.anInt7972 = 256 - Static276.anInt7968;
				if (arg6 == 0) {
					Static276.anInt7965 = arg7 >> 16 & 0xFF;
					Static276.anInt7976 = arg7 >> 8 & 0xFF;
					Static276.anInt7974 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static276.anInt7987 = arg7 >>> 24;
					Static276.anInt7994 = 256 - Static276.anInt7987;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static276.anInt7994 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static276.anInt7994 & 0xFF0000;
					Static276.anInt7981 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6632(1);
			} else if (arg6 == 0) {
				this.method6632(0);
			} else if (arg6 == 3) {
				this.method6632(3);
			} else if (arg6 == 2) {
				this.method6632(2);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "YA", descriptor = "(IIIIIIII)V")
	protected abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "()I")
	@Override
	public final int A() {
		return this.anInt7970 + this.anInt7975 + this.anInt7973;
	}

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7970 = arg0;
		this.anInt7984 = arg1;
		this.anInt7973 = arg2;
		this.anInt7991 = arg3;
	}

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "(IIIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7975;
	}
}
