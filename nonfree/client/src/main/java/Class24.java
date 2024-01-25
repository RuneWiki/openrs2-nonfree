import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class24 {

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!jp;")
	private final Class129 aClass129_3 = new Class129(128);

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!pc;")
	private final Class188 aClass188_13;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class24(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_13 = arg2;
		if (this.aClass188_13 != null) {
			@Pc(20) int local20 = this.aClass188_13.method4299() - 1;
			this.aClass188_13.method4285(local20);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Lclient!qr;")
	public Class204 method442(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_3;
		@Pc(16) Class204 local16;
		synchronized (this.aClass129_3) {
			local16 = (Class204) this.aClass129_3.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass188_13.method4283(Static356.method4999(arg0), Static351.method4908(arg0));
		local16 = new Class204();
		if (local37 != null) {
			local16.method4684(new Class2_Sub20(local37));
		}
		@Pc(53) Class129 local53 = this.aClass129_3;
		synchronized (this.aClass129_3) {
			this.aClass129_3.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
