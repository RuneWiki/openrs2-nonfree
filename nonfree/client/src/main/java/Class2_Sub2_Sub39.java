import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
	private int anInt4882 = 0;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	private int anInt4880 = 1;

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
	private int anInt4886 = 0;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		Static97.method1685();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4886 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt4882 = arg0.method2122();
		} else if (arg1 == 3) {
			this.anInt4880 = arg0.method2122();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(24) int local24 = Static157.anIntArray604[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static54.anInt953; local32++) {
				@Pc(38) int local38 = Static179.anIntArray682[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt4886 == 0) {
					local58 = (local38 - local24) * this.anInt4880;
				} else {
					@Pc(70) int local70 = local30 * local30 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt4880 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt4882 == 0) {
					local58 = Static60.anIntArray168[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4882 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local16[local32] = local58;
			}
		}
		return local16;
	}
}
