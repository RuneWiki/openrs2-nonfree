import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class31 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!jk;")
	private final Class137 aClass137_6 = new Class137(64);

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!qn;")
	private final Class211 aClass211_14;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class31(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_14 = arg2;
		this.aClass211_14.method4365(31);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	public void method503() {
		@Pc(6) Class137 local6 = this.aClass137_6;
		synchronized (this.aClass137_6) {
			this.aClass137_6.method2745(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Lclient!of;")
	public Class189 method505(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_6;
		@Pc(16) Class189 local16;
		synchronized (this.aClass137_6) {
			local16 = (Class189) this.aClass137_6.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class211 local35 = this.aClass211_14;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_14) {
			local44 = this.aClass211_14.method4377(31, arg0);
		}
		local16 = new Class189();
		if (local44 != null) {
			local16.method3701(new Class4_Sub9(local44));
		}
		@Pc(66) Class137 local66 = this.aClass137_6;
		synchronized (this.aClass137_6) {
			this.aClass137_6.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method506() {
		@Pc(2) Class137 local2 = this.aClass137_6;
		synchronized (this.aClass137_6) {
			this.aClass137_6.method2737();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method507() {
		@Pc(2) Class137 local2 = this.aClass137_6;
		synchronized (this.aClass137_6) {
			this.aClass137_6.method2739();
		}
	}
}
