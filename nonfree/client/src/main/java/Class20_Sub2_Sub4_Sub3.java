import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class20_Sub2_Sub4_Sub3 extends Class20_Sub2_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Lclient!cu;")
	private Class60 aClass60_5;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lclient!sw;")
	public final Class304 aClass304_2;

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Z")
	private final boolean aBoolean520;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIIIIIII)V")
	public Class20_Sub2_Sub4_Sub3(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8401 == 1, Static153.method2405(arg12, arg13));
		this.aClass304_2 = new Class304(arg0, arg1, arg12, arg13, super.aByte116, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean520 = arg1.anInt8387 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aClass304_2.anInt8330;
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7265(null);
		}
		return this.aClass304_2.method6921(-92);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		this.aClass304_2.method6919(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class61 local16 = this.aClass304_2.method6925(false, super.anInt8796, super.anInt8795, false, arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class209 local23 = arg0.method6441();
			local23.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local16.method7606(arg2, arg1, local23, false, Static33.anInt894) : local16.method7590(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(18) Class61 local18 = this.aClass304_2.method6925(false, super.anInt8796, super.anInt8795, true, arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(31) Class209 local31 = arg0.method6441();
		local31.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(41) Class20_Sub8 local41 = null;
		if (this.aBoolean520) {
			local41 = Static593.method7897(1);
		}
		this.aClass304_2.method6920(local31, super.aShort99, local18, arg0, true, super.aShort98, super.aShort100, super.aShort97);
		if (Static188.aBoolean320) {
			local18.method7592(local31, local41 == null ? null : local41.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			local18.method7587(local31, local41 == null ? null : local41.aClass20_Sub3Array1[0], 0);
		}
		if (this.aClass304_2.aClass20_Sub5_7 != null) {
			@Pc(102) Class82 local102 = this.aClass304_2.aClass20_Sub5_7.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local102, Static33.anInt894);
			} else {
				arg0.method6460(local102);
			}
		}
		this.aBoolean519 = local18.LA() || this.aClass304_2.aClass20_Sub5_7 != null;
		if (this.aClass60_5 == null) {
			this.aClass60_5 = Static83.method1703(super.anInt8796, super.anInt8795, local18, super.anInt8790);
		} else {
			Static536.method7309(local18, super.anInt8795, super.anInt8796, this.aClass60_5, super.anInt8790);
		}
		return local41;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aClass304_2.method6917();
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass304_2.method6922();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		this.aClass304_2.method6923(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aClass304_2.anInt8328;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(16) Class61 local16 = this.aClass304_2.method6925(true, super.anInt8796, super.anInt8795, true, arg0, 262144);
		if (local16 != null) {
			@Pc(21) Class209 local21 = arg0.method6441();
			local21.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			this.aClass304_2.method6920(local21, super.aShort99, local16, arg0, false, super.aShort98, super.aShort100, super.aShort97);
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.aClass304_2.anInt8323;
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean519;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return this.aClass60_5;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
	}
}
