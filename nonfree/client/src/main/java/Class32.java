import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class32 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!pja;")
	private final Class279 aClass279_4 = new Class279(128);

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_10;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class32(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_10 = arg2;
		this.aClass143_10.method3123(1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public void method1169() {
		@Pc(2) Class279 local2 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.method6630(5);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public void method1170() {
		@Pc(6) Class279 local6 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.method6638();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public void method1171() {
		@Pc(6) Class279 local6 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.method6637();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!fea;")
	public Class117 method1172(@OriginalArg(1) int arg0) {
		@Pc(11) Class279 local11 = this.aClass279_4;
		@Pc(21) Class117 local21;
		synchronized (this.aClass279_4) {
			local21 = (Class117) this.aClass279_4.method6631((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class143 local34 = this.aClass143_10;
		@Pc(43) byte[] local43;
		synchronized (this.aClass143_10) {
			local43 = this.aClass143_10.method3125(arg0, 1);
		}
		local21 = new Class117();
		if (local43 != null) {
			local21.method2730(new Class3_Sub17(local43));
		}
		@Pc(65) Class279 local65 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.method6635(local21, (long) arg0);
			return local21;
		}
	}
}
