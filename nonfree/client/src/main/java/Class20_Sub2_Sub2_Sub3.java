import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class20_Sub2_Sub2_Sub3 extends Class20_Sub2_Sub2 {

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "Lclient!paa;")
	private Class20_Sub8 aClass20_Sub8_3;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	private int anInt1941 = 0;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "I")
	private int anInt1943 = 0;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!df", name = "kb", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
	private int anInt1951 = 0;

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "I")
	private final int anInt1962 = -1;

	@OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
	private int anInt1960 = 0;

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
	private int anInt1953 = 0;

	@OriginalMember(owner = "client!df", name = "X", descriptor = "I")
	private final int anInt1950;

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
	public final int anInt1956;

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "Lclient!ao;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class20_Sub2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1950 = arg0;
		this.anInt1941 = arg12;
		this.anInt1956 = arg1 + arg2;
		@Pc(53) Class93 local53 = Static436.aClass292_2.method7401(this.anInt1950);
		@Pc(56) int local56 = local53.anInt2750;
		if (local56 == -1) {
			this.aBoolean140 = true;
		} else {
			this.aClass21_1 = Static294.aClass373_2.method8738(local56);
			this.aBoolean140 = false;
		}
		if (this.anInt1956 == arg2) {
			Static558.method8052(this.anInt1943, this, this.aClass21_1);
		}
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean139;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ql;Lclient!ka;Lclient!ha;)V")
	private void method1608(@OriginalArg(1) Class154 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class100 arg2) {
		arg1.method6861(arg0);
		@Pc(9) Class382[] local9 = arg1.method6853();
		@Pc(12) Class243[] local12 = arg1.method6865();
		if ((this.aClass20_Sub8_3 == null || this.aClass20_Sub8_3.aBoolean519) && (local9 != null || local12 != null)) {
			this.aClass20_Sub8_3 = Static423.method6632(Static113.anInt2243, true);
		}
		if (this.aClass20_Sub8_3 != null) {
			this.aClass20_Sub8_3.method6634(arg2, (long) Static113.anInt2243, local9, local12);
			this.aClass20_Sub8_3.method6636(super.aByte131, super.aShort124, super.aShort125, super.aShort123, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public void method1609() {
		if (this.aClass20_Sub8_3 != null) {
			this.aClass20_Sub8_3.method6633();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public void method1610(@OriginalArg(1) int arg0) {
		if (this.aBoolean140) {
			return;
		}
		this.anInt1953 += arg0;
		while (this.aClass21_1.anIntArray17[this.anInt1943] < this.anInt1953) {
			this.anInt1953 -= this.aClass21_1.anIntArray17[this.anInt1943];
			this.anInt1943++;
			if (this.anInt1943 >= this.aClass21_1.anIntArray15.length) {
				this.aBoolean140 = true;
				break;
			}
		}
		if (!this.aBoolean140) {
			Static558.method8052(this.anInt1943, this, this.aClass21_1);
		}
	}

	@OriginalMember(owner = "client!df", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return this.anInt1951;
	}

	@OriginalMember(owner = "client!df", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub8_3 != null) {
			this.aClass20_Sub8_3.method6633();
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	@Override
	public void method9017() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	@Override
	public void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!df", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.method9018((Class20_Sub2) null, true, 127, (Class100) null, 75, 102);
		}
		return this.anInt1960;
	}

	@OriginalMember(owner = "client!df", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(28) Class24 local28 = this.method1612(arg0, (this.anInt1941 == 0 ? 0 : 5) | 0x800, this.anInt1950);
		if (local28 == null) {
			return null;
		}
		if (this.anInt1941 != 0) {
			local28.a(this.anInt1941 * 2048);
		}
		@Pc(44) Class154 local44 = arg0.method8785();
		local44.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
		this.method1608(local44, local28, arg0);
		@Pc(63) Class20_Sub3 local63 = Static307.method5201(false, 1);
		if (Static591.aBoolean675) {
			local28.method6845(local44, local63.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
		} else {
			local28.method6862(local44, local63.aClass20_Sub4Array1[0], 0);
		}
		if (this.aClass20_Sub8_3 != null) {
			@Pc(91) Class236 local91 = this.aClass20_Sub8_3.method6631();
			if (Static591.aBoolean675) {
				arg0.method8831(local91, Static419.anInt7660);
			} else {
				arg0.method8844(local91);
			}
		}
		this.aBoolean139 = local28.F();
		this.anInt1951 = local28.fa();
		this.anInt1960 = local28.ma();
		return local63;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9011() {
		return false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
		@Pc(15) Class24 local15 = this.method1612(arg0, 0, this.anInt1950);
		if (local15 != null) {
			@Pc(20) Class154 local20 = arg0.method8785();
			local20.method6559(super.anInt10725, super.anInt10724, super.anInt10729);
			this.method1608(local20, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ha;II)Lclient!ka;")
	private Class24 method1612(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class93 local17 = Static436.aClass292_2.method7401(arg2);
		@Pc(22) Class199 local22 = Static228.aClass199Array2[super.aByte131];
		@Pc(35) Class199 local35 = super.aByte130 >= 3 ? null : Static228.aClass199Array2[super.aByte130 + 1];
		return this.aBoolean140 ? local17.method2362(super.anInt10724, -1, super.anInt10725, 0, local35, super.anInt10729, -1, arg0, local22, Static294.aClass373_2, arg1) : local17.method2362(super.anInt10724, this.anInt1962, super.anInt10725, this.anInt1953, local35, super.anInt10729, this.anInt1943, arg0, local22, Static294.aClass373_2, arg1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return null;
	}
}
