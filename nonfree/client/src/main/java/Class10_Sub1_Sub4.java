import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class10_Sub1_Sub4 extends Class10_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "Lclient!lm;")
	public static Class134 lb;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
	private final boolean aBoolean349;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Z")
	private final boolean aBoolean352;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Z")
	private final boolean aBoolean351;

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lclient!dc;")
	public Class40 aClass40_6;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lclient!ri;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_5;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIIZIIIIIIZ)V")
	public Class10_Sub1_Sub4(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1859 == 1, Static51.method1014(arg12, arg13));
		this.aBoolean349 = arg1.anInt1863 != 0 && !arg7;
		this.aBoolean352 = arg7;
		this.aShort73 = (short) arg1.anInt1898;
		this.aByte60 = (byte) arg3;
		this.aByte58 = (byte) arg12;
		this.aByte59 = (byte) arg13;
		this.aBoolean350 = arg14;
		this.aBoolean351 = arg0.method4227() && arg1.aBoolean142 && !this.aBoolean352 && Static256.anInt5260 != 0;
		@Pc(77) int local77 = 1024;
		if (this.aBoolean350) {
			local77 |= 0x8000;
		}
		@Pc(92) Class32 local92 = this.method3857(arg0, this.aBoolean351, local77);
		if (local92 != null) {
			this.aClass40_6 = local92.aClass40_1;
			this.aClass1_Sub2_Sub5_5 = local92.aClass1_Sub2_Sub5_1;
			if (this.aBoolean350) {
				this.aClass40_6 = this.aClass40_6.method4599((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.method3858(arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		@Pc(21) Class1_Sub2_Sub5 local21;
		if (this.aClass1_Sub2_Sub5_5 == null && this.aBoolean351) {
			@Pc(32) Class32 local32 = this.method3857(arg0, true, 131072);
			local21 = local32 == null ? null : local32.aClass1_Sub2_Sub5_1;
		} else {
			local21 = this.aClass1_Sub2_Sub5_5;
			this.aClass1_Sub2_Sub5_5 = null;
		}
		if (local21 != null) {
			Static277.method4956(local21, this.aByte60, super.anInt6728, super.anInt6726, null);
		}
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)I")
	public int method3854() {
		return this.aClass40_6 == null ? 15 : this.aClass40_6.method4593() / 4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		@Pc(32) Class1_Sub2_Sub5 local32;
		if (this.aClass1_Sub2_Sub5_5 == null && this.aBoolean351) {
			@Pc(25) Class32 local25 = this.method3857(arg0, true, 131072);
			local32 = local25 == null ? null : local25.aClass1_Sub2_Sub5_1;
		} else {
			local32 = this.aClass1_Sub2_Sub5_5;
			this.aClass1_Sub2_Sub5_5 = null;
		}
		if (local32 != null) {
			Static293.method5138(local32, this.aByte60, super.anInt6728, super.anInt6726, null);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(14) Class40 local14 = this.method3858(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class31 local19 = arg2.method4304();
			local19.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
			return local14.method4614(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
		if (this.aClass40_6 != null) {
			this.aClass40_6.method4619();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ii;ZIB)Lclient!cb;")
	private Class32 method3857(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class79 local19 = Static129.method2097(this.aShort73 & 0xFFFF);
		@Pc(27) Class12 local27;
		@Pc(38) Class12 local38;
		if (this.aBoolean352) {
			local38 = Static278.aClass12Array3[0];
			local27 = Static81.aClass12Array1[this.aByte60];
		} else {
			local27 = Static278.aClass12Array3[this.aByte60];
			if (this.aByte60 < 3) {
				local38 = Static278.aClass12Array3[this.aByte60 + 1];
			} else {
				local38 = null;
			}
		}
		return local19.method1565(local38, super.anInt6726, arg1, super.anInt6728, arg2, this.aByte58 == 11 ? 10 : this.aByte58, this.aByte58 == 11 ? this.aByte59 + 4 : this.aByte59, local27, super.anInt6722, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLclient!ii;)Lclient!dc;")
	private Class40 method3858(@OriginalArg(0) int arg0, @OriginalArg(2) Class105 arg1) {
		if (this.aClass40_6 != null && arg1.method4223(this.aClass40_6.method4602(), arg0) == 0) {
			return this.aClass40_6;
		} else {
			@Pc(31) Class32 local31 = this.method3857(arg1, false, arg0);
			return local31 == null ? null : local31.aClass40_1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return this.aBoolean350;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aBoolean351;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		this.aBoolean350 = false;
		if (this.aClass40_6 != null) {
			this.aClass40_6.method4601(this.aClass40_6.method4602() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return this.aClass40_6 == null ? 0 : this.aClass40_6.method4572();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass40_6 == null) {
			return null;
		}
		@Pc(17) Class31 local17 = arg0.method4304();
		local17.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
		@Pc(27) Class7_Sub3 local27 = null;
		if (this.aBoolean349) {
			local27 = Static44.method908(1);
		}
		this.aClass40_6.method4587(local17, local27 == null ? null : local27.aClass7_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class10_Sub2_Sub1) {
			@Pc(11) Class10_Sub2_Sub1 local11 = (Class10_Sub2_Sub1) arg4;
			if (this.aClass40_6 != null && local11.aClass40_4 != null) {
				this.aClass40_6.method4581(local11.aClass40_4, arg3, arg2, arg1, arg5);
			}
		} else if (arg4 instanceof Class10_Sub1_Sub4) {
			@Pc(34) Class10_Sub1_Sub4 local34 = (Class10_Sub1_Sub4) arg4;
			if (this.aClass40_6 != null && local34.aClass40_6 != null) {
				this.aClass40_6.method4581(local34.aClass40_6, arg3, arg2, arg1, arg5);
			}
		}
	}
}
