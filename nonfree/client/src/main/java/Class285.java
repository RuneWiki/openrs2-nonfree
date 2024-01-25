import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class285 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_53 = new Class112(64);

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!kha;")
	private final Class181 aClass181_97;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class285(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_97 = arg2;
		this.aClass181_97.method5025(32);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)Lclient!nk;")
	public Class232 method7014(@OriginalArg(1) int arg0) {
		@Pc(14) Class112 local14 = this.aClass112_53;
		@Pc(24) Class232 local24;
		synchronized (this.aClass112_53) {
			local24 = (Class232) this.aClass112_53.method3640((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class181 local37 = this.aClass181_97;
		@Pc(46) byte[] local46;
		synchronized (this.aClass181_97) {
			local46 = this.aClass181_97.method5023(32, arg0);
		}
		local24 = new Class232();
		if (local46 != null) {
			local24.method5992(new Class3_Sub15(local46));
		}
		@Pc(68) Class112 local68 = this.aClass112_53;
		synchronized (this.aClass112_53) {
			this.aClass112_53.method3636((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public void method7015() {
		@Pc(2) Class112 local2 = this.aClass112_53;
		synchronized (this.aClass112_53) {
			this.aClass112_53.method3643();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public void method7019() {
		@Pc(2) Class112 local2 = this.aClass112_53;
		synchronized (this.aClass112_53) {
			this.aClass112_53.method3638();
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(BI)V")
	public void method7021() {
		@Pc(2) Class112 local2 = this.aClass112_53;
		synchronized (this.aClass112_53) {
			this.aClass112_53.method3637(5);
		}
	}
}
