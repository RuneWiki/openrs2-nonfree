import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	private int anInt985 = 4096;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(33) int[] local33 = this.method5858(0, Static296.anInt4928 & arg0 - 1);
			@Pc(39) int[] local39 = this.method5858(0, arg0);
			@Pc(49) int[] local49 = this.method5858(0, Static296.anInt4928 & arg0 + 1);
			for (@Pc(51) int local51 = 0; local51 < Static185.anInt4925; local51++) {
				@Pc(65) int local65 = this.anInt985 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = this.anInt985 * (local39[local51 + 1 & Static64.anInt1348] - local39[Static64.anInt1348 & local51 - 1]);
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

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt985 = arg0.method3108();
		}
	}
}
