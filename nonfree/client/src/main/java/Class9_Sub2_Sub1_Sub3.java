import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class9_Sub2_Sub1_Sub3 extends Class9_Sub2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!gj", name = "yb", descriptor = "Lclient!iha;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!gj", name = "sb", descriptor = "S")
	private final short aShort49;

	@OriginalMember(owner = "client!gj", name = "db", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!gj", name = "ob", descriptor = "Z")
	private final boolean aBoolean258;

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!gj", name = "bb", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "client!gj", name = "rb", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!gj", name = "fb", descriptor = "Z")
	private final boolean aBoolean257;

	@OriginalMember(owner = "client!gj", name = "kb", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_4;

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "Lclient!ka;")
	public Class75 aClass75_5;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIIIIIIZ)V")
	public Class9_Sub2_Sub1_Sub3(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9217 == 1, Static191.method3072(arg12, arg13));
		this.aShort49 = (short) arg1.anInt9240;
		this.aByte57 = (byte) arg12;
		this.aBoolean258 = arg7;
		this.aBoolean255 = arg1.anInt9228 != 0 && !arg7;
		super.aByte128 = (byte) arg3;
		this.aBoolean256 = arg14;
		this.aByte58 = (byte) arg13;
		this.aBoolean257 = arg0.method6111() && arg1.aBoolean692 && !this.aBoolean258 && Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean256) {
			local78 |= 0x10000;
		}
		@Pc(93) Class58 local93 = this.method3027(arg0, this.aBoolean257, local78);
		if (local93 != null) {
			this.aClass3_Sub7_Sub17_4 = local93.aClass3_Sub7_Sub17_1;
			this.aClass75_5 = local93.aClass75_2;
			if (this.aBoolean256) {
				this.aClass75_5 = this.aClass75_5.method6805((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
		if (this.aClass75_5 != null) {
			this.aClass75_5.method6785();
		}
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		this.aBoolean256 = false;
		if (this.aClass75_5 != null) {
			this.aClass75_5.s(this.aClass75_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass75_5 == null ? 0 : this.aClass75_5.fa();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class9_Sub2_Sub3_Sub1) {
			@Pc(37) Class9_Sub2_Sub3_Sub1 local37 = (Class9_Sub2_Sub3_Sub1) arg3;
			if (this.aClass75_5 == null || local37.aClass75_3 == null) {
				return;
			}
			this.aClass75_5.method6782(local37.aClass75_3, arg5, arg2, arg4, arg1);
		} else if (arg3 instanceof Class9_Sub2_Sub1_Sub3) {
			@Pc(18) Class9_Sub2_Sub1_Sub3 local18 = (Class9_Sub2_Sub1_Sub3) arg3;
			if (this.aClass75_5 != null && local18.aClass75_5 != null) {
				this.aClass75_5.method6782(local18.aClass75_5, arg5, arg2, arg4, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		if (this.aClass75_5 == null) {
			return true;
		} else {
			return !this.aClass75_5.r();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		if (this.aClass160_3 == null) {
			this.aClass160_3 = Static365.method5854(super.anInt10158, super.anInt10154, this.method3029(0, arg0), super.anInt10152);
		}
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "(I)I")
	public int method3026() {
		return this.aClass75_5 == null ? 15 : this.aClass75_5.na() / 4;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ha;ZBI)Lclient!cn;")
	private Class58 method3027(@OriginalArg(0) Class82 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class330 local18 = Static370.aClass284_3.method6915(this.aShort49 & 0xFFFF);
		@Pc(43) Class91 local43;
		@Pc(34) Class91 local34;
		if (this.aBoolean258) {
			local34 = Static518.aClass91Array2[0];
			local43 = Static485.aClass91Array1[super.aByte128];
		} else {
			if (super.aByte128 < 3) {
				local34 = Static518.aClass91Array2[super.aByte128 + 1];
			} else {
				local34 = null;
			}
			local43 = Static518.aClass91Array2[super.aByte128];
		}
		return local18.method7890(this.aByte57 == 11 ? this.aByte58 + 4 : this.aByte58, (Class187) null, arg2, arg0, this.aByte57 == 11 ? 10 : this.aByte57, super.anInt10158, arg1, super.anInt10154, local34, local43, super.anInt10152);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class75 local9 = this.method3029(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class31 local21 = arg1.method6125();
			local21.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local9.method6800(arg0, arg2, local21, false, 0, Static562.anInt9327) : local9.method6804(arg0, arg2, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass75_5 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method6125();
		local16.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(30) Class9_Sub10 local30 = Static635.method8548(1, this.aBoolean255);
		if (Static40.aBoolean34) {
			this.aClass75_5.method6788(local16, local30.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			this.aClass75_5.method6799(local16, local30.aClass9_Sub5Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aClass75_5 == null ? false : this.aClass75_5.F();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aBoolean257;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return this.aBoolean256;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLclient!ha;)Lclient!ka;")
	private Class75 method3029(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		if (this.aClass75_5 != null && arg1.method6105(this.aClass75_5.ua(), arg0) == 0) {
			return this.aClass75_5;
		} else {
			@Pc(31) Class58 local31 = this.method3027(arg1, false, arg0);
			return local31 == null ? null : local31.aClass75_2;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		@Pc(18) Class3_Sub7_Sub17 local18;
		if (this.aClass3_Sub7_Sub17_4 == null && this.aBoolean257) {
			@Pc(29) Class58 local29 = this.method3027(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub7_Sub17_1;
		} else {
			local18 = this.aClass3_Sub7_Sub17_4;
			this.aClass3_Sub7_Sub17_4 = null;
		}
		if (local18 != null) {
			Static334.method5410(local18, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.method3026();
		}
		return this.aClass75_5 == null ? 0 : this.aClass75_5.ma();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class3_Sub7_Sub17 local25;
		if (this.aClass3_Sub7_Sub17_4 == null && this.aBoolean257) {
			@Pc(18) Class58 local18 = this.method3027(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub17_1;
		} else {
			local25 = this.aClass3_Sub7_Sub17_4;
			this.aClass3_Sub7_Sub17_4 = null;
		}
		if (local25 != null) {
			Static334.method5411(local25, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}
}
