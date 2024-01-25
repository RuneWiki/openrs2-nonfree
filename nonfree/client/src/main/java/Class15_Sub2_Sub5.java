import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class15_Sub2_Sub5 extends Class15_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!ow", name = "G", descriptor = "Lclient!ac;")
	private Class4 aClass4_6;

	@OriginalMember(owner = "client!ow", name = "J", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!ow", name = "V", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!ow", name = "w", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!ow", name = "Z", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!ow", name = "U", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!ow", name = "I", descriptor = "B")
	private final byte aByte80;

	@OriginalMember(owner = "client!ow", name = "X", descriptor = "Z")
	private final boolean aBoolean483;

	@OriginalMember(owner = "client!ow", name = "S", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "Lclient!ba;")
	public Class24 aClass24_6;

	@OriginalMember(owner = "client!ow", name = "P", descriptor = "Lclient!w;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_5;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIIZIIIIIIZ)V")
	public Class15_Sub2_Sub5(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5622 == 1, Static382.method5592(arg13, arg12));
		this.aBoolean481 = arg7;
		this.aByte82 = (byte) arg13;
		this.aShort93 = (short) arg1.anInt5600;
		this.aBoolean484 = arg14;
		this.aByte81 = (byte) arg3;
		this.aByte80 = (byte) arg12;
		this.aBoolean483 = arg1.anInt5582 != 0 && !arg7;
		this.aBoolean482 = arg0.method7466() && arg1.aBoolean388 && !this.aBoolean481 && Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) != 0;
		@Pc(76) int local76 = 2048;
		if (this.aBoolean484) {
			local76 |= 0x10000;
		}
		@Pc(91) Class47 local91 = this.method5634(arg0, local76, this.aBoolean482);
		if (local91 != null) {
			this.aClass24_6 = local91.aClass24_1;
			this.aClass6_Sub5_Sub10_5 = local91.aClass6_Sub5_Sub10_1;
			if (this.aBoolean484) {
				this.aClass24_6 = this.aClass24_6.method7398((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
		if (this.aClass24_6 != null) {
			this.aClass24_6.method7401();
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.method5635(arg0, arg1);
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		@Pc(20) Class6_Sub5_Sub10 local20;
		if (this.aClass6_Sub5_Sub10_5 == null && this.aBoolean482) {
			@Pc(33) Class47 local33 = this.method5634(arg0, 262144, true);
			local20 = local33 == null ? null : local33.aClass6_Sub5_Sub10_1;
		} else {
			local20 = this.aClass6_Sub5_Sub10_5;
			this.aClass6_Sub5_Sub10_5 = null;
		}
		if (local20 != null) {
			Static156.method2461(local20, this.aByte81, super.anInt8911, super.anInt8913, null);
		}
	}

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aByte80;
	}

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return this.aBoolean484;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass24_6 == null) {
			return null;
		}
		@Pc(11) Class93 local11 = arg0.method7455();
		local11.GA(super.anInt8911, super.anInt8915, super.anInt8913);
		@Pc(21) Class60_Sub8 local21 = null;
		if (this.aBoolean483) {
			local21 = Static191.method3243(1);
		}
		this.aClass24_6.method7393(local11, local21 == null ? null : local21.aClass60_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class24 local9 = this.method5635(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class93 local14 = arg1.method7455();
			local14.GA(super.anInt8911, super.anInt8915, super.anInt8913);
			return local9.method7386(arg0, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return this.aClass24_6 == null ? 0 : this.aClass24_6.DA();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_5 == null && this.aBoolean482) {
			@Pc(25) Class47 local25 = this.method5634(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_1;
		} else {
			local14 = this.aClass6_Sub5_Sub10_5;
			this.aClass6_Sub5_Sub10_5 = null;
		}
		if (local14 != null) {
			Static485.method6822(local14, this.aByte81, super.anInt8911, super.anInt8913, null);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		this.aBoolean484 = false;
		if (this.aClass24_6 != null) {
			this.aClass24_6.ia(this.aClass24_6.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aBoolean482;
	}

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "(I)I")
	public int method5633() {
		return this.aClass24_6 == null ? 15 : this.aClass24_6.ZA() / 4;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		if (arg2 instanceof Class15_Sub1_Sub1) {
			@Pc(32) Class15_Sub1_Sub1 local32 = (Class15_Sub1_Sub1) arg2;
			if (this.aClass24_6 != null && local32.aClass24_4 != null) {
				this.aClass24_6.method7389(local32.aClass24_4, arg1, arg3, arg0, arg4);
			}
		} else if (arg2 instanceof Class15_Sub2_Sub5) {
			@Pc(12) Class15_Sub2_Sub5 local12 = (Class15_Sub2_Sub5) arg2;
			if (this.aClass24_6 != null && local12.aClass24_6 != null) {
				this.aClass24_6.method7389(local12.aClass24_6, arg1, arg3, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oa;IIZ)Lclient!cda;")
	private Class47 method5634(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class192 local18 = Static85.aClass27_1.method516(this.aShort93 & 0xFFFF);
		@Pc(30) Class46 local30;
		@Pc(25) Class46 local25;
		if (this.aBoolean481) {
			local25 = Static496.aClass46Array4[0];
			local30 = Static480.aClass46Array2[this.aByte81];
		} else {
			local30 = Static496.aClass46Array4[this.aByte81];
			if (this.aByte81 >= 3) {
				local25 = null;
			} else {
				local25 = Static496.aClass46Array4[this.aByte81 + 1];
			}
		}
		return local18.method4593(arg1, local25, super.anInt8915, this.aByte80 == 11 ? 10 : this.aByte80, local30, super.anInt8913, arg2, super.anInt8911, this.aByte80 == 11 ? this.aByte82 + 4 : this.aByte82, arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		if (this.aClass4_6 == null) {
			this.aClass4_6 = Static171.method7159(super.anInt8911, super.anInt8915, this.method5635(0, arg0), super.anInt8913);
		}
		return this.aClass4_6;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(IILclient!oa;)Lclient!ba;")
	private Class24 method5635(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1) {
		if (this.aClass24_6 != null && arg1.method7505(this.aClass24_6.h(), arg0) == 0) {
			return this.aClass24_6;
		} else {
			@Pc(26) Class47 local26 = this.method5634(arg1, arg0, false);
			return local26 == null ? null : local26.aClass24_1;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aShort93 & 0xFFFF;
	}
}
