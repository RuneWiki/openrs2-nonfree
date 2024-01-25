import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class6_Sub8_Sub33 extends Class6_Sub8 {

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	private int anInt9383 = 4096;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9383 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(33) int[] local33 = this.method8930(Static165.anInt3453 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8930(arg0, 0);
			@Pc(49) int[] local49 = this.method8930(Static165.anInt3453 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static83.anInt1268; local51++) {
				@Pc(65) int local65 = this.anInt9383 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = this.anInt9383 * (local39[Static333.anInt5727 & local51 + 1] - local39[Static333.anInt5727 & local51 - 1]);
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local131;
			}
		}
		return local19;
	}
}
