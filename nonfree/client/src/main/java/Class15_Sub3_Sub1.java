import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class15_Sub3_Sub1 extends Class15_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!cfa", name = "W", descriptor = "Lclient!ac;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!cfa", name = "Q", descriptor = "Z")
	private final boolean aBoolean80;

	@OriginalMember(owner = "client!cfa", name = "R", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!cfa", name = "S", descriptor = "Z")
	private final boolean aBoolean81;

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!cfa", name = "z", descriptor = "S")
	private final short aShort15;

	@OriginalMember(owner = "client!cfa", name = "H", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!cfa", name = "M", descriptor = "Z")
	private final boolean aBoolean79;

	@OriginalMember(owner = "client!cfa", name = "u", descriptor = "Lclient!w;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_2;

	@OriginalMember(owner = "client!cfa", name = "x", descriptor = "Lclient!ba;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIZIZ)V")
	public Class15_Sub3_Sub1(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt5578, arg1.aBoolean391, arg1.aBoolean392);
		super.anInt7821 = arg3;
		this.aBoolean80 = arg6;
		super.anInt7817 = arg5;
		this.aByte9 = (byte) arg7;
		this.aBoolean81 = arg1.anInt5582 != 0 && !arg6;
		this.aBoolean78 = arg8;
		this.aShort15 = (short) arg1.anInt5600;
		this.aByte8 = (byte) arg2;
		this.aBoolean79 = arg0.method7466() && arg1.aBoolean388 && !this.aBoolean80 && Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean78) {
			local69 |= 0x10000;
		}
		@Pc(84) Class47 local84 = this.method952(local69, this.aBoolean79, arg0);
		if (local84 != null) {
			this.aClass6_Sub5_Sub10_2 = local84.aClass6_Sub5_Sub10_1;
			this.aClass24_3 = local84.aClass24_1;
			if (this.aBoolean78) {
				this.aClass24_3 = this.aClass24_3.method7398((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class24 local9 = this.method954(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class93 local14 = arg1.method7455();
			local14.GA(super.anInt7821, super.anInt7818, super.anInt7817);
			return local9.method7386(arg0, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		if (arg2 instanceof Class15_Sub3_Sub1) {
			@Pc(5) Class15_Sub3_Sub1 local5 = (Class15_Sub3_Sub1) arg2;
			if (this.aClass24_3 != null && local5.aClass24_3 != null) {
				this.aClass24_3.method7389(local5.aClass24_3, arg1, arg3, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
		if (this.aClass24_3 != null) {
			this.aClass24_3.method7401();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return 22;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.method954(arg1, arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZLclient!oa;I)Lclient!cda;")
	private Class47 method952(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class90 arg2) {
		@Pc(13) Class192 local13 = Static85.aClass27_1.method516(this.aShort15 & 0xFFFF);
		@Pc(21) Class46 local21;
		@Pc(29) Class46 local29;
		if (this.aBoolean80) {
			local21 = Static480.aClass46Array2[this.aByte8];
			local29 = Static496.aClass46Array4[0];
		} else {
			local21 = Static496.aClass46Array4[this.aByte8];
			if (this.aByte8 >= 3) {
				local29 = null;
			} else {
				local29 = Static496.aClass46Array4[this.aByte8 + 1];
			}
		}
		return local13.method4593(arg0, local29, super.anInt7818, 22, local21, super.anInt7817, arg1, super.anInt7821, this.aByte9, arg2);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aShort15 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		if (this.aClass4_1 == null) {
			this.aClass4_1 = Static171.method7159(super.anInt7821, super.anInt7818, this.method954(arg0, 0), super.anInt7817);
		}
		return this.aClass4_1;
	}

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return this.aBoolean78;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass24_3 == null) {
			return null;
		}
		@Pc(11) Class93 local11 = arg0.method7455();
		local11.GA(super.anInt7821, super.anInt7818, super.anInt7817);
		@Pc(21) Class60_Sub8 local21 = null;
		if (this.aBoolean81) {
			local21 = Static191.method3243(1);
		}
		this.aClass24_3.method7393(local11, local21 == null ? null : local21.aClass60_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_2 == null && this.aBoolean79) {
			@Pc(25) Class47 local25 = this.method952(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_1;
		} else {
			local14 = this.aClass6_Sub5_Sub10_2;
			this.aClass6_Sub5_Sub10_2 = null;
		}
		if (local14 != null) {
			Static156.method2461(local14, this.aByte8, super.anInt7821, super.anInt7817, null);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		this.aBoolean78 = false;
		if (this.aClass24_3 != null) {
			this.aClass24_3.ia(this.aClass24_3.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class24 method954(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_3 != null && arg0.method7505(this.aClass24_3.h(), arg1) == 0) {
			return this.aClass24_3;
		} else {
			@Pc(30) Class47 local30 = this.method952(arg1, false, arg0);
			return local30 == null ? null : local30.aClass24_1;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aBoolean79;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		@Pc(29) Class6_Sub5_Sub10 local29;
		if (this.aClass6_Sub5_Sub10_2 == null && this.aBoolean79) {
			@Pc(22) Class47 local22 = this.method952(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass6_Sub5_Sub10_1;
		} else {
			local29 = this.aClass6_Sub5_Sub10_2;
			this.aClass6_Sub5_Sub10_2 = null;
		}
		if (local29 != null) {
			Static485.method6822(local29, this.aByte8, super.anInt7821, super.anInt7817, null);
		}
	}
}
