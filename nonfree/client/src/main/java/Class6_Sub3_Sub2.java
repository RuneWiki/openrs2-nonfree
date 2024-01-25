import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 implements Interface15 {

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Lclient!ew;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
	private final boolean aBoolean303;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "Z")
	private final boolean aBoolean305;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "S")
	private final short aShort70;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!ba;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Lclient!w;")
	private Class3_Sub10_Sub18 aClass3_Sub10_Sub18_1;

	static {
		new Class67("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIZIZ)V")
	public Class6_Sub3_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt7174, arg1.aBoolean485, arg1.aBoolean489);
		super.anInt4936 = arg5;
		this.aByte39 = (byte) arg7;
		this.aBoolean303 = arg6;
		this.aBoolean305 = arg1.anInt7164 != 0 && !arg6;
		super.anInt4938 = arg3;
		this.aBoolean304 = arg8;
		this.aShort70 = (short) arg1.anInt7168;
		this.aByte38 = (byte) arg2;
		this.aBoolean302 = arg0.method7439() && arg1.aBoolean488 && !this.aBoolean303 && Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean304) {
			local69 |= 0x10000;
		}
		@Pc(84) Class181 local84 = this.method3469(local69, this.aBoolean302, arg0);
		if (local84 != null) {
			this.aClass2_1 = local84.aClass2_3;
			this.aClass3_Sub10_Sub18_1 = local84.aClass3_Sub10_Sub18_3;
			if (this.aBoolean304) {
				this.aClass2_1 = this.aClass2_1.method5775((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2 local14 = this.method3468(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class205 local19 = arg1.method7448();
			local19.GA(super.anInt4938, super.anInt4934, super.anInt4936);
			return local14.method5786(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		this.aBoolean304 = false;
		if (this.aClass2_1 != null) {
			this.aClass2_1.ia(this.aClass2_1.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class2 method3468(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_1 != null && arg0.method7435(this.aClass2_1.h(), arg1) == 0) {
			return this.aClass2_1;
		} else {
			@Pc(26) Class181 local26 = this.method3469(arg1, false, arg0);
			return local26 == null ? null : local26.aClass2_3;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.method3468(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZLclient!oa;)Lclient!lo;")
	private Class181 method3469(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) Class242 local13 = Static454.aClass298_3.method7185(this.aShort70 & 0xFFFF);
		@Pc(38) Class52 local38;
		@Pc(29) Class52 local29;
		if (this.aBoolean303) {
			local29 = Static163.aClass52Array4[0];
			local38 = Static238.aClass52Array2[this.aByte38];
		} else {
			if (this.aByte38 < 3) {
				local29 = Static163.aClass52Array4[this.aByte38 + 1];
			} else {
				local29 = null;
			}
			local38 = Static163.aClass52Array4[this.aByte38];
		}
		return local13.method5981(super.anInt4938, arg0, this.aByte39, arg2, super.anInt4934, arg1, 22, local29, super.anInt4936, local38);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass2_1 == null) {
			return null;
		}
		@Pc(11) Class205 local11 = arg0.method7448();
		local11.GA(super.anInt4938, super.anInt4934, super.anInt4936);
		@Pc(21) Class4_Sub1 local21 = null;
		if (this.aBoolean305) {
			local21 = Static264.method4641(1);
		}
		this.aClass2_1.method5774(local11, local21 == null ? null : local21.aClass4_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aShort70 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class6_Sub3_Sub2) {
			@Pc(11) Class6_Sub3_Sub2 local11 = (Class6_Sub3_Sub2) arg2;
			if (this.aClass2_1 != null && local11.aClass2_1 != null) {
				this.aClass2_1.method5781(local11.aClass2_1, arg0, arg5, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
		if (this.aClass2_1 != null) {
			this.aClass2_1.method5785();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aBoolean302;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		@Pc(19) Class3_Sub10_Sub18 local19;
		if (this.aClass3_Sub10_Sub18_1 == null && this.aBoolean302) {
			@Pc(32) Class181 local32 = this.method3469(262144, true, arg0);
			local19 = local32 == null ? null : local32.aClass3_Sub10_Sub18_3;
		} else {
			local19 = this.aClass3_Sub10_Sub18_1;
			this.aClass3_Sub10_Sub18_1 = null;
		}
		if (local19 != null) {
			Static348.method5673(local19, this.aByte38, super.anInt4938, super.anInt4936, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		@Pc(25) Class3_Sub10_Sub18 local25;
		if (this.aClass3_Sub10_Sub18_1 == null && this.aBoolean302) {
			@Pc(18) Class181 local18 = this.method3469(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub10_Sub18_3;
		} else {
			local25 = this.aClass3_Sub10_Sub18_1;
			this.aClass3_Sub10_Sub18_1 = null;
		}
		if (local25 != null) {
			Static446.method6775(local25, this.aByte38, super.anInt4938, super.anInt4936, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		if (this.aClass81_1 == null) {
			this.aClass81_1 = Static257.method4541(super.anInt4936, super.anInt4934, super.anInt4938, this.method3468(arg0, 0));
		}
		return this.aClass81_1;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return 22;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return this.aBoolean304;
	}
}
