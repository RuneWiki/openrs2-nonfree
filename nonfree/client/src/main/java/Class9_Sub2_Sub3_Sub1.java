import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class9_Sub2_Sub3_Sub1 extends Class9_Sub2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!dfa", name = "Y", descriptor = "Lclient!iha;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!dfa", name = "kb", descriptor = "S")
	private final short aShort30;

	@OriginalMember(owner = "client!dfa", name = "M", descriptor = "Z")
	private final boolean aBoolean151;

	@OriginalMember(owner = "client!dfa", name = "cb", descriptor = "B")
	private byte aByte47;

	@OriginalMember(owner = "client!dfa", name = "ab", descriptor = "B")
	private final byte aByte46;

	@OriginalMember(owner = "client!dfa", name = "U", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!dfa", name = "mb", descriptor = "Z")
	private final boolean aBoolean154;

	@OriginalMember(owner = "client!dfa", name = "P", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!dfa", name = "X", descriptor = "Lclient!ka;")
	public Class75 aClass75_3;

	@OriginalMember(owner = "client!dfa", name = "fb", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_2;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIIZ)V")
	public Class9_Sub2_Sub3_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static572.method8037(arg9, arg8));
		super.anInt10158 = arg6;
		this.aShort30 = (short) arg1.anInt9240;
		this.aBoolean151 = arg7;
		this.aByte47 = (byte) arg9;
		this.aByte46 = (byte) arg8;
		this.aBoolean153 = arg10;
		this.aBoolean154 = arg1.anInt9228 != 0 && !arg7;
		super.anInt10152 = arg4;
		this.aBoolean152 = arg0.method6111() && arg1.aBoolean692 && !this.aBoolean151 && Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean153) {
			local69 |= 0x10000;
		}
		@Pc(84) Class58 local84 = this.method1636(local69, this.aBoolean152, arg0);
		if (local84 != null) {
			this.aClass75_3 = local84.aClass75_2;
			this.aClass3_Sub7_Sub17_2 = local84.aClass3_Sub7_Sub17_1;
			if (this.aBoolean153) {
				this.aClass75_3 = this.aClass75_3.method6805((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aByte46;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class3_Sub7_Sub17 local25;
		if (this.aClass3_Sub7_Sub17_2 == null && this.aBoolean152) {
			@Pc(18) Class58 local18 = this.method1636(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub17_1;
		} else {
			local25 = this.aClass3_Sub7_Sub17_2;
			this.aClass3_Sub7_Sub17_2 = null;
		}
		if (local25 != null) {
			Static334.method5411(local25, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass75_3 == null) {
			return null;
		}
		@Pc(17) Class31 local17 = arg0.method6125();
		local17.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(33) Class9_Sub10 local33 = Static635.method8548(1, this.aBoolean154);
		if (Static40.aBoolean34) {
			this.aClass75_3.method6788(local17, local33.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			this.aClass75_3.method6799(local17, local33.aClass9_Sub5Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZILclient!ha;)Lclient!ka;")
	private Class75 method1635(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		if (this.aClass75_3 != null && arg1.method6105(this.aClass75_3.ua(), arg0) == 0) {
			return this.aClass75_3;
		} else {
			@Pc(26) Class58 local26 = this.method1636(arg0, false, arg1);
			return local26 == null ? null : local26.aClass75_2;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class9_Sub2_Sub3_Sub1) {
			@Pc(14) Class9_Sub2_Sub3_Sub1 local14 = (Class9_Sub2_Sub3_Sub1) arg3;
			if (this.aClass75_3 != null && local14.aClass75_3 != null) {
				this.aClass75_3.method6782(local14.aClass75_3, arg5, arg2, arg4, arg1);
			}
		} else if (arg3 instanceof Class9_Sub2_Sub1_Sub3) {
			@Pc(36) Class9_Sub2_Sub1_Sub3 local36 = (Class9_Sub2_Sub1_Sub3) arg3;
			if (this.aClass75_3 != null && local36.aClass75_5 != null) {
				this.aClass75_3.method6782(local36.aClass75_5, arg5, arg2, arg4, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class75 local9 = this.method1635(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class31 local19 = arg1.method6125();
			local19.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local9.method6800(arg0, arg2, local19, false, 0, Static562.anInt9327) : local9.method6804(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		if (this.aClass75_3 == null) {
			return true;
		} else {
			return !this.aClass75_3.r();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aBoolean152;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
		if (this.aClass75_3 != null) {
			this.aClass75_3.method6785();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aClass75_3 == null ? false : this.aClass75_3.F();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		@Pc(18) Class3_Sub7_Sub17 local18;
		if (this.aClass3_Sub7_Sub17_2 == null && this.aBoolean152) {
			@Pc(29) Class58 local29 = this.method1636(262144, true, arg0);
			local18 = local29 == null ? null : local29.aClass3_Sub7_Sub17_1;
		} else {
			local18 = this.aClass3_Sub7_Sub17_2;
			this.aClass3_Sub7_Sub17_2 = null;
		}
		if (local18 != null) {
			Static334.method5410(local18, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLclient!ha;B)Lclient!cn;")
	private Class58 method1636(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class82 arg2) {
		@Pc(13) Class330 local13 = Static370.aClass284_3.method6915(this.aShort30 & 0xFFFF);
		@Pc(28) Class91 local28;
		@Pc(32) Class91 local32;
		if (this.aBoolean151) {
			local28 = Static485.aClass91Array1[super.aByte128];
			local32 = Static518.aClass91Array2[0];
		} else {
			if (super.aByte128 < 3) {
				local32 = Static518.aClass91Array2[super.aByte128 + 1];
			} else {
				local32 = null;
			}
			local28 = Static518.aClass91Array2[super.aByte128];
		}
		return local13.method7890(this.aByte47, (Class187) null, arg0, arg2, this.aByte46, super.anInt10158, arg1, super.anInt10154, local32, local28, super.anInt10152);
	}

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		this.aBoolean153 = false;
		if (this.aClass75_3 != null) {
			this.aClass75_3.s(this.aClass75_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		if (this.aClass160_2 == null) {
			this.aClass160_2 = Static365.method5854(super.anInt10158, super.anInt10154, this.method1635(0, arg0), super.anInt10152);
		}
		return this.aClass160_2;
	}

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass75_3 == null ? 0 : this.aClass75_3.fa();
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return this.aBoolean153;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.aByte47 = -96;
		}
		return this.aClass75_3 == null ? 0 : this.aClass75_3.ma();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aShort30 & 0xFFFF;
	}
}
