import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class216 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!oo;")
	private final Class264 aClass264_39 = new Class264(64);

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "Lclient!oo;")
	public final Class264 aClass264_40 = new Class264(60);

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!wia;")
	private final Class386 aClass386_79;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!wia;")
	public final Class386 aClass386_80;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class216(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_79 = arg2;
		this.aClass386_80 = arg3;
		@Pc(26) int local26 = this.aClass386_79.method9189() - 1;
		this.aClass386_79.method9210(local26);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lclient!cl;")
	public Class60 method5268(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_39;
		@Pc(16) Class60 local16;
		synchronized (this.aClass264_39) {
			local16 = (Class60) this.aClass264_39.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_79;
		@Pc(42) byte[] local42;
		synchronized (this.aClass386_79) {
			local42 = this.aClass386_79.method9196(Static464.method6796(arg0), Static255.method3742(arg0));
		}
		local16 = new Class60();
		local16.aClass216_1 = this;
		local16.anInt1668 = arg0;
		if (local42 != null) {
			local16.method1443(new Class14_Sub29(local42));
		}
		@Pc(70) Class264 local70 = this.aClass264_39;
		synchronized (this.aClass264_39) {
			this.aClass264_39.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method5269() {
		@Pc(2) Class264 local2 = this.aClass264_39;
		synchronized (this.aClass264_39) {
			this.aClass264_39.method6368();
		}
		local2 = this.aClass264_40;
		synchronized (this.aClass264_40) {
			this.aClass264_40.method6368();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V")
	public void method5271() {
		@Pc(12) Class264 local12 = this.aClass264_39;
		synchronized (this.aClass264_39) {
			this.aClass264_39.method6360();
		}
		local12 = this.aClass264_40;
		synchronized (this.aClass264_40) {
			this.aClass264_40.method6360();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public void method5272(@OriginalArg(0) int arg0) {
		this.anInt6363 = arg0;
		@Pc(13) Class264 local13 = this.aClass264_40;
		synchronized (this.aClass264_40) {
			this.aClass264_40.method6360();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
	public void method5273() {
		@Pc(10) Class264 local10 = this.aClass264_39;
		synchronized (this.aClass264_39) {
			this.aClass264_39.method6366(5);
		}
		local10 = this.aClass264_40;
		synchronized (this.aClass264_40) {
			this.aClass264_40.method6366(5);
		}
	}
}
