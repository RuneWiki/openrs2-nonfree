import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class14_Sub1_Sub33 extends Class14_Sub1 {

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
	private int anInt9926 = 0;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	private int anInt9922 = 0;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
	private int anInt9927 = 1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(25) int local25 = Static336.anIntArray458[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static371.anInt6835; local33++) {
				@Pc(39) int local39 = Static160.anIntArray258[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(69) int local69;
				if (this.anInt9922 == 0) {
					local69 = (local39 - local25) * this.anInt9927;
				} else {
					@Pc(59) int local59 = local45 * local45 + local31 * local31 >> 12;
					local69 = (int) (Math.sqrt((double) ((float) local59 / 4096.0F)) * 4096.0D);
					local69 = (int) ((double) (local69 * this.anInt9927) * 3.141592653589793D);
				}
				local69 -= local69 & 0xFFFFF000;
				if (this.anInt9926 == 0) {
					local69 = Static656.anIntArray814[local69 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt9926 == 2) {
					local69 -= 2048;
					if (local69 < 0) {
						local69 = -local69;
					}
					local69 = 2048 - local69 << 1;
				}
				local11[local33] = local69;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		Static277.method4028();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9922 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt9926 = arg0.method5866();
		} else if (arg1 == 3) {
			this.anInt9927 = arg0.method5866();
		}
	}
}
