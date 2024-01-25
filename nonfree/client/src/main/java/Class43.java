import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class43 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Lclient!jp;")
	private final Class129 aClass129_9 = new Class129(64);

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_25;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class43(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_25 = arg2;
		if (this.aClass188_25 != null) {
			this.aClass188_25.method4285(11);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)Lclient!dd;")
	public Class47 method1210(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_9;
		@Pc(16) Class47 local16;
		synchronized (this.aClass129_9) {
			local16 = (Class47) this.aClass129_9.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_25.method4283(11, arg0);
		local16 = new Class47();
		if (local33 != null) {
			local16.method1270(new Class2_Sub20(local33));
		}
		@Pc(57) Class129 local57 = this.aClass129_9;
		synchronized (this.aClass129_9) {
			this.aClass129_9.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public void method1211() {
		@Pc(14) Class129 local14 = this.aClass129_9;
		synchronized (this.aClass129_9) {
			this.aClass129_9.method3026();
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	public void method1212() {
		@Pc(13) Class129 local13 = this.aClass129_9;
		synchronized (this.aClass129_9) {
			this.aClass129_9.method3025();
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	public void method1213() {
		@Pc(6) Class129 local6 = this.aClass129_9;
		synchronized (this.aClass129_9) {
			this.aClass129_9.method3028(5);
		}
	}
}
