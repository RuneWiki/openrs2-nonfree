import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class195 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "Lclient!co;")
	private Class41 aClass41_64 = new Class41(128);

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Lclient!co;")
	public Class41 aClass41_65 = new Class41(64);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!g;")
	private final Class83 aClass83_103;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Lclient!g;")
	public final Class83 aClass83_104;

	static {
		new Class62("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;)V")
	public Class195(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3) {
		this.aClass83_103 = arg2;
		this.aClass83_104 = arg3;
		this.aClass83_103.method1955(36);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public void method4810() {
		@Pc(6) Class41 local6 = this.aClass41_64;
		synchronized (this.aClass41_64) {
			this.aClass41_64.method825();
		}
		local6 = this.aClass41_65;
		synchronized (this.aClass41_65) {
			this.aClass41_65.method825();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V")
	public void method4811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass41_64 = new Class41(arg1);
		this.aClass41_65 = new Class41(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
	public void method4812() {
		@Pc(2) Class41 local2 = this.aClass41_64;
		synchronized (this.aClass41_64) {
			this.aClass41_64.method826(5);
		}
		local2 = this.aClass41_65;
		synchronized (this.aClass41_65) {
			this.aClass41_65.method826(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)V")
	public void method4815() {
		@Pc(6) Class41 local6 = this.aClass41_64;
		synchronized (this.aClass41_64) {
			this.aClass41_64.method829();
		}
		local6 = this.aClass41_65;
		synchronized (this.aClass41_65) {
			this.aClass41_65.method829();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lclient!so;")
	public Class212 method4816(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_64;
		@Pc(16) Class212 local16;
		synchronized (this.aClass41_64) {
			local16 = (Class212) this.aClass41_64.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_103.method1968(arg0, 36);
		local16 = new Class212();
		local16.anInt5989 = arg0;
		local16.aClass195_4 = this;
		if (local33 != null) {
			local16.method5245(new Class2_Sub24(local33));
		}
		local16.method5238();
		@Pc(58) Class41 local58 = this.aClass41_64;
		synchronized (this.aClass41_64) {
			this.aClass41_64.method832((long) arg0, local16);
			return local16;
		}
	}
}
