import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class14_Sub1_Sub1_Sub4 extends Class14_Sub1_Sub1 {

	@OriginalMember(owner = "client!go", name = "fb", descriptor = "Lclient!l;")
	private Class14_Sub8 aClass14_Sub8_5;

	@OriginalMember(owner = "client!go", name = "ab", descriptor = "I")
	private int anInt3418 = 0;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	private int anInt3412 = 0;

	@OriginalMember(owner = "client!go", name = "db", descriptor = "I")
	private int anInt3420 = 0;

	@OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
	private boolean aBoolean283 = true;

	@OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
	private int anInt3417 = 0;

	@OriginalMember(owner = "client!go", name = "pb", descriptor = "I")
	private final int anInt3429 = -1;

	@OriginalMember(owner = "client!go", name = "lb", descriptor = "Z")
	public boolean lb = false;

	@OriginalMember(owner = "client!go", name = "wb", descriptor = "I")
	private int anInt3435 = 0;

	@OriginalMember(owner = "client!go", name = "ib", descriptor = "I")
	private int anInt3424;

	@OriginalMember(owner = "client!go", name = "hb", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!go", name = "sb", descriptor = "Lclient!la;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class14_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3424 = arg0;
		this.anInt3420 = arg12;
		this.anInt3423 = arg2 + arg1;
		@Pc(54) Class68 local54 = Static452.aClass170_4.method4001(this.anInt3424);
		@Pc(57) int local57 = local54.anInt1416;
		if (local57 == -1) {
			this.lb = true;
		} else {
			this.aClass200_2 = Static396.aClass359_2.method8415(local57);
			this.lb = false;
		}
		if (this.anInt3423 == arg2) {
			Static270.method4083(this.aClass200_2, this.anInt3412, this);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)V")
	public void method3037(@OriginalArg(1) int arg0) {
		if (this.lb) {
			return;
		}
		this.anInt3435 += arg0;
		while (this.aClass200_2.anIntArray388[this.anInt3412] < this.anInt3435) {
			this.anInt3435 -= this.aClass200_2.anIntArray388[this.anInt3412];
			this.anInt3412++;
			if (this.anInt3412 >= this.aClass200_2.anIntArray389.length) {
				this.lb = true;
				break;
			}
		}
		if (!this.lb) {
			Static270.method4083(this.aClass200_2, this.anInt3412, this);
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		@Pc(23) Class180 local23 = this.method3039((this.anInt3420 == 0 ? 0 : 5) | 0x800, arg0, this.anInt3424);
		if (local23 == null) {
			return null;
		}
		if (this.anInt3420 != 0) {
			local23.a(this.anInt3420 * 2048);
		}
		@Pc(39) Class117 local39 = arg0.method7018();
		local39.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		this.method3040(arg0, local39, local23);
		@Pc(58) Class14_Sub10 local58 = Static443.method6589(false, 1);
		if (Static605.aBoolean812) {
			local23.method7950(local39, local58.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			local23.method7949(local39, local58.aClass14_Sub9Array1[0], 0);
		}
		if (this.aClass14_Sub8_5 != null) {
			@Pc(86) Class345 local86 = this.aClass14_Sub8_5.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local86, Static461.anInt7840);
			} else {
				arg0.method7058(local86);
			}
		}
		this.aBoolean283 = local23.F();
		this.anInt3418 = local23.fa();
		this.anInt3417 = local23.ma();
		return local58;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public void method3038() {
		if (this.aClass14_Sub8_5 != null) {
			this.aClass14_Sub8_5.method4450();
		}
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!ha;II)Lclient!ka;")
	private Class180 method3039(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class68 local8 = Static452.aClass170_4.method4001(arg2);
		@Pc(13) Class40 local13 = Static492.aClass40Array3[super.aByte125];
		@Pc(28) Class40 local28 = super.aByte126 >= 3 ? null : Static492.aClass40Array3[super.aByte126 + 1];
		return this.lb ? local8.method1353(super.anInt9315, local28, arg0, Static396.aClass359_2, -1, arg1, local13, -1, 0, super.anInt9317, super.anInt9321) : local8.method1353(super.anInt9315, local28, arg0, Static396.aClass359_2, this.anInt3412, arg1, local13, this.anInt3429, this.anInt3435, super.anInt9317, super.anInt9321);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLclient!ha;Lclient!ofa;Lclient!ka;)V")
	private void method3040(@OriginalArg(1) Class126 arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) Class180 arg2) {
		arg2.method7951(arg1);
		@Pc(15) Class57[] local15 = arg2.method7940();
		@Pc(18) Class143[] local18 = arg2.method7935();
		if ((this.aClass14_Sub8_5 == null || this.aClass14_Sub8_5.aBoolean397) && (local15 != null || local18 != null)) {
			this.aClass14_Sub8_5 = Static307.method4460(Static235.anInt3998, true);
		}
		if (this.aClass14_Sub8_5 != null) {
			this.aClass14_Sub8_5.method4456(arg0, (long) Static235.anInt3998, local15, local18);
			this.aClass14_Sub8_5.method4447(super.aByte125, super.aShort74, super.aShort73, super.aShort71, super.aShort72);
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		@Pc(11) Class180 local11 = this.method3039(0, arg0, this.anInt3424);
		if (local11 != null) {
			@Pc(16) Class117 local16 = arg0.method7018();
			local16.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			this.method3040(arg0, local16, local11);
		}
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass14_Sub8_5 != null) {
			this.aClass14_Sub8_5.method4450();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 <= 81) {
			this.anInt3424 = -36;
		}
		return this.anInt3417;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.anInt3418;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return null;
	}
}
