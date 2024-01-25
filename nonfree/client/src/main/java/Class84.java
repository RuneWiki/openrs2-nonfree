import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class84 {

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!kh;")
	private final Class134 aClass134_19 = new Class134(64);

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!kh;")
	public final Class134 aClass134_20 = new Class134(2);

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!ul;")
	public final Class246 aClass246_81;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!ul;")
	private final Class246 aClass246_80;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;)V")
	public Class84(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_81 = arg3;
		this.aClass246_80 = arg2;
		this.aClass246_80.method5492(33);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public void method2216() {
		@Pc(6) Class134 local6 = this.aClass134_19;
		synchronized (this.aClass134_19) {
			this.aClass134_19.method3272();
		}
		local6 = this.aClass134_20;
		synchronized (this.aClass134_20) {
			this.aClass134_20.method3272();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Lclient!gg;")
	public Class87 method2219(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_19;
		@Pc(16) Class87 local16;
		synchronized (this.aClass134_19) {
			local16 = (Class87) this.aClass134_19.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_80;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_80) {
			local38 = this.aClass246_80.method5477(33, arg0);
		}
		local16 = new Class87();
		local16.aClass84_1 = this;
		if (local38 != null) {
			local16.method2237(new Class1_Sub5(local38));
		}
		@Pc(63) Class134 local63 = this.aClass134_19;
		synchronized (this.aClass134_19) {
			this.aClass134_19.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method2220() {
		@Pc(12) Class134 local12 = this.aClass134_19;
		synchronized (this.aClass134_19) {
			this.aClass134_19.method3267();
		}
		local12 = this.aClass134_20;
		synchronized (this.aClass134_20) {
			this.aClass134_20.method3267();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	public void method2222() {
		@Pc(6) Class134 local6 = this.aClass134_19;
		synchronized (this.aClass134_19) {
			this.aClass134_19.method3270(5);
		}
		local6 = this.aClass134_20;
		synchronized (this.aClass134_20) {
			this.aClass134_20.method3270(5);
		}
	}
}
