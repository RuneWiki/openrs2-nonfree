import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class20_Sub2_Sub3_Sub2 extends Class20_Sub2_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "Lclient!cu;")
	private Class60 aClass60_6;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "client!qh", name = "gb", descriptor = "Lclient!sw;")
	public final Class304 aClass304_3;

	@OriginalMember(owner = "client!qh", name = "db", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZII)V")
	public Class20_Sub2_Sub3_Sub2(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8384);
		this.aClass304_3 = new Class304(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean526 = arg1.anInt8387 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		this.aClass304_3.method6919(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class61 local16 = this.aClass304_3.method6925(false, super.anInt8796, super.anInt8795, false, arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class209 local23 = arg0.method6441();
			local23.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local16.method7606(arg2, arg1, local23, false, Static33.anInt894) : local16.method7590(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		this.aClass304_3.method6923(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return this.aClass60_6;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean525;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.aClass304_3.anInt8323;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aClass304_3.method6917();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aClass304_3.anInt8330;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(16) Class61 local16 = this.aClass304_3.method6925(true, super.anInt8796, super.anInt8795, true, arg0, 262144);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8796 >> 9;
		@Pc(28) int local28 = super.anInt8795 >> 9;
		@Pc(31) Class209 local31 = arg0.method6441();
		local31.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		this.aClass304_3.method6920(local31, local28, local16, arg0, false, local23, local23, local28);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aClass304_3.anInt8328;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass304_3.method6922();
	}

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aClass304_3.method6921(arg0 ^ -63) : -103;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(18) Class61 local18 = this.aClass304_3.method6925(false, super.anInt8796, super.anInt8795, true, arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(33) Class209 local33 = arg0.method6441();
		local33.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(43) Class20_Sub8 local43 = null;
		if (this.aBoolean526) {
			local43 = Static593.method7897(1);
		}
		@Pc(55) int local55 = super.anInt8796 >> 9;
		@Pc(60) int local60 = super.anInt8795 >> 9;
		this.aClass304_3.method6920(local33, local60, local18, arg0, true, local55, local55, local60);
		if (Static188.aBoolean320) {
			local18.method7592(local33, local43 == null ? null : local43.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			local18.method7587(local33, local43 == null ? null : local43.aClass20_Sub3Array1[0], 0);
		}
		if (this.aClass304_3.aClass20_Sub5_7 != null) {
			@Pc(110) Class82 local110 = this.aClass304_3.aClass20_Sub5_7.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local110, Static33.anInt894);
			} else {
				arg0.method6460(local110);
			}
		}
		this.aBoolean525 = local18.LA() || this.aClass304_3.aClass20_Sub5_7 != null;
		if (this.aClass60_6 == null) {
			this.aClass60_6 = Static83.method1703(super.anInt8796, super.anInt8795, local18, super.anInt8790);
		} else {
			Static536.method7309(local18, super.anInt8795, super.anInt8796, this.aClass60_6, super.anInt8790);
		}
		return local43;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}
}
