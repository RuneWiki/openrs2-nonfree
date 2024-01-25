import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class104 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!iha;")
	private final Class168 aClass168_24 = new Class168(64);

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_81;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class104(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_81 = arg2;
		this.aClass126_81.method3062(31);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public void method2581() {
		@Pc(6) Class168 local6 = this.aClass168_24;
		synchronized (this.aClass168_24) {
			this.aClass168_24.method3856();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public void method2583() {
		@Pc(14) Class168 local14 = this.aClass168_24;
		synchronized (this.aClass168_24) {
			this.aClass168_24.method3852(5);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Lclient!cg;")
	public Class56 method2584(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_24;
		@Pc(16) Class56 local16;
		synchronized (this.aClass168_24) {
			local16 = (Class56) this.aClass168_24.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_81;
		@Pc(45) byte[] local45;
		synchronized (this.aClass126_81) {
			local45 = this.aClass126_81.method3086(arg0, 31);
		}
		local16 = new Class56();
		if (local45 != null) {
			local16.method1079(new Class5_Sub36(local45));
		}
		@Pc(69) Class168 local69 = this.aClass168_24;
		synchronized (this.aClass168_24) {
			this.aClass168_24.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public void method2585() {
		@Pc(13) Class168 local13 = this.aClass168_24;
		synchronized (this.aClass168_24) {
			this.aClass168_24.method3862();
		}
	}
}
