import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class7_Sub3_Sub32 extends Class7_Sub3 {

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	private int anInt6201 = 0;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt6206 = 1;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	private int anInt6203 = 0;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(25) int local25 = Static203.anIntArray322[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static58.anInt1052; local33++) {
				@Pc(39) int local39 = Static185.anIntArray298[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt6201 == 0) {
					local68 = this.anInt6206 * (local39 - local25);
				} else {
					@Pc(58) int local58 = local31 * local31 + local45 * local45 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (this.anInt6206 * local68) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt6203 == 0) {
					local68 = Static114.anIntArray163[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6203 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local17[local33] = local68;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6201 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt6203 = arg1.method3981();
		} else if (arg0 == 3) {
			this.anInt6206 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		Static371.method4759();
	}
}
