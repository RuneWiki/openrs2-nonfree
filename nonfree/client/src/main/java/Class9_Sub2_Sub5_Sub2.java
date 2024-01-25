import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class9_Sub2_Sub5_Sub2 extends Class9_Sub2_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!sfa", name = "U", descriptor = "Lclient!iha;")
	private Class160 aClass160_8;

	@OriginalMember(owner = "client!sfa", name = "V", descriptor = "Z")
	private final boolean aBoolean643;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "Z")
	private final boolean aBoolean641;

	@OriginalMember(owner = "client!sfa", name = "P", descriptor = "S")
	private final short aShort99;

	@OriginalMember(owner = "client!sfa", name = "R", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!sfa", name = "hb", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
	private final boolean aBoolean642;

	@OriginalMember(owner = "client!sfa", name = "gb", descriptor = "Lclient!ka;")
	private Class75 aClass75_7;

	@OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_6;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIIII)V")
	public Class9_Sub2_Sub5_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean643 = arg7;
		super.anInt10158 = arg6;
		this.aBoolean641 = arg1.anInt9228 != 0 && !arg7;
		this.aShort99 = (short) arg1.anInt9240;
		super.anInt10152 = arg4;
		this.aByte91 = (byte) arg10;
		this.aByte92 = (byte) arg11;
		this.aBoolean642 = arg0.method6111() && arg1.aBoolean692 && !this.aBoolean643 && Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() != 0;
		@Pc(67) Class58 local67 = this.method7505(this.aBoolean642, 2048, arg0);
		if (local67 != null) {
			this.aClass75_7 = local67.aClass75_2;
			this.aClass3_Sub7_Sub17_6 = local67.aClass3_Sub7_Sub17_1;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aBoolean642;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aShort99 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		if (this.aClass75_7 == null) {
			return true;
		} else {
			return !this.aClass75_7.r();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!sfa", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aClass75_7 == null ? false : this.aClass75_7.F();
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		if (this.aClass160_8 == null) {
			this.aClass160_8 = Static365.method5854(super.anInt10158, super.anInt10154, this.method7504(0, arg0), super.anInt10152);
		}
		return this.aClass160_8;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class3_Sub7_Sub17 local25;
		if (this.aClass3_Sub7_Sub17_6 == null && this.aBoolean642) {
			@Pc(18) Class58 local18 = this.method7505(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub17_1;
		} else {
			local25 = this.aClass3_Sub7_Sub17_6;
			this.aClass3_Sub7_Sub17_6 = null;
		}
		if (local25 != null) {
			Static334.method5411(local25, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class75 local15 = this.method7504(131072, arg1);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class31 local20 = arg1.method6125();
			local20.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local15.method6800(arg0, arg2, local20, false, 0, Static562.anInt9327) : local15.method6804(arg0, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IZLclient!ha;)Lclient!ka;")
	private Class75 method7504(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		if (this.aClass75_7 != null && arg1.method6105(this.aClass75_7.ua(), arg0) == 0) {
			return this.aClass75_7;
		} else {
			@Pc(32) Class58 local32 = this.method7505(false, arg0, arg1);
			return local32 == null ? null : local32.aClass75_2;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass75_7 == null ? 0 : this.aClass75_7.fa();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass75_7 == null) {
			return null;
		}
		@Pc(11) Class31 local11 = arg0.method6125();
		local11.method7921(super.aShort98 + super.anInt10152, super.anInt10154, super.aShort97 + super.anInt10158);
		@Pc(38) Class9_Sub10 local38 = Static635.method8548(1, this.aBoolean641);
		if (Static40.aBoolean34) {
			this.aClass75_7.method6788(local11, local38.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			this.aClass75_7.method6799(local11, local38.aClass9_Sub5Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BZILclient!ha;)Lclient!cn;")
	private Class58 method7505(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(18) Class330 local18 = Static370.aClass284_3.method6915(this.aShort99 & 0xFFFF);
		@Pc(43) Class91 local43;
		@Pc(34) Class91 local34;
		if (this.aBoolean643) {
			local43 = Static485.aClass91Array1[super.aByte128];
			local34 = Static518.aClass91Array2[0];
		} else {
			if (super.aByte128 < 3) {
				local34 = Static518.aClass91Array2[super.aByte128 + 1];
			} else {
				local34 = null;
			}
			local43 = Static518.aClass91Array2[super.aByte128];
		}
		return local18.method7890(this.aByte92, (Class187) null, arg1, arg2, this.aByte91, super.anInt10158, arg0, super.anInt10154, local34, local43, super.anInt10152);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class3_Sub7_Sub17 local14;
		if (this.aClass3_Sub7_Sub17_6 == null && this.aBoolean642) {
			@Pc(25) Class58 local25 = this.method7505(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub17_1;
		} else {
			local14 = this.aClass3_Sub7_Sub17_6;
			this.aClass3_Sub7_Sub17_6 = null;
		}
		if (local14 != null) {
			Static334.method5410(local14, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 == -86) {
			return this.aClass75_7 == null ? 0 : this.aClass75_7.ma();
		} else {
			return 109;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aByte92;
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
		if (this.aClass75_7 != null) {
			this.aClass75_7.method6785();
		}
	}
}
