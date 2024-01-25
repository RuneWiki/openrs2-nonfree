import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class20_Sub2_Sub1 extends Class20_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!so;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Z")
	private final boolean aBoolean230;

	@OriginalMember(owner = "client!fh", name = "Z", descriptor = "Lclient!r;")
	public Class97 aClass97_2;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "Lclient!k;")
	private Class1_Sub2_Sub2 aClass1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIZIIZ)V")
	public Class20_Sub2_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static354.method5819(arg7, arg8));
		this.aByte44 = (byte) arg7;
		super.anInt9298 = arg3;
		this.aBoolean233 = arg9;
		this.aBoolean234 = arg6;
		this.aByte45 = (byte) arg8;
		super.anInt9297 = arg5;
		this.aByte43 = (byte) arg2;
		this.aBoolean232 = arg1.anInt1632 != 0 && !arg6;
		this.aShort33 = (short) arg1.anInt1646;
		this.aBoolean230 = arg0.method7153() && arg1.aBoolean132 && !this.aBoolean234 && Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean233) {
			local71 |= 0x10000;
		}
		@Pc(86) Class147 local86 = this.method2518(arg0, this.aBoolean230, local71);
		if (local86 != null) {
			this.aClass97_2 = local86.aClass97_4;
			this.aClass1_Sub2_Sub2_1 = local86.aClass1_Sub2_Sub2_3;
			if (this.aBoolean233) {
				this.aClass97_2 = this.aClass97_2.method6770((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return this.aBoolean233;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aBoolean230;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class97 local14 = this.method2519(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class128 local19 = arg0.method7165();
			local19.oa(super.anInt9298, super.anInt9300, super.anInt9297);
			return local14.method6785(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class20_Sub2_Sub1) {
			@Pc(37) Class20_Sub2_Sub1 local37 = (Class20_Sub2_Sub1) arg1;
			if (this.aClass97_2 == null || local37.aClass97_2 == null) {
				return;
			}
			this.aClass97_2.method6769(local37.aClass97_2, arg5, arg4, arg2, arg0);
		} else if (arg1 instanceof Class20_Sub1_Sub3) {
			@Pc(18) Class20_Sub1_Sub3 local18 = (Class20_Sub1_Sub3) arg1;
			if (this.aClass97_2 != null && local18.aClass97_6 != null) {
				this.aClass97_2.method6769(local18.aClass97_6, arg5, arg4, arg2, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass97_2 == null) {
			return null;
		}
		@Pc(11) Class128 local11 = arg0.method7165();
		local11.oa(super.anInt9298, super.anInt9300, super.anInt9297);
		@Pc(21) Class46_Sub6 local21 = null;
		if (this.aBoolean232) {
			local21 = Static490.method7528(1);
		}
		this.aClass97_2.method6773(local11, local21 == null ? null : local21.aClass46_Sub1Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
		if (this.aClass97_2 != null) {
			this.aClass97_2.method6777();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		if (this.aClass271_1 == null) {
			this.aClass271_1 = Static161.method2903(super.anInt9300, super.anInt9298, this.method2519(arg0, 0), super.anInt9297);
		}
		return this.aClass271_1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!qa;ZZI)Lclient!jc;")
	private Class147 method2518(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class51 local13 = Static398.aClass18_4.method609(this.aShort33 & 0xFFFF);
		@Pc(25) Class7 local25;
		@Pc(20) Class7 local20;
		if (this.aBoolean234) {
			local20 = Static411.aClass7Array12[0];
			local25 = Static207.aClass7Array7[this.aByte43];
		} else {
			local25 = Static411.aClass7Array12[this.aByte43];
			if (this.aByte43 >= 3) {
				local20 = null;
			} else {
				local20 = Static411.aClass7Array12[this.aByte43 + 1];
			}
		}
		return local13.method1621(local25, arg1, arg2, local20, arg0, super.anInt9298, super.anInt9297, super.anInt9300, this.aByte45, this.aByte44);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!qa;IZ)Lclient!r;")
	private Class97 method2519(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass97_2 != null && arg0.method7167(this.aClass97_2.ba(), arg1) == 0) {
			return this.aClass97_2;
		} else {
			@Pc(26) Class147 local26 = this.method2518(arg0, false, arg1);
			return local26 == null ? null : local26.aClass97_4;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		@Pc(29) Class1_Sub2_Sub2 local29;
		if (this.aClass1_Sub2_Sub2_1 == null && this.aBoolean230) {
			@Pc(22) Class147 local22 = this.method2518(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub2_3;
		} else {
			local29 = this.aClass1_Sub2_Sub2_1;
			this.aClass1_Sub2_Sub2_1 = null;
		}
		if (local29 != null) {
			Static101.method2062(local29, this.aByte43, super.anInt9298, super.anInt9297, null);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		@Pc(25) Class1_Sub2_Sub2 local25;
		if (this.aClass1_Sub2_Sub2_1 == null && this.aBoolean230) {
			@Pc(18) Class147 local18 = this.method2518(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub2_Sub2_3;
		} else {
			local25 = this.aClass1_Sub2_Sub2_1;
			this.aClass1_Sub2_Sub2_1 = null;
		}
		if (local25 != null) {
			Static509.method7778(local25, this.aByte43, super.anInt9298, super.anInt9297, null);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.method2519(arg1, arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		this.aBoolean233 = false;
		if (this.aClass97_2 != null) {
			this.aClass97_2.m(this.aClass97_2.ba() & 0xFFFEFFFF);
		}
	}
}
