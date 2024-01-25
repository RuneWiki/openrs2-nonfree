import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class218 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!ka;")
	private final Class132 aClass132_54 = new Class132(64);

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	public int anInt5994 = 0;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Lclient!dk;")
	private final Class54 aClass54_95;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public final int anInt5993;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class218(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_95 = arg2;
		this.anInt5993 = this.aClass54_95.method1123(4);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public void method4673() {
		@Pc(2) Class132 local2 = this.aClass132_54;
		synchronized (this.aClass132_54) {
			this.aClass132_54.method2708();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method4674() {
		@Pc(6) Class132 local6 = this.aClass132_54;
		synchronized (this.aClass132_54) {
			this.aClass132_54.method2713(5);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)Lclient!tf;")
	public Class233 method4676(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_54;
		@Pc(16) Class233 local16;
		synchronized (this.aClass132_54) {
			local16 = (Class233) this.aClass132_54.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_95;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_95) {
			local38 = this.aClass54_95.method1126(4, arg0);
		}
		local16 = new Class233();
		local16.anInt6332 = arg0;
		local16.aClass218_7 = this;
		if (local38 != null) {
			local16.method4935(new Class2_Sub13(local38));
		}
		local16.method4937();
		@Pc(76) Class132 local76 = this.aClass132_54;
		synchronized (this.aClass132_54) {
			this.aClass132_54.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	public void method4680() {
		@Pc(2) Class132 local2 = this.aClass132_54;
		synchronized (this.aClass132_54) {
			this.aClass132_54.method2698();
		}
	}
}
