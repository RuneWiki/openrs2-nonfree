import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class4_Sub2_Sub2_Sub1 extends Class4_Sub2_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "Lclient!it;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "S")
	private final short aShort13;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "Z")
	private final boolean aBoolean48;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub9 aClass2_Sub6_Sub9_1;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Lclient!ka;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIZ)V")
	public Class4_Sub2_Sub2_Sub1(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1892);
		this.aBoolean47 = arg1.anInt1873 != 0 && !arg7;
		this.aShort13 = (short) arg1.anInt1860;
		super.anInt10228 = arg6;
		this.aBoolean45 = arg7;
		this.aByte21 = (byte) arg8;
		super.anInt10229 = arg4;
		this.aBoolean46 = arg9;
		this.aBoolean48 = arg0.method9646() && arg1.aBoolean212 && !this.aBoolean45 && Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean46) {
			local68 |= 0x10000;
		}
		@Pc(83) Class222 local83 = this.method368(local68, this.aBoolean48, arg0);
		if (local83 != null) {
			this.aClass2_Sub6_Sub9_1 = local83.aClass2_Sub6_Sub9_3;
			this.aClass45_1 = local83.aClass45_4;
			if (this.aBoolean46) {
				this.aClass45_1 = this.aClass45_1.method5768((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		this.aBoolean46 = false;
		if (this.aClass45_1 != null) {
			this.aClass45_1.s(this.aClass45_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort13 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			return;
		}
		@Pc(33) Class2_Sub6_Sub9 local33;
		if (this.aClass2_Sub6_Sub9_1 == null && this.aBoolean48) {
			@Pc(25) Class222 local25 = this.method368(262144, true, arg0);
			local33 = local25 == null ? null : local25.aClass2_Sub6_Sub9_3;
		} else {
			local33 = this.aClass2_Sub6_Sub9_1;
			this.aClass2_Sub6_Sub9_1 = null;
		}
		if (local33 != null) {
			Static237.method9873(local33, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		if (this.aClass187_1 == null) {
			this.aClass187_1 = Static250.method3479(super.anInt10228, super.anInt10229, this.method367(arg0, 0), super.anInt10234);
		}
		return this.aClass187_1;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		if (this.aClass45_1 == null) {
			return true;
		} else {
			return !this.aClass45_1.r();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class45 method367(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass45_1 != null && arg0.method9686(this.aClass45_1.ua(), arg1) == 0) {
			return this.aClass45_1;
		} else {
			@Pc(38) Class222 local38 = this.method368(arg1, false, arg0);
			return local38 == null ? null : local38.aClass45_4;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aClass45_1 == null ? false : this.aClass45_1.F();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIZLclient!ha;)Lclient!lha;")
	private Class222 method368(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class145 arg2) {
		@Pc(13) Class81 local13 = Static148.aClass153_3.method3342(this.aShort13 & 0xFFFF);
		@Pc(29) Class133 local29;
		@Pc(40) Class133 local40;
		if (this.aBoolean45) {
			local40 = Static126.aClass133Array1[0];
			local29 = Static685.aClass133Array5[super.aByte134];
		} else {
			local29 = Static126.aClass133Array1[super.aByte134];
			if (super.aByte134 < 3) {
				local40 = Static126.aClass133Array1[super.aByte134 + 1];
			} else {
				local40 = null;
			}
		}
		return local13.method1640(arg0, arg1, this.aByte21, local40, arg2, 22, super.anInt10228, (Class202) null, super.anInt10234, super.anInt10229, local29);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
		if (this.aClass45_1 != null) {
			this.aClass45_1.method5763();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass45_1 == null) {
			return null;
		}
		@Pc(21) Class86 local21 = arg0.method9699();
		local21.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(35) Class4_Sub8 local35 = Static118.method1730(1, this.aBoolean47);
		if (Static591.aBoolean812) {
			this.aClass45_1.method5759(local21, local35.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			this.aClass45_1.method5769(local21, local35.aClass4_Sub6Array1[0], 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		return arg0 == 56 ? 22 : 107;
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		this.aBoolean47 = true;
		return this.aClass45_1 == null ? 0 : this.aClass45_1.ma();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 25054) {
			return;
		}
		@Pc(33) Class2_Sub6_Sub9 local33;
		if (this.aClass2_Sub6_Sub9_1 == null && this.aBoolean48) {
			@Pc(25) Class222 local25 = this.method368(262144, true, arg0);
			local33 = local25 == null ? null : local25.aClass2_Sub6_Sub9_3;
		} else {
			local33 = this.aClass2_Sub6_Sub9_1;
			this.aClass2_Sub6_Sub9_1 = null;
		}
		if (local33 != null) {
			Static628.method8496(local33, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass45_1 == null ? 0 : this.aClass45_1.fa();
		} else {
			return 96;
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class45 local9 = this.method367(arg0, 131072);
		if (arg2 != -11191) {
			this.aClass45_1 = null;
		}
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class86 local22 = arg0.method9699();
			local22.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			return Static591.aBoolean812 ? local9.method5743(arg1, arg3, local22, false, 0, Static96.anInt1733) : local9.method5770(arg1, arg3, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.method8988();
		}
		return this.aBoolean48;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89 && arg0 instanceof Class4_Sub2_Sub2_Sub1) {
			@Pc(10) Class4_Sub2_Sub2_Sub1 local10 = (Class4_Sub2_Sub2_Sub1) arg0;
			if (this.aClass45_1 != null && local10.aClass45_1 != null) {
				this.aClass45_1.method5760(local10.aClass45_1, arg1, arg5, arg3, arg4);
			}
		}
	}
}
