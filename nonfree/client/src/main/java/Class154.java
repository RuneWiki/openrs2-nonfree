import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class154 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!gw;")
	private Class136 aClass136_30 = new Class136(128);

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!gw;")
	public Class136 aClass136_31 = new Class136(64);

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_116;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!uu;")
	public final Class343 aClass343_115;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class154(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_116 = arg2;
		this.aClass343_115 = arg3;
		this.aClass343_116.method8157(36);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public void method3938() {
		@Pc(6) Class136 local6 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3132(5);
		}
		local6 = this.aClass136_31;
		synchronized (this.aClass136_31) {
			this.aClass136_31.method3132(5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	public void method3941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass136_30 = new Class136(arg1);
		this.aClass136_31 = new Class136(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method3942() {
		@Pc(2) Class136 local2 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3138();
		}
		local2 = this.aClass136_31;
		synchronized (this.aClass136_31) {
			this.aClass136_31.method3138();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method3946() {
		@Pc(14) Class136 local14 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3142();
		}
		local14 = this.aClass136_31;
		synchronized (this.aClass136_31) {
			this.aClass136_31.method3142();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lclient!jo;")
	public Class179 method3947(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_30;
		@Pc(16) Class179 local16;
		synchronized (this.aClass136_30) {
			local16 = (Class179) this.aClass136_30.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class343 local37 = this.aClass343_116;
		@Pc(46) byte[] local46;
		synchronized (this.aClass343_116) {
			local46 = this.aClass343_116.method8132(36, arg0);
		}
		local16 = new Class179();
		local16.aClass154_4 = this;
		local16.anInt5341 = arg0;
		if (local46 != null) {
			local16.method4539(new Class3_Sub9(local46));
		}
		local16.method4531();
		@Pc(77) Class136 local77 = this.aClass136_30;
		synchronized (this.aClass136_30) {
			this.aClass136_30.method3135(local16, (long) arg0);
			return local16;
		}
	}
}
