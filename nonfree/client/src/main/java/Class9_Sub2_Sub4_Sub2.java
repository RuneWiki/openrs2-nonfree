import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class9_Sub2_Sub4_Sub2 extends Class9_Sub2_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "Lclient!iha;")
	private Class160 aClass160_6;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "S")
	private final short aShort94;

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "Z")
	private boolean aBoolean587;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "Z")
	private final boolean aBoolean589;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "Z")
	private final boolean aBoolean588;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "Lclient!ka;")
	private Class75 aClass75_6;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "Lclient!r;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_5;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIZ)V")
	public Class9_Sub2_Sub4_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9199);
		this.aShort94 = (short) arg1.anInt9240;
		super.anInt10158 = arg6;
		this.lb = arg7;
		this.aBoolean587 = arg9;
		super.anInt10152 = arg4;
		this.aByte86 = (byte) arg8;
		this.aBoolean589 = arg1.anInt9228 != 0 && !arg7;
		this.aBoolean588 = arg0.method6111() && arg1.aBoolean692 && !this.lb && Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean587) {
			local66 |= 0x10000;
		}
		@Pc(81) Class58 local81 = this.method7096(local66, arg0, this.aBoolean588);
		if (local81 != null) {
			this.aClass75_6 = local81.aClass75_2;
			this.aClass3_Sub7_Sub17_5 = local81.aClass3_Sub7_Sub17_1;
			if (this.aBoolean587) {
				this.aClass75_6 = this.aClass75_6.method6805((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		if (this.aClass160_6 == null) {
			this.aClass160_6 = Static365.method5854(super.anInt10158, super.anInt10154, this.method7099(arg0, 0), super.anInt10152);
		}
		return this.aClass160_6;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLclient!ha;Z)Lclient!cn;")
	private Class58 method7096(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class330 local13 = Static370.aClass284_3.method6915(this.aShort94 & 0xFFFF);
		@Pc(27) Class91 local27;
		@Pc(31) Class91 local31;
		if (this.lb) {
			local27 = Static485.aClass91Array1[super.aByte128];
			local31 = Static518.aClass91Array2[0];
		} else {
			local27 = Static518.aClass91Array2[super.aByte128];
			if (super.aByte128 >= 3) {
				local31 = null;
			} else {
				local31 = Static518.aClass91Array2[super.aByte128 + 1];
			}
		}
		return local13.method7890(this.aByte86, (Class187) null, arg0, arg1, 22, super.anInt10158, arg2, super.anInt10154, local31, local27, super.anInt10152);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass75_6 == null) {
			return null;
		}
		@Pc(11) Class31 local11 = arg0.method6125();
		local11.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(30) Class9_Sub10 local30 = Static635.method8548(1, this.aBoolean589);
		if (Static40.aBoolean34) {
			this.aClass75_6.method6788(local11, local30.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			this.aClass75_6.method6799(local11, local30.aClass9_Sub5Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		this.aBoolean587 = false;
		if (this.aClass75_6 != null) {
			this.aClass75_6.s(this.aClass75_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class75 local9 = this.method7099(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class31 local19 = arg1.method6125();
			local19.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local9.method6800(arg0, arg2, local19, false, 0, Static562.anInt9327) : local9.method6804(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.method8607();
		}
		return this.aClass75_6 == null ? 0 : this.aClass75_6.ma();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return 22;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
		if (this.aClass75_6 != null) {
			this.aClass75_6.method6785();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aBoolean588;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aByte86;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		@Pc(30) Class3_Sub7_Sub17 local30;
		if (this.aClass3_Sub7_Sub17_5 == null && this.aBoolean588) {
			@Pc(23) Class58 local23 = this.method7096(262144, arg0, true);
			local30 = local23 == null ? null : local23.aClass3_Sub7_Sub17_1;
		} else {
			local30 = this.aClass3_Sub7_Sub17_5;
			this.aClass3_Sub7_Sub17_5 = null;
		}
		if (local30 != null) {
			Static334.method5411(local30, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		if (this.aClass75_6 == null) {
			return true;
		} else {
			return !this.aClass75_6.r();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class9_Sub2_Sub4_Sub2) {
			@Pc(9) Class9_Sub2_Sub4_Sub2 local9 = (Class9_Sub2_Sub4_Sub2) arg3;
			if (this.aClass75_6 != null && local9.aClass75_6 != null) {
				this.aClass75_6.method6782(local9.aClass75_6, arg5, arg2, arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class3_Sub7_Sub17 local14;
		if (this.aClass3_Sub7_Sub17_5 == null && this.aBoolean588) {
			@Pc(25) Class58 local25 = this.method7096(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub17_1;
		} else {
			local14 = this.aClass3_Sub7_Sub17_5;
			this.aClass3_Sub7_Sub17_5 = null;
		}
		if (local14 != null) {
			Static334.method5410(local14, super.aByte128, super.anInt10152, super.anInt10158, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return this.aBoolean587;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aClass75_6 == null ? false : this.aClass75_6.F();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!ha;I)Lclient!ka;")
	private Class75 method7099(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass75_6 != null && arg0.method6105(this.aClass75_6.ua(), arg1) == 0) {
			return this.aClass75_6;
		} else {
			@Pc(23) Class58 local23 = this.method7096(arg1, arg0, false);
			return local23 == null ? null : local23.aClass75_2;
		}
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass75_6 == null ? 0 : this.aClass75_6.fa();
	}
}
