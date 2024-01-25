import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class262 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!of;")
	private final Class188 aClass188_56 = new Class188(64);

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "Lclient!mn;")
	private final Class171 aClass171_97;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class262(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_97 = arg2;
		this.aClass171_97.method3662(32);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method5908() {
		@Pc(8) Class188 local8 = this.aClass188_56;
		synchronized (this.aClass188_56) {
			this.aClass188_56.method4169(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public void method5910() {
		@Pc(2) Class188 local2 = this.aClass188_56;
		synchronized (this.aClass188_56) {
			this.aClass188_56.method4156();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method5912() {
		@Pc(6) Class188 local6 = this.aClass188_56;
		synchronized (this.aClass188_56) {
			this.aClass188_56.method4154();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lclient!gt;")
	public Class101 method5913(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_56;
		@Pc(16) Class101 local16;
		synchronized (this.aClass188_56) {
			local16 = (Class101) this.aClass188_56.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_97;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_97) {
			local38 = this.aClass171_97.method3658(32, arg0);
		}
		local16 = new Class101();
		if (local38 != null) {
			local16.method2202(new Class2_Sub17(local38));
		}
		@Pc(65) Class188 local65 = this.aClass188_56;
		synchronized (this.aClass188_56) {
			this.aClass188_56.method4155((long) arg0, local16);
			return local16;
		}
	}
}
