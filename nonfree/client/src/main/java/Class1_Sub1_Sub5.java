import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
	private int anInt462 = 4;

	@OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
	private int anInt469 = 4;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(29) int local29 = Static115.anInt2578 / this.anInt462;
			@Pc(34) int local34 = Static31.anInt857 / this.anInt469;
			@Pc(45) int[][] local45;
			if (local34 <= 0) {
				local45 = this.method3579(0, 0);
			} else {
				@Pc(51) int local51 = arg0 % local34;
				local45 = this.method3579(Static31.anInt857 * local51 / local34, 0);
			}
			@Pc(65) int[] local65 = local45[1];
			@Pc(69) int[] local69 = local45[0];
			@Pc(73) int[] local73 = local45[2];
			@Pc(77) int[] local77 = local20[1];
			@Pc(81) int[] local81 = local20[2];
			@Pc(85) int[] local85 = local20[0];
			for (@Pc(87) int local87 = 0; local87 < Static115.anInt2578; local87++) {
				@Pc(104) int local104;
				if (local29 > 0) {
					@Pc(98) int local98 = local87 % local29;
					local104 = Static115.anInt2578 * local98 / local29;
				} else {
					local104 = 0;
				}
				local85[local87] = local69[local104];
				local77[local87] = local65[local104];
				local81[local87] = local73[local104];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt462 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt469 = arg0.method2771();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(25) int local25 = Static31.anInt857 / this.anInt469;
			@Pc(30) int local30 = Static115.anInt2578 / this.anInt462;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local25 <= 0) {
				local41 = this.method3580(0, 0);
			} else {
				local47 = arg0 % local25;
				local41 = this.method3580(Static31.anInt857 * local47 / local25, 0);
			}
			for (local47 = 0; local47 < Static115.anInt2578; local47++) {
				if (local30 > 0) {
					@Pc(67) int local67 = local47 % local30;
					local16[local47] = local41[local67 * Static115.anInt2578 / local30];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}
}
