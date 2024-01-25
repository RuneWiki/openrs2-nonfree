import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class41_Sub2_Sub5_Sub1 extends Class41_Sub2_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "Lclient!lf;")
	private Class189 aClass189_4;

	@OriginalMember(owner = "client!jba", name = "X", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "Lclient!rv;")
	public final Class300 aClass300_2;

	@OriginalMember(owner = "client!jba", name = "R", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZII)V")
	public Class41_Sub2_Sub5_Sub1(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.lb);
		this.aClass300_2 = new Class300(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean313 = arg1.anInt7380 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean314;
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.method7562();
		}
		return this.aClass300_2.method6517(-1);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(18) Class60 local18 = this.aClass300_2.method6510(true, arg0, super.anInt9442, false, 2048, super.anInt9444);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class11 local30 = arg0.method7397();
		local30.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(40) Class41_Sub10 local40 = null;
		if (this.aBoolean313) {
			local40 = Static458.method6411(1);
		}
		@Pc(52) int local52 = super.anInt9444 >> 9;
		@Pc(57) int local57 = super.anInt9442 >> 9;
		this.aClass300_2.method6518(true, local52, local57, local52, local30, local18, local57, arg0);
		if (Static453.aBoolean599) {
			local18.method7224(local30, local40 == null ? null : local40.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			local18.method7230(local30, local40 == null ? null : local40.aClass41_Sub8Array1[0], 0);
		}
		if (this.aClass300_2.aClass41_Sub9_5 != null) {
			@Pc(107) Class283 local107 = this.aClass300_2.aClass41_Sub9_5.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local107, Static340.anInt5962);
			} else {
				arg0.method7396(local107);
			}
		}
		this.aBoolean314 = local18.LA() || this.aClass300_2.aClass41_Sub9_5 != null;
		if (this.aClass189_4 == null) {
			this.aClass189_4 = Static36.method588(super.anInt9442, local18, super.anInt9443, super.anInt9444);
		} else {
			Static47.method7781(super.anInt9443, this.aClass189_4, local18, super.anInt9442, super.anInt9444);
		}
		return local40;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class60 local16 = this.aClass300_2.method6510(false, arg0, super.anInt9442, false, 131072, super.anInt9444);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class11 local28 = arg0.method7397();
			local28.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local16.method7237(arg1, arg2, local28, false, Static340.anInt5962) : local16.method7246(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(22) Class60 local22 = this.aClass300_2.method6510(true, arg0, super.anInt9442, true, 262144, super.anInt9444);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt9444 >> 9;
		@Pc(34) int local34 = super.anInt9442 >> 9;
		@Pc(37) Class11 local37 = arg0.method7397();
		local37.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		this.aClass300_2.method6518(false, local29, local34, local29, local37, local22, local34, arg0);
	}

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aClass300_2.method6511();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return this.aClass189_4;
	}

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass300_2.method6515();
	}

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aClass300_2.anInt7820;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		this.aClass300_2.method6514(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		this.aClass300_2.method6519(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aClass300_2.anInt7833;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aClass300_2.anInt7838;
	}
}
