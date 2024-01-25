import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class184 {

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "Lclient!uf;")
	private Class326 aClass326_23 = new Class326(64);

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "Lclient!uf;")
	public Class326 aClass326_24 = new Class326(64);

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lclient!ga;")
	public final Class111 aClass111_60;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "Lclient!ga;")
	private final Class111 aClass111_59;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;)V")
	public Class184(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3) {
		this.aClass111_60 = arg3;
		this.aClass111_59 = arg2;
		this.aClass111_59.method2442(34);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)Lclient!nca;")
	public Class223 method4074(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_23;
		@Pc(16) Class223 local16;
		synchronized (this.aClass326_23) {
			local16 = (Class223) this.aClass326_23.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_59;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_59) {
			local38 = this.aClass111_59.method2441(arg0, 34);
		}
		local16 = new Class223();
		local16.aClass184_4 = this;
		if (local38 != null) {
			local16.method5100(new Class1_Sub20(local38));
		}
		@Pc(63) Class326 local63 = this.aClass326_23;
		synchronized (this.aClass326_23) {
			this.aClass326_23.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	public void method4075() {
		@Pc(6) Class326 local6 = this.aClass326_23;
		synchronized (this.aClass326_23) {
			this.aClass326_23.method7230();
		}
		local6 = this.aClass326_24;
		synchronized (this.aClass326_24) {
			this.aClass326_24.method7230();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BII)V")
	public void method4076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass326_23 = new Class326(arg0);
		this.aClass326_24 = new Class326(arg1);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
	public void method4077() {
		@Pc(2) Class326 local2 = this.aClass326_23;
		synchronized (this.aClass326_23) {
			this.aClass326_23.method7234();
		}
		local2 = this.aClass326_24;
		synchronized (this.aClass326_24) {
			this.aClass326_24.method7234();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)V")
	public void method4080() {
		@Pc(14) Class326 local14 = this.aClass326_23;
		synchronized (this.aClass326_23) {
			this.aClass326_23.method7241(5);
		}
		local14 = this.aClass326_24;
		synchronized (this.aClass326_24) {
			this.aClass326_24.method7241(5);
		}
	}
}
