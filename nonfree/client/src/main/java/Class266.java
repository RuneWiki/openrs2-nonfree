import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class266 {

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lclient!uf;")
	private final Class326 aClass326_43 = new Class326(128);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "Lclient!ga;")
	private final Class111 aClass111_101;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class266(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_101 = arg2;
		if (this.aClass111_101 != null) {
			@Pc(20) int local20 = this.aClass111_101.method2436() - 1;
			this.aClass111_101.method2442(local20);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)Lclient!hba;")
	public Class129 method6014(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_43;
		@Pc(16) Class129 local16;
		synchronized (this.aClass326_43) {
			local16 = (Class129) this.aClass326_43.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass111_101.method2441(Static260.method4072(arg0), Static345.method5118(arg0));
		local16 = new Class129();
		if (local37 != null) {
			local16.method3217(new Class1_Sub20(local37));
		}
		@Pc(53) Class326 local53 = this.aClass326_43;
		synchronized (this.aClass326_43) {
			this.aClass326_43.method7236(local16, (long) arg0);
			return local16;
		}
	}
}
