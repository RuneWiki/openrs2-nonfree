import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class4_Sub1_Sub28 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
	private int anInt4507 = 4096;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4507 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(31) int[] local31 = this.method4538(0, arg0 - 1 & Static19.anInt437);
			@Pc(37) int[] local37 = this.method4538(0, arg0);
			@Pc(47) int[] local47 = this.method4538(0, Static19.anInt437 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static68.anInt1753; local49++) {
				@Pc(64) int local64 = this.anInt4507 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = this.anInt4507 * (local37[local49 + 1 & Static295.anInt5711] - local37[local49 - 1 & Static295.anInt5711]);
				@Pc(87) int local87 = local64 >> 12;
				@Pc(93) int local93 = local87 * local87 >> 12;
				@Pc(97) int local97 = local83 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local103 + local93 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local17[local49] = 4096 - local129;
			}
		}
		return local17;
	}
}
