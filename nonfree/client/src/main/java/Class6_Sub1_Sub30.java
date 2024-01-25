import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class6_Sub1_Sub30 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
	private int anInt8385 = 0;

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
	private int anInt8388 = 1;

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
	private int anInt8386 = 0;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		Static621.method8513();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(19) int local19 = Static603.anIntArray549[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static53.anInt1787; local27++) {
				@Pc(33) int local33 = Static12.anIntArray15[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt8386 == 0) {
					local62 = (local33 - local19) * this.anInt8388;
				} else {
					@Pc(52) int local52 = local39 * local39 + local25 * local25 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local52 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (this.anInt8388 * local62) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt8385 == 0) {
					local62 = Static227.anIntArray214[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8385 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local27] = local62;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8386 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt8385 = arg1.method8246();
		} else if (arg0 == 3) {
			this.anInt8388 = arg1.method8246();
		}
	}
}
