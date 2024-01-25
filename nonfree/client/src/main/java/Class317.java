import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class317 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!wg;")
	private final Class313 aClass313_63 = new Class313(64);

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!kr;")
	private final Class171 aClass171_153;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class317(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_153 = arg2;
		if (this.aClass171_153 != null) {
			this.aClass171_153.method4349(11);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public void method7533() {
		@Pc(10) Class313 local10 = this.aClass313_63;
		synchronized (this.aClass313_63) {
			this.aClass313_63.method7400();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	public void method7534() {
		@Pc(2) Class313 local2 = this.aClass313_63;
		synchronized (this.aClass313_63) {
			this.aClass313_63.method7398();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
	public void method7535() {
		@Pc(11) Class313 local11 = this.aClass313_63;
		synchronized (this.aClass313_63) {
			this.aClass313_63.method7403(5);
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)Lclient!dr;")
	public Class71 method7539(@OriginalArg(0) int arg0) {
		@Pc(14) Class313 local14 = this.aClass313_63;
		@Pc(24) Class71 local24;
		synchronized (this.aClass313_63) {
			local24 = (Class71) this.aClass313_63.method7406((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class171 local37 = this.aClass171_153;
		@Pc(46) byte[] local46;
		synchronized (this.aClass171_153) {
			local46 = this.aClass171_153.method4339(11, arg0);
		}
		local24 = new Class71();
		if (local46 != null) {
			local24.method1653(new Class1_Sub6(local46));
		}
		@Pc(68) Class313 local68 = this.aClass313_63;
		synchronized (this.aClass313_63) {
			this.aClass313_63.method7399((long) arg0, local24);
			return local24;
		}
	}
}
