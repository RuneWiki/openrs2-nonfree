import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	private int anInt4751 = 2048;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
	private int anInt4759 = 0;

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
	private int anInt4757 = 0;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
	private int anInt4756 = 2048;

	@OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
	private int anInt4762 = 8192;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "I")
	private int anInt4758 = 4096;

	@OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
	private int anInt4763 = 12288;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4751 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt4757 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt4759 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt4756 = arg0.method4294();
		} else if (arg1 == 4) {
			this.anInt4763 = arg0.method4294();
		} else if (arg1 == 5) {
			this.anInt4758 = arg0.method4294();
		} else if (arg1 == 6) {
			this.anInt4762 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		Static315.method7021();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BII)Z")
	private boolean method3990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4763 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static388.anIntArray472[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt4763;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4762;
		@Pc(52) int local52 = local45 * this.anInt4758 >> 12;
		return local52 > arg1 + arg0 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Z")
	private boolean method3991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt4763 >> 12;
		@Pc(30) int local30 = Static388.anIntArray472[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt4763;
		@Pc(44) int local44 = (local37 << 12) / this.anInt4762;
		@Pc(51) int local51 = local44 * this.anInt4758 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int local29 = Static211.anIntArray576[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3070; local31++) {
				@Pc(39) int local39 = Static260.anIntArray327[local31] - 2048;
				@Pc(44) int local44 = this.anInt4751 + local39;
				@Pc(53) int local53 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = local29 + this.anInt4757;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(89) int local89 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(95) int local95 = local39 + this.anInt4759;
				@Pc(106) int local106 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(115) int local115 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(120) int local120 = this.anInt4756 + local29;
				@Pc(131) int local131 = local120 >= -2048 ? local120 : local120 + 4096;
				@Pc(142) int local142 = local131 > 2048 ? local131 - 4096 : local131;
				local11[local31] = this.method3990(local62, local89) || this.method3991(local115, local142) ? 4096 : 0;
			}
		}
		return local11;
	}
}
