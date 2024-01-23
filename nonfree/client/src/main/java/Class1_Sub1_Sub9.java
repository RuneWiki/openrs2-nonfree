import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(23) int[] local23 = this.method4746(0, arg0);
			@Pc(29) int[] local29 = this.method4746(1, arg0);
			@Pc(35) int[] local35 = this.method4746(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static75.anInt1848; local37++) {
				@Pc(48) int local48 = local35[local37];
				if (local48 == 4096) {
					local12[local37] = local23[local37];
				} else if (local48 == 0) {
					local12[local37] = local29[local37];
				} else {
					local12[local37] = local29[local37] * (4096 - local48) + local48 * local23[local37] >> 12;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(29) int[] local29 = this.method4746(2, arg0);
			@Pc(35) int[][] local35 = this.method4758(0, arg0);
			@Pc(41) int[][] local41 = this.method4758(1, arg0);
			@Pc(45) int[] local45 = local35[0];
			@Pc(49) int[] local49 = local35[1];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static75.anInt1848; local79++) {
				@Pc(90) int local90 = local29[local79];
				if (local90 == 4096) {
					local53[local79] = local45[local79];
					local57[local79] = local49[local79];
					local61[local79] = local65[local79];
				} else if (local90 == 0) {
					local53[local79] = local69[local79];
					local57[local79] = local73[local79];
					local61[local79] = local77[local79];
				} else {
					@Pc(105) int local105 = 4096 - local90;
					local53[local79] = local90 * local45[local79] + local105 * local69[local79] >> 12;
					local57[local79] = local90 * local49[local79] + local73[local79] * local105 >> 12;
					local61[local79] = local105 * local77[local79] + local90 * local65[local79] >> 12;
				}
			}
		}
		return local19;
	}
}
