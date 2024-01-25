import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class84 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!fr;")
	private Class91 aClass91_33 = new Class91(64);

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!fr;")
	public Class91 aClass91_34 = new Class91(64);

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!qs;")
	private final Class211 aClass211_29;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!qs;")
	public final Class211 aClass211_30;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;)V")
	public Class84(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_29 = arg2;
		this.aClass211_30 = arg3;
		this.aClass211_29.method4772(34);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public void method1798() {
		@Pc(2) Class91 local2 = this.aClass91_33;
		synchronized (this.aClass91_33) {
			this.aClass91_33.method1999();
		}
		local2 = this.aClass91_34;
		synchronized (this.aClass91_34) {
			this.aClass91_34.method1999();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method1800() {
		@Pc(6) Class91 local6 = this.aClass91_33;
		synchronized (this.aClass91_33) {
			this.aClass91_33.method1998(5);
		}
		local6 = this.aClass91_34;
		synchronized (this.aClass91_34) {
			this.aClass91_34.method1998(5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lclient!si;")
	public Class231 method1802(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_33;
		@Pc(16) Class231 local16;
		synchronized (this.aClass91_33) {
			local16 = (Class231) this.aClass91_33.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_29;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_29) {
			local38 = this.aClass211_29.method4758(arg0, 34);
		}
		local16 = new Class231();
		local16.aClass84_5 = this;
		if (local38 != null) {
			local16.method5125(new Class1_Sub3(local38));
		}
		@Pc(63) Class91 local63 = this.aClass91_33;
		synchronized (this.aClass91_33) {
			this.aClass91_33.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
	public void method1803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass91_33 = new Class91(arg1);
		this.aClass91_34 = new Class91(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method1804() {
		@Pc(6) Class91 local6 = this.aClass91_33;
		synchronized (this.aClass91_33) {
			this.aClass91_33.method1993();
		}
		local6 = this.aClass91_34;
		synchronized (this.aClass91_34) {
			this.aClass91_34.method1993();
		}
	}
}
