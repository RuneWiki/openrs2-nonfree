import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class4_Sub2_Sub1_Sub5 extends Class4_Sub2_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!up", name = "nb", descriptor = "Lclient!it;")
	private Class187 aClass187_8;

	@OriginalMember(owner = "client!up", name = "cb", descriptor = "Z")
	private boolean aBoolean889 = true;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "Lclient!rl;")
	public final Class325 aClass325_4;

	@OriginalMember(owner = "client!up", name = "gb", descriptor = "Z")
	private final boolean aBoolean890;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIIIZIIIIIII)V")
	public Class4_Sub2_Sub1_Sub5(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1851 == 1, Static66.method999(arg13, arg12));
		this.aClass325_4 = new Class325(arg0, arg1, arg12, arg13, super.aByte133, arg3, this, arg7, arg14);
		this.aBoolean890 = arg1.anInt1873 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 25054) {
			this.aClass325_4.method7764(arg0, 120);
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static655.anInt10255 = 26;
		}
		return this.aClass325_4.method7776(arg0 + 22997);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(21) Class45 local21 = this.aClass325_4.method7768(true, 262144, true, arg0);
		if (local21 != null) {
			@Pc(26) Class86 local26 = arg0.method9699();
			local26.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
			this.aClass325_4.method7769(local21, super.aShort127, super.aShort129, arg0, local26, super.aShort130, super.aShort128, false);
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)I")
	@Override
	public int method8992() {
		return this.aClass325_4.anInt8786;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8990(@OriginalArg(0) byte arg0) {
		if (arg0 != -73) {
			this.method8989((Class145) null, 21);
		}
		return this.aClass325_4.method7775();
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return -108;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	@Override
	public void method8988() {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method8997(@OriginalArg(0) Class202 arg0) {
		this.aClass325_4.method7766(arg0);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return this.aClass187_8;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass325_4.anInt8783;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean889;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class45 local12 = this.aClass325_4.method7768(false, 131072, false, arg0);
		if (local12 == null) {
			return false;
		}
		if (arg2 != -11191) {
			this.method8977(-37);
		}
		@Pc(29) Class86 local29 = arg0.method9699();
		local29.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		return Static591.aBoolean812 ? local12.method5743(arg1, arg3, local29, false, 0, Static96.anInt1733) : local12.method5770(arg1, arg3, local29, false, 0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass325_4.method7774(arg0);
		if (!arg1) {
			Static655.aClass52_3 = null;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	@Override
	public int method8991(@OriginalArg(0) byte arg0) {
		if (arg0 != 56) {
			Static655.aClass52_3 = null;
		}
		return this.aClass325_4.anInt8781;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(14) Class45 local14 = this.aClass325_4.method7768(false, 2048, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		local22.method7026(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(48) Class4_Sub8 local48 = Static118.method1730(1, this.aBoolean890);
		this.aClass325_4.method7769(local14, super.aShort127, super.aShort129, arg0, local22, super.aShort130, super.aShort128, true);
		if (Static591.aBoolean812) {
			local14.method5759(local22, local48.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local14.method5769(local22, local48.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass325_4.aClass4_Sub7_7 != null) {
			@Pc(98) Class236 local98 = this.aClass325_4.aClass4_Sub7_7.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local98, Static96.anInt1733);
			} else {
				arg0.method9666(local98);
			}
		}
		this.aBoolean889 = local14.F() || this.aClass325_4.aClass4_Sub7_7 != null;
		if (this.aClass187_8 == null) {
			this.aClass187_8 = Static250.method3479(super.anInt10228, super.anInt10229, local14, super.anInt10234);
		} else {
			Static565.method7856(super.anInt10229, this.aClass187_8, super.anInt10234, local14, super.anInt10228);
		}
		return local48;
	}
}
