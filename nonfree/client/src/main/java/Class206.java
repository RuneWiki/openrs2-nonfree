import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class206 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!uf;")
	private final Class326 aClass326_27 = new Class326(64);

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public int anInt5535 = 0;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!ga;")
	private final Class111 aClass111_71;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public final int anInt5530;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class206(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_71 = arg2;
		this.anInt5530 = this.aClass111_71.method2442(4);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
	public void method4717() {
		@Pc(2) Class326 local2 = this.aClass326_27;
		synchronized (this.aClass326_27) {
			this.aClass326_27.method7241(5);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!sv;")
	public Class303 method4718(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_27;
		@Pc(16) Class303 local16;
		synchronized (this.aClass326_27) {
			local16 = (Class303) this.aClass326_27.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_71) {
			local38 = this.aClass111_71.method2441(arg0, 4);
		}
		local16 = new Class303();
		local16.anInt8304 = arg0;
		local16.aClass206_6 = this;
		if (local38 != null) {
			local16.method6914(new Class1_Sub20(local38));
		}
		local16.method6915();
		@Pc(74) Class326 local74 = this.aClass326_27;
		synchronized (this.aClass326_27) {
			this.aClass326_27.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method4719() {
		@Pc(2) Class326 local2 = this.aClass326_27;
		synchronized (this.aClass326_27) {
			this.aClass326_27.method7234();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	public void method4720() {
		@Pc(12) Class326 local12 = this.aClass326_27;
		synchronized (this.aClass326_27) {
			this.aClass326_27.method7230();
		}
	}
}
