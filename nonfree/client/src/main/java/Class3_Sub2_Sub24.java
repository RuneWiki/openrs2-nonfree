import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	private int anInt3220 = 4096;

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
	private int anInt3224 = 4096;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
	private int anInt3223 = 4096;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3223 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt3224 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt3220 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(21) int[][] local21 = this.method4965(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local21[2];
			@Pc(41) int[] local41 = local7[1];
			@Pc(45) int[] local45 = local7[2];
			for (@Pc(47) int local47 = 0; local47 < Static22.anInt421; local47++) {
				@Pc(54) int local54 = local25[local47];
				@Pc(58) int local58 = local37[local47];
				@Pc(62) int local62 = local29[local47];
				if (local58 == local54 && local58 == local62) {
					local33[local47] = this.anInt3223 * local54 >> 12;
					local41[local47] = local58 * this.anInt3224 >> 12;
					local45[local47] = this.anInt3220 * local62 >> 12;
				} else {
					local33[local47] = this.anInt3223;
					local41[local47] = this.anInt3224;
					local45[local47] = this.anInt3220;
				}
			}
		}
		return local7;
	}
}
