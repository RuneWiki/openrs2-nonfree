import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
	private int anInt4815 = 0;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
	private int anInt4817 = 1;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
	private int anInt4823 = 0;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(26) int local26 = Static98.anIntArray221[arg0];
			@Pc(32) int local32 = local26 - 2048 >> 1;
			for (@Pc(34) int local34 = 0; local34 < Static75.anInt1848; local34++) {
				@Pc(45) int local45 = Static157.anIntArray331[local34];
				@Pc(51) int local51 = local45 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt4815 == 0) {
					local62 = this.anInt4817 * (local45 - local26);
				} else {
					@Pc(75) int local75 = local51 * local51 + local32 * local32 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local75 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (local62 * this.anInt4817) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt4823 == 0) {
					local62 = Static179.anIntArray362[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4823 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local13[local34] = local62;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		Static39.method882();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4815 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt4823 = arg0.method2655();
		} else if (arg1 == 3) {
			this.anInt4817 = arg0.method2655();
		}
	}
}
