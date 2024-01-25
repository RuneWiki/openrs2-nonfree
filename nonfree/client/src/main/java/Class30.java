import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class30 {

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "Lclient!co;")
	private Class41 aClass41_4 = new Class41(64);

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "Lclient!co;")
	public Class41 aClass41_5 = new Class41(64);

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!g;")
	private final Class83 aClass83_18;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!g;")
	public final Class83 aClass83_17;

	static {
		new Class62("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;)V")
	public Class30(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3) {
		this.aClass83_18 = arg2;
		this.aClass83_17 = arg3;
		this.aClass83_18.method1955(34);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass41_4 = new Class41(arg0);
		this.aClass41_5 = new Class41(arg1);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
	public void method535() {
		@Pc(14) Class41 local14 = this.aClass41_4;
		synchronized (this.aClass41_4) {
			this.aClass41_4.method825();
		}
		local14 = this.aClass41_5;
		synchronized (this.aClass41_5) {
			this.aClass41_5.method825();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V")
	public void method536() {
		@Pc(2) Class41 local2 = this.aClass41_4;
		synchronized (this.aClass41_4) {
			this.aClass41_4.method826(5);
		}
		local2 = this.aClass41_5;
		synchronized (this.aClass41_5) {
			this.aClass41_5.method826(5);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method538() {
		@Pc(14) Class41 local14 = this.aClass41_4;
		synchronized (this.aClass41_4) {
			this.aClass41_4.method829();
		}
		local14 = this.aClass41_5;
		synchronized (this.aClass41_5) {
			this.aClass41_5.method829();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)Lclient!oo;")
	public Class173 method539(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_4;
		@Pc(16) Class173 local16;
		synchronized (this.aClass41_4) {
			local16 = (Class173) this.aClass41_4.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass83_18.method1968(arg0, 34);
		local16 = new Class173();
		local16.aClass30_4 = this;
		if (local40 != null) {
			local16.method4355(new Class2_Sub24(local40));
		}
		@Pc(59) Class41 local59 = this.aClass41_4;
		synchronized (this.aClass41_4) {
			this.aClass41_4.method832((long) arg0, local16);
			return local16;
		}
	}
}
