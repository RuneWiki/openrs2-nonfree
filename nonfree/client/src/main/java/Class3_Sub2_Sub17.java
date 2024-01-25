import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "[I")
	public static final int[] anIntArray289 = new int[16384];

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "[I")
	public static final int[] anIntArray290 = new int[16384];

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	private int anInt4463 = 4096;

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
	private int anInt4465 = 4096;

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
	private int anInt4466 = 4096;

	static {
		@Pc(14) double local14 = 3.834951969714103E-4D;
		for (@Pc(16) int local16 = 0; local16 < 16384; local16++) {
			anIntArray289[local16] = (int) (Math.sin(local14 * (double) local16) * 32768.0D);
			anIntArray290[local16] = (int) (Math.cos(local14 * (double) local16) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(21) int[][] local21 = this.method5899(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static406.anInt6694; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local61 == local57) {
					local37[local47] = local53 * this.anInt4465 >> 12;
					local41[local47] = this.anInt4466 * local57 >> 12;
					local45[local47] = this.anInt4463 * local61 >> 12;
				} else {
					local37[local47] = this.anInt4465;
					local41[local47] = this.anInt4466;
					local45[local47] = this.anInt4463;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4465 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt4466 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt4463 = arg0.method2588();
		}
	}
}
