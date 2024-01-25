import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class10_Sub5_Sub2 extends Class10_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "Lclient!dd;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "S")
	private final short aShort81;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Z")
	private final boolean aBoolean399;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "Z")
	private final boolean aBoolean398;

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "Lclient!w;")
	private Class4_Sub7_Sub3 aClass4_Sub7_Sub3_3;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "Lclient!ba;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIZIZ)V")
	public Class10_Sub5_Sub2(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt644, arg1.aBoolean63, arg1.aBoolean51);
		this.aByte67 = (byte) arg7;
		this.aShort81 = (short) arg1.anInt605;
		this.aByte68 = (byte) arg2;
		super.anInt9408 = arg5;
		this.aBoolean399 = arg6;
		this.aBoolean398 = arg1.anInt599 != 0 && !arg6;
		super.anInt9412 = arg3;
		this.aBoolean401 = arg8;
		this.aBoolean400 = arg0.method6789() && arg1.aBoolean57 && !this.aBoolean399 && Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean401) {
			local69 |= 0x10000;
		}
		@Pc(84) Class339 local84 = this.method4468(arg0, local69, this.aBoolean400);
		if (local84 != null) {
			this.aClass4_Sub7_Sub3_3 = local84.aClass4_Sub7_Sub3_5;
			this.aClass9_3 = local84.aClass9_6;
			if (this.aBoolean401) {
				this.aClass9_3 = this.aClass9_3.method4006((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aBoolean400;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.method4469(arg0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class10_Sub5_Sub2) {
			@Pc(5) Class10_Sub5_Sub2 local5 = (Class10_Sub5_Sub2) arg3;
			if (this.aClass9_3 != null && local5.aClass9_3 != null) {
				this.aClass9_3.method4010(local5.aClass9_3, arg0, arg2, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aByte67;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		@Pc(25) Class4_Sub7_Sub3 local25;
		if (this.aClass4_Sub7_Sub3_3 == null && this.aBoolean400) {
			@Pc(18) Class339 local18 = this.method4468(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass4_Sub7_Sub3_5;
		} else {
			local25 = this.aClass4_Sub7_Sub3_3;
			this.aClass4_Sub7_Sub3_3 = null;
		}
		if (local25 != null) {
			Static159.method3156(local25, this.aByte68, super.anInt9412, super.anInt9408, null);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
		if (this.aClass9_3 != null) {
			this.aClass9_3.method4016();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		if (this.aClass68_4 == null) {
			this.aClass68_4 = Static56.method848(super.anInt9409, this.method4469(arg0, 0), super.anInt9412, super.anInt9408);
		}
		return this.aClass68_4;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class9 local9 = this.method4469(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class134 local22 = arg1.method6842();
			local22.GA(super.anInt9412, super.anInt9409, super.anInt9408);
			return local9.method4007(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass9_3 == null) {
			return null;
		}
		@Pc(11) Class134 local11 = arg0.method6842();
		local11.GA(super.anInt9412, super.anInt9409, super.anInt9408);
		@Pc(31) Class26_Sub6 local31 = null;
		if (this.aBoolean398) {
			local31 = Static292.method4579(1);
		}
		this.aClass9_3.method4023(local11, local31 == null ? null : local31.aClass26_Sub5Array1[0], 0);
		return local31;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return this.aBoolean401;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return 22;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aShort81 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		@Pc(20) Class4_Sub7_Sub3 local20;
		if (this.aClass4_Sub7_Sub3_3 == null && this.aBoolean400) {
			@Pc(31) Class339 local31 = this.method4468(arg0, 262144, true);
			local20 = local31 == null ? null : local31.aClass4_Sub7_Sub3_5;
		} else {
			local20 = this.aClass4_Sub7_Sub3_3;
			this.aClass4_Sub7_Sub3_3 = null;
		}
		if (local20 != null) {
			Static55.method846(local20, this.aByte68, super.anInt9412, super.anInt9408, null);
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		this.aBoolean401 = false;
		if (this.aClass9_3 != null) {
			this.aClass9_3.ia(this.aClass9_3.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oa;IZZ)Lclient!un;")
	private Class339 method4468(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class25 local18 = Static553.aClass288_4.method6419(this.aShort81 & 0xFFFF);
		@Pc(26) Class16 local26;
		@Pc(30) Class16 local30;
		if (this.aBoolean399) {
			local26 = Static109.aClass16Array2[this.aByte68];
			local30 = Static45.aClass16Array1[0];
		} else {
			local26 = Static45.aClass16Array1[this.aByte68];
			if (this.aByte68 >= 3) {
				local30 = null;
			} else {
				local30 = Static45.aClass16Array1[this.aByte68 + 1];
			}
		}
		return local18.method564(local30, super.anInt9412, super.anInt9408, arg1, super.anInt9409, arg0, arg2, 22, local26, this.aByte67);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	private Class9 method4469(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass9_3 != null && arg0.method6831(this.aClass9_3.h(), arg1) == 0) {
			return this.aClass9_3;
		} else {
			@Pc(30) Class339 local30 = this.method4468(arg0, arg1, false);
			return local30 == null ? null : local30.aClass9_6;
		}
	}
}
