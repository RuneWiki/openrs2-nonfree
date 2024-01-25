import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class10_Sub3_Sub2 extends Class10_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "S")
	private final short aShort74;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "Z")
	private final boolean aBoolean387;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "Lclient!dc;")
	private Class40 aClass40_7;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "Lclient!ri;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_6;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIZIZ)V")
	public Class10_Sub3_Sub2(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean144, arg1.aBoolean150);
		this.aBoolean384 = arg8;
		this.aBoolean386 = arg1.anInt1863 != 0 && !arg6;
		super.anInt4795 = (short) arg3;
		this.aShort74 = (short) arg1.anInt1898;
		super.anInt4794 = (short) arg5;
		this.aBoolean387 = arg6;
		this.aByte62 = (byte) arg2;
		this.aByte63 = (byte) arg7;
		this.aBoolean385 = arg0.method4227() && arg1.aBoolean142 && !this.aBoolean387 && Static256.anInt5260 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean384) {
			local66 |= 0x8000;
		}
		@Pc(81) Class32 local81 = this.method4179(local66, arg0, this.aBoolean385);
		if (local81 != null) {
			this.aClass40_7 = local81.aClass40_1;
			this.aClass1_Sub2_Sub5_6 = local81.aClass1_Sub2_Sub5_1;
			if (this.aBoolean384) {
				this.aClass40_7 = this.aClass40_7.method4599((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
		if (this.aClass40_7 != null) {
			this.aClass40_7.method4619();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		@Pc(29) Class1_Sub2_Sub5 local29;
		if (this.aClass1_Sub2_Sub5_6 == null && this.aBoolean385) {
			@Pc(22) Class32 local22 = this.method4179(131072, arg0, true);
			local29 = local22 == null ? null : local22.aClass1_Sub2_Sub5_1;
		} else {
			local29 = this.aClass1_Sub2_Sub5_6;
			this.aClass1_Sub2_Sub5_6 = null;
		}
		if (local29 != null) {
			Static293.method5138(local29, this.aByte62, super.anInt4795, super.anInt4794, null);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.method4178(arg0, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		this.aBoolean384 = false;
		if (this.aClass40_7 != null) {
			this.aClass40_7.method4601(this.aClass40_7.method4602() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		@Pc(25) Class1_Sub2_Sub5 local25;
		if (this.aClass1_Sub2_Sub5_6 == null && this.aBoolean385) {
			@Pc(18) Class32 local18 = this.method4179(131072, arg0, true);
			local25 = local18 == null ? null : local18.aClass1_Sub2_Sub5_1;
		} else {
			local25 = this.aClass1_Sub2_Sub5_6;
			this.aClass1_Sub2_Sub5_6 = null;
		}
		if (local25 != null) {
			Static277.method4956(local25, this.aByte62, super.anInt4795, super.anInt4794, null);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return 22;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aShort74 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(15) Class40 local15 = this.method4178(65536, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class31 local20 = arg2.method4304();
			local20.method3187(super.anInt4795, super.anInt4799, super.anInt4794);
			return local15.method4614(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aBoolean385;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class10_Sub3_Sub2) {
			@Pc(11) Class10_Sub3_Sub2 local11 = (Class10_Sub3_Sub2) arg4;
			if (this.aClass40_7 != null && local11.aClass40_7 != null) {
				this.aClass40_7.method4581(local11.aClass40_7, arg3, arg2, arg1, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass40_7 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method4304();
		local16.method3187(super.anInt4795, super.anInt4799, super.anInt4794);
		@Pc(26) Class7_Sub3 local26 = null;
		if (this.aBoolean386) {
			local26 = Static44.method908(1);
		}
		this.aClass40_7.method4587(local16, local26 == null ? null : local26.aClass7_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(ILclient!ii;I)Lclient!dc;")
	private Class40 method4178(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		if (this.aClass40_7 != null && arg1.method4223(this.aClass40_7.method4602(), arg0) == 0) {
			return this.aClass40_7;
		} else {
			@Pc(23) Class32 local23 = this.method4179(arg0, arg1, false);
			return local23 == null ? null : local23.aClass40_1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ii;ZZ)Lclient!cb;")
	private Class32 method4179(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class79 local12 = Static129.method2097(this.aShort74 & 0xFFFF);
		@Pc(30) Class12 local30;
		@Pc(25) Class12 local25;
		if (this.aBoolean387) {
			local25 = Static278.aClass12Array3[0];
			local30 = Static81.aClass12Array1[this.aByte62];
		} else {
			if (this.aByte62 >= 3) {
				local25 = null;
			} else {
				local25 = Static278.aClass12Array3[this.aByte62 + 1];
			}
			local30 = Static278.aClass12Array3[this.aByte62];
		}
		return local12.method1565(local25, super.anInt4794, arg2, super.anInt4795, arg0, 22, this.aByte63, local30, super.anInt4799, arg1);
	}
}
