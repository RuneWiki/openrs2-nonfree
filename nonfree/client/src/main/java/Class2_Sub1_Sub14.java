import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
	private int anInt2194 = 4096;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
	private int anInt2199 = 4096;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
	private int anInt2200 = 4096;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2200 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt2194 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt2199 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(21) int[][] local21 = this.method4600(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static281.anInt5558; local47++) {
				@Pc(58) int local58 = local25[local47];
				@Pc(62) int local62 = local33[local47];
				@Pc(66) int local66 = local29[local47];
				if (local62 == local58 && local62 == local66) {
					local37[local47] = this.anInt2200 * local58 >> 12;
					local41[local47] = local62 * this.anInt2194 >> 12;
					local45[local47] = this.anInt2199 * local66 >> 12;
				} else {
					local37[local47] = this.anInt2200;
					local41[local47] = this.anInt2194;
					local45[local47] = this.anInt2199;
				}
			}
		}
		return local11;
	}
}
