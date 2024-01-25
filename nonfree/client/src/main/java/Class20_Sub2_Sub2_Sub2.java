import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class20_Sub2_Sub2_Sub2 extends Class20_Sub2_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!dda", name = "kb", descriptor = "Lclient!ria;")
	private Class290 aClass290_2;

	@OriginalMember(owner = "client!dda", name = "db", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!dda", name = "ob", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!dda", name = "cb", descriptor = "S")
	private final short aShort32;

	@OriginalMember(owner = "client!dda", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!dda", name = "hb", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!dda", name = "rb", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "client!dda", name = "X", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!dda", name = "nb", descriptor = "Lclient!ka;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!dda", name = "sb", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub16 aClass6_Sub2_Sub16_1;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIIIZIIIIIIZ)V")
	public Class20_Sub2_Sub2_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9215 == 1, Static88.method1513(arg12, arg13));
		super.aByte130 = (byte) arg3;
		this.aBoolean133 = arg7;
		this.aByte40 = (byte) arg13;
		this.aShort32 = (short) arg1.anInt9241;
		this.lb = (byte) arg12;
		this.aBoolean134 = arg1.anInt9207 != 0 && !arg7;
		this.aBoolean135 = arg14;
		this.aBoolean132 = arg0.method8798() && arg1.aBoolean629 && !this.aBoolean133 && Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean135) {
			local80 |= 0x10000;
		}
		@Pc(95) Class280 local95 = this.method1574(arg0, local80, this.aBoolean132);
		if (local95 != null) {
			this.aClass24_1 = local95.aClass24_4;
			this.aClass6_Sub2_Sub16_1 = local95.aClass6_Sub2_Sub16_4;
			if (this.aBoolean135) {
				this.aClass24_1 = this.aClass24_1.method6850((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return this.aBoolean135;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		if (this.aClass290_2 == null) {
			this.aClass290_2 = Static197.method8846(this.method1573(arg0, 0), super.anInt10729, super.anInt10725, super.anInt10724);
		}
		return this.aClass290_2;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	@Override
	public int method9026() {
		return this.aShort32 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
	@Override
	public void method9031() {
		if (this.aClass24_1 != null) {
			this.aClass24_1.method6859();
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		if (this.aClass24_1 == null) {
			return null;
		}
		@Pc(19) Class154 local19 = arg0.method8785();
		local19.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		@Pc(33) Class20_Sub3 local33 = Static307.method5201(this.aBoolean134, 1);
		if (Static591.aBoolean675) {
			this.aClass24_1.method6845(local19, local33.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			this.aClass24_1.method6862(local19, local33.aClass20_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method9028(@OriginalArg(0) Class100 arg0) {
		@Pc(31) Class6_Sub2_Sub16 local31;
		if (this.aClass6_Sub2_Sub16_1 == null && this.aBoolean132) {
			@Pc(24) Class280 local24 = this.method1574(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass6_Sub2_Sub16_4;
		} else {
			local31 = this.aClass6_Sub2_Sub16_1;
			this.aClass6_Sub2_Sub16_1 = null;
		}
		if (local31 != null) {
			Static546.method7957(local31, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)I")
	@Override
	public int method9029() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class20_Sub2_Sub1_Sub2) {
			@Pc(37) Class20_Sub2_Sub1_Sub2 local37 = (Class20_Sub2_Sub1_Sub2) arg0;
			if (this.aClass24_1 == null || local37.aClass24_7 == null) {
				return;
			}
			this.aClass24_1.method6854(local37.aClass24_7, arg5, arg2, arg4, arg1);
		} else if (arg0 instanceof Class20_Sub2_Sub2_Sub2) {
			@Pc(18) Class20_Sub2_Sub2_Sub2 local18 = (Class20_Sub2_Sub2_Sub2) arg0;
			if (this.aClass24_1 != null && local18.aClass24_1 != null) {
				this.aClass24_1.method6854(local18.aClass24_1, arg5, arg2, arg4, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)I")
	public int method1572() {
		return this.aClass24_1 == null ? 15 : this.aClass24_1.na() / 4;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.aClass24_1 == null ? 0 : this.aClass24_1.fa();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9030(@OriginalArg(1) Class100 arg0) {
		@Pc(14) Class6_Sub2_Sub16 local14;
		if (this.aClass6_Sub2_Sub16_1 == null && this.aBoolean132) {
			@Pc(25) Class280 local25 = this.method1574(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub16_4;
		} else {
			local14 = this.aClass6_Sub2_Sub16_1;
			this.aClass6_Sub2_Sub16_1 = null;
		}
		if (local14 != null) {
			Static635.method8386(local14, super.aByte130, super.anInt10725, super.anInt10729, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9027() {
		return this.aBoolean132;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I")
	@Override
	public int method9032() {
		return this.lb;
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		if (this.aClass24_1 == null) {
			return true;
		} else {
			return !this.aClass24_1.r();
		}
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.aBoolean134 = true;
		}
		return this.aClass24_1 == null ? 0 : this.aClass24_1.ma();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class24 method1573(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_1 != null && arg0.method8821(this.aClass24_1.ua(), arg1) == 0) {
			return this.aClass24_1;
		} else {
			@Pc(28) Class280 local28 = this.method1574(arg0, arg1, false);
			return local28 == null ? null : local28.aClass24_4;
		}
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		this.aBoolean135 = false;
		if (this.aClass24_1 != null) {
			this.aClass24_1.s(this.aClass24_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;BIZ)Lclient!qw;")
	private Class280 method1574(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class312 local13 = Static283.aClass210_2.method5629(this.aShort32 & 0xFFFF);
		@Pc(32) Class199 local32;
		@Pc(27) Class199 local27;
		if (this.aBoolean133) {
			local27 = Static228.aClass199Array2[0];
			local32 = Static510.aClass199Array3[super.aByte130];
		} else {
			if (super.aByte130 < 3) {
				local27 = Static228.aClass199Array2[super.aByte130 + 1];
			} else {
				local27 = null;
			}
			local32 = Static228.aClass199Array2[super.aByte130];
		}
		return local13.method7867(arg2, local27, this.lb == 11 ? this.aByte40 + 4 : this.aByte40, super.anInt10724, arg1, (Class94) null, this.lb == 11 ? 10 : this.lb, arg0, super.anInt10725, super.anInt10729, local32);
	}

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aClass24_1 == null ? false : this.aClass24_1.F();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class24 local15 = this.method1573(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class154 local20 = arg1.method8785();
			local20.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			return Static591.aBoolean675 ? local15.method6867(arg0, arg2, local20, false, 0, Static419.anInt7660) : local15.method6855(arg0, arg2, local20, false, 0);
		}
	}
}
