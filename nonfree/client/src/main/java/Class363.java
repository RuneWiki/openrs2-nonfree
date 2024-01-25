import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class363 {

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "Lclient!pa;")
	private final Class265 aClass265_62 = new Class265(64);

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "Lclient!pa;")
	public final Class265 aClass265_63 = new Class265(2);

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Lclient!cb;")
	public final Class50 aClass50_173;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Lclient!cb;")
	private final Class50 aClass50_174;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class363(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_173 = arg3;
		this.aClass50_174 = arg2;
		this.aClass50_174.method913(33);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public void method8238() {
		@Pc(2) Class265 local2 = this.aClass265_62;
		synchronized (this.aClass265_62) {
			this.aClass265_62.method6573();
		}
		local2 = this.aClass265_63;
		synchronized (this.aClass265_63) {
			this.aClass265_63.method6573();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Lclient!ow;")
	public Class264 method8239(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_62;
		@Pc(16) Class264 local16;
		synchronized (this.aClass265_62) {
			local16 = (Class264) this.aClass265_62.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_174;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_174) {
			local38 = this.aClass50_174.method916(arg0, 33);
		}
		local16 = new Class264();
		local16.aClass363_2 = this;
		if (local38 != null) {
			local16.method6556(new Class5_Sub15(local38));
		}
		@Pc(71) Class265 local71 = this.aClass265_62;
		synchronized (this.aClass265_62) {
			this.aClass265_62.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
	public void method8240() {
		@Pc(2) Class265 local2 = this.aClass265_62;
		synchronized (this.aClass265_62) {
			this.aClass265_62.method6568();
		}
		local2 = this.aClass265_63;
		synchronized (this.aClass265_63) {
			this.aClass265_63.method6568();
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V")
	public void method8242() {
		@Pc(6) Class265 local6 = this.aClass265_62;
		synchronized (this.aClass265_62) {
			this.aClass265_62.method6570(5);
		}
		local6 = this.aClass265_63;
		synchronized (this.aClass265_63) {
			this.aClass265_63.method6570(5);
		}
	}
}
