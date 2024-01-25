import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class4_Sub1_Sub39 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	private int anInt10211 = 4096;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10211 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(33) int[] local33 = this.method8392(arg0 - 1 & Static237.anInt4286, 0);
			@Pc(39) int[] local39 = this.method8392(arg0, 0);
			@Pc(49) int[] local49 = this.method8392(Static237.anInt4286 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static376.anInt7260; local51++) {
				@Pc(65) int local65 = this.anInt10211 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[local51 + 1 & Static569.anInt9982] - local39[local51 - 1 & Static569.anInt9982]) * this.anInt10211;
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
}
