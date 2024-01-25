import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class41_Sub2_Sub3_Sub1 extends Class41_Sub2_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!uea", name = "eb", descriptor = "Lclient!lf;")
	private Class189 aClass189_7;

	@OriginalMember(owner = "client!uea", name = "T", descriptor = "Z")
	private boolean aBoolean654 = false;

	@OriginalMember(owner = "client!uea", name = "N", descriptor = "Lclient!rv;")
	public final Class300 aClass300_4;

	@OriginalMember(owner = "client!uea", name = "ab", descriptor = "Z")
	private final boolean aBoolean655;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIII)V")
	public Class41_Sub2_Sub3_Sub1(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static570.method7671(arg9, arg8));
		this.aClass300_4 = new Class300(arg0, arg1, arg8, arg9, super.aByte117, arg3, super.anInt9444, super.anInt9442, arg7, arg10);
		this.aBoolean655 = arg1.anInt7380 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aClass300_4.method6511();
	}

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return this.aClass189_7;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aClass300_4.anInt7820;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		this.aClass300_4.method6514(arg0);
	}

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aClass300_4.anInt7833;
	}

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean654;
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(24) Class60 local24 = this.aClass300_4.method6510(true, arg0, super.anInt9442, false, 2048, super.anInt9444);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class11 local31 = arg0.method7397();
		local31.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(41) Class41_Sub10 local41 = null;
		if (this.aBoolean655) {
			local41 = Static458.method6411(1);
		}
		@Pc(53) int local53 = super.anInt9444 >> 9;
		@Pc(58) int local58 = super.anInt9442 >> 9;
		this.aClass300_4.method6518(true, local53, local58, local53, local31, local24, local58, arg0);
		if (Static453.aBoolean599) {
			local24.method7224(local31, local41 == null ? null : local41.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			local24.method7230(local31, local41 == null ? null : local41.aClass41_Sub8Array1[0], 0);
		}
		if (this.aClass300_4.aClass41_Sub9_5 != null) {
			@Pc(108) Class283 local108 = this.aClass300_4.aClass41_Sub9_5.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local108, Static340.anInt5962);
			} else {
				arg0.method7396(local108);
			}
		}
		this.aBoolean654 = local24.LA() || this.aClass300_4.aClass41_Sub9_5 != null;
		if (this.aClass189_7 == null) {
			this.aClass189_7 = Static36.method588(super.anInt9442, local24, super.anInt9443, super.anInt9444);
		} else {
			Static47.method7781(super.anInt9443, this.aClass189_7, local24, super.anInt9442, super.anInt9444);
		}
		return local41;
	}

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass300_4.method6515();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(21) Class60 local21 = this.aClass300_4.method6510(true, arg0, super.anInt9442, true, 262144, super.anInt9444);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt9444 >> 9;
		@Pc(33) int local33 = super.anInt9442 >> 9;
		@Pc(36) Class11 local36 = arg0.method7397();
		local36.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		this.aClass300_4.method6518(false, local28, local33, local28, local36, local21, local33, arg0);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class60 local21 = this.aClass300_4.method6510(false, arg0, super.anInt9442, false, 131072, super.anInt9444);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class11 local28 = arg0.method7397();
			local28.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local21.method7237(arg1, arg2, local28, false, Static340.anInt5962) : local21.method7246(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		this.aClass300_4.method6519(arg0);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
	}

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aClass300_4.anInt7838;
	}

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.method7561();
		}
		return this.aClass300_4.method6517(-1);
	}
}
