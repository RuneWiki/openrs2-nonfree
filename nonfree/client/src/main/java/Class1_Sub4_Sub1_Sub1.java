import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class1_Sub4_Sub1_Sub1 extends Class1_Sub4_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!is", name = "X", descriptor = "Lclient!sr;")
	private Class308 aClass308_1;

	@OriginalMember(owner = "client!is", name = "ab", descriptor = "Z")
	private boolean aBoolean312 = false;

	@OriginalMember(owner = "client!is", name = "W", descriptor = "Lclient!lq;")
	public final Class208 aClass208_1;

	@OriginalMember(owner = "client!is", name = "U", descriptor = "Z")
	private final boolean aBoolean311;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIIIII)V")
	public Class1_Sub4_Sub1_Sub1(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass208_1 = new Class208(arg0, arg1, arg10, arg11, super.aByte126, arg3, this, arg7, arg12);
		this.aBoolean311 = arg1.anInt2924 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			Static226.anInt4164 = -121;
		}
		return this.aClass208_1.method5243(arg0 ^ 0xFFFFFF9B);
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass208_1.anInt6161;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		this.aClass208_1.method5251(arg0);
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass208_1.method5242();
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return this.aClass308_1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		this.aClass208_1.method5250(arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class57 local17 = this.aClass208_1.method5248(false, false, 131072, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class8 local24 = arg0.method5007();
			local24.NA(super.anInt9934 + super.aShort86, super.anInt9932, super.anInt9935 + super.aShort87);
			return Static361.aBoolean500 ? local17.method7924(arg1, arg2, local24, false, Static6.anInt161) : local17.method7933(arg1, arg2, local24, false);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(12) Class57 local12 = this.aClass208_1.method5248(true, false, 262144, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9934 >> 9;
		@Pc(24) int local24 = super.anInt9935 >> 9;
		@Pc(27) Class8 local27 = arg0.method5007();
		local27.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		this.aClass208_1.method5247(local24, local27, local19, local19, local24, false, local12, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(14) Class57 local14 = this.aClass208_1.method5248(true, false, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class8 local21 = arg0.method5007();
		local21.NA(super.aShort86 + super.anInt9934, super.anInt9932, super.aShort87 + super.anInt9935);
		@Pc(43) Class1_Sub8 local43 = null;
		if (this.aBoolean311) {
			local43 = Static361.method5833(1);
		}
		@Pc(55) int local55 = super.anInt9934 >> 9;
		@Pc(60) int local60 = super.anInt9935 >> 9;
		this.aClass208_1.method5247(local60, local21, local55, local55, local60, true, local14, arg0);
		if (Static361.aBoolean500) {
			local14.method7919(local21, local43 == null ? null : local43.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			local14.method7927(local21, local43 == null ? null : local43.aClass1_Sub9Array1[0], 0);
		}
		if (this.aClass208_1.aClass1_Sub2_4 != null) {
			@Pc(110) Class305 local110 = this.aClass208_1.aClass1_Sub2_4.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local110, Static6.anInt161);
			} else {
				arg0.method5017(local110);
			}
		}
		this.aBoolean312 = local14.LA() || this.aClass208_1.aClass1_Sub2_4 != null;
		if (this.aClass308_1 == null) {
			this.aClass308_1 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, local14);
		} else {
			Static2.method72(super.anInt9932, this.aClass308_1, local14, super.anInt9934, super.anInt9935);
		}
		return local43;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aClass208_1.anInt6147;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aClass208_1.method5244();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aClass208_1.anInt6159;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean312;
	}
}
