import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	private int anInt1198 = 20;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt1203 = 1365;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
	private int anInt1204 = 0;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
	private int anInt1202 = 0;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			for (@Pc(26) int local26 = 0; local26 < Static22.anInt421; local26++) {
				@Pc(46) int local46 = (Static185.anIntArray424[local26] << 12) / this.anInt1203 + this.anInt1202;
				@Pc(58) int local58 = (Static205.anIntArray450[arg0] << 12) / this.anInt1203 + this.anInt1204;
				@Pc(64) int local64 = local46;
				@Pc(66) int local66 = local58;
				@Pc(72) int local72 = local58 * local58 >> 12;
				@Pc(78) int local78 = local46 * local46 >> 12;
				@Pc(80) int local80 = 0;
				while (local72 + local78 < 16384 && local80 < this.anInt1198) {
					local80++;
					local66 = local58 + (local66 * local64 >> 12) * 2;
					local64 = local46 + local78 - local72;
					local78 = local64 * local64 >> 12;
					local72 = local66 * local66 >> 12;
				}
				local20[local26] = this.anInt1198 - 1 > local80 ? (local80 << 12) / this.anInt1198 : 0;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1203 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt1198 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt1202 = arg1.method3948();
		} else if (arg0 == 3) {
			this.anInt1204 = arg1.method3948();
		}
	}
}
