import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class20_Sub2_Sub1_Sub2 extends Class20_Sub2_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!tq", name = "qb", descriptor = "Lclient!ria;")
	private Class290 aClass290_7;

	@OriginalMember(owner = "client!tq", name = "lb", descriptor = "S")
	private final short lb;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!tq", name = "Z", descriptor = "Z")
	private final boolean aBoolean649;

	@OriginalMember(owner = "client!tq", name = "cb", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "B")
	private final byte aByte121;

	@OriginalMember(owner = "client!tq", name = "fb", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub16 aClass6_Sub2_Sub16_6;

	@OriginalMember(owner = "client!tq", name = "db", descriptor = "Lclient!ka;")
	public Class24 aClass24_7;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIIZ)V")
	public Class20_Sub2_Sub1_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static313.method5233(arg8, arg9));
		this.lb = (short) arg1.anInt9241;
		this.aBoolean648 = arg1.anInt9207 != 0 && !arg7;
		this.aByte120 = (byte) arg8;
		this.aBoolean649 = arg7;
		super.anInt10729 = arg6;
		super.anInt10725 = arg4;
		this.aBoolean650 = arg10;
		this.aByte121 = (byte) arg9;
		this.aBoolean651 = arg0.method8798() && arg1.aBoolean629 && !this.aBoolean649 && Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean650) {
			local72 |= 0x10000;
		}
		@Pc(87) Class280 local87 = this.method8048(arg0, local72, this.aBoolean651);
		if (local87 != null) {
			this.aClass6_Sub2_Sub16_6 = local87.aClass6_Sub2_Sub16_4;
			this.aClass24_7 = local87.aClass24_4;
			if (this.aBoolean650) {
				this.aClass24_7 = this.aClass24_7.method6850((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class24 local14 = this.method8047(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class154 local19 = arg1.method8785();
			local19.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local14.method6867(arg0, arg2, local19, false, 0, Static419.anInt7660) : local14.method6855(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.lb & 0xFFFF;
	}

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		if (this.aClass24_7 == null) {
			return true;
		} else {
			return !this.aClass24_7.r();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		@Pc(25) Class6_Sub2_Sub16 local25;
		if (this.aClass6_Sub2_Sub16_6 == null && this.aBoolean651) {
			@Pc(18) Class280 local18 = this.method8048(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass6_Sub2_Sub16_4;
		} else {
			local25 = this.aClass6_Sub2_Sub16_6;
			this.aClass6_Sub2_Sub16_6 = null;
		}
		if (local25 != null) {
			Static546.method7957(local25, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass24_7 == null ? 0 : this.aClass24_7.fa();
	}

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aClass24_7 == null ? false : this.aClass24_7.F();
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.aByte120;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZILclient!ha;)Lclient!ka;")
	private Class24 method8047(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		if (this.aClass24_7 != null && arg1.method8821(this.aClass24_7.ua(), arg0) == 0) {
			return this.aClass24_7;
		} else {
			@Pc(28) Class280 local28 = this.method8048(arg1, arg0, false);
			return local28 == null ? null : local28.aClass24_4;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass24_7 == null) {
			return null;
		}
		@Pc(11) Class154 local11 = arg0.method8785();
		local11.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(33) Class20_Sub3 local33 = Static307.method5201(this.aBoolean648, 1);
		if (Static591.aBoolean675) {
			this.aClass24_7.method6845(local11, local33.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			this.aClass24_7.method6862(local11, local33.aClass20_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 == 3) {
			return this.aClass24_7 == null ? 0 : this.aClass24_7.ma();
		} else {
			return -21;
		}
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		this.aBoolean650 = false;
		if (this.aClass24_7 != null) {
			this.aClass24_7.s(this.aClass24_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aBoolean651;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class6_Sub2_Sub16 local22;
		if (this.aClass6_Sub2_Sub16_6 == null && this.aBoolean651) {
			@Pc(33) Class280 local33 = this.method8048(arg0, 262144, true);
			local22 = local33 == null ? null : local33.aClass6_Sub2_Sub16_4;
		} else {
			local22 = this.aClass6_Sub2_Sub16_6;
			this.aClass6_Sub2_Sub16_6 = null;
		}
		if (local22 != null) {
			Static635.method8386(local22, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!qw;")
	private Class280 method8048(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class312 local18 = Static283.aClass210_2.method5629(this.lb & 0xFFFF);
		@Pc(30) Class199 local30;
		@Pc(25) Class199 local25;
		if (this.aBoolean649) {
			local25 = Static228.aClass199Array2[0];
			local30 = Static510.aClass199Array3[super.aByte130];
		} else {
			if (super.aByte130 >= 3) {
				local25 = null;
			} else {
				local25 = Static228.aClass199Array2[super.aByte130 + 1];
			}
			local30 = Static228.aClass199Array2[super.aByte130];
		}
		return local18.method7867(arg2, local25, this.aByte121, super.anInt10724, arg1, (Class94) null, this.aByte120, arg0, super.anInt10725, super.anInt10729, local30);
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aByte121;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class20_Sub2_Sub1_Sub2) {
			@Pc(28) Class20_Sub2_Sub1_Sub2 local28 = (Class20_Sub2_Sub1_Sub2) arg0;
			if (this.aClass24_7 != null && local28.aClass24_7 != null) {
				this.aClass24_7.method6854(local28.aClass24_7, arg5, arg2, arg4, arg1);
			}
		} else if (arg0 instanceof Class20_Sub2_Sub2_Sub2) {
			@Pc(8) Class20_Sub2_Sub2_Sub2 local8 = (Class20_Sub2_Sub2_Sub2) arg0;
			if (this.aClass24_7 != null && local8.aClass24_1 != null) {
				this.aClass24_7.method6854(local8.aClass24_1, arg5, arg2, arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		if (this.aClass290_7 == null) {
			this.aClass290_7 = Static197.method8846(this.method8047(0, arg0), super.anInt10729, super.anInt10725, super.anInt10724);
		}
		return this.aClass290_7;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
		if (this.aClass24_7 != null) {
			this.aClass24_7.method6859();
		}
	}
}
