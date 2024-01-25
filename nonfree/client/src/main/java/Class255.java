import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class255 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!uf;")
	private final Class326 aClass326_39 = new Class326(64);

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_97;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class255(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_97 = arg2;
		if (this.aClass111_97 != null) {
			this.aClass111_97.method2442(35);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method5725() {
		@Pc(14) Class326 local14 = this.aClass326_39;
		synchronized (this.aClass326_39) {
			this.aClass326_39.method7230();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public void method5728() {
		@Pc(6) Class326 local6 = this.aClass326_39;
		synchronized (this.aClass326_39) {
			this.aClass326_39.method7234();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)Lclient!fb;")
	public Class95 method5729(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_39;
		@Pc(16) Class95 local16;
		synchronized (this.aClass326_39) {
			local16 = (Class95) this.aClass326_39.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_97;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_97) {
			local38 = this.aClass111_97.method2441(arg0, 35);
		}
		local16 = new Class95();
		if (local38 != null) {
			local16.method2234(new Class1_Sub20(local38));
		}
		local16.method2237();
		@Pc(72) Class326 local72 = this.aClass326_39;
		synchronized (this.aClass326_39) {
			this.aClass326_39.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public void method5730() {
		@Pc(2) Class326 local2 = this.aClass326_39;
		synchronized (this.aClass326_39) {
			this.aClass326_39.method7241(5);
		}
	}
}
