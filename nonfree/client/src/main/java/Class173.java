import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class173 {

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!vh;")
	private Class330 aClass330_29 = new Class330(64);

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_38;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class173(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_38 = arg2;
		if (this.aClass248_38 != null) {
			@Pc(20) int local20 = this.aClass248_38.method5774() - 1;
			this.aClass248_38.method5793(local20);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public void method4041() {
		@Pc(6) Class330 local6 = this.aClass330_29;
		synchronized (this.aClass330_29) {
			this.aClass330_29.method7678();
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public void method4043() {
		@Pc(11) Class330 local11 = this.aClass330_29;
		synchronized (this.aClass330_29) {
			this.aClass330_29.method7688();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)V")
	public void method4045() {
		@Pc(6) Class330 local6 = this.aClass330_29;
		synchronized (this.aClass330_29) {
			this.aClass330_29.method7680(5);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lclient!tq;")
	public Class311 method4046(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_29;
		@Pc(16) Class311 local16;
		synchronized (this.aClass330_29) {
			local16 = (Class311) this.aClass330_29.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_38;
		@Pc(44) byte[] local44;
		synchronized (this.aClass248_38) {
			local44 = this.aClass248_38.method5797(Static485.method6818(arg0), Static249.method3888(arg0));
		}
		local16 = new Class311();
		if (local44 != null) {
			local16.method6970(new Class6_Sub12(local44));
		}
		@Pc(66) Class330 local66 = this.aClass330_29;
		synchronized (this.aClass330_29) {
			this.aClass330_29.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	public void method4047(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_29;
		synchronized (this.aClass330_29) {
			this.aClass330_29.method7688();
			this.aClass330_29 = new Class330(arg0);
		}
	}
}
