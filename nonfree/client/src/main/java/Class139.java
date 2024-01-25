import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class139 {

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_28 = new Class288(64);

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "Lclient!gp;")
	private final Class117 aClass117_106;

	static {
		new Class40("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class139(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_106 = arg2;
		this.aClass117_106.method2951(31);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	public void method3295() {
		@Pc(2) Class288 local2 = this.aClass288_28;
		synchronized (this.aClass288_28) {
			this.aClass288_28.method6742();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BI)Lclient!si;")
	public Class268 method3296(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_28;
		@Pc(16) Class268 local16;
		synchronized (this.aClass288_28) {
			local16 = (Class268) this.aClass288_28.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_106;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_106) {
			local38 = this.aClass117_106.method2962(arg0, 31);
		}
		local16 = new Class268();
		if (local38 != null) {
			local16.method6337(new Class5_Sub3(local38));
		}
		@Pc(68) Class288 local68 = this.aClass288_28;
		synchronized (this.aClass288_28) {
			this.aClass288_28.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public void method3297() {
		@Pc(10) Class288 local10 = this.aClass288_28;
		synchronized (this.aClass288_28) {
			this.aClass288_28.method6735(5);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	public void method3298() {
		@Pc(6) Class288 local6 = this.aClass288_28;
		synchronized (this.aClass288_28) {
			this.aClass288_28.method6744();
		}
	}
}
