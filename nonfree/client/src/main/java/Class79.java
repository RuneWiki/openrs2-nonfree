import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class79 {

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!jp;")
	private final Class129 aClass129_15 = new Class129(64);

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!pc;")
	private final Class188 aClass188_35;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public final int anInt2282;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class79(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_35 = arg2;
		this.anInt2282 = this.aClass188_35.method4285(19);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lclient!vq;")
	public Class257 method1686(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_15;
		@Pc(16) Class257 local16;
		synchronized (this.aClass129_15) {
			local16 = (Class257) this.aClass129_15.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass188_35.method4283(19, arg0);
		local16 = new Class257();
		if (local33 != null) {
			local16.method5794(new Class2_Sub20(local33));
		}
		@Pc(54) Class129 local54 = this.aClass129_15;
		synchronized (this.aClass129_15) {
			this.aClass129_15.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
