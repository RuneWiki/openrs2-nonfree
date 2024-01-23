import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	private int anInt2205 = 0;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	private int anInt2208 = 4096;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2205 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt2208 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(28) int[] local28 = this.method4538(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static68.anInt1753; local30++) {
				@Pc(37) int local37 = local28[local30];
				local11[local30] = local37 >= this.anInt2205 && this.anInt2208 >= local37 ? 4096 : 0;
			}
		}
		return local11;
	}
}
