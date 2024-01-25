import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class233 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!of;")
	private final Class236 aClass236_71 = new Class236(256);

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!oh;")
	private final Class237 aClass237_101;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class233(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_101 = arg2;
		this.aClass237_101.method6315(26);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method6151() {
		@Pc(10) Class236 local10 = this.aClass236_71;
		synchronized (this.aClass236_71) {
			this.aClass236_71.method6245();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public void method6153() {
		@Pc(6) Class236 local6 = this.aClass236_71;
		synchronized (this.aClass236_71) {
			this.aClass236_71.method6253();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	public void method6156() {
		@Pc(2) Class236 local2 = this.aClass236_71;
		synchronized (this.aClass236_71) {
			this.aClass236_71.method6243(5);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lclient!mw;")
	public Class8_Sub5_Sub12 method6159(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_71;
		@Pc(16) Class8_Sub5_Sub12 local16;
		synchronized (this.aClass236_71) {
			local16 = (Class8_Sub5_Sub12) this.aClass236_71.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_101;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_101) {
			local38 = this.aClass237_101.method6314(26, arg0);
		}
		local16 = new Class8_Sub5_Sub12();
		if (local38 != null) {
			local16.method5582(new Class8_Sub8(local38));
		}
		@Pc(60) Class236 local60 = this.aClass236_71;
		synchronized (this.aClass236_71) {
			this.aClass236_71.method6241((long) arg0, local16);
			return local16;
		}
	}
}
