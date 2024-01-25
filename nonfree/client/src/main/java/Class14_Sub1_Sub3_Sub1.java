import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class14_Sub1_Sub3_Sub1 extends Class14_Sub1_Sub3 implements Interface20 {

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "Lclient!ck;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!eca", name = "pb", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!eca", name = "qb", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!eca", name = "P", descriptor = "Z")
	private final boolean aBoolean143;

	@OriginalMember(owner = "client!eca", name = "T", descriptor = "Z")
	private boolean aBoolean144;

	@OriginalMember(owner = "client!eca", name = "Y", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!eca", name = "cb", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!eca", name = "U", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!eca", name = "ob", descriptor = "Lclient!ka;")
	public Class180 aClass180_2;

	@OriginalMember(owner = "client!eca", name = "L", descriptor = "Lclient!r;")
	private Class5_Sub4_Sub10 aClass5_Sub4_Sub10_2;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIIZ)V")
	public Class14_Sub1_Sub3_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static630.method8728(arg9, arg8));
		this.aByte28 = (byte) arg8;
		super.anInt9315 = arg6;
		this.aShort26 = (short) arg1.anInt7807;
		super.anInt9317 = arg4;
		this.aBoolean143 = arg1.anInt7843 != 0 && !arg7;
		this.aBoolean144 = arg10;
		this.aByte27 = (byte) arg9;
		this.aBoolean146 = arg7;
		this.aBoolean145 = arg0.method7034() && arg1.aBoolean650 && !this.aBoolean146 && Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean144) {
			local72 |= 0x10000;
		}
		@Pc(87) Class120 local87 = this.method1727(arg0, this.aBoolean145, local72);
		if (local87 != null) {
			this.aClass180_2 = local87.aClass180_4;
			this.aClass5_Sub4_Sub10_2 = local87.aClass5_Sub4_Sub10_4;
			if (this.aBoolean144) {
				this.aClass180_2 = this.aClass180_2.method7945((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 <= 81) {
			return 81;
		} else if (this.aClass180_2 == null) {
			return 0;
		} else {
			return this.aClass180_2.ma();
		}
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return this.aBoolean144;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		if (this.aClass55_2 == null) {
			this.aClass55_2 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, this.method1730(arg0, 0));
		}
		return this.aClass55_2;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!ga;")
	private Class120 method1727(@OriginalArg(0) Class126 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class283 local13 = Static525.aClass371_4.method8554(this.aShort26 & 0xFFFF);
		@Pc(41) Class40 local41;
		@Pc(32) Class40 local32;
		if (this.aBoolean146) {
			local41 = Static327.aClass40Array2[super.aByte126];
			local32 = Static492.aClass40Array3[0];
		} else {
			if (super.aByte126 < 3) {
				local32 = Static492.aClass40Array3[super.aByte126 + 1];
			} else {
				local32 = null;
			}
			local41 = Static492.aClass40Array3[super.aByte126];
		}
		return local13.method6846(this.aByte27, arg1, (Class35) null, arg2, super.anInt9321, arg0, super.anInt9315, this.aByte28, super.anInt9317, local41, local32);
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		if (this.aClass180_2 == null) {
			return true;
		} else {
			return !this.aClass180_2.r();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		@Pc(14) Class5_Sub4_Sub10 local14;
		if (this.aClass5_Sub4_Sub10_2 == null && this.aBoolean145) {
			@Pc(25) Class120 local25 = this.method1727(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass5_Sub4_Sub10_4;
		} else {
			local14 = this.aClass5_Sub4_Sub10_2;
			this.aClass5_Sub4_Sub10_2 = null;
		}
		if (local14 != null) {
			Static342.method5250(local14, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		this.aBoolean144 = false;
		if (this.aClass180_2 != null) {
			this.aClass180_2.s(this.aClass180_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass180_2 == null) {
			return null;
		}
		@Pc(11) Class117 local11 = arg0.method7018();
		local11.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(31) Class14_Sub10 local31 = Static443.method6589(this.aBoolean143, 1);
		if (Static605.aBoolean812) {
			this.aClass180_2.method7950(local11, local31.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			this.aClass180_2.method7949(local11, local31.aClass14_Sub9Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		@Pc(18) Class5_Sub4_Sub10 local18;
		if (this.aClass5_Sub4_Sub10_2 == null && this.aBoolean145) {
			@Pc(29) Class120 local29 = this.method1727(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass5_Sub4_Sub10_4;
		} else {
			local18 = this.aClass5_Sub4_Sub10_2;
			this.aClass5_Sub4_Sub10_2 = null;
		}
		if (local18 != null) {
			Static574.method8137(local18, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aBoolean145;
	}

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass180_2 == null ? 0 : this.aClass180_2.fa();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
		if (this.aClass180_2 != null) {
			this.aClass180_2.method7944();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class14_Sub1_Sub3_Sub1) {
			@Pc(9) Class14_Sub1_Sub3_Sub1 local9 = (Class14_Sub1_Sub3_Sub1) arg0;
			if (this.aClass180_2 != null && local9.aClass180_2 != null) {
				this.aClass180_2.method7937(local9.aClass180_2, arg2, arg5, arg3, arg4);
			}
		} else if (arg0 instanceof Class14_Sub1_Sub1_Sub1) {
			@Pc(32) Class14_Sub1_Sub1_Sub1 local32 = (Class14_Sub1_Sub1_Sub1) arg0;
			if (this.aClass180_2 != null && local32.aClass180_1 != null) {
				this.aClass180_2.method7937(local32.aClass180_1, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class180 method1730(@OriginalArg(1) Class126 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass180_2 != null && arg0.method6985(this.aClass180_2.ua(), arg1) == 0) {
			return this.aClass180_2;
		} else {
			@Pc(23) Class120 local23 = this.method1727(arg0, false, arg1);
			return local23 == null ? null : local23.aClass180_4;
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aByte27;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class180 local16 = this.method1730(arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class117 local21 = arg0.method7018();
			local21.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local16.method7929(arg2, arg1, local21, false, 0, Static461.anInt7840) : local16.method7946(arg2, arg1, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aClass180_2 == null ? false : this.aClass180_2.F();
	}
}
