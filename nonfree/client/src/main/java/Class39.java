import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class39 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!lh;")
	private final Class151 aClass151_25 = new Class151(256);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!hh;")
	private final Class109 aClass109_19;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class39(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_19 = arg2;
		this.aClass109_19.method2322(26);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method577() {
		@Pc(11) Class151 local11 = this.aClass151_25;
		synchronized (this.aClass151_25) {
			this.aClass151_25.method3298();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!sn;")
	public Class1_Sub1_Sub13 method578(@OriginalArg(1) int arg0) {
		@Pc(11) Class151 local11 = this.aClass151_25;
		@Pc(21) Class1_Sub1_Sub13 local21;
		synchronized (this.aClass151_25) {
			local21 = (Class1_Sub1_Sub13) this.aClass151_25.method3288((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass109_19.method2349(26, arg0);
		local21 = new Class1_Sub1_Sub13();
		if (local38 != null) {
			local21.method5226(new Class1_Sub14(local38));
		}
		@Pc(54) Class151 local54 = this.aClass151_25;
		synchronized (this.aClass151_25) {
			this.aClass151_25.method3291((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public void method580() {
		@Pc(2) Class151 local2 = this.aClass151_25;
		synchronized (this.aClass151_25) {
			this.aClass151_25.method3299();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public void method581() {
		@Pc(2) Class151 local2 = this.aClass151_25;
		synchronized (this.aClass151_25) {
			this.aClass151_25.method3297(5);
		}
	}
}
