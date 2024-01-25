import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class39 {

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Lclient!uf;")
	private final Class326 aClass326_3 = new Class326(64);

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Lclient!ga;")
	private final Class111 aClass111_9;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	public final int anInt1359;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class39(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_9 = arg2;
		if (this.aClass111_9 == null) {
			this.anInt1359 = 0;
		} else {
			this.anInt1359 = this.aClass111_9.method2442(16);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method1239() {
		@Pc(6) Class326 local6 = this.aClass326_3;
		synchronized (this.aClass326_3) {
			this.aClass326_3.method7241(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public void method1240() {
		@Pc(14) Class326 local14 = this.aClass326_3;
		synchronized (this.aClass326_3) {
			this.aClass326_3.method7230();
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)Lclient!vf;")
	public Class341 method1243(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_3;
		@Pc(16) Class341 local16;
		synchronized (this.aClass326_3) {
			local16 = (Class341) this.aClass326_3.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_9;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_9) {
			local38 = this.aClass111_9.method2441(arg0, 16);
		}
		local16 = new Class341();
		if (local38 != null) {
			local16.method7513(new Class1_Sub20(local38));
		}
		@Pc(60) Class326 local60 = this.aClass326_3;
		synchronized (this.aClass326_3) {
			this.aClass326_3.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	public void method1245() {
		@Pc(6) Class326 local6 = this.aClass326_3;
		synchronized (this.aClass326_3) {
			this.aClass326_3.method7234();
		}
	}
}
