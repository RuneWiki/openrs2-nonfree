import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class98 {

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!uf;")
	private final Class326 aClass326_10 = new Class326(64);

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!uf;")
	public final Class326 aClass326_11 = new Class326(60);

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!ga;")
	public final Class111 aClass111_31;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_30;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;Lclient!ga;)V")
	public Class98(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) Class111 arg3) {
		this.aClass111_31 = arg3;
		this.aClass111_30 = arg2;
		@Pc(26) int local26 = this.aClass111_30.method2436() - 1;
		this.aClass111_30.method2442(local26);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!gf;")
	public Class116 method2295(@OriginalArg(0) int arg0) {
		@Pc(11) Class326 local11 = this.aClass326_10;
		@Pc(21) Class116 local21;
		synchronized (this.aClass326_10) {
			local21 = (Class116) this.aClass326_10.method7238((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class111 local34 = this.aClass111_30;
		@Pc(47) byte[] local47;
		synchronized (this.aClass111_30) {
			local47 = this.aClass111_30.method2441(Static363.method6678(arg0), Static574.method7735(arg0));
		}
		local21 = new Class116();
		local21.aClass98_1 = this;
		local21.anInt3013 = arg0;
		if (local47 != null) {
			local21.method2539(new Class1_Sub20(local47));
		}
		@Pc(75) Class326 local75 = this.aClass326_10;
		synchronized (this.aClass326_10) {
			this.aClass326_10.method7236(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
	public void method2297(@OriginalArg(1) int arg0) {
		this.anInt2721 = arg0;
		@Pc(9) Class326 local9 = this.aClass326_11;
		synchronized (this.aClass326_11) {
			this.aClass326_11.method7230();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method2299() {
		@Pc(14) Class326 local14 = this.aClass326_10;
		synchronized (this.aClass326_10) {
			this.aClass326_10.method7230();
		}
		local14 = this.aClass326_11;
		synchronized (this.aClass326_11) {
			this.aClass326_11.method7230();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public void method2300() {
		@Pc(10) Class326 local10 = this.aClass326_10;
		synchronized (this.aClass326_10) {
			this.aClass326_10.method7241(5);
		}
		local10 = this.aClass326_11;
		synchronized (this.aClass326_11) {
			this.aClass326_11.method7241(5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public void method2304() {
		@Pc(10) Class326 local10 = this.aClass326_10;
		synchronized (this.aClass326_10) {
			this.aClass326_10.method7234();
		}
		local10 = this.aClass326_11;
		synchronized (this.aClass326_11) {
			this.aClass326_11.method7234();
		}
	}
}
