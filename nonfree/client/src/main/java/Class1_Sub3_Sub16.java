import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!io", name = "J", descriptor = "I")
	private int anInt2866 = 4096;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(33) int[] local33 = this.method5532(0, arg0 - 1 & Static49.anInt1526);
			@Pc(39) int[] local39 = this.method5532(0, arg0);
			@Pc(49) int[] local49 = this.method5532(0, arg0 + 1 & Static49.anInt1526);
			for (@Pc(51) int local51 = 0; local51 < Static153.anInt3378; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt2866;
				@Pc(85) int local85 = this.anInt2866 * (local39[Static250.anInt5127 & local51 + 1] - local39[local51 - 1 & Static250.anInt5127]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local127;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2866 = arg1.method4556();
		}
	}
}
