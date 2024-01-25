import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "Z")
	private final boolean aBoolean402;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "S")
	private final short aShort163;

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "Z")
	private final boolean aBoolean401;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "Lclient!j;")
	private Class3_Sub3_Sub4 aClass3_Sub3_Sub4_4;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lclient!c;")
	private Class31 aClass31_5;

	static {
		new Class175("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIZIZ)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean314, arg1.aBoolean323);
		super.anInt7456 = arg3;
		this.aByte71 = (byte) arg2;
		this.aBoolean400 = arg1.anInt4009 != 0 && !arg6;
		super.anInt7454 = arg5;
		this.aByte70 = (byte) arg7;
		this.aBoolean402 = arg6;
		this.aShort163 = (short) arg1.anInt4027;
		this.aBoolean399 = arg8;
		this.aBoolean401 = arg0.method2626() && arg1.aBoolean324 && !this.aBoolean402 && Static123.aClass21_Sub1_1.method775(Static347.anInt6318) != 0;
		@Pc(67) int local67 = 2048;
		if (this.aBoolean399) {
			local67 |= 0x10000;
		}
		@Pc(82) Class48 local82 = this.method4437(local67, this.aBoolean401, arg0);
		if (local82 != null) {
			this.aClass3_Sub3_Sub4_4 = local82.aClass3_Sub3_Sub4_2;
			this.aClass31_5 = local82.aClass31_2;
			if (this.aBoolean399) {
				this.aClass31_5 = this.aClass31_5.method5710((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(9) Class31 local9 = this.method4439(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class106 local14 = arg2.method2587();
			local14.R(super.anInt7456, super.anInt7453, super.anInt7454);
			return local9.method5702(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return 22;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aBoolean401;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		@Pc(21) Class3_Sub3_Sub4 local21;
		if (this.aClass3_Sub3_Sub4_4 == null && this.aBoolean401) {
			@Pc(32) Class48 local32 = this.method4437(262144, true, arg0);
			local21 = local32 == null ? null : local32.aClass3_Sub3_Sub4_2;
		} else {
			local21 = this.aClass3_Sub3_Sub4_4;
			this.aClass3_Sub3_Sub4_4 = null;
		}
		if (local21 != null) {
			Static229.method3575(local21, this.aByte71, super.anInt7456, super.anInt7454, null);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aShort163 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return this.aBoolean399;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLclient!qa;I)Lclient!df;")
	private Class48 method4437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(17) Class128 local17 = Static55.aClass25_1.method855(this.aShort163 & 0xFFFF);
		@Pc(25) Class64 local25;
		@Pc(29) Class64 local29;
		if (this.aBoolean402) {
			local25 = Static401.aClass64Array3[this.aByte71];
			local29 = Static205.aClass64Array2[0];
		} else {
			local25 = Static205.aClass64Array2[this.aByte71];
			if (this.aByte71 >= 3) {
				local29 = null;
			} else {
				local29 = Static205.aClass64Array2[this.aByte71 + 1];
			}
		}
		return local17.method3297(super.anInt7456, arg1, arg0, local29, 22, super.anInt7453, super.anInt7454, local25, this.aByte70, arg2);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		this.aBoolean399 = false;
		if (this.aClass31_5 != null) {
			this.aClass31_5.u(this.aClass31_5.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass31_5 == null) {
			return null;
		}
		@Pc(11) Class106 local11 = arg0.method2587();
		local11.R(super.anInt7456, super.anInt7453, super.anInt7454);
		@Pc(21) Class13_Sub7 local21 = null;
		if (this.aBoolean400) {
			local21 = Static120.method2160(1);
		}
		this.aClass31_5.method5704(local11, local21 == null ? null : local21.aClass13_Sub1Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	private Class31 method4439(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		if (this.aClass31_5 != null && arg1.method2610(this.aClass31_5.n(), arg0) == 0) {
			return this.aClass31_5;
		} else {
			@Pc(31) Class48 local31 = this.method4437(arg0, false, arg1);
			return local31 == null ? null : local31.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
		if (this.aClass31_5 != null) {
			this.aClass31_5.method5716();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.method4439(arg0, arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		if (!(arg0 instanceof Class1_Sub2_Sub2)) {
			return;
		}
		@Pc(15) Class1_Sub2_Sub2 local15 = (Class1_Sub2_Sub2) arg0;
		if (this.aClass31_5 != null && local15.aClass31_5 != null) {
			this.aClass31_5.method5700(local15.aClass31_5, arg5, arg3, arg2, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		@Pc(29) Class3_Sub3_Sub4 local29;
		if (this.aClass3_Sub3_Sub4_4 == null && this.aBoolean401) {
			@Pc(22) Class48 local22 = this.method4437(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub3_Sub4_2;
		} else {
			local29 = this.aClass3_Sub3_Sub4_4;
			this.aClass3_Sub3_Sub4_4 = null;
		}
		if (local29 != null) {
			Static259.method3926(local29, this.aByte71, super.anInt7456, super.anInt7454, null);
		}
	}
}
