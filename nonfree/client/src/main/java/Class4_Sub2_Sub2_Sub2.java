import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class4_Sub2_Sub2_Sub2 extends Class4_Sub2_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "Lclient!it;")
	private Class187 aClass187_4;

	@OriginalMember(owner = "client!mm", name = "fb", descriptor = "Z")
	private boolean aBoolean564 = true;

	@OriginalMember(owner = "client!mm", name = "Z", descriptor = "Lclient!rl;")
	public final Class325 aClass325_2;

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
	private final boolean aBoolean565;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZII)V")
	public Class4_Sub2_Sub2_Sub2(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1892);
		this.aClass325_2 = new Class325(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean565 = arg1.anInt1873 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			Static402.anInt6610 = -9;
		}
		this.aClass325_2.method7774(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return this.aClass187_4;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass325_2.anInt8783;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass187_4 = null;
		}
		return this.aClass325_2.method7776(arg0 + 22997);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 25054) {
			this.aClass325_2.method7764(arg0, 124);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(14) Class45 local14 = this.aClass325_2.method7768(false, 2048, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(29) Class86 local29 = arg0.method9699();
		local29.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(43) Class4_Sub8 local43 = Static118.method1730(1, this.aBoolean565);
		@Pc(48) int local48 = super.anInt10229 >> 9;
		@Pc(53) int local53 = super.anInt10228 >> 9;
		this.aClass325_2.method7769(local14, local53, local53, arg0, local29, local48, local48, true);
		if (Static591.aBoolean812) {
			local14.method5759(local29, local43.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local14.method5769(local29, local43.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass325_2.aClass4_Sub7_7 != null) {
			@Pc(99) Class236 local99 = this.aClass325_2.aClass4_Sub7_7.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local99, Static96.anInt1733);
			} else {
				arg0.method9666(local99);
			}
		}
		this.aBoolean564 = local14.F() || this.aClass325_2.aClass4_Sub7_7 != null;
		if (this.aClass187_4 == null) {
			this.aClass187_4 = Static250.method3479(super.anInt10228, super.anInt10229, local14, super.anInt10234);
		} else {
			Static565.method7856(super.anInt10229, this.aClass187_4, super.anInt10234, local14, super.anInt10228);
		}
		return local43;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method5943(@OriginalArg(0) Class202 arg0) {
		this.aClass325_2.method7766(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.method8971((Class145) null);
		}
		return this.aClass325_2.method7775();
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		return arg0 == 56 ? this.aClass325_2.anInt8781 : -31;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(17) Class45 local17 = this.aClass325_2.method7768(true, 262144, true, arg0);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt10229 >> 9;
		@Pc(29) int local29 = super.anInt10228 >> 9;
		@Pc(32) Class86 local32 = arg0.method9699();
		local32.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		this.aClass325_2.method7769(local17, local29, local29, arg0, local32, local24, local24, false);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aClass325_2.anInt8786;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class45 local12 = this.aClass325_2.method7768(false, 131072, false, arg0);
		if (local12 == null) {
			return false;
		}
		@Pc(20) Class86 local20 = arg0.method9699();
		local20.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		if (arg2 != -11191) {
			Static402.method5942(106);
		}
		return Static591.aBoolean812 ? local12.method5743(arg1, arg3, local20, false, 0, Static96.anInt1733) : local12.method5770(arg1, arg3, local20, false, 0);
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return -13;
	}
}
