import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class4_Sub2_Sub4_Sub1 extends Class4_Sub2_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!gha", name = "X", descriptor = "Lclient!kn;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!gha", name = "O", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!gha", name = "M", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!gha", name = "G", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!gha", name = "R", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!gha", name = "Y", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!gha", name = "cb", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!gha", name = "P", descriptor = "Z")
	private final boolean aBoolean227;

	@OriginalMember(owner = "client!gha", name = "D", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub14 aClass5_Sub5_Sub14_2;

	@OriginalMember(owner = "client!gha", name = "db", descriptor = "Lclient!ka;")
	public Class187 aClass187_2;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIIZ)V")
	public Class4_Sub2_Sub4_Sub1(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static129.method1912(arg8, arg9));
		this.aBoolean226 = arg1.anInt4779 != 0 && !arg7;
		this.aBoolean225 = arg7;
		this.aByte60 = (byte) arg9;
		this.aByte61 = (byte) arg8;
		super.anInt10229 = arg6;
		this.aBoolean228 = arg10;
		this.aShort59 = (short) arg1.anInt4758;
		super.anInt10231 = arg4;
		this.aBoolean227 = arg0.method7270() && arg1.aBoolean348 && !this.aBoolean225 && Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean228) {
			local72 |= 0x10000;
		}
		@Pc(87) Class94 local87 = this.method2778(local72, this.aBoolean227, arg0);
		if (local87 != null) {
			this.aClass5_Sub5_Sub14_2 = local87.aClass5_Sub5_Sub14_1;
			this.aClass187_2 = local87.aClass187_1;
			if (this.aBoolean228) {
				this.aClass187_2 = this.aClass187_2.method8656((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aBoolean227;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		@Pc(14) Class5_Sub5_Sub14 local14;
		if (this.aClass5_Sub5_Sub14_2 == null && this.aBoolean227) {
			@Pc(25) Class94 local25 = this.method2778(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass5_Sub5_Sub14_1;
		} else {
			local14 = this.aClass5_Sub5_Sub14_2;
			this.aClass5_Sub5_Sub14_2 = null;
		}
		if (local14 != null) {
			Static258.method4241(local14, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		if (this.aClass200_2 == null) {
			this.aClass200_2 = Static446.method6733(this.method2780(arg0, 0), super.anInt10228, super.anInt10229, super.anInt10231);
		}
		return this.aClass200_2;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZILclient!ha;)Lclient!eo;")
	private Class94 method2778(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class133 arg2) {
		@Pc(13) Class181 local13 = Static61.aClass246_7.method5497(this.aShort59 & 0xFFFF);
		@Pc(21) Class61 local21;
		@Pc(32) Class61 local32;
		if (this.aBoolean225) {
			local32 = Static20.aClass61Array2[0];
			local21 = Static456.aClass61Array3[super.aByte131];
		} else {
			local21 = Static20.aClass61Array2[super.aByte131];
			if (super.aByte131 < 3) {
				local32 = Static20.aClass61Array2[super.aByte131 + 1];
			} else {
				local32 = null;
			}
		}
		return local13.method4282(super.anInt10231, super.anInt10228, arg0, this.aByte61, local32, local21, arg1, arg2, this.aByte60, super.anInt10229);
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass187_2 == null) {
			return null;
		}
		@Pc(15) Class113 local15 = arg0.method7262();
		local15.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(29) Class4_Sub6 local29 = Static242.method4012(1, this.aBoolean226);
		if (Static57.aBoolean65) {
			this.aClass187_2.method8654(local15, local29.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			this.aClass187_2.method8645(local15, local29.aClass4_Sub9Array1[0], 0);
		}
		return local29;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class187 method2780(@OriginalArg(1) Class133 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_2 != null && arg0.method7296(this.aClass187_2.ua(), arg1) == 0) {
			return this.aClass187_2;
		} else {
			@Pc(31) Class94 local31 = this.method2778(arg1, false, arg0);
			return local31 == null ? null : local31.aClass187_1;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		if (this.aClass187_2 == null) {
			return true;
		} else {
			return !this.aClass187_2.r();
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub2_Sub4_Sub1) {
			@Pc(16) Class4_Sub2_Sub4_Sub1 local16 = (Class4_Sub2_Sub4_Sub1) arg2;
			if (this.aClass187_2 != null && local16.aClass187_2 != null) {
				this.aClass187_2.method8657(local16.aClass187_2, arg0, arg3, arg4, arg5);
			}
		} else if (arg2 instanceof Class4_Sub2_Sub1_Sub3) {
			@Pc(38) Class4_Sub2_Sub1_Sub3 local38 = (Class4_Sub2_Sub1_Sub3) arg2;
			if (this.aClass187_2 != null && local38.aClass187_5 != null) {
				this.aClass187_2.method8657(local38.aClass187_5, arg0, arg3, arg4, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(17) Class187 local17 = this.method2780(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class113 local22 = arg2.method7262();
			local22.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local17.method8641(arg0, arg1, local22, false, 0, Static469.anInt7885) : local17.method8642(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aClass187_2 != null) {
			this.aClass187_2.method8651();
		}
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
	}

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aClass187_2 == null ? false : this.aClass187_2.F();
	}

	@OriginalMember(owner = "client!gha", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass187_2 == null ? 0 : this.aClass187_2.ma();
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aByte61;
	}

	@OriginalMember(owner = "client!gha", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		this.aBoolean228 = false;
		if (this.aClass187_2 != null) {
			this.aClass187_2.s(this.aClass187_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		@Pc(25) Class5_Sub5_Sub14 local25;
		if (this.aClass5_Sub5_Sub14_2 == null && this.aBoolean227) {
			@Pc(18) Class94 local18 = this.method2778(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub5_Sub14_1;
		} else {
			local25 = this.aClass5_Sub5_Sub14_2;
			this.aClass5_Sub5_Sub14_2 = null;
		}
		if (local25 != null) {
			Static208.method3588(local25, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!gha", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass187_2 == null ? 0 : this.aClass187_2.fa();
	}

	@OriginalMember(owner = "client!gha", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return this.aBoolean228;
	}
}
