import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!jh;")
	public static Class115 aClass115_1 = new Class115(8);

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt2647 = 10;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public static int anInt2649 = 0;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
	public static int anInt2650 = 0;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_58 = new Class4(8);

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "Z")
	public static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "I")
	private int anInt2643 = 4096;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	private int anInt2646 = 0;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 267)
	public Class2_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)[[I", line = 4)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(29) int[][] local29 = this.method6484(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static211.anInt4031; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt2646) {
					local45[local55] = this.anInt2646;
				} else if (local61 <= this.anInt2643) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt2643;
				}
				if (this.anInt2646 > local65) {
					local49[local55] = this.anInt2646;
				} else if (this.anInt2643 < local65) {
					local49[local55] = this.anInt2643;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt2646 > local69) {
					local53[local55] = this.anInt2646;
				} else if (this.anInt2643 < local69) {
					local53[local55] = this.anInt2643;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I", line = 274)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int[] local26 = this.method6474(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static211.anInt4031; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt2646 > local34) {
					local16[local28] = this.anInt2646;
				} else if (local34 <= this.anInt2643) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt2643;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!bt;I)V", line = 317)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2646 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt2643 = arg1.method4830();
		} else if (arg0 == 2) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}
}
