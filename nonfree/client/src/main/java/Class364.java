import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class364 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!of;")
	private final Class236 aClass236_103 = new Class236(64);

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!oh;")
	private final Class237 aClass237_145;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class364(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_145 = arg2;
		this.aClass237_145.method6315(31);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public void method8367() {
		@Pc(2) Class236 local2 = this.aClass236_103;
		synchronized (this.aClass236_103) {
			this.aClass236_103.method6253();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method8369() {
		@Pc(13) Class236 local13 = this.aClass236_103;
		synchronized (this.aClass236_103) {
			this.aClass236_103.method6245();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public void method8371() {
		@Pc(6) Class236 local6 = this.aClass236_103;
		synchronized (this.aClass236_103) {
			this.aClass236_103.method6243(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Lclient!pn;")
	public Class261 method8372(@OriginalArg(0) int arg0) {
		@Pc(14) Class236 local14 = this.aClass236_103;
		@Pc(24) Class261 local24;
		synchronized (this.aClass236_103) {
			local24 = (Class261) this.aClass236_103.method6242((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class237 local37 = this.aClass237_145;
		@Pc(46) byte[] local46;
		synchronized (this.aClass237_145) {
			local46 = this.aClass237_145.method6314(31, arg0);
		}
		local24 = new Class261();
		if (local46 != null) {
			local24.method6715(new Class8_Sub8(local46));
		}
		@Pc(68) Class236 local68 = this.aClass236_103;
		synchronized (this.aClass236_103) {
			this.aClass236_103.method6241((long) arg0, local24);
			return local24;
		}
	}
}
