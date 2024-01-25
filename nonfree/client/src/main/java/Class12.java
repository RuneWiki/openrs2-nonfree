import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class12 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!jk;")
	private final Class137 aClass137_4 = new Class137(128);

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_10;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class12(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_10 = arg2;
		this.aClass211_10.method4365(1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method162() {
		@Pc(12) Class137 local12 = this.aClass137_4;
		synchronized (this.aClass137_4) {
			this.aClass137_4.method2737();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!qg;")
	public Class207 method164(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_4;
		@Pc(16) Class207 local16;
		synchronized (this.aClass137_4) {
			local16 = (Class207) this.aClass137_4.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class211 local34 = this.aClass211_10;
		@Pc(43) byte[] local43;
		synchronized (this.aClass211_10) {
			local43 = this.aClass211_10.method4377(1, arg0);
		}
		local16 = new Class207();
		if (local43 != null) {
			local16.method4282(new Class4_Sub9(local43));
		}
		@Pc(65) Class137 local65 = this.aClass137_4;
		synchronized (this.aClass137_4) {
			this.aClass137_4.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public void method165() {
		@Pc(2) Class137 local2 = this.aClass137_4;
		synchronized (this.aClass137_4) {
			this.aClass137_4.method2739();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	public void method167() {
		@Pc(2) Class137 local2 = this.aClass137_4;
		synchronized (this.aClass137_4) {
			this.aClass137_4.method2745(5);
		}
	}
}
