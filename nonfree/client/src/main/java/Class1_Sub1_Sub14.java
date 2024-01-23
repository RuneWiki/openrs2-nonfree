import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
	private int anInt2532 = 4096;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
	private int anInt2533 = 4096;

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
	private int anInt2538 = 4096;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(17) int[][] local17 = this.method4758(0, arg0);
			@Pc(21) int[] local21 = local17[0];
			@Pc(25) int[] local25 = local7[0];
			@Pc(29) int[] local29 = local7[2];
			@Pc(33) int[] local33 = local17[2];
			@Pc(37) int[] local37 = local17[1];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static75.anInt1848; local43++) {
				@Pc(50) int local50 = local21[local43];
				@Pc(54) int local54 = local37[local43];
				@Pc(58) int local58 = local33[local43];
				if (local50 == local58 && local58 == local54) {
					local25[local43] = local50 * this.anInt2532 >> 12;
					local41[local43] = local58 * this.anInt2533 >> 12;
					local29[local43] = local54 * this.anInt2538 >> 12;
				} else {
					local25[local43] = this.anInt2532;
					local41[local43] = this.anInt2533;
					local29[local43] = this.anInt2538;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2532 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt2533 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt2538 = arg0.method2652();
		}
	}
}
