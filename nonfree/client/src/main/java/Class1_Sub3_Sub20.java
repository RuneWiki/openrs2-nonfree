import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
	private int anInt3422 = 0;

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
	private int anInt3425 = 4096;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3422 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt3425 = arg0.method1764();
		} else if (arg1 == 2) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[][] local29 = this.method4129(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2934; local55++) {
				@Pc(61) int local61 = local37[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt3422 > local61) {
					local45[local55] = this.anInt3422;
				} else if (local61 <= this.anInt3425) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt3425;
				}
				if (local65 < this.anInt3422) {
					local49[local55] = this.anInt3422;
				} else if (local65 <= this.anInt3425) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt3425;
				}
				if (this.anInt3422 > local69) {
					local53[local55] = this.anInt3422;
				} else if (this.anInt3425 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt3425;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(26) int[] local26 = this.method4117(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static110.anInt2934; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt3422) {
					local16[local28] = this.anInt3422;
				} else if (this.anInt3425 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt3425;
				}
			}
		}
		return local16;
	}
}
