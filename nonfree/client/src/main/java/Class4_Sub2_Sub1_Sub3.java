import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class4_Sub2_Sub1_Sub3 extends Class4_Sub2_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "Lclient!kn;")
	private Class200 aClass200_7;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!pm", name = "vb", descriptor = "Z")
	private final boolean aBoolean533;

	@OriginalMember(owner = "client!pm", name = "qb", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "B")
	private final byte aByte106;

	@OriginalMember(owner = "client!pm", name = "mb", descriptor = "Z")
	private boolean aBoolean530;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "S")
	private final short aShort98;

	@OriginalMember(owner = "client!pm", name = "tb", descriptor = "Z")
	private final boolean aBoolean532;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "Lclient!ka;")
	public Class187 aClass187_5;

	@OriginalMember(owner = "client!pm", name = "W", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub14 aClass5_Sub5_Sub14_4;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIIIIIIZ)V")
	public Class4_Sub2_Sub1_Sub3(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4733 == 1, Static228.method3850(arg13, arg12));
		this.aByte105 = (byte) arg12;
		this.aBoolean533 = arg1.anInt4779 != 0 && !arg7;
		this.aBoolean531 = arg7;
		this.aByte106 = (byte) arg13;
		super.aByte131 = (byte) arg3;
		this.aBoolean530 = arg14;
		this.aShort98 = (short) arg1.anInt4758;
		this.aBoolean532 = arg0.method7270() && arg1.aBoolean348 && !this.aBoolean531 && Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean530) {
			local78 |= 0x10000;
		}
		@Pc(93) Class94 local93 = this.method6629(local78, this.aBoolean532, arg0);
		if (local93 != null) {
			this.aClass187_5 = local93.aClass187_1;
			this.aClass5_Sub5_Sub14_4 = local93.aClass5_Sub5_Sub14_1;
			if (this.aBoolean530) {
				this.aClass187_5 = this.aClass187_5.method8656((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class187 method6626(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_5 != null && arg0.method7296(this.aClass187_5.ua(), arg1) == 0) {
			return this.aClass187_5;
		} else {
			@Pc(31) Class94 local31 = this.method6629(arg1, false, arg0);
			return local31 == null ? null : local31.aClass187_1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass187_5 == null ? 0 : this.aClass187_5.fa();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub2_Sub4_Sub1) {
			@Pc(5) Class4_Sub2_Sub4_Sub1 local5 = (Class4_Sub2_Sub4_Sub1) arg2;
			if (this.aClass187_5 != null && local5.aClass187_2 != null) {
				this.aClass187_5.method8657(local5.aClass187_2, arg0, arg3, arg4, arg5);
			}
		} else if (arg2 instanceof Class4_Sub2_Sub1_Sub3) {
			@Pc(28) Class4_Sub2_Sub1_Sub3 local28 = (Class4_Sub2_Sub1_Sub3) arg2;
			if (this.aClass187_5 != null && local28.aClass187_5 != null) {
				this.aClass187_5.method8657(local28.aClass187_5, arg0, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aClass187_5 == null ? false : this.aClass187_5.F();
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)I")
	public int method6628() {
		return this.aClass187_5 == null ? 15 : this.aClass187_5.na() / 4;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLclient!ha;)Lclient!eo;")
	private Class94 method6629(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class133 arg2) {
		@Pc(15) Class181 local15 = Static61.aClass246_7.method5497(this.aShort98 & 0xFFFF);
		@Pc(28) Class61 local28;
		@Pc(32) Class61 local32;
		if (this.aBoolean531) {
			local28 = Static456.aClass61Array3[super.aByte131];
			local32 = Static20.aClass61Array2[0];
		} else {
			if (super.aByte131 >= 3) {
				local32 = null;
			} else {
				local32 = Static20.aClass61Array2[super.aByte131 + 1];
			}
			local28 = Static20.aClass61Array2[super.aByte131];
		}
		return local15.method4282(super.anInt10231, super.anInt10228, arg0, this.aByte105 == 11 ? 10 : this.aByte105, local32, local28, arg1, arg2, this.aByte105 == 11 ? this.aByte106 + 4 : this.aByte106, super.anInt10229);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		@Pc(29) Class5_Sub5_Sub14 local29;
		if (this.aClass5_Sub5_Sub14_4 == null && this.aBoolean532) {
			@Pc(22) Class94 local22 = this.method6629(262144, true, arg0);
			local29 = local22 == null ? null : local22.aClass5_Sub5_Sub14_1;
		} else {
			local29 = this.aClass5_Sub5_Sub14_4;
			this.aClass5_Sub5_Sub14_4 = null;
		}
		if (local29 != null) {
			Static208.method3588(local29, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		@Pc(14) Class5_Sub5_Sub14 local14;
		if (this.aClass5_Sub5_Sub14_4 == null && this.aBoolean532) {
			@Pc(25) Class94 local25 = this.method6629(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass5_Sub5_Sub14_1;
		} else {
			local14 = this.aClass5_Sub5_Sub14_4;
			this.aClass5_Sub5_Sub14_4 = null;
		}
		if (local14 != null) {
			Static258.method4241(local14, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aByte106;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		if (this.aClass200_7 == null) {
			this.aClass200_7 = Static446.method6733(this.method6626(arg0, 0), super.anInt10228, super.anInt10229, super.anInt10231);
		}
		return this.aClass200_7;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		if (this.aClass187_5 == null) {
			return true;
		} else {
			return !this.aClass187_5.r();
		}
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return this.aBoolean530;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(17) Class187 local17 = this.method6626(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class113 local22 = arg2.method7262();
			local22.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local17.method8641(arg0, arg1, local22, false, 0, Static469.anInt7885) : local17.method8642(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass187_5 == null ? 0 : this.aClass187_5.ma();
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		this.aBoolean530 = false;
		if (this.aClass187_5 != null) {
			this.aClass187_5.s(this.aClass187_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aByte105;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass187_5 == null) {
			return null;
		}
		@Pc(16) Class113 local16 = arg0.method7262();
		local16.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(30) Class4_Sub6 local30 = Static242.method4012(1, this.aBoolean533);
		if (Static57.aBoolean65) {
			this.aClass187_5.method8654(local16, local30.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			this.aClass187_5.method8645(local16, local30.aClass4_Sub9Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aClass187_5 != null) {
			this.aClass187_5.method8651();
		}
	}
}
