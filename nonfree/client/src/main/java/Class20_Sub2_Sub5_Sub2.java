import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class20_Sub2_Sub5_Sub2 extends Class20_Sub2_Sub5 implements Interface12 {

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "Lclient!ria;")
	private Class290 aClass290_6;

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "Z")
	private final boolean aBoolean574;

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "S")
	private final short aShort95;

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "Z")
	private final boolean aBoolean575;

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub16 aClass6_Sub2_Sub16_5;

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "Lclient!ka;")
	private Class24 aClass24_6;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIZ)V")
	public Class20_Sub2_Sub5_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9190);
		this.aByte97 = (byte) arg8;
		super.anInt10725 = arg4;
		this.aBoolean574 = arg1.anInt9207 != 0 && !arg7;
		this.aShort95 = (short) arg1.anInt9241;
		super.anInt10729 = arg6;
		this.aBoolean578 = arg9;
		this.aBoolean576 = arg7;
		this.aBoolean575 = arg0.method8798() && arg1.aBoolean629 && !this.aBoolean576 && Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean578) {
			local63 |= 0x10000;
		}
		@Pc(78) Class280 local78 = this.method7378(this.aBoolean575, arg0, local63);
		if (local78 != null) {
			this.aClass6_Sub2_Sub16_5 = local78.aClass6_Sub2_Sub16_4;
			this.aClass24_6 = local78.aClass24_4;
			if (this.aBoolean578) {
				this.aClass24_6 = this.aClass24_6.method6850((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass24_6 == null ? 0 : this.aClass24_6.fa();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
		if (this.aClass24_6 != null) {
			this.aClass24_6.method6859();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aBoolean575;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class24 method7376(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_6 != null && arg0.method8821(this.aClass24_6.ua(), arg1) == 0) {
			return this.aClass24_6;
		} else {
			@Pc(31) Class280 local31 = this.method7378(false, arg0, arg1);
			return local31 == null ? null : local31.aClass24_4;
		}
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 == 3) {
			return this.aClass24_6 == null ? 0 : this.aClass24_6.ma();
		} else {
			return 73;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		@Pc(29) Class6_Sub2_Sub16 local29;
		if (this.aClass6_Sub2_Sub16_5 == null && this.aBoolean575) {
			@Pc(22) Class280 local22 = this.method7378(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass6_Sub2_Sub16_4;
		} else {
			local29 = this.aClass6_Sub2_Sub16_5;
			this.aClass6_Sub2_Sub16_5 = null;
		}
		if (local29 != null) {
			Static546.method7957(local29, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aShort95 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class20_Sub2_Sub5_Sub2) {
			@Pc(5) Class20_Sub2_Sub5_Sub2 local5 = (Class20_Sub2_Sub5_Sub2) arg0;
			if (this.aClass24_6 != null && local5.aClass24_6 != null) {
				this.aClass24_6.method6854(local5.aClass24_6, arg5, arg2, arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return this.aBoolean578;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		if (this.aClass290_6 == null) {
			this.aClass290_6 = Static197.method8846(this.method7376(arg0, 0), super.anInt10729, super.anInt10725, super.anInt10724);
		}
		return this.aClass290_6;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class24 local15 = this.method7376(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class154 local20 = arg1.method8785();
			local20.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local15.method6867(arg0, arg2, local20, false, 0, Static419.anInt7660) : local15.method6855(arg0, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZILclient!ha;I)Lclient!qw;")
	private Class280 method7378(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class312 local19 = Static283.aClass210_2.method5629(this.aShort95 & 0xFFFF);
		@Pc(31) Class199 local31;
		@Pc(26) Class199 local26;
		if (this.aBoolean576) {
			local26 = Static228.aClass199Array2[0];
			local31 = Static510.aClass199Array3[super.aByte130];
		} else {
			if (super.aByte130 < 3) {
				local26 = Static228.aClass199Array2[super.aByte130 + 1];
			} else {
				local26 = null;
			}
			local31 = Static228.aClass199Array2[super.aByte130];
		}
		return local19.method7867(arg0, local26, this.aByte97, super.anInt10724, arg2, (Class94) null, 22, arg1, super.anInt10725, super.anInt10729, local31);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return 22;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class6_Sub2_Sub16 local22;
		if (this.aClass6_Sub2_Sub16_5 == null && this.aBoolean575) {
			@Pc(33) Class280 local33 = this.method7378(true, arg0, 262144);
			local22 = local33 == null ? null : local33.aClass6_Sub2_Sub16_4;
		} else {
			local22 = this.aClass6_Sub2_Sub16_5;
			this.aClass6_Sub2_Sub16_5 = null;
		}
		if (local22 != null) {
			Static635.method8386(local22, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aClass24_6 == null ? false : this.aClass24_6.F();
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		if (this.aClass24_6 == null) {
			return true;
		} else {
			return !this.aClass24_6.r();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass24_6 == null) {
			return null;
		}
		@Pc(11) Class154 local11 = arg0.method8785();
		local11.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(25) Class20_Sub3 local25 = Static307.method5201(this.aBoolean574, 1);
		if (Static591.aBoolean675) {
			this.aClass24_6.method6845(local11, local25.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			this.aClass24_6.method6862(local11, local25.aClass20_Sub4Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aByte97;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		this.aBoolean578 = false;
		if (this.aClass24_6 != null) {
			this.aClass24_6.s(this.aClass24_6.ua() & 0xFFFEFFFF);
		}
	}
}
