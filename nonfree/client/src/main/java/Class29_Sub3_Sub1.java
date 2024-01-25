import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class29_Sub3_Sub1 extends Class29_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "Lclient!vg;")
	private Class330 aClass330_1;

	@OriginalMember(owner = "client!eda", name = "D", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!eda", name = "C", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "client!eda", name = "K", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!eda", name = "I", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!eda", name = "z", descriptor = "S")
	private final short aShort54;

	@OriginalMember(owner = "client!eda", name = "E", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Z")
	private final boolean aBoolean130;

	@OriginalMember(owner = "client!eda", name = "H", descriptor = "Lclient!ba;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "Lclient!w;")
	private Class6_Sub1_Sub12 aClass6_Sub1_Sub12_1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIZIZ)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt8495, arg1.aBoolean587, arg1.aBoolean595);
		this.aBoolean132 = arg1.lb != 0 && !arg6;
		super.anInt3347 = arg5;
		this.aBoolean131 = arg8;
		this.aByte39 = (byte) arg2;
		this.aByte38 = (byte) arg7;
		this.aShort54 = (short) arg1.anInt8480;
		this.aBoolean133 = arg6;
		super.anInt3348 = arg3;
		this.aBoolean130 = arg0.method7126() && arg1.aBoolean582 && !this.aBoolean133 && Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean131) {
			local69 |= 0x10000;
		}
		@Pc(84) Class300 local84 = this.method1731(arg0, this.aBoolean130, local69);
		if (local84 != null) {
			this.aClass22_1 = local84.aClass22_7;
			this.aClass6_Sub1_Sub12_1 = local84.aClass6_Sub1_Sub12_6;
			if (this.aBoolean131) {
				this.aClass22_1 = this.aClass22_1.method4699((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean130;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 instanceof Class29_Sub3_Sub1) {
			@Pc(12) Class29_Sub3_Sub1 local12 = (Class29_Sub3_Sub1) arg0;
			if (this.aClass22_1 != null && local12.aClass22_1 != null) {
				this.aClass22_1.method4693(local12.aClass22_1, arg3, arg1, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		if (this.aClass330_1 == null) {
			this.aClass330_1 = Static9.method170(this.method1734(0, arg0), super.anInt3348, super.anInt3346, super.anInt3347);
		}
		return this.aClass330_1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		@Pc(18) Class6_Sub1_Sub12 local18;
		if (this.aClass6_Sub1_Sub12_1 == null && this.aBoolean130) {
			@Pc(29) Class300 local29 = this.method1731(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass6_Sub1_Sub12_6;
		} else {
			local18 = this.aClass6_Sub1_Sub12_1;
			this.aClass6_Sub1_Sub12_1 = null;
		}
		if (local18 != null) {
			Static287.method7856(local18, this.aByte39, super.anInt3348, super.anInt3347, null);
		}
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		this.aBoolean131 = false;
		if (this.aClass22_1 != null) {
			this.aClass22_1.ia(this.aClass22_1.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!oa;ZZI)Lclient!taa;")
	private Class300 method1731(@OriginalArg(0) Class121 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class313 local19 = Static260.aClass100_1.method2008(this.aShort54 & 0xFFFF);
		@Pc(27) Class60 local27;
		@Pc(33) Class60 local33;
		if (this.aBoolean133) {
			local27 = Static127.aClass60Array7[this.aByte39];
			local33 = Static34.aClass60Array10[0];
		} else {
			local27 = Static34.aClass60Array10[this.aByte39];
			if (this.aByte39 >= 3) {
				local33 = null;
			} else {
				local33 = Static34.aClass60Array10[this.aByte39 + 1];
			}
		}
		return local19.method6963(local27, 22, super.anInt3348, this.aByte38, arg0, super.anInt3347, arg1, super.anInt3346, local33, arg2);
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass22_1 == null) {
			return null;
		}
		@Pc(18) Class34 local18 = arg0.method7096();
		local18.GA(super.anInt3348, super.anInt3346, super.anInt3347);
		@Pc(28) Class102_Sub2 local28 = null;
		if (this.aBoolean132) {
			local28 = Static228.method3369(1);
		}
		this.aClass22_1.method4689(local18, local28 == null ? null : local28.aClass102_Sub5Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return this.aBoolean131;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class22 local16 = this.method1734(131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class34 local21 = arg2.method7096();
			local21.GA(super.anInt3348, super.anInt3346, super.anInt3347);
			return local16.method4698(arg0, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return 22;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method1734(arg0, arg1);
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		@Pc(25) Class6_Sub1_Sub12 local25;
		if (this.aClass6_Sub1_Sub12_1 == null && this.aBoolean130) {
			@Pc(18) Class300 local18 = this.method1731(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass6_Sub1_Sub12_6;
		} else {
			local25 = this.aClass6_Sub1_Sub12_1;
			this.aClass6_Sub1_Sub12_1 = null;
		}
		if (local25 != null) {
			Static128.method1938(local25, this.aByte39, super.anInt3348, super.anInt3347, null);
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!oa;Z)Lclient!ba;")
	private Class22 method1734(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		if (this.aClass22_1 != null && arg1.method7150(this.aClass22_1.h(), arg0) == 0) {
			return this.aClass22_1;
		} else {
			@Pc(23) Class300 local23 = this.method1731(arg1, false, arg0);
			return local23 == null ? null : local23.aClass22_7;
		}
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
		if (this.aClass22_1 != null) {
			this.aClass22_1.method4706();
		}
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aShort54 & 0xFFFF;
	}
}
