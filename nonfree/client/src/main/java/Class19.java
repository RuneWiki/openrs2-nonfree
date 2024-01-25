import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!ge;")
	private final Class83 aClass83_6 = new Class83(64);

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!ci;")
	private final Class38 aClass38_4;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!ci;")
	private final Class38 aClass38_3;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ILclient!ci;Lclient!ci;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_4 = arg1;
		this.aClass38_3 = arg2;
		if (this.aClass38_4 != null) {
			this.aClass38_4.method1032(0);
		}
		if (this.aClass38_3 != null) {
			this.aClass38_3.method1032(0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)Lclient!ov;")
	public Class4_Sub1_Sub14 method355(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub1_Sub14 local16 = (Class4_Sub1_Sub14) this.aClass83_6.method2338((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = this.aClass38_4.method1039(arg0, 0);
		} else {
			local30 = this.aClass38_3.method1039(arg0 & 0x7FFF, 0);
		}
		local16 = new Class4_Sub1_Sub14();
		if (local30 != null) {
			local16.method4542(new Class4_Sub20(local30));
		}
		if (arg0 >= 32768) {
			local16.method4545();
		}
		this.aClass83_6.method2337(local16, (long) arg0);
		return local16;
	}
}
