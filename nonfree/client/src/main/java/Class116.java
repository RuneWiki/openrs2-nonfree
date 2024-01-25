import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class116 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!oo;")
	private Class264 aClass264_21 = new Class264(128);

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!oo;")
	public Class264 aClass264_22 = new Class264(64);

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!wia;")
	public final Class386 aClass386_41;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!wia;")
	private final Class386 aClass386_42;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class116(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_41 = arg3;
		this.aClass386_42 = arg2;
		this.aClass386_42.method9210(36);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!br;")
	public Class42 method2783(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_21;
		@Pc(16) Class42 local16;
		synchronized (this.aClass264_21) {
			local16 = (Class42) this.aClass264_21.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class386 local35 = this.aClass386_42;
		@Pc(44) byte[] local44;
		synchronized (this.aClass386_42) {
			local44 = this.aClass386_42.method9196(arg0, 36);
		}
		local16 = new Class42();
		local16.anInt1278 = arg0;
		local16.aClass116_1 = this;
		if (local44 != null) {
			local16.method1105(new Class14_Sub29(local44));
		}
		local16.method1115();
		@Pc(75) Class264 local75 = this.aClass264_21;
		synchronized (this.aClass264_21) {
			this.aClass264_21.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public void method2785() {
		@Pc(6) Class264 local6 = this.aClass264_21;
		synchronized (this.aClass264_21) {
			this.aClass264_21.method6368();
		}
		local6 = this.aClass264_22;
		synchronized (this.aClass264_22) {
			this.aClass264_22.method6368();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public void method2786() {
		@Pc(6) Class264 local6 = this.aClass264_21;
		synchronized (this.aClass264_21) {
			this.aClass264_21.method6360();
		}
		local6 = this.aClass264_22;
		synchronized (this.aClass264_22) {
			this.aClass264_22.method6360();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	public void method2787() {
		@Pc(6) Class264 local6 = this.aClass264_21;
		synchronized (this.aClass264_21) {
			this.aClass264_21.method6366(5);
		}
		local6 = this.aClass264_22;
		synchronized (this.aClass264_22) {
			this.aClass264_22.method6366(5);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	public void method2789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass264_21 = new Class264(arg0);
		this.aClass264_22 = new Class264(arg1);
	}
}
