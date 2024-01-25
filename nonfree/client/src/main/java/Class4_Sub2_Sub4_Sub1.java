import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class4_Sub2_Sub4_Sub1 extends Class4_Sub2_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!fga", name = "I", descriptor = "Lclient!it;")
	private Class187 aClass187_2;

	@OriginalMember(owner = "client!fga", name = "J", descriptor = "Z")
	private boolean aBoolean295 = true;

	@OriginalMember(owner = "client!fga", name = "G", descriptor = "Lclient!rl;")
	public Class325 aClass325_1;

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIIIII)V")
	public Class4_Sub2_Sub4_Sub1(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass325_1 = new Class325(arg0, arg1, arg10, arg11, super.aByte133, arg3, this, arg7, arg12);
		this.aBoolean294 = arg1.anInt1873 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			Static172.anIntArray223 = null;
		}
		return this.aClass325_1.method7775();
	}

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return -3;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(12) Class45 local12 = this.aClass325_1.method7768(false, 262144, true, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10229 >> 9;
		@Pc(24) int local24 = super.anInt10228 >> 9;
		@Pc(27) Class86 local27 = arg0.method9699();
		local27.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		this.aClass325_1.method7769(local12, local24, local24, arg0, local27, local19, local19, false);
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass325_1.method7774(arg0);
		if (!arg1) {
			this.aClass187_2 = null;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		this.aClass325_1.method7764(arg0, 111);
		if (arg1 != 25054) {
			this.aClass325_1 = null;
		}
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8991((byte) 114);
		}
		return this.aClass325_1.method7776(22997);
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		if (arg0 != 56) {
			Static172.aClass175_2 = null;
		}
		return this.aClass325_1.anInt8781;
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return this.aClass187_2;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method2599(@OriginalArg(0) Class202 arg0) {
		this.aClass325_1.method7766(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class45 local12 = this.aClass325_1.method7768(false, 131072, false, arg0);
		if (local12 == null) {
			return false;
		} else if (arg2 == -11191) {
			@Pc(26) Class86 local26 = arg0.method9699();
			local26.method7026(super.aShort58 + super.anInt10229, super.anInt10234, super.anInt10228 + super.aShort59);
			return Static591.aBoolean812 ? local12.method5743(arg1, arg3, local26, false, 0, Static96.anInt1733) : local12.method5770(arg1, arg3, local26, false, 0);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aClass325_1.anInt8786;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(14) Class45 local14 = this.aClass325_1.method7768(false, 2048, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		local22.method7026(super.aShort58 + super.anInt10229, super.anInt10234, super.anInt10228 + super.aShort59);
		@Pc(42) Class4_Sub8 local42 = Static118.method1730(1, this.aBoolean294);
		@Pc(47) int local47 = super.anInt10229 >> 9;
		@Pc(52) int local52 = super.anInt10228 >> 9;
		this.aClass325_1.method7769(local14, local52, local52, arg0, local22, local47, local47, true);
		if (Static591.aBoolean812) {
			local14.method5759(local22, local42.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local14.method5769(local22, local42.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass325_1.aClass4_Sub7_7 != null) {
			@Pc(105) Class236 local105 = this.aClass325_1.aClass4_Sub7_7.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local105, Static96.anInt1733);
			} else {
				arg0.method9666(local105);
			}
		}
		this.aBoolean295 = local14.F() || this.aClass325_1.aClass4_Sub7_7 != null;
		if (this.aClass187_2 == null) {
			this.aClass187_2 = Static250.method3479(super.anInt10228, super.anInt10229, local14, super.anInt10234);
		} else {
			Static565.method7856(super.anInt10229, this.aClass187_2, super.anInt10234, local14, super.anInt10228);
		}
		return local42;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass325_1.anInt8783;
	}
}
