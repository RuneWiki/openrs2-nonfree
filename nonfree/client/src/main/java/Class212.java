import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class212 {

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!er;")
	private Class69 aClass69_64 = new Class69(64);

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!er;")
	public Class69 aClass69_65 = new Class69(64);

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!ns;")
	public final Class166 aClass166_246;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_245;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;)V")
	public Class212(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		this.aClass166_246 = arg3;
		this.aClass166_245 = arg2;
		this.aClass166_245.method3691(34);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public void method4936() {
		@Pc(2) Class69 local2 = this.aClass69_64;
		synchronized (this.aClass69_64) {
			this.aClass69_64.method1594(5);
		}
		local2 = this.aClass69_65;
		synchronized (this.aClass69_65) {
			this.aClass69_65.method1594(5);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	public void method4937() {
		@Pc(7) Class69 local7 = this.aClass69_64;
		synchronized (this.aClass69_64) {
			this.aClass69_64.method1593();
		}
		local7 = this.aClass69_65;
		synchronized (this.aClass69_65) {
			this.aClass69_65.method1593();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
	public void method4940() {
		@Pc(2) Class69 local2 = this.aClass69_64;
		synchronized (this.aClass69_64) {
			this.aClass69_64.method1600();
		}
		local2 = this.aClass69_65;
		synchronized (this.aClass69_65) {
			this.aClass69_65.method1600();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)V")
	public void method4943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass69_64 = new Class69(arg1);
		this.aClass69_65 = new Class69(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)Lclient!et;")
	public Class70 method4944(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_64;
		@Pc(16) Class70 local16;
		synchronized (this.aClass69_64) {
			local16 = (Class70) this.aClass69_64.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass166_245.method3696(arg0, 34);
		local16 = new Class70();
		local16.aClass212_2 = this;
		if (local39 != null) {
			local16.method1614(new Class4_Sub30(local39));
		}
		@Pc(58) Class69 local58 = this.aClass69_64;
		synchronized (this.aClass69_64) {
			this.aClass69_64.method1590((long) arg0, local16);
			return local16;
		}
	}
}
