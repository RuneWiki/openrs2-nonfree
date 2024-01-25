import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class123 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!jp;")
	private final Class129 aClass129_28 = new Class129(16);

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Lclient!pc;")
	private final Class188 aClass188_51;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class123(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_51 = arg2;
		this.aClass188_51.method4285(30);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lclient!ae;")
	public Class5 method2818(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_28;
		@Pc(16) Class5 local16;
		synchronized (this.aClass129_28) {
			local16 = (Class5) this.aClass129_28.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_51.method4283(30, arg0);
		local16 = new Class5();
		if (local33 != null) {
			local16.method139(new Class2_Sub20(local33));
		}
		@Pc(49) Class129 local49 = this.aClass129_28;
		synchronized (this.aClass129_28) {
			this.aClass129_28.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void method2821() {
		@Pc(2) Class129 local2 = this.aClass129_28;
		synchronized (this.aClass129_28) {
			this.aClass129_28.method3025();
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V")
	public void method2824() {
		@Pc(10) Class129 local10 = this.aClass129_28;
		synchronized (this.aClass129_28) {
			this.aClass129_28.method3026();
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
	public void method2825() {
		@Pc(6) Class129 local6 = this.aClass129_28;
		synchronized (this.aClass129_28) {
			this.aClass129_28.method3028(5);
		}
	}
}
