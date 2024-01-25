import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class352 {

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "Lclient!uf;")
	private final Class326 aClass326_55 = new Class326(64);

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "Lclient!uf;")
	public final Class326 aClass326_56 = new Class326(2);

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_125;

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "Lclient!ga;")
	public final Class111 aClass111_124;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;)V")
	public Class352(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3) {
		this.aClass111_125 = arg2;
		this.aClass111_124 = arg3;
		this.aClass111_125.method2442(33);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	public void method7712() {
		@Pc(2) Class326 local2 = this.aClass326_55;
		synchronized (this.aClass326_55) {
			this.aClass326_55.method7234();
		}
		local2 = this.aClass326_56;
		synchronized (this.aClass326_56) {
			this.aClass326_56.method7234();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public void method7714() {
		@Pc(2) Class326 local2 = this.aClass326_55;
		synchronized (this.aClass326_55) {
			this.aClass326_55.method7230();
		}
		local2 = this.aClass326_56;
		synchronized (this.aClass326_56) {
			this.aClass326_56.method7230();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
	public void method7715() {
		@Pc(6) Class326 local6 = this.aClass326_55;
		synchronized (this.aClass326_55) {
			this.aClass326_55.method7241(5);
		}
		local6 = this.aClass326_56;
		synchronized (this.aClass326_56) {
			this.aClass326_56.method7241(5);
		}
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Lclient!im;")
	public Class156 method7717(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_55;
		@Pc(16) Class156 local16;
		synchronized (this.aClass326_55) {
			local16 = (Class156) this.aClass326_55.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class111 local34 = this.aClass111_125;
		@Pc(43) byte[] local43;
		synchronized (this.aClass111_125) {
			local43 = this.aClass111_125.method2441(arg0, 33);
		}
		local16 = new Class156();
		local16.aClass352_1 = this;
		if (local43 != null) {
			local16.method3678(new Class1_Sub20(local43));
		}
		@Pc(68) Class326 local68 = this.aClass326_55;
		synchronized (this.aClass326_55) {
			this.aClass326_55.method7236(local16, (long) arg0);
			return local16;
		}
	}
}
