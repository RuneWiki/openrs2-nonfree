import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class162 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!mq;")
	private Class154 aClass154_31 = new Class154(64);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "Lclient!fc;")
	private final Class71 aClass71_59;

	static {
		new Class221("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class162(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_59 = arg2;
		if (this.aClass71_59 != null) {
			@Pc(20) int local20 = this.aClass71_59.method1553() - 1;
			this.aClass71_59.method1580(local20);
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public void method3874() {
		@Pc(2) Class154 local2 = this.aClass154_31;
		synchronized (this.aClass154_31) {
			this.aClass154_31.method3746();
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Lclient!ah;")
	public Class6 method3876(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_31;
		@Pc(16) Class6 local16;
		synchronized (this.aClass154_31) {
			local16 = (Class6) this.aClass154_31.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass71_59.method1555(Static28.method686(arg0), Static85.method1488(arg0));
		local16 = new Class6();
		if (local39 != null) {
			local16.method194(new Class2_Sub13(local39));
		}
		@Pc(57) Class154 local57 = this.aClass154_31;
		synchronized (this.aClass154_31) {
			this.aClass154_31.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
	public void method3877() {
		@Pc(6) Class154 local6 = this.aClass154_31;
		synchronized (this.aClass154_31) {
			this.aClass154_31.method3758(5);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public void method3878() {
		@Pc(2) Class154 local2 = this.aClass154_31;
		synchronized (this.aClass154_31) {
			this.aClass154_31.method3748();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	public void method3879(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_31;
		synchronized (this.aClass154_31) {
			this.aClass154_31.method3748();
			this.aClass154_31 = new Class154(arg0);
		}
	}
}
