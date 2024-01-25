import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class2_Sub4_Sub35 extends Class2_Sub4 {

	@OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
	private int anInt5762 = 1;

	@OriginalMember(owner = "client!tr", name = "X", descriptor = "I")
	private int anInt5769 = 0;

	@OriginalMember(owner = "client!tr", name = "W", descriptor = "I")
	private int anInt5768 = 0;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		Static299.method4462();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5769 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt5768 = arg0.method5350();
		} else if (arg1 == 3) {
			this.anInt5762 = arg0.method5350();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(24) int local24 = Static347.anIntArray1193[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static76.anInt1458; local32++) {
				@Pc(38) int local38 = Static40.anIntArray173[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(67) int local67;
				if (this.anInt5769 == 0) {
					local67 = (local38 - local24) * this.anInt5762;
				} else {
					@Pc(57) int local57 = local30 * local30 + local44 * local44 >> 12;
					local67 = (int) (Math.sqrt((double) ((float) local57 / 4096.0F)) * 4096.0D);
					local67 = (int) ((double) (this.anInt5762 * local67) * 3.141592653589793D);
				}
				local67 -= local67 & 0xFFFFF000;
				if (this.anInt5768 == 0) {
					local67 = Static1.anIntArray1354[local67 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5768 == 2) {
					local67 -= 2048;
					if (local67 < 0) {
						local67 = -local67;
					}
					local67 = 2048 - local67 << 1;
				}
				local16[local32] = local67;
			}
		}
		return local16;
	}
}
