import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class8_Sub2_Sub19 extends Class8_Sub2 {

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt5293 = 0;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "I")
	private int anInt5292 = 4096;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5293 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt5292 = arg1.method8578();
		} else if (arg0 == 2) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(21) int[][] local21 = this.method8510(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static538.anInt9297; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt5293) {
					local37[local47] = this.anInt5293;
				} else if (this.anInt5292 >= local53) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt5292;
				}
				if (this.anInt5293 > local57) {
					local41[local47] = this.anInt5293;
				} else if (this.anInt5292 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt5292;
				}
				if (this.anInt5293 > local61) {
					local45[local47] = this.anInt5293;
				} else if (this.anInt5292 < local61) {
					local45[local47] = this.anInt5292;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(26) int[] local26 = this.method8505(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static538.anInt9297; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt5293 > local34) {
					local16[local28] = this.anInt5293;
				} else if (this.anInt5292 < local34) {
					local16[local28] = this.anInt5292;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
