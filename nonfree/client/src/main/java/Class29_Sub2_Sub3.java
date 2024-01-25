import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class29_Sub2_Sub3 extends Class29_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Lclient!vg;")
	private Class330 aClass330_7;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!qt", name = "R", descriptor = "S")
	private final short aShort102;

	@OriginalMember(owner = "client!qt", name = "J", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "Z")
	private final boolean aBoolean520;

	@OriginalMember(owner = "client!qt", name = "C", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!qt", name = "L", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Z")
	private final boolean aBoolean517;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "Z")
	private final boolean aBoolean518;

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "Lclient!w;")
	private Class6_Sub1_Sub12 aClass6_Sub1_Sub12_5;

	@OriginalMember(owner = "client!qt", name = "V", descriptor = "Lclient!ba;")
	public Class22 aClass22_6;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIZIIIIIIZ)V")
	public Class29_Sub2_Sub3(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8457 == 1, Static360.method5338(arg13, arg12));
		this.aByte81 = (byte) arg13;
		this.aShort102 = (short) arg1.anInt8480;
		this.aBoolean519 = arg14;
		this.aBoolean520 = arg1.lb != 0 && !arg7;
		this.aByte82 = (byte) arg3;
		this.aByte83 = (byte) arg12;
		this.aBoolean517 = arg7;
		this.aBoolean518 = arg0.method7126() && arg1.aBoolean582 && !this.aBoolean517 && Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) != 0;
		@Pc(76) int local76 = 2048;
		if (this.aBoolean519) {
			local76 |= 0x10000;
		}
		@Pc(91) Class300 local91 = this.method6249(this.aBoolean518, local76, arg0);
		if (local91 != null) {
			this.aClass6_Sub1_Sub12_5 = local91.aClass6_Sub1_Sub12_6;
			this.aClass22_6 = local91.aClass22_7;
			if (this.aBoolean519) {
				this.aClass22_6 = this.aClass22_6.method4699((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IILclient!oa;)Lclient!ba;")
	private Class22 method6246(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		if (this.aClass22_6 != null && arg1.method7150(this.aClass22_6.h(), arg0) == 0) {
			return this.aClass22_6;
		} else {
			@Pc(31) Class300 local31 = this.method6249(false, arg0, arg1);
			return local31 == null ? null : local31.aClass22_7;
		}
	}

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return this.aClass22_6 == null ? 0 : this.aClass22_6.DA();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		@Pc(30) Class6_Sub1_Sub12 local30;
		if (this.aClass6_Sub1_Sub12_5 == null && this.aBoolean518) {
			@Pc(23) Class300 local23 = this.method6249(true, 262144, arg0);
			local30 = local23 == null ? null : local23.aClass6_Sub1_Sub12_6;
		} else {
			local30 = this.aClass6_Sub1_Sub12_5;
			this.aClass6_Sub1_Sub12_5 = null;
		}
		if (local30 != null) {
			Static287.method7856(local30, this.aByte82, super.anInt9222, super.anInt9218, null);
		}
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		this.aBoolean519 = false;
		if (this.aClass22_6 != null) {
			this.aClass22_6.ia(this.aClass22_6.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(Z)I")
	public int method6247() {
		return this.aClass22_6 == null ? 15 : this.aClass22_6.ZA() / 4;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aByte81;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 instanceof Class29_Sub5_Sub3) {
			@Pc(11) Class29_Sub5_Sub3 local11 = (Class29_Sub5_Sub3) arg0;
			if (this.aClass22_6 != null && local11.aClass22_5 != null) {
				this.aClass22_6.method4693(local11.aClass22_5, arg3, arg1, arg4, arg5);
			}
		} else if (arg0 instanceof Class29_Sub2_Sub3) {
			@Pc(34) Class29_Sub2_Sub3 local34 = (Class29_Sub2_Sub3) arg0;
			if (this.aClass22_6 != null && local34.aClass22_6 != null) {
				this.aClass22_6.method4693(local34.aClass22_6, arg3, arg1, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		if (this.aClass330_7 == null) {
			this.aClass330_7 = Static9.method170(this.method6246(0, arg0), super.anInt9222, super.anInt9223, super.anInt9218);
		}
		return this.aClass330_7;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		@Pc(32) Class6_Sub1_Sub12 local32;
		if (this.aClass6_Sub1_Sub12_5 == null && this.aBoolean518) {
			@Pc(25) Class300 local25 = this.method6249(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass6_Sub1_Sub12_6;
		} else {
			local32 = this.aClass6_Sub1_Sub12_5;
			this.aClass6_Sub1_Sub12_5 = null;
		}
		if (local32 != null) {
			Static128.method1938(local32, this.aByte82, super.anInt9222, super.anInt9218, null);
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
		if (this.aClass22_6 != null) {
			this.aClass22_6.method4706();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIILclient!oa;)Lclient!taa;")
	private Class300 method6249(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(13) Class313 local13 = Static260.aClass100_1.method2008(this.aShort102 & 0xFFFF);
		@Pc(27) Class60 local27;
		@Pc(40) Class60 local40;
		if (this.aBoolean517) {
			local27 = Static127.aClass60Array7[this.aByte82];
			local40 = Static34.aClass60Array10[0];
		} else {
			local27 = Static34.aClass60Array10[this.aByte82];
			if (this.aByte82 < 3) {
				local40 = Static34.aClass60Array10[this.aByte82 + 1];
			} else {
				local40 = null;
			}
		}
		return local13.method6963(local27, this.aByte83 == 11 ? 10 : this.aByte83, super.anInt9222, this.aByte83 == 11 ? this.aByte81 + 4 : this.aByte81, arg2, super.anInt9218, arg0, super.anInt9223, local40, arg1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method6246(arg0, arg1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass22_6 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method7096();
		local11.GA(super.anInt9222, super.anInt9223, super.anInt9218);
		@Pc(26) Class102_Sub2 local26 = null;
		if (this.aBoolean520) {
			local26 = Static228.method3369(1);
		}
		this.aClass22_6.method4689(local11, local26 == null ? null : local26.aClass102_Sub5Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aShort102 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return this.aBoolean519;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(9) Class22 local9 = this.method6246(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class34 local20 = arg2.method7096();
			local20.GA(super.anInt9222, super.anInt9223, super.anInt9218);
			return local9.method4698(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}
}
