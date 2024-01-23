import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
	private int anInt2035 = 4096;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	private int anInt2037 = 4096;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
	private int anInt2040 = 4096;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2040 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt2037 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt2035 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(27) int[][] local27 = this.method4457(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static131.anInt2513; local53++) {
				@Pc(64) int local64 = local39[local53];
				@Pc(68) int local68 = local35[local53];
				@Pc(72) int local72 = local31[local53];
				if (local64 == local72 && local68 == local64) {
					local43[local53] = local72 * this.anInt2040 >> 12;
					local51[local53] = this.anInt2037 * local64 >> 12;
					local47[local53] = local68 * this.anInt2035 >> 12;
				} else {
					local43[local53] = this.anInt2040;
					local51[local53] = this.anInt2037;
					local47[local53] = this.anInt2035;
				}
			}
		}
		return local17;
	}
}
