import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class20_Sub1_Sub3 extends Class20_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "Lclient!so;")
	private Class271 aClass271_4;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "Z")
	private boolean aBoolean404;

	@OriginalMember(owner = "client!lr", name = "hb", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!lr", name = "Z", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!lr", name = "cb", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "S")
	private final short aShort65;

	@OriginalMember(owner = "client!lr", name = "gb", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "Z")
	private final boolean aBoolean403;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "Lclient!r;")
	public Class97 aClass97_6;

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "Lclient!k;")
	private Class1_Sub2_Sub2 aClass1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIZIIIIIIZ)V")
	public Class20_Sub1_Sub3(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1652 == 1, Static118.method2293(arg13, arg12));
		this.aBoolean405 = arg7;
		this.aBoolean404 = arg14;
		this.aByte68 = (byte) arg3;
		this.aByte66 = (byte) arg12;
		this.aByte67 = (byte) arg13;
		this.aShort65 = (short) arg1.anInt1646;
		this.aBoolean406 = arg1.anInt1632 != 0 && !arg7;
		this.aBoolean403 = arg0.method7153() && arg1.aBoolean132 && !this.aBoolean405 && Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean404) {
			local77 |= 0x10000;
		}
		@Pc(92) Class147 local92 = this.method4928(local77, arg0, this.aBoolean403);
		if (local92 != null) {
			this.aClass97_6 = local92.aClass97_4;
			this.aClass1_Sub2_Sub2_5 = local92.aClass1_Sub2_Sub2_3;
			if (this.aBoolean404) {
				this.aClass97_6 = this.aClass97_6.method6770((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return this.aClass97_6 == null ? 0 : this.aClass97_6.TA();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aBoolean403;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aByte67;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)I")
	public int method4921() {
		return this.aClass97_6 == null ? 15 : this.aClass97_6.e() / 4;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	private Class97 method4922(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass97_6 != null && arg0.method7167(this.aClass97_6.ba(), arg1) == 0) {
			return this.aClass97_6;
		} else {
			@Pc(32) Class147 local32 = this.method4928(arg1, arg0, false);
			return local32 == null ? null : local32.aClass97_4;
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return this.aBoolean404;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class20_Sub2_Sub1) {
			@Pc(37) Class20_Sub2_Sub1 local37 = (Class20_Sub2_Sub1) arg1;
			if (this.aClass97_6 == null || local37.aClass97_2 == null) {
				return;
			}
			this.aClass97_6.method6769(local37.aClass97_2, arg5, arg4, arg2, arg0);
		} else if (arg1 instanceof Class20_Sub1_Sub3) {
			@Pc(18) Class20_Sub1_Sub3 local18 = (Class20_Sub1_Sub3) arg1;
			if (this.aClass97_6 != null && local18.aClass97_6 != null) {
				this.aClass97_6.method6769(local18.aClass97_6, arg5, arg4, arg2, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aShort65 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass97_6 == null) {
			return null;
		}
		@Pc(11) Class128 local11 = arg0.method7165();
		local11.oa(super.anInt8954, super.anInt8947, super.anInt8949);
		@Pc(26) Class46_Sub6 local26 = null;
		if (this.aBoolean406) {
			local26 = Static490.method7528(1);
		}
		this.aClass97_6.method6773(local11, local26 == null ? null : local26.aClass46_Sub1Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		if (this.aClass271_4 == null) {
			this.aClass271_4 = Static161.method2903(super.anInt8947, super.anInt8954, this.method4922(arg0, 0), super.anInt8949);
		}
		return this.aClass271_4;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.method4922(arg1, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
		if (this.aClass97_6 != null) {
			this.aClass97_6.method6777();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		@Pc(33) Class1_Sub2_Sub2 local33;
		if (this.aClass1_Sub2_Sub2_5 == null && this.aBoolean403) {
			@Pc(26) Class147 local26 = this.method4928(262144, arg0, true);
			local33 = local26 == null ? null : local26.aClass1_Sub2_Sub2_3;
		} else {
			local33 = this.aClass1_Sub2_Sub2_5;
			this.aClass1_Sub2_Sub2_5 = null;
		}
		if (local33 != null) {
			Static101.method2062(local33, this.aByte68, super.anInt8954, super.anInt8949, null);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class97 local9 = this.method4922(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class128 local14 = arg0.method7165();
			local14.oa(super.anInt8954, super.anInt8947, super.anInt8949);
			return local9.method6785(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		@Pc(19) Class1_Sub2_Sub2 local19;
		if (this.aClass1_Sub2_Sub2_5 == null && this.aBoolean403) {
			@Pc(30) Class147 local30 = this.method4928(262144, arg0, true);
			local19 = local30 == null ? null : local30.aClass1_Sub2_Sub2_3;
		} else {
			local19 = this.aClass1_Sub2_Sub2_5;
			this.aClass1_Sub2_Sub2_5 = null;
		}
		if (local19 != null) {
			Static509.method7778(local19, this.aByte68, super.anInt8954, super.anInt8949, null);
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		this.aBoolean404 = false;
		if (this.aClass97_6 != null) {
			this.aClass97_6.m(this.aClass97_6.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aByte66;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLclient!qa;Z)Lclient!jc;")
	private Class147 method4928(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class51 local18 = Static398.aClass18_4.method609(this.aShort65 & 0xFFFF);
		@Pc(30) Class7 local30;
		@Pc(25) Class7 local25;
		if (this.aBoolean405) {
			local25 = Static411.aClass7Array12[0];
			local30 = Static207.aClass7Array7[this.aByte68];
		} else {
			if (this.aByte68 < 3) {
				local25 = Static411.aClass7Array12[this.aByte68 + 1];
			} else {
				local25 = null;
			}
			local30 = Static411.aClass7Array12[this.aByte68];
		}
		return local18.method1621(local30, arg2, arg0, local25, arg1, super.anInt8954, super.anInt8949, super.anInt8947, this.aByte66 == 11 ? this.aByte67 + 4 : this.aByte67, this.aByte66 == 11 ? 10 : this.aByte66);
	}
}
