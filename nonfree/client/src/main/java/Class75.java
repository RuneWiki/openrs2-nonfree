import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class75 {

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!lh;")
	private final Class151 aClass151_48 = new Class151(64);

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!hh;")
	private final Class109 aClass109_25;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class75(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_25 = arg2;
		if (this.aClass109_25 != null) {
			this.aClass109_25.method2322(11);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public void method1515() {
		@Pc(9) Class151 local9 = this.aClass151_48;
		synchronized (this.aClass151_48) {
			this.aClass151_48.method3299();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public void method1516() {
		@Pc(2) Class151 local2 = this.aClass151_48;
		synchronized (this.aClass151_48) {
			this.aClass151_48.method3298();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)Lclient!hc;")
	public Class108 method1517(@OriginalArg(1) int arg0) {
		@Pc(11) Class151 local11 = this.aClass151_48;
		@Pc(21) Class108 local21;
		synchronized (this.aClass151_48) {
			local21 = (Class108) this.aClass151_48.method3288((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass109_25.method2349(11, arg0);
		local21 = new Class108();
		if (local38 != null) {
			local21.method2258(new Class1_Sub14(local38));
		}
		@Pc(56) Class151 local56 = this.aClass151_48;
		synchronized (this.aClass151_48) {
			this.aClass151_48.method3291((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	public void method1518() {
		@Pc(2) Class151 local2 = this.aClass151_48;
		synchronized (this.aClass151_48) {
			this.aClass151_48.method3297(5);
		}
	}
}
