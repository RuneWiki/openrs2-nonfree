import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class248 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!jr;")
	private Class169 aClass169_43 = new Class169(128);

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!jr;")
	public Class169 aClass169_44 = new Class169(64);

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!in;")
	private final Class157 aClass157_209;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!in;")
	public final Class157 aClass157_210;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class248(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_209 = arg2;
		this.aClass157_210 = arg3;
		this.aClass157_209.method4561(36);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method6578() {
		@Pc(6) Class169 local6 = this.aClass169_43;
		synchronized (this.aClass169_43) {
			this.aClass169_43.method5009();
		}
		local6 = this.aClass169_44;
		synchronized (this.aClass169_44) {
			this.aClass169_44.method5009();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V")
	public void method6579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass169_43 = new Class169(arg1);
		this.aClass169_44 = new Class169(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	public void method6581() {
		@Pc(8) Class169 local8 = this.aClass169_43;
		synchronized (this.aClass169_43) {
			this.aClass169_43.method5006();
		}
		local8 = this.aClass169_44;
		synchronized (this.aClass169_44) {
			this.aClass169_44.method5006();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V")
	public void method6583() {
		@Pc(2) Class169 local2 = this.aClass169_43;
		synchronized (this.aClass169_43) {
			this.aClass169_43.method4997(5);
		}
		local2 = this.aClass169_44;
		synchronized (this.aClass169_44) {
			this.aClass169_44.method4997(5);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(IB)Lclient!ii;")
	public Class153 method6584(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_43;
		@Pc(16) Class153 local16;
		synchronized (this.aClass169_43) {
			local16 = (Class153) this.aClass169_43.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class157 local34 = this.aClass157_209;
		@Pc(43) byte[] local43;
		synchronized (this.aClass157_209) {
			local43 = this.aClass157_209.method4564(36, arg0);
		}
		local16 = new Class153();
		local16.aClass248_3 = this;
		local16.anInt5227 = arg0;
		if (local43 != null) {
			local16.method4499(new Class2_Sub11(local43));
		}
		local16.method4492();
		@Pc(74) Class169 local74 = this.aClass169_43;
		synchronized (this.aClass169_43) {
			this.aClass169_43.method5001(local16, (long) arg0);
			return local16;
		}
	}
}
