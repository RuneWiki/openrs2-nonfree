import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class197 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!oo;")
	private final Class264 aClass264_35 = new Class264(64);

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!wia;")
	private final Class386 aClass386_72;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!jia;")
	public final Class180 aClass180_1;

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray3[local7] = (char) (local7 + 65);
		}
		for (@Pc(21) int local21 = 26; local21 < 52; local21++) {
			aCharArray3[local21] = (char) (local21 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray3[local39] = (char) (local39 - 4);
		}
		aCharArray3[62] = '+';
		aCharArray3[63] = '/';
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!jia;)V")
	public Class197(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class180 arg3) {
		this.aClass386_72 = arg2;
		this.aClass386_72.method9210(32);
		this.aClass180_1 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method4399() {
		@Pc(10) Class264 local10 = this.aClass264_35;
		synchronized (this.aClass264_35) {
			this.aClass264_35.method6360();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method4400() {
		@Pc(2) Class264 local2 = this.aClass264_35;
		synchronized (this.aClass264_35) {
			this.aClass264_35.method6368();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!gq;")
	public Class132 method4401(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_35;
		@Pc(16) Class132 local16;
		synchronized (this.aClass264_35) {
			local16 = (Class132) this.aClass264_35.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_72) {
			local38 = this.aClass386_72.method9196(arg0, 32);
		}
		local16 = new Class132();
		local16.aClass197_2 = this;
		if (local38 != null) {
			local16.method3023(new Class14_Sub29(local38));
		}
		@Pc(63) Class264 local63 = this.aClass264_35;
		synchronized (this.aClass264_35) {
			this.aClass264_35.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
	public void method4403() {
		@Pc(2) Class264 local2 = this.aClass264_35;
		synchronized (this.aClass264_35) {
			this.aClass264_35.method6366(5);
		}
	}
}
