import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "I")
	private int anInt8510 = 8192;

	@OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
	private int anInt8511 = 2048;

	@OriginalMember(owner = "client!tt", name = "U", descriptor = "I")
	private int anInt8514 = 2048;

	@OriginalMember(owner = "client!tt", name = "T", descriptor = "I")
	private int anInt8513 = 0;

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "I")
	private int anInt8518 = 12288;

	@OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
	private int anInt8515 = 4096;

	@OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
	private int anInt8517 = 0;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(III)Z")
	private boolean method7445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = (arg1 + arg0) * this.anInt8518 >> 12;
		@Pc(31) int local31 = Static246.anIntArray361[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt8518;
		@Pc(45) int local45 = (local38 << 12) / this.anInt8510;
		@Pc(52) int local52 = this.anInt8515 * local45 >> 12;
		return local52 > arg1 - arg0 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt8511 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt8513 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt8517 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt8514 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt8518 = arg1.method4494();
		} else if (arg0 == 5) {
			this.anInt8515 = arg1.method4494();
		} else if (arg0 == 6) {
			this.anInt8510 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(26) int local26 = Static392.anIntArray673[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static254.anInt4973; local28++) {
				@Pc(36) int local36 = Static457.anIntArray732[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt8511;
				@Pc(50) int local50 = local41 >= -2048 ? local41 : local41 + 4096;
				@Pc(59) int local59 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(64) int local64 = this.anInt8513 + local26;
				@Pc(73) int local73 = local64 >= -2048 ? local64 : local64 + 4096;
				@Pc(84) int local84 = local73 <= 2048 ? local73 : local73 - 4096;
				@Pc(89) int local89 = local36 + this.anInt8517;
				@Pc(100) int local100 = local89 < -2048 ? local89 + 4096 : local89;
				@Pc(109) int local109 = local100 <= 2048 ? local100 : local100 - 4096;
				@Pc(115) int local115 = local26 + this.anInt8514;
				@Pc(126) int local126 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(137) int local137 = local126 <= 2048 ? local126 : local126 - 4096;
				local16[local28] = this.method7447(local84, local59) || this.method7445(local109, local137) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(III)Z")
	private boolean method7447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt8518 * (arg0 - arg1) >> 12;
		@Pc(22) int local22 = Static246.anIntArray361[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt8518;
		@Pc(44) int local44 = (local29 << 12) / this.anInt8510;
		@Pc(51) int local51 = this.anInt8515 * local44 >> 12;
		return arg1 + arg0 < local51 && arg1 + arg0 > -local51;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		Static371.method5980();
	}
}
