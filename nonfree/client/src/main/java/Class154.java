import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class154 {

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Lclient!pja;")
	private final Class279 aClass279_21 = new Class279(256);

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_52;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class154(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_52 = arg2;
		this.aClass143_52.method3123(26);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	public void method3382() {
		@Pc(2) Class279 local2 = this.aClass279_21;
		synchronized (this.aClass279_21) {
			this.aClass279_21.method6630(5);
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Lclient!cg;")
	public Class3_Sub6_Sub5 method3383(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_21;
		@Pc(16) Class3_Sub6_Sub5 local16;
		synchronized (this.aClass279_21) {
			local16 = (Class3_Sub6_Sub5) this.aClass279_21.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_52) {
			local38 = this.aClass143_52.method3125(arg0, 26);
		}
		local16 = new Class3_Sub6_Sub5();
		if (local38 != null) {
			local16.method1615(new Class3_Sub17(local38));
		}
		@Pc(65) Class279 local65 = this.aClass279_21;
		synchronized (this.aClass279_21) {
			this.aClass279_21.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	public void method3385() {
		@Pc(14) Class279 local14 = this.aClass279_21;
		synchronized (this.aClass279_21) {
			this.aClass279_21.method6638();
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public void method3386() {
		@Pc(2) Class279 local2 = this.aClass279_21;
		synchronized (this.aClass279_21) {
			this.aClass279_21.method6637();
		}
	}
}
