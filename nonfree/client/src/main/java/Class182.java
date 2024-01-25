import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class182 {

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!wi;")
	private Class268 aClass268_42 = new Class268(64);

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!wi;")
	public Class268 aClass268_43 = new Class268(64);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!uu;")
	private final Class250 aClass250_74;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!uu;")
	public final Class250 aClass250_75;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;)V")
	public Class182(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_74 = arg2;
		this.aClass250_75 = arg3;
		this.aClass250_74.method5815(34);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method4364() {
		@Pc(2) Class268 local2 = this.aClass268_42;
		synchronized (this.aClass268_42) {
			this.aClass268_42.method6173(5);
		}
		local2 = this.aClass268_43;
		synchronized (this.aClass268_43) {
			this.aClass268_43.method6173(5);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public void method4366() {
		@Pc(2) Class268 local2 = this.aClass268_42;
		synchronized (this.aClass268_42) {
			this.aClass268_42.method6168();
		}
		local2 = this.aClass268_43;
		synchronized (this.aClass268_43) {
			this.aClass268_43.method6168();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZ)V")
	public void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass268_42 = new Class268(arg1);
		this.aClass268_43 = new Class268(arg0);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public void method4368() {
		@Pc(6) Class268 local6 = this.aClass268_42;
		synchronized (this.aClass268_42) {
			this.aClass268_42.method6160();
		}
		local6 = this.aClass268_43;
		synchronized (this.aClass268_43) {
			this.aClass268_43.method6160();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Lclient!aw;")
	public Class17 method4369(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_42;
		@Pc(16) Class17 local16;
		synchronized (this.aClass268_42) {
			local16 = (Class17) this.aClass268_42.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_74) {
			local38 = this.aClass250_74.method5806(34, arg0);
		}
		local16 = new Class17();
		local16.aClass182_3 = this;
		if (local38 != null) {
			local16.method338(new Class3_Sub25(local38));
		}
		@Pc(63) Class268 local63 = this.aClass268_42;
		synchronized (this.aClass268_42) {
			this.aClass268_42.method6164(local16, (long) arg0);
			return local16;
		}
	}
}
