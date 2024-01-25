import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class252 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "[Lclient!df;")
	public Class47[] aClass47Array1;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	public int anInt7589;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public int anInt7590;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public int anInt7592;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!df;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "[I")
	public int[] anIntArray524;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	public final int anInt7591;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([BI)V")
	public Class252(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7591 = Static95.method1696(arg0.length, arg0);
		if (arg1 != this.anInt7591) {
			throw new RuntimeException();
		}
		this.method6225(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BI)V")
	private void method6225(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub1 local12 = new Class6_Sub1(Static392.method4244(arg0));
		@Pc(16) int local16 = local12.method6433();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt7589 = 0;
		} else {
			this.anInt7589 = local12.method6442();
		}
		@Pc(43) int local43 = local12.method6433();
		this.anInt7590 = local12.method6485();
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = -1;
		this.anIntArray523 = new int[this.anInt7590];
		for (@Pc(67) int local67 = 0; local67 < this.anInt7590; local67++) {
			this.anIntArray523[local67] = local50 += local12.method6485();
			if (this.anIntArray523[local67] > local52) {
				local52 = this.anIntArray523[local67];
			}
		}
		this.anInt7592 = local52 + 1;
		this.anIntArray524 = new int[this.anInt7592];
		this.anIntArrayArray54 = new int[this.anInt7592][];
		this.anIntArray521 = new int[this.anInt7592];
		this.anIntArray518 = new int[this.anInt7592];
		this.anIntArray520 = new int[this.anInt7592];
		@Pc(135) int local135;
		@Pc(153) int local153;
		if (local43 != 0) {
			this.anIntArray522 = new int[this.anInt7592];
			for (local135 = 0; local135 < this.anInt7592; local135++) {
				this.anIntArray522[local135] = -1;
			}
			for (local153 = 0; local153 < this.anInt7590; local153++) {
				this.anIntArray522[this.anIntArray523[local153]] = local12.method6442();
			}
			this.aClass47_1 = new Class47(this.anIntArray522);
		}
		for (local135 = 0; local135 < this.anInt7590; local135++) {
			this.anIntArray521[this.anIntArray523[local135]] = local12.method6442();
		}
		for (local153 = 0; local153 < this.anInt7590; local153++) {
			this.anIntArray518[this.anIntArray523[local153]] = local12.method6442();
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt7590; local225++) {
			this.anIntArray520[this.anIntArray523[local225]] = local12.method6485();
		}
		@Pc(251) int local251;
		@Pc(258) int local258;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(285) int local285;
		for (@Pc(244) int local244 = 0; local244 < this.anInt7590; local244++) {
			local251 = this.anIntArray523[local244];
			local50 = 0;
			local258 = this.anIntArray520[local251];
			local260 = -1;
			this.anIntArrayArray54[local251] = new int[local258];
			for (local268 = 0; local268 < local258; local268++) {
				local285 = this.anIntArrayArray54[local251][local268] = local50 += local12.method6485();
				if (local260 < local285) {
					local260 = local285;
				}
			}
			this.anIntArray524[local251] = local260 + 1;
			if (local258 == local260 + 1) {
				this.anIntArrayArray54[local251] = null;
			}
		}
		if (local43 == 0) {
			return;
		}
		this.anIntArrayArray53 = new int[local52 + 1][];
		this.aClass47Array1 = new Class47[local52 + 1];
		for (local251 = 0; local251 < this.anInt7590; local251++) {
			local258 = this.anIntArray523[local251];
			local260 = this.anIntArray520[local258];
			this.anIntArrayArray53[local258] = new int[this.anIntArray524[local258]];
			for (local268 = 0; local268 < this.anIntArray524[local258]; local268++) {
				this.anIntArrayArray53[local258][local268] = -1;
			}
			for (local285 = 0; local285 < local260; local285++) {
				@Pc(390) int local390;
				if (this.anIntArrayArray54[local258] == null) {
					local390 = local285;
				} else {
					local390 = this.anIntArrayArray54[local258][local285];
				}
				this.anIntArrayArray53[local258][local390] = local12.method6442();
			}
			this.aClass47Array1[local258] = new Class47(this.anIntArrayArray53[local258]);
		}
	}
}
