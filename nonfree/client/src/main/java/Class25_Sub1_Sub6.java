import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class25_Sub1_Sub6 extends Class25_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!vo", name = "lb", descriptor = "Lclient!ct;")
	public static final Class48 lb = new Class48(34, 7);

	@OriginalMember(owner = "client!vo", name = "L", descriptor = "Z")
	private final boolean aBoolean560;

	@OriginalMember(owner = "client!vo", name = "fb", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!vo", name = "bb", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!vo", name = "jb", descriptor = "S")
	private final short aShort91;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!vo", name = "cb", descriptor = "Z")
	private final boolean aBoolean562;

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "Lclient!ns;")
	public Class22 aClass22_6;

	@OriginalMember(owner = "client!vo", name = "eb", descriptor = "Lclient!fq;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_6;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIZIIIIIIZ)V")
	public Class25_Sub1_Sub6(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5923 == 1, Static286.method4344(arg12, arg13));
		this.aBoolean560 = arg7;
		this.aByte73 = (byte) arg13;
		this.aBoolean559 = arg1.anInt5915 != 0 && !arg7;
		this.aBoolean561 = arg14;
		this.aByte72 = (byte) arg12;
		this.aShort91 = (short) arg1.anInt5911;
		this.aByte71 = (byte) arg3;
		this.aBoolean562 = arg0.method5394() && arg1.aBoolean553 && !this.aBoolean560 && Static188.aClass135_Sub1_1.anInt3384 != 0;
		@Pc(74) int local74 = 1024;
		if (this.aBoolean561) {
			local74 |= 0x8000;
		}
		@Pc(89) Class201 local89 = this.method5253(local74, arg0, this.aBoolean562);
		if (local89 != null) {
			this.aClass22_6 = local89.aClass22_4;
			this.aClass1_Sub6_Sub5_6 = local89.aClass1_Sub6_Sub5_4;
			if (this.aBoolean561) {
				this.aClass22_6 = this.aClass22_6.method1598((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class22 local17 = this.method5257(arg0, 65536);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class127 local22 = arg0.method5378();
			local22.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
			return local17.method1584(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.method5257(arg1, arg0);
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return this.aClass22_6 == null ? 0 : this.aClass22_6.method1561();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aByte73;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
		if (this.aClass22_6 != null) {
			this.aClass22_6.method1583();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!tq;Z)Lclient!ri;")
	private Class201 method5253(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class236 local13 = Static54.aClass153_1.method3081(this.aShort91 & 0xFFFF);
		@Pc(21) Class42 local21;
		@Pc(25) Class42 local25;
		if (this.aBoolean560) {
			local21 = Static77.aClass42Array2[this.aByte71];
			local25 = Static239.aClass42Array4[0];
		} else {
			local21 = Static239.aClass42Array4[this.aByte71];
			if (this.aByte71 >= 3) {
				local25 = null;
			} else {
				local25 = Static239.aClass42Array4[this.aByte71 + 1];
			}
		}
		return local13.method5088(arg0, super.anInt6077, local21, super.anInt6080, arg1, this.aByte72 == 11 ? 10 : this.aByte72, arg2, local25, this.aByte72 == 11 ? this.aByte73 + 4 : this.aByte73, super.anInt6085);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		@Pc(27) Class1_Sub6_Sub5 local27;
		if (this.aClass1_Sub6_Sub5_6 == null && this.aBoolean562) {
			@Pc(20) Class201 local20 = this.method5253(131072, arg0, true);
			local27 = local20 == null ? null : local20.aClass1_Sub6_Sub5_4;
		} else {
			local27 = this.aClass1_Sub6_Sub5_6;
			this.aClass1_Sub6_Sub5_6 = null;
		}
		if (local27 != null) {
			Static331.method4786(local27, this.aByte71, super.anInt6080, super.anInt6077, null);
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)I")
	public int method5254() {
		return this.aClass22_6 == null ? 15 : this.aClass22_6.method1579() / 4;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aShort91 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		this.aBoolean561 = false;
		if (this.aClass22_6 != null) {
			this.aClass22_6.method1602(this.aClass22_6.method1563() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		@Pc(21) Class1_Sub6_Sub5 local21;
		if (this.aClass1_Sub6_Sub5_6 == null && this.aBoolean562) {
			@Pc(34) Class201 local34 = this.method5253(131072, arg0, true);
			local21 = local34 == null ? null : local34.aClass1_Sub6_Sub5_4;
		} else {
			local21 = this.aClass1_Sub6_Sub5_6;
			this.aClass1_Sub6_Sub5_6 = null;
		}
		if (local21 != null) {
			Static148.method2206(local21, this.aByte71, super.anInt6080, super.anInt6077, null);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return this.aBoolean561;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tq;IB)Lclient!ns;")
	private Class22 method5257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass22_6 != null && arg0.method5396(this.aClass22_6.method1563(), arg1) == 0) {
			return this.aClass22_6;
		} else {
			@Pc(31) Class201 local31 = this.method5253(arg1, arg0, false);
			return local31 == null ? null : local31.aClass22_4;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class25_Sub5_Sub3) {
			@Pc(28) Class25_Sub5_Sub3 local28 = (Class25_Sub5_Sub3) arg2;
			if (this.aClass22_6 != null && local28.aClass22_3 != null) {
				this.aClass22_6.method1608(local28.aClass22_3, arg5, arg3, arg4, arg0);
			}
		} else if (arg2 instanceof Class25_Sub1_Sub6) {
			@Pc(8) Class25_Sub1_Sub6 local8 = (Class25_Sub1_Sub6) arg2;
			if (this.aClass22_6 != null && local8.aClass22_6 != null) {
				this.aClass22_6.method1608(local8.aClass22_6, arg5, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass22_6 == null) {
			return null;
		}
		@Pc(18) Class127 local18 = arg0.method5378();
		local18.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
		@Pc(28) Class41_Sub1 local28 = null;
		if (this.aBoolean559) {
			local28 = Static277.method4255(1);
		}
		this.aClass22_6.method1565(local18, local28 == null ? null : local28.aClass41_Sub5Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}
}
