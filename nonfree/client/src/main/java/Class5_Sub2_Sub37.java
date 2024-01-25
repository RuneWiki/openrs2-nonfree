import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub2_Sub37 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	private int anInt10533 = 1;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	private int anInt10538 = 0;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
	private int anInt10543 = 0;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	@Override
	public void method8951() {
		Static47.method612();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10538 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt10543 = arg0.method7816();
		} else if (arg1 == 3) {
			this.anInt10533 = arg0.method7816();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(30) int local30 = Static369.anIntArray377[arg0];
			@Pc(36) int local36 = local30 - 2048 >> 1;
			for (@Pc(38) int local38 = 0; local38 < Static195.anInt3759; local38++) {
				@Pc(44) int local44 = Static554.anIntArray510[local38];
				@Pc(50) int local50 = local44 - 2048 >> 1;
				@Pc(76) int local76;
				if (this.anInt10538 == 0) {
					local76 = (local44 - local30) * this.anInt10533;
				} else {
					@Pc(66) int local66 = local36 * local36 + local50 * local50 >> 12;
					local76 = (int) (Math.sqrt((double) ((float) local66 / 4096.0F)) * 4096.0D);
					local76 = (int) ((double) (local76 * this.anInt10533) * 3.141592653589793D);
				}
				local76 -= local76 & 0xFFFFF000;
				if (this.anInt10543 == 0) {
					local76 = Static122.anIntArray545[local76 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt10543 == 2) {
					local76 -= 2048;
					if (local76 < 0) {
						local76 = -local76;
					}
					local76 = 2048 - local76 << 1;
				}
				local11[local38] = local76;
			}
		}
		return local11;
	}
}
