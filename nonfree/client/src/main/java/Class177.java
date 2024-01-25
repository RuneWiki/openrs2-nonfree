import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class177 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!lh;")
	private Class151 aClass151_115 = new Class151(64);

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!lh;")
	public Class151 aClass151_116 = new Class151(64);

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!hh;")
	private final Class109 aClass109_63;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!hh;")
	public final Class109 aClass109_62;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;)V")
	public Class177(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3) {
		this.aClass109_63 = arg2;
		this.aClass109_62 = arg3;
		this.aClass109_63.method2322(34);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)Lclient!dd;")
	public Class53 method3799(@OriginalArg(1) int arg0) {
		@Pc(11) Class151 local11 = this.aClass151_115;
		@Pc(21) Class53 local21;
		synchronized (this.aClass151_115) {
			local21 = (Class53) this.aClass151_115.method3288((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass109_63.method2349(34, arg0);
		local21 = new Class53();
		local21.aClass177_2 = this;
		if (local38 != null) {
			local21.method998(new Class1_Sub14(local38));
		}
		@Pc(57) Class151 local57 = this.aClass151_115;
		synchronized (this.aClass151_115) {
			this.aClass151_115.method3291((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
	public void method3800() {
		@Pc(11) Class151 local11 = this.aClass151_115;
		synchronized (this.aClass151_115) {
			this.aClass151_115.method3297(5);
		}
		local11 = this.aClass151_116;
		synchronized (this.aClass151_116) {
			this.aClass151_116.method3297(5);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	public void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass151_115 = new Class151(arg0);
		this.aClass151_116 = new Class151(arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public void method3803() {
		@Pc(6) Class151 local6 = this.aClass151_115;
		synchronized (this.aClass151_115) {
			this.aClass151_115.method3298();
		}
		local6 = this.aClass151_116;
		synchronized (this.aClass151_116) {
			this.aClass151_116.method3298();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	public void method3804() {
		@Pc(2) Class151 local2 = this.aClass151_115;
		synchronized (this.aClass151_115) {
			this.aClass151_115.method3299();
		}
		local2 = this.aClass151_116;
		synchronized (this.aClass151_116) {
			this.aClass151_116.method3299();
		}
	}
}
