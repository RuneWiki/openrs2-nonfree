import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class14_Sub1_Sub1_Sub1 extends Class14_Sub1_Sub1 implements Interface20 {

	@OriginalMember(owner = "client!ah", name = "sb", descriptor = "Lclient!ck;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!ah", name = "S", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!ah", name = "xb", descriptor = "Z")
	private final boolean aBoolean29;

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "S")
	private final short aShort13;

	@OriginalMember(owner = "client!ah", name = "jb", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!ah", name = "ib", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!ah", name = "ob", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lclient!r;")
	private Class5_Sub4_Sub10 aClass5_Sub4_Sub10_1;

	@OriginalMember(owner = "client!ah", name = "mb", descriptor = "Lclient!ka;")
	public Class180 aClass180_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIIIIIIZ)V")
	public Class14_Sub1_Sub1_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7801 == 1, Static444.method6597(arg13, arg12));
		this.aBoolean26 = arg14;
		super.aByte126 = (byte) arg3;
		this.aBoolean27 = arg7;
		this.aBoolean29 = arg1.anInt7843 != 0 && !arg7;
		this.aShort13 = (short) arg1.anInt7807;
		this.aByte14 = (byte) arg13;
		this.aByte13 = (byte) arg12;
		this.aBoolean28 = arg0.method7034() && arg1.aBoolean650 && !this.aBoolean27 && Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean26) {
			local80 |= 0x10000;
		}
		@Pc(95) Class120 local95 = this.method359(local80, this.aBoolean28, arg0);
		if (local95 != null) {
			this.aClass5_Sub4_Sub10_1 = local95.aClass5_Sub4_Sub10_4;
			this.aClass180_1 = local95.aClass180_4;
			if (this.aBoolean26) {
				this.aClass180_1 = this.aClass180_1.method7945((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		if (this.aClass55_1 == null) {
			this.aClass55_1 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, this.method362(arg0, 0));
		}
		return this.aClass55_1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aBoolean28;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZLclient!ha;I)Lclient!ga;")
	private Class120 method359(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class126 arg2) {
		@Pc(13) Class283 local13 = Static525.aClass371_4.method8554(this.aShort13 & 0xFFFF);
		@Pc(38) Class40 local38;
		@Pc(29) Class40 local29;
		if (this.aBoolean27) {
			local38 = Static327.aClass40Array2[super.aByte126];
			local29 = Static492.aClass40Array3[0];
		} else {
			if (super.aByte126 < 3) {
				local29 = Static492.aClass40Array3[super.aByte126 + 1];
			} else {
				local29 = null;
			}
			local38 = Static492.aClass40Array3[super.aByte126];
		}
		return local13.method6846(this.aByte13 == 11 ? this.aByte14 + 4 : this.aByte14, arg1, (Class35) null, arg0, super.anInt9321, arg2, super.anInt9315, this.aByte13 == 11 ? 10 : this.aByte13, super.anInt9317, local38, local29);
	}

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass180_1 == null ? 0 : this.aClass180_1.fa();
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aClass180_1 == null ? false : this.aClass180_1.F();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class180 local18 = this.method362(arg0, 131072);
		if (local18 == null) {
			return false;
		} else {
			@Pc(23) Class117 local23 = arg0.method7018();
			local23.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local18.method7929(arg2, arg1, local23, false, 0, Static461.anInt7840) : local18.method7946(arg2, arg1, local23, false, 0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
		if (this.aClass180_1 != null) {
			this.aClass180_1.method7944();
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aShort13 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return this.aBoolean26;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class14_Sub1_Sub3_Sub1) {
			@Pc(11) Class14_Sub1_Sub3_Sub1 local11 = (Class14_Sub1_Sub3_Sub1) arg0;
			if (this.aClass180_1 != null && local11.aClass180_2 != null) {
				this.aClass180_1.method7937(local11.aClass180_2, arg2, arg5, arg3, arg4);
			}
		} else if (arg0 instanceof Class14_Sub1_Sub1_Sub1) {
			@Pc(34) Class14_Sub1_Sub1_Sub1 local34 = (Class14_Sub1_Sub1_Sub1) arg0;
			if (this.aClass180_1 != null && local34.aClass180_1 != null) {
				this.aClass180_1.method7937(local34.aClass180_1, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "(I)I")
	public int method361() {
		return this.aClass180_1 == null ? 15 : this.aClass180_1.na() / 4;
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		this.aBoolean26 = false;
		if (this.aClass180_1 != null) {
			this.aClass180_1.s(this.aClass180_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		@Pc(33) Class5_Sub4_Sub10 local33;
		if (this.aClass5_Sub4_Sub10_1 == null && this.aBoolean28) {
			@Pc(26) Class120 local26 = this.method359(262144, true, arg0);
			local33 = local26 == null ? null : local26.aClass5_Sub4_Sub10_4;
		} else {
			local33 = this.aClass5_Sub4_Sub10_1;
			this.aClass5_Sub4_Sub10_1 = null;
		}
		if (local33 != null) {
			Static574.method8137(local33, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		if (this.aClass180_1 == null) {
			return true;
		} else {
			return !this.aClass180_1.r();
		}
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 <= 81) {
			this.aBoolean28 = false;
		}
		return this.aClass180_1 == null ? 0 : this.aClass180_1.ma();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		@Pc(25) Class5_Sub4_Sub10 local25;
		if (this.aClass5_Sub4_Sub10_1 == null && this.aBoolean28) {
			@Pc(18) Class120 local18 = this.method359(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub4_Sub10_4;
		} else {
			local25 = this.aClass5_Sub4_Sub10_1;
			this.aClass5_Sub4_Sub10_1 = null;
		}
		if (local25 != null) {
			Static342.method5250(local25, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class180 method362(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass180_1 != null && arg0.method6985(this.aClass180_1.ua(), arg1) == 0) {
			return this.aClass180_1;
		} else {
			@Pc(34) Class120 local34 = this.method359(arg1, false, arg0);
			return local34 == null ? null : local34.aClass180_4;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass180_1 == null) {
			return null;
		}
		@Pc(11) Class117 local11 = arg0.method7018();
		local11.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(25) Class14_Sub10 local25 = Static443.method6589(this.aBoolean29, 1);
		if (Static605.aBoolean812) {
			this.aClass180_1.method7950(local11, local25.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			this.aClass180_1.method7949(local11, local25.aClass14_Sub9Array1[0], 0);
		}
		return local25;
	}
}
