import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "Z")
	private final boolean aBoolean163;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "B")
	private final byte aByte33;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "S")
	private final short aShort40;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Z")
	private final boolean aBoolean162;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "Lclient!ri;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_3;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "Lclient!dc;")
	public Class40 aClass40_4;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIZIIZ)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static331.method3180(arg8, arg7));
		this.aBoolean160 = arg9;
		this.aBoolean163 = arg1.anInt1863 != 0 && !arg6;
		this.aByte33 = (byte) arg7;
		super.anInt2660 = (short) arg3;
		this.aByte35 = (byte) arg8;
		this.aByte34 = (byte) arg2;
		this.aShort40 = (short) arg1.anInt1898;
		this.aBoolean162 = arg6;
		super.anInt2656 = (short) arg5;
		this.aBoolean161 = arg0.method4227() && arg1.aBoolean142 && !this.aBoolean162 && Static256.anInt5260 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean160) {
			local70 |= 0x8000;
		}
		@Pc(85) Class32 local85 = this.method1628(arg0, this.aBoolean161, local70);
		if (local85 != null) {
			this.aClass1_Sub2_Sub5_3 = local85.aClass1_Sub2_Sub5_1;
			this.aClass40_4 = local85.aClass40_1;
			if (this.aBoolean160) {
				this.aClass40_4 = this.aClass40_4.method4599((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass40_4 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method4304();
		local16.method3187(super.anInt2660, super.anInt2658, super.anInt2656);
		@Pc(26) Class7_Sub3 local26 = null;
		if (this.aBoolean163) {
			local26 = Static44.method908(1);
		}
		this.aClass40_4.method4587(local16, local26 == null ? null : local26.aClass7_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		@Pc(18) Class1_Sub2_Sub5 local18;
		if (this.aClass1_Sub2_Sub5_3 == null && this.aBoolean161) {
			@Pc(29) Class32 local29 = this.method1628(arg0, true, 131072);
			local18 = local29 == null ? null : local29.aClass1_Sub2_Sub5_1;
		} else {
			local18 = this.aClass1_Sub2_Sub5_3;
			this.aClass1_Sub2_Sub5_3 = null;
		}
		if (local18 != null) {
			Static277.method4956(local18, this.aByte34, super.anInt2660, super.anInt2656, null);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(9) Class40 local9 = this.method1629(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class31 local14 = arg2.method4304();
			local14.method3187(super.anInt2660, super.anInt2658, super.anInt2656);
			return local9.method4614(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return this.aByte33;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ii;ZII)Lclient!cb;")
	private Class32 method1628(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class79 local18 = Static129.method2097(this.aShort40 & 0xFFFF);
		@Pc(30) Class12 local30;
		@Pc(25) Class12 local25;
		if (this.aBoolean162) {
			local25 = Static278.aClass12Array3[0];
			local30 = Static81.aClass12Array1[this.aByte34];
		} else {
			if (this.aByte34 >= 3) {
				local25 = null;
			} else {
				local25 = Static278.aClass12Array3[this.aByte34 + 1];
			}
			local30 = Static278.aClass12Array3[this.aByte34];
		}
		return local18.method1565(local25, super.anInt2656, arg1, super.anInt2660, arg2, this.aByte33, this.aByte35, local30, super.anInt2658, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aBoolean161;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.method1629(arg0, arg1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		@Pc(22) Class1_Sub2_Sub5 local22;
		if (this.aClass1_Sub2_Sub5_3 == null && this.aBoolean161) {
			@Pc(33) Class32 local33 = this.method1628(arg0, true, 131072);
			local22 = local33 == null ? null : local33.aClass1_Sub2_Sub5_1;
		} else {
			local22 = this.aClass1_Sub2_Sub5_3;
			this.aClass1_Sub2_Sub5_3 = null;
		}
		if (local22 != null) {
			Static293.method5138(local22, this.aByte34, super.anInt2660, super.anInt2656, null);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		this.aBoolean160 = false;
		if (this.aClass40_4 != null) {
			this.aClass40_4.method4601(this.aClass40_4.method4602() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aByte35;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class10_Sub2_Sub1) {
			@Pc(5) Class10_Sub2_Sub1 local5 = (Class10_Sub2_Sub1) arg4;
			if (this.aClass40_4 != null && local5.aClass40_4 != null) {
				this.aClass40_4.method4581(local5.aClass40_4, arg3, arg2, arg1, arg5);
			}
		} else if (arg4 instanceof Class10_Sub1_Sub4) {
			@Pc(28) Class10_Sub1_Sub4 local28 = (Class10_Sub1_Sub4) arg4;
			if (this.aClass40_4 != null && local28.aClass40_6 != null) {
				this.aClass40_4.method4581(local28.aClass40_6, arg3, arg2, arg1, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return this.aBoolean160;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
		if (this.aClass40_4 != null) {
			this.aClass40_4.method4619();
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(ILclient!ii;I)Lclient!dc;")
	private Class40 method1629(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		if (this.aClass40_4 != null && arg1.method4223(this.aClass40_4.method4602(), arg0) == 0) {
			return this.aClass40_4;
		} else {
			@Pc(32) Class32 local32 = this.method1628(arg1, false, arg0);
			return local32 == null ? null : local32.aClass40_1;
		}
	}
}
