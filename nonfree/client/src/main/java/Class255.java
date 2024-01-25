import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class255 {

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Lclient!sw;")
	private final Class277 aClass277_56 = new Class277(64);

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_81;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public final int anInt7413;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class255(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_81 = arg2;
		if (this.aClass69_81 == null) {
			this.anInt7413 = 0;
		} else {
			this.anInt7413 = this.aClass69_81.method1884(16);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public void method6633() {
		@Pc(10) Class277 local10 = this.aClass277_56;
		synchronized (this.aClass277_56) {
			this.aClass277_56.method7018(5);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(BI)Lclient!qv;")
	public Class244 method6634(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_56;
		@Pc(16) Class244 local16;
		synchronized (this.aClass277_56) {
			local16 = (Class244) this.aClass277_56.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class69 local37 = this.aClass69_81;
		@Pc(46) byte[] local46;
		synchronized (this.aClass69_81) {
			local46 = this.aClass69_81.method1888(arg0, 16);
		}
		local16 = new Class244();
		if (local46 != null) {
			local16.method6497(new Class1_Sub17(local46));
		}
		@Pc(68) Class277 local68 = this.aClass277_56;
		synchronized (this.aClass277_56) {
			this.aClass277_56.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public void method6636() {
		@Pc(2) Class277 local2 = this.aClass277_56;
		synchronized (this.aClass277_56) {
			this.aClass277_56.method7019();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	public void method6638() {
		@Pc(2) Class277 local2 = this.aClass277_56;
		synchronized (this.aClass277_56) {
			this.aClass277_56.method7026();
		}
	}
}
