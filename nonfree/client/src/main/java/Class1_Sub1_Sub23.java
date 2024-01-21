import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
	private int anInt2401;

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.method1801();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2401 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt2391 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt2392 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
	private void method1801() {
		@Pc(6) double local6 = Math.cos((double) (this.anInt2392 / 4096));
		this.anIntArray233[0] = (int) (local6 * Math.sin((double) (this.anInt2391 / 4096)) * 4096.0D);
		this.anIntArray233[1] = (int) (Math.cos((double) (this.anInt2391 / 4096)) * 4096.0D * local6);
		this.anIntArray233[2] = (int) (Math.sin((double) (this.anInt2392 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray233[0] * this.anIntArray233[0] >> 12;
		@Pc(82) int local82 = this.anIntArray233[1] * this.anIntArray233[1] >> 12;
		@Pc(94) int local94 = this.anIntArray233[2] * this.anIntArray233[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local94 + local82 + local65 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray233[2] = (this.anIntArray233[2] << 12) / local107;
			this.anIntArray233[0] = (this.anIntArray233[0] << 12) / local107;
			this.anIntArray233[1] = (this.anIntArray233[1] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(18) int local18 = this.anInt2401 * Static30.anInt1053 >> 12;
			@Pc(28) int[] local28 = this.method3012(0, Static93.anInt2716 & arg0 - 1);
			@Pc(34) int[] local34 = this.method3012(0, arg0);
			@Pc(44) int[] local44 = this.method3012(0, Static93.anInt2716 & arg0 + 1);
			for (@Pc(46) int local46 = 0; local46 < Static65.anInt1933; local46++) {
				@Pc(59) int local59 = (local44[local46] - local28[local46]) * local18;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(82) int local82 = local18 * (local34[Static64.anInt1922 & local46 + 1] - local34[local46 - 1 & Static64.anInt1922]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(92) int local92 = local86 * local86 >> 12;
				@Pc(98) int local98 = local63 * local63 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((local98 + local92 + 4096) / 4096)) * 4096.0D);
				@Pc(128) int local128;
				@Pc(124) int local124;
				@Pc(120) int local120;
				if (local111 == 0) {
					local120 = 0;
					local124 = 0;
					local128 = 0;
				} else {
					local120 = 16777216 / local111;
					local124 = local59 / local111;
					local128 = local82 / local111;
				}
				local120 = this.anIntArray233[2] * local120 >> 12;
				local128 = this.anIntArray233[0] * local128 >> 12;
				local124 = this.anIntArray233[1] * local124 >> 12;
				local7[local46] = local120 + local128 + local124;
			}
		}
		return local7;
	}
}
