import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class67 {

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "Lclient!gw;")
	private final Class136 aClass136_16 = new Class136(64);

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Lclient!gw;")
	public final Class136 aClass136_17 = new Class136(2);

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_54;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "Lclient!uu;")
	public final Class343 aClass343_53;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class67(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_54 = arg2;
		this.aClass343_53 = arg3;
		this.aClass343_54.method8157(33);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)Lclient!vw;")
	public Class365 method1573(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_16;
		@Pc(16) Class365 local16;
		synchronized (this.aClass136_16) {
			local16 = (Class365) this.aClass136_16.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class343 local37 = this.aClass343_54;
		@Pc(46) byte[] local46;
		synchronized (this.aClass343_54) {
			local46 = this.aClass343_54.method8132(33, arg0);
		}
		local16 = new Class365();
		local16.aClass67_2 = this;
		if (local46 != null) {
			local16.method8429(new Class3_Sub9(local46));
		}
		@Pc(71) Class136 local71 = this.aClass136_16;
		synchronized (this.aClass136_16) {
			this.aClass136_16.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BI)V")
	public void method1575() {
		@Pc(2) Class136 local2 = this.aClass136_16;
		synchronized (this.aClass136_16) {
			this.aClass136_16.method3132(5);
		}
		local2 = this.aClass136_17;
		synchronized (this.aClass136_17) {
			this.aClass136_17.method3132(5);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	public void method1576() {
		@Pc(6) Class136 local6 = this.aClass136_16;
		synchronized (this.aClass136_16) {
			this.aClass136_16.method3142();
		}
		local6 = this.aClass136_17;
		synchronized (this.aClass136_17) {
			this.aClass136_17.method3142();
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)V")
	public void method1577() {
		@Pc(2) Class136 local2 = this.aClass136_16;
		synchronized (this.aClass136_16) {
			this.aClass136_16.method3138();
		}
		local2 = this.aClass136_17;
		synchronized (this.aClass136_17) {
			this.aClass136_17.method3138();
		}
	}
}
