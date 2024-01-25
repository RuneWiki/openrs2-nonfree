import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
	private int anInt9255 = 4096;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(33) int[] local33 = this.method7951(arg0 - 1 & Static28.anInt6368, 0);
			@Pc(39) int[] local39 = this.method7951(arg0, 0);
			@Pc(49) int[] local49 = this.method7951(arg0 + 1 & Static28.anInt6368, 0);
			for (@Pc(51) int local51 = 0; local51 < Static153.anInt3070; local51++) {
				@Pc(64) int local64 = this.anInt9255 * (local49[local51] - local33[local51]);
				@Pc(84) int local84 = this.anInt9255 * (local39[Static431.anInt7305 & local51 + 1] - local39[Static431.anInt7305 & local51 - 1]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local19[local51] = 4096 - local129;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9255 = arg0.method4294();
		}
	}
}
