import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
	private int anInt1472 = 0;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
	private int anInt1477 = 1;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	private int anInt1478 = 0;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		Static272.method4337();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1472 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt1478 = arg0.method4888();
		} else if (arg1 == 3) {
			this.anInt1477 = arg0.method4888();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(24) int local24 = Static201.anIntArray251[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static30.anInt908; local32++) {
				@Pc(38) int local38 = Static26.anIntArray20[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt1472 == 0) {
					local55 = (local38 - local24) * this.anInt1477;
				} else {
					@Pc(67) int local67 = local44 * local44 + local30 * local30 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (this.anInt1477 * local55) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt1478 == 0) {
					local55 = Static10.anIntArray5[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1478 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local16[local32] = local55;
			}
		}
		return local16;
	}
}
