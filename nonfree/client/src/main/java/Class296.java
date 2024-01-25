import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class296 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!h;")
	private Class125 aClass125_62 = new Class125(64);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!an;")
	private final Class16 aClass16_113;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class296(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_113 = arg2;
		if (this.aClass16_113 != null) {
			@Pc(20) int local20 = this.aClass16_113.method407() - 1;
			this.aClass16_113.method399(local20);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method7292() {
		@Pc(2) Class125 local2 = this.aClass125_62;
		synchronized (this.aClass125_62) {
			this.aClass125_62.method3442();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public void method7293(@OriginalArg(1) int arg0) {
		@Pc(2) Class125 local2 = this.aClass125_62;
		synchronized (this.aClass125_62) {
			this.aClass125_62.method3440();
			this.aClass125_62 = new Class125(arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
	public void method7295() {
		@Pc(2) Class125 local2 = this.aClass125_62;
		synchronized (this.aClass125_62) {
			this.aClass125_62.method3447(5);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Lclient!jl;")
	public Class161 method7298(@OriginalArg(0) int arg0) {
		@Pc(12) Class125 local12 = this.aClass125_62;
		@Pc(22) Class161 local22;
		synchronized (this.aClass125_62) {
			local22 = (Class161) this.aClass125_62.method3446((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class16 local35 = this.aClass16_113;
		@Pc(48) byte[] local48;
		synchronized (this.aClass16_113) {
			local48 = this.aClass16_113.method408(Static532.method7877(arg0), Static340.method5413(arg0));
		}
		local22 = new Class161();
		if (local48 != null) {
			local22.method4138(new Class12_Sub8(local48));
		}
		@Pc(70) Class125 local70 = this.aClass125_62;
		synchronized (this.aClass125_62) {
			this.aClass125_62.method3437(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method7299() {
		@Pc(6) Class125 local6 = this.aClass125_62;
		synchronized (this.aClass125_62) {
			this.aClass125_62.method3440();
		}
	}
}
