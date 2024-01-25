import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class233 {

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!gw;")
	private Class136 aClass136_43 = new Class136(64);

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!gw;")
	public Class136 aClass136_44 = new Class136(64);

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_178;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!uu;")
	public final Class343 aClass343_177;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class233(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_178 = arg2;
		this.aClass343_177 = arg3;
		this.aClass343_178.method8157(34);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method5858() {
		@Pc(6) Class136 local6 = this.aClass136_43;
		synchronized (this.aClass136_43) {
			this.aClass136_43.method3142();
		}
		local6 = this.aClass136_44;
		synchronized (this.aClass136_44) {
			this.aClass136_44.method3142();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZ)V")
	public void method5859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass136_43 = new Class136(arg0);
		this.aClass136_44 = new Class136(arg1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public void method5860() {
		@Pc(8) Class136 local8 = this.aClass136_43;
		synchronized (this.aClass136_43) {
			this.aClass136_43.method3138();
		}
		local8 = this.aClass136_44;
		synchronized (this.aClass136_44) {
			this.aClass136_44.method3138();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!db;")
	public Class64 method5863(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_43;
		@Pc(16) Class64 local16;
		synchronized (this.aClass136_43) {
			local16 = (Class64) this.aClass136_43.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_178;
		@Pc(40) byte[] local40;
		synchronized (this.aClass343_178) {
			local40 = this.aClass343_178.method8132(34, arg0);
		}
		local16 = new Class64();
		local16.aClass233_32 = this;
		if (local40 != null) {
			local16.method1483(new Class3_Sub9(local40));
		}
		@Pc(65) Class136 local65 = this.aClass136_43;
		synchronized (this.aClass136_43) {
			this.aClass136_43.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V")
	public void method5864() {
		@Pc(6) Class136 local6 = this.aClass136_43;
		synchronized (this.aClass136_43) {
			this.aClass136_43.method3132(5);
		}
		local6 = this.aClass136_44;
		synchronized (this.aClass136_44) {
			this.aClass136_44.method3132(5);
		}
	}
}
