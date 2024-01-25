import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class41_Sub2_Sub1_Sub3 extends Class41_Sub2_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!mu", name = "O", descriptor = "Lclient!lf;")
	private Class189 aClass189_6;

	@OriginalMember(owner = "client!mu", name = "Z", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!mu", name = "R", descriptor = "Lclient!rv;")
	public final Class300 aClass300_3;

	@OriginalMember(owner = "client!mu", name = "W", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIIIIIII)V")
	public Class41_Sub2_Sub1_Sub3(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7399 == 1, Static301.method4555(arg12, arg13));
		this.aClass300_3 = new Class300(arg0, arg1, arg12, arg13, super.aByte117, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean446 = arg1.anInt7380 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aClass300_3.anInt7833;
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return this.aClass189_6;
	}

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		return arg0 <= 119 ? -107 : this.aClass300_3.method6517(-1);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		this.aClass300_3.method6514(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aClass300_3.anInt7838;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aClass300_3.method6511();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(16) Class60 local16 = this.aClass300_3.method6510(true, arg0, super.anInt9442, true, 262144, super.anInt9444);
		if (local16 != null) {
			@Pc(27) Class11 local27 = arg0.method7397();
			local27.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			this.aClass300_3.method6518(false, super.aShort147, super.aShort144, super.aShort146, local27, local16, super.aShort145, arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(18) Class60 local18 = this.aClass300_3.method6510(true, arg0, super.anInt9442, false, 2048, super.anInt9444);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class11 local25 = arg0.method7397();
		local25.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(35) Class41_Sub10 local35 = null;
		if (this.aBoolean446) {
			local35 = Static458.method6411(1);
		}
		this.aClass300_3.method6518(true, super.aShort147, super.aShort144, super.aShort146, local25, local18, super.aShort145, arg0);
		if (Static453.aBoolean599) {
			local18.method7224(local25, local35 == null ? null : local35.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			local18.method7230(local25, local35 == null ? null : local35.aClass41_Sub8Array1[0], 0);
		}
		if (this.aClass300_3.aClass41_Sub9_5 != null) {
			@Pc(96) Class283 local96 = this.aClass300_3.aClass41_Sub9_5.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local96, Static340.anInt5962);
			} else {
				arg0.method7396(local96);
			}
		}
		this.aBoolean447 = local18.LA() || this.aClass300_3.aClass41_Sub9_5 != null;
		if (this.aClass189_6 == null) {
			this.aClass189_6 = Static36.method588(super.anInt9442, local18, super.anInt9443, super.anInt9444);
		} else {
			Static47.method7781(super.anInt9443, this.aClass189_6, local18, super.anInt9442, super.anInt9444);
		}
		return local35;
	}

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aClass300_3.anInt7820;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class60 local21 = this.aClass300_3.method6510(false, arg0, super.anInt9442, false, 131072, super.anInt9444);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class11 local28 = arg0.method7397();
			local28.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local21.method7237(arg1, arg2, local28, false, Static340.anInt5962) : local21.method7246(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass300_3.method6515();
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		this.aClass300_3.method6519(arg0);
	}
}
