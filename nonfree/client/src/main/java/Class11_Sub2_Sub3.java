import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "Lclient!em;")
	private Class64 aClass64_7;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "S")
	private final short aShort106;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
	private final boolean aBoolean575;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Z")
	private final boolean aBoolean574;

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "Lclient!ia;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_6;

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "Lclient!ka;")
	public Class57 aClass57_7;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIZIIZ)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static193.method3456(arg7, arg8));
		this.aBoolean573 = arg9;
		super.anInt7825 = arg3;
		this.aByte105 = (byte) arg7;
		this.aByte103 = (byte) arg2;
		this.aShort106 = (short) arg1.anInt4366;
		this.aByte104 = (byte) arg8;
		this.aBoolean575 = arg1.anInt4358 != 0 && !arg6;
		super.anInt7829 = arg5;
		this.aBoolean574 = arg6;
		this.aBoolean576 = arg0.method2045() && arg1.aBoolean287 && !this.aBoolean574 && Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean573) {
			local71 |= 0x10000;
		}
		@Pc(86) Class236 local86 = this.method6239(this.aBoolean576, arg0, local71);
		if (local86 != null) {
			this.aClass4_Sub1_Sub6_6 = local86.aClass4_Sub1_Sub6_5;
			this.aClass57_7 = local86.aClass57_6;
			if (this.aBoolean573) {
				this.aClass57_7 = this.aClass57_7.method6075((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.method6238(arg1, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		@Pc(25) Class4_Sub1_Sub6 local25;
		if (this.aClass4_Sub1_Sub6_6 == null && this.aBoolean576) {
			@Pc(18) Class236 local18 = this.method6239(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass4_Sub1_Sub6_5;
		} else {
			local25 = this.aClass4_Sub1_Sub6_6;
			this.aClass4_Sub1_Sub6_6 = null;
		}
		if (local25 != null) {
			Static252.method4144(local25, this.aByte103, super.anInt7825, super.anInt7829, null);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(9) Class57 local9 = this.method6238(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class72 local20 = arg2.method2092();
			local20.C(super.anInt7825, super.anInt7824, super.anInt7829);
			return local9.method6070(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		this.aBoolean573 = false;
		if (this.aClass57_7 != null) {
			this.aClass57_7.B(this.aClass57_7.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		if (this.aClass64_7 == null) {
			this.aClass64_7 = Static456.method6200(super.anInt7824, this.method6238(0, arg0), super.anInt7829, super.anInt7825);
		}
		return this.aClass64_7;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aShort106 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aByte104;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aByte105;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILclient!qa;)Lclient!ka;")
	private Class57 method6238(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass57_7 != null && arg1.method2065(this.aClass57_7.ma(), arg0) == 0) {
			return this.aClass57_7;
		} else {
			@Pc(34) Class236 local34 = this.method6239(false, arg1, arg0);
			return local34 == null ? null : local34.aClass57_6;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLclient!qa;BI)Lclient!so;")
	private Class236 method6239(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class139 local18 = Static146.aClass228_1.method5203(this.aShort106 & 0xFFFF);
		@Pc(43) Class14 local43;
		@Pc(34) Class14 local34;
		if (this.aBoolean574) {
			local43 = Static77.aClass14Array1[this.aByte103];
			local34 = Static267.aClass14Array2[0];
		} else {
			if (this.aByte103 < 3) {
				local34 = Static267.aClass14Array2[this.aByte103 + 1];
			} else {
				local34 = null;
			}
			local43 = Static267.aClass14Array2[this.aByte103];
		}
		return local18.method3763(local34, arg1, super.anInt7825, local43, this.aByte105, arg2, super.anInt7824, super.anInt7829, arg0, this.aByte104);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		@Pc(33) Class4_Sub1_Sub6 local33;
		if (this.aClass4_Sub1_Sub6_6 == null && this.aBoolean576) {
			@Pc(26) Class236 local26 = this.method6239(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass4_Sub1_Sub6_5;
		} else {
			local33 = this.aClass4_Sub1_Sub6_6;
			this.aClass4_Sub1_Sub6_6 = null;
		}
		if (local33 != null) {
			Static175.method3073(local33, this.aByte103, super.anInt7825, super.anInt7829, null);
		}
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return this.aBoolean573;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
		if (this.aClass57_7 != null) {
			this.aClass57_7.method6069();
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aBoolean576;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass57_7 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2092();
		local11.C(super.anInt7825, super.anInt7824, super.anInt7829);
		@Pc(21) Class71_Sub3 local21 = null;
		if (this.aBoolean575) {
			local21 = Static127.method2399(1);
		}
		this.aClass57_7.method6073(local11, local21 == null ? null : local21.aClass71_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class11_Sub2_Sub3) {
			@Pc(9) Class11_Sub2_Sub3 local9 = (Class11_Sub2_Sub3) arg4;
			if (this.aClass57_7 != null && local9.aClass57_7 != null) {
				this.aClass57_7.method6080(local9.aClass57_7, arg2, arg0, arg1, arg5);
			}
		} else if (arg4 instanceof Class11_Sub5_Sub1) {
			@Pc(32) Class11_Sub5_Sub1 local32 = (Class11_Sub5_Sub1) arg4;
			if (this.aClass57_7 != null && local32.aClass57_3 != null) {
				this.aClass57_7.method6080(local32.aClass57_3, arg2, arg0, arg1, arg5);
			}
		}
	}
}
