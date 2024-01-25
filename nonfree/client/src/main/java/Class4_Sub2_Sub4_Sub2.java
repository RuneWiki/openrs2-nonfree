import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub2_Sub4_Sub2 extends Class4_Sub2_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "Lclient!it;")
	private Class187 aClass187_3;

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "Z")
	private final boolean aBoolean365;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "Z")
	private final boolean aBoolean367;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!ka;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub9 aClass2_Sub6_Sub9_2;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIIII)V")
	public Class4_Sub2_Sub4_Sub2(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort60 = (short) arg1.anInt1860;
		this.aBoolean365 = arg1.anInt1873 != 0 && !arg7;
		this.aByte75 = (byte) arg10;
		this.aByte74 = (byte) arg11;
		super.anInt10229 = arg4;
		super.anInt10228 = arg6;
		this.aBoolean367 = arg7;
		this.aBoolean366 = arg0.method9646() && arg1.aBoolean212 && !this.aBoolean367 && Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() != 0;
		@Pc(81) Class222 local81 = this.method3742(2048, arg0, this.aBoolean366);
		if (local81 != null) {
			this.aClass45_2 = local81.aClass45_4;
			this.aClass2_Sub6_Sub9_2 = local81.aClass2_Sub6_Sub9_3;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class45 method3741(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass45_2 != null && arg0.method9686(this.aClass45_2.ua(), arg1) == 0) {
			return this.aClass45_2;
		} else {
			@Pc(33) Class222 local33 = this.method3742(arg1, arg0, false);
			return local33 == null ? null : local33.aClass45_4;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		@Pc(28) Class2_Sub6_Sub9 local28;
		if (this.aClass2_Sub6_Sub9_2 == null && this.aBoolean366) {
			@Pc(20) Class222 local20 = this.method3742(262144, arg0, true);
			local28 = local20 == null ? null : local20.aClass2_Sub6_Sub9_3;
		} else {
			local28 = this.aClass2_Sub6_Sub9_2;
			this.aClass2_Sub6_Sub9_2 = null;
		}
		if (arg1 == 25054 && local28 != null) {
			Static628.method8496(local28, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!lha;")
	private Class222 method3742(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(27) Class81 local27 = Static148.aClass153_3.method3342(this.aShort60 & 0xFFFF);
		@Pc(35) Class133 local35;
		@Pc(43) Class133 local43;
		if (this.aBoolean367) {
			local35 = Static685.aClass133Array5[super.aByte134];
			local43 = Static126.aClass133Array1[0];
		} else {
			local35 = Static126.aClass133Array1[super.aByte134];
			if (super.aByte134 >= 3) {
				local43 = null;
			} else {
				local43 = Static126.aClass133Array1[super.aByte134 + 1];
			}
		}
		return local27.method1640(arg0, arg2, this.aByte74, local43, arg1, this.aByte75, super.anInt10228, (Class202) null, super.anInt10234, super.anInt10229, local35);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		if (this.aClass45_2 == null) {
			return true;
		} else {
			return !this.aClass45_2.r();
		}
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return -108;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(16) Class2_Sub6_Sub9 local16;
		if (this.aClass2_Sub6_Sub9_2 == null && this.aBoolean366) {
			@Pc(27) Class222 local27 = this.method3742(262144, arg0, true);
			local16 = local27 == null ? null : local27.aClass2_Sub6_Sub9_3;
		} else {
			local16 = this.aClass2_Sub6_Sub9_2;
			this.aClass2_Sub6_Sub9_2 = null;
		}
		if (local16 != null) {
			Static237.method9873(local16, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
		if (!arg1) {
			this.aClass187_3 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aClass45_2 == null ? false : this.aClass45_2.F();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
		if (this.aClass45_2 != null) {
			this.aClass45_2.method5763();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aByte74;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			return false;
		}
		@Pc(15) Class45 local15 = this.method3741(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class86 local20 = arg0.method9699();
			local20.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			return Static591.aBoolean812 ? local15.method5743(arg1, arg3, local20, false, 0, Static96.anInt1733) : local15.method5770(arg1, arg3, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		if (this.aClass187_3 == null) {
			this.aClass187_3 = Static250.method3479(super.anInt10228, super.anInt10229, this.method3741(arg0, 0), super.anInt10234);
		}
		return this.aClass187_3;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		return arg0 == 56 ? this.aByte75 : 89;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass45_2 == null) {
			return null;
		}
		@Pc(12) Class86 local12 = arg0.method9699();
		local12.method7026(super.anInt10229 + super.aShort58, super.anInt10234, super.aShort59 + super.anInt10228);
		@Pc(41) Class4_Sub8 local41 = Static118.method1730(1, this.aBoolean365);
		if (Static591.aBoolean812) {
			this.aClass45_2.method5759(local12, local41.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			this.aClass45_2.method5769(local12, local41.aClass4_Sub6Array1[0], 0);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8987((Class145) null, false);
		}
		return this.aClass45_2 == null ? 0 : this.aClass45_2.fa();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.aClass45_2 = null;
		}
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
	}
}
