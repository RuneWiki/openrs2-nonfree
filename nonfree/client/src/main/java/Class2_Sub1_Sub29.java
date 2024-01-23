import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
	private int anInt4576 = 0;

	@OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
	private int anInt4580 = 1;

	@OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
	private int anInt4583 = 0;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4583 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt4576 = arg0.method4261();
		} else if (arg1 == 3) {
			this.anInt4580 = arg0.method4261();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		Static216.method3645();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(25) int local25 = Static234.anIntArray435[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static114.anInt1359; local33++) {
				@Pc(44) int local44 = Static281.anIntArray506[local33];
				@Pc(50) int local50 = local44 - 2048 >> 1;
				@Pc(64) int local64;
				if (this.anInt4583 == 0) {
					local64 = this.anInt4580 * (local44 - local25);
				} else {
					@Pc(76) int local76 = local50 * local50 + local31 * local31 >> 12;
					local64 = (int) (Math.sqrt((double) ((float) local76 / 4096.0F)) * 4096.0D);
					local64 = (int) ((double) (this.anInt4580 * local64) * 3.141592653589793D);
				}
				local64 -= local64 & 0xFFFFF000;
				if (this.anInt4576 == 0) {
					local64 = Static198.anIntArray344[local64 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4576 == 2) {
					local64 -= 2048;
					if (local64 < 0) {
						local64 = -local64;
					}
					local64 = 2048 - local64 << 1;
				}
				local7[local33] = local64;
			}
		}
		return local7;
	}
}
