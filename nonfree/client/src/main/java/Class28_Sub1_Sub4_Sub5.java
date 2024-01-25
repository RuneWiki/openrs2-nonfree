import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class28_Sub1_Sub4_Sub5 extends Class28_Sub1_Sub4 implements Interface1 {

	@OriginalMember(owner = "client!wp", name = "R", descriptor = "Lclient!id;")
	private Class160 aClass160_7;

	@OriginalMember(owner = "client!wp", name = "ub", descriptor = "Z")
	private final boolean aBoolean918;

	@OriginalMember(owner = "client!wp", name = "hb", descriptor = "B")
	private final byte aByte147;

	@OriginalMember(owner = "client!wp", name = "Q", descriptor = "Z")
	private boolean aBoolean915;

	@OriginalMember(owner = "client!wp", name = "db", descriptor = "Z")
	private final boolean aBoolean916;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "S")
	private final short aShort125;

	@OriginalMember(owner = "client!wp", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!wp", name = "eb", descriptor = "Z")
	private final boolean aBoolean917;

	@OriginalMember(owner = "client!wp", name = "qb", descriptor = "Lclient!ka;")
	public Class153 aClass153_7;

	@OriginalMember(owner = "client!wp", name = "wb", descriptor = "Lclient!r;")
	private Class5_Sub3_Sub7 aClass5_Sub3_Sub7_6;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIIIIIIZ)V")
	public Class28_Sub1_Sub4_Sub5(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4667 == 1, Static625.method8465(arg13, arg12));
		this.aBoolean918 = arg1.anInt4647 != 0 && !arg7;
		this.aByte147 = (byte) arg12;
		this.aBoolean915 = arg14;
		super.aByte144 = (byte) arg3;
		this.aBoolean916 = arg7;
		this.aShort125 = (short) arg1.anInt4670;
		this.lb = (byte) arg13;
		this.aBoolean917 = arg0.method6917() && arg1.aBoolean383 && !this.aBoolean916 && Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean915) {
			local78 |= 0x10000;
		}
		@Pc(93) Class311 local93 = this.method8994(arg0, local78, this.aBoolean917);
		if (local93 != null) {
			this.aClass153_7 = local93.aClass153_4;
			this.aClass5_Sub3_Sub7_6 = local93.aClass5_Sub3_Sub7_3;
			if (this.aBoolean915) {
				this.aClass153_7 = this.aClass153_7.method8580((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class28_Sub1_Sub5_Sub2) {
			@Pc(5) Class28_Sub1_Sub5_Sub2 local5 = (Class28_Sub1_Sub5_Sub2) arg2;
			if (this.aClass153_7 != null && local5.aClass153_3 != null) {
				this.aClass153_7.method8582(local5.aClass153_3, arg1, arg4, arg5, arg0);
			}
		} else if (arg2 instanceof Class28_Sub1_Sub4_Sub5) {
			@Pc(28) Class28_Sub1_Sub4_Sub5 local28 = (Class28_Sub1_Sub4_Sub5) arg2;
			if (this.aClass153_7 != null && local28.aClass153_7 != null) {
				this.aClass153_7.method8582(local28.aClass153_7, arg1, arg4, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass153_7 == null ? 0 : this.aClass153_7.fa();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aBoolean917;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		@Pc(35) Class5_Sub3_Sub7 local35;
		if (this.aClass5_Sub3_Sub7_6 == null && this.aBoolean917) {
			@Pc(28) Class311 local28 = this.method8994(arg0, 262144, true);
			local35 = local28 == null ? null : local28.aClass5_Sub3_Sub7_3;
		} else {
			local35 = this.aClass5_Sub3_Sub7_6;
			this.aClass5_Sub3_Sub7_6 = null;
		}
		if (local35 != null) {
			Static491.method7050(local35, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (this.aClass153_7 != null) {
			this.aClass153_7.method8584();
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		if (this.aClass160_7 == null) {
			this.aClass160_7 = Static224.method3501(super.anInt10779, super.anInt10784, this.method8991(arg0, 0), super.anInt10781);
		}
		return this.aClass160_7;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		if (this.aClass153_7 == null) {
			return true;
		} else {
			return !this.aClass153_7.r();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(9) Class153 local9 = this.method8991(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class254 local22 = arg2.method6903();
			local22.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local9.method8590(arg0, arg1, local22, false, 0, Static483.anInt8094) : local9.method8593(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		this.aBoolean915 = false;
		if (this.aClass153_7 != null) {
			this.aClass153_7.s(this.aClass153_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class153 method8991(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass153_7 != null && arg0.method6885(this.aClass153_7.ua(), arg1) == 0) {
			return this.aClass153_7;
		} else {
			@Pc(34) Class311 local34 = this.method8994(arg0, arg1, false);
			return local34 == null ? null : local34.aClass153_4;
		}
	}

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "(B)I")
	public int method8992() {
		return this.aClass153_7 == null ? 15 : this.aClass153_7.na() / 4;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		@Pc(31) Class5_Sub3_Sub7 local31;
		if (this.aClass5_Sub3_Sub7_6 == null && this.aBoolean917) {
			@Pc(24) Class311 local24 = this.method8994(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass5_Sub3_Sub7_3;
		} else {
			local31 = this.aClass5_Sub3_Sub7_6;
			this.aClass5_Sub3_Sub7_6 = null;
		}
		if (local31 != null) {
			Static548.method7637(local31, super.aByte144, super.anInt10781, super.anInt10784, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aClass153_7 == null ? false : this.aClass153_7.F();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;IZB)Lclient!sa;")
	private Class311 method8994(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class164 local13 = Static568.aClass315_5.method7511(this.aShort125 & 0xFFFF);
		@Pc(29) Class109 local29;
		@Pc(35) Class109 local35;
		if (this.aBoolean916) {
			local29 = Static111.aClass109Array3[super.aByte144];
			local35 = Static605.aClass109Array5[0];
		} else {
			local29 = Static605.aClass109Array5[super.aByte144];
			if (super.aByte144 >= 3) {
				local35 = null;
			} else {
				local35 = Static605.aClass109Array5[super.aByte144 + 1];
			}
		}
		return local13.method3905(arg1, this.aByte147 == 11 ? this.lb + 4 : this.lb, local29, arg0, super.anInt10784, this.aByte147 == 11 ? 10 : this.aByte147, super.anInt10779, super.anInt10781, local35, (Class225) null, arg2);
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass153_7 == null) {
			return null;
		}
		@Pc(18) Class254 local18 = arg0.method6903();
		local18.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(32) Class28_Sub7 local32 = Static375.method5607(this.aBoolean918, 1);
		if (Static632.aBoolean877) {
			this.aClass153_7.method8594(local18, local32.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			this.aClass153_7.method8585(local18, local32.aClass28_Sub9Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aByte147;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aShort125 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return this.aBoolean915;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.lb;
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.method8987();
		}
		return this.aClass153_7 == null ? 0 : this.aClass153_7.ma();
	}
}
