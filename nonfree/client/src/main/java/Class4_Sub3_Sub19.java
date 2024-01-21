import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class4_Sub3_Sub19 extends Class4_Sub3 {

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
	private int anInt2195;

	@OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
	private int anInt2197;

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
	private int anInt2194;

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
	private int anInt2199;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2194 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt2199 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt2197 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt2195 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			for (@Pc(13) int local13 = 0; local13 < Static134.anInt3188; local13++) {
				@Pc(27) int local27 = (Static67.anIntArray170[local13] << 12) / this.anInt2194 + this.anInt2197;
				@Pc(41) int local41 = (Static148.anIntArray321[arg0] << 12) / this.anInt2194 + this.anInt2195;
				@Pc(45) int local45 = local41;
				@Pc(51) int local51 = local41 * local41 >> 12;
				@Pc(53) int local53 = 0;
				@Pc(59) int local59 = local27 * local27 >> 12;
				@Pc(61) int local61 = local27;
				while (local51 + local59 < 16384 && local53 < this.anInt2199) {
					local45 = (local45 * local61 >> 12) * 2 + local41;
					local53++;
					local61 = local27 + local59 - local51;
					local51 = local45 * local45 >> 12;
					local59 = local61 * local61 >> 12;
				}
				local7[local13] = this.anInt2199 - 1 > local53 ? (local53 << 12) / this.anInt2199 : 0;
			}
		}
		return local7;
	}
}
