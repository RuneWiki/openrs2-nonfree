import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class370 {

	@OriginalMember(owner = "client!via", name = "g", descriptor = "Lclient!oo;")
	private final Class264 aClass264_64 = new Class264(64);

	@OriginalMember(owner = "client!via", name = "i", descriptor = "Lclient!wia;")
	private final Class386 aClass386_135;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class370(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_135 = arg2;
		if (this.aClass386_135 != null) {
			this.aClass386_135.method9210(35);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)V")
	public void method8861() {
		@Pc(2) Class264 local2 = this.aClass264_64;
		synchronized (this.aClass264_64) {
			this.aClass264_64.method6366(5);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
	public void method8864() {
		@Pc(6) Class264 local6 = this.aClass264_64;
		synchronized (this.aClass264_64) {
			this.aClass264_64.method6360();
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IB)Lclient!tn;")
	public Class342 method8865(@OriginalArg(0) int arg0) {
		@Pc(11) Class264 local11 = this.aClass264_64;
		@Pc(21) Class342 local21;
		synchronized (this.aClass264_64) {
			local21 = (Class342) this.aClass264_64.method6367((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class386 local34 = this.aClass386_135;
		@Pc(43) byte[] local43;
		synchronized (this.aClass386_135) {
			local43 = this.aClass386_135.method9196(arg0, 35);
		}
		local21 = new Class342();
		if (local43 != null) {
			local21.method8291(new Class14_Sub29(local43));
		}
		local21.method8293();
		@Pc(68) Class264 local68 = this.aClass264_64;
		synchronized (this.aClass264_64) {
			this.aClass264_64.method6364((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	public void method8866() {
		@Pc(12) Class264 local12 = this.aClass264_64;
		synchronized (this.aClass264_64) {
			this.aClass264_64.method6368();
		}
	}
}
