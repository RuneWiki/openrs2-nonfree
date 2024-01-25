import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class5_Sub4_Sub2 extends Class5_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!rg;")
	public final Class173 aClass173_1;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
	private final boolean aBoolean138;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIIIIZIIIII)V")
	public Class5_Sub4_Sub2(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt5208 == 1, Static4.method37(arg2, arg3));
		this.aClass173_1 = new Class173(arg0, arg1, arg2, arg3, super.aByte69, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean138 = arg1.anInt5227 != 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		this.aClass173_1.method4529(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aClass173_1.anInt5376;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(18) Class124 local18 = this.aClass173_1.method4528(false, arg0, super.anInt5901, true, super.anInt5905, 1024);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class56 local30 = arg0.method4739();
		local30.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
		@Pc(40) Class8_Sub7 local40 = null;
		if (this.aBoolean138) {
			local40 = Static97.method1655(1);
		}
		if (this.aClass173_1.aClass8_Sub5_7 == null) {
			local18.method4079(local30, local40 == null ? null : local40.aClass8_Sub2Array1[0], 0);
		} else {
			@Pc(56) Class9 local56 = this.aClass173_1.aClass8_Sub5_7.method3570();
			arg0.method4756(local18, local56, local30, local40 == null ? null : local40.aClass8_Sub2Array1[0]);
		}
		this.aClass173_1.method4535(super.aShort86, true, arg0, local18, super.aShort88, super.aShort87, super.aShort89);
		return local40;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		@Pc(16) Class124 local16 = this.aClass173_1.method4528(true, arg0, super.anInt5901, true, super.anInt5905, 131072);
		if (local16 != null) {
			this.aClass173_1.method4535(super.aShort86, false, arg0, local16, super.aShort88, super.aShort87, super.aShort89);
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return this.aClass173_1.method4530();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aClass173_1.method4533();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aClass173_1.anInt5356;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		this.aClass173_1.method4536(arg0);
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class124 local16 = this.aClass173_1.method4528(false, arg1, super.anInt5901, false, super.anInt5905, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(27) Class56 local27 = arg1.method4739();
			local27.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
			return local16.method4116(arg2, arg0, local27, false);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aClass173_1.anInt5373;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.aClass173_1.method4528(false, arg0, 0, false, 0, arg1);
	}
}
