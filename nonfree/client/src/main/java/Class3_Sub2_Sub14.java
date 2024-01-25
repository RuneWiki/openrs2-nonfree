import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	private int anInt4716 = 4096;

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
	private int anInt4719 = 2048;

	@OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
	private int anInt4718 = 2048;

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
	private int anInt4723 = 12288;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
	private int anInt4724 = 8192;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
	private int anInt4720 = 0;

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
	private int anInt4721 = 0;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt4719 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt4720 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt4721 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt4718 = arg1.method5272();
		} else if (arg0 == 4) {
			this.anInt4723 = arg1.method5272();
		} else if (arg0 == 5) {
			this.anInt4716 = arg1.method5272();
		} else if (arg0 == 6) {
			this.anInt4724 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZII)Z")
	private boolean method3954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt4723 * (arg1 - arg0) >> 12;
		@Pc(30) int local30 = Static263.anIntArray275[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt4723;
		@Pc(44) int local44 = (local37 << 12) / this.anInt4724;
		@Pc(51) int local51 = this.anInt4716 * local44 >> 12;
		return arg1 + arg0 < local51 && -local51 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		Static333.method4978();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(29) int local29 = Static123.anIntArray113[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static636.anInt10302; local31++) {
				@Pc(39) int local39 = Static508.anIntArray472[local31] - 2048;
				@Pc(44) int local44 = this.anInt4719 + local39;
				@Pc(56) int local56 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(68) int local68 = local56 <= 2048 ? local56 : local56 - 4096;
				@Pc(74) int local74 = local29 + this.anInt4720;
				@Pc(84) int local84 = local74 < -2048 ? local74 + 4096 : local74;
				@Pc(94) int local94 = local84 > 2048 ? local84 - 4096 : local84;
				@Pc(99) int local99 = local39 + this.anInt4721;
				@Pc(109) int local109 = local99 < -2048 ? local99 + 4096 : local99;
				@Pc(121) int local121 = local109 <= 2048 ? local109 : local109 - 4096;
				@Pc(126) int local126 = this.anInt4718 + local29;
				@Pc(138) int local138 = local126 >= -2048 ? local126 : local126 + 4096;
				@Pc(148) int local148 = local138 > 2048 ? local138 - 4096 : local138;
				local11[local31] = this.method3954(local68, local94) || this.method3956(local121, local148) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(III)Z")
	private boolean method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt4723 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static263.anIntArray275[local13 * 255 >> 12 & 0xFF];
		@Pc(40) int local40 = (local23 << 12) / this.anInt4723;
		@Pc(47) int local47 = (local40 << 12) / this.anInt4724;
		@Pc(54) int local54 = local47 * this.anInt4716 >> 12;
		return arg1 - arg0 < local54 && arg1 - arg0 > -local54;
	}
}
