import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class93 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!jp;")
	private final Class129 aClass129_18 = new Class129(64);

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!pc;")
	private final Class188 aClass188_38;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class93(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_38 = arg2;
		if (this.aClass188_38 != null) {
			this.aClass188_38.method4285(35);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public void method1858() {
		@Pc(2) Class129 local2 = this.aClass129_18;
		synchronized (this.aClass129_18) {
			this.aClass129_18.method3025();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method1861() {
		@Pc(6) Class129 local6 = this.aClass129_18;
		synchronized (this.aClass129_18) {
			this.aClass129_18.method3026();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	public void method1862() {
		@Pc(6) Class129 local6 = this.aClass129_18;
		synchronized (this.aClass129_18) {
			this.aClass129_18.method3028(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!uf;")
	public Class241 method1863(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_18;
		@Pc(16) Class241 local16;
		synchronized (this.aClass129_18) {
			local16 = (Class241) this.aClass129_18.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_38.method4283(35, arg0);
		local16 = new Class241();
		if (local33 != null) {
			local16.method5459(new Class2_Sub20(local33));
		}
		local16.method5465();
		@Pc(57) Class129 local57 = this.aClass129_18;
		synchronized (this.aClass129_18) {
			this.aClass129_18.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
