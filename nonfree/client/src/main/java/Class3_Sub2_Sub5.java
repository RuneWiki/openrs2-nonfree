import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
	private int anInt1395 = 0;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
	private int anInt1396 = 20;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	private int anInt1399 = 1365;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
	private int anInt1398 = 0;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1399 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt1396 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt1395 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt1398 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			for (@Pc(22) int local22 = 0; local22 < Static491.anInt8519; local22++) {
				@Pc(36) int local36 = this.anInt1395 + (Static546.anIntArray582[local22] << 12) / this.anInt1399;
				@Pc(49) int local49 = (Static372.anIntArray207[arg0] << 12) / this.anInt1399 + this.anInt1398;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt1396) {
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local36 + local63 - local69;
					local63 = local55 * local55 >> 12;
					local71++;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = local71 >= this.anInt1396 - 1 ? 0 : (local71 << 12) / this.anInt1396;
			}
		}
		return local16;
	}
}
