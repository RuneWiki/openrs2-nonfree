import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class20_Sub1_Sub3 extends Class20_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "S")
	private final short aShort67;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!ro", name = "M", descriptor = "Z")
	private final boolean aBoolean486;

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "Z")
	private final boolean aBoolean484;

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "Lclient!j;")
	private Class1_Sub3_Sub10 aClass1_Sub3_Sub10_6;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "Lclient!c;")
	public Class33 aClass33_7;

	static {
		new Class268("", 76);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIZIIZ)V")
	public Class20_Sub1_Sub3(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static359.method4650(arg7, arg8));
		this.aBoolean483 = arg9;
		this.aByte74 = (byte) arg7;
		super.anInt5818 = arg5;
		this.aByte72 = (byte) arg2;
		this.aShort67 = (short) arg1.anInt3383;
		this.aByte73 = (byte) arg8;
		super.anInt5822 = arg3;
		this.aBoolean486 = arg6;
		this.aBoolean484 = arg1.anInt3379 != 0 && !arg6;
		this.aBoolean485 = arg0.method3584() && arg1.aBoolean268 && !this.aBoolean486 && Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean483) {
			local71 |= 0x10000;
		}
		@Pc(86) Class150 local86 = this.method4543(arg0, this.aBoolean485, local71);
		if (local86 != null) {
			this.aClass1_Sub3_Sub10_6 = local86.aClass1_Sub3_Sub10_5;
			this.aClass33_7 = local86.aClass33_5;
			if (this.aBoolean483) {
				this.aClass33_7 = this.aClass33_7.method5383((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!qa;IZI)Lclient!lp;")
	private Class150 method4543(@OriginalArg(0) Class128 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class141 local13 = Static259.aClass95_3.method1821(this.aShort67 & 0xFFFF);
		@Pc(42) Class163 local42;
		@Pc(28) Class163 local28;
		if (this.aBoolean486) {
			local42 = Static164.aClass163Array1[this.aByte72];
			local28 = Static240.aClass163Array3[0];
		} else {
			if (this.aByte72 >= 3) {
				local28 = null;
			} else {
				local28 = Static240.aClass163Array3[this.aByte72 + 1];
			}
			local42 = Static240.aClass163Array3[this.aByte72];
		}
		return local13.method2825(this.aByte74, this.aByte73, super.anInt5818, arg1, arg2, local42, super.anInt5817, arg0, super.anInt5822, local28);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aByte74;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aBoolean485;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(17) Class33 local17 = this.method4545(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class40 local22 = arg2.method3600();
			local22.R(super.anInt5822, super.anInt5817, super.anInt5818);
			return local17.method5395(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.method4545(arg1, arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		@Pc(20) Class1_Sub3_Sub10 local20;
		if (this.aClass1_Sub3_Sub10_6 == null && this.aBoolean485) {
			@Pc(31) Class150 local31 = this.method4543(arg0, true, 262144);
			local20 = local31 == null ? null : local31.aClass1_Sub3_Sub10_5;
		} else {
			local20 = this.aClass1_Sub3_Sub10_6;
			this.aClass1_Sub3_Sub10_6 = null;
		}
		if (local20 != null) {
			Static177.method2370(local20, this.aByte72, super.anInt5822, super.anInt5818, null);
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass33_7 == null) {
			return null;
		}
		@Pc(17) Class40 local17 = arg0.method3600();
		local17.R(super.anInt5822, super.anInt5817, super.anInt5818);
		@Pc(27) Class13_Sub4 local27 = null;
		if (this.aBoolean484) {
			local27 = Static192.method2550(1);
		}
		this.aClass33_7.method5391(local17, local27 == null ? null : local27.aClass13_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		this.aBoolean483 = false;
		if (this.aClass33_7 != null) {
			this.aClass33_7.u(this.aClass33_7.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		@Pc(29) Class1_Sub3_Sub10 local29;
		if (this.aClass1_Sub3_Sub10_6 == null && this.aBoolean485) {
			@Pc(22) Class150 local22 = this.method4543(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub3_Sub10_5;
		} else {
			local29 = this.aClass1_Sub3_Sub10_6;
			this.aClass1_Sub3_Sub10_6 = null;
		}
		if (local29 != null) {
			Static422.method5252(local29, this.aByte72, super.anInt5822, super.anInt5818, null);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
		if (this.aClass33_7 != null) {
			this.aClass33_7.method5397();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	private Class33 method4545(@OriginalArg(1) Class128 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass33_7 != null && arg0.method3605(this.aClass33_7.n(), arg1) == 0) {
			return this.aClass33_7;
		} else {
			@Pc(30) Class150 local30 = this.method4543(arg0, false, arg1);
			return local30 == null ? null : local30.aClass33_5;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aByte73;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return this.aBoolean483;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class20_Sub1_Sub3) {
			@Pc(15) Class20_Sub1_Sub3 local15 = (Class20_Sub1_Sub3) arg3;
			if (this.aClass33_7 != null && local15.aClass33_7 != null) {
				this.aClass33_7.method5384(local15.aClass33_7, arg1, arg2, arg5, arg0);
			}
		} else if (arg3 instanceof Class20_Sub3_Sub1) {
			@Pc(37) Class20_Sub3_Sub1 local37 = (Class20_Sub3_Sub1) arg3;
			if (this.aClass33_7 != null && local37.aClass33_2 != null) {
				this.aClass33_7.method5384(local37.aClass33_2, arg1, arg2, arg5, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aShort67 & 0xFFFF;
	}
}
