import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class3_Sub5_Sub38 extends Class3_Sub5 {

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(37) int[] local37 = this.method3167(this.aBoolean176 ? Static23.anInt543 - arg0 : arg0, 0);
			if (this.aBoolean177) {
				for (@Pc(50) int local50 = 0; local50 < Static104.anInt2195; local50++) {
					local19[local50] = local37[Static112.anInt2517 - local50];
				}
			} else {
				Static200.method1181(local37, 0, local19, 0, Static104.anInt2195);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(29) int[][] local29 = this.method3163(0, this.aBoolean176 ? Static23.anInt543 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean177) {
				for (local58 = 0; local58 < Static104.anInt2195; local58++) {
					local49[local58] = local37[Static112.anInt2517 - local58];
					local45[local58] = local33[Static112.anInt2517 - local58];
					local53[local58] = local41[Static112.anInt2517 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static104.anInt2195; local58++) {
					local49[local58] = local37[local58];
					local45[local58] = local33[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean177 = arg1.method2107() == 1;
		} else if (arg0 == 1) {
			this.aBoolean176 = arg1.method2107() == 1;
		} else if (arg0 == 2) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}
}
