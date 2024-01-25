import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class7_Sub3_Sub3 extends Class7_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "[Lclient!pf;")
	private static final Class187[] aClass187Array1 = new Class187[32];

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
	private final boolean aBoolean314;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "Z")
	private final boolean aBoolean315;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "S")
	private final short aShort61;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "Lclient!j;")
	private Class3_Sub4_Sub4 aClass3_Sub4_Sub4_4;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!c;")
	private Class9 aClass9_4;

	static {
		@Pc(69) Class187[] local69 = Static51.method1055();
		for (@Pc(71) int local71 = 0; local71 < local69.length; local71++) {
			aClass187Array1[local69[local71].anInt5402] = local69[local71];
		}
		new Class189("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIZIIIII)V")
	public Class7_Sub3_Sub3(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static416.method5337(arg11, arg10));
		this.aByte71 = (byte) arg2;
		this.aBoolean314 = arg1.anInt2768 != 0 && !arg6;
		super.anInt3665 = arg5;
		this.aByte70 = (byte) arg10;
		super.anInt3661 = arg3;
		this.aBoolean315 = arg6;
		this.aByte69 = (byte) arg11;
		this.aShort61 = (short) arg1.anInt2747;
		this.aBoolean313 = arg0.method5513() && arg1.aBoolean257 && !this.aBoolean315 && Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) != 0;
		@Pc(74) Class157 local74 = this.method2933(2048, this.aBoolean313, arg0);
		if (local74 != null) {
			this.aClass3_Sub4_Sub4_4 = local74.aClass3_Sub4_Sub4_5;
			this.aClass9_4 = local74.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aBoolean313;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
	@Override
	public int method2922() {
		return this.aClass9_4 == null ? 0 : this.aClass9_4.b();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZILclient!qa;)Lclient!mr;")
	private Class157 method2933(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class172 arg2) {
		@Pc(23) Class93 local23 = Static435.aClass30_4.method769(this.aShort61 & 0xFFFF);
		@Pc(31) Class159 local31;
		@Pc(35) Class159 local35;
		if (this.aBoolean315) {
			local31 = Static85.aClass159Array2[this.aByte71];
			local35 = Static26.aClass159Array1[0];
		} else {
			if (this.aByte71 < 3) {
				local35 = Static26.aClass159Array1[this.aByte71 + 1];
			} else {
				local35 = null;
			}
			local31 = Static26.aClass159Array1[this.aByte71];
		}
		return local23.method2060(super.anInt3661, super.anInt3665, this.aByte69, local35, arg0, arg1, arg2, local31, this.aByte70, super.anInt3663);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass9_4 == null) {
			return null;
		}
		@Pc(20) Class107 local20 = arg0.method5495();
		local20.R(super.anInt3664 + super.anInt3661, super.anInt3663, super.anInt3660 + super.anInt3665);
		@Pc(36) Class6_Sub1 local36 = null;
		if (this.aBoolean314) {
			local36 = Static43.method829(1);
		}
		this.aClass9_4.method5695(local20, local36 == null ? null : local36.aClass6_Sub5Array1[0], 0);
		return local36;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.method2938(arg0, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		@Pc(19) Class3_Sub4_Sub4 local19;
		if (this.aClass3_Sub4_Sub4_4 == null && this.aBoolean313) {
			@Pc(30) Class157 local30 = this.method2933(262144, true, arg0);
			local19 = local30 == null ? null : local30.aClass3_Sub4_Sub4_5;
		} else {
			local19 = this.aClass3_Sub4_Sub4_4;
			this.aClass3_Sub4_Sub4_4 = null;
		}
		if (local19 != null) {
			Static206.method3200(local19, this.aByte71, super.anInt3661, super.anInt3665, null);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class9 local9 = this.method2938(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class107 local14 = arg0.method5495();
			local14.R(super.anInt3661, super.anInt3663, super.anInt3665);
			return local9.method5693(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		@Pc(20) Class3_Sub4_Sub4 local20;
		if (this.aClass3_Sub4_Sub4_4 == null && this.aBoolean313) {
			@Pc(33) Class157 local33 = this.method2933(262144, true, arg0);
			local20 = local33 == null ? null : local33.aClass3_Sub4_Sub4_5;
		} else {
			local20 = this.aClass3_Sub4_Sub4_4;
			this.aClass3_Sub4_Sub4_4 = null;
		}
		if (local20 != null) {
			Static218.method3304(local20, this.aByte71, super.anInt3661, super.anInt3665, null);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
		if (this.aClass9_4 != null) {
			this.aClass9_4.method5682();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aShort61 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class9 method2938(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass9_4 != null && arg0.method5501(this.aClass9_4.n(), arg1) == 0) {
			return this.aClass9_4;
		} else {
			@Pc(32) Class157 local32 = this.method2933(arg1, false, arg0);
			return local32 == null ? null : local32.aClass9_6;
		}
	}
}
