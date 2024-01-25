import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class1_Sub4_Sub5_Sub1 extends Class1_Sub4_Sub5 implements Interface19 {

	@OriginalMember(owner = "client!ov", name = "bb", descriptor = "Lclient!sr;")
	private Class308 aClass308_4;

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "client!ov", name = "W", descriptor = "Lclient!lq;")
	public final Class208 aClass208_3;

	@OriginalMember(owner = "client!ov", name = "P", descriptor = "Z")
	private final boolean aBoolean518;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIII)V")
	public Class1_Sub4_Sub5_Sub1(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static106.method2282(arg9, arg8));
		this.aClass208_3 = new Class208(arg0, arg1, arg8, arg9, super.aByte126, arg3, this, arg7, arg10);
		this.aBoolean518 = arg1.anInt2924 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		return arg0 == -117 ? this.aClass208_3.method5243(arg0 ^ -101) : -113;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aClass208_3.anInt6159;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		this.aClass208_3.method5251(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(12) Class57 local12 = this.aClass208_3.method5248(true, true, 262144, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9934 >> 9;
		@Pc(24) int local24 = super.anInt9935 >> 9;
		@Pc(27) Class8 local27 = arg0.method5007();
		local27.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		this.aClass208_3.method5247(local24, local27, local19, local19, local24, false, local12, arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class57 local12 = this.aClass208_3.method5248(false, false, 131072, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class8 local19 = arg0.method5007();
			local19.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local12.method7924(arg1, arg2, local19, false, Static6.anInt161) : local12.method7933(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass208_3.method5242();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(14) Class57 local14 = this.aClass208_3.method5248(true, false, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(26) Class8 local26 = arg0.method5007();
		local26.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(36) Class1_Sub8 local36 = null;
		if (this.aBoolean518) {
			local36 = Static361.method5833(1);
		}
		@Pc(48) int local48 = super.anInt9934 >> 9;
		@Pc(53) int local53 = super.anInt9935 >> 9;
		this.aClass208_3.method5247(local53, local26, local48, local48, local53, true, local14, arg0);
		if (Static361.aBoolean500) {
			local14.method7919(local26, local36 == null ? null : local36.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			local14.method7927(local26, local36 == null ? null : local36.aClass1_Sub9Array1[0], 0);
		}
		if (this.aClass208_3.aClass1_Sub2_4 != null) {
			@Pc(103) Class305 local103 = this.aClass208_3.aClass1_Sub2_4.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local103, Static6.anInt161);
			} else {
				arg0.method5017(local103);
			}
		}
		this.aBoolean517 = local14.LA() || this.aClass208_3.aClass1_Sub2_4 != null;
		if (this.aClass308_4 == null) {
			this.aClass308_4 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, local14);
		} else {
			Static2.method72(super.anInt9932, this.aClass308_4, local14, super.anInt9934, super.anInt9935);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aClass208_3.method5244();
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aClass208_3.anInt6147;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass208_3.anInt6161;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		this.aClass208_3.method5250(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return this.aClass308_4;
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean517;
	}
}
