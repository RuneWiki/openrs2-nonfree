import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	public int anInt2605;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "[Lclient!cd;")
	public Class10[] aClass10Array19;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!cd;")
	public Class10 aClass10_1123 = Static147.aClass10_1616;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	public int anInt2613 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!va;)V")
	private void method1843(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2606 = arg1.method1461();
		} else if (arg0 == 2) {
			this.anInt2608 = arg1.method1461();
		} else if (arg0 == 3) {
			this.aClass10_1123 = arg1.method1452();
		} else if (arg0 == 4) {
			this.anInt2605 = arg1.method1449();
		} else {
			@Pc(52) int local52;
			if (arg0 == 5) {
				this.anInt2613 = arg1.method1456();
				this.aClass10Array19 = new Class10[this.anInt2613];
				this.anIntArray276 = new int[this.anInt2613];
				for (local52 = 0; local52 < this.anInt2613; local52++) {
					this.anIntArray276[local52] = arg1.method1449();
					this.aClass10Array19[local52] = arg1.method1452();
				}
			} else if (arg0 == 6) {
				this.anInt2613 = arg1.method1456();
				this.anIntArray276 = new int[this.anInt2613];
				this.anIntArray275 = new int[this.anInt2613];
				for (local52 = 0; local52 < this.anInt2613; local52++) {
					this.anIntArray276[local52] = arg1.method1449();
					this.anIntArray275[local52] = arg1.method1449();
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!va;I)V")
	public void method1844(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1461();
			if (local9 == 0) {
				return;
			}
			this.method1843(local9, arg0);
		}
	}
}
