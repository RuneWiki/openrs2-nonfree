import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class41_Sub2_Sub2_Sub1 extends Class41_Sub2_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!em", name = "K", descriptor = "Lclient!lf;")
	private Class189 aClass189_2;

	@OriginalMember(owner = "client!em", name = "M", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!em", name = "bb", descriptor = "Lclient!rv;")
	public final Class300 aClass300_1;

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIIIII)V")
	public Class41_Sub2_Sub2_Sub1(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass300_1 = new Class300(arg0, arg1, arg10, arg11, super.aByte117, arg3, arg4, arg6, arg7, arg12);
		this.aBoolean236 = arg1.anInt7380 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(18) Class60 local18 = this.aClass300_1.method6510(true, arg0, super.anInt9442, false, 2048, super.anInt9444);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class11 local25 = arg0.method7397();
		local25.NA(super.anInt9444 + super.aShort35, super.anInt9443, super.aShort36 + super.anInt9442);
		@Pc(42) Class41_Sub10 local42 = null;
		if (this.aBoolean236) {
			local42 = Static458.method6411(1);
		}
		@Pc(54) int local54 = super.anInt9444 >> 9;
		@Pc(59) int local59 = super.anInt9442 >> 9;
		this.aClass300_1.method6518(true, local54, local59, local54, local25, local18, local59, arg0);
		if (Static453.aBoolean599) {
			local18.method7224(local25, local42 == null ? null : local42.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			local18.method7230(local25, local42 == null ? null : local42.aClass41_Sub8Array1[0], 0);
		}
		if (this.aClass300_1.aClass41_Sub9_5 != null) {
			@Pc(113) Class283 local113 = this.aClass300_1.aClass41_Sub9_5.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local113, Static340.anInt5962);
			} else {
				arg0.method7396(local113);
			}
		}
		this.aBoolean235 = local18.LA() || this.aClass300_1.aClass41_Sub9_5 != null;
		if (this.aClass189_2 == null) {
			this.aClass189_2 = Static36.method588(super.anInt9442, local18, super.anInt9443, super.anInt9444);
		} else {
			Static47.method7781(super.anInt9443, this.aClass189_2, local18, super.anInt9442, super.anInt9444);
		}
		return local42;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aClass300_1.anInt7838;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		this.aClass300_1.method6514(arg0);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aClass300_1.anInt7833;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return this.aClass189_2;
	}

	@OriginalMember(owner = "client!em", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		return arg0 < 119 ? -8 : this.aClass300_1.method6517(-1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aClass300_1.anInt7820;
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass300_1.method6515();
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		this.aClass300_1.method6519(arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class60 local20 = this.aClass300_1.method6510(false, arg0, super.anInt9442, false, 131072, super.anInt9444);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class11 local27 = arg0.method7397();
			local27.NA(super.aShort35 + super.anInt9444, super.anInt9443, super.aShort36 + super.anInt9442);
			return Static453.aBoolean599 ? local20.method7237(arg1, arg2, local27, false, Static340.anInt5962) : local20.method7246(arg1, arg2, local27, false);
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aClass300_1.method6511();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(16) Class60 local16 = this.aClass300_1.method6510(true, arg0, super.anInt9442, false, 262144, super.anInt9444);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9444 >> 9;
		@Pc(28) int local28 = super.anInt9442 >> 9;
		@Pc(31) Class11 local31 = arg0.method7397();
		local31.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		this.aClass300_1.method6518(false, local23, local28, local23, local31, local16, local28, arg0);
	}
}
