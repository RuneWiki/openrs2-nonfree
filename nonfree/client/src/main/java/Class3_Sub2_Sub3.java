import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ama")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ama", name = "J", descriptor = "I")
	private int anInt400 = 4096;

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt400 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(32) int[] local32 = this.method9204(Static599.anInt9773 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method9204(arg0, 0);
			@Pc(48) int[] local48 = this.method9204(Static599.anInt9773 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static636.anInt10302; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt400;
				@Pc(84) int local84 = (local38[Static144.anInt2744 & local50 + 1] - local38[local50 - 1 & Static144.anInt2744]) * this.anInt400;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local130;
			}
		}
		return local18;
	}
}
