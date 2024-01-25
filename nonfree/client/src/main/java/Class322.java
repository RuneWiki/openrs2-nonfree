import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class322 {

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "Lclient!mf;")
	private final Class222 aClass222_58 = new Class222(128);

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Lclient!pu;")
	private final Class270 aClass270_107;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class322(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_107 = arg2;
		this.aClass270_107.method5685(1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public void method7126() {
		@Pc(6) Class222 local6 = this.aClass222_58;
		synchronized (this.aClass222_58) {
			this.aClass222_58.method4433(5);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public void method7129() {
		@Pc(10) Class222 local10 = this.aClass222_58;
		synchronized (this.aClass222_58) {
			this.aClass222_58.method4428();
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)Lclient!pi;")
	public Class261 method7131(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_58;
		@Pc(16) Class261 local16;
		synchronized (this.aClass222_58) {
			local16 = (Class261) this.aClass222_58.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) Class270 local43 = this.aClass270_107;
		@Pc(52) byte[] local52;
		synchronized (this.aClass270_107) {
			local52 = this.aClass270_107.method5704(1, arg0);
		}
		local16 = new Class261();
		if (local52 != null) {
			local16.method5620(new Class1_Sub35(local52));
		}
		@Pc(74) Class222 local74 = this.aClass222_58;
		synchronized (this.aClass222_58) {
			this.aClass222_58.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public void method7132() {
		@Pc(2) Class222 local2 = this.aClass222_58;
		synchronized (this.aClass222_58) {
			this.aClass222_58.method4422();
		}
	}
}
