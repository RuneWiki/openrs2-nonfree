import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class15_Sub1_Sub1 extends Class15_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "Lclient!ac;")
	private Class4 aClass4_3;

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "Z")
	private final boolean aBoolean287;

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "S")
	private final short aShort56;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Lclient!w;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_3;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "Lclient!ba;")
	public Class24 aClass24_4;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!oa;Lclient!lt;IIIIZIIZ)V")
	public Class15_Sub1_Sub1(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static164.method2619(arg7, arg8));
		super.anInt5704 = arg5;
		this.aByte42 = (byte) arg2;
		this.aBoolean287 = arg1.anInt5582 != 0 && !arg6;
		this.aBoolean286 = arg9;
		this.aShort56 = (short) arg1.anInt5600;
		this.aByte43 = (byte) arg7;
		this.aBoolean284 = arg6;
		this.aByte41 = (byte) arg8;
		super.anInt5699 = arg3;
		this.aBoolean285 = arg0.method7466() && arg1.aBoolean388 && !this.aBoolean284 && Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean286) {
			local68 |= 0x10000;
		}
		@Pc(83) Class47 local83 = this.method3082(local68, arg0, this.aBoolean285);
		if (local83 != null) {
			this.aClass6_Sub5_Sub10_3 = local83.aClass6_Sub5_Sub10_1;
			this.aClass24_4 = local83.aClass24_1;
			if (this.aBoolean286) {
				this.aClass24_4 = this.aClass24_4.method7398((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass24_4 == null) {
			return null;
		}
		@Pc(11) Class93 local11 = arg0.method7455();
		local11.GA(super.anInt5699, super.anInt5703, super.anInt5704);
		@Pc(21) Class60_Sub8 local21 = null;
		if (this.aBoolean287) {
			local21 = Static191.method3243(1);
		}
		this.aClass24_4.method7393(local11, local21 == null ? null : local21.aClass60_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return this.aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return this.aBoolean286;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return this.aBoolean285;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class24 method3080(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass24_4 != null && arg0.method7505(this.aClass24_4.h(), arg1) == 0) {
			return this.aClass24_4;
		} else {
			@Pc(30) Class47 local30 = this.method3082(arg1, arg0, false);
			return local30 == null ? null : local30.aClass24_1;
		}
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class24 local11 = this.method3080(arg1, 131072);
		if (local11 == null) {
			return false;
		} else {
			@Pc(22) Class93 local22 = arg1.method7455();
			local22.GA(super.anInt5699, super.anInt5703, super.anInt5704);
			return local11.method7386(arg0, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		if (this.aClass4_3 == null) {
			this.aClass4_3 = Static171.method7159(super.anInt5699, super.anInt5703, this.method3080(arg0, 0), super.anInt5704);
		}
		return this.aClass4_3;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		this.aBoolean286 = false;
		if (this.aClass24_4 != null) {
			this.aClass24_4.ia(this.aClass24_4.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		if (arg2 instanceof Class15_Sub1_Sub1) {
			@Pc(9) Class15_Sub1_Sub1 local9 = (Class15_Sub1_Sub1) arg2;
			if (this.aClass24_4 != null && local9.aClass24_4 != null) {
				this.aClass24_4.method7389(local9.aClass24_4, arg1, arg3, arg0, arg4);
			}
		} else if (arg2 instanceof Class15_Sub2_Sub5) {
			@Pc(32) Class15_Sub2_Sub5 local32 = (Class15_Sub2_Sub5) arg2;
			if (this.aClass24_4 != null && local32.aClass24_6 != null) {
				this.aClass24_4.method7389(local32.aClass24_6, arg1, arg3, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return this.method3080(arg1, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!oa;Z)Lclient!cda;")
	private Class47 method3082(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class192 local19 = Static85.aClass27_1.method516(this.aShort56 & 0xFFFF);
		@Pc(42) Class46 local42;
		@Pc(28) Class46 local28;
		if (this.aBoolean284) {
			local28 = Static496.aClass46Array4[0];
			local42 = Static480.aClass46Array2[this.aByte42];
		} else {
			if (this.aByte42 >= 3) {
				local28 = null;
			} else {
				local28 = Static496.aClass46Array4[this.aByte42 + 1];
			}
			local42 = Static496.aClass46Array4[this.aByte42];
		}
		return local19.method4593(arg0, local28, super.anInt5703, this.aByte43, local42, super.anInt5704, arg2, super.anInt5699, this.aByte41, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
		@Pc(18) Class6_Sub5_Sub10 local18;
		if (this.aClass6_Sub5_Sub10_3 == null && this.aBoolean285) {
			@Pc(29) Class47 local29 = this.method3082(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass6_Sub5_Sub10_1;
		} else {
			local18 = this.aClass6_Sub5_Sub10_3;
			this.aClass6_Sub5_Sub10_3 = null;
		}
		if (local18 != null) {
			Static485.method6822(local18, this.aByte42, super.anInt5699, super.anInt5704, null);
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
		@Pc(31) Class6_Sub5_Sub10 local31;
		if (this.aClass6_Sub5_Sub10_3 == null && this.aBoolean285) {
			@Pc(24) Class47 local24 = this.method3082(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass6_Sub5_Sub10_1;
		} else {
			local31 = this.aClass6_Sub5_Sub10_3;
			this.aClass6_Sub5_Sub10_3 = null;
		}
		if (local31 != null) {
			Static156.method2461(local31, this.aByte42, super.anInt5699, super.anInt5704, null);
		}
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
		if (this.aClass24_4 != null) {
			this.aClass24_4.method7401();
		}
	}
}
