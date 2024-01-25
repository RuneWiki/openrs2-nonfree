import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class7_Sub1_Sub3 extends Class7_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!ro", name = "bb", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!ro", name = "W", descriptor = "Z")
	private final boolean aBoolean523;

	@OriginalMember(owner = "client!ro", name = "T", descriptor = "B")
	private final byte aByte95;

	@OriginalMember(owner = "client!ro", name = "E", descriptor = "S")
	private final short aShort88;

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "Z")
	private final boolean aBoolean522;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "Lclient!c;")
	private Class9 aClass9_7;

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "Lclient!j;")
	private Class3_Sub4_Sub4 aClass3_Sub4_Sub4_6;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!qa;Lclient!gm;IIIIZIZ)V")
	public Class7_Sub1_Sub3(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean252, arg1.aBoolean253);
		super.anInt5990 = arg3;
		this.aBoolean521 = arg8;
		this.aBoolean524 = arg6;
		this.aByte94 = (byte) arg7;
		this.aBoolean523 = arg1.anInt2768 != 0 && !arg6;
		this.aByte95 = (byte) arg2;
		super.anInt5987 = arg5;
		this.aShort88 = (short) arg1.anInt2747;
		this.aBoolean522 = arg0.method5513() && arg1.aBoolean257 && !this.aBoolean524 && Static374.aClass20_Sub1_1.method1806(Static105.anInt2382) != 0;
		@Pc(64) int local64 = 2048;
		if (this.aBoolean521) {
			local64 |= 0x10000;
		}
		@Pc(79) Class157 local79 = this.method4697(arg0, local64, this.aBoolean522);
		if (local79 != null) {
			this.aClass9_7 = local79.aClass9_6;
			this.aClass3_Sub4_Sub4_6 = local79.aClass3_Sub4_Sub4_5;
			if (this.aBoolean521) {
				this.aClass9_7 = this.aClass9_7.method5699((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return this.aBoolean522;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
		@Pc(20) Class3_Sub4_Sub4 local20;
		if (this.aClass3_Sub4_Sub4_6 == null && this.aBoolean522) {
			@Pc(31) Class157 local31 = this.method4697(arg0, 262144, true);
			local20 = local31 == null ? null : local31.aClass3_Sub4_Sub4_5;
		} else {
			local20 = this.aClass3_Sub4_Sub4_6;
			this.aClass3_Sub4_Sub4_6 = null;
		}
		if (local20 != null) {
			Static206.method3200(local20, this.aByte95, super.anInt5990, super.anInt5987, null);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	private Class9 method4695(@OriginalArg(0) int arg0, @OriginalArg(2) Class172 arg1) {
		if (this.aClass9_7 != null && arg1.method5501(this.aClass9_7.n(), arg0) == 0) {
			return this.aClass9_7;
		} else {
			@Pc(34) Class157 local34 = this.method4697(arg1, arg0, false);
			return local34 == null ? null : local34.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return 22;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass9_7 == null) {
			return null;
		}
		@Pc(11) Class107 local11 = arg0.method5495();
		local11.R(super.anInt5990, super.anInt5985, super.anInt5987);
		@Pc(21) Class6_Sub1 local21 = null;
		if (this.aBoolean523) {
			local21 = Static43.method829(1);
		}
		this.aClass9_7.method5695(local11, local21 == null ? null : local21.aClass6_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class9 local9 = this.method4695(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class107 local14 = arg0.method5495();
			local14.R(super.anInt5990, super.anInt5985, super.anInt5987);
			return local9.method5693(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
		@Pc(18) Class3_Sub4_Sub4 local18;
		if (this.aClass3_Sub4_Sub4_6 == null && this.aBoolean522) {
			@Pc(29) Class157 local29 = this.method4697(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass3_Sub4_Sub4_5;
		} else {
			local18 = this.aClass3_Sub4_Sub4_6;
			this.aClass3_Sub4_Sub4_6 = null;
		}
		if (local18 != null) {
			Static218.method3304(local18, this.aByte95, super.anInt5990, super.anInt5987, null);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!qa;IIZ)Lclient!mr;")
	private Class157 method4697(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class93 local17 = Static435.aClass30_4.method769(this.aShort88 & 0xFFFF);
		@Pc(25) Class159 local25;
		@Pc(29) Class159 local29;
		if (this.aBoolean524) {
			local25 = Static85.aClass159Array2[this.aByte95];
			local29 = Static26.aClass159Array1[0];
		} else {
			if (this.aByte95 < 3) {
				local29 = Static26.aClass159Array1[this.aByte95 + 1];
			} else {
				local29 = null;
			}
			local25 = Static26.aClass159Array1[this.aByte95];
		}
		return local17.method2060(super.anInt5990, super.anInt5987, this.aByte94, local29, arg1, arg2, arg0, local25, 22, super.anInt5985);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return this.aShort88 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!(arg3 instanceof Class7_Sub1_Sub3)) {
			return;
		}
		@Pc(14) Class7_Sub1_Sub3 local14 = (Class7_Sub1_Sub3) arg3;
		if (this.aClass9_7 != null && local14.aClass9_7 != null) {
			this.aClass9_7.method5696(local14.aClass9_7, arg0, arg5, arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		this.aBoolean521 = false;
		if (this.aClass9_7 != null) {
			this.aClass9_7.u(this.aClass9_7.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return this.method4695(arg1, arg0);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return this.aBoolean521;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
		if (this.aClass9_7 != null) {
			this.aClass9_7.method5682();
		}
	}
}
