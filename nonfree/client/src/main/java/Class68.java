import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class68 {

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Lclient!qfa;")
	private Class307 aClass307_23 = new Class307(64);

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "Lclient!qfa;")
	public Class307 aClass307_24 = new Class307(64);

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "Lclient!ik;")
	private final Class182 aClass182_29;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!ik;")
	public final Class182 aClass182_30;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class68(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_29 = arg2;
		this.aClass182_30 = arg3;
		this.aClass182_29.method3970(34);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(IB)V")
	public void method1955() {
		@Pc(13) Class307 local13 = this.aClass307_23;
		synchronized (this.aClass307_23) {
			this.aClass307_23.method6995(5);
		}
		local13 = this.aClass307_24;
		synchronized (this.aClass307_24) {
			this.aClass307_24.method6995(5);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BII)V")
	public void method1957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass307_23 = new Class307(arg0);
		this.aClass307_24 = new Class307(arg1);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public void method1958() {
		@Pc(2) Class307 local2 = this.aClass307_23;
		synchronized (this.aClass307_23) {
			this.aClass307_23.method7006();
		}
		local2 = this.aClass307_24;
		synchronized (this.aClass307_24) {
			this.aClass307_24.method7006();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public void method1959() {
		@Pc(14) Class307 local14 = this.aClass307_23;
		synchronized (this.aClass307_23) {
			this.aClass307_23.method6998();
		}
		local14 = this.aClass307_24;
		synchronized (this.aClass307_24) {
			this.aClass307_24.method6998();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)Lclient!qa;")
	public Class298 method1961(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_23;
		@Pc(18) Class298 local18;
		synchronized (this.aClass307_23) {
			local18 = (Class298) this.aClass307_23.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_29;
		@Pc(41) byte[] local41;
		synchronized (this.aClass182_29) {
			local41 = this.aClass182_29.method3985(arg0, 34);
		}
		local18 = new Class298();
		local18.aClass68_4 = this;
		if (local41 != null) {
			local18.method6953(new Class3_Sub2(local41));
		}
		@Pc(77) Class307 local77 = this.aClass307_23;
		synchronized (this.aClass307_23) {
			this.aClass307_23.method7000(local18, (long) arg0);
			return local18;
		}
	}
}
