import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class15_Sub4_Sub1 extends Class15_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "Lclient!ac;")
	private Class4 aClass4_4;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!kl", name = "T", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
	private final boolean aBoolean354;

	@OriginalMember(owner = "client!kl", name = "R", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "Lclient!w;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_4;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "Lclient!ba;")
	private Class24 aClass24_5;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIZIIIII)V")
	public Class15_Sub4_Sub1(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static538.method7332(arg10, arg11));
		this.aShort73 = (short) arg1.anInt5600;
		this.aBoolean355 = arg1.anInt5582 != 0 && !arg6;
		this.aByte56 = (byte) arg2;
		super.anInt9048 = arg3;
		this.aByte58 = (byte) arg10;
		this.aByte57 = (byte) arg11;
		super.anInt9052 = arg5;
		this.aBoolean354 = arg6;
		this.aBoolean356 = arg0.method7466() && arg1.aBoolean388 && !this.aBoolean354 && Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) != 0;
		@Pc(80) Class47 local80 = this.method4089(arg0, this.aBoolean356, 2048);
		if (local80 != null) {
			this.aClass6_Sub5_Sub10_4 = local80.aClass6_Sub5_Sub10_1;
			this.aClass24_5 = local80.aClass24_1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class24 method4088(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_5 != null && arg0.method7505(this.aClass24_5.h(), arg1) == 0) {
			return this.aClass24_5;
		} else {
			@Pc(28) Class47 local28 = this.method4089(arg0, false, arg1);
			return local28 == null ? null : local28.aClass24_1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aBoolean356;
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)I")
	@Override
	public int method7166() {
		return this.aClass24_5 == null ? 0 : this.aClass24_5.DA();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.method4088(arg1, arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!oa;ZBI)Lclient!cda;")
	private Class47 method4089(@OriginalArg(0) Class90 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class192 local17 = Static85.aClass27_1.method516(this.aShort73 & 0xFFFF);
		@Pc(29) Class46 local29;
		@Pc(24) Class46 local24;
		if (this.aBoolean354) {
			local24 = Static496.aClass46Array4[0];
			local29 = Static480.aClass46Array2[this.aByte56];
		} else {
			local29 = Static496.aClass46Array4[this.aByte56];
			if (this.aByte56 < 3) {
				local24 = Static496.aClass46Array4[this.aByte56 + 1];
			} else {
				local24 = null;
			}
		}
		return local17.method4593(arg2, local24, super.anInt9049, this.aByte58, local29, super.anInt9052, arg1, super.anInt9048, this.aByte57, arg0);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
		if (this.aClass24_5 != null) {
			this.aClass24_5.method7401();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_4 == null && this.aBoolean356) {
			@Pc(25) Class47 local25 = this.method4089(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_1;
		} else {
			local14 = this.aClass6_Sub5_Sub10_4;
			this.aClass6_Sub5_Sub10_4 = null;
		}
		if (local14 != null) {
			Static485.method6822(local14, this.aByte56, super.anInt9048, super.anInt9052, null);
		}
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass24_5 == null) {
			return null;
		}
		@Pc(11) Class93 local11 = arg0.method7455();
		local11.GA(super.anInt9048 + super.anInt9047, super.anInt9049, super.anInt9050 + super.anInt9052);
		@Pc(28) Class60_Sub8 local28 = null;
		if (this.aBoolean355) {
			local28 = Static191.method3243(1);
		}
		this.aClass24_5.method7393(local11, local28 == null ? null : local28.aClass60_Sub6Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		@Pc(14) Class6_Sub5_Sub10 local14;
		if (this.aClass6_Sub5_Sub10_4 == null && this.aBoolean356) {
			@Pc(25) Class47 local25 = this.method4089(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass6_Sub5_Sub10_1;
		} else {
			local14 = this.aClass6_Sub5_Sub10_4;
			this.aClass6_Sub5_Sub10_4 = null;
		}
		if (local14 != null) {
			Static156.method2461(local14, this.aByte56, super.anInt9048, super.anInt9052, null);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class24 local15 = this.method4088(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class93 local20 = arg1.method7455();
			local20.GA(super.anInt9048, super.anInt9049, super.anInt9052);
			return local15.method7386(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		if (this.aClass4_4 == null) {
			this.aClass4_4 = Static171.method7159(super.anInt9048, super.anInt9049, this.method4088(arg0, 0), super.anInt9052);
		}
		return this.aClass4_4;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}
}
