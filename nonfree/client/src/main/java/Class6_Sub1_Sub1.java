import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!pd;")
	public final Class185 aClass185_1;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIZIII)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static444.method5713(arg8, arg9));
		this.aClass185_1 = new Class185(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5378, super.anInt5380, arg7, arg10);
		this.aBoolean11 = arg1.anInt2194 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		this.aClass185_1.method4130(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		this.aClass185_1.method4129(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class7 local16 = this.aClass185_1.method4121(false, arg2, false, super.anInt5380, 131072, super.anInt5378);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class116 local23 = arg2.method4678();
			local23.R(super.anInt5378, super.anInt5382, super.anInt5380);
			return local16.method4082(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(16) Class7 local16 = this.aClass185_1.method4121(true, arg0, true, super.anInt5380, 262144, super.anInt5378);
		if (local16 != null) {
			@Pc(29) int local29 = super.anInt5378 >> 7;
			@Pc(34) int local34 = super.anInt5380 >> 7;
			this.aClass185_1.method4120(local34, local29, false, local29, local34, arg0, local16);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(16) Class7 local16 = this.aClass185_1.method4121(true, arg0, false, super.anInt5380, 2048, super.anInt5378);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class116 local23 = arg0.method4678();
		local23.R(super.anInt5378, super.anInt5382, super.anInt5380);
		@Pc(33) Class41_Sub6 local33 = null;
		if (this.aBoolean11) {
			local33 = Static381.method5198(1);
		}
		if (this.aClass185_1.aClass41_Sub1_6 == null) {
			local16.method4091(local23, local33 == null ? null : local33.aClass41_Sub4Array1[0], 0);
		} else {
			@Pc(63) Class256 local63 = this.aClass185_1.aClass41_Sub1_6.method3166();
			arg0.method4676(local16, local63, local23, local33 == null ? null : local33.aClass41_Sub4Array1[0]);
		}
		@Pc(82) int local82 = super.anInt5378 >> 7;
		@Pc(87) int local87 = super.anInt5380 >> 7;
		this.aClass185_1.method4120(local87, local82, true, local82, local87, arg0, local16);
		return local33;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aClass185_1.anInt5364;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aClass185_1.method4124();
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aClass185_1.anInt5366;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aClass185_1.anInt5358;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.aClass185_1.method4121(false, arg1, false, 0, arg0, 0);
	}
}
