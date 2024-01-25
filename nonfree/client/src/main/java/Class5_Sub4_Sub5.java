import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class5_Sub4_Sub5 extends Class5_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Z")
	private final boolean aBoolean404;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "S")
	private final short aShort90;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Z")
	private boolean aBoolean406;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "Lclient!c;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_6;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Lclient!qb;")
	public Class124 aClass124_7;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIIZIIIIIIZ)V")
	public Class5_Sub4_Sub5(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5208 == 1, Static111.method1931(arg13, arg12));
		this.aBoolean404 = arg1.anInt5227 != 0;
		this.aByte71 = (byte) arg3;
		this.aShort90 = (short) arg1.anInt5232;
		this.aByte72 = (byte) arg13;
		this.aBoolean406 = arg14;
		this.aByte70 = (byte) arg12;
		this.aBoolean408 = arg7;
		this.aBoolean405 = arg0.method4804() && arg1.aBoolean312 && !this.aBoolean408 && Static77.anInt1520 != 0;
		@Pc(72) int local72 = 1024;
		if (this.aBoolean406) {
			local72 |= 0x8000;
		}
		@Pc(87) Class111 local87 = this.method5050(this.aBoolean405, arg0, local72);
		if (local87 != null) {
			this.aClass3_Sub7_Sub3_6 = local87.aClass3_Sub7_Sub3_3;
			this.aClass124_7 = local87.aClass124_3;
			if (this.aBoolean406) {
				this.aClass124_7 = this.aClass124_7.method4094((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aShort90 & 0xFFFF;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
		if (this.aClass124_7 != null) {
			this.aClass124_7.method4104();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return this.aBoolean406;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!tj;BI)Lclient!jl;")
	private Class111 method5050(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class170 local18 = Static268.method4553(this.aShort90 & 0xFFFF);
		@Pc(26) Class22 local26;
		@Pc(37) Class22 local37;
		if (this.aBoolean408) {
			local37 = Static355.aClass22Array3[0];
			local26 = Static182.aClass22Array2[this.aByte71];
		} else {
			local26 = Static355.aClass22Array3[this.aByte71];
			if (this.aByte71 < 3) {
				local37 = Static355.aClass22Array3[this.aByte71 + 1];
			} else {
				local37 = null;
			}
		}
		return local18.method4417(super.anInt5905, arg0, this.aByte70 == 11 ? this.aByte72 + 4 : this.aByte72, arg2, this.aByte70 == 11 ? 10 : this.aByte70, super.anInt5907, local37, arg1, local26, super.anInt5901);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.method5054(arg1, arg0);
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)I")
	public int method5052() {
		return this.aClass124_7 == null ? 15 : this.aClass124_7.method4090() / 4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass124_7 == null) {
			return null;
		}
		@Pc(11) Class56 local11 = arg0.method4739();
		local11.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
		@Pc(21) Class8_Sub7 local21 = null;
		if (this.aBoolean404) {
			local21 = Static97.method1655(1);
		}
		this.aClass124_7.method4079(local11, local21 == null ? null : local21.aClass8_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		@Pc(29) Class3_Sub7_Sub3 local29;
		if (this.aClass3_Sub7_Sub3_6 == null && this.aBoolean405) {
			@Pc(22) Class111 local22 = this.method5050(true, arg0, 131072);
			local29 = local22 == null ? null : local22.aClass3_Sub7_Sub3_3;
		} else {
			local29 = this.aClass3_Sub7_Sub3_6;
			this.aClass3_Sub7_Sub3_6 = null;
		}
		if (local29 != null) {
			Static103.method1738(local29, this.aByte71, super.anInt5901, super.anInt5905, null);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean405;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BILclient!tj;)Lclient!qb;")
	private Class124 method5054(@OriginalArg(1) int arg0, @OriginalArg(2) Class122 arg1) {
		if (this.aClass124_7 != null && arg1.method4766(this.aClass124_7.method4108(), arg0) == 0) {
			return this.aClass124_7;
		} else {
			@Pc(33) Class111 local33 = this.method5050(false, arg1, arg0);
			return local33 == null ? null : local33.aClass124_3;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return this.aClass124_7 == null ? 0 : this.aClass124_7.method4106();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class124 local13 = this.method5054(65536, arg1);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class56 local18 = arg1.method4739();
			local18.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
			return local13.method4116(arg2, arg0, local18, false);
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		this.aBoolean406 = false;
		if (this.aClass124_7 != null) {
			this.aClass124_7.method4080(this.aClass124_7.method4108() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class5_Sub5_Sub1) {
			@Pc(39) Class5_Sub5_Sub1 local39 = (Class5_Sub5_Sub1) arg4;
			if (this.aClass124_7 == null || local39.aClass124_4 == null) {
				return;
			}
			this.aClass124_7.method4086(local39.aClass124_4, arg5, arg2, arg0, arg3);
		} else if (arg4 instanceof Class5_Sub4_Sub5) {
			@Pc(20) Class5_Sub4_Sub5 local20 = (Class5_Sub4_Sub5) arg4;
			if (this.aClass124_7 != null && local20.aClass124_7 != null) {
				this.aClass124_7.method4086(local20.aClass124_7, arg5, arg2, arg0, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		@Pc(21) Class3_Sub7_Sub3 local21;
		if (this.aClass3_Sub7_Sub3_6 == null && this.aBoolean405) {
			@Pc(32) Class111 local32 = this.method5050(true, arg0, 131072);
			local21 = local32 == null ? null : local32.aClass3_Sub7_Sub3_3;
		} else {
			local21 = this.aClass3_Sub7_Sub3_6;
			this.aClass3_Sub7_Sub3_6 = null;
		}
		if (local21 != null) {
			Static351.method5704(local21, this.aByte71, super.anInt5901, super.anInt5905, null);
		}
	}
}
