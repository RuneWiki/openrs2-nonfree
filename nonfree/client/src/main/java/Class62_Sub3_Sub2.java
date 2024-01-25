import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class62_Sub3_Sub2 extends Class62_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "Z")
	private boolean aBoolean268;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "S")
	private final short aShort47;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!mm;")
	private Class2_Sub11_Sub10 aClass2_Sub11_Sub10_2;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!bk;")
	private Class7 aClass7_3;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIZIZ)V")
	public Class62_Sub3_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean271, arg1.aBoolean279);
		this.aBoolean266 = arg1.anInt3115 != 0 && !arg6;
		this.aBoolean268 = arg8;
		this.aByte29 = (byte) arg7;
		this.aBoolean267 = arg6;
		this.aShort47 = (short) arg1.anInt3132;
		super.anInt3044 = (short) arg3;
		super.anInt3045 = (short) arg5;
		this.aByte28 = (byte) arg2;
		this.aBoolean265 = arg0.method4279() && arg1.aBoolean270 && !this.aBoolean267 && Static322.anInt6490 != 0;
		@Pc(69) int local69 = 1024;
		if (this.aBoolean268) {
			local69 |= 0x8000;
		}
		@Pc(84) Class183 local84 = this.method2898(arg0, this.aBoolean265, local69);
		if (local84 != null) {
			this.aClass2_Sub11_Sub10_2 = local84.aClass2_Sub11_Sub10_5;
			this.aClass7_3 = local84.aClass7_6;
			if (this.aBoolean268) {
				this.aClass7_3 = this.aClass7_3.method1436((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class7 local9 = this.method2895(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class133 local14 = arg1.method4244();
			local14.method4324(super.anInt3044, super.anInt3035, super.anInt3045);
			return local9.method1407(arg0, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass7_3 == null) {
			return null;
		}
		@Pc(17) Class133 local17 = arg0.method4244();
		local17.method4324(super.anInt3044, super.anInt3035, super.anInt3045);
		@Pc(27) Class55_Sub3 local27 = null;
		if (this.aBoolean266) {
			local27 = Static241.method4172(1);
		}
		this.aClass7_3.method1441(local17, local27 == null ? null : local27.aClass55_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;IZ)Lclient!bk;")
	private Class7 method2895(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass7_3 != null && arg0.method4276(this.aClass7_3.method1435(), arg1) == 0) {
			return this.aClass7_3;
		} else {
			@Pc(26) Class183 local26 = this.method2898(arg0, false, arg1);
			return local26 == null ? null : local26.aClass7_6;
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		this.aBoolean268 = false;
		if (this.aClass7_3 != null) {
			this.aClass7_3.method1412(this.aClass7_3.method1435() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		@Pc(14) Class2_Sub11_Sub10 local14;
		if (this.aClass2_Sub11_Sub10_2 == null && this.aBoolean265) {
			@Pc(25) Class183 local25 = this.method2898(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass2_Sub11_Sub10_5;
		} else {
			local14 = this.aClass2_Sub11_Sub10_2;
			this.aClass2_Sub11_Sub10_2 = null;
		}
		if (local14 != null) {
			Static247.method4484(local14, this.aByte28, super.anInt3044, super.anInt3045, null);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aShort47 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.method2895(arg0, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		if (arg3 instanceof Class62_Sub3_Sub2) {
			@Pc(5) Class62_Sub3_Sub2 local5 = (Class62_Sub3_Sub2) arg3;
			if (this.aClass7_3 != null && local5.aClass7_3 != null) {
				this.aClass7_3.method1446(local5.aClass7_3, arg2, arg1, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
		if (this.aClass7_3 != null) {
			this.aClass7_3.method1434();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		@Pc(25) Class2_Sub11_Sub10 local25;
		if (this.aClass2_Sub11_Sub10_2 == null && this.aBoolean265) {
			@Pc(18) Class183 local18 = this.method2898(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass2_Sub11_Sub10_5;
		} else {
			local25 = this.aClass2_Sub11_Sub10_2;
			this.aClass2_Sub11_Sub10_2 = null;
		}
		if (local25 != null) {
			Static76.method1680(local25, this.aByte28, super.anInt3044, super.anInt3045, null);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return this.aBoolean268;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return 22;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;BZI)Lclient!sk;")
	private Class183 method2898(@OriginalArg(0) Class4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class96 local12 = Static234.method4051(this.aShort47 & 0xFFFF);
		@Pc(24) Class73 local24;
		@Pc(19) Class73 local19;
		if (this.aBoolean267) {
			local19 = Static265.aClass73Array44[0];
			local24 = Static313.aClass73Array39[this.aByte28];
		} else {
			local24 = Static265.aClass73Array44[this.aByte28];
			if (this.aByte28 < 3) {
				local19 = Static265.aClass73Array44[this.aByte28 + 1];
			} else {
				local19 = null;
			}
		}
		return local12.method2946(this.aByte29, arg1, local24, arg0, 22, super.anInt3044, super.anInt3045, super.anInt3035, arg2, local19);
	}
}
