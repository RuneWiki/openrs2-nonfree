import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class20_Sub2_Sub2_Sub5 extends Class20_Sub2_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "Lclient!ria;")
	private Class290 aClass290_8;

	@OriginalMember(owner = "client!ww", name = "ib", descriptor = "Z")
	private boolean aBoolean731 = false;

	@OriginalMember(owner = "client!ww", name = "cb", descriptor = "Lclient!qea;")
	public final Class269 aClass269_4;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "Z")
	private final boolean aBoolean730;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIIIIIII)V")
	public Class20_Sub2_Sub2_Sub5(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9215 == 1, Static217.method3686(arg12, arg13));
		this.aClass269_4 = new Class269(arg0, arg1, arg12, arg13, super.aByte131, arg3, this, arg7, arg14);
		this.aBoolean730 = arg1.anInt9207 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aClass269_4.method7016();
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return this.aClass290_8;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class24 local12 = this.aClass269_4.method7019(arg1, 131072, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class154 local19 = arg1.method8785();
			local19.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local12.method6867(arg0, arg2, local19, false, 0, Static419.anInt7660) : local12.method6855(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass269_4.method7014();
	}

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.aClass290_8 = null;
		}
		return this.aClass269_4.method7015(124);
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(14) Class24 local14 = this.aClass269_4.method7019(arg0, 2048, false, true);
		if (local14 == null) {
			return null;
		}
		@Pc(29) Class154 local29 = arg0.method8785();
		local29.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(43) Class20_Sub3 local43 = Static307.method5201(this.aBoolean730, 1);
		this.aClass269_4.method7022(super.aShort122, true, super.aShort123, local29, arg0, super.aShort124, local14, super.aShort125);
		if (Static591.aBoolean675) {
			local14.method6845(local29, local43.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			local14.method6862(local29, local43.aClass20_Sub4Array1[0], 0);
		}
		if (this.aClass269_4.aClass20_Sub8_6 != null) {
			@Pc(89) Class236 local89 = this.aClass269_4.aClass20_Sub8_6.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local89, Static419.anInt7660);
			} else {
				arg0.method8844(local89);
			}
		}
		this.aBoolean731 = local14.F() || this.aClass269_4.aClass20_Sub8_6 != null;
		if (this.aClass290_8 == null) {
			this.aClass290_8 = Static197.method8846(local14, super.anInt10729, super.anInt10725, super.anInt10724);
		} else {
			Static542.method7943(super.anInt10729, local14, super.anInt10724, this.aClass290_8, super.anInt10725);
		}
		return local43;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!fe;)V")
	public void method9034(@OriginalArg(1) Class94 arg0) {
		this.aClass269_4.method7012(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		this.aClass269_4.method7021(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean731;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		this.aClass269_4.method7023(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aClass269_4.anInt8128;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aClass269_4.anInt8139;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		@Pc(17) Class24 local17 = this.aClass269_4.method7019(arg0, 262144, true, true);
		if (local17 != null) {
			@Pc(22) Class154 local22 = arg0.method8785();
			local22.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			this.aClass269_4.method7022(super.aShort122, false, super.aShort123, local22, arg0, super.aShort124, local17, super.aShort125);
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.aClass269_4.anInt8129;
	}
}
