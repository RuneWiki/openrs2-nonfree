import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class179 {

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!pa;")
	private final Class265 aClass265_25 = new Class265(64);

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!pa;")
	public final Class265 aClass265_26 = new Class265(60);

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!cb;")
	public final Class50 aClass50_73;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!cb;")
	private final Class50 aClass50_72;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class179(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_73 = arg3;
		this.aClass50_72 = arg2;
		@Pc(26) int local26 = this.aClass50_72.method902() - 1;
		this.aClass50_72.method913(local26);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method3797() {
		@Pc(2) Class265 local2 = this.aClass265_25;
		synchronized (this.aClass265_25) {
			this.aClass265_25.method6573();
		}
		local2 = this.aClass265_26;
		synchronized (this.aClass265_26) {
			this.aClass265_26.method6573();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!wba;")
	public Class385 method3798(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_25;
		@Pc(16) Class385 local16;
		synchronized (this.aClass265_25) {
			local16 = (Class385) this.aClass265_25.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) Class50 local42 = this.aClass50_72;
		@Pc(55) byte[] local55;
		synchronized (this.aClass50_72) {
			local55 = this.aClass50_72.method916(Static50.method744(arg0), Static633.method8420(arg0));
		}
		local16 = new Class385();
		local16.aClass179_2 = this;
		local16.anInt10227 = arg0;
		if (local55 != null) {
			local16.method8533(new Class5_Sub15(local55));
		}
		@Pc(85) Class265 local85 = this.aClass265_25;
		synchronized (this.aClass265_25) {
			this.aClass265_25.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public void method3799() {
		@Pc(2) Class265 local2 = this.aClass265_25;
		synchronized (this.aClass265_25) {
			this.aClass265_25.method6570(5);
		}
		local2 = this.aClass265_26;
		synchronized (this.aClass265_26) {
			this.aClass265_26.method6570(5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	public void method3800(@OriginalArg(0) int arg0) {
		this.anInt4290 = arg0;
		@Pc(13) Class265 local13 = this.aClass265_26;
		synchronized (this.aClass265_26) {
			this.aClass265_26.method6568();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public void method3802() {
		@Pc(2) Class265 local2 = this.aClass265_25;
		synchronized (this.aClass265_25) {
			this.aClass265_25.method6568();
		}
		local2 = this.aClass265_26;
		synchronized (this.aClass265_26) {
			this.aClass265_26.method6568();
		}
	}
}
