import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class310 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_57 = new Class112(128);

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!kha;")
	private final Class181 aClass181_108;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class310(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_108 = arg2;
		this.aClass181_108.method5025(1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public void method7462() {
		@Pc(8) Class112 local8 = this.aClass112_57;
		synchronized (this.aClass112_57) {
			this.aClass112_57.method3637(5);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	public void method7463() {
		@Pc(6) Class112 local6 = this.aClass112_57;
		synchronized (this.aClass112_57) {
			this.aClass112_57.method3638();
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Lclient!ds;")
	public Class69 method7464(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_57;
		@Pc(18) Class69 local18;
		synchronized (this.aClass112_57) {
			local18 = (Class69) this.aClass112_57.method3640((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class181 local31 = this.aClass181_108;
		@Pc(40) byte[] local40;
		synchronized (this.aClass181_108) {
			local40 = this.aClass181_108.method5023(1, arg0);
		}
		local18 = new Class69();
		if (local40 != null) {
			local18.method2566(new Class3_Sub15(local40));
		}
		@Pc(62) Class112 local62 = this.aClass112_57;
		synchronized (this.aClass112_57) {
			this.aClass112_57.method3636((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	public void method7466() {
		@Pc(2) Class112 local2 = this.aClass112_57;
		synchronized (this.aClass112_57) {
			this.aClass112_57.method3643();
		}
	}
}
