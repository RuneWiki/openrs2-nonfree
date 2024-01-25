import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class128 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!pa;")
	private final Class265 aClass265_11 = new Class265(64);

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!pa;")
	private final Class265 aClass265_12 = new Class265(100);

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!cb;")
	private final Class50 aClass50_47;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;Lclient!cb;)V")
	public Class128(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) Class50 arg4) {
		this.aClass50_47 = arg2;
		if (this.aClass50_47 != null) {
			@Pc(26) int local26 = this.aClass50_47.method902() - 1;
			this.aClass50_47.method913(local26);
		}
		Static109.method1782(arg4, arg3);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method2684() {
		@Pc(6) Class265 local6 = this.aClass265_11;
		synchronized (this.aClass265_11) {
			this.aClass265_11.method6573();
		}
		local6 = this.aClass265_12;
		synchronized (this.aClass265_12) {
			this.aClass265_12.method6573();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method2685() {
		@Pc(6) Class265 local6 = this.aClass265_11;
		synchronized (this.aClass265_11) {
			this.aClass265_11.method6570(5);
		}
		local6 = this.aClass265_12;
		synchronized (this.aClass265_12) {
			this.aClass265_12.method6570(5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Lclient!co;")
	public Class65 method2686(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_11;
		@Pc(18) Class65 local18;
		synchronized (this.aClass265_11) {
			local18 = (Class65) this.aClass265_11.method6577((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class50 local31 = this.aClass50_47;
		@Pc(44) byte[] local44;
		synchronized (this.aClass50_47) {
			local44 = this.aClass50_47.method916(Static510.method7316(arg0), Static368.method5409(arg0));
		}
		local18 = new Class65();
		local18.aClass128_1 = this;
		local18.anInt1431 = arg0;
		if (local44 != null) {
			local18.method1298(new Class5_Sub15(local44));
		}
		local18.method1296();
		@Pc(81) Class265 local81 = this.aClass265_11;
		synchronized (this.aClass265_11) {
			this.aClass265_11.method6566(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public void method2688() {
		@Pc(6) Class265 local6 = this.aClass265_11;
		synchronized (this.aClass265_11) {
			this.aClass265_11.method6568();
		}
		local6 = this.aClass265_12;
		synchronized (this.aClass265_12) {
			this.aClass265_12.method6568();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lclient!va;")
	public Class5_Sub2_Sub20 method2690(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_12;
		synchronized (this.aClass265_12) {
			@Pc(16) Class5_Sub2_Sub20 local16 = (Class5_Sub2_Sub20) this.aClass265_12.method6577((long) arg0);
			if (local16 == null) {
				local16 = new Class5_Sub2_Sub20(arg0);
				this.aClass265_12.method6566(local16, (long) arg0);
			}
			return local16.method8285() ? local16 : null;
		}
	}
}
