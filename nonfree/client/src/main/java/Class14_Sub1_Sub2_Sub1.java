import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class14_Sub1_Sub2_Sub1 extends Class14_Sub1_Sub2 implements Interface20 {

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lclient!ck;")
	private Class55 aClass55_5;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "Z")
	private final boolean aBoolean557;

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!nq", name = "cb", descriptor = "S")
	private final short aShort96;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!nq", name = "sb", descriptor = "Z")
	private final boolean aBoolean560;

	@OriginalMember(owner = "client!nq", name = "gb", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!nq", name = "db", descriptor = "Lclient!r;")
	private Class5_Sub4_Sub10 aClass5_Sub4_Sub10_6;

	@OriginalMember(owner = "client!nq", name = "mb", descriptor = "Lclient!ka;")
	private Class180 aClass180_7;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIIII)V")
	public Class14_Sub1_Sub2_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean557 = arg1.anInt7843 != 0 && !arg7;
		this.aByte93 = (byte) arg10;
		this.aShort96 = (short) arg1.anInt7807;
		super.anInt9317 = arg4;
		this.aByte94 = (byte) arg11;
		super.anInt9315 = arg6;
		this.aBoolean560 = arg7;
		this.aBoolean559 = arg0.method7034() && arg1.aBoolean650 && !this.aBoolean560 && Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() != 0;
		@Pc(73) Class120 local73 = this.method5946(arg0, 2048, this.aBoolean559);
		if (local73 != null) {
			this.aClass5_Sub4_Sub10_6 = local73.aClass5_Sub4_Sub10_4;
			this.aClass180_7 = local73.aClass180_4;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aByte93;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		@Pc(29) Class5_Sub4_Sub10 local29;
		if (this.aClass5_Sub4_Sub10_6 == null && this.aBoolean559) {
			@Pc(22) Class120 local22 = this.method5946(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass5_Sub4_Sub10_4;
		} else {
			local29 = this.aClass5_Sub4_Sub10_6;
			this.aClass5_Sub4_Sub10_6 = null;
		}
		if (local29 != null) {
			Static342.method5250(local29, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
		if (this.aClass180_7 != null) {
			this.aClass180_7.method7944();
		}
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 < 81) {
			Static383.aClass346_5 = null;
		}
		return this.aClass180_7 == null ? 0 : this.aClass180_7.ma();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass180_7 == null) {
			return null;
		}
		@Pc(18) Class117 local18 = arg0.method7018();
		local18.method7244(super.anInt9317 + super.aShort106, super.anInt9321, super.aShort105 + super.anInt9315);
		@Pc(39) Class14_Sub10 local39 = Static443.method6589(this.aBoolean557, 1);
		if (Static605.aBoolean812) {
			this.aClass180_7.method7950(local18, local39.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			this.aClass180_7.method7949(local18, local39.aClass14_Sub9Array1[0], 0);
		}
		return local39;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		@Pc(18) Class5_Sub4_Sub10 local18;
		if (this.aClass5_Sub4_Sub10_6 == null && this.aBoolean559) {
			@Pc(29) Class120 local29 = this.method5946(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass5_Sub4_Sub10_4;
		} else {
			local18 = this.aClass5_Sub4_Sub10_6;
			this.aClass5_Sub4_Sub10_6 = null;
		}
		if (local18 != null) {
			Static574.method8137(local18, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		if (this.aClass55_5 == null) {
			this.aClass55_5 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, this.method5944(0, arg0));
		}
		return this.aClass55_5;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aShort96 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aClass180_7 == null ? false : this.aClass180_7.F();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class180 method5944(@OriginalArg(1) int arg0, @OriginalArg(2) Class126 arg1) {
		if (this.aClass180_7 != null && arg1.method6985(this.aClass180_7.ua(), arg0) == 0) {
			return this.aClass180_7;
		} else {
			@Pc(32) Class120 local32 = this.method5946(arg1, arg0, false);
			return local32 == null ? null : local32.aClass180_4;
		}
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass180_7 == null ? 0 : this.aClass180_7.fa();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aBoolean559;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;BIZ)Lclient!ga;")
	private Class120 method5946(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class283 local13 = Static525.aClass371_4.method8554(this.aShort96 & 0xFFFF);
		@Pc(30) Class40 local30;
		@Pc(25) Class40 local25;
		if (this.aBoolean560) {
			local25 = Static492.aClass40Array3[0];
			local30 = Static327.aClass40Array2[super.aByte126];
		} else {
			if (super.aByte126 >= 3) {
				local25 = null;
			} else {
				local25 = Static492.aClass40Array3[super.aByte126 + 1];
			}
			local30 = Static492.aClass40Array3[super.aByte126];
		}
		return local13.method6846(this.aByte94, arg2, (Class35) null, arg1, super.anInt9321, arg0, super.anInt9315, this.aByte93, super.anInt9317, local30, local25);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class180 local16 = this.method5944(131072, arg0);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class117 local21 = arg0.method7018();
			local21.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local16.method7929(arg2, arg1, local21, false, 0, Static461.anInt7840) : local16.method7946(arg2, arg1, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		if (this.aClass180_7 == null) {
			return true;
		} else {
			return !this.aClass180_7.r();
		}
	}
}
