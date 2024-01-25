import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	private int anInt3583 = 4096;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3583 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(32) int[] local32 = this.method5772(0, arg0 - 1 & Static157.anInt2733);
			@Pc(38) int[] local38 = this.method5772(0, arg0);
			@Pc(48) int[] local48 = this.method5772(0, arg0 + 1 & Static157.anInt2733);
			for (@Pc(50) int local50 = 0; local50 < Static148.anInt2666; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt3583;
				@Pc(84) int local84 = (local38[Static273.anInt4299 & local50 + 1] - local38[local50 - 1 & Static273.anInt4299]) * this.anInt3583;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local129;
			}
		}
		return local18;
	}
}
