import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
	private int anInt2375;

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
	private int anInt2376;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2375 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt2368 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt2376 = arg1.method1510();
		} else if (arg0 == 3) {
			this.anInt2374 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			for (@Pc(22) int local22 = 0; local22 < Static129.anInt3285; local22++) {
				@Pc(37) int local37 = (Static146.anIntArray618[local22] << 12) / this.anInt2375 + this.anInt2376;
				@Pc(50) int local50 = (Static22.anIntArray152[arg0] << 12) / this.anInt2375 + this.anInt2374;
				@Pc(56) int local56 = local50;
				@Pc(58) int local58 = local37;
				@Pc(64) int local64 = local37 * local37 >> 12;
				@Pc(66) int local66 = 0;
				@Pc(72) int local72 = local50 * local50 >> 12;
				while (local64 + local72 < 16384 && local66 < this.anInt2368) {
					local66++;
					local56 = (local56 * local58 >> 12) * 2 + local50;
					local58 = local64 + local37 - local72;
					local72 = local56 * local56 >> 12;
					local64 = local58 * local58 >> 12;
				}
				local16[local22] = local66 < this.anInt2368 - 1 ? (local66 << 12) / this.anInt2368 : 0;
			}
		}
		return local16;
	}
}
