import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	private int anInt260 = 1365;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	private int anInt261 = 20;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
	private int anInt259 = 0;

	@OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
	private int anInt267 = 0;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt260 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt261 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt267 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt259 = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			for (@Pc(22) int local22 = 0; local22 < Static54.anInt953; local22++) {
				@Pc(36) int local36 = this.anInt259 + (Static157.anIntArray604[arg0] << 12) / this.anInt260;
				@Pc(48) int local48 = this.anInt267 + (Static179.anIntArray682[local22] << 12) / this.anInt260;
				@Pc(52) int local52 = local48;
				@Pc(56) int local56 = local36;
				@Pc(62) int local62 = local48 * local48 >> 12;
				@Pc(68) int local68 = local36 * local36 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt261 > local70) {
					local70++;
					local56 = local36 + (local56 * local52 >> 12) * 2;
					local52 = local62 + local48 - local68;
					local62 = local52 * local52 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = local70 < this.anInt261 - 1 ? (local70 << 12) / this.anInt261 : 0;
			}
		}
		return local16;
	}
}
