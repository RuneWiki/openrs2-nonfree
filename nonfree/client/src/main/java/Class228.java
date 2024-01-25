import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class228 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!wg;")
	private final Class313 aClass313_42 = new Class313(64);

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!kr;")
	private final Class171 aClass171_106;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class228(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_106 = arg2;
		this.aClass171_106.method4349(32);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method5337() {
		@Pc(2) Class313 local2 = this.aClass313_42;
		synchronized (this.aClass313_42) {
			this.aClass313_42.method7400();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method5339() {
		@Pc(2) Class313 local2 = this.aClass313_42;
		synchronized (this.aClass313_42) {
			this.aClass313_42.method7403(5);
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public void method5340() {
		@Pc(10) Class313 local10 = this.aClass313_42;
		synchronized (this.aClass313_42) {
			this.aClass313_42.method7398();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lclient!pca;")
	public Class230 method5341(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_42;
		@Pc(16) Class230 local16;
		synchronized (this.aClass313_42) {
			local16 = (Class230) this.aClass313_42.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_106;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_106) {
			local38 = this.aClass171_106.method4339(32, arg0);
		}
		local16 = new Class230();
		if (local38 != null) {
			local16.method5398(new Class1_Sub6(local38));
		}
		@Pc(60) Class313 local60 = this.aClass313_42;
		synchronized (this.aClass313_42) {
			this.aClass313_42.method7399((long) arg0, local16);
			return local16;
		}
	}
}
