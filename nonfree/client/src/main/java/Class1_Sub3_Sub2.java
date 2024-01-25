import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "B")
	private final byte aByte5;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "S")
	private final short aShort5;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "Z")
	private final boolean aBoolean48;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!n;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!dh;")
	private Class2_Sub10_Sub3 aClass2_Sub10_Sub3_1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIZIZ)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean314, arg1.aBoolean316);
		this.aByte5 = (byte) arg7;
		super.anInt4623 = (short) arg3;
		this.aByte6 = (byte) arg2;
		super.anInt4621 = (short) arg5;
		this.aBoolean46 = arg8;
		this.aShort5 = (short) arg1.anInt4131;
		this.aBoolean47 = arg6;
		this.aBoolean48 = arg1.anInt4140 != 0 && !arg6;
		this.aBoolean45 = arg0.method2036() && arg1.aBoolean319 && !this.aBoolean47 && Static202.anInt3721 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean46) {
			local66 |= 0x8000;
		}
		@Pc(81) Class37 local81 = this.method466(this.aBoolean45, arg0, local66);
		if (local81 != null) {
			this.aClass66_1 = local81.aClass66_2;
			this.aClass2_Sub10_Sub3_1 = local81.aClass2_Sub10_Sub3_2;
			if (this.aBoolean46) {
				this.aClass66_1 = this.aClass66_1.method5119((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
		if (this.aClass66_1 != null) {
			this.aClass66_1.method5150();
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return 22;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass66_1 == null) {
			return null;
		}
		@Pc(11) Class44 local11 = arg0.method2024();
		local11.method3541(super.anInt4623, super.anInt4622, super.anInt4621);
		@Pc(31) Class10_Sub3 local31 = null;
		if (this.aBoolean48) {
			local31 = Static299.method4461(1);
		}
		this.aClass66_1.method5126(local11, local31 == null ? null : local31.aClass10_Sub7Array1[0], 0);
		return local31;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		@Pc(25) Class2_Sub10_Sub3 local25;
		if (this.aClass2_Sub10_Sub3_1 == null && this.aBoolean45) {
			@Pc(18) Class37 local18 = this.method466(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass2_Sub10_Sub3_2;
		} else {
			local25 = this.aClass2_Sub10_Sub3_1;
			this.aClass2_Sub10_Sub3_1 = null;
		}
		if (local25 != null) {
			Static43.method733(local25, this.aByte6, super.anInt4623, super.anInt4621, null);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub3_Sub2) {
			@Pc(5) Class1_Sub3_Sub2 local5 = (Class1_Sub3_Sub2) arg4;
			if (this.aClass66_1 != null && local5.aClass66_1 != null) {
				this.aClass66_1.method5125(local5.aClass66_1, arg2, arg5, arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		@Pc(29) Class2_Sub10_Sub3 local29;
		if (this.aClass2_Sub10_Sub3_1 == null && this.aBoolean45) {
			@Pc(22) Class37 local22 = this.method466(true, arg0, 131072);
			local29 = local22 == null ? null : local22.aClass2_Sub10_Sub3_2;
		} else {
			local29 = this.aClass2_Sub10_Sub3_1;
			this.aClass2_Sub10_Sub3_1 = null;
		}
		if (local29 != null) {
			Static258.method4008(local29, this.aByte6, super.anInt4623, super.anInt4621, null);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aByte5;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!vc;II)Lclient!co;")
	private Class37 method466(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class172 local13 = Static221.aClass118_6.method2858(this.aShort5 & 0xFFFF);
		@Pc(25) Class107 local25;
		@Pc(20) Class107 local20;
		if (this.aBoolean47) {
			local20 = Static90.aClass107Array1[0];
			local25 = Static94.aClass107Array2[this.aByte6];
		} else {
			if (this.aByte6 < 3) {
				local20 = Static90.aClass107Array1[this.aByte6 + 1];
			} else {
				local20 = null;
			}
			local25 = Static90.aClass107Array1[this.aByte6];
		}
		return local13.method3787(super.anInt4621, local20, arg0, this.aByte5, arg2, arg1, super.anInt4623, 22, super.anInt4622, local25);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		this.aBoolean46 = false;
		if (this.aClass66_1 != null) {
			this.aClass66_1.method5118(this.aClass66_1.method5127() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class66 local15 = this.method468(arg0, 65536);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class44 local20 = arg0.method2024();
			local20.method3541(super.anInt4623, super.anInt4622, super.anInt4621);
			return local15.method5131(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aShort5 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aBoolean45;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.method468(arg1, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!vc;II)Lclient!n;")
	private Class66 method468(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass66_1 != null && arg0.method2051(this.aClass66_1.method5127(), arg1) == 0) {
			return this.aClass66_1;
		} else {
			@Pc(31) Class37 local31 = this.method466(false, arg0, arg1);
			return local31 == null ? null : local31.aClass66_2;
		}
	}
}
