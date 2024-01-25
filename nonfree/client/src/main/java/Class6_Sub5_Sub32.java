import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class6_Sub5_Sub32 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt7028 = 3216;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt7027 = 3216;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
	private final int[] anIntArray485 = new int[3];

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
	private int anInt7033 = 4096;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		this.method5791();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt7033 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt7028 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt7027 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method5791() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt7027 / 4096.0F));
		this.anIntArray485[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt7028 / 4096.0F)));
		this.anIntArray485[1] = (int) (Math.cos((double) ((float) this.anInt7028 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray485[2] = (int) (Math.sin((double) ((float) this.anInt7027 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray485[0] * this.anIntArray485[0] >> 12;
		@Pc(81) int local81 = this.anIntArray485[1] * this.anIntArray485[1] >> 12;
		@Pc(93) int local93 = this.anIntArray485[2] * this.anIntArray485[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray485[1] = (this.anIntArray485[1] << 12) / local106;
			this.anIntArray485[0] = (this.anIntArray485[0] << 12) / local106;
			this.anIntArray485[2] = (this.anIntArray485[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(29) int local29 = Static300.anInt5298 * this.anInt7033 >> 12;
			@Pc(39) int[] local39 = this.method6543(0, arg0 - 1 & Static52.anInt1464);
			@Pc(45) int[] local45 = this.method6543(0, arg0);
			@Pc(55) int[] local55 = this.method6543(0, Static52.anInt1464 & arg0 + 1);
			for (@Pc(57) int local57 = 0; local57 < Static240.anInt4386; local57++) {
				@Pc(72) int local72 = (local55[local57] - local39[local57]) * local29 >> 12;
				@Pc(93) int local93 = local29 * (local45[Static408.anInt7338 & local57 - 1] - local45[Static408.anInt7338 & local57 + 1]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				@Pc(101) int local101 = local72 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(142) int local142 = Class5_Sub2.aByteArray55[(local101 * (local101 + 1) >> 1) + local97] & 0xFF;
				@Pc(148) int local148 = local142 * 4096 >> 8;
				@Pc(154) int local154 = local142 * local72 >> 8;
				@Pc(160) int local160 = local142 * local93 >> 8;
				@Pc(169) int local169 = this.anIntArray485[1] * local154 >> 12;
				@Pc(178) int local178 = local160 * this.anIntArray485[0] >> 12;
				@Pc(187) int local187 = local148 * this.anIntArray485[2] >> 12;
				local18[local57] = local187 + local178 + local169;
			}
		}
		return local18;
	}
}
