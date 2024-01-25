import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "Lclient!em;")
	private Class64 aClass64_1;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "Z")
	private final boolean aBoolean13;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!ak", name = "U", descriptor = "Lclient!ia;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_1;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "Lclient!ka;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIZIZ)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt4402, arg1.aBoolean285, arg1.aBoolean289);
		this.aBoolean12 = arg8;
		this.aBoolean13 = arg1.anInt4358 != 0 && !arg6;
		this.aByte3 = (byte) arg2;
		this.aBoolean10 = arg6;
		super.anInt7969 = arg3;
		super.anInt7968 = arg5;
		this.aByte2 = (byte) arg7;
		this.aShort3 = (short) arg1.anInt4366;
		this.aBoolean11 = arg0.method2045() && arg1.aBoolean287 && !this.aBoolean10 && Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean12) {
			local69 |= 0x10000;
		}
		@Pc(84) Class236 local84 = this.method158(arg0, this.aBoolean11, local69);
		if (local84 != null) {
			this.aClass4_Sub1_Sub6_1 = local84.aClass4_Sub1_Sub6_5;
			this.aClass57_1 = local84.aClass57_6;
			if (this.aBoolean12) {
				this.aClass57_1 = this.aClass57_1.method6075((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
		if (this.aClass57_1 != null) {
			this.aClass57_1.method6069();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aShort3 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aByte2;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILclient!qa;I)Lclient!ka;")
	private Class57 method157(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_1 != null && arg0.method2065(this.aClass57_1.ma(), arg1) == 0) {
			return this.aClass57_1;
		} else {
			@Pc(28) Class236 local28 = this.method158(arg0, false, arg1);
			return local28 == null ? null : local28.aClass57_6;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qa;ZIB)Lclient!so;")
	private Class236 method158(@OriginalArg(0) Class30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class139 local21 = Static146.aClass228_1.method5203(this.aShort3 & 0xFFFF);
		@Pc(33) Class14 local33;
		@Pc(28) Class14 local28;
		if (this.aBoolean10) {
			local28 = Static267.aClass14Array2[0];
			local33 = Static77.aClass14Array1[this.aByte3];
		} else {
			if (this.aByte3 >= 3) {
				local28 = null;
			} else {
				local28 = Static267.aClass14Array2[this.aByte3 + 1];
			}
			local33 = Static267.aClass14Array2[this.aByte3];
		}
		return local21.method3763(local28, arg0, super.anInt7969, local33, 22, arg2, super.anInt7971, super.anInt7968, arg1, this.aByte2);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		@Pc(22) Class4_Sub1_Sub6 local22;
		if (this.aClass4_Sub1_Sub6_1 == null && this.aBoolean11) {
			@Pc(33) Class236 local33 = this.method158(arg0, true, 262144);
			local22 = local33 == null ? null : local33.aClass4_Sub1_Sub6_5;
		} else {
			local22 = this.aClass4_Sub1_Sub6_1;
			this.aClass4_Sub1_Sub6_1 = null;
		}
		if (local22 != null) {
			Static175.method3073(local22, this.aByte3, super.anInt7969, super.anInt7968, null);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.method157(arg0, arg1);
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return this.aBoolean12;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return 22;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(15) Class57 local15 = this.method157(arg2, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class72 local20 = arg2.method2092();
			local20.C(super.anInt7969, super.anInt7971, super.anInt7968);
			return local15.method6070(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		@Pc(25) Class4_Sub1_Sub6 local25;
		if (this.aClass4_Sub1_Sub6_1 == null && this.aBoolean11) {
			@Pc(18) Class236 local18 = this.method158(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass4_Sub1_Sub6_5;
		} else {
			local25 = this.aClass4_Sub1_Sub6_1;
			this.aClass4_Sub1_Sub6_1 = null;
		}
		if (local25 != null) {
			Static252.method4144(local25, this.aByte3, super.anInt7969, super.anInt7968, null);
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		if (this.aClass64_1 == null) {
			this.aClass64_1 = Static456.method6200(super.anInt7971, this.method157(arg0, 0), super.anInt7968, super.anInt7969);
		}
		return this.aClass64_1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass57_1 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2092();
		local11.C(super.anInt7969, super.anInt7971, super.anInt7968);
		@Pc(21) Class71_Sub3 local21 = null;
		if (this.aBoolean13) {
			local21 = Static127.method2399(1);
		}
		this.aClass57_1.method6073(local11, local21 == null ? null : local21.aClass71_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aBoolean11;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		this.aBoolean12 = false;
		if (this.aClass57_1 != null) {
			this.aClass57_1.B(this.aClass57_1.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class11_Sub1_Sub1) {
			@Pc(10) Class11_Sub1_Sub1 local10 = (Class11_Sub1_Sub1) arg4;
			if (this.aClass57_1 != null && local10.aClass57_1 != null) {
				this.aClass57_1.method6080(local10.aClass57_1, arg2, arg0, arg1, arg5);
			}
		}
	}
}
