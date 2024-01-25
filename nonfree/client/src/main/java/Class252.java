import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class252 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!jp;")
	private final Class129 aClass129_72 = new Class129(256);

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!pc;")
	private final Class188 aClass188_122;

	static {
		new Class222("", 73);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class252(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_122 = arg2;
		this.aClass188_122.method4285(26);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!ce;")
	public Class2_Sub2_Sub3 method5641(@OriginalArg(0) int arg0) {
		@Pc(11) Class129 local11 = this.aClass129_72;
		@Pc(21) Class2_Sub2_Sub3 local21;
		synchronized (this.aClass129_72) {
			local21 = (Class2_Sub2_Sub3) this.aClass129_72.method3023((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass188_122.method4283(26, arg0);
		local21 = new Class2_Sub2_Sub3();
		if (local38 != null) {
			local21.method942(new Class2_Sub20(local38));
		}
		@Pc(56) Class129 local56 = this.aClass129_72;
		synchronized (this.aClass129_72) {
			this.aClass129_72.method3029(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5642() {
		@Pc(6) Class129 local6 = this.aClass129_72;
		synchronized (this.aClass129_72) {
			this.aClass129_72.method3025();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
	public void method5644() {
		@Pc(6) Class129 local6 = this.aClass129_72;
		synchronized (this.aClass129_72) {
			this.aClass129_72.method3028(5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method5645() {
		@Pc(8) Class129 local8 = this.aClass129_72;
		synchronized (this.aClass129_72) {
			this.aClass129_72.method3026();
		}
	}
}
