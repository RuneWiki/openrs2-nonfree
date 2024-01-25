import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class20_Sub2_Sub2_Sub2 extends Class20_Sub2_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!ufa", name = "fb", descriptor = "Lclient!cu;")
	private Class60 aClass60_8;

	@OriginalMember(owner = "client!ufa", name = "jb", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ufa", name = "lb", descriptor = "Lclient!sw;")
	public Class304 lb;

	@OriginalMember(owner = "client!ufa", name = "Y", descriptor = "Z")
	private final boolean aBoolean646;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIII)V")
	public Class20_Sub2_Sub2_Sub2(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static533.method7284(arg8, arg9));
		this.lb = new Class304(arg0, arg1, arg8, arg9, super.aByte116, arg3, super.anInt8796, super.anInt8795, arg7, arg10);
		this.aBoolean646 = arg1.anInt8387 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		this.lb.method6923(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.lb.anInt8328;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class61 local16 = this.lb.method6925(false, super.anInt8796, super.anInt8795, false, arg0, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class209 local23 = arg0.method6441();
			local23.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local16.method7606(arg2, arg1, local23, false, Static33.anInt894) : local16.method7590(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		this.lb.method6919(arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.lb.anInt8330;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.lb.method6917();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
	}

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(18) Class61 local18 = this.lb.method6925(false, super.anInt8796, super.anInt8795, true, arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class209 local25 = arg0.method6441();
		local25.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(35) Class20_Sub8 local35 = null;
		if (this.aBoolean646) {
			local35 = Static593.method7897(1);
		}
		@Pc(47) int local47 = super.anInt8796 >> 9;
		@Pc(52) int local52 = super.anInt8795 >> 9;
		this.lb.method6920(local25, local52, local18, arg0, true, local47, local47, local52);
		if (Static188.aBoolean320) {
			local18.method7592(local25, local35 == null ? null : local35.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			local18.method7587(local25, local35 == null ? null : local35.aClass20_Sub3Array1[0], 0);
		}
		if (this.lb.aClass20_Sub5_7 != null) {
			@Pc(102) Class82 local102 = this.lb.aClass20_Sub5_7.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local102, Static33.anInt894);
			} else {
				arg0.method6460(local102);
			}
		}
		this.aBoolean648 = local18.LA() || this.lb.aClass20_Sub5_7 != null;
		if (this.aClass60_8 == null) {
			this.aClass60_8 = Static83.method1703(super.anInt8796, super.anInt8795, local18, super.anInt8790);
		} else {
			Static536.method7309(local18, super.anInt8795, super.anInt8796, this.aClass60_8, super.anInt8790);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.lb.anInt8323;
	}

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.lb = null;
		}
		return this.lb.method6921(arg0 ^ 0xFFFFFF84);
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(16) Class61 local16 = this.lb.method6925(true, super.anInt8796, super.anInt8795, true, arg0, 262144);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8796 >> 9;
		@Pc(28) int local28 = super.anInt8795 >> 9;
		@Pc(31) Class209 local31 = arg0.method6441();
		local31.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		this.lb.method6920(local31, local28, local16, arg0, false, local23, local23, local28);
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return this.aClass60_8;
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.lb.method6922();
	}
}
