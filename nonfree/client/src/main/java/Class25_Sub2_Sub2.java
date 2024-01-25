import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class25_Sub2_Sub2 extends Class25_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!hv", name = "U", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!hv", name = "W", descriptor = "S")
	private final short aShort35;

	@OriginalMember(owner = "client!hv", name = "L", descriptor = "Z")
	private final boolean aBoolean315;

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!hv", name = "S", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!hv", name = "Y", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!hv", name = "O", descriptor = "Z")
	private final boolean aBoolean316;

	@OriginalMember(owner = "client!hv", name = "M", descriptor = "Lclient!i;")
	private Class1_Sub5_Sub10 aClass1_Sub5_Sub10_1;

	@OriginalMember(owner = "client!hv", name = "B", descriptor = "Lclient!e;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIZIZ)V")
	public Class25_Sub2_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt1813, arg1.aBoolean206, arg1.aBoolean208);
		this.aByte24 = (byte) arg7;
		this.aShort35 = (short) arg1.anInt1787;
		this.aBoolean315 = arg1.anInt1821 != 0 && !arg6;
		super.anInt4822 = arg3;
		super.anInt4823 = arg5;
		this.aByte23 = (byte) arg2;
		this.aBoolean317 = arg8;
		this.aBoolean318 = arg6;
		this.aBoolean316 = arg0.method5758() && arg1.aBoolean205 && !this.aBoolean318 && Static453.aClass136_Sub1_1.method3516(Static14.anInt293) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean317) {
			local69 |= 0x10000;
		}
		@Pc(84) Class247 local84 = this.method2358(arg0, this.aBoolean316, local69);
		if (local84 != null) {
			this.aClass1_Sub5_Sub10_1 = local84.aClass1_Sub5_Sub10_6;
			this.aClass57_2 = local84.aClass57_7;
			if (this.aBoolean317) {
				this.aClass57_2 = this.aClass57_2.method5966((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		@Pc(32) Class1_Sub5_Sub10 local32;
		if (this.aClass1_Sub5_Sub10_1 == null && this.aBoolean316) {
			@Pc(25) Class247 local25 = this.method2358(arg0, true, 262144);
			local32 = local25 == null ? null : local25.aClass1_Sub5_Sub10_6;
		} else {
			local32 = this.aClass1_Sub5_Sub10_1;
			this.aClass1_Sub5_Sub10_1 = null;
		}
		if (local32 != null) {
			Static195.method2810(local32, this.aByte23, super.anInt4822, super.anInt4823, null);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass57_2 == null) {
			return null;
		}
		@Pc(11) Class32 local11 = arg0.method5747();
		local11.U(super.anInt4822, super.anInt4821, super.anInt4823);
		@Pc(21) Class4_Sub7 local21 = null;
		if (this.aBoolean315) {
			local21 = Static142.method2157(1);
		}
		this.aClass57_2.method5953(local11, local21 == null ? null : local21.aClass4_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
		if (this.aClass57_2 != null) {
			this.aClass57_2.method5963();
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return this.aBoolean317;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		if (!(arg4 instanceof Class25_Sub2_Sub2)) {
			return;
		}
		@Pc(17) Class25_Sub2_Sub2 local17 = (Class25_Sub2_Sub2) arg4;
		if (this.aClass57_2 != null && local17.aClass57_2 != null) {
			this.aClass57_2.method5956(local17.aClass57_2, arg3, arg1, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!za;IB)Lclient!e;")
	private Class57 method2357(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass57_2 != null && arg0.method5783(this.aClass57_2.RA(), arg1) == 0) {
			return this.aClass57_2;
		} else {
			@Pc(23) Class247 local23 = this.method2358(arg0, false, arg1);
			return local23 == null ? null : local23.aClass57_7;
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!za;ZI)Lclient!uu;")
	private Class247 method2358(@OriginalArg(1) Class34 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class68 local20 = Static341.aClass75_4.method1616(this.aShort35 & 0xFFFF);
		@Pc(43) Class157 local43;
		@Pc(29) Class157 local29;
		if (this.aBoolean318) {
			local29 = Static330.aClass157Array2[0];
			local43 = Static343.aClass157Array3[this.aByte23];
		} else {
			if (this.aByte23 >= 3) {
				local29 = null;
			} else {
				local29 = Static330.aClass157Array2[this.aByte23 + 1];
			}
			local43 = Static330.aClass157Array2[this.aByte23];
		}
		return local20.method1548(local43, arg2, arg1, 22, super.anInt4823, local29, super.anInt4821, arg0, super.anInt4822, this.aByte24);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		@Pc(24) Class1_Sub5_Sub10 local24;
		if (this.aClass1_Sub5_Sub10_1 == null && this.aBoolean316) {
			@Pc(35) Class247 local35 = this.method2358(arg0, true, 262144);
			local24 = local35 == null ? null : local35.aClass1_Sub5_Sub10_6;
		} else {
			local24 = this.aClass1_Sub5_Sub10_1;
			this.aClass1_Sub5_Sub10_1 = null;
		}
		if (local24 != null) {
			Static343.method4626(local24, this.aByte23, super.anInt4822, super.anInt4823, null);
		}
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		this.aBoolean317 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.D(this.aClass57_2.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aBoolean316;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return 22;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class57 local15 = this.method2357(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class32 local20 = arg1.method5747();
			local20.U(super.anInt4822, super.anInt4821, super.anInt4823);
			return local15.method5957(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.method2357(arg1, arg0);
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aShort35 & 0xFFFF;
	}
}
