import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class4_Sub6_Sub27 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
	private int anInt5088 = 0;

	@OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
	private int anInt5100 = 8192;

	@OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
	private int anInt5097 = 12288;

	@OriginalMember(owner = "client!ps", name = "X", descriptor = "I")
	private int anInt5101 = 2048;

	@OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
	private int anInt5099 = 2048;

	@OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
	private int anInt5102 = 4096;

	@OriginalMember(owner = "client!ps", name = "ab", descriptor = "I")
	private int anInt5104 = 0;

	static {
		new Class159("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5099 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt5104 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt5088 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt5101 = arg1.method3401();
		} else if (arg0 == 4) {
			this.anInt5097 = arg1.method3401();
		} else if (arg0 == 5) {
			this.anInt5102 = arg1.method3401();
		} else if (arg0 == 6) {
			this.anInt5100 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		Static147.method2993();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Z")
	private boolean method4421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 + arg0) * this.anInt5097 >> 12;
		@Pc(23) int local23 = Static232.anIntArray392[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5097;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5100;
		@Pc(44) int local44 = this.anInt5102 * local37 >> 12;
		return local44 > arg1 - arg0 && arg1 - arg0 > -local44;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(IZI)Z")
	private boolean method4422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt5097 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static232.anIntArray392[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5097;
		@Pc(42) int local42 = (local30 << 12) / this.anInt5100;
		@Pc(49) int local49 = local42 * this.anInt5102 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(27) int local27 = Static128.anIntArray265[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static31.anInt797; local29++) {
				@Pc(37) int local37 = Static339.anIntArray4[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt5099;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local51 > 2048 ? local51 - 4096 : local51;
				@Pc(68) int local68 = local27 + this.anInt5104;
				@Pc(79) int local79 = local68 < -2048 ? local68 + 4096 : local68;
				@Pc(90) int local90 = local79 > 2048 ? local79 - 4096 : local79;
				@Pc(96) int local96 = local37 + this.anInt5088;
				@Pc(105) int local105 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(116) int local116 = local105 <= 2048 ? local105 : local105 - 4096;
				@Pc(122) int local122 = local27 + this.anInt5101;
				@Pc(133) int local133 = local122 >= -2048 ? local122 : local122 + 4096;
				@Pc(144) int local144 = local133 > 2048 ? local133 - 4096 : local133;
				local11[local29] = this.method4422(local90, local62) || this.method4421(local116, local144) ? 4096 : 0;
			}
		}
		return local11;
	}
}
