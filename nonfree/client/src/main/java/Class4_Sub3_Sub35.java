import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class4_Sub3_Sub35 extends Class4_Sub3 {

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	private int anInt7409 = 0;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	private int anInt7412 = 4096;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7409 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt7412 = arg1.method4560();
		} else if (arg0 == 2) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(28) int[] local28 = this.method6337(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static304.anInt5637; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt7409) {
					local16[local30] = this.anInt7409;
				} else if (local36 > this.anInt7412) {
					local16[local30] = this.anInt7412;
				} else {
					local16[local30] = local36;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(21) int[][] local21 = this.method6331(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static304.anInt5637; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt7409) {
					local37[local47] = this.anInt7409;
				} else if (local53 > this.anInt7412) {
					local37[local47] = this.anInt7412;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt7409) {
					local41[local47] = this.anInt7409;
				} else if (this.anInt7412 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt7412;
				}
				if (local61 < this.anInt7409) {
					local45[local47] = this.anInt7409;
				} else if (this.anInt7412 >= local61) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt7412;
				}
			}
		}
		return local11;
	}
}
