import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class320 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!vh;")
	private Class330 aClass330_64 = new Class330(128);

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!vh;")
	public Class330 aClass330_65 = new Class330(64);

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!pj;")
	public final Class248 aClass248_101;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_102;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;)V")
	public Class320(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		this.aClass248_101 = arg3;
		this.aClass248_102 = arg2;
		this.aClass248_102.method5793(36);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	public void method7203() {
		@Pc(2) Class330 local2 = this.aClass330_64;
		synchronized (this.aClass330_64) {
			this.aClass330_64.method7680(5);
		}
		local2 = this.aClass330_65;
		synchronized (this.aClass330_65) {
			this.aClass330_65.method7680(5);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	public void method7204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass330_64 = new Class330(arg0);
		this.aClass330_65 = new Class330(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public void method7207() {
		@Pc(6) Class330 local6 = this.aClass330_64;
		synchronized (this.aClass330_64) {
			this.aClass330_64.method7678();
		}
		local6 = this.aClass330_65;
		synchronized (this.aClass330_65) {
			this.aClass330_65.method7678();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public void method7208() {
		@Pc(2) Class330 local2 = this.aClass330_64;
		synchronized (this.aClass330_64) {
			this.aClass330_64.method7688();
		}
		local2 = this.aClass330_65;
		synchronized (this.aClass330_65) {
			this.aClass330_65.method7688();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)Lclient!vu;")
	public Class336 method7209(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_64;
		@Pc(16) Class336 local16;
		synchronized (this.aClass330_64) {
			local16 = (Class336) this.aClass330_64.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class248 local35 = this.aClass248_102;
		@Pc(44) byte[] local44;
		synchronized (this.aClass248_102) {
			local44 = this.aClass248_102.method5797(36, arg0);
		}
		local16 = new Class336();
		local16.aClass320_4 = this;
		local16.anInt9763 = arg0;
		if (local44 != null) {
			local16.method7782(new Class6_Sub12(local44));
		}
		local16.method7780();
		@Pc(75) Class330 local75 = this.aClass330_64;
		synchronized (this.aClass330_64) {
			this.aClass330_64.method7676(local16, (long) arg0);
			return local16;
		}
	}
}
