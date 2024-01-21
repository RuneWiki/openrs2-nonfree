import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!la", name = "V", descriptor = "I")
	private int anInt2836;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		Static127.method2534();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2841 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt2839 = arg1.method1234();
		} else if (arg0 == 3) {
			this.anInt2836 = arg1.method1234();
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(24) int local24 = Static160.anIntArray399[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static22.anInt596; local32++) {
				@Pc(38) int local38 = Static167.anIntArray417[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(69) int local69;
				if (this.anInt2841 == 0) {
					local69 = this.anInt2836 * (local38 - local24);
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local69 = (int) (Math.sqrt((double) (local60 / 4096)) * 4096.0D);
					local69 = (int) ((double) (local69 * this.anInt2836) * 3.141592653589793D);
				}
				local69 -= local69 & 0xFFFFF000;
				if (this.anInt2839 == 0) {
					local69 = Static147.anIntArray366[local69 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2839 == 2) {
					local69 -= 2048;
					if (local69 < 0) {
						local69 = -local69;
					}
					local69 = 2048 - local69 << 1;
				}
				local16[local32] = local69;
			}
		}
		return local16;
	}
}
