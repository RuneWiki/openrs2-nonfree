import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class160 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!sw;")
	private Class277 aClass277_36 = new Class277(64);

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!sw;")
	public Class277 aClass277_37 = new Class277(64);

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!dn;")
	private final Class69 aClass69_49;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!dn;")
	public final Class69 aClass69_48;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;)V")
	public Class160(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3) {
		this.aClass69_49 = arg2;
		this.aClass69_48 = arg3;
		this.aClass69_49.method1884(34);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!wn;")
	public Class318 method4292(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_36;
		@Pc(16) Class318 local16;
		synchronized (this.aClass277_36) {
			local16 = (Class318) this.aClass277_36.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class69 local37 = this.aClass69_49;
		@Pc(46) byte[] local46;
		synchronized (this.aClass69_49) {
			local46 = this.aClass69_49.method1888(arg0, 34);
		}
		local16 = new Class318();
		local16.aClass160_4 = this;
		if (local46 != null) {
			local16.method8136(new Class1_Sub17(local46));
		}
		@Pc(71) Class277 local71 = this.aClass277_36;
		synchronized (this.aClass277_36) {
			this.aClass277_36.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method4293() {
		@Pc(2) Class277 local2 = this.aClass277_36;
		synchronized (this.aClass277_36) {
			this.aClass277_36.method7026();
		}
		local2 = this.aClass277_37;
		synchronized (this.aClass277_37) {
			this.aClass277_37.method7026();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method4294() {
		@Pc(2) Class277 local2 = this.aClass277_36;
		synchronized (this.aClass277_36) {
			this.aClass277_36.method7018(5);
		}
		local2 = this.aClass277_37;
		synchronized (this.aClass277_37) {
			this.aClass277_37.method7018(5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method4295() {
		@Pc(2) Class277 local2 = this.aClass277_36;
		synchronized (this.aClass277_36) {
			this.aClass277_36.method7019();
		}
		local2 = this.aClass277_37;
		synchronized (this.aClass277_37) {
			this.aClass277_37.method7019();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method4296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass277_36 = new Class277(arg1);
		this.aClass277_37 = new Class277(arg0);
	}
}
