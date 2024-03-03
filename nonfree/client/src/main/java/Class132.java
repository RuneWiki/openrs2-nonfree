import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class132 {

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[5];

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_6 = new Class127("LIVE", 0);

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!hu;")
	private final Class98 aClass98_29 = new Class98(256);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!r;")
	private final Class197 aClass197_53;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 87)
	public Class132(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_53 = arg2;
		this.aClass197_53.method5082(26);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)Lclient!ck;", line = 7)
	public Class2_Sub2_Sub3 method3472(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_29;
		@Pc(16) Class2_Sub2_Sub3 local16;
		synchronized (this.aClass98_29) {
			local16 = (Class2_Sub2_Sub3) this.aClass98_29.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_53.method5090(arg0, 26);
		local16 = new Class2_Sub2_Sub3();
		if (local38 != null) {
			local16.method1345(new Class2_Sub4(local38));
		}
		@Pc(54) Class98 local54 = this.aClass98_29;
		synchronized (this.aClass98_29) {
			this.aClass98_29.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(BI)V", line = 36)
	public void method3473() {
		@Pc(6) Class98 local6 = this.aClass98_29;
		synchronized (this.aClass98_29) {
			this.aClass98_29.method2617(5);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 53)
	public void method3474() {
		@Pc(11) Class98 local11 = this.aClass98_29;
		synchronized (this.aClass98_29) {
			this.aClass98_29.method2623();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 102)
	public void method3476() {
		@Pc(6) Class98 local6 = this.aClass98_29;
		synchronized (this.aClass98_29) {
			this.aClass98_29.method2616();
		}
	}
}
