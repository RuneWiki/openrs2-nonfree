import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class20_Sub2_Sub3_Sub1 extends Class20_Sub2_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!dha", name = "bb", descriptor = "Lclient!ria;")
	private Class290 aClass290_3;

	@OriginalMember(owner = "client!dha", name = "Q", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dha", name = "cb", descriptor = "Lclient!qea;")
	public final Class269 aClass269_2;

	@OriginalMember(owner = "client!dha", name = "db", descriptor = "Z")
	private final boolean aBoolean154;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIIIII)V")
	public Class20_Sub2_Sub3_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass269_2 = new Class269(arg0, arg1, arg10, arg11, super.aByte131, arg3, this, arg7, arg12);
		this.aBoolean154 = arg1.anInt9207 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aClass269_2.anInt8139;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		this.aClass269_2.method7023(arg0);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		this.aClass269_2.method7021(arg0);
	}

	@OriginalMember(owner = "client!dha", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass269_2.method7014();
	}

	@OriginalMember(owner = "client!dha", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class24 local17 = this.aClass269_2.method7019(arg1, 131072, false, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class154 local24 = arg1.method8785();
			local24.method6559(super.aShort51 + super.anInt10725, super.anInt10724, super.aShort50 + super.anInt10729);
			return Static591.aBoolean675 ? local17.method6867(arg0, arg2, local24, false, 0, Static419.anInt7660) : local17.method6855(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		@Pc(12) Class24 local12 = this.aClass269_2.method7019(arg0, 262144, false, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10725 >> 9;
		@Pc(24) int local24 = super.anInt10729 >> 9;
		@Pc(27) Class154 local27 = arg0.method8785();
		local27.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		this.aClass269_2.method7022(local24, false, local24, local27, arg0, local19, local12, local19);
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(22) Class24 local22 = this.aClass269_2.method7019(arg0, 2048, false, true);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class154 local29 = arg0.method8785();
		local29.method6559(super.aShort51 + super.anInt10725, super.anInt10724, super.aShort50 + super.anInt10729);
		@Pc(49) Class20_Sub3 local49 = Static307.method5201(this.aBoolean154, 1);
		@Pc(54) int local54 = super.anInt10725 >> 9;
		@Pc(59) int local59 = super.anInt10729 >> 9;
		this.aClass269_2.method7022(local59, true, local59, local29, arg0, local54, local22, local54);
		if (Static591.aBoolean675) {
			local22.method6845(local29, local49.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			local22.method6862(local29, local49.aClass20_Sub4Array1[0], 0);
		}
		if (this.aClass269_2.aClass20_Sub8_6 != null) {
			@Pc(101) Class236 local101 = this.aClass269_2.aClass20_Sub8_6.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local101, Static419.anInt7660);
			} else {
				arg0.method8844(local101);
			}
		}
		this.aBoolean153 = local22.F() || this.aClass269_2.aClass20_Sub8_6 != null;
		if (this.aClass290_3 == null) {
			this.aClass290_3 = Static197.method8846(local22, super.anInt10729, super.anInt10725, super.anInt10724);
		} else {
			Static542.method7943(super.anInt10729, local22, super.anInt10724, this.aClass290_3, super.anInt10725);
		}
		return local49;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aClass269_2.anInt8128;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!fe;B)V")
	public void method1714(@OriginalArg(0) Class94 arg0) {
		this.aClass269_2.method7012(arg0);
	}

	@OriginalMember(owner = "client!dha", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.method9021();
		}
		return this.aClass269_2.method7015(arg0 + 124);
	}

	@OriginalMember(owner = "client!dha", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean153;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.aClass269_2.anInt8129;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aClass269_2.method7016();
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return this.aClass290_3;
	}
}
