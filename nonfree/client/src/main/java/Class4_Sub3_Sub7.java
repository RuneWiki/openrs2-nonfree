import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class4_Sub3_Sub7 extends Class4_Sub3 {

	@OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
	private int anInt1799 = 0;

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
	private int anInt1804 = 0;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
	private int anInt1801 = 1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(24) int local24 = Static376.anIntArray531[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static304.anInt5637; local32++) {
				@Pc(38) int local38 = Static231.anIntArray368[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt1799 == 0) {
					local71 = (local38 - local24) * this.anInt1801;
				} else {
					@Pc(61) int local61 = local44 * local44 + local30 * local30 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt1801) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt1804 == 0) {
					local71 = Static275.anIntArray396[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1804 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local16[local32] = local71;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		Static58.method1272();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1799 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt1804 = arg1.method4614();
		} else if (arg0 == 3) {
			this.anInt1801 = arg1.method4614();
		}
	}
}
