import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub4_Sub30 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	private int anInt5561 = 0;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
	private int anInt5558 = 4096;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(27) int[] local27 = this.method5695(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static395.anInt6592; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt5561 > local35) {
					local17[local29] = this.anInt5561;
				} else if (local35 > this.anInt5558) {
					local17[local29] = this.anInt5558;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(29) int[][] local29 = this.method5696(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static395.anInt6592; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt5561 > local61) {
					local45[local55] = this.anInt5561;
				} else if (local61 > this.anInt5558) {
					local45[local55] = this.anInt5558;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt5561 > local65) {
					local49[local55] = this.anInt5561;
				} else if (local65 <= this.anInt5558) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt5558;
				}
				if (local69 < this.anInt5561) {
					local53[local55] = this.anInt5561;
				} else if (this.anInt5558 < local69) {
					local53[local55] = this.anInt5558;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5561 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt5558 = arg0.method5335();
		} else if (arg1 == 2) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}
}
