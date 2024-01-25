import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class7_Sub3_Sub28 extends Class7_Sub3 {

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
	private int anInt5668 = 0;

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
	private int anInt5667 = 1365;

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
	private int anInt5675 = 20;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
	private int anInt5672 = 0;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			for (@Pc(22) int local22 = 0; local22 < Static58.anInt1052; local22++) {
				@Pc(36) int local36 = this.anInt5672 + (Static185.anIntArray298[local22] << 12) / this.anInt5667;
				@Pc(48) int local48 = this.anInt5668 + (Static203.anIntArray322[arg0] << 12) / this.anInt5667;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local62 + local68 < 16384 && this.anInt5675 > local70; local70++) {
					local56 = (local54 * local56 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local11[local22] = local70 >= this.anInt5675 - 1 ? 0 : (local70 << 12) / this.anInt5675;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5667 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt5675 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt5672 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt5668 = arg1.method3943();
		}
	}
}
