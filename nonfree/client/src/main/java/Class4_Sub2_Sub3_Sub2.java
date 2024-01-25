import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class4_Sub2_Sub3_Sub2 extends Class4_Sub2_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!vba", name = "lb", descriptor = "F")
	public static float lb;

	@OriginalMember(owner = "client!vba", name = "fb", descriptor = "Lclient!kn;")
	private Class200 aClass200_8;

	@OriginalMember(owner = "client!vba", name = "cb", descriptor = "B")
	private final byte aByte128;

	@OriginalMember(owner = "client!vba", name = "Q", descriptor = "B")
	private final byte aByte127;

	@OriginalMember(owner = "client!vba", name = "pb", descriptor = "Z")
	private final boolean aBoolean705;

	@OriginalMember(owner = "client!vba", name = "W", descriptor = "S")
	private final short aShort115;

	@OriginalMember(owner = "client!vba", name = "X", descriptor = "Z")
	private final boolean aBoolean703;

	@OriginalMember(owner = "client!vba", name = "Z", descriptor = "Z")
	private final boolean aBoolean704;

	@OriginalMember(owner = "client!vba", name = "S", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub14 aClass5_Sub5_Sub14_6;

	@OriginalMember(owner = "client!vba", name = "nb", descriptor = "Lclient!ka;")
	private Class187 aClass187_7;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIIII)V")
	public Class4_Sub2_Sub3_Sub2(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10231 = arg4;
		super.anInt10229 = arg6;
		this.aByte128 = (byte) arg11;
		this.aByte127 = (byte) arg10;
		this.aBoolean705 = arg7;
		this.aShort115 = (short) arg1.anInt4758;
		this.aBoolean703 = arg1.anInt4779 != 0 && !arg7;
		this.aBoolean704 = arg0.method7270() && arg1.aBoolean348 && !this.aBoolean705 && Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() != 0;
		@Pc(73) Class94 local73 = this.method8496(2048, arg0, this.aBoolean704);
		if (local73 != null) {
			this.aClass5_Sub5_Sub14_6 = local73.aClass5_Sub5_Sub14_1;
			this.aClass187_7 = local73.aClass187_1;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aBoolean704;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aByte128;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aClass187_7 != null) {
			this.aClass187_7.method8651();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILclient!ha;ZB)Lclient!eo;")
	private Class94 method8496(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class181 local18 = Static61.aClass246_7.method5497(this.aShort115 & 0xFFFF);
		@Pc(30) Class61 local30;
		@Pc(25) Class61 local25;
		if (this.aBoolean705) {
			local25 = Static20.aClass61Array2[0];
			local30 = Static456.aClass61Array3[super.aByte131];
		} else {
			if (super.aByte131 >= 3) {
				local25 = null;
			} else {
				local25 = Static20.aClass61Array2[super.aByte131 + 1];
			}
			local30 = Static20.aClass61Array2[super.aByte131];
		}
		return local18.method4282(super.anInt10231, super.anInt10228, arg0, this.aByte127, local25, local30, arg2, arg1, this.aByte128, super.anInt10229);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		if (this.aClass200_8 == null) {
			this.aClass200_8 = Static446.method6733(this.method8498(arg0, 0), super.anInt10228, super.anInt10229, super.anInt10231);
		}
		return this.aClass200_8;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aShort115 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		if (this.aClass187_7 == null) {
			return true;
		} else {
			return !this.aClass187_7.r();
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass187_7 == null) {
			return null;
		}
		@Pc(11) Class113 local11 = arg0.method7262();
		local11.method8458(super.aShort113 + super.anInt10231, super.anInt10228, super.aShort114 + super.anInt10229);
		@Pc(31) Class4_Sub6 local31 = Static242.method4012(1, this.aBoolean703);
		if (Static57.aBoolean65) {
			this.aClass187_7.method8654(local11, local31.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			this.aClass187_7.method8645(local11, local31.aClass4_Sub9Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass187_7 == null ? 0 : this.aClass187_7.ma();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(9) Class187 local9 = this.method8498(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class113 local14 = arg2.method7262();
			local14.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local9.method8641(arg0, arg1, local14, false, 0, Static469.anInt7885) : local9.method8642(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return this.aByte127;
	}

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aClass187_7 == null ? false : this.aClass187_7.F();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		@Pc(14) Class5_Sub5_Sub14 local14;
		if (this.aClass5_Sub5_Sub14_6 == null && this.aBoolean704) {
			@Pc(25) Class94 local25 = this.method8496(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass5_Sub5_Sub14_1;
		} else {
			local14 = this.aClass5_Sub5_Sub14_6;
			this.aClass5_Sub5_Sub14_6 = null;
		}
		if (local14 != null) {
			Static208.method3588(local14, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class187 method8498(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_7 != null && arg0.method7296(this.aClass187_7.ua(), arg1) == 0) {
			return this.aClass187_7;
		} else {
			@Pc(26) Class94 local26 = this.method8496(arg1, arg0, false);
			return local26 == null ? null : local26.aClass187_1;
		}
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass187_7 == null ? 0 : this.aClass187_7.fa();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		@Pc(18) Class5_Sub5_Sub14 local18;
		if (this.aClass5_Sub5_Sub14_6 == null && this.aBoolean704) {
			@Pc(29) Class94 local29 = this.method8496(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass5_Sub5_Sub14_1;
		} else {
			local18 = this.aClass5_Sub5_Sub14_6;
			this.aClass5_Sub5_Sub14_6 = null;
		}
		if (local18 != null) {
			Static258.method4241(local18, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}
}
