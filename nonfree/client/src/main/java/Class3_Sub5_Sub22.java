import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub5_Sub22 extends Class3_Sub5 {

	@OriginalMember(owner = "client!q", name = "T", descriptor = "I")
	private int anInt3036;

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
	private int anInt3040;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(29) int[][] local29 = this.method3163(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[0];
			@Pc(45) int[] local45 = local15[0];
			@Pc(49) int[] local49 = local15[1];
			@Pc(53) int[] local53 = local15[2];
			for (@Pc(55) int local55 = 0; local55 < Static104.anInt2195; local55++) {
				@Pc(61) int local61 = local41[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local37[local55];
				if (this.anInt3040 > local61) {
					local45[local55] = this.anInt3040;
				} else if (local61 > this.anInt3036) {
					local45[local55] = this.anInt3036;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt3040) {
					local49[local55] = this.anInt3040;
				} else if (this.anInt3036 < local65) {
					local49[local55] = this.anInt3036;
				} else {
					local49[local55] = local65;
				}
				if (local69 < this.anInt3040) {
					local53[local55] = this.anInt3040;
				} else if (this.anInt3036 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt3036;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static104.anInt2195; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt3040) {
					local7[local31] = this.anInt3040;
				} else if (this.anInt3036 >= local37) {
					local7[local31] = local37;
				} else {
					local7[local31] = this.anInt3036;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3040 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt3036 = arg1.method2111();
		} else if (arg0 == 2) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}
}
