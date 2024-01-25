import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class263 {

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!gw;")
	private final Class136 aClass136_48 = new Class136(128);

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!uu;")
	private final Class343 aClass343_205;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class263(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_205 = arg2;
		this.aClass343_205.method8157(1);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	public void method6563() {
		@Pc(2) Class136 local2 = this.aClass136_48;
		synchronized (this.aClass136_48) {
			this.aClass136_48.method3142();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	public void method6564() {
		@Pc(6) Class136 local6 = this.aClass136_48;
		synchronized (this.aClass136_48) {
			this.aClass136_48.method3132(5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public void method6565() {
		@Pc(6) Class136 local6 = this.aClass136_48;
		synchronized (this.aClass136_48) {
			this.aClass136_48.method3138();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lclient!rh;")
	public Class295 method6567(@OriginalArg(0) int arg0) {
		@Pc(14) Class136 local14 = this.aClass136_48;
		@Pc(24) Class295 local24;
		synchronized (this.aClass136_48) {
			local24 = (Class295) this.aClass136_48.method3134((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class343 local37 = this.aClass343_205;
		@Pc(46) byte[] local46;
		synchronized (this.aClass343_205) {
			local46 = this.aClass343_205.method8132(1, arg0);
		}
		local24 = new Class295();
		if (local46 != null) {
			local24.method7221(new Class3_Sub9(local46));
		}
		@Pc(68) Class136 local68 = this.aClass136_48;
		synchronized (this.aClass136_48) {
			this.aClass136_48.method3135(local24, (long) arg0);
			return local24;
		}
	}
}
