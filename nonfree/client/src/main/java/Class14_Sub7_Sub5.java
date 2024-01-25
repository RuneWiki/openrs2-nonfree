import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class14_Sub7_Sub5 extends Class14_Sub7 {

	@OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
	private int anInt1568 = 4096;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(33) int[] local33 = this.method9379(0, Static660.anInt6757 & arg0 - 1);
			@Pc(39) int[] local39 = this.method9379(0, arg0);
			@Pc(49) int[] local49 = this.method9379(0, Static660.anInt6757 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static613.anInt10114; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt1568;
				@Pc(84) int local84 = (local39[local51 + 1 & Static677.anInt11036] - local39[local51 - 1 & Static677.anInt11036]) * this.anInt1568;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local65 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local118 == 0 ? 0 : 16777216 / local118;
				local19[local51] = 4096 - local127;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1568 = arg1.method7717(-1978450544);
		}
	}
}
