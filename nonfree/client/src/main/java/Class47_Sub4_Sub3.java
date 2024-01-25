import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class47_Sub4_Sub3 extends Class47_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!ot", name = "Z", descriptor = "Z")
	private final boolean aBoolean399;

	@OriginalMember(owner = "client!ot", name = "J", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ot", name = "Y", descriptor = "S")
	private final short aShort77;

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "Z")
	private final boolean aBoolean397;

	@OriginalMember(owner = "client!ot", name = "O", descriptor = "Z")
	private final boolean aBoolean398;

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "Lclient!j;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!ot", name = "db", descriptor = "Lclient!c;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIZIIIII)V")
	public Class47_Sub4_Sub3(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static264.method3706(arg11, arg10));
		this.aBoolean399 = arg1.anInt550 != 0 && !arg6;
		super.anInt4954 = arg5;
		this.aByte68 = (byte) arg11;
		this.aShort77 = (short) arg1.anInt545;
		this.aByte70 = (byte) arg2;
		this.aByte69 = (byte) arg10;
		this.aBoolean397 = arg6;
		super.anInt4958 = arg3;
		this.aBoolean398 = arg0.method4638() && arg1.aBoolean44 && !this.aBoolean397 && Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) != 0;
		@Pc(77) Class209 local77 = this.method4061(this.aBoolean398, 2048, arg0);
		if (local77 != null) {
			this.aClass1_Sub1_Sub3_4 = local77.aClass1_Sub1_Sub3_5;
			this.aClass37_5 = local77.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(15) Class37 local15 = this.method4059(arg2, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class43 local20 = arg2.method4588();
			local20.R(super.anInt4958, super.anInt4960, super.anInt4954);
			return local15.method4166(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aBoolean398;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!qa;IB)Lclient!c;")
	private Class37 method4059(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass37_5 != null && arg0.method4634(this.aClass37_5.n(), arg1) == 0) {
			return this.aClass37_5;
		} else {
			@Pc(31) Class209 local31 = this.method4061(false, arg1, arg0);
			return local31 == null ? null : local31.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method4059(arg1, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aShort77 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)I")
	@Override
	public int method4049() {
		return this.aClass37_5 == null ? 0 : this.aClass37_5.b();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		@Pc(20) Class1_Sub1_Sub3 local20;
		if (this.aClass1_Sub1_Sub3_4 == null && this.aBoolean398) {
			@Pc(33) Class209 local33 = this.method4061(true, 262144, arg0);
			local20 = local33 == null ? null : local33.aClass1_Sub1_Sub3_5;
		} else {
			local20 = this.aClass1_Sub1_Sub3_4;
			this.aClass1_Sub1_Sub3_4 = null;
		}
		if (local20 != null) {
			Static317.method4368(local20, this.aByte70, super.anInt4958, super.anInt4954, null);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass37_5 == null) {
			return null;
		}
		@Pc(16) Class43 local16 = arg0.method4588();
		local16.R(super.anInt4958 + super.anInt4956, super.anInt4960, super.anInt4954 + super.anInt4950);
		@Pc(33) Class36_Sub1 local33 = null;
		if (this.aBoolean399) {
			local33 = Static309.method4241(1);
		}
		this.aClass37_5.method4167(local16, local33 == null ? null : local33.aClass36_Sub8Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZILclient!qa;I)Lclient!rl;")
	private Class209 method4061(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2) {
		@Pc(19) Class29 local19 = Static251.aClass207_2.method4977(this.aShort77 & 0xFFFF);
		@Pc(44) Class70 local44;
		@Pc(35) Class70 local35;
		if (this.aBoolean397) {
			local35 = Static60.aClass70Array1[0];
			local44 = Static315.aClass70Array3[this.aByte70];
		} else {
			if (this.aByte70 < 3) {
				local35 = Static60.aClass70Array1[this.aByte70 + 1];
			} else {
				local35 = null;
			}
			local44 = Static60.aClass70Array1[this.aByte70];
		}
		return local19.method464(arg2, local35, super.anInt4960, this.aByte69, super.anInt4958, this.aByte68, arg0, super.anInt4954, arg1, local44);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		@Pc(25) Class1_Sub1_Sub3 local25;
		if (this.aClass1_Sub1_Sub3_4 == null && this.aBoolean398) {
			@Pc(18) Class209 local18 = this.method4061(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub3_5;
		} else {
			local25 = this.aClass1_Sub1_Sub3_4;
			this.aClass1_Sub1_Sub3_4 = null;
		}
		if (local25 != null) {
			Static1.method23(local25, this.aByte70, super.anInt4958, super.anInt4954, null);
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
		if (this.aClass37_5 != null) {
			this.aClass37_5.method4158();
		}
	}
}
