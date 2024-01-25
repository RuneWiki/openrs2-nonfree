import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
	public static final int[] anIntArray248 = new int[16384];

	@OriginalMember(owner = "client!og", name = "P", descriptor = "[I")
	public static final int[] anIntArray249 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray249[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray248[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(26) int[] local26 = this.method5620(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static434.anInt4326; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(21) int[][] local21 = this.method5624(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static434.anInt4326; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}
}
