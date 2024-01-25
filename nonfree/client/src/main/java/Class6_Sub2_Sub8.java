import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cv", name = "M", descriptor = "[I")
	public static final int[] anIntArray113 = new int[4096];

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	private int anInt1325 = 4096;

	@OriginalMember(owner = "client!cv", name = "O", descriptor = "I")
	private int anInt1332 = 0;

	static {
		for (@Pc(19) int local19 = 0; local19 < 4096; local19++) {
			anIntArray113[local19] = Static262.method4015(local19);
		}
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(29) int[][] local29 = this.method5867(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static185.anInt4925; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt1332) {
					local45[local55] = this.anInt1332;
				} else if (this.anInt1325 < local61) {
					local45[local55] = this.anInt1325;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt1332) {
					local49[local55] = this.anInt1332;
				} else if (local65 <= this.anInt1325) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt1325;
				}
				if (this.anInt1332 > local69) {
					local53[local55] = this.anInt1332;
				} else if (local69 <= this.anInt1325) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt1325;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1332 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt1325 = arg0.method3108();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static185.anInt4925; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt1332) {
					local16[local28] = this.anInt1332;
				} else if (local34 > this.anInt1325) {
					local16[local28] = this.anInt1325;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
