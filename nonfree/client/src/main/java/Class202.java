import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class202 {

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Lclient!of;")
	private final Class236 aClass236_64 = new Class236(64);

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "Lclient!oh;")
	private final Class237 aClass237_93;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class202(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_93 = arg2;
		this.aClass237_93.method6315(32);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
	public void method5414() {
		@Pc(10) Class236 local10 = this.aClass236_64;
		synchronized (this.aClass236_64) {
			this.aClass236_64.method6243(5);
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)Lclient!fga;")
	public Class102 method5415(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_64;
		@Pc(16) Class102 local16;
		synchronized (this.aClass236_64) {
			local16 = (Class102) this.aClass236_64.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class237 local34 = this.aClass237_93;
		@Pc(43) byte[] local43;
		synchronized (this.aClass237_93) {
			local43 = this.aClass237_93.method6314(32, arg0);
		}
		local16 = new Class102();
		if (local43 != null) {
			local16.method3053(new Class8_Sub8(local43));
		}
		@Pc(65) Class236 local65 = this.aClass236_64;
		synchronized (this.aClass236_64) {
			this.aClass236_64.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	public void method5418() {
		@Pc(6) Class236 local6 = this.aClass236_64;
		synchronized (this.aClass236_64) {
			this.aClass236_64.method6253();
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)V")
	public void method5419() {
		@Pc(10) Class236 local10 = this.aClass236_64;
		synchronized (this.aClass236_64) {
			this.aClass236_64.method6245();
		}
	}
}
