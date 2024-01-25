import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	private int anInt1270 = 4096;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(33) int[] local33 = this.method5654(0, Static206.anInt4136 & arg0 - 1);
			@Pc(39) int[] local39 = this.method5654(0, arg0);
			@Pc(49) int[] local49 = this.method5654(0, Static206.anInt4136 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static251.anInt6509; local51++) {
				@Pc(65) int local65 = this.anInt1270 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[Static260.anInt5056 & local51 + 1] - local39[Static260.anInt5056 & local51 - 1]) * this.anInt1270;
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local130;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1270 = arg1.method3115();
		}
	}
}
