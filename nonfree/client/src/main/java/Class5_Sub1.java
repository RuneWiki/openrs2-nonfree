import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	protected int anInt3983;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	protected int anInt3989;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	protected int anInt3992;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	protected int anInt4003;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "Lclient!co;")
	protected final Class32_Sub1 aClass32_Sub1_9;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	protected final int anInt3980;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	protected final int anInt3985;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!co;II)V")
	protected Class5_Sub1(@OriginalArg(0) Class32_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass32_Sub1_9 = arg0;
		this.anInt3980 = arg1;
		this.anInt3985 = arg2;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()I")
	@Override
	public final int method3629() {
		return this.anInt3980;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFF)V")
	private void method3639(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt3989 + this.anInt3980 + this.anInt3983;
		@Pc(17) int local17 = this.anInt4003 + this.anInt3985 + this.anInt3992;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt3980 || local17 != this.anInt3985) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4003;
			local65 = local53 * (float) this.anInt4003;
			local71 = local32 * (float) this.anInt3989;
			local77 = local39 * (float) this.anInt3989;
			@Pc(84) float local84 = -local32 * (float) this.anInt3983;
			@Pc(91) float local91 = -local39 * (float) this.anInt3983;
			@Pc(98) float local98 = -local46 * (float) this.anInt3992;
			@Pc(105) float local105 = -local53 * (float) this.anInt3992;
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
		if (local46 < (float) this.aClass32_Sub1_9.anInt1479) {
			local46 = this.aClass32_Sub1_9.anInt1479;
		}
		if (local53 > (float) this.aClass32_Sub1_9.anInt1482) {
			local53 = this.aClass32_Sub1_9.anInt1482;
		}
		if (local59 < (float) this.aClass32_Sub1_9.anInt1483) {
			local59 = this.aClass32_Sub1_9.anInt1483;
		}
		if (local65 > (float) this.aClass32_Sub1_9.anInt1495) {
			local65 = this.aClass32_Sub1_9.anInt1495;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static43.anInt4005 = this.aClass32_Sub1_9.anInt1488;
		Static43.anInt4007 = (int) ((float) ((int) local59 * Static43.anInt4005) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static43.anInt3999 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt3980 / local71);
		Static43.anInt3990 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt3985 / local77);
		Static43.anInt3981 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt3980 / local77);
		Static43.anInt3996 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt3985 / local71);
		Static43.anInt3991 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static43.anInt3984 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static43.anInt4006 = (this.anInt3980 >> 1 << 12) + (Static43.anInt3984 * Static43.anInt3981 >> 4);
		Static43.anInt4001 = (this.anInt3985 >> 1 << 12) + (Static43.anInt3984 * Static43.anInt3996 >> 4);
		Static43.anInt4000 = Static43.anInt3991 * Static43.anInt3999 >> 4;
		Static43.anInt3988 = Static43.anInt3991 * Static43.anInt3990 >> 4;
		Static43.anInt4008 = (int) local46;
		Static43.anInt3993 = (int) local53;
		Static43.anInt4002 = (int) local59;
		Static43.anInt3998 = (int) local65;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([I[III)V")
	protected abstract void method3640(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass32_Sub1_9.method1266()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray367 == null) {
			this.anIntArray367 = new int[4];
		}
		this.aClass32_Sub1_9.method2174(this.anIntArray367);
		this.aClass32_Sub1_9.method2220(this.aClass32_Sub1_9.anInt1479, this.aClass32_Sub1_9.anInt1483, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method3632();
		@Pc(40) int local40 = this.method3630();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method3619(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass32_Sub1_9.method2226(this.anIntArray367[0], this.anIntArray367[1], this.anIntArray367[2], this.anIntArray367[3]);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!em;II)V")
	public abstract void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()I")
	@Override
	public final int method3630() {
		return this.anInt4003 + this.anInt3985 + this.anInt3992;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3989 = arg0;
		this.anInt4003 = arg1;
		this.anInt3983 = arg2;
		this.anInt3992 = arg3;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method3638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass32_Sub1_9.method1266()) {
			throw new IllegalStateException();
		}
		this.method3639(arg0, arg1, arg2, arg3, arg4, arg5);
		Static43.anInt3987 = arg7;
		if (arg6 != 0) {
			Static43.anInt4004 = arg7 >>> 24;
			Static43.anInt3994 = 256 - Static43.anInt4004;
			if (arg6 == 1) {
				Static43.anInt3995 = arg7 >> 16 & 0xFF;
				Static43.anInt3979 = arg7 >> 8 & 0xFF;
				Static43.anInt4009 = arg7 & 0xFF;
			} else {
				Static43.anInt3997 = arg7 >>> 24;
				Static43.anInt3986 = 256 - Static43.anInt3997;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static43.anInt3986 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static43.anInt3986 & 0xFF0000;
				Static43.anInt3982 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method3641(0);
		} else if (arg6 == 1) {
			this.method3641(1);
		} else if (arg6 == 2) {
			this.method3641(2);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
	public abstract void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	protected abstract void method3641(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
	@Override
	public final int method3623() {
		return this.anInt3985;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFLclient!em;II)V")
	@Override
	protected final void method3635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class52 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass32_Sub1_9.method1266()) {
			throw new IllegalStateException();
		}
		this.method3639(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class52_Sub1 local18 = (Class52_Sub1) arg6;
		this.method3640(local18.anIntArray177, local18.anIntArray176, Static43.anInt4008 - arg7, -arg8 - (Static43.anInt3998 - Static43.anInt4002));
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "()I")
	@Override
	public final int method3632() {
		return this.anInt3989 + this.anInt3980 + this.anInt3983;
	}
}
