import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class361 {

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!gw;")
	public final Class136 aClass136_67 = new Class136(20);

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Lclient!gw;")
	private final Class136 aClass136_68 = new Class136(64);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Lclient!uu;")
	public final Class343 aClass343_263;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!uu;")
	private final Class343 aClass343_262;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class361(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_263 = arg3;
		this.aClass343_262 = arg2;
		this.aClass343_262.method8157(46);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method8365() {
		@Pc(6) Class136 local6 = this.aClass136_68;
		synchronized (this.aClass136_68) {
			this.aClass136_68.method3138();
		}
		local6 = this.aClass136_67;
		synchronized (this.aClass136_67) {
			this.aClass136_67.method3138();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V")
	public void method8366() {
		@Pc(2) Class136 local2 = this.aClass136_68;
		synchronized (this.aClass136_68) {
			this.aClass136_68.method3132(5);
		}
		local2 = this.aClass136_67;
		synchronized (this.aClass136_67) {
			this.aClass136_67.method3132(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Lclient!wf;")
	public Class372 method8367(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_68;
		@Pc(16) Class372 local16;
		synchronized (this.aClass136_68) {
			local16 = (Class372) this.aClass136_68.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_262;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_262) {
			local38 = this.aClass343_262.method8132(46, arg0);
		}
		local16 = new Class372();
		local16.aClass361_2 = this;
		if (local38 != null) {
			local16.method8515(new Class3_Sub9(local38));
		}
		@Pc(63) Class136 local63 = this.aClass136_68;
		synchronized (this.aClass136_68) {
			this.aClass136_68.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method8369() {
		@Pc(6) Class136 local6 = this.aClass136_68;
		synchronized (this.aClass136_68) {
			this.aClass136_68.method3142();
		}
		local6 = this.aClass136_67;
		synchronized (this.aClass136_67) {
			this.aClass136_67.method3142();
		}
	}
}
