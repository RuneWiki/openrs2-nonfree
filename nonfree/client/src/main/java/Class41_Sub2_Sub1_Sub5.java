import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class41_Sub2_Sub1_Sub5 extends Class41_Sub2_Sub1 {

	@OriginalMember(owner = "client!rca", name = "S", descriptor = "Lclient!wca;")
	private Class41_Sub9 aClass41_Sub9_4;

	@OriginalMember(owner = "client!rca", name = "X", descriptor = "I")
	private int anInt7529 = 0;

	@OriginalMember(owner = "client!rca", name = "T", descriptor = "I")
	private final int anInt7527 = -1;

	@OriginalMember(owner = "client!rca", name = "bb", descriptor = "I")
	private int anInt7532 = 0;

	@OriginalMember(owner = "client!rca", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!rca", name = "Z", descriptor = "Z")
	public boolean aBoolean575 = false;

	@OriginalMember(owner = "client!rca", name = "mb", descriptor = "I")
	private int anInt7540 = 0;

	@OriginalMember(owner = "client!rca", name = "nb", descriptor = "I")
	private int anInt7541 = 0;

	@OriginalMember(owner = "client!rca", name = "P", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
	public final int anInt7524;

	@OriginalMember(owner = "client!rca", name = "rb", descriptor = "I")
	private final int anInt7544;

	@OriginalMember(owner = "client!rca", name = "cb", descriptor = "Lclient!lb;")
	private Class185 aClass185_2;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class41_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7524 = arg1 + arg2;
		this.anInt7540 = arg12;
		this.anInt7544 = arg0;
		@Pc(53) Class284 local53 = Static368.aClass278_1.method6127(this.anInt7544);
		@Pc(56) int local56 = local53.anInt7490;
		if (local56 == -1) {
			this.aBoolean575 = true;
		} else {
			this.aClass185_2 = Static545.aClass240_2.method5680(local56);
			this.aBoolean575 = false;
		}
		if (arg2 == this.anInt7524) {
			Static462.method6421(false, super.anInt9444, this.aClass185_2, super.aByte117, super.anInt9442, this.lb);
		}
	}

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	public void method6284() {
		if (this.aClass41_Sub9_4 != null) {
			this.aClass41_Sub9_4.method7726();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(11) Class60 local11 = this.method6287(arg0, 0, this.anInt7544);
		if (local11 != null) {
			@Pc(21) Class11 local21 = arg0.method7397();
			local21.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			this.method6285(arg0, local21, local11);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;Lclient!q;Lclient!da;I)V")
	private void method6285(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class60 arg2) {
		arg2.method7234(arg1);
		@Pc(13) Class248[] local13 = arg2.method7238();
		@Pc(16) Class281[] local16 = arg2.method7244();
		if ((this.aClass41_Sub9_4 == null || this.aClass41_Sub9_4.aBoolean722) && (local13 != null || local16 != null)) {
			this.aClass41_Sub9_4 = Static575.method7722(Static506.anInt8251, true);
		}
		if (this.aClass41_Sub9_4 != null) {
			this.aClass41_Sub9_4.method7732(arg0, (long) Static506.anInt8251, local13, local16);
			this.aClass41_Sub9_4.method7721(super.aByte117, super.aShort147, super.aShort146, super.aShort144, super.aShort145);
		}
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		return arg0 <= 119 ? 90 : this.anInt7532;
	}

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean574;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;IIB)Lclient!da;")
	private Class60 method6287(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class284 local16 = Static368.aClass278_1.method6127(arg2);
		@Pc(21) Class34 local21 = Static108.aClass34Array6[super.aByte117];
		@Pc(36) Class34 local36 = super.aByte118 >= 3 ? null : Static108.aClass34Array6[super.aByte118 + 1];
		return this.aBoolean575 ? local16.method6246(super.anInt9443, -1, arg0, Static545.aClass240_2, 0, super.anInt9442, local21, -1, super.anInt9444, local36, arg1) : local16.method6246(super.anInt9443, this.lb, arg0, Static545.aClass240_2, this.anInt7541, super.anInt9442, local21, this.anInt7527, super.anInt9444, local36, arg1);
	}

	@OriginalMember(owner = "client!rca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub9_4 != null) {
			this.aClass41_Sub9_4.method7726();
		}
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.anInt7529;
	}

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)V")
	public void method6288(@OriginalArg(0) int arg0) {
		if (this.aBoolean575) {
			return;
		}
		this.anInt7541 += arg0;
		while (this.anInt7541 > this.aClass185_2.anIntArray282[this.lb]) {
			this.anInt7541 -= this.aClass185_2.anIntArray282[this.lb];
			this.lb++;
			if (this.lb >= this.aClass185_2.anIntArray280.length) {
				this.aBoolean575 = true;
				break;
			}
		}
		if (!this.aBoolean575) {
			Static462.method6421(false, super.anInt9444, this.aClass185_2, super.aByte117, super.anInt9442, this.lb);
		}
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(20) Class60 local20 = this.method6287(arg0, (this.anInt7540 == 0 ? 0 : 5) | 0x800, this.anInt7544);
		if (local20 == null) {
			return null;
		}
		if (this.anInt7540 != 0) {
			local20.M(this.anInt7540 * 2048);
		}
		@Pc(37) Class11 local37 = arg0.method7397();
		local37.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		this.method6285(arg0, local37, local20);
		if (Static453.aBoolean599) {
			local20.method7224(local37, null, Static340.anInt5962, 0);
		} else {
			local20.method7230(local37, null, 0);
		}
		if (this.aClass41_Sub9_4 != null) {
			@Pc(73) Class283 local73 = this.aClass41_Sub9_4.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local73, Static340.anInt5962);
			} else {
				arg0.method7396(local73);
			}
		}
		this.aBoolean574 = local20.LA();
		this.anInt7529 = local20.J();
		this.anInt7532 = local20.RA();
		return null;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return null;
	}
}
