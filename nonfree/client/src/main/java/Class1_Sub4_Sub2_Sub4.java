import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub4_Sub2_Sub4 extends Class1_Sub4_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!uo", name = "gb", descriptor = "Lclient!sr;")
	private Class308 aClass308_8;

	@OriginalMember(owner = "client!uo", name = "db", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "Lclient!lq;")
	public final Class208 aClass208_4;

	@OriginalMember(owner = "client!uo", name = "cb", descriptor = "Z")
	private boolean aBoolean676;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIIIIIII)V")
	public Class1_Sub4_Sub2_Sub4(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2922 == 1, Static276.method4777(arg12, arg13));
		this.aClass208_4 = new Class208(arg0, arg1, arg12, arg13, super.aByte126, arg3, this, arg7, arg14);
		this.aBoolean676 = arg1.anInt2924 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		this.aClass208_4.method5251(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass208_4.anInt6161;
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.aBoolean676 = true;
		}
		return this.aClass208_4.method5243(16);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(12) Class57 local12 = this.aClass208_4.method5248(true, true, 262144, arg0);
		if (local12 != null) {
			@Pc(17) Class8 local17 = arg0.method5007();
			local17.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			this.aClass208_4.method5247(super.aShort119, local17, super.aShort121, super.aShort122, super.aShort120, false, local12, arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aClass208_4.anInt6159;
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return this.aClass308_8;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(14) Class57 local14 = this.aClass208_4.method5248(true, false, 2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class8 local21 = arg0.method5007();
		local21.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(31) Class1_Sub8 local31 = null;
		if (this.aBoolean676) {
			local31 = Static361.method5833(1);
		}
		this.aClass208_4.method5247(super.aShort119, local21, super.aShort121, super.aShort122, super.aShort120, true, local14, arg0);
		if (Static361.aBoolean500) {
			local14.method7919(local21, local31 == null ? null : local31.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			local14.method7927(local21, local31 == null ? null : local31.aClass1_Sub9Array1[0], 0);
		}
		if (this.aClass208_4.aClass1_Sub2_4 != null) {
			@Pc(99) Class305 local99 = this.aClass208_4.aClass1_Sub2_4.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local99, Static6.anInt161);
			} else {
				arg0.method5017(local99);
			}
		}
		this.aBoolean677 = local14.LA() || this.aClass208_4.aClass1_Sub2_4 != null;
		if (this.aClass308_8 == null) {
			this.aClass308_8 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, local14);
		} else {
			Static2.method72(super.anInt9932, this.aClass308_8, local14, super.anInt9934, super.anInt9935);
		}
		return local31;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class57 local18 = this.aClass208_4.method5248(false, false, 131072, arg0);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class8 local25 = arg0.method5007();
			local25.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local18.method7924(arg1, arg2, local25, false, Static6.anInt161) : local18.method7933(arg1, arg2, local25, false);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aClass208_4.anInt6147;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aClass208_4.method5244();
	}

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		this.aClass208_4.method5250(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass208_4.method5242();
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean677;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
