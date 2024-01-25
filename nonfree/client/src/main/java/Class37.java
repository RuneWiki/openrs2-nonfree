import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class37 {

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	public int anInt1141;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!oo;")
	private final Class264 aClass264_9 = new Class264(64);

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "Lclient!oo;")
	public final Class264 aClass264_10 = new Class264(50);

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "Lclient!oo;")
	public final Class264 aClass264_11 = new Class264(5);

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!wia;")
	private final Class386 aClass386_13;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Lclient!dt;")
	public final Class77 aClass77_2;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!wia;")
	public final Class386 aClass386_12;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!dt;IZLclient!wia;Lclient!wia;)V")
	public Class37(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) Class386 arg4) {
		this.aClass386_13 = arg3;
		this.aClass77_2 = arg0;
		this.aClass386_12 = arg4;
		this.aBoolean99 = arg2;
		if (this.aClass386_13 != null) {
			@Pc(41) int local41 = this.aClass386_13.method9189() - 1;
			this.aClass386_13.method9210(local41);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public void method972() {
		@Pc(6) Class264 local6 = this.aClass264_10;
		synchronized (this.aClass264_10) {
			this.aClass264_10.method6360();
		}
		local6 = this.aClass264_11;
		synchronized (this.aClass264_11) {
			this.aClass264_11.method6360();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public void method973() {
		@Pc(6) Class264 local6 = this.aClass264_9;
		synchronized (this.aClass264_9) {
			this.aClass264_9.method6366(5);
		}
		local6 = this.aClass264_10;
		synchronized (this.aClass264_10) {
			this.aClass264_10.method6366(5);
		}
		local6 = this.aClass264_11;
		synchronized (this.aClass264_11) {
			this.aClass264_11.method6366(5);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Lclient!qha;")
	public Class283 method974(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_9;
		@Pc(16) Class283 local16;
		synchronized (this.aClass264_9) {
			local16 = (Class283) this.aClass264_9.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_13;
		@Pc(42) byte[] local42;
		synchronized (this.aClass386_13) {
			local42 = this.aClass386_13.method9196(Static85.method1590(arg0), Static668.method9242(arg0));
		}
		local16 = new Class283();
		local16.anInt8645 = arg0;
		local16.aClass37_2 = this;
		if (local42 != null) {
			local16.method7131(new Class14_Sub29(local42));
		}
		local16.method7126();
		@Pc(79) Class264 local79 = this.aClass264_9;
		synchronized (this.aClass264_9) {
			this.aClass264_9.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public void method976(@OriginalArg(1) int arg0) {
		this.anInt1141 = arg0;
		@Pc(9) Class264 local9 = this.aClass264_10;
		synchronized (this.aClass264_10) {
			this.aClass264_10.method6360();
		}
		local9 = this.aClass264_11;
		synchronized (this.aClass264_11) {
			this.aClass264_11.method6360();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
	public void method977() {
		@Pc(6) Class264 local6 = this.aClass264_9;
		synchronized (this.aClass264_9) {
			this.aClass264_9.method6368();
		}
		local6 = this.aClass264_10;
		synchronized (this.aClass264_10) {
			this.aClass264_10.method6368();
		}
		local6 = this.aClass264_11;
		synchronized (this.aClass264_11) {
			this.aClass264_11.method6368();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public void method978() {
		@Pc(2) Class264 local2 = this.aClass264_9;
		synchronized (this.aClass264_9) {
			this.aClass264_9.method6360();
		}
		local2 = this.aClass264_10;
		synchronized (this.aClass264_10) {
			this.aClass264_10.method6360();
		}
		local2 = this.aClass264_11;
		synchronized (this.aClass264_11) {
			this.aClass264_11.method6360();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZ)V")
	public void method979(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean99) {
			this.aBoolean99 = arg0;
			this.method978();
		}
	}
}
