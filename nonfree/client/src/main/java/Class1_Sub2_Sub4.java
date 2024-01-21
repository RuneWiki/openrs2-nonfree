import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt429 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(27) int[] local27 = this.method3401(arg0 - 1 & Static14.anInt436, 0);
			@Pc(33) int[] local33 = this.method3401(arg0, 0);
			@Pc(43) int[] local43 = this.method3401(arg0 + 1 & Static14.anInt436, 0);
			for (@Pc(45) int local45 = 0; local45 < Static22.anInt596; local45++) {
				@Pc(59) int local59 = (local43[local45] - local27[local45]) * this.anInt429;
				@Pc(78) int local78 = (local33[Static28.anInt833 & local45 + 1] - local33[Static28.anInt833 & local45 - 1]) * this.anInt429;
				@Pc(82) int local82 = local59 >> 12;
				@Pc(86) int local86 = local78 >> 12;
				@Pc(92) int local92 = local86 * local86 >> 12;
				@Pc(98) int local98 = local82 * local82 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((local98 + local92 + 4096) / 4096)) * 4096.0D);
				@Pc(122) int local122 = local111 == 0 ? 0 : 16777216 / local111;
				local13[local45] = 4096 - local122;
			}
		}
		return local13;
	}
}
