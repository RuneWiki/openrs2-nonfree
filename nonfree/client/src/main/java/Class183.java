import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class183 {

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!uf;")
	private final Class326 aClass326_22 = new Class326(64);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!ga;")
	private final Class111 aClass111_58;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class183(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_58 = arg2;
		if (this.aClass111_58 != null) {
			this.aClass111_58.method2442(11);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method4067() {
		@Pc(2) Class326 local2 = this.aClass326_22;
		synchronized (this.aClass326_22) {
			this.aClass326_22.method7230();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method4068() {
		@Pc(11) Class326 local11 = this.aClass326_22;
		synchronized (this.aClass326_22) {
			this.aClass326_22.method7234();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public void method4069() {
		@Pc(2) Class326 local2 = this.aClass326_22;
		synchronized (this.aClass326_22) {
			this.aClass326_22.method7241(5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lclient!fq;")
	public Class105 method4071(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_22;
		@Pc(21) Class105 local21;
		synchronized (this.aClass326_22) {
			local21 = (Class105) this.aClass326_22.method7238((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class111 local34 = this.aClass111_58;
		@Pc(45) byte[] local45;
		synchronized (this.aClass111_58) {
			local45 = this.aClass111_58.method2441(arg0, 11);
		}
		local21 = new Class105();
		if (local45 != null) {
			local21.method2398(new Class1_Sub20(local45));
		}
		@Pc(67) Class326 local67 = this.aClass326_22;
		synchronized (this.aClass326_22) {
			this.aClass326_22.method7236(local21, (long) arg0);
			return local21;
		}
	}
}
