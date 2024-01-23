import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	private int anInt3413 = 0;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
	private int anInt3416 = 20;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	private int anInt3417 = 0;

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
	private int anInt3419 = 1365;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			for (@Pc(22) int local22 = 0; local22 < Static157.anInt3431; local22++) {
				@Pc(36) int local36 = this.anInt3413 + (Static73.anIntArray105[local22] << 12) / this.anInt3419;
				@Pc(50) int local50 = this.anInt3417 + (Static211.anIntArray334[arg0] << 12) / this.anInt3419;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local50;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(64) int local64 = 0;
				@Pc(70) int local70 = local50 * local50 >> 12;
				while (local70 + local62 < 16384 && local64 < this.anInt3416) {
					local56 = (local56 * local54 >> 12) * 2 + local50;
					local54 = local36 + local62 - local70;
					local70 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
					local64++;
				}
				local16[local22] = local64 >= this.anInt3416 - 1 ? 0 : (local64 << 12) / this.anInt3416;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3419 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt3416 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt3413 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt3417 = arg0.method3805();
		}
	}
}
