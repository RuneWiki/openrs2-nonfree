import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class20_Sub3_Sub1 extends Class20_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "S")
	private final short aShort11;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!dl", name = "I", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!dl", name = "Q", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "Lclient!j;")
	private Class1_Sub3_Sub10 aClass1_Sub3_Sub10_2;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "Lclient!c;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIIZIIIIIIZ)V")
	public Class20_Sub3_Sub1(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3429 == 1, Static356.method4567(arg13, arg12));
		this.aBoolean109 = arg7;
		this.aShort11 = (short) arg1.anInt3383;
		this.aBoolean107 = arg14;
		this.aByte14 = (byte) arg12;
		this.aByte12 = (byte) arg13;
		this.aByte13 = (byte) arg3;
		this.aBoolean108 = arg1.anInt3379 != 0 && !arg7;
		this.aBoolean110 = arg0.method3584() && arg1.aBoolean268 && !this.aBoolean109 && Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean107) {
			local80 |= 0x10000;
		}
		@Pc(95) Class150 local95 = this.method1172(this.aBoolean110, local80, arg0);
		if (local95 != null) {
			this.aClass1_Sub3_Sub10_2 = local95.aClass1_Sub3_Sub10_5;
			this.aClass33_2 = local95.aClass33_5;
			if (this.aBoolean107) {
				this.aClass33_2 = this.aClass33_2.method5383((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aShort11 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		this.aBoolean107 = false;
		if (this.aClass33_2 != null) {
			this.aClass33_2.u(this.aClass33_2.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		@Pc(20) Class1_Sub3_Sub10 local20;
		if (this.aClass1_Sub3_Sub10_2 == null && this.aBoolean110) {
			@Pc(31) Class150 local31 = this.method1172(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass1_Sub3_Sub10_5;
		} else {
			local20 = this.aClass1_Sub3_Sub10_2;
			this.aClass1_Sub3_Sub10_2 = null;
		}
		if (local20 != null) {
			Static177.method2370(local20, this.aByte13, super.anInt6613, super.anInt6616, null);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(17) Class33 local17 = this.method1175(131072, arg2);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class40 local22 = arg2.method3600();
			local22.R(super.anInt6613, super.anInt6615, super.anInt6616);
			return local17.method5395(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		@Pc(14) Class1_Sub3_Sub10 local14;
		if (this.aClass1_Sub3_Sub10_2 == null && this.aBoolean110) {
			@Pc(27) Class150 local27 = this.method1172(true, 262144, arg0);
			local14 = local27 == null ? null : local27.aClass1_Sub3_Sub10_5;
		} else {
			local14 = this.aClass1_Sub3_Sub10_2;
			this.aClass1_Sub3_Sub10_2 = null;
		}
		if (local14 != null) {
			Static422.method5252(local14, this.aByte13, super.anInt6613, super.anInt6616, null);
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aBoolean110;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)I")
	public int method1171() {
		return this.aClass33_2 == null ? 15 : this.aClass33_2.ra() / 4;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIILclient!qa;)Lclient!lp;")
	private Class150 method1172(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class128 arg2) {
		@Pc(20) Class141 local20 = Static259.aClass95_3.method1821(this.aShort11 & 0xFFFF);
		@Pc(32) Class163 local32;
		@Pc(27) Class163 local27;
		if (this.aBoolean109) {
			local27 = Static240.aClass163Array3[0];
			local32 = Static164.aClass163Array1[this.aByte13];
		} else {
			if (this.aByte13 >= 3) {
				local27 = null;
			} else {
				local27 = Static240.aClass163Array3[this.aByte13 + 1];
			}
			local32 = Static240.aClass163Array3[this.aByte13];
		}
		return local20.method2825(this.aByte14 == 11 ? 10 : this.aByte14, this.aByte14 == 11 ? this.aByte12 + 4 : this.aByte12, super.anInt6616, arg0, arg1, local32, super.anInt6615, arg2, super.anInt6613, local27);
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return this.aClass33_2 == null ? 0 : this.aClass33_2.b();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aByte12;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.method1175(arg0, arg1);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass33_2 == null) {
			return null;
		}
		@Pc(11) Class40 local11 = arg0.method3600();
		local11.R(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(21) Class13_Sub4 local21 = null;
		if (this.aBoolean108) {
			local21 = Static192.method2550(1);
		}
		this.aClass33_2.method5391(local11, local21 == null ? null : local21.aClass13_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return this.aBoolean107;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class33 method1175(@OriginalArg(1) int arg0, @OriginalArg(2) Class128 arg1) {
		if (this.aClass33_2 != null && arg1.method3605(this.aClass33_2.n(), arg0) == 0) {
			return this.aClass33_2;
		} else {
			@Pc(28) Class150 local28 = this.method1172(false, arg0, arg1);
			return local28 == null ? null : local28.aClass33_5;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class20_Sub1_Sub3) {
			@Pc(16) Class20_Sub1_Sub3 local16 = (Class20_Sub1_Sub3) arg3;
			if (this.aClass33_2 != null && local16.aClass33_7 != null) {
				this.aClass33_2.method5384(local16.aClass33_7, arg1, arg2, arg5, arg0);
			}
		} else if (arg3 instanceof Class20_Sub3_Sub1) {
			@Pc(38) Class20_Sub3_Sub1 local38 = (Class20_Sub3_Sub1) arg3;
			if (this.aClass33_2 != null && local38.aClass33_2 != null) {
				this.aClass33_2.method5384(local38.aClass33_2, arg1, arg2, arg5, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
		if (this.aClass33_2 != null) {
			this.aClass33_2.method5397();
		}
	}
}
