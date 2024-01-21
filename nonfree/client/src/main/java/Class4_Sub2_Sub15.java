import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class4_Sub2_Sub15 extends Class4_Sub2 {

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	public int anInt2873;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "[Lclient!ja;")
	public Class39[] aClass39Array21;

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!te", name = "sb", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "I")
	public int anInt2871 = 0;

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "Lclient!ja;")
	public Class39 aClass39_1511 = Static117.aClass39_1542;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!s;I)V")
	public void method2012(@OriginalArg(0) Class4_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1474();
			if (local13 == 0) {
				return;
			}
			this.method2013(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!s;BI)V")
	private void method2013(@OriginalArg(0) Class4_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2886 = arg0.method1474();
		} else if (arg1 == 2) {
			this.anInt2873 = arg0.method1474();
		} else if (arg1 == 3) {
			this.aClass39_1511 = arg0.method1464();
		} else if (arg1 == 4) {
			this.anInt2874 = arg0.method1486();
		} else {
			@Pc(58) int local58;
			if (arg1 == 5) {
				this.anInt2871 = arg0.method1490();
				this.anIntArray311 = new int[this.anInt2871];
				this.aClass39Array21 = new Class39[this.anInt2871];
				for (local58 = 0; local58 < this.anInt2871; local58++) {
					this.anIntArray311[local58] = arg0.method1486();
					this.aClass39Array21[local58] = arg0.method1464();
				}
				return;
			}
			if (arg1 == 6) {
				this.anInt2871 = arg0.method1490();
				this.anIntArray310 = new int[this.anInt2871];
				this.anIntArray311 = new int[this.anInt2871];
				for (local58 = 0; local58 < this.anInt2871; local58++) {
					this.anIntArray311[local58] = arg0.method1486();
					this.anIntArray310[local58] = arg0.method1486();
				}
				return;
			}
		}
	}
}
