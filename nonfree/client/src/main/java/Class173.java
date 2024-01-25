import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class173 {

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Lclient!jp;")
	private Class129 aClass129_45 = new Class129(128);

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Lclient!jp;")
	public Class129 aClass129_46 = new Class129(64);

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Lclient!pc;")
	public final Class188 aClass188_75;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!pc;")
	private final Class188 aClass188_74;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;)V")
	public Class173(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3) {
		this.aClass188_75 = arg3;
		this.aClass188_74 = arg2;
		this.aClass188_74.method4285(36);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZ)V")
	public void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass129_45 = new Class129(arg0);
		this.aClass129_46 = new Class129(arg1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V")
	public void method4019() {
		@Pc(6) Class129 local6 = this.aClass129_45;
		synchronized (this.aClass129_45) {
			this.aClass129_45.method3028(5);
		}
		local6 = this.aClass129_46;
		synchronized (this.aClass129_46) {
			this.aClass129_46.method3028(5);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V")
	public void method4020() {
		@Pc(6) Class129 local6 = this.aClass129_45;
		synchronized (this.aClass129_45) {
			this.aClass129_45.method3026();
		}
		local6 = this.aClass129_46;
		synchronized (this.aClass129_46) {
			this.aClass129_46.method3026();
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
	public void method4021() {
		@Pc(10) Class129 local10 = this.aClass129_45;
		synchronized (this.aClass129_45) {
			this.aClass129_45.method3025();
		}
		local10 = this.aClass129_46;
		synchronized (this.aClass129_46) {
			this.aClass129_46.method3025();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lclient!fh;")
	public Class83 method4022(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_45;
		@Pc(16) Class83 local16;
		synchronized (this.aClass129_45) {
			local16 = (Class83) this.aClass129_45.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_74.method4283(36, arg0);
		local16 = new Class83();
		local16.aClass173_1 = this;
		local16.anInt2321 = arg0;
		if (local33 != null) {
			local16.method1700(new Class2_Sub20(local33));
		}
		local16.method1707();
		@Pc(66) Class129 local66 = this.aClass129_45;
		synchronized (this.aClass129_45) {
			this.aClass129_45.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
