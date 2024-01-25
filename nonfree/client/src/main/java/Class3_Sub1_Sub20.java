import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lv", name = "P", descriptor = "I")
	private int anInt6248 = 4096;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6248 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(33) int[] local33 = this.method8362(Static483.anInt9026 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8362(arg0, 0);
			@Pc(49) int[] local49 = this.method8362(Static483.anInt9026 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static131.anInt2935; local51++) {
				@Pc(64) int local64 = this.anInt6248 * (local49[local51] - local33[local51]);
				@Pc(84) int local84 = this.anInt6248 * (local39[Static251.anInt5425 & local51 + 1] - local39[Static251.anInt5425 & local51 - 1]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local19[local51] = 4096 - local126;
			}
		}
		return local19;
	}
}
