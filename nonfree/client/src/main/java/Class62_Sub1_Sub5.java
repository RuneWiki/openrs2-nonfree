import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class62_Sub1_Sub5 extends Class62_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "Z")
	private final boolean aBoolean453;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "S")
	private final short aShort71;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "B")
	private final byte aByte46;

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Lclient!mm;")
	private Class2_Sub11_Sub10 aClass2_Sub11_Sub10_3;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Lclient!bk;")
	public Class7 aClass7_4;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIIZIIIIIIZ)V")
	public Class62_Sub1_Sub5(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3136 == 1, Static233.method4043(arg13, arg12));
		this.aBoolean452 = arg14;
		this.aBoolean453 = arg7;
		this.aByte44 = (byte) arg12;
		this.aShort71 = (short) arg1.anInt3132;
		this.aBoolean451 = arg1.anInt3115 != 0 && !arg7;
		this.aByte46 = (byte) arg3;
		this.aByte45 = (byte) arg13;
		this.aBoolean450 = arg0.method4279() && arg1.aBoolean270 && !this.aBoolean453 && Static322.anInt6490 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean452) {
			local76 |= 0x8000;
		}
		@Pc(91) Class183 local91 = this.method4558(arg0, local76, this.aBoolean450);
		if (local91 != null) {
			this.aClass2_Sub11_Sub10_3 = local91.aClass2_Sub11_Sub10_5;
			this.aClass7_4 = local91.aClass7_6;
			if (this.aBoolean452) {
				this.aClass7_4 = this.aClass7_4.method1436((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class7 local14 = this.method4555(65536, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class133 local19 = arg1.method4244();
			local19.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
			return local14.method1407(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return this.aClass7_4 == null ? 0 : this.aClass7_4.method1430();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILclient!ae;)Lclient!bk;")
	private Class7 method4555(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		if (this.aClass7_4 != null && arg1.method4276(this.aClass7_4.method1435(), arg0) == 0) {
			return this.aClass7_4;
		} else {
			@Pc(26) Class183 local26 = this.method4558(arg1, arg0, false);
			return local26 == null ? null : local26.aClass7_6;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aShort71 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass7_4 == null) {
			return null;
		}
		@Pc(11) Class133 local11 = arg0.method4244();
		local11.method4324(super.anInt5289, super.anInt5291, super.anInt5280);
		@Pc(21) Class55_Sub3 local21 = null;
		if (this.aBoolean451) {
			local21 = Static241.method4172(1);
		}
		this.aClass7_4.method1441(local11, local21 == null ? null : local21.aClass55_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		@Pc(14) Class2_Sub11_Sub10 local14;
		if (this.aClass2_Sub11_Sub10_3 == null && this.aBoolean450) {
			@Pc(25) Class183 local25 = this.method4558(arg0, 131072, true);
			local14 = local25 == null ? null : local25.aClass2_Sub11_Sub10_5;
		} else {
			local14 = this.aClass2_Sub11_Sub10_3;
			this.aClass2_Sub11_Sub10_3 = null;
		}
		if (local14 != null) {
			Static76.method1680(local14, this.aByte46, super.anInt5289, super.anInt5280, null);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		if (arg3 instanceof Class62_Sub4_Sub2) {
			@Pc(39) Class62_Sub4_Sub2 local39 = (Class62_Sub4_Sub2) arg3;
			if (this.aClass7_4 == null || local39.aClass7_7 == null) {
				return;
			}
			this.aClass7_4.method1446(local39.aClass7_7, arg2, arg1, arg4, arg0);
		} else if (arg3 instanceof Class62_Sub1_Sub5) {
			@Pc(20) Class62_Sub1_Sub5 local20 = (Class62_Sub1_Sub5) arg3;
			if (this.aClass7_4 != null && local20.aClass7_4 != null) {
				this.aClass7_4.method1446(local20.aClass7_4, arg2, arg1, arg4, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.method4555(arg1, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
		if (this.aClass7_4 != null) {
			this.aClass7_4.method1434();
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		@Pc(31) Class2_Sub11_Sub10 local31;
		if (this.aClass2_Sub11_Sub10_3 == null && this.aBoolean450) {
			@Pc(24) Class183 local24 = this.method4558(arg0, 131072, true);
			local31 = local24 == null ? null : local24.aClass2_Sub11_Sub10_5;
		} else {
			local31 = this.aClass2_Sub11_Sub10_3;
			this.aClass2_Sub11_Sub10_3 = null;
		}
		if (local31 != null) {
			Static247.method4484(local31, this.aByte46, super.anInt5289, super.anInt5280, null);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ae;IZ)Lclient!sk;")
	private Class183 method4558(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) Class96 local20 = Static234.method4051(this.aShort71 & 0xFFFF);
		@Pc(32) Class73 local32;
		@Pc(27) Class73 local27;
		if (this.aBoolean453) {
			local27 = Static265.aClass73Array44[0];
			local32 = Static313.aClass73Array39[this.aByte46];
		} else {
			local32 = Static265.aClass73Array44[this.aByte46];
			if (this.aByte46 < 3) {
				local27 = Static265.aClass73Array44[this.aByte46 + 1];
			} else {
				local27 = null;
			}
		}
		return local20.method2946(this.aByte44 == 11 ? this.aByte45 + 4 : this.aByte45, arg2, local32, arg0, this.aByte44 == 11 ? 10 : this.aByte44, super.anInt5289, super.anInt5280, super.anInt5291, arg1, local27);
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		this.aBoolean452 = false;
		if (this.aClass7_4 != null) {
			this.aClass7_4.method1412(this.aClass7_4.method1435() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)I")
	public int method4561() {
		return this.aClass7_4 == null ? 15 : this.aClass7_4.method1443() / 4;
	}
}
