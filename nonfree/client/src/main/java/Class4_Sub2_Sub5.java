import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
	private int anInt1358 = 0;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
	private int anInt1361 = 4096;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(28) int[] local28 = this.method8768(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static269.anInt4330; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (this.anInt1358 > local36) {
					local11[local30] = this.anInt1358;
				} else if (local36 <= this.anInt1361) {
					local11[local30] = local36;
				} else {
					local11[local30] = this.anInt1361;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1358 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt1361 = arg1.method8859();
		} else if (arg0 == 2) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(21) int[][] local21 = this.method8772(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static269.anInt4330; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt1358) {
					local37[local47] = this.anInt1358;
				} else if (this.anInt1361 < local53) {
					local37[local47] = this.anInt1361;
				} else {
					local37[local47] = local53;
				}
				if (this.anInt1358 > local57) {
					local41[local47] = this.anInt1358;
				} else if (this.anInt1361 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt1361;
				}
				if (this.anInt1358 > local61) {
					local45[local47] = this.anInt1358;
				} else if (local61 > this.anInt1361) {
					local45[local47] = this.anInt1361;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}
}
