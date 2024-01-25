import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class122 {

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!lh;")
	private final Class151 aClass151_80 = new Class151(64);

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!hh;")
	private final Class109 aClass109_39;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Lclient!hh;")
	public final Class109 aClass109_41;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;)V")
	public Class122(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3) {
		this.aClass109_39 = arg2;
		this.aClass109_41 = arg3;
		this.aClass109_39.method2322(3);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method2739() {
		@Pc(6) Class151 local6 = this.aClass151_80;
		synchronized (this.aClass151_80) {
			this.aClass151_80.method3298();
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public void method2741() {
		@Pc(2) Class151 local2 = this.aClass151_80;
		synchronized (this.aClass151_80) {
			this.aClass151_80.method3299();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Lclient!bu;")
	public Class35 method2742(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_80;
		@Pc(16) Class35 local16;
		synchronized (this.aClass151_80) {
			local16 = (Class35) this.aClass151_80.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass109_39.method2349(3, arg0);
		local16 = new Class35();
		local16.aClass122_1 = this;
		if (local39 != null) {
			local16.method526(new Class1_Sub14(local39));
		}
		@Pc(60) Class151 local60 = this.aClass151_80;
		synchronized (this.aClass151_80) {
			this.aClass151_80.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
	public void method2744() {
		@Pc(2) Class151 local2 = this.aClass151_80;
		synchronized (this.aClass151_80) {
			this.aClass151_80.method3297(5);
		}
	}
}
