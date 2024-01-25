import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class20_Sub2_Sub1_Sub2 extends Class20_Sub2_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lclient!cu;")
	private Class60 aClass60_4;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!sw;")
	public final Class304 aClass304_1;

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIIIII)V")
	public Class20_Sub2_Sub1_Sub2(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass304_1 = new Class304(arg0, arg1, arg10, arg11, super.aByte116, arg3, arg4, arg6, arg7, arg12);
		this.aBoolean515 = arg1.anInt8387 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(16) Class61 local16 = this.aClass304_1.method6925(false, super.anInt8796, super.anInt8795, true, arg0, 262144);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8796 >> 9;
		@Pc(28) int local28 = super.anInt8795 >> 9;
		@Pc(31) Class209 local31 = arg0.method6441();
		local31.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		this.aClass304_1.method6920(local31, local28, local16, arg0, false, local23, local23, local28);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class61 local16 = this.aClass304_1.method6925(false, super.anInt8796, super.anInt8795, false, arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class209 local23 = arg0.method6441();
			local23.NA(super.aShort70 + super.anInt8796, super.anInt8790, super.aShort71 + super.anInt8795);
			return Static188.aBoolean320 ? local16.method7606(arg2, arg1, local23, false, Static33.anInt894) : local16.method7590(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(18) Class61 local18 = this.aClass304_1.method6925(false, super.anInt8796, super.anInt8795, true, arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class209 local25 = arg0.method6441();
		local25.NA(super.anInt8796 + super.aShort70, super.anInt8790, super.anInt8795 + super.aShort71);
		@Pc(48) Class20_Sub8 local48 = null;
		if (this.aBoolean515) {
			local48 = Static593.method7897(1);
		}
		@Pc(60) int local60 = super.anInt8796 >> 9;
		@Pc(65) int local65 = super.anInt8795 >> 9;
		this.aClass304_1.method6920(local25, local65, local18, arg0, true, local60, local60, local65);
		if (Static188.aBoolean320) {
			local18.method7592(local25, local48 == null ? null : local48.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			local18.method7587(local25, local48 == null ? null : local48.aClass20_Sub3Array1[0], 0);
		}
		if (this.aClass304_1.aClass20_Sub5_7 != null) {
			@Pc(115) Class82 local115 = this.aClass304_1.aClass20_Sub5_7.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local115, Static33.anInt894);
			} else {
				arg0.method6460(local115);
			}
		}
		this.aBoolean514 = local18.LA() || this.aClass304_1.aClass20_Sub5_7 != null;
		if (this.aClass60_4 == null) {
			this.aClass60_4 = Static83.method1703(super.anInt8796, super.anInt8795, local18, super.anInt8790);
		} else {
			Static536.method7309(local18, super.anInt8795, super.anInt8796, this.aClass60_4, super.anInt8790);
		}
		return local48;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return this.aClass60_4;
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean514;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aClass304_1.anInt8330;
	}

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static422.aClass1_Sub28_1 = null;
		}
		return this.aClass304_1.method6921(-94);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.aClass304_1.anInt8323;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aClass304_1.method6917();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		this.aClass304_1.method6923(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aClass304_1.anInt8328;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass304_1.method6922();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		this.aClass304_1.method6919(arg0);
	}
}
