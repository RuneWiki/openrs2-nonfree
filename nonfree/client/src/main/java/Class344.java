import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class344 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!vg;")
	private final Class342 aClass342_191 = new Class342(128);

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_163;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class344(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_163 = arg2;
		if (this.aClass284_163 != null) {
			@Pc(20) int local20 = this.aClass284_163.method6322() - 1;
			this.aClass284_163.method6354(local20);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Lclient!dl;")
	public Class70 method7704(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_191;
		@Pc(16) Class70 local16;
		synchronized (this.aClass342_191) {
			local16 = (Class70) this.aClass342_191.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass284_163.method6331(Static248.method3937(arg0), Static210.method7451(arg0));
		local16 = new Class70();
		if (local43 != null) {
			local16.method2038(new Class3_Sub26(local43));
		}
		@Pc(59) Class342 local59 = this.aClass342_191;
		synchronized (this.aClass342_191) {
			this.aClass342_191.method7683(local16, (long) arg0);
			return local16;
		}
	}
}
