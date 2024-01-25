import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class62_Sub4_Sub2 extends Class62_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "Z")
	private final boolean aBoolean567;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "S")
	private final short aShort89;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ug", name = "X", descriptor = "Z")
	private final boolean aBoolean568;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "Z")
	private final boolean aBoolean565;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Lclient!bk;")
	public Class7 aClass7_7;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "Lclient!mm;")
	private Class2_Sub11_Sub10 aClass2_Sub11_Sub10_6;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIZIIZ)V")
	public Class62_Sub4_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static60.method1381(arg7, arg8));
		this.aBoolean567 = arg6;
		this.aShort89 = (short) arg1.anInt3132;
		this.aBoolean566 = arg9;
		super.anInt6410 = (short) arg5;
		this.aByte67 = (byte) arg2;
		super.anInt6403 = (short) arg3;
		this.aByte69 = (byte) arg8;
		this.aByte68 = (byte) arg7;
		this.aBoolean568 = arg1.anInt3115 != 0 && !arg6;
		this.aBoolean565 = arg0.method4279() && arg1.aBoolean270 && !this.aBoolean567 && Static322.anInt6490 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean566) {
			local70 |= 0x8000;
		}
		@Pc(85) Class183 local85 = this.method5588(local70, this.aBoolean565, arg0);
		if (local85 != null) {
			this.aClass7_7 = local85.aClass7_6;
			this.aClass2_Sub11_Sub10_6 = local85.aClass2_Sub11_Sub10_5;
			if (this.aBoolean566) {
				this.aClass7_7 = this.aClass7_7.method1436((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ae;I)Lclient!bk;")
	private Class7 method5585(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_7 != null && arg0.method4276(this.aClass7_7.method1435(), arg1) == 0) {
			return this.aClass7_7;
		} else {
			@Pc(28) Class183 local28 = this.method5588(arg1, false, arg0);
			return local28 == null ? null : local28.aClass7_6;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass7_7 == null) {
			return null;
		}
		@Pc(11) Class133 local11 = arg0.method4244();
		local11.method4324(super.anInt6403, super.anInt6402, super.anInt6410);
		@Pc(21) Class55_Sub3 local21 = null;
		if (this.aBoolean568) {
			local21 = Static241.method4172(1);
		}
		this.aClass7_7.method1441(local11, local21 == null ? null : local21.aClass55_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		@Pc(31) Class2_Sub11_Sub10 local31;
		if (this.aClass2_Sub11_Sub10_6 == null && this.aBoolean565) {
			@Pc(24) Class183 local24 = this.method5588(131072, true, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub11_Sub10_5;
		} else {
			local31 = this.aClass2_Sub11_Sub10_6;
			this.aClass2_Sub11_Sub10_6 = null;
		}
		if (local31 != null) {
			Static247.method4484(local31, this.aByte67, super.anInt6403, super.anInt6410, null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aShort89 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class7 local14 = this.method5585(arg1, 65536);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class133 local19 = arg1.method4244();
			local19.method4324(super.anInt6403, super.anInt6402, super.anInt6410);
			return local14.method1407(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aBoolean565;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		this.aBoolean566 = false;
		if (this.aClass7_7 != null) {
			this.aClass7_7.method1412(this.aClass7_7.method1435() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
		if (this.aClass7_7 != null) {
			this.aClass7_7.method1434();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		@Pc(20) Class2_Sub11_Sub10 local20;
		if (this.aClass2_Sub11_Sub10_6 == null && this.aBoolean565) {
			@Pc(31) Class183 local31 = this.method5588(131072, true, arg0);
			local20 = local31 == null ? null : local31.aClass2_Sub11_Sub10_5;
		} else {
			local20 = this.aClass2_Sub11_Sub10_6;
			this.aClass2_Sub11_Sub10_6 = null;
		}
		if (local20 != null) {
			Static76.method1680(local20, this.aByte67, super.anInt6403, super.anInt6410, null);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return this.aBoolean566;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		if (arg3 instanceof Class62_Sub4_Sub2) {
			@Pc(39) Class62_Sub4_Sub2 local39 = (Class62_Sub4_Sub2) arg3;
			if (this.aClass7_7 == null || local39.aClass7_7 == null) {
				return;
			}
			this.aClass7_7.method1446(local39.aClass7_7, arg2, arg1, arg4, arg0);
		} else if (arg3 instanceof Class62_Sub1_Sub5) {
			@Pc(20) Class62_Sub1_Sub5 local20 = (Class62_Sub1_Sub5) arg3;
			if (this.aClass7_7 != null && local20.aClass7_4 != null) {
				this.aClass7_7.method1446(local20.aClass7_4, arg2, arg1, arg4, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.method5585(arg0, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLclient!ae;I)Lclient!sk;")
	private Class183 method5588(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4 arg2) {
		@Pc(12) Class96 local12 = Static234.method4051(this.aShort89 & 0xFFFF);
		@Pc(24) Class73 local24;
		@Pc(19) Class73 local19;
		if (this.aBoolean567) {
			local19 = Static265.aClass73Array44[0];
			local24 = Static313.aClass73Array39[this.aByte67];
		} else {
			if (this.aByte67 >= 3) {
				local19 = null;
			} else {
				local19 = Static265.aClass73Array44[this.aByte67 + 1];
			}
			local24 = Static265.aClass73Array44[this.aByte67];
		}
		return local12.method2946(this.aByte69, arg1, local24, arg2, this.aByte68, super.anInt6403, super.anInt6410, super.anInt6402, arg0, local19);
	}
}
