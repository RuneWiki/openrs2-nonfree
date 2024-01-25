import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class25_Sub4_Sub2 extends Class25_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "Z")
	private final boolean aBoolean523;

	@OriginalMember(owner = "client!mn", name = "ab", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!mn", name = "Y", descriptor = "Z")
	private final boolean aBoolean525;

	@OriginalMember(owner = "client!mn", name = "V", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!mn", name = "X", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "Lclient!e;")
	public Class57 aClass57_4;

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "Lclient!i;")
	private Class1_Sub5_Sub10 aClass1_Sub5_Sub10_3;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIZIIZ)V")
	public Class25_Sub4_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static445.method5845(arg7, arg8));
		this.aBoolean523 = arg1.anInt1821 != 0 && !arg6;
		this.aBoolean526 = arg9;
		this.aByte71 = (byte) arg8;
		this.aBoolean525 = arg6;
		super.anInt5875 = arg5;
		this.aByte72 = (byte) arg2;
		this.aShort73 = (short) arg1.anInt1787;
		super.anInt5876 = arg3;
		this.aByte70 = (byte) arg7;
		this.aBoolean524 = arg0.method5758() && arg1.aBoolean205 && !this.aBoolean525 && Static453.aClass136_Sub1_1.method3516(Static14.anInt293) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean526) {
			local71 |= 0x10000;
		}
		@Pc(86) Class247 local86 = this.method3607(this.aBoolean524, local71, arg0);
		if (local86 != null) {
			this.aClass57_4 = local86.aClass57_7;
			this.aClass1_Sub5_Sub10_3 = local86.aClass1_Sub5_Sub10_6;
			if (this.aBoolean526) {
				this.aClass57_4 = this.aClass57_4.method5966((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		@Pc(31) Class1_Sub5_Sub10 local31;
		if (this.aClass1_Sub5_Sub10_3 == null && this.aBoolean524) {
			@Pc(24) Class247 local24 = this.method3607(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub5_Sub10_6;
		} else {
			local31 = this.aClass1_Sub5_Sub10_3;
			this.aClass1_Sub5_Sub10_3 = null;
		}
		if (local31 != null) {
			Static195.method2810(local31, this.aByte72, super.anInt5876, super.anInt5875, null);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aBoolean524;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIILclient!za;)Lclient!uu;")
	private Class247 method3607(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(18) Class68 local18 = Static341.aClass75_4.method1616(this.aShort73 & 0xFFFF);
		@Pc(26) Class157 local26;
		@Pc(39) Class157 local39;
		if (this.aBoolean525) {
			local39 = Static330.aClass157Array2[0];
			local26 = Static343.aClass157Array3[this.aByte72];
		} else {
			local26 = Static330.aClass157Array2[this.aByte72];
			if (this.aByte72 < 3) {
				local39 = Static330.aClass157Array2[this.aByte72 + 1];
			} else {
				local39 = null;
			}
		}
		return local18.method1548(local26, arg1, arg0, this.aByte70, super.anInt5875, local39, super.anInt5872, arg2, super.anInt5876, this.aByte71);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass57_4 == null) {
			return null;
		}
		@Pc(11) Class32 local11 = arg0.method5747();
		local11.U(super.anInt5876, super.anInt5872, super.anInt5875);
		@Pc(26) Class4_Sub7 local26 = null;
		if (this.aBoolean523) {
			local26 = Static142.method2157(1);
		}
		this.aClass57_4.method5953(local11, local26 == null ? null : local26.aClass4_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!za;BI)Lclient!e;")
	private Class57 method3609(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_4 != null && arg0.method5783(this.aClass57_4.RA(), arg1) == 0) {
			return this.aClass57_4;
		} else {
			@Pc(31) Class247 local31 = this.method3607(false, arg1, arg0);
			return local31 == null ? null : local31.aClass57_7;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		if (arg4 instanceof Class25_Sub4_Sub2) {
			@Pc(17) Class25_Sub4_Sub2 local17 = (Class25_Sub4_Sub2) arg4;
			if (this.aClass57_4 != null && local17.aClass57_4 != null) {
				this.aClass57_4.method5956(local17.aClass57_4, arg3, arg1, arg0, arg2);
			}
		} else if (arg4 instanceof Class25_Sub5_Sub2) {
			@Pc(39) Class25_Sub5_Sub2 local39 = (Class25_Sub5_Sub2) arg4;
			if (this.aClass57_4 != null && local39.aClass57_3 != null) {
				this.aClass57_4.method5956(local39.aClass57_3, arg3, arg1, arg0, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.method3609(arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class32 local21 = arg1.method5747();
			local21.U(super.anInt5876, super.anInt5872, super.anInt5875);
			return local16.method5957(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		this.aBoolean526 = false;
		if (this.aClass57_4 != null) {
			this.aClass57_4.D(this.aClass57_4.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
		if (this.aClass57_4 != null) {
			this.aClass57_4.method5963();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		@Pc(20) Class1_Sub5_Sub10 local20;
		if (this.aClass1_Sub5_Sub10_3 == null && this.aBoolean524) {
			@Pc(33) Class247 local33 = this.method3607(true, 262144, arg0);
			local20 = local33 == null ? null : local33.aClass1_Sub5_Sub10_6;
		} else {
			local20 = this.aClass1_Sub5_Sub10_3;
			this.aClass1_Sub5_Sub10_3 = null;
		}
		if (local20 != null) {
			Static343.method4626(local20, this.aByte72, super.anInt5876, super.anInt5875, null);
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.method3609(arg1, arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return this.aBoolean526;
	}
}
