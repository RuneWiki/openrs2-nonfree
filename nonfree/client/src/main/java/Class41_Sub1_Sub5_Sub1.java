import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class41_Sub1_Sub5_Sub1 extends Class41_Sub1_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!pw;")
	private Class280 aClass280_2;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Z")
	private final boolean aBoolean241;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "S")
	private final short aShort43;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!ka;")
	private Class114 aClass114_2;

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "Lclient!r;")
	private Class5_Sub2_Sub7 aClass5_Sub2_Sub7_2;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIIII)V")
	public Class41_Sub1_Sub5_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte41 = (byte) arg10;
		this.aBoolean240 = arg7;
		this.aBoolean241 = arg1.anInt1885 != 0 && !arg7;
		this.aShort43 = (short) arg1.anInt1883;
		this.aByte40 = (byte) arg11;
		super.anInt10367 = arg6;
		super.anInt10366 = arg4;
		this.aBoolean242 = arg0.method6206() && arg1.aBoolean140 && !this.aBoolean240 && Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() != 0;
		@Pc(70) Class353 local70 = this.method3061(2048, this.aBoolean242, arg0);
		if (local70 != null) {
			this.aClass114_2 = local70.aClass114_6;
			this.aClass5_Sub2_Sub7_2 = local70.aClass5_Sub2_Sub7_5;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		if (this.aClass280_2 == null) {
			this.aClass280_2 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, this.method3062(0, arg0));
		}
		return this.aClass280_2;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aBoolean242;
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 >= -9) {
			this.method8647();
		}
		return this.aClass114_2 == null ? 0 : this.aClass114_2.ma();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
		if (this.aClass114_2 != null) {
			this.aClass114_2.method8799();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass114_2 == null) {
			return null;
		}
		@Pc(18) Class56 local18 = arg0.method6212();
		local18.method8395(super.anInt10366 + super.aShort63, super.anInt10370, super.aShort64 + super.anInt10367);
		@Pc(38) Class41_Sub3 local38 = Static578.method7877(1, this.aBoolean241);
		if (Static426.aBoolean555) {
			this.aClass114_2.method8807(local18, local38.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			this.aClass114_2.method8801(local18, local38.aClass41_Sub9Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IZLclient!ha;I)Lclient!uf;")
	private Class353 method3061(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class143 arg2) {
		@Pc(19) Class81 local19 = Static400.aClass140_4.method2839(this.aShort43 & 0xFFFF);
		@Pc(27) Class88 local27;
		@Pc(31) Class88 local31;
		if (this.aBoolean240) {
			local27 = Static176.aClass88Array1[super.aByte150];
			local31 = Static230.aClass88Array2[0];
		} else {
			local27 = Static230.aClass88Array2[super.aByte150];
			if (super.aByte150 >= 3) {
				local31 = null;
			} else {
				local31 = Static230.aClass88Array2[super.aByte150 + 1];
			}
		}
		return local19.method1752(super.anInt10366, this.aByte41, arg0, (Class272) null, super.anInt10367, arg1, this.aByte40, local31, local27, super.anInt10370, arg2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class114 local9 = this.method3062(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class56 local21 = arg1.method6212();
			local21.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local9.method8798(arg2, arg0, local21, false, 0, Static663.anInt10391) : local9.method8795(arg2, arg0, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class114 method3062(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		if (this.aClass114_2 != null && arg1.method6226(this.aClass114_2.ua(), arg0) == 0) {
			return this.aClass114_2;
		} else {
			@Pc(30) Class353 local30 = this.method3061(arg0, false, arg1);
			return local30 == null ? null : local30.aClass114_6;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aClass114_2 == null ? false : this.aClass114_2.F();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		@Pc(25) Class5_Sub2_Sub7 local25;
		if (this.aClass5_Sub2_Sub7_2 == null && this.aBoolean242) {
			@Pc(18) Class353 local18 = this.method3061(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub2_Sub7_5;
		} else {
			local25 = this.aClass5_Sub2_Sub7_2;
			this.aClass5_Sub2_Sub7_2 = null;
		}
		if (local25 != null) {
			Static465.method6890(local25, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aShort43 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass114_2 == null ? 0 : this.aClass114_2.fa();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		@Pc(21) Class5_Sub2_Sub7 local21;
		if (this.aClass5_Sub2_Sub7_2 == null && this.aBoolean242) {
			@Pc(34) Class353 local34 = this.method3061(262144, true, arg0);
			local21 = local34 == null ? null : local34.aClass5_Sub2_Sub7_5;
		} else {
			local21 = this.aClass5_Sub2_Sub7_2;
			this.aClass5_Sub2_Sub7_2 = null;
		}
		if (local21 != null) {
			Static92.method1426(local21, super.aByte150, super.anInt10366, super.anInt10367, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		if (this.aClass114_2 == null) {
			return true;
		} else {
			return !this.aClass114_2.r();
		}
	}
}
