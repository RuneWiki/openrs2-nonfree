import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class30 {

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Lclient!ad;")
	private final Class5 aClass5_6 = new Class5(64);

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!ad;")
	private final Class5 aClass5_7 = new Class5(100);

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!dn;")
	private final Class56 aClass56_16;

	static {
		new Class175("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;Lclient!dn;)V")
	public Class30(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3, @OriginalArg(4) Class56 arg4) {
		this.aClass56_16 = arg2;
		if (this.aClass56_16 != null) {
			@Pc(26) int local26 = this.aClass56_16.method1380() - 1;
			this.aClass56_16.method1373(local26);
		}
		Static388.method5286(arg4, arg3);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Lclient!iu;")
	public Class3_Sub3_Sub13 method934(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_7;
		@Pc(16) Class3_Sub3_Sub13 local16;
		synchronized (this.aClass5_7) {
			local16 = (Class3_Sub3_Sub13) this.aClass5_7.method104((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub3_Sub13(arg0);
				this.aClass5_7.method114((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method3085() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
	public void method937() {
		@Pc(12) Class5 local12 = this.aClass5_6;
		synchronized (this.aClass5_6) {
			this.aClass5_6.method106(5);
		}
		local12 = this.aClass5_7;
		synchronized (this.aClass5_7) {
			this.aClass5_7.method106(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method940() {
		@Pc(2) Class5 local2 = this.aClass5_6;
		synchronized (this.aClass5_6) {
			this.aClass5_6.method110();
		}
		local2 = this.aClass5_7;
		synchronized (this.aClass5_7) {
			this.aClass5_7.method110();
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
	public void method941() {
		@Pc(2) Class5 local2 = this.aClass5_6;
		synchronized (this.aClass5_6) {
			this.aClass5_6.method116();
		}
		local2 = this.aClass5_7;
		synchronized (this.aClass5_7) {
			this.aClass5_7.method116();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)Lclient!hi;")
	public Class96 method942(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_6;
		@Pc(16) Class96 local16;
		synchronized (this.aClass5_6) {
			local16 = (Class96) this.aClass5_6.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass56_16.method1384(Static275.method4096(arg0), Static346.method4962(arg0));
		local16 = new Class96();
		local16.anInt3325 = arg0;
		local16.aClass30_1 = this;
		if (local37 != null) {
			local16.method2711(new Class3_Sub2(local37));
		}
		local16.method2713();
		@Pc(62) Class5 local62 = this.aClass5_6;
		synchronized (this.aClass5_6) {
			this.aClass5_6.method114((long) arg0, local16);
			return local16;
		}
	}
}
