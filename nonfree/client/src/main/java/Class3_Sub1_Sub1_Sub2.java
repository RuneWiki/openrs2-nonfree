import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 implements Interface21 {

	@OriginalMember(owner = "client!uo", name = "lb", descriptor = "Lclient!hw;")
	private Class142 lb;

	@OriginalMember(owner = "client!uo", name = "V", descriptor = "Z")
	private final boolean aBoolean708;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "Z")
	private final boolean aBoolean707;

	@OriginalMember(owner = "client!uo", name = "bb", descriptor = "Z")
	private boolean aBoolean710;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!uo", name = "db", descriptor = "S")
	private final short aShort128;

	@OriginalMember(owner = "client!uo", name = "ab", descriptor = "Z")
	private final boolean aBoolean709;

	@OriginalMember(owner = "client!uo", name = "fb", descriptor = "Lclient!ka;")
	private Class166 aClass166_7;

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub7 aClass2_Sub6_Sub7_6;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIZ)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5391);
		this.aBoolean708 = arg7;
		this.aBoolean707 = arg1.anInt5363 != 0 && !arg7;
		super.anInt10310 = arg6;
		this.aBoolean710 = arg9;
		super.anInt10303 = arg4;
		this.aByte133 = (byte) arg8;
		this.aShort128 = (short) arg1.anInt5398;
		this.aBoolean709 = arg0.method7285() && arg1.aBoolean398 && !this.aBoolean708 && Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean710) {
			local66 |= 0x10000;
		}
		@Pc(81) Class16 local81 = this.method8629(arg0, local66, this.aBoolean709);
		if (local81 != null) {
			this.aClass166_7 = local81.aClass166_1;
			this.aClass2_Sub6_Sub7_6 = local81.aClass2_Sub6_Sub7_1;
			if (this.aBoolean710) {
				this.aClass166_7 = this.aClass166_7.method6684((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!(arg3 instanceof Class3_Sub1_Sub1_Sub2)) {
			return;
		}
		@Pc(16) Class3_Sub1_Sub1_Sub2 local16 = (Class3_Sub1_Sub1_Sub2) arg3;
		if (this.aClass166_7 != null && local16.aClass166_7 != null) {
			this.aClass166_7.method6683(local16.aClass166_7, arg5, arg1, arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 == -25675) {
			return this.aClass166_7 == null ? 0 : this.aClass166_7.ma();
		} else {
			return -120;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		@Pc(34) Class2_Sub6_Sub7 local34;
		if (this.aClass2_Sub6_Sub7_6 == null && this.aBoolean709) {
			@Pc(27) Class16 local27 = this.method8629(arg0, 262144, true);
			local34 = local27 == null ? null : local27.aClass2_Sub6_Sub7_1;
		} else {
			local34 = this.aClass2_Sub6_Sub7_6;
			this.aClass2_Sub6_Sub7_6 = null;
		}
		if (local34 != null) {
			Static427.method6848(local34, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!ak;")
	private Class16 method8629(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class161 local22 = Static27.aClass342_3.method8534(this.aShort128 & 0xFFFF);
		@Pc(30) Class65 local30;
		@Pc(34) Class65 local34;
		if (this.aBoolean708) {
			local30 = Static103.aClass65Array3[super.aByte131];
			local34 = Static40.aClass65Array2[0];
		} else {
			local30 = Static40.aClass65Array2[super.aByte131];
			if (super.aByte131 < 3) {
				local34 = Static40.aClass65Array2[super.aByte131 + 1];
			} else {
				local34 = null;
			}
		}
		return local22.method4602(arg0, local34, 22, arg1, super.anInt10303, arg2, local30, super.anInt10306, super.anInt10310, this.aByte133);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		this.aBoolean710 = false;
		if (this.aClass166_7 != null) {
			this.aClass166_7.s(this.aClass166_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aShort128 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass166_7 == null) {
			return null;
		}
		@Pc(11) Class30 local11 = arg0.method7308();
		local11.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(25) Class3_Sub4 local25 = Static546.method8162(1, this.aBoolean707);
		if (Static639.aBoolean753) {
			this.aClass166_7.method6678(local11, local25.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			this.aClass166_7.method6685(local11, local25.aClass3_Sub3Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aBoolean709;
	}

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return this.aBoolean710;
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		if (this.aClass166_7 == null) {
			return true;
		} else {
			return !this.aClass166_7.r();
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass166_7 == null ? 0 : this.aClass166_7.fa();
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aByte133;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
		if (this.aClass166_7 != null) {
			this.aClass166_7.method6682();
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aClass166_7 == null ? false : this.aClass166_7.F();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		@Pc(14) Class2_Sub6_Sub7 local14;
		if (this.aClass2_Sub6_Sub7_6 == null && this.aBoolean709) {
			@Pc(25) Class16 local25 = this.method8629(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass2_Sub6_Sub7_1;
		} else {
			local14 = this.aClass2_Sub6_Sub7_6;
			this.aClass2_Sub6_Sub7_6 = null;
		}
		if (local14 != null) {
			Static378.method2839(local14, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class166 local13 = this.method8632(arg0, 131072);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class30 local18 = arg0.method7308();
			local18.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local13.method6693(arg2, arg1, local18, false, 0, Static380.anInt7419) : local13.method6698(arg2, arg1, local18, false, 0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class166 method8632(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass166_7 != null && arg0.method7270(this.aClass166_7.ua(), arg1) == 0) {
			return this.aClass166_7;
		} else {
			@Pc(31) Class16 local31 = this.method8629(arg0, arg1, false);
			return local31 == null ? null : local31.aClass166_1;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		if (this.lb == null) {
			this.lb = Static268.method4930(super.anInt10303, this.method8632(arg0, 0), super.anInt10310, super.anInt10306);
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return 22;
	}
}
