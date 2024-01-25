import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!afa", name = "D", descriptor = "I")
	private int anInt223 = 4096;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(32) int[] local32 = this.method7568(Static407.anInt6676 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method7568(arg0, 0);
			@Pc(48) int[] local48 = this.method7568(Static407.anInt6676 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static143.anInt7434; local50++) {
				@Pc(64) int local64 = this.anInt223 * (local48[local50] - local32[local50]);
				@Pc(84) int local84 = this.anInt223 * (local38[Static464.anInt7427 & local50 + 1] - local38[Static464.anInt7427 & local50 - 1]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local126;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt223 = arg1.method4518();
		}
	}
}
