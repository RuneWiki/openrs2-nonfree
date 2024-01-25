import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class5_Sub3_Sub25 extends Class5_Sub3 {

	@OriginalMember(owner = "client!os", name = "P", descriptor = "I")
	private int anInt4727 = 0;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "I")
	private int anInt4726 = 1;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "I")
	private int anInt4725 = 0;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4725 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt4727 = arg0.method5115();
		} else if (arg1 == 3) {
			this.anInt4726 = arg0.method5115();
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(24) int local24 = Static345.anIntArray627[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static7.anInt129; local32++) {
				@Pc(38) int local38 = Static164.anIntArray337[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt4725 == 0) {
					local58 = this.anInt4726 * (local38 - local24);
				} else {
					@Pc(71) int local71 = local44 * local44 + local30 * local30 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt4726) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt4727 == 0) {
					local58 = Static77.anIntArray120[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4727 == 2) {
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

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		Static124.method2201();
	}
}
