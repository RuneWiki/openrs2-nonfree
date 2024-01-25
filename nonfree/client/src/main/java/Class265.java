import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class265 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!gg;")
	private final Class112 aClass112_47 = new Class112(16);

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!kha;")
	private final Class181 aClass181_83;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class265(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_83 = arg2;
		this.aClass181_83.method5025(30);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	public void method6684() {
		@Pc(2) Class112 local2 = this.aClass112_47;
		synchronized (this.aClass112_47) {
			this.aClass112_47.method3643();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V")
	public void method6688() {
		@Pc(6) Class112 local6 = this.aClass112_47;
		synchronized (this.aClass112_47) {
			this.aClass112_47.method3637(5);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lclient!ld;")
	public Class197 method6689(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_47;
		@Pc(16) Class197 local16;
		synchronized (this.aClass112_47) {
			local16 = (Class197) this.aClass112_47.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_83) {
			local38 = this.aClass181_83.method5023(30, arg0);
		}
		local16 = new Class197();
		if (local38 != null) {
			local16.method5253(new Class3_Sub15(local38));
		}
		@Pc(60) Class112 local60 = this.aClass112_47;
		synchronized (this.aClass112_47) {
			this.aClass112_47.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public void method6690() {
		@Pc(12) Class112 local12 = this.aClass112_47;
		synchronized (this.aClass112_47) {
			this.aClass112_47.method3638();
		}
	}
}
