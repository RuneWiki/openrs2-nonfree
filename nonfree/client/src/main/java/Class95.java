import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class95 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!wg;")
	private final Class313 aClass313_14 = new Class313(64);

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!wg;")
	public final Class313 aClass313_15 = new Class313(2);

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!kr;")
	private final Class171 aClass171_49;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!kr;")
	public final Class171 aClass171_50;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;)V")
	public Class95(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_49 = arg2;
		this.aClass171_50 = arg3;
		this.aClass171_49.method4349(33);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method2261() {
		@Pc(6) Class313 local6 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method7400();
		}
		local6 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method7400();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!mh;")
	public Class192 method2263(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_14;
		@Pc(16) Class192 local16;
		synchronized (this.aClass313_14) {
			local16 = (Class192) this.aClass313_14.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_49;
		@Pc(47) byte[] local47;
		synchronized (this.aClass171_49) {
			local47 = this.aClass171_49.method4339(33, arg0);
		}
		local16 = new Class192();
		local16.aClass95_1 = this;
		if (local47 != null) {
			local16.method4750(new Class1_Sub6(local47));
		}
		@Pc(72) Class313 local72 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	public void method2266() {
		@Pc(12) Class313 local12 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method7398();
		}
		local12 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method7398();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
	public void method2267() {
		@Pc(2) Class313 local2 = this.aClass313_14;
		synchronized (this.aClass313_14) {
			this.aClass313_14.method7403(5);
		}
		local2 = this.aClass313_15;
		synchronized (this.aClass313_15) {
			this.aClass313_15.method7403(5);
		}
	}
}
