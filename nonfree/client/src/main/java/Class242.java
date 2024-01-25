import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class242 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!vh;")
	private final Class330 aClass330_43 = new Class330(64);

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!pj;")
	private final Class248 aClass248_66;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!pj;")
	public final Class248 aClass248_65;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;)V")
	public Class242(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		this.aClass248_66 = arg2;
		this.aClass248_65 = arg3;
		this.aClass248_66.method5793(3);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lclient!efa;")
	public Class86 method5667(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_43;
		@Pc(16) Class86 local16;
		synchronized (this.aClass330_43) {
			local16 = (Class86) this.aClass330_43.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_66;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_66) {
			local38 = this.aClass248_66.method5797(3, arg0);
		}
		local16 = new Class86();
		local16.aClass242_1 = this;
		if (local38 != null) {
			local16.method1912(new Class6_Sub12(local38));
		}
		@Pc(63) Class330 local63 = this.aClass330_43;
		synchronized (this.aClass330_43) {
			this.aClass330_43.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public void method5669() {
		@Pc(2) Class330 local2 = this.aClass330_43;
		synchronized (this.aClass330_43) {
			this.aClass330_43.method7678();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	public void method5670() {
		@Pc(6) Class330 local6 = this.aClass330_43;
		synchronized (this.aClass330_43) {
			this.aClass330_43.method7688();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V")
	public void method5671() {
		@Pc(6) Class330 local6 = this.aClass330_43;
		synchronized (this.aClass330_43) {
			this.aClass330_43.method7680(5);
		}
	}
}
