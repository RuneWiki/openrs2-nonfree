import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class20_Sub2_Sub1_Sub1 extends Class20_Sub2_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!bda", name = "fb", descriptor = "Lclient!ria;")
	private Class290 aClass290_1;

	@OriginalMember(owner = "client!bda", name = "U", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bda", name = "Y", descriptor = "Lclient!qea;")
	public final Class269 aClass269_1;

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIII)V")
	public Class20_Sub2_Sub1_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static578.method5710(arg8, arg9));
		this.aClass269_1 = new Class269(arg0, arg1, arg8, arg9, super.aByte131, arg3, this, arg7, arg10);
		this.aBoolean33 = arg1.anInt9207 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		this.aClass269_1.method7021(arg0);
	}

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.method9032();
		}
		return this.aClass269_1.method7015(116);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.aClass269_1.anInt8129;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!fe;Z)V")
	public void method701(@OriginalArg(0) Class94 arg0) {
		this.aClass269_1.method7012(arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aClass269_1.anInt8139;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(14) Class24 local14 = this.aClass269_1.method7019(arg0, 2048, false, true);
		if (local14 == null) {
			return null;
		}
		@Pc(29) Class154 local29 = arg0.method8785();
		local29.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(43) Class20_Sub3 local43 = Static307.method5201(this.aBoolean33, 1);
		@Pc(48) int local48 = super.anInt10725 >> 9;
		@Pc(53) int local53 = super.anInt10729 >> 9;
		this.aClass269_1.method7022(local53, true, local53, local29, arg0, local48, local14, local48);
		if (Static591.aBoolean675) {
			local14.method6845(local29, local43.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			local14.method6862(local29, local43.aClass20_Sub4Array1[0], 0);
		}
		if (this.aClass269_1.aClass20_Sub8_6 != null) {
			@Pc(95) Class236 local95 = this.aClass269_1.aClass20_Sub8_6.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local95, Static419.anInt7660);
			} else {
				arg0.method8844(local95);
			}
		}
		this.aBoolean34 = local14.F() || this.aClass269_1.aClass20_Sub8_6 != null;
		if (this.aClass290_1 == null) {
			this.aClass290_1 = Static197.method8846(local14, super.anInt10729, super.anInt10725, super.anInt10724);
		} else {
			Static542.method7943(super.anInt10729, local14, super.anInt10724, this.aClass290_1, super.anInt10725);
		}
		return local43;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aClass269_1.anInt8128;
	}

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean34;
	}

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return this.aClass290_1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aClass269_1.method7016();
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass269_1.method7014();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		@Pc(24) Class24 local24 = this.aClass269_1.method7019(arg0, 262144, true, true);
		if (local24 == null) {
			return;
		}
		@Pc(31) int local31 = super.anInt10725 >> 9;
		@Pc(36) int local36 = super.anInt10729 >> 9;
		@Pc(39) Class154 local39 = arg0.method8785();
		local39.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		this.aClass269_1.method7022(local36, false, local36, local39, arg0, local31, local24, local31);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class24 local17 = this.aClass269_1.method7019(arg1, 131072, false, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class154 local24 = arg1.method8785();
			local24.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local17.method6867(arg0, arg2, local24, false, 0, Static419.anInt7660) : local17.method6855(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		this.aClass269_1.method7023(arg0);
	}
}
