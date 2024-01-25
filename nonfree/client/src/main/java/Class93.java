import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class93 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Lclient!uf;")
	private final Class326 aClass326_9 = new Class326(64);

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_27;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "Lclient!ga;")
	public final Class111 aClass111_28;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;)V")
	public Class93(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3) {
		this.aClass111_27 = arg2;
		this.aClass111_28 = arg3;
		this.aClass111_27.method2442(3);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	public void method2203() {
		@Pc(2) Class326 local2 = this.aClass326_9;
		synchronized (this.aClass326_9) {
			this.aClass326_9.method7230();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	public void method2204() {
		@Pc(12) Class326 local12 = this.aClass326_9;
		synchronized (this.aClass326_9) {
			this.aClass326_9.method7241(5);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lclient!vq;")
	public Class346 method2205(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_9;
		@Pc(16) Class346 local16;
		synchronized (this.aClass326_9) {
			local16 = (Class346) this.aClass326_9.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_27;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_27) {
			local38 = this.aClass111_27.method2441(arg0, 3);
		}
		local16 = new Class346();
		local16.aClass93_2 = this;
		if (local38 != null) {
			local16.method7633(new Class1_Sub20(local38));
		}
		@Pc(68) Class326 local68 = this.aClass326_9;
		synchronized (this.aClass326_9) {
			this.aClass326_9.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	public void method2208() {
		@Pc(6) Class326 local6 = this.aClass326_9;
		synchronized (this.aClass326_9) {
			this.aClass326_9.method7234();
		}
	}
}
