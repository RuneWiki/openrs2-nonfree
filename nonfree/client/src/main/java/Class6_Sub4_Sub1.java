import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!pd;")
	public final Class185 aClass185_4;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIZII)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean172, arg1.aBoolean173);
		this.aClass185_4 = new Class185(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean265 = arg1.anInt2194 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aClass185_4.anInt5366;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(23) Class7 local23 = this.aClass185_4.method4121(true, arg0, true, super.anInt4001, 262144, super.anInt4003);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt4003 >> 7;
			@Pc(35) int local35 = super.anInt4001 >> 7;
			this.aClass185_4.method4120(local35, local30, false, local30, local35, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		this.aClass185_4.method4130(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aClass185_4.anInt5364;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aClass185_4.method4124();
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.aClass185_4.method4121(false, arg1, false, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class7 local16 = this.aClass185_4.method4121(false, arg2, false, super.anInt4001, 131072, super.anInt4003);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class116 local29 = arg2.method4678();
			local29.R(super.anInt4003, super.anInt4002, super.anInt4001);
			return local16.method4082(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aClass185_4.anInt5358;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(16) Class7 local16 = this.aClass185_4.method4121(true, arg0, false, super.anInt4001, 2048, super.anInt4003);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class116 local23 = arg0.method4678();
		local23.R(super.anInt4003, super.anInt4002, super.anInt4001);
		@Pc(33) Class41_Sub6 local33 = null;
		if (this.aBoolean265) {
			local33 = Static381.method5198(1);
		}
		if (this.aClass185_4.aClass41_Sub1_6 == null) {
			local16.method4091(local23, local33 == null ? null : local33.aClass41_Sub4Array1[0], 0);
		} else {
			@Pc(57) Class256 local57 = this.aClass185_4.aClass41_Sub1_6.method3166();
			arg0.method4676(local16, local57, local23, local33 == null ? null : local33.aClass41_Sub4Array1[0]);
		}
		@Pc(90) int local90 = super.anInt4003 >> 7;
		@Pc(95) int local95 = super.anInt4001 >> 7;
		this.aClass185_4.method4120(local95, local90, true, local90, local95, arg0, local16);
		return local33;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		this.aClass185_4.method4129(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}
}
