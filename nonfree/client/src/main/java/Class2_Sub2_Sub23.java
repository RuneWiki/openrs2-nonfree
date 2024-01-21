import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	private int anInt2369;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2368 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt2369 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt2373 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
	private void method1681() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt2373 / 4096));
		this.anIntArray245[0] = (int) (local10 * Math.sin((double) (this.anInt2369 / 4096)) * 4096.0D);
		this.anIntArray245[1] = (int) (local10 * Math.cos((double) (this.anInt2369 / 4096)) * 4096.0D);
		this.anIntArray245[2] = (int) (Math.sin((double) (this.anInt2373 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray245[1] * this.anIntArray245[1] >> 12;
		@Pc(77) int local77 = this.anIntArray245[0] * this.anIntArray245[0] >> 12;
		@Pc(89) int local89 = this.anIntArray245[2] * this.anIntArray245[2] >> 12;
		@Pc(102) int local102 = (int) (Math.sqrt((double) (local89 + local65 + local77 >> 12)) * 4096.0D);
		if (local102 != 0) {
			this.anIntArray245[0] = (this.anIntArray245[0] << 12) / local102;
			this.anIntArray245[1] = (this.anIntArray245[1] << 12) / local102;
			this.anIntArray245[2] = (this.anIntArray245[2] << 12) / local102;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.method1681();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(25) int[] local25 = this.method2573(Static75.anInt1778 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method2573(arg0, 0);
			@Pc(43) int[] local43 = this.method2573(Static75.anInt1778 & arg0 + 1, 0);
			for (@Pc(45) int local45 = 0; local45 < Static149.anInt3233; local45++) {
				@Pc(58) int local58 = (local43[local45] - local25[local45]) * this.anInt2368;
				@Pc(78) int local78 = this.anInt2368 * (local31[Static145.anInt2636 & local45 + 1] - local31[local45 - 1 & Static145.anInt2636]);
				@Pc(82) int local82 = local78 >> 12;
				@Pc(86) int local86 = local58 >> 12;
				@Pc(92) int local92 = local82 * local82 >> 12;
				@Pc(98) int local98 = local86 * local86 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((local98 + local92 + 4096) / 4096)) * 4096.0D);
				@Pc(117) int local117;
				@Pc(115) int local115;
				@Pc(119) int local119;
				if (local111 == 0) {
					local115 = 0;
					local117 = 0;
					local119 = 0;
				} else {
					local117 = local78 / local111;
					local119 = 16777216 / local111;
					local115 = local58 / local111;
				}
				local117 = local117 * this.anIntArray245[0] >> 12;
				local119 = this.anIntArray245[2] * local119 >> 12;
				local115 = local115 * this.anIntArray245[1] >> 12;
				local11[local45] = local115 + local117 + local119;
			}
		}
		return local11;
	}
}
