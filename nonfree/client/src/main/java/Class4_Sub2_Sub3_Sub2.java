import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class4_Sub2_Sub3_Sub2 extends Class4_Sub2_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lclient!it;")
	private Class187 aClass187_6;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Z")
	private boolean aBoolean770 = true;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Lclient!rl;")
	public final Class325 aClass325_3;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "Z")
	private final boolean aBoolean769;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIII)V")
	public Class4_Sub2_Sub3_Sub2(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static442.method6396(arg9, arg8));
		this.aClass325_3 = new Class325(arg0, arg1, arg8, arg9, super.aByte133, arg3, this, arg7, arg10);
		this.aBoolean769 = arg1.anInt1873 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass325_3.anInt8783;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			this.aBoolean770 = false;
		}
		@Pc(20) Class45 local20 = this.aClass325_3.method7768(false, 131072, false, arg0);
		if (local20 == null) {
			return false;
		} else {
			@Pc(28) Class86 local28 = arg0.method9699();
			local28.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			return Static591.aBoolean812 ? local20.method5743(arg1, arg3, local28, false, 0, Static96.anInt1733) : local20.method5770(arg1, arg3, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aClass325_3.method7776(22997) : -50;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		if (arg0 != 56) {
			this.method8990((byte) 94);
		}
		return this.aClass325_3.anInt8781;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(14) Class45 local14 = this.aClass325_3.method7768(false, 2048, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		local22.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(36) Class4_Sub8 local36 = Static118.method1730(1, this.aBoolean769);
		@Pc(41) int local41 = super.anInt10229 >> 9;
		@Pc(46) int local46 = super.anInt10228 >> 9;
		this.aClass325_3.method7769(local14, local46, local46, arg0, local22, local41, local41, true);
		if (Static591.aBoolean812) {
			local14.method5759(local22, local36.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local14.method5769(local22, local36.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass325_3.aClass4_Sub7_7 != null) {
			@Pc(100) Class236 local100 = this.aClass325_3.aClass4_Sub7_7.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local100, Static96.anInt1733);
			} else {
				arg0.method9666(local100);
			}
		}
		this.aBoolean770 = local14.F() || this.aClass325_3.aClass4_Sub7_7 != null;
		if (this.aClass187_6 == null) {
			this.aClass187_6 = Static250.method3479(super.anInt10228, super.anInt10229, local14, super.anInt10234);
		} else {
			Static565.method7856(super.anInt10229, this.aClass187_6, super.anInt10234, local14, super.anInt10228);
		}
		return local36;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(12) Class45 local12 = this.aClass325_3.method7768(true, 262144, true, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10229 >> 9;
		@Pc(32) int local32 = super.anInt10228 >> 9;
		@Pc(35) Class86 local35 = arg0.method9699();
		local35.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		this.aClass325_3.method7769(local12, local32, local32, arg0, local35, local27, local27, false);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 != 89) {
			this.method8977(50);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aClass325_3.method7774(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		return arg0 == -73 ? this.aClass325_3.method7775() : true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aClass325_3.anInt8786;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return this.aClass187_6;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		this.aClass325_3.method7764(arg0, arg1 ^ 0x61A0);
		if (arg1 != 25054) {
			this.method7941((Class202) null);
		}
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean770;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return 67;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jr;Z)V")
	public void method7941(@OriginalArg(0) Class202 arg0) {
		this.aClass325_3.method7766(arg0);
	}
}
