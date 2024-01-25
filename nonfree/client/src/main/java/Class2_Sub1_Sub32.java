import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
	private int anInt6430 = 0;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
	private int anInt6431 = 0;

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
	private int anInt6433 = 1;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(19) int local19 = Static373.anIntArray55[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static131.anInt2581; local27++) {
				@Pc(33) int local33 = Static252.anIntArray323[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt6431 == 0) {
					local53 = (local33 - local19) * this.anInt6433;
				} else {
					@Pc(65) int local65 = local25 * local25 + local39 * local39 >> 12;
					local53 = (int) (Math.sqrt((double) ((float) local65 / 4096.0F)) * 4096.0D);
					local53 = (int) ((double) (local53 * this.anInt6433) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt6430 == 0) {
					local53 = Static132.anIntArray145[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6430 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local11[local27] = local53;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		Static10.method210();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6431 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt6430 = arg1.method3737();
		} else if (arg0 == 3) {
			this.anInt6433 = arg1.method3737();
		}
	}
}
