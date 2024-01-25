import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class3_Sub9_Sub33 extends Class3_Sub9 {

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
	private int anInt8715 = 0;

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
	private int anInt8717 = 1;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	private int anInt8721 = 0;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		Static609.method8656();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(19) int local19 = Static147.anIntArray259[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static62.anInt1251; local27++) {
				@Pc(33) int local33 = Static239.anIntArray394[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(49) int local49;
				if (this.anInt8715 == 0) {
					local49 = this.anInt8717 * (local33 - local19);
				} else {
					@Pc(61) int local61 = local25 * local25 + local39 * local39 >> 12;
					local49 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local49 = (int) ((double) (local49 * this.anInt8717) * 3.141592653589793D);
				}
				local49 -= local49 & 0xFFFFF000;
				if (this.anInt8721 == 0) {
					local49 = Static608.anIntArray846[local49 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8721 == 2) {
					local49 -= 2048;
					if (local49 < 0) {
						local49 = -local49;
					}
					local49 = 2048 - local49 << 1;
				}
				local11[local27] = local49;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8715 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt8721 = arg0.method8632();
		} else if (arg1 == 3) {
			this.anInt8717 = arg0.method8632();
		}
	}
}
