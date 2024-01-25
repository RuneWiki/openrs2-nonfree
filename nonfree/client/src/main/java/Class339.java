import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class339 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "Lclient!pca;")
	private final Class245 aClass245_67 = new Class245(64);

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
	public int anInt9499 = 0;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "Lclient!jo;")
	private final Class168 aClass168_121;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
	public final int anInt9489;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class339(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_121 = arg2;
		this.anInt9489 = this.aClass168_121.method4443(4);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public void method7932() {
		@Pc(6) Class245 local6 = this.aClass245_67;
		synchronized (this.aClass245_67) {
			this.aClass245_67.method6079();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	public void method7933() {
		@Pc(10) Class245 local10 = this.aClass245_67;
		synchronized (this.aClass245_67) {
			this.aClass245_67.method6083(5);
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)Lclient!gf;")
	public Class113 method7934(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_67;
		@Pc(25) Class113 local25;
		synchronized (this.aClass245_67) {
			local25 = (Class113) this.aClass245_67.method6082((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class168 local38 = this.aClass168_121;
		@Pc(47) byte[] local47;
		synchronized (this.aClass168_121) {
			local47 = this.aClass168_121.method4435(arg0, 4);
		}
		local25 = new Class113();
		local25.anInt3832 = arg0;
		local25.aClass339_3 = this;
		if (local47 != null) {
			local25.method3387(new Class6_Sub26(local47));
		}
		local25.method3391();
		local6 = this.aClass245_67;
		synchronized (this.aClass245_67) {
			this.aClass245_67.method6075(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
	public void method7935() {
		@Pc(2) Class245 local2 = this.aClass245_67;
		synchronized (this.aClass245_67) {
			this.aClass245_67.method6076();
		}
	}
}
