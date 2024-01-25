import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class4_Sub2_Sub3_Sub1 extends Class4_Sub2_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!nq", name = "ab", descriptor = "Lclient!it;")
	private Class187 aClass187_5;

	@OriginalMember(owner = "client!nq", name = "eb", descriptor = "Z")
	private final boolean aBoolean596;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!nq", name = "jb", descriptor = "Z")
	private final boolean aBoolean599;

	@OriginalMember(owner = "client!nq", name = "bb", descriptor = "Z")
	private boolean aBoolean597;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!nq", name = "gb", descriptor = "B")
	private final byte aByte98;

	@OriginalMember(owner = "client!nq", name = "cb", descriptor = "Z")
	private boolean aBoolean598;

	@OriginalMember(owner = "client!nq", name = "T", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub9 aClass2_Sub6_Sub9_4;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "Lclient!ka;")
	public Class45 aClass45_5;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIIZ)V")
	public Class4_Sub2_Sub3_Sub1(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static149.method2162(arg8, arg9));
		this.aBoolean596 = arg1.anInt1873 != 0 && !arg7;
		this.aByte97 = (byte) arg9;
		super.anInt10228 = arg6;
		this.aBoolean599 = arg7;
		super.anInt10229 = arg4;
		this.aBoolean597 = arg10;
		this.aShort94 = (short) arg1.anInt1860;
		this.aByte98 = (byte) arg8;
		this.aBoolean598 = arg0.method9646() && arg1.aBoolean212 && !this.aBoolean599 && Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean597) {
			local80 |= 0x10000;
		}
		@Pc(95) Class222 local95 = this.method6315(this.aBoolean598, local80, arg0);
		if (local95 != null) {
			this.aClass2_Sub6_Sub9_4 = local95.aClass2_Sub6_Sub9_3;
			this.aClass45_5 = local95.aClass45_4;
			if (this.aBoolean597) {
				this.aClass45_5 = this.aClass45_5.method5768((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
		if (this.aClass45_5 != null) {
			this.aClass45_5.method5763();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.aBoolean598 = true;
		}
		return this.aBoolean598;
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		this.method8987((Class145) null, false);
		return this.aClass45_5 == null ? 0 : this.aClass45_5.ma();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 != 89) {
			return;
		}
		if (arg0 instanceof Class4_Sub2_Sub3_Sub1) {
			@Pc(14) Class4_Sub2_Sub3_Sub1 local14 = (Class4_Sub2_Sub3_Sub1) arg0;
			if (this.aClass45_5 != null && local14.aClass45_5 != null) {
				this.aClass45_5.method5760(local14.aClass45_5, arg1, arg5, arg3, arg4);
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub4) {
			@Pc(39) Class4_Sub2_Sub1_Sub4 local39 = (Class4_Sub2_Sub1_Sub4) arg0;
			if (this.aClass45_5 != null && local39.aClass45_7 != null) {
				this.aClass45_5.method5760(local39.aClass45_7, arg1, arg5, arg3, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass45_5 == null) {
			return null;
		}
		@Pc(18) Class86 local18 = arg0.method9699();
		local18.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(32) Class4_Sub8 local32 = Static118.method1730(1, this.aBoolean596);
		if (Static591.aBoolean812) {
			this.aClass45_5.method5759(local18, local32.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			this.aClass45_5.method5769(local18, local32.aClass4_Sub6Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZILclient!ha;)Lclient!lha;")
	private Class222 method6315(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class145 arg2) {
		@Pc(19) Class81 local19 = Static148.aClass153_3.method3342(this.aShort94 & 0xFFFF);
		@Pc(31) Class133 local31;
		@Pc(26) Class133 local26;
		if (this.aBoolean599) {
			local26 = Static126.aClass133Array1[0];
			local31 = Static685.aClass133Array5[super.aByte134];
		} else {
			local31 = Static126.aClass133Array1[super.aByte134];
			if (super.aByte134 >= 3) {
				local26 = null;
			} else {
				local26 = Static126.aClass133Array1[super.aByte134 + 1];
			}
		}
		return local19.method1640(arg1, arg0, this.aByte97, local26, arg2, this.aByte98, super.anInt10228, (Class202) null, super.anInt10234, super.anInt10229, local31);
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aClass45_5 == null ? false : this.aClass45_5.F();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.aBoolean598 = false;
		}
		@Pc(24) Class2_Sub6_Sub9 local24;
		if (this.aClass2_Sub6_Sub9_4 == null && this.aBoolean598) {
			@Pc(35) Class222 local35 = this.method6315(true, 262144, arg0);
			local24 = local35 == null ? null : local35.aClass2_Sub6_Sub9_3;
		} else {
			local24 = this.aClass2_Sub6_Sub9_4;
			this.aClass2_Sub6_Sub9_4 = null;
		}
		if (local24 != null) {
			Static237.method9873(local24, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		if (this.aClass45_5 == null) {
			return true;
		} else {
			return !this.aClass45_5.r();
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return this.aBoolean597;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aByte97;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		if (arg0 != 56) {
			this.aShort94 = 72;
		}
		return this.aByte98;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		if (this.aClass187_5 == null) {
			this.aClass187_5 = Static250.method3479(super.anInt10228, super.anInt10229, this.method6319(0, arg0), super.anInt10234);
		}
		return this.aClass187_5;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 25054) {
			this.method8990((byte) 127);
		}
		@Pc(25) Class2_Sub6_Sub9 local25;
		if (this.aClass2_Sub6_Sub9_4 == null && this.aBoolean598) {
			@Pc(36) Class222 local36 = this.method6315(true, 262144, arg0);
			local25 = local36 == null ? null : local36.aClass2_Sub6_Sub9_3;
		} else {
			local25 = this.aClass2_Sub6_Sub9_4;
			this.aClass2_Sub6_Sub9_4 = null;
		}
		if (local25 != null) {
			Static628.method8496(local25, super.aByte134, super.anInt10229, super.anInt10228, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			return false;
		}
		@Pc(15) Class45 local15 = this.method6319(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class86 local20 = arg0.method9699();
			local20.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			return Static591.aBoolean812 ? local15.method5743(arg1, arg3, local20, false, 0, Static96.anInt1733) : local15.method5770(arg1, arg3, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aShort94 = -85;
		}
		return this.aClass45_5 == null ? 0 : this.aClass45_5.fa();
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		this.aBoolean597 = false;
		if (this.aClass45_5 != null) {
			this.aClass45_5.s(this.aClass45_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class45 method6319(@OriginalArg(1) int arg0, @OriginalArg(2) Class145 arg1) {
		if (this.aClass45_5 != null && arg1.method9686(this.aClass45_5.ua(), arg0) == 0) {
			return this.aClass45_5;
		} else {
			@Pc(26) Class222 local26 = this.method6315(false, arg0, arg1);
			return local26 == null ? null : local26.aClass45_4;
		}
	}
}
