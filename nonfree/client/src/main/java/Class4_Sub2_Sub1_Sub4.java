import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class4_Sub2_Sub1_Sub4 extends Class4_Sub2_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!tca", name = "wb", descriptor = "Lclient!it;")
	private Class187 aClass187_7;

	@OriginalMember(owner = "client!tca", name = "hb", descriptor = "S")
	private final short aShort125;

	@OriginalMember(owner = "client!tca", name = "Q", descriptor = "Z")
	private final boolean aBoolean806;

	@OriginalMember(owner = "client!tca", name = "tb", descriptor = "Z")
	private final boolean aBoolean807;

	@OriginalMember(owner = "client!tca", name = "T", descriptor = "Z")
	private boolean aBoolean809;

	@OriginalMember(owner = "client!tca", name = "gb", descriptor = "B")
	private final byte aByte129;

	@OriginalMember(owner = "client!tca", name = "sb", descriptor = "B")
	private final byte aByte128;

	@OriginalMember(owner = "client!tca", name = "nb", descriptor = "Z")
	private final boolean aBoolean808;

	@OriginalMember(owner = "client!tca", name = "Y", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub9 aClass2_Sub6_Sub9_6;

	@OriginalMember(owner = "client!tca", name = "N", descriptor = "Lclient!ka;")
	public Class45 aClass45_7;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIIIIIIZ)V")
	public Class4_Sub2_Sub1_Sub4(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1851 == 1, Static497.method7103(arg12, arg13));
		this.aShort125 = (short) arg1.anInt1860;
		super.aByte134 = (byte) arg3;
		this.aBoolean806 = arg1.anInt1873 != 0 && !arg7;
		this.aBoolean807 = arg7;
		this.aBoolean809 = arg14;
		this.aByte129 = (byte) arg13;
		this.aByte128 = (byte) arg12;
		this.aBoolean808 = arg0.method9646() && arg1.aBoolean212 && !this.aBoolean807 && Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() != 0;
		@Pc(85) int local85 = 2048;
		if (this.aBoolean809) {
			local85 |= 0x10000;
		}
		@Pc(100) Class222 local100 = this.method8290(arg0, this.aBoolean808, local85);
		if (local100 != null) {
			this.aClass2_Sub6_Sub9_6 = local100.aClass2_Sub6_Sub9_3;
			this.aClass45_7 = local100.aClass45_4;
			if (this.aBoolean809) {
				this.aClass45_7 = this.aClass45_7.method5768((byte) 0, local85, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			Static605.aBooleanArrayArray10 = null;
		}
		@Pc(23) Class2_Sub6_Sub9 local23;
		if (this.aClass2_Sub6_Sub9_6 == null && this.aBoolean808) {
			@Pc(34) Class222 local34 = this.method8290(arg0, true, 262144);
			local23 = local34 == null ? null : local34.aClass2_Sub6_Sub9_3;
		} else {
			local23 = this.aClass2_Sub6_Sub9_6;
			this.aClass2_Sub6_Sub9_6 = null;
		}
		if (local23 != null) {
			Static237.method9873(local23, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort125 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
		if (this.aClass45_7 != null) {
			this.aClass45_7.method5763();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg0 instanceof Class4_Sub2_Sub3_Sub1) {
			@Pc(34) Class4_Sub2_Sub3_Sub1 local34 = (Class4_Sub2_Sub3_Sub1) arg0;
			if (this.aClass45_7 != null && local34.aClass45_5 != null) {
				this.aClass45_7.method5760(local34.aClass45_5, arg1, arg5, arg3, arg4);
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub4) {
			@Pc(10) Class4_Sub2_Sub1_Sub4 local10 = (Class4_Sub2_Sub1_Sub4) arg0;
			if (this.aClass45_7 != null && local10.aClass45_7 != null) {
				this.aClass45_7.method5760(local10.aClass45_7, arg1, arg5, arg3, arg4);
			}
		}
		if (arg6 != 89) {
			this.method8967((Class4_Sub2) null, 59, (Class145) null, -81, true, 70, (byte) -3);
		}
	}

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aClass45_7 == null ? false : this.aClass45_7.F();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass45_7 == null) {
			return null;
		}
		@Pc(21) Class86 local21 = arg0.method9699();
		local21.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(35) Class4_Sub8 local35 = Static118.method1730(1, this.aBoolean806);
		if (Static591.aBoolean812) {
			this.aClass45_7.method5759(local21, local35.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			this.aClass45_7.method5769(local21, local35.aClass4_Sub6Array1[0], 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "(I)I")
	public int method8288() {
		return this.aClass45_7 == null ? 15 : this.aClass45_7.na() / 4;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.method8978();
		}
		return this.aBoolean808;
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		this.aBoolean809 = false;
		if (this.aClass45_7 != null) {
			this.aClass45_7.s(this.aClass45_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class45 local9 = this.method8291(arg0, (byte) -113, 131072);
		if (arg2 != -11191) {
			return true;
		} else if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class86 local20 = arg0.method9699();
			local20.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			return Static591.aBoolean812 ? local9.method5743(arg1, arg3, local20, false, 0, Static96.anInt1733) : local9.method5770(arg1, arg3, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aByte129;
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return this.aBoolean809;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;ZBI)Lclient!lha;")
	private Class222 method8290(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class81 local13 = Static148.aClass153_3.method3342(this.aShort125 & 0xFFFF);
		@Pc(33) Class133 local33;
		@Pc(28) Class133 local28;
		if (this.aBoolean807) {
			local28 = Static126.aClass133Array1[0];
			local33 = Static685.aClass133Array5[super.aByte134];
		} else {
			local33 = Static126.aClass133Array1[super.aByte134];
			if (super.aByte134 >= 3) {
				local28 = null;
			} else {
				local28 = Static126.aClass133Array1[super.aByte134 + 1];
			}
		}
		return local13.method1640(arg2, arg1, this.aByte128 == 11 ? this.aByte129 + 4 : this.aByte129, local28, arg0, this.aByte128 == 11 ? 10 : this.aByte128, super.anInt10228, (Class202) null, super.anInt10234, super.anInt10229, local33);
	}

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		Static605.anInt9403 = 2;
		return this.aClass45_7 == null ? 0 : this.aClass45_7.ma();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8986();
		}
		return this.aClass45_7 == null ? 0 : this.aClass45_7.fa();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		if (this.aClass187_7 == null) {
			this.aClass187_7 = Static250.method3479(super.anInt10228, super.anInt10229, this.method8291(arg0, (byte) -119, 0), super.anInt10234);
		}
		return this.aClass187_7;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class45 method8291(@OriginalArg(0) Class145 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (arg1 > -99) {
			Static605.aClass225_181 = null;
		}
		if (this.aClass45_7 != null && arg0.method9686(this.aClass45_7.ua(), arg2) == 0) {
			return this.aClass45_7;
		} else {
			@Pc(36) Class222 local36 = this.method8290(arg0, false, arg2);
			return local36 == null ? null : local36.aClass45_4;
		}
	}

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		if (this.aClass45_7 == null) {
			return true;
		} else {
			return !this.aClass45_7.r();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		if (arg0 != 56) {
			Static605.aClass225_181 = null;
		}
		return this.aByte128;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 25054) {
			this.method8291((Class145) null, (byte) -41, -18);
		}
		@Pc(39) Class2_Sub6_Sub9 local39;
		if (this.aClass2_Sub6_Sub9_6 == null && this.aBoolean808) {
			@Pc(31) Class222 local31 = this.method8290(arg0, true, 262144);
			local39 = local31 == null ? null : local31.aClass2_Sub6_Sub9_3;
		} else {
			local39 = this.aClass2_Sub6_Sub9_6;
			this.aClass2_Sub6_Sub9_6 = null;
		}
		if (local39 != null) {
			Static628.method8496(local39, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}
}
