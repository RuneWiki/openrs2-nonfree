import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
	public int anInt4036;

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "[Lclient!tg;")
	public Class81[] aClass81Array23;

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!vg", name = "U", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
	public int anInt4033 = 0;

	@OriginalMember(owner = "client!vg", name = "L", descriptor = "Lclient!tg;")
	public Class81 aClass81_1414 = Static86.aClass81_671;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method3079(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method336();
			if (local5 == 0) {
				return;
			}
			this.method3081(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method3081(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4041 = arg0.method336();
		} else if (arg1 == 2) {
			this.anInt4036 = arg0.method336();
		} else if (arg1 == 3) {
			this.aClass81_1414 = arg0.method344();
		} else if (arg1 == 4) {
			this.anInt4038 = arg0.method347();
		} else {
			@Pc(56) int local56;
			if (arg1 == 5) {
				this.anInt4033 = arg0.method359();
				this.aClass81Array23 = new Class81[this.anInt4033];
				this.anIntArray426 = new int[this.anInt4033];
				for (local56 = 0; local56 < this.anInt4033; local56++) {
					this.anIntArray426[local56] = arg0.method347();
					this.aClass81Array23[local56] = arg0.method344();
				}
			} else if (arg1 == 6) {
				this.anInt4033 = arg0.method359();
				this.anIntArray427 = new int[this.anInt4033];
				this.anIntArray426 = new int[this.anInt4033];
				for (local56 = 0; local56 < this.anInt4033; local56++) {
					this.anIntArray426[local56] = arg0.method347();
					this.anIntArray427[local56] = arg0.method347();
				}
			}
		}
	}
}
