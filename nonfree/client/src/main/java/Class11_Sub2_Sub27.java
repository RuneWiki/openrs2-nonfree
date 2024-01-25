import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class11_Sub2_Sub27 extends Class11_Sub2 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	private int anInt4481 = 1;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	private int anInt4489 = 0;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "I")
	private int anInt4491 = 0;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static22.method318();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(24) int local24 = Static155.anIntArray196[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static339.anInt6549; local32++) {
				@Pc(38) int local38 = Static73.anIntArray91[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt4489 == 0) {
					local71 = (local38 - local24) * this.anInt4481;
				} else {
					@Pc(61) int local61 = local44 * local44 + local30 * local30 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (this.anInt4481 * local71) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt4491 == 0) {
					local71 = Static284.anIntArray437[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4491 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local11[local32] = local71;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4489 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt4491 = arg0.method5185();
		} else if (arg1 == 3) {
			this.anInt4481 = arg0.method5185();
		}
	}
}
