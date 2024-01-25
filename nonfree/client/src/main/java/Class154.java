import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class154 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!oo;")
	private final Class264 aClass264_28 = new Class264(64);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!wia;")
	public final Class386 aClass386_59;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_60;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class154(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_59 = arg3;
		this.aClass386_60 = arg2;
		this.aClass386_60.method9210(3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3552() {
		@Pc(6) Class264 local6 = this.aClass264_28;
		synchronized (this.aClass264_28) {
			this.aClass264_28.method6368();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public void method3554() {
		@Pc(8) Class264 local8 = this.aClass264_28;
		synchronized (this.aClass264_28) {
			this.aClass264_28.method6366(5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method3556() {
		@Pc(10) Class264 local10 = this.aClass264_28;
		synchronized (this.aClass264_28) {
			this.aClass264_28.method6360();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!jj;")
	public Class181 method3557(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_28;
		@Pc(16) Class181 local16;
		synchronized (this.aClass264_28) {
			local16 = (Class181) this.aClass264_28.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_60;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_60) {
			local38 = this.aClass386_60.method9196(arg0, 3);
		}
		local16 = new Class181();
		local16.aClass154_1 = this;
		if (local38 != null) {
			local16.method4044(new Class14_Sub29(local38));
		}
		@Pc(70) Class264 local70 = this.aClass264_28;
		synchronized (this.aClass264_28) {
			this.aClass264_28.method6364((long) arg0, local16);
			return local16;
		}
	}
}
