import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class20_Sub2_Sub3_Sub2 extends Class20_Sub2_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!gs", name = "hb", descriptor = "Lclient!ria;")
	private Class290 aClass290_4;

	@OriginalMember(owner = "client!gs", name = "Z", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!gs", name = "fb", descriptor = "Z")
	private final boolean aBoolean287;

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!gs", name = "V", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!gs", name = "ib", descriptor = "Lclient!ka;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!gs", name = "cb", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub16 aClass6_Sub2_Sub16_2;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIIII)V")
	public Class20_Sub2_Sub3_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10725 = arg4;
		super.anInt10729 = arg6;
		this.aBoolean286 = arg7;
		this.aBoolean287 = arg1.anInt9207 != 0 && !arg7;
		this.aShort52 = (short) arg1.anInt9241;
		this.aByte57 = (byte) arg10;
		this.aByte56 = (byte) arg11;
		this.aBoolean285 = arg0.method8798() && arg1.aBoolean629 && !this.aBoolean286 && Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() != 0;
		@Pc(73) Class280 local73 = this.method3447(arg0, 2048, this.aBoolean285);
		if (local73 != null) {
			this.aClass24_2 = local73.aClass24_4;
			this.aClass6_Sub2_Sub16_2 = local73.aClass6_Sub2_Sub16_4;
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		@Pc(18) Class6_Sub2_Sub16 local18;
		if (this.aClass6_Sub2_Sub16_2 == null && this.aBoolean285) {
			@Pc(29) Class280 local29 = this.method3447(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass6_Sub2_Sub16_4;
		} else {
			local18 = this.aClass6_Sub2_Sub16_2;
			this.aClass6_Sub2_Sub16_2 = null;
		}
		if (local18 != null) {
			Static546.method7957(local18, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class24 local9 = this.method3448(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class154 local19 = arg1.method8785();
			local19.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local9.method6867(arg0, arg2, local19, false, 0, Static419.anInt7660) : local9.method6855(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.aBoolean286 = false;
		}
		return this.aClass24_2 == null ? 0 : this.aClass24_2.ma();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
	}

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass24_2 == null ? 0 : this.aClass24_2.fa();
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
		if (this.aClass24_2 != null) {
			this.aClass24_2.method6859();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class6_Sub2_Sub16 local22;
		if (this.aClass6_Sub2_Sub16_2 == null && this.aBoolean285) {
			@Pc(33) Class280 local33 = this.method3447(arg0, 262144, true);
			local22 = local33 == null ? null : local33.aClass6_Sub2_Sub16_4;
		} else {
			local22 = this.aClass6_Sub2_Sub16_2;
			this.aClass6_Sub2_Sub16_2 = null;
		}
		if (local22 != null) {
			Static635.method8386(local22, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass24_2 == null) {
			return null;
		}
		@Pc(11) Class154 local11 = arg0.method8785();
		local11.method6559(super.aShort51 + super.anInt10725, super.anInt10724, super.anInt10729 + super.aShort50);
		@Pc(40) Class20_Sub3 local40 = Static307.method5201(this.aBoolean287, 1);
		if (Static591.aBoolean675) {
			this.aClass24_2.method6845(local11, local40.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			this.aClass24_2.method6862(local11, local40.aClass20_Sub4Array1[0], 0);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		if (this.aClass24_2 == null) {
			return true;
		} else {
			return !this.aClass24_2.r();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aBoolean285;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;IIZ)Lclient!qw;")
	private Class280 method3447(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class312 local13 = Static283.aClass210_2.method5629(this.aShort52 & 0xFFFF);
		@Pc(26) Class199 local26;
		@Pc(39) Class199 local39;
		if (this.aBoolean286) {
			local39 = Static228.aClass199Array2[0];
			local26 = Static510.aClass199Array3[super.aByte130];
		} else {
			local26 = Static228.aClass199Array2[super.aByte130];
			if (super.aByte130 < 3) {
				local39 = Static228.aClass199Array2[super.aByte130 + 1];
			} else {
				local39 = null;
			}
		}
		return local13.method7867(arg2, local39, this.aByte56, super.anInt10724, arg1, (Class94) null, this.aByte57, arg0, super.anInt10725, super.anInt10729, local26);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		if (this.aClass290_4 == null) {
			this.aClass290_4 = Static197.method8846(this.method3448(arg0, 0), super.anInt10729, super.anInt10725, super.anInt10724);
		}
		return this.aClass290_4;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class24 method3448(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_2 != null && arg0.method8821(this.aClass24_2.ua(), arg1) == 0) {
			return this.aClass24_2;
		} else {
			@Pc(33) Class280 local33 = this.method3447(arg0, arg1, false);
			return local33 == null ? null : local33.aClass24_4;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aClass24_2 == null ? false : this.aClass24_2.F();
	}
}
