import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!rg;")
	public final Class173 aClass173_2;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
	private final boolean aBoolean167;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIIIIZIIII)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static22.method434(arg3, arg2));
		this.aClass173_2 = new Class173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean167 = arg1.anInt5227 != 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aClass173_2.anInt5376;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aClass173_2.anInt5373;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		@Pc(20) Class124 local20 = this.aClass173_2.method4528(false, arg0, super.anInt3089, true, super.anInt3103, 131072);
		if (local20 != null) {
			this.aClass173_2.method4535(super.anInt3089 >> 7, false, arg0, local20, super.anInt3103 >> 7, super.anInt3103 >> 7, super.anInt3089 >> 7);
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aClass173_2.anInt5356;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aClass173_2.method4533();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		this.aClass173_2.method4529(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.aClass173_2.method4528(false, arg0, 0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class124 local20 = this.aClass173_2.method4528(false, arg1, super.anInt3089, false, super.anInt3103, 65536);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class56 local27 = arg1.method4739();
			local27.method4683(super.anInt3089 + super.anInt3101, super.anInt3095, super.anInt3099 + super.anInt3103);
			return local20.method4116(arg2, arg0, local27, false);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		this.aClass173_2.method4536(arg0);
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I")
	@Override
	public int method2536() {
		return this.aClass173_2.method4530();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(21) Class124 local21 = this.aClass173_2.method4528(false, arg0, super.anInt3089, true, super.anInt3103, 1024);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class56 local28 = arg0.method4739();
		local28.method4683(super.anInt3101 + super.anInt3089, super.anInt3095, super.anInt3103 + super.anInt3099);
		@Pc(45) Class8_Sub7 local45 = null;
		if (this.aBoolean167) {
			local45 = Static97.method1655(1);
		}
		if (this.aClass173_2.aClass8_Sub5_7 == null) {
			local21.method4079(local28, local45 == null ? null : local45.aClass8_Sub2Array1[0], 0);
		} else {
			@Pc(61) Class9 local61 = this.aClass173_2.aClass8_Sub5_7.method3570();
			arg0.method4756(local21, local61, local28, local45 == null ? null : local45.aClass8_Sub2Array1[0]);
		}
		this.aClass173_2.method4535(super.anInt3089 >> 7, true, arg0, local21, super.anInt3103 >> 7, super.anInt3103 >> 7, super.anInt3089 >> 7);
		return local45;
	}
}
