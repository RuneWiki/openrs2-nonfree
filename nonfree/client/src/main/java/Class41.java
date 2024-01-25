import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class41 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!vh;")
	private final Class330 aClass330_14 = new Class330(128);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!pj;")
	private final Class248 aClass248_9;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class41(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_9 = arg2;
		this.aClass248_9.method5793(1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	public void method826() {
		@Pc(6) Class330 local6 = this.aClass330_14;
		synchronized (this.aClass330_14) {
			this.aClass330_14.method7680(5);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method827() {
		@Pc(11) Class330 local11 = this.aClass330_14;
		synchronized (this.aClass330_14) {
			this.aClass330_14.method7688();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!on;")
	public Class237 method829(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_14;
		@Pc(16) Class237 local16;
		synchronized (this.aClass330_14) {
			local16 = (Class237) this.aClass330_14.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_9;
		@Pc(40) byte[] local40;
		synchronized (this.aClass248_9) {
			local40 = this.aClass248_9.method5797(1, arg0);
		}
		local16 = new Class237();
		if (local40 != null) {
			local16.method5507(new Class6_Sub12(local40));
		}
		@Pc(62) Class330 local62 = this.aClass330_14;
		synchronized (this.aClass330_14) {
			this.aClass330_14.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public void method831() {
		@Pc(9) Class330 local9 = this.aClass330_14;
		synchronized (this.aClass330_14) {
			this.aClass330_14.method7678();
		}
	}
}
