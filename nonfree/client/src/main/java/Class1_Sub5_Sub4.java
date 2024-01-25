import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!t", name = "F", descriptor = "S")
	private final short aShort77;

	@OriginalMember(owner = "client!t", name = "P", descriptor = "Z")
	private boolean aBoolean405;

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Z")
	private final boolean aBoolean403;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!n;")
	public Class66 aClass66_6;

	@OriginalMember(owner = "client!t", name = "S", descriptor = "Lclient!dh;")
	private Class2_Sub10_Sub3 aClass2_Sub10_Sub3_5;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIZIIIIIIZ)V")
	public Class1_Sub5_Sub4(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4111 == 1, Static143.method2685(arg12, arg13));
		this.aShort77 = (short) arg1.anInt4131;
		this.aBoolean405 = arg14;
		this.aBoolean404 = arg1.anInt4140 != 0 && !arg7;
		this.aBoolean406 = arg7;
		this.aByte58 = (byte) arg13;
		this.aByte57 = (byte) arg3;
		this.aByte56 = (byte) arg12;
		this.aBoolean403 = arg0.method2036() && arg1.aBoolean319 && !this.aBoolean406 && Static202.anInt3721 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean405) {
			local76 |= 0x8000;
		}
		@Pc(91) Class37 local91 = this.method4769(arg0, local76, this.aBoolean403);
		if (local91 != null) {
			this.aClass66_6 = local91.aClass66_2;
			this.aClass2_Sub10_Sub3_5 = local91.aClass2_Sub10_Sub3_2;
			if (this.aBoolean405) {
				this.aClass66_6 = this.aClass66_6.method5119((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class66 local13 = this.method4773(65536, arg0);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class44 local18 = arg0.method2024();
			local18.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
			return local13.method5131(arg1, arg2, local18, false);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!vc;IIZ)Lclient!co;")
	private Class37 method4769(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class172 local13 = Static221.aClass118_6.method2858(this.aShort77 & 0xFFFF);
		@Pc(36) Class107 local36;
		@Pc(22) Class107 local22;
		if (this.aBoolean406) {
			local36 = Static94.aClass107Array2[this.aByte57];
			local22 = Static90.aClass107Array1[0];
		} else {
			if (this.aByte57 >= 3) {
				local22 = null;
			} else {
				local22 = Static90.aClass107Array1[this.aByte57 + 1];
			}
			local36 = Static90.aClass107Array1[this.aByte57];
		}
		return local13.method3787(super.anInt6386, local22, arg2, this.aByte56 == 11 ? this.aByte58 + 4 : this.aByte58, arg1, arg0, super.anInt6390, this.aByte56 == 11 ? 10 : this.aByte56, super.anInt6387, local36);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
		if (this.aClass66_6 != null) {
			this.aClass66_6.method5150();
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return this.aClass66_6 == null ? 0 : this.aClass66_6.method5140();
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)I")
	public int method4770() {
		return this.aClass66_6 == null ? 15 : this.aClass66_6.method5138() / 4;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		this.aBoolean405 = false;
		if (this.aClass66_6 != null) {
			this.aClass66_6.method5118(this.aClass66_6.method5127() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass66_6 == null) {
			return null;
		}
		@Pc(11) Class44 local11 = arg0.method2024();
		local11.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
		@Pc(26) Class10_Sub3 local26 = null;
		if (this.aBoolean404) {
			local26 = Static299.method4461(1);
		}
		this.aClass66_6.method5126(local11, local26 == null ? null : local26.aClass10_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		@Pc(29) Class2_Sub10_Sub3 local29;
		if (this.aClass2_Sub10_Sub3_5 == null && this.aBoolean403) {
			@Pc(22) Class37 local22 = this.method4769(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass2_Sub10_Sub3_2;
		} else {
			local29 = this.aClass2_Sub10_Sub3_5;
			this.aClass2_Sub10_Sub3_5 = null;
		}
		if (local29 != null) {
			Static258.method4008(local29, this.aByte57, super.anInt6390, super.anInt6386, null);
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return this.aBoolean405;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.method4773(arg0, arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!vc;I)Lclient!n;")
	private Class66 method4773(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		if (this.aClass66_6 != null && arg1.method2051(this.aClass66_6.method5127(), arg0) == 0) {
			return this.aClass66_6;
		} else {
			@Pc(34) Class37 local34 = this.method4769(arg1, arg0, false);
			return local34 == null ? null : local34.aClass66_2;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aBoolean403;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aShort77 & 0xFFFF;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		@Pc(31) Class2_Sub10_Sub3 local31;
		if (this.aClass2_Sub10_Sub3_5 == null && this.aBoolean403) {
			@Pc(24) Class37 local24 = this.method4769(arg0, 131072, true);
			local31 = local24 == null ? null : local24.aClass2_Sub10_Sub3_2;
		} else {
			local31 = this.aClass2_Sub10_Sub3_5;
			this.aClass2_Sub10_Sub3_5 = null;
		}
		if (local31 != null) {
			Static43.method733(local31, this.aByte57, super.anInt6390, super.anInt6386, null);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub1_Sub1) {
			@Pc(5) Class1_Sub1_Sub1 local5 = (Class1_Sub1_Sub1) arg4;
			if (this.aClass66_6 != null && local5.aClass66_3 != null) {
				this.aClass66_6.method5125(local5.aClass66_3, arg2, arg5, arg3, arg0);
			}
		} else if (arg4 instanceof Class1_Sub5_Sub4) {
			@Pc(28) Class1_Sub5_Sub4 local28 = (Class1_Sub5_Sub4) arg4;
			if (this.aClass66_6 != null && local28.aClass66_6 != null) {
				this.aClass66_6.method5125(local28.aClass66_6, arg2, arg5, arg3, arg0);
			}
		}
	}
}
