import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class175 {

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!gw;")
	private final Class136 aClass136_33 = new Class136(256);

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_135;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class175(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_135 = arg2;
		this.aClass343_135.method8157(26);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method4471() {
		@Pc(6) Class136 local6 = this.aClass136_33;
		synchronized (this.aClass136_33) {
			this.aClass136_33.method3142();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Lclient!tt;")
	public Class3_Sub7_Sub21 method4472(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_33;
		@Pc(16) Class3_Sub7_Sub21 local16;
		synchronized (this.aClass136_33) {
			local16 = (Class3_Sub7_Sub21) this.aClass136_33.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_135;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_135) {
			local38 = this.aClass343_135.method8132(26, arg0);
		}
		local16 = new Class3_Sub7_Sub21();
		if (local38 != null) {
			local16.method7913(new Class3_Sub9(local38));
		}
		@Pc(70) Class136 local70 = this.aClass136_33;
		synchronized (this.aClass136_33) {
			this.aClass136_33.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
	public void method4473() {
		@Pc(6) Class136 local6 = this.aClass136_33;
		synchronized (this.aClass136_33) {
			this.aClass136_33.method3132(5);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public void method4474() {
		@Pc(6) Class136 local6 = this.aClass136_33;
		synchronized (this.aClass136_33) {
			this.aClass136_33.method3138();
		}
	}
}
