import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private int anInt2340 = 0;

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
	private int anInt2344 = 4096;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(26) int[] local26 = this.method3468(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static76.anInt1531; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt2340 > local34) {
					local11[local28] = this.anInt2340;
				} else if (local34 > this.anInt2344) {
					local11[local28] = this.anInt2344;
				} else {
					local11[local28] = local34;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2340 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt2344 = arg1.method2178();
		} else if (arg0 == 2) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3465(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static76.anInt1531; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local45[local55];
				if (local61 < this.anInt2340) {
					local41[local55] = this.anInt2340;
				} else if (local61 <= this.anInt2344) {
					local41[local55] = local61;
				} else {
					local41[local55] = this.anInt2344;
				}
				if (local65 < this.anInt2340) {
					local49[local55] = this.anInt2340;
				} else if (local65 > this.anInt2344) {
					local49[local55] = this.anInt2344;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt2340 > local69) {
					local53[local55] = this.anInt2340;
				} else if (local69 <= this.anInt2344) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt2344;
				}
			}
		}
		return local11;
	}
}
