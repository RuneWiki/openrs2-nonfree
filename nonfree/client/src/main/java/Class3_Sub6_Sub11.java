import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class3_Sub6_Sub11 extends Class3_Sub6 {

	@OriginalMember(owner = "client!faa", name = "C", descriptor = "I")
	private int anInt2959 = 1;

	@OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
	private int anInt2961 = 0;

	@OriginalMember(owner = "client!faa", name = "I", descriptor = "I")
	private int anInt2963 = 0;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2963 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt2961 = arg0.method5175();
		} else if (arg1 == 3) {
			this.anInt2959 = arg0.method5175();
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(24) int local24 = Static525.anIntArray553[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static521.anInt8383; local32++) {
				@Pc(38) int local38 = Static73.anIntArray76[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt2963 == 0) {
					local68 = this.anInt2959 * (local38 - local24);
				} else {
					@Pc(58) int local58 = local44 * local44 + local30 * local30 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (local68 * this.anInt2959) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt2961 == 0) {
					local68 = Static52.anIntArray41[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2961 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local16[local32] = local68;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		Static195.method3275();
	}
}
