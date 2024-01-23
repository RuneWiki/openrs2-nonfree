import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
	private int anInt4017 = 4096;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
	private int anInt4018 = 0;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(31) int[][] local31 = this.method4965(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local31[2];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			for (@Pc(57) int local57 = 0; local57 < Static22.anInt421; local57++) {
				@Pc(64) int local64 = local39[local57];
				@Pc(68) int local68 = local35[local57];
				@Pc(72) int local72 = local47[local57];
				if (this.anInt4018 > local68) {
					local43[local57] = this.anInt4018;
				} else if (local68 <= this.anInt4017) {
					local43[local57] = local68;
				} else {
					local43[local57] = this.anInt4017;
				}
				if (this.anInt4018 > local64) {
					local51[local57] = this.anInt4018;
				} else if (this.anInt4017 >= local64) {
					local51[local57] = local64;
				} else {
					local51[local57] = this.anInt4017;
				}
				if (local72 < this.anInt4018) {
					local55[local57] = this.anInt4018;
				} else if (local72 > this.anInt4017) {
					local55[local57] = this.anInt4017;
				} else {
					local55[local57] = local72;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(28) int[] local28 = this.method4954(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt421; local30++) {
				@Pc(37) int local37 = local28[local30];
				if (this.anInt4018 > local37) {
					local11[local30] = this.anInt4018;
				} else if (local37 > this.anInt4017) {
					local11[local30] = this.anInt4017;
				} else {
					local11[local30] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt4018 = arg1.method3948();
		} else if (arg0 == 1) {
			this.anInt4017 = arg1.method3948();
		} else if (arg0 == 2) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}
}
