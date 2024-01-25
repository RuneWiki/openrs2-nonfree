import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class254 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!gw;")
	private final Class136 aClass136_46 = new Class136(64);

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!uu;")
	private final Class343 aClass343_196;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class254(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_196 = arg2;
		if (this.aClass343_196 != null) {
			this.aClass343_196.method8157(35);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)Lclient!pt;")
	public Class273 method6392(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_46;
		@Pc(16) Class273 local16;
		synchronized (this.aClass136_46) {
			local16 = (Class273) this.aClass136_46.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class343 local34 = this.aClass343_196;
		@Pc(43) byte[] local43;
		synchronized (this.aClass343_196) {
			local43 = this.aClass343_196.method8132(35, arg0);
		}
		local16 = new Class273();
		if (local43 != null) {
			local16.method6670(new Class3_Sub9(local43));
		}
		local16.method6669();
		@Pc(68) Class136 local68 = this.aClass136_46;
		synchronized (this.aClass136_46) {
			this.aClass136_46.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(BI)V")
	public void method6393() {
		@Pc(7) Class136 local7 = this.aClass136_46;
		synchronized (this.aClass136_46) {
			this.aClass136_46.method3132(5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public void method6394() {
		@Pc(6) Class136 local6 = this.aClass136_46;
		synchronized (this.aClass136_46) {
			this.aClass136_46.method3142();
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V")
	public void method6396() {
		@Pc(2) Class136 local2 = this.aClass136_46;
		synchronized (this.aClass136_46) {
			this.aClass136_46.method3138();
		}
	}
}
