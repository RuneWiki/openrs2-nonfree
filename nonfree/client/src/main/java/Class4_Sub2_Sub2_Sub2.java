import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class4_Sub2_Sub2_Sub2 extends Class4_Sub2_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!jga", name = "K", descriptor = "Lclient!kn;")
	private Class200 aClass200_3;

	@OriginalMember(owner = "client!jga", name = "nb", descriptor = "Z")
	private final boolean aBoolean337;

	@OriginalMember(owner = "client!jga", name = "Q", descriptor = "S")
	private final short aShort65;

	@OriginalMember(owner = "client!jga", name = "U", descriptor = "Z")
	private boolean aBoolean335;

	@OriginalMember(owner = "client!jga", name = "N", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!jga", name = "W", descriptor = "Z")
	private final boolean aBoolean336;

	@OriginalMember(owner = "client!jga", name = "S", descriptor = "Z")
	private final boolean aBoolean334;

	@OriginalMember(owner = "client!jga", name = "fb", descriptor = "Lclient!r;")
	private Class5_Sub5_Sub14 aClass5_Sub5_Sub14_3;

	@OriginalMember(owner = "client!jga", name = "P", descriptor = "Lclient!ka;")
	private Class187 aClass187_3;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;IIIIIZIZ)V")
	public Class4_Sub2_Sub2_Sub2(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4761);
		this.aBoolean337 = arg7;
		this.aShort65 = (short) arg1.anInt4758;
		super.anInt10229 = arg6;
		this.aBoolean335 = arg9;
		super.anInt10231 = arg4;
		this.aByte73 = (byte) arg8;
		this.aBoolean336 = arg1.anInt4779 != 0 && !arg7;
		this.aBoolean334 = arg0.method7270() && arg1.aBoolean348 && !this.aBoolean337 && Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean335) {
			local63 |= 0x10000;
		}
		@Pc(78) Class94 local78 = this.method4231(arg0, local63, this.aBoolean334);
		if (local78 != null) {
			this.aClass5_Sub5_Sub14_3 = local78.aClass5_Sub5_Sub14_1;
			this.aClass187_3 = local78.aClass187_1;
			if (this.aBoolean335) {
				this.aClass187_3 = this.aClass187_3.method8656((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		this.aBoolean335 = false;
		if (this.aClass187_3 != null) {
			this.aClass187_3.s(this.aClass187_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(9) Class187 local9 = this.method4230(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class113 local22 = arg2.method7262();
			local22.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			return Static57.aBoolean65 ? local9.method8641(arg0, arg1, local22, false, 0, Static469.anInt7885) : local9.method8642(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!ha;Z)Lclient!ka;")
	private Class187 method4230(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1) {
		if (this.aClass187_3 != null && arg1.method7296(this.aClass187_3.ua(), arg0) == 0) {
			return this.aClass187_3;
		} else {
			@Pc(23) Class94 local23 = this.method4231(arg1, arg0, false);
			return local23 == null ? null : local23.aClass187_1;
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I")
	@Override
	public int method8490() {
		return this.aShort65 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8494(@OriginalArg(0) Class133 arg0) {
		@Pc(31) Class5_Sub5_Sub14 local31;
		if (this.aClass5_Sub5_Sub14_3 == null && this.aBoolean334) {
			@Pc(24) Class94 local24 = this.method4231(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass5_Sub5_Sub14_1;
		} else {
			local31 = this.aClass5_Sub5_Sub14_3;
			this.aClass5_Sub5_Sub14_3 = null;
		}
		if (local31 != null) {
			Static208.method3588(local31, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		if (this.aClass200_3 == null) {
			this.aClass200_3 = Static446.method6733(this.method4230(0, arg0), super.anInt10228, super.anInt10229, super.anInt10231);
		}
		return this.aClass200_3;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8489(@OriginalArg(1) Class133 arg0) {
		@Pc(33) Class5_Sub5_Sub14 local33;
		if (this.aClass5_Sub5_Sub14_3 == null && this.aBoolean334) {
			@Pc(26) Class94 local26 = this.method4231(arg0, 262144, true);
			local33 = local26 == null ? null : local26.aClass5_Sub5_Sub14_1;
		} else {
			local33 = this.aClass5_Sub5_Sub14_3;
			this.aClass5_Sub5_Sub14_3 = null;
		}
		if (local33 != null) {
			Static258.method4241(local33, super.aByte131, super.anInt10231, super.anInt10229, null);
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		if (this.aClass187_3 == null) {
			return null;
		}
		@Pc(16) Class113 local16 = arg0.method7262();
		local16.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		@Pc(30) Class4_Sub6 local30 = Static242.method4012(1, this.aBoolean336);
		if (Static57.aBoolean65) {
			this.aClass187_3.method8654(local16, local30.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			this.aClass187_3.method8645(local16, local30.aClass4_Sub9Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		if (this.aClass187_3 == null) {
			return true;
		} else {
			return !this.aClass187_3.r();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ha;BIZ)Lclient!eo;")
	private Class94 method4231(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class181 local13 = Static61.aClass246_7.method5497(this.aShort65 & 0xFFFF);
		@Pc(30) Class61 local30;
		@Pc(34) Class61 local34;
		if (this.aBoolean337) {
			local30 = Static456.aClass61Array3[super.aByte131];
			local34 = Static20.aClass61Array2[0];
		} else {
			local30 = Static20.aClass61Array2[super.aByte131];
			if (super.aByte131 >= 3) {
				local34 = null;
			} else {
				local34 = Static20.aClass61Array2[super.aByte131 + 1];
			}
		}
		return local13.method4282(super.anInt10231, super.anInt10228, arg1, 22, local34, local30, arg2, arg0, this.aByte73, super.anInt10229);
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V")
	@Override
	public void method8492() {
		if (this.aClass187_3 != null) {
			this.aClass187_3.method8651();
		}
	}

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.aClass187_3 == null ? 0 : this.aClass187_3.ma();
	}

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aClass187_3 == null ? false : this.aClass187_3.F();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8491() {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.aClass187_3 == null ? 0 : this.aClass187_3.fa();
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I")
	@Override
	public int method8488() {
		return this.aByte73;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)I")
	@Override
	public int method8493() {
		return 22;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub2_Sub2_Sub2) {
			@Pc(11) Class4_Sub2_Sub2_Sub2 local11 = (Class4_Sub2_Sub2_Sub2) arg2;
			if (this.aClass187_3 != null && local11.aClass187_3 != null) {
				this.aClass187_3.method8657(local11.aClass187_3, arg0, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return this.aBoolean335;
	}
}
