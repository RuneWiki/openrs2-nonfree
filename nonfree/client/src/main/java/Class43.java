import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43 {

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!wm;")
	private final Class267 aClass267_11 = new Class267(64);

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	public int anInt1129 = 0;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "Lclient!ph;")
	private final Class187 aClass187_20;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public final int anInt1128;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class43(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_20 = arg2;
		this.anInt1128 = this.aClass187_20.method4306(4);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Lclient!sb;")
	public Class219 method1032(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_11;
		@Pc(16) Class219 local16;
		synchronized (this.aClass267_11) {
			local16 = (Class219) this.aClass267_11.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_20;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_20) {
			local38 = this.aClass187_20.method4300(4, arg0);
		}
		local16 = new Class219();
		local16.aClass43_6 = this;
		local16.anInt6164 = arg0;
		if (local38 != null) {
			local16.method4866(new Class10_Sub8(local38));
		}
		local16.method4868();
		@Pc(75) Class267 local75 = this.aClass267_11;
		synchronized (this.aClass267_11) {
			this.aClass267_11.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public void method1035() {
		@Pc(6) Class267 local6 = this.aClass267_11;
		synchronized (this.aClass267_11) {
			this.aClass267_11.method6013();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
	public void method1036() {
		@Pc(2) Class267 local2 = this.aClass267_11;
		synchronized (this.aClass267_11) {
			this.aClass267_11.method6007(5);
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	public void method1037() {
		@Pc(6) Class267 local6 = this.aClass267_11;
		synchronized (this.aClass267_11) {
			this.aClass267_11.method6011();
		}
	}
}
