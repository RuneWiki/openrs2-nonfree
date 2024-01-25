import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class222 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!gw;")
	private Class136 aClass136_41 = new Class136(64);

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_171;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class222(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_171 = arg2;
		if (this.aClass343_171 != null) {
			@Pc(20) int local20 = this.aClass343_171.method8144() - 1;
			this.aClass343_171.method8157(local20);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public void method5708(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3142();
			this.aClass136_41 = new Class136(arg0);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)Lclient!or;")
	public Class256 method5711(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_41;
		@Pc(22) Class256 local22;
		synchronized (this.aClass136_41) {
			local22 = (Class256) this.aClass136_41.method3134((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class343 local35 = this.aClass343_171;
		@Pc(48) byte[] local48;
		synchronized (this.aClass343_171) {
			local48 = this.aClass343_171.method8132(Static382.method6019(arg0), Static554.method7881(arg0));
		}
		local22 = new Class256();
		if (local48 != null) {
			local22.method6441(new Class3_Sub9(local48));
		}
		@Pc(70) Class136 local70 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3135(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public void method5712() {
		@Pc(2) Class136 local2 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3142();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
	public void method5713() {
		@Pc(2) Class136 local2 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3132(5);
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
	public void method5714() {
		@Pc(8) Class136 local8 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3138();
		}
	}
}
