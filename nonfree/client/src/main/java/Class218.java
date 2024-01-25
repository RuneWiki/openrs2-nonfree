import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class218 {

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "Lclient!pa;")
	private Class265 aClass265_32 = new Class265(128);

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "Lclient!pa;")
	public Class265 aClass265_33 = new Class265(64);

	@OriginalMember(owner = "client!lha", name = "l", descriptor = "Lclient!cb;")
	public final Class50 aClass50_97;

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_96;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;Lclient!cb;)V")
	public Class218(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Class50 arg3) {
		this.aClass50_97 = arg3;
		this.aClass50_96 = arg2;
		this.aClass50_96.method913(36);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BII)V")
	public void method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass265_32 = new Class265(arg0);
		this.aClass265_33 = new Class265(arg1);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)V")
	public void method5158() {
		@Pc(2) Class265 local2 = this.aClass265_32;
		synchronized (this.aClass265_32) {
			this.aClass265_32.method6568();
		}
		local2 = this.aClass265_33;
		synchronized (this.aClass265_33) {
			this.aClass265_33.method6568();
		}
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
	public void method5160() {
		@Pc(2) Class265 local2 = this.aClass265_32;
		synchronized (this.aClass265_32) {
			this.aClass265_32.method6573();
		}
		local2 = this.aClass265_33;
		synchronized (this.aClass265_33) {
			this.aClass265_33.method6573();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BI)Lclient!or;")
	public Class262 method5163(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_32;
		@Pc(16) Class262 local16;
		synchronized (this.aClass265_32) {
			local16 = (Class262) this.aClass265_32.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_96;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_96) {
			local38 = this.aClass50_96.method916(arg0, 36);
		}
		local16 = new Class262();
		local16.anInt7641 = arg0;
		local16.aClass218_4 = this;
		if (local38 != null) {
			local16.method6488(new Class5_Sub15(local38));
		}
		local16.method6493();
		@Pc(77) Class265 local77 = this.aClass265_32;
		synchronized (this.aClass265_32) {
			this.aClass265_32.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(BI)V")
	public void method5164() {
		@Pc(6) Class265 local6 = this.aClass265_32;
		synchronized (this.aClass265_32) {
			this.aClass265_32.method6570(5);
		}
		local6 = this.aClass265_33;
		synchronized (this.aClass265_33) {
			this.aClass265_33.method6570(5);
		}
	}
}
