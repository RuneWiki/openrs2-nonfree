import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub6_Sub18 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	private int anInt5252 = 0;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	private int anInt5255 = 1;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5252 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt5254 = arg0.method6814();
		} else if (arg1 == 3) {
			this.anInt5255 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(19) int local19 = Static231.anIntArray217[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static481.anInt8358; local27++) {
				@Pc(33) int local33 = Static595.anIntArray600[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(50) int local50;
				if (this.anInt5252 == 0) {
					local50 = (local33 - local19) * this.anInt5255;
				} else {
					@Pc(63) int local63 = local39 * local39 + local25 * local25 >> 12;
					local50 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local50 = (int) ((double) (this.anInt5255 * local50) * 3.141592653589793D);
				}
				local50 -= local50 & 0xFFFFF000;
				if (this.anInt5254 == 0) {
					local50 = Static372.anIntArray362[local50 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5254 == 2) {
					local50 -= 2048;
					if (local50 < 0) {
						local50 = -local50;
					}
					local50 = 2048 - local50 << 1;
				}
				local11[local27] = local50;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		Static578.method7854();
	}
}
