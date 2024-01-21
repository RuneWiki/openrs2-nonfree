import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	private int anInt1107;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	private int anInt1111;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(26) int[] local26 = this.method3401(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static22.anInt596; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt1107 && this.anInt1111 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1107 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt1111 = arg1.method1280();
		}
	}
}
