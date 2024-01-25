import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class112 {

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Lclient!wm;")
	private Class267 aClass267_30 = new Class267(64);

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!ph;")
	private final Class187 aClass187_65;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class112(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_65 = arg2;
		if (this.aClass187_65 != null) {
			@Pc(20) int local20 = this.aClass187_65.method4302() - 1;
			this.aClass187_65.method4306(local20);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public void method2695() {
		@Pc(10) Class267 local10 = this.aClass267_30;
		synchronized (this.aClass267_30) {
			this.aClass267_30.method6011();
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public void method2696() {
		@Pc(13) Class267 local13 = this.aClass267_30;
		synchronized (this.aClass267_30) {
			this.aClass267_30.method6013();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	public void method2697() {
		@Pc(2) Class267 local2 = this.aClass267_30;
		synchronized (this.aClass267_30) {
			this.aClass267_30.method6007(5);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
	public void method2698(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_30;
		synchronized (this.aClass267_30) {
			this.aClass267_30.method6011();
			this.aClass267_30 = new Class267(arg0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)Lclient!rp;")
	public Class212 method2700(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_30;
		@Pc(16) Class212 local16;
		synchronized (this.aClass267_30) {
			local16 = (Class212) this.aClass267_30.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_65;
		@Pc(42) byte[] local42;
		synchronized (this.aClass187_65) {
			local42 = this.aClass187_65.method4300(Static93.method6043(arg0), Static6.method50(arg0));
		}
		local16 = new Class212();
		if (local42 != null) {
			local16.method4781(new Class10_Sub8(local42));
		}
		@Pc(69) Class267 local69 = this.aClass267_30;
		synchronized (this.aClass267_30) {
			this.aClass267_30.method6008(local16, (long) arg0);
			return local16;
		}
	}
}
