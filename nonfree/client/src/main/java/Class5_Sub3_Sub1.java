import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!gn", name = "W", descriptor = "Z")
	private final boolean aBoolean118;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "S")
	private final short aShort13;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "Z")
	private final boolean aBoolean116;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "Z")
	private final boolean aBoolean117;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!c;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_2;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!qb;")
	private Class124 aClass124_2;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIZIZ)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean307, arg1.aBoolean310);
		this.aBoolean118 = arg1.anInt5227 != 0;
		super.anInt5466 = (short) arg5;
		super.anInt5460 = (short) arg3;
		this.aShort13 = (short) arg1.anInt5232;
		this.aBoolean115 = arg8;
		this.aByte14 = (byte) arg2;
		this.aBoolean116 = arg6;
		this.aByte13 = (byte) arg7;
		this.aBoolean117 = arg0.method4804() && arg1.aBoolean312 && !this.aBoolean116 && Static77.anInt1520 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean115) {
			local67 |= 0x8000;
		}
		@Pc(82) Class111 local82 = this.method1816(local67, this.aBoolean117, arg0);
		if (local82 != null) {
			this.aClass3_Sub7_Sub3_2 = local82.aClass3_Sub7_Sub3_3;
			this.aClass124_2 = local82.aClass124_3;
			if (this.aBoolean115) {
				this.aClass124_2 = this.aClass124_2.method4094((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return this.aBoolean115;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		@Pc(29) Class3_Sub7_Sub3 local29;
		if (this.aClass3_Sub7_Sub3_2 == null && this.aBoolean117) {
			@Pc(22) Class111 local22 = this.method1816(131072, true, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub7_Sub3_3;
		} else {
			local29 = this.aClass3_Sub7_Sub3_2;
			this.aClass3_Sub7_Sub3_2 = null;
		}
		if (local29 != null) {
			Static351.method5704(local29, this.aByte14, super.anInt5460, super.anInt5466, null);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		@Pc(25) Class3_Sub7_Sub3 local25;
		if (this.aClass3_Sub7_Sub3_2 == null && this.aBoolean117) {
			@Pc(18) Class111 local18 = this.method1816(131072, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub3_3;
		} else {
			local25 = this.aClass3_Sub7_Sub3_2;
			this.aClass3_Sub7_Sub3_2 = null;
		}
		if (local25 != null) {
			Static103.method1738(local25, this.aByte14, super.anInt5460, super.anInt5466, null);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class5_Sub3_Sub1) {
			@Pc(5) Class5_Sub3_Sub1 local5 = (Class5_Sub3_Sub1) arg4;
			if (this.aClass124_2 != null && local5.aClass124_2 != null) {
				this.aClass124_2.method4086(local5.aClass124_2, arg5, arg2, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZILclient!tj;)Lclient!jl;")
	private Class111 method1816(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class122 arg2) {
		@Pc(24) Class170 local24 = Static268.method4553(this.aShort13 & 0xFFFF);
		@Pc(32) Class22 local32;
		@Pc(36) Class22 local36;
		if (this.aBoolean116) {
			local32 = Static182.aClass22Array2[this.aByte14];
			local36 = Static355.aClass22Array3[0];
		} else {
			local32 = Static355.aClass22Array3[this.aByte14];
			if (this.aByte14 < 3) {
				local36 = Static355.aClass22Array3[this.aByte14 + 1];
			} else {
				local36 = null;
			}
		}
		return local24.method4417(super.anInt5466, arg1, this.aByte13, arg0, 22, super.anInt5464, local36, arg2, local32, super.anInt5460);
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		this.aBoolean115 = false;
		if (this.aClass124_2 != null) {
			this.aClass124_2.method4080(this.aClass124_2.method4108() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aShort13 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.method1819(arg0, arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass124_2 == null) {
			return null;
		}
		@Pc(11) Class56 local11 = arg0.method4739();
		local11.method4683(super.anInt5460, super.anInt5464, super.anInt5466);
		@Pc(21) Class8_Sub7 local21 = null;
		if (this.aBoolean118) {
			local21 = Static97.method1655(1);
		}
		this.aClass124_2.method4079(local11, local21 == null ? null : local21.aClass8_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class124 local9 = this.method1819(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class56 local20 = arg1.method4739();
			local20.method4683(super.anInt5460, super.anInt5464, super.anInt5466);
			return local9.method4116(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return 22;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!tj;I)Lclient!qb;")
	private Class124 method1819(@OriginalArg(1) Class122 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass124_2 != null && arg0.method4766(this.aClass124_2.method4108(), arg1) == 0) {
			return this.aClass124_2;
		} else {
			@Pc(33) Class111 local33 = this.method1816(arg1, false, arg0);
			return local33 == null ? null : local33.aClass124_3;
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
		if (this.aClass124_2 != null) {
			this.aClass124_2.method4104();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean117;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
	}
}
