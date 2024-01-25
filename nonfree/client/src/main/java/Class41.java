import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class41 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!oo;")
	private final Class264 aClass264_12 = new Class264(64);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!wia;")
	private final Class386 aClass386_14;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class41(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_14 = arg2;
		this.aClass386_14.method9210(5);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lclient!nb;")
	public Class14_Sub3_Sub13 method1102(@OriginalArg(1) int arg0) {
		@Pc(12) Class264 local12 = this.aClass264_12;
		@Pc(22) Class14_Sub3_Sub13 local22;
		synchronized (this.aClass264_12) {
			local22 = (Class14_Sub3_Sub13) this.aClass264_12.method6367((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class386 local35 = this.aClass386_14;
		@Pc(44) byte[] local44;
		synchronized (this.aClass386_14) {
			local44 = this.aClass386_14.method9196(arg0, 5);
		}
		local22 = new Class14_Sub3_Sub13();
		if (local44 != null) {
			local22.method5700(new Class14_Sub29(local44));
		}
		@Pc(66) Class264 local66 = this.aClass264_12;
		synchronized (this.aClass264_12) {
			this.aClass264_12.method6364((long) arg0, local22);
			return local22;
		}
	}
}
