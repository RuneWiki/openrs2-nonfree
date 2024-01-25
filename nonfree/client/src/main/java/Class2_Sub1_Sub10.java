import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ew", name = "P", descriptor = "I")
	private int anInt2223 = 4096;

	@OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
	private int anInt2224 = 4096;

	@OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
	private int anInt2221 = 4096;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(21) int[][] local21 = this.method6031(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2581; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local57 == local61) {
					local37[local47] = local53 * this.anInt2223 >> 12;
					local41[local47] = local57 * this.anInt2221 >> 12;
					local45[local47] = local61 * this.anInt2224 >> 12;
				} else {
					local37[local47] = this.anInt2223;
					local41[local47] = this.anInt2221;
					local45[local47] = this.anInt2224;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2223 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt2221 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt2224 = arg1.method3711();
		}
	}
}
