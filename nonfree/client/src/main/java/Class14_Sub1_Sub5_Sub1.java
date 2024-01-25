import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class14_Sub1_Sub5_Sub1 extends Class14_Sub1_Sub5 implements Interface20 {

	@OriginalMember(owner = "client!et", name = "Y", descriptor = "Lclient!ck;")
	private Class55 aClass55_3;

	@OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!et", name = "ab", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!et", name = "cb", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "Z")
	private final boolean aBoolean185;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "Z")
	private final boolean aBoolean186;

	@OriginalMember(owner = "client!et", name = "kb", descriptor = "Lclient!r;")
	private Class5_Sub4_Sub10 aClass5_Sub4_Sub10_3;

	@OriginalMember(owner = "client!et", name = "eb", descriptor = "Lclient!ka;")
	private Class180 aClass180_3;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ha;Lclient!qfa;IIIIIZIZ)V")
	public Class14_Sub1_Sub5_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt7814);
		this.aBoolean188 = arg7;
		this.aByte40 = (byte) arg8;
		super.anInt9315 = arg6;
		super.anInt9317 = arg4;
		this.aBoolean187 = arg9;
		this.aShort33 = (short) arg1.anInt7807;
		this.aBoolean185 = arg1.anInt7843 != 0 && !arg7;
		this.aBoolean186 = arg0.method7034() && arg1.aBoolean650 && !this.aBoolean188 && Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean187) {
			local63 |= 0x10000;
		}
		@Pc(78) Class120 local78 = this.method2070(local63, this.aBoolean186, arg0);
		if (local78 != null) {
			this.aClass5_Sub4_Sub10_3 = local78.aClass5_Sub4_Sub10_4;
			this.aClass180_3 = local78.aClass180_4;
			if (this.aBoolean187) {
				this.aClass180_3 = this.aClass180_3.method7945((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8014() {
		return this.aBoolean186;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(I)I")
	@Override
	public int method8004() {
		return this.aClass180_3 == null ? 0 : this.aClass180_3.fa();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class180 local15 = this.method2069(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class117 local20 = arg0.method7018();
			local20.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
			return Static605.aBoolean812 ? local15.method7929(arg2, arg1, local20, false, 0, Static461.anInt7840) : local15.method7946(arg2, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(B)I")
	@Override
	public int method7991(@OriginalArg(0) byte arg0) {
		if (arg0 <= 81) {
			return 60;
		} else if (this.aClass180_3 == null) {
			return 0;
		} else {
			return this.aClass180_3.ma();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8011(@OriginalArg(1) Class126 arg0) {
		@Pc(29) Class5_Sub4_Sub10 local29;
		if (this.aClass5_Sub4_Sub10_3 == null && this.aBoolean186) {
			@Pc(22) Class120 local22 = this.method2070(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass5_Sub4_Sub10_4;
		} else {
			local29 = this.aClass5_Sub4_Sub10_3;
			this.aClass5_Sub4_Sub10_3 = null;
		}
		if (local29 != null) {
			Static342.method5250(local29, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7987() {
		return this.aClass180_3 == null ? false : this.aClass180_3.F();
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return this.aBoolean187;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8010(@OriginalArg(1) Class126 arg0) {
		@Pc(31) Class5_Sub4_Sub10 local31;
		if (this.aClass5_Sub4_Sub10_3 == null && this.aBoolean186) {
			@Pc(24) Class120 local24 = this.method2070(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass5_Sub4_Sub10_4;
		} else {
			local31 = this.aClass5_Sub4_Sub10_3;
			this.aClass5_Sub4_Sub10_3 = null;
		}
		if (local31 != null) {
			Static574.method8137(local31, super.aByte126, super.anInt9317, super.anInt9315, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class180 method2069(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass180_3 != null && arg0.method6985(this.aClass180_3.ua(), arg1) == 0) {
			return this.aClass180_3;
		} else {
			@Pc(28) Class120 local28 = this.method2070(arg1, false, arg0);
			return local28 == null ? null : local28.aClass180_4;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 instanceof Class14_Sub1_Sub5_Sub1) {
			@Pc(12) Class14_Sub1_Sub5_Sub1 local12 = (Class14_Sub1_Sub5_Sub1) arg0;
			if (this.aClass180_3 != null && local12.aClass180_3 != null) {
				this.aClass180_3.method7937(local12.aClass180_3, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)I")
	@Override
	public int method8012() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	@Override
	public int method8009() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(B)I")
	@Override
	public int method8015() {
		return 22;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass180_3 == null) {
			return null;
		}
		@Pc(16) Class117 local16 = arg0.method7018();
		local16.method7244(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(30) Class14_Sub10 local30 = Static443.method6589(this.aBoolean185, 1);
		if (Static605.aBoolean812) {
			this.aClass180_3.method7950(local16, local30.aClass14_Sub9Array1[0], Static461.anInt7840, 0);
		} else {
			this.aClass180_3.method7949(local16, local30.aClass14_Sub9Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZLclient!ha;I)Lclient!ga;")
	private Class120 method2070(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class126 arg2) {
		@Pc(19) Class283 local19 = Static525.aClass371_4.method8554(this.aShort33 & 0xFFFF);
		@Pc(42) Class40 local42;
		@Pc(33) Class40 local33;
		if (this.aBoolean188) {
			local33 = Static492.aClass40Array3[0];
			local42 = Static327.aClass40Array2[super.aByte126];
		} else {
			if (super.aByte126 < 3) {
				local33 = Static492.aClass40Array3[super.aByte126 + 1];
			} else {
				local33 = null;
			}
			local42 = Static492.aClass40Array3[super.aByte126];
		}
		return local19.method6846(this.aByte40, arg1, (Class35) null, arg0, super.anInt9321, arg2, super.anInt9315, 22, super.anInt9317, local42, local33);
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		this.aBoolean187 = false;
		if (this.aClass180_3 != null) {
			this.aClass180_3.s(this.aClass180_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7998() {
		if (this.aClass180_3 == null) {
			return true;
		} else {
			return !this.aClass180_3.r();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		if (this.aClass55_3 == null) {
			this.aClass55_3 = Static182.method2929(super.anInt9315, super.anInt9317, super.anInt9321, this.method2069(arg0, 0));
		}
		return this.aClass55_3;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	@Override
	public void method8013() {
		if (this.aClass180_3 != null) {
			this.aClass180_3.method7944();
		}
	}
}
