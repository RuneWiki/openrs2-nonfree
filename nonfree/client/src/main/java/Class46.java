import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class46 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!uf;")
	private Class326 aClass326_4 = new Class326(128);

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!uf;")
	public Class326 aClass326_5 = new Class326(64);

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!ga;")
	private final Class111 aClass111_12;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!ga;")
	public final Class111 aClass111_11;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;)V")
	public Class46(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3) {
		this.aClass111_12 = arg2;
		this.aClass111_11 = arg3;
		this.aClass111_12.method2442(36);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method1402() {
		@Pc(6) Class326 local6 = this.aClass326_4;
		synchronized (this.aClass326_4) {
			this.aClass326_4.method7230();
		}
		local6 = this.aClass326_5;
		synchronized (this.aClass326_5) {
			this.aClass326_5.method7230();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public void method1403() {
		@Pc(2) Class326 local2 = this.aClass326_4;
		synchronized (this.aClass326_4) {
			this.aClass326_4.method7234();
		}
		local2 = this.aClass326_5;
		synchronized (this.aClass326_5) {
			this.aClass326_5.method7234();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V")
	public void method1405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass326_4 = new Class326(arg1);
		this.aClass326_5 = new Class326(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public void method1407() {
		@Pc(6) Class326 local6 = this.aClass326_4;
		synchronized (this.aClass326_4) {
			this.aClass326_4.method7241(5);
		}
		local6 = this.aClass326_5;
		synchronized (this.aClass326_5) {
			this.aClass326_5.method7241(5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!kt;")
	public Class196 method1408(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_4;
		@Pc(16) Class196 local16;
		synchronized (this.aClass326_4) {
			local16 = (Class196) this.aClass326_4.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_12;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_12) {
			local38 = this.aClass111_12.method2441(arg0, 36);
		}
		local16 = new Class196();
		local16.anInt5164 = arg0;
		local16.aClass46_3 = this;
		if (local38 != null) {
			local16.method4337(new Class1_Sub20(local38));
		}
		local16.method4338();
		@Pc(74) Class326 local74 = this.aClass326_4;
		synchronized (this.aClass326_4) {
			this.aClass326_4.method7236(local16, (long) arg0);
			return local16;
		}
	}
}
