import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	private int anInt4572 = 0;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
	private int anInt4574 = 1;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
	private int anInt4578 = 0;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4572 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt4578 = arg0.method3118();
		} else if (arg1 == 3) {
			this.anInt4574 = arg0.method3118();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(24) int local24 = Static9.anIntArray15[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static206.anInt4182; local32++) {
				@Pc(38) int local38 = Static329.anIntArray456[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt4572 == 0) {
					local57 = this.anInt4574 * (local38 - local24);
				} else {
					@Pc(70) int local70 = local44 * local44 + local30 * local30 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (local57 * this.anInt4574) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt4578 == 0) {
					local57 = Static88.anIntArray140[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4578 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local16[local32] = local57;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		Static79.method1728();
	}
}
