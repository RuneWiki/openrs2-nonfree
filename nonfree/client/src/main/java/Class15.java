import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class15 {

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!wg;")
	private final Class313 aClass313_2 = new Class313(64);

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Lclient!kr;")
	private final Class171 aClass171_16;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!kr;")
	public final Class171 aClass171_15;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;)V")
	public Class15(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_16 = arg2;
		this.aClass171_15 = arg3;
		this.aClass171_16.method4349(3);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public void method571() {
		@Pc(6) Class313 local6 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method7400();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public void method572() {
		@Pc(8) Class313 local8 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method7398();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public void method575() {
		@Pc(14) Class313 local14 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method7403(5);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lclient!wr;")
	public Class316 method577(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_2;
		@Pc(16) Class316 local16;
		synchronized (this.aClass313_2) {
			local16 = (Class316) this.aClass313_2.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class171 local37 = this.aClass171_16;
		@Pc(46) byte[] local46;
		synchronized (this.aClass171_16) {
			local46 = this.aClass171_16.method4339(3, arg0);
		}
		local16 = new Class316();
		local16.aClass15_2 = this;
		if (local46 != null) {
			local16.method7523(new Class1_Sub6(local46));
		}
		@Pc(71) Class313 local71 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method7399((long) arg0, local16);
			return local16;
		}
	}
}
