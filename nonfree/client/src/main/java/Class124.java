import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class124 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!fa;")
	private final Class68 aClass68_21 = new Class68(64);

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public int anInt3849 = 0;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!fs;")
	private final Class76 aClass76_46;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public final int anInt3845;

	static {
		new Class83("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class124(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_46 = arg2;
		this.anInt3845 = this.aClass76_46.method2108(4);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method3149() {
		@Pc(2) Class68 local2 = this.aClass68_21;
		synchronized (this.aClass68_21) {
			this.aClass68_21.method1777();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!is;")
	public Class113 method3150(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_21;
		@Pc(16) Class113 local16;
		synchronized (this.aClass68_21) {
			local16 = (Class113) this.aClass68_21.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_46.method2104(arg0, 4);
		local16 = new Class113();
		local16.aClass124_4 = this;
		local16.anInt3385 = arg0;
		if (local33 != null) {
			local16.method2822(new Class4_Sub12(local33));
		}
		local16.method2818();
		@Pc(60) Class68 local60 = this.aClass68_21;
		synchronized (this.aClass68_21) {
			this.aClass68_21.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method3151() {
		@Pc(2) Class68 local2 = this.aClass68_21;
		synchronized (this.aClass68_21) {
			this.aClass68_21.method1791();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public void method3152() {
		@Pc(2) Class68 local2 = this.aClass68_21;
		synchronized (this.aClass68_21) {
			this.aClass68_21.method1788(5);
		}
	}
}
