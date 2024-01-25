import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!ur", name = "A", descriptor = "Lclient!rg;")
	public final Class173 aClass173_4;

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "Z")
	private final boolean aBoolean430;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIIIIZI)V")
	public Class5_Sub5_Sub2(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static56.method923(arg3, arg2));
		this.aClass173_4 = new Class173(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt6288, super.anInt6286, arg9, arg10);
		this.aBoolean430 = arg1.anInt5227 != 0;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aClass173_4.anInt5356;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class124 local16 = this.aClass173_4.method4528(false, arg1, super.anInt6288, false, super.anInt6286, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class56 local23 = arg1.method4739();
			local23.method4683(super.anInt6288, super.anInt6284, super.anInt6286);
			return local16.method4116(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(18) Class124 local18 = this.aClass173_4.method4528(false, arg0, super.anInt6288, true, super.anInt6286, 1024);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class56 local30 = arg0.method4739();
		local30.method4683(super.anInt6288, super.anInt6284, super.anInt6286);
		@Pc(40) Class8_Sub7 local40 = null;
		if (this.aBoolean430) {
			local40 = Static97.method1655(1);
		}
		if (this.aClass173_4.aClass8_Sub5_7 == null) {
			local18.method4079(local30, local40 == null ? null : local40.aClass8_Sub2Array1[0], 0);
		} else {
			@Pc(56) Class9 local56 = this.aClass173_4.aClass8_Sub5_7.method3570();
			arg0.method4756(local18, local56, local30, local40 == null ? null : local40.aClass8_Sub2Array1[0]);
		}
		this.aClass173_4.method4535(super.anInt6288 >> 7, true, arg0, local18, super.anInt6286 >> 7, super.anInt6286 >> 7, super.anInt6288 >> 7);
		return local40;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.aClass173_4.method4528(false, arg0, 0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aClass173_4.anInt5376;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		this.aClass173_4.method4529(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aClass173_4.anInt5373;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		this.aClass173_4.method4536(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aClass173_4.method4533();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		@Pc(21) Class124 local21 = this.aClass173_4.method4528(true, arg0, super.anInt6288, true, super.anInt6286, 131072);
		if (local21 != null) {
			this.aClass173_4.method4535(super.anInt6288 >> 7, false, arg0, local21, super.anInt6286 >> 7, super.anInt6286 >> 7, super.anInt6288 >> 7);
		}
	}
}
