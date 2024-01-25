import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class79 {

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!jk;")
	private final Class137 aClass137_16 = new Class137(64);

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public int anInt1954 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!qn;")
	private final Class211 aClass211_28;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public final int anInt1949;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class79(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_28 = arg2;
		this.anInt1949 = this.aClass211_28.method4365(4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!w;")
	public Class261 method1582(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_16;
		@Pc(16) Class261 local16;
		synchronized (this.aClass137_16) {
			local16 = (Class261) this.aClass137_16.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_28;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_28) {
			local38 = this.aClass211_28.method4377(4, arg0);
		}
		local16 = new Class261();
		local16.aClass79_6 = this;
		local16.anInt7250 = arg0;
		if (local38 != null) {
			local16.method5818(new Class4_Sub9(local38));
		}
		local16.method5816();
		@Pc(69) Class137 local69 = this.aClass137_16;
		synchronized (this.aClass137_16) {
			this.aClass137_16.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public void method1583() {
		@Pc(9) Class137 local9 = this.aClass137_16;
		synchronized (this.aClass137_16) {
			this.aClass137_16.method2739();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public void method1584() {
		@Pc(6) Class137 local6 = this.aClass137_16;
		synchronized (this.aClass137_16) {
			this.aClass137_16.method2737();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public void method1588() {
		@Pc(10) Class137 local10 = this.aClass137_16;
		synchronized (this.aClass137_16) {
			this.aClass137_16.method2745(5);
		}
	}
}
