import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class1_Sub4_Sub4_Sub2 extends Class1_Sub4_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!oga", name = "lb", descriptor = "I")
	public static int lb = -1;

	@OriginalMember(owner = "client!oga", name = "R", descriptor = "Lclient!sr;")
	private Class308 aClass308_3;

	@OriginalMember(owner = "client!oga", name = "eb", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!oga", name = "X", descriptor = "Lclient!lq;")
	public final Class208 aClass208_2;

	@OriginalMember(owner = "client!oga", name = "L", descriptor = "Z")
	private final boolean aBoolean511;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZII)V")
	public Class1_Sub4_Sub4_Sub2(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt2933);
		this.aClass208_2 = new Class208(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean511 = arg1.anInt2924 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aClass208_2.anInt6159;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(14) Class57 local14 = this.aClass208_2.method5248(true, false, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(26) Class8 local26 = arg0.method5007();
		local26.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(36) Class1_Sub8 local36 = null;
		if (this.aBoolean511) {
			local36 = Static361.method5833(1);
		}
		@Pc(48) int local48 = super.anInt9934 >> 9;
		@Pc(53) int local53 = super.anInt9935 >> 9;
		this.aClass208_2.method5247(local53, local26, local48, local48, local53, true, local14, arg0);
		if (Static361.aBoolean500) {
			local14.method7919(local26, local36 == null ? null : local36.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			local14.method7927(local26, local36 == null ? null : local36.aClass1_Sub9Array1[0], 0);
		}
		if (this.aClass208_2.aClass1_Sub2_4 != null) {
			@Pc(103) Class305 local103 = this.aClass208_2.aClass1_Sub2_4.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local103, Static6.anInt161);
			} else {
				arg0.method5017(local103);
			}
		}
		this.aBoolean512 = local14.LA() || this.aClass208_2.aClass1_Sub2_4 != null;
		if (this.aClass308_3 == null) {
			this.aClass308_3 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, local14);
		} else {
			Static2.method72(super.anInt9932, this.aClass308_3, local14, super.anInt9934, super.anInt9935);
		}
		return local36;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass208_2.anInt6161;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return this.aClass308_3;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		this.aClass208_2.method5251(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		this.aClass208_2.method5250(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aClass208_2.anInt6147;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			Static377.aClass223_50 = null;
		}
		return this.aClass208_2.method5243(arg0 + 133);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class57 local12 = this.aClass208_2.method5248(false, false, 131072, arg0);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class8 local24 = arg0.method5007();
			local24.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local12.method7924(arg1, arg2, local24, false, Static6.anInt161) : local12.method7933(arg1, arg2, local24, false);
		}
	}

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(12) Class57 local12 = this.aClass208_2.method5248(true, true, 262144, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9934 >> 9;
		@Pc(28) int local28 = super.anInt9935 >> 9;
		@Pc(31) Class8 local31 = arg0.method5007();
		local31.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		this.aClass208_2.method5247(local28, local31, local23, local23, local28, false, local12, arg0);
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aClass208_2.method5244();
	}

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass208_2.method5242();
	}

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}
}
