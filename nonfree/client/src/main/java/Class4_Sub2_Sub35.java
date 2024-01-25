import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub2_Sub35 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
	private int anInt7069 = 1365;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
	private int anInt7074 = 0;

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
	private int anInt7077 = 0;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	private int anInt7076 = 20;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			for (@Pc(22) int local22 = 0; local22 < Static350.anInt6330; local22++) {
				@Pc(36) int local36 = (Static197.anIntArray566[local22] << 12) / this.anInt7069 + this.anInt7077;
				@Pc(49) int local49 = (Static293.anIntArray461[arg0] << 12) / this.anInt7069 + this.anInt7074;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt7076 > local71) {
					local57 = local49 + (local55 * local57 >> 12) * 2;
					local55 = local63 + local36 - local69;
					local63 = local55 * local55 >> 12;
					local71++;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = local71 < this.anInt7076 - 1 ? (local71 << 12) / this.anInt7076 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt7069 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt7076 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt7077 = arg1.method4877();
		} else if (arg0 == 3) {
			this.anInt7074 = arg1.method4877();
		}
	}
}
