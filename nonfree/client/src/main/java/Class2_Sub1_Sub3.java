import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt499 = 20;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "I")
	private int anInt501 = 0;

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
	private int anInt504 = 0;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
	private int anInt506 = 1365;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt506 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt499 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt501 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt504 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			for (@Pc(13) int local13 = 0; local13 < Static135.anInt2897; local13++) {
				@Pc(28) int local28 = (Static107.anIntArray304[local13] << 12) / this.anInt506 + this.anInt501;
				@Pc(40) int local40 = (Static81.anIntArray174[arg0] << 12) / this.anInt506 + this.anInt504;
				@Pc(46) int local46 = local40;
				@Pc(52) int local52 = local28 * local28 >> 12;
				@Pc(58) int local58 = local40 * local40 >> 12;
				@Pc(60) int local60 = 0;
				@Pc(62) int local62 = local28;
				while (local52 + local58 < 16384 && local60 < this.anInt499) {
					local60++;
					local46 = local40 + (local62 * local46 >> 12) * 2;
					local62 = local28 + local52 - local58;
					local58 = local46 * local46 >> 12;
					local52 = local62 * local62 >> 12;
				}
				local7[local13] = local60 < this.anInt499 - 1 ? (local60 << 12) / this.anInt499 : 0;
			}
		}
		return local7;
	}
}
