import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class4_Sub1_Sub31 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
	private int anInt4760 = 1365;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
	private int anInt4763 = 0;

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
	private int anInt4765 = 20;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
	private int anInt4764 = 0;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4760 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt4765 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt4764 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt4763 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			for (@Pc(25) int local25 = 0; local25 < Static68.anInt1753; local25++) {
				@Pc(40) int local40 = this.anInt4764 + (Static94.anIntArray163[local25] << 12) / this.anInt4760;
				@Pc(52) int local52 = (Static10.anIntArray7[arg0] << 12) / this.anInt4760 + this.anInt4763;
				@Pc(58) int local58 = local40;
				@Pc(64) int local64 = local52 * local52 >> 12;
				@Pc(66) int local66 = local52;
				@Pc(72) int local72 = local40 * local40 >> 12;
				@Pc(74) int local74 = 0;
				while (local64 + local72 < 16384 && local74 < this.anInt4765) {
					local74++;
					local66 = (local58 * local66 >> 12) * 2 + local52;
					local58 = local72 + local40 - local64;
					local64 = local66 * local66 >> 12;
					local72 = local58 * local58 >> 12;
				}
				local13[local25] = this.anInt4765 - 1 > local74 ? (local74 << 12) / this.anInt4765 : 0;
			}
		}
		return local13;
	}
}
