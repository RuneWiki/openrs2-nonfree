import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class59 {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Lclient!ge;")
	private final Class83 aClass83_13 = new Class83(64);

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public int anInt1972 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!ci;")
	private final Class38 aClass38_18;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public final int anInt1966;

	static {
		new Class21("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class21("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class59(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_18 = arg2;
		this.anInt1966 = this.aClass38_18.method1032(4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public void method1762() {
		@Pc(12) Class83 local12 = this.aClass83_13;
		synchronized (this.aClass83_13) {
			this.aClass83_13.method2336();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lclient!wi;")
	public Class271 method1763(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_13;
		@Pc(18) Class271 local18;
		synchronized (this.aClass83_13) {
			local18 = (Class271) this.aClass83_13.method2338((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class38 local31 = this.aClass38_18;
		@Pc(40) byte[] local40;
		synchronized (this.aClass38_18) {
			local40 = this.aClass38_18.method1039(arg0, 4);
		}
		local18 = new Class271();
		local18.aClass59_6 = this;
		local18.anInt7790 = arg0;
		if (local40 != null) {
			local18.method6204(new Class4_Sub20(local40));
		}
		local18.method6199();
		@Pc(73) Class83 local73 = this.aClass83_13;
		synchronized (this.aClass83_13) {
			this.aClass83_13.method2337(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	public void method1765() {
		@Pc(6) Class83 local6 = this.aClass83_13;
		synchronized (this.aClass83_13) {
			this.aClass83_13.method2345(5);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method1766() {
		@Pc(10) Class83 local10 = this.aClass83_13;
		synchronized (this.aClass83_13) {
			this.aClass83_13.method2346();
		}
	}
}
