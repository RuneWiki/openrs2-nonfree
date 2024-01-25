import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class246 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!jp;")
	private final Class129 aClass129_70 = new Class129(64);

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Lclient!jp;")
	public final Class129 aClass129_71 = new Class129(2);

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!pc;")
	private final Class188 aClass188_120;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!pc;")
	public final Class188 aClass188_119;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;)V")
	public Class246(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3) {
		this.aClass188_120 = arg2;
		this.aClass188_119 = arg3;
		this.aClass188_120.method4285(33);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Lclient!g;")
	public Class92 method5504(@OriginalArg(1) int arg0) {
		@Pc(14) Class129 local14 = this.aClass129_70;
		@Pc(24) Class92 local24;
		synchronized (this.aClass129_70) {
			local24 = (Class92) this.aClass129_70.method3023((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass188_120.method4283(33, arg0);
		local24 = new Class92();
		local24.aClass246_1 = this;
		if (local41 != null) {
			local24.method1848(new Class2_Sub20(local41));
		}
		@Pc(60) Class129 local60 = this.aClass129_70;
		synchronized (this.aClass129_70) {
			this.aClass129_70.method3029(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V")
	public void method5507() {
		@Pc(2) Class129 local2 = this.aClass129_70;
		synchronized (this.aClass129_70) {
			this.aClass129_70.method3028(5);
		}
		local2 = this.aClass129_71;
		synchronized (this.aClass129_71) {
			this.aClass129_71.method3028(5);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5508() {
		@Pc(6) Class129 local6 = this.aClass129_70;
		synchronized (this.aClass129_70) {
			this.aClass129_70.method3025();
		}
		local6 = this.aClass129_71;
		synchronized (this.aClass129_71) {
			this.aClass129_71.method3025();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method5509() {
		@Pc(2) Class129 local2 = this.aClass129_70;
		synchronized (this.aClass129_70) {
			this.aClass129_70.method3026();
		}
		local2 = this.aClass129_71;
		synchronized (this.aClass129_71) {
			this.aClass129_71.method3026();
		}
	}
}
