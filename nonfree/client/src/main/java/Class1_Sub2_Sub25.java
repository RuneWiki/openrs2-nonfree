import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
	private int anInt5423 = 0;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
	private int anInt5426 = 0;

	@OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
	private int anInt5425 = 1365;

	@OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
	private int anInt5428 = 20;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5425 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt5428 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt5426 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt5423 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			for (@Pc(22) int local22 = 0; local22 < Static218.anInt3990; local22++) {
				@Pc(36) int local36 = this.anInt5426 + (Static434.anIntArray495[local22] << 12) / this.anInt5425;
				@Pc(48) int local48 = (Static258.anIntArray335[arg0] << 12) / this.anInt5425 + this.anInt5423;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && local70 < this.anInt5428) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local11[local22] = local70 < this.anInt5428 - 1 ? (local70 << 12) / this.anInt5428 : 0;
			}
		}
		return local11;
	}
}
