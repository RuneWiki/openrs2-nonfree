import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
	private int anInt1999 = 4096;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(32) int[] local32 = this.method3580(Static91.anInt2110 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method3580(arg0, 0);
			@Pc(48) int[] local48 = this.method3580(Static91.anInt2110 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static115.anInt2578; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt1999;
				@Pc(84) int local84 = this.anInt1999 * (local38[local50 + 1 & Static48.anInt1202] - local38[local50 - 1 & Static48.anInt1202]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local16[local50] = 4096 - local126;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1999 = arg0.method2765();
		}
	}
}
