import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class25_Sub5_Sub3 extends Class25_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "S")
	private final short aShort72;

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Z")
	private final boolean aBoolean460;

	@OriginalMember(owner = "client!pn", name = "V", descriptor = "Lclient!fq;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_3;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "Lclient!ns;")
	public Class22 aClass22_3;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIZIIZ)V")
	public Class25_Sub5_Sub3(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static341.method4850(arg7, arg8));
		super.anInt4748 = (short) arg3;
		this.aByte59 = (byte) arg2;
		this.aByte60 = (byte) arg7;
		this.aByte61 = (byte) arg8;
		this.aShort72 = (short) arg1.anInt5911;
		this.aBoolean462 = arg9;
		this.aBoolean459 = arg6;
		super.anInt4751 = (short) arg5;
		this.aBoolean461 = arg1.anInt5915 != 0 && !arg6;
		this.aBoolean460 = arg0.method5394() && arg1.aBoolean553 && !this.aBoolean459 && Static188.aClass135_Sub1_1.anInt3384 != 0;
		@Pc(68) int local68 = 1024;
		if (this.aBoolean462) {
			local68 |= 0x8000;
		}
		@Pc(83) Class201 local83 = this.method4218(arg0, this.aBoolean460, local68);
		if (local83 != null) {
			this.aClass1_Sub6_Sub5_3 = local83.aClass1_Sub6_Sub5_4;
			this.aClass22_3 = local83.aClass22_4;
			if (this.aBoolean462) {
				this.aClass22_3 = this.aClass22_3.method1598((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aShort72 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		@Pc(18) Class1_Sub6_Sub5 local18;
		if (this.aClass1_Sub6_Sub5_3 == null && this.aBoolean460) {
			@Pc(29) Class201 local29 = this.method4218(arg0, true, 131072);
			local18 = local29 == null ? null : local29.aClass1_Sub6_Sub5_4;
		} else {
			local18 = this.aClass1_Sub6_Sub5_3;
			this.aClass1_Sub6_Sub5_3 = null;
		}
		if (local18 != null) {
			Static148.method2206(local18, this.aByte59, super.anInt4748, super.anInt4751, null);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class22 local17 = this.method4217(65536, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class127 local22 = arg0.method5378();
			local22.method5265(super.anInt4748, super.anInt4749, super.anInt4751);
			return local17.method1584(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aByte61;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		this.aBoolean462 = false;
		if (this.aClass22_3 != null) {
			this.aClass22_3.method1602(this.aClass22_3.method1563() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return this.aBoolean462;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass22_3 == null) {
			return null;
		}
		@Pc(17) Class127 local17 = arg0.method5378();
		local17.method5265(super.anInt4748, super.anInt4749, super.anInt4751);
		@Pc(27) Class41_Sub1 local27 = null;
		if (this.aBoolean461) {
			local27 = Static277.method4255(1);
		}
		this.aClass22_3.method1565(local17, local27 == null ? null : local27.aClass41_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.method4217(arg0, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		@Pc(35) Class1_Sub6_Sub5 local35;
		if (this.aClass1_Sub6_Sub5_3 == null && this.aBoolean460) {
			@Pc(28) Class201 local28 = this.method4218(arg0, true, 131072);
			local35 = local28 == null ? null : local28.aClass1_Sub6_Sub5_4;
		} else {
			local35 = this.aClass1_Sub6_Sub5_3;
			this.aClass1_Sub6_Sub5_3 = null;
		}
		if (local35 != null) {
			Static331.method4786(local35, this.aByte59, super.anInt4748, super.anInt4751, null);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aBoolean460;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class25_Sub5_Sub3) {
			@Pc(19) Class25_Sub5_Sub3 local19 = (Class25_Sub5_Sub3) arg2;
			if (this.aClass22_3 != null && local19.aClass22_3 != null) {
				this.aClass22_3.method1608(local19.aClass22_3, arg5, arg3, arg4, arg0);
			}
		} else if (arg2 instanceof Class25_Sub1_Sub6) {
			@Pc(41) Class25_Sub1_Sub6 local41 = (Class25_Sub1_Sub6) arg2;
			if (this.aClass22_3 != null && local41.aClass22_6 != null) {
				this.aClass22_3.method1608(local41.aClass22_6, arg5, arg3, arg4, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!tq;I)Lclient!ns;")
	private Class22 method4217(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1) {
		if (this.aClass22_3 != null && arg1.method5396(this.aClass22_3.method1563(), arg0) == 0) {
			return this.aClass22_3;
		} else {
			@Pc(31) Class201 local31 = this.method4218(arg1, false, arg0);
			return local31 == null ? null : local31.aClass22_4;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
		if (this.aClass22_3 != null) {
			this.aClass22_3.method1583();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!tq;ZII)Lclient!ri;")
	private Class201 method4218(@OriginalArg(0) Class164 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class236 local13 = Static54.aClass153_1.method3081(this.aShort72 & 0xFFFF);
		@Pc(43) Class42 local43;
		@Pc(29) Class42 local29;
		if (this.aBoolean459) {
			local43 = Static77.aClass42Array2[this.aByte59];
			local29 = Static239.aClass42Array4[0];
		} else {
			if (this.aByte59 >= 3) {
				local29 = null;
			} else {
				local29 = Static239.aClass42Array4[this.aByte59 + 1];
			}
			local43 = Static239.aClass42Array4[this.aByte59];
		}
		return local13.method5088(arg2, super.anInt4751, local43, super.anInt4748, arg0, this.aByte60, arg1, local29, this.aByte61, super.anInt4749);
	}
}
