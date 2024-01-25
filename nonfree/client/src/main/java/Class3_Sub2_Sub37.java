import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
	private int anInt9914 = 4096;

	@OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
	private int anInt9915 = 0;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(29) int[][] local29 = this.method8595(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static491.anInt8519; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt9915) {
					local45[local55] = this.anInt9915;
				} else if (this.anInt9914 < local61) {
					local45[local55] = this.anInt9914;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt9915 > local65) {
					local49[local55] = this.anInt9915;
				} else if (this.anInt9914 < local65) {
					local49[local55] = this.anInt9914;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt9915 > local69) {
					local53[local55] = this.anInt9915;
				} else if (this.anInt9914 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt9914;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9915 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt9914 = arg0.method4221();
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(27) int[] local27 = this.method8603(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static491.anInt8519; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt9915 > local35) {
					local17[local29] = this.anInt9915;
				} else if (local35 <= this.anInt9914) {
					local17[local29] = local35;
				} else {
					local17[local29] = this.anInt9914;
				}
			}
		}
		return local17;
	}
}
