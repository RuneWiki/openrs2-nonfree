import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class165 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!lh;")
	private final Class151 aClass151_110 = new Class151(64);

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!hh;")
	private final Class109 aClass109_60;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class165(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_60 = arg2;
		this.aClass109_60.method2322(31);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public void method3593() {
		@Pc(6) Class151 local6 = this.aClass151_110;
		synchronized (this.aClass151_110) {
			this.aClass151_110.method3297(5);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method3594() {
		@Pc(12) Class151 local12 = this.aClass151_110;
		synchronized (this.aClass151_110) {
			this.aClass151_110.method3298();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lclient!sj;")
	public Class219 method3595(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_110;
		@Pc(18) Class219 local18;
		synchronized (this.aClass151_110) {
			local18 = (Class219) this.aClass151_110.method3288((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass109_60.method2349(31, arg0);
		local18 = new Class219();
		if (local35 != null) {
			local18.method5167(new Class1_Sub14(local35));
		}
		@Pc(51) Class151 local51 = this.aClass151_110;
		synchronized (this.aClass151_110) {
			this.aClass151_110.method3291((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public void method3596() {
		@Pc(14) Class151 local14 = this.aClass151_110;
		synchronized (this.aClass151_110) {
			this.aClass151_110.method3299();
		}
	}
}
