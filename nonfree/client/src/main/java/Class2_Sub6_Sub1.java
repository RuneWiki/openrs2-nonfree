import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
	private int anInt519 = 4096;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
	private int anInt515 = 3216;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
	private int anInt517 = 3216;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "[I")
	private final int[] anIntArray95 = new int[3];

	static {
		new Class221("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
		new Class221("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.method617();
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
	private void method617() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt515 / 4096.0F));
		this.anIntArray95[0] = (int) (Math.sin((double) ((float) this.anInt517 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray95[1] = (int) (Math.cos((double) ((float) this.anInt517 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray95[2] = (int) (Math.sin((double) ((float) this.anInt515 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray95[0] * this.anIntArray95[0] >> 12;
		@Pc(81) int local81 = this.anIntArray95[1] * this.anIntArray95[1] >> 12;
		@Pc(93) int local93 = this.anIntArray95[2] * this.anIntArray95[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray95[0] = (this.anIntArray95[0] << 12) / local107;
			this.anIntArray95[1] = (this.anIntArray95[1] << 12) / local107;
			this.anIntArray95[2] = (this.anIntArray95[2] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt519 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt517 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt515 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(28) int local28 = this.anInt519 * Static23.anInt552 >> 12;
			@Pc(38) int[] local38 = this.method5635(Static71.anInt1349 & arg0 - 1, 0);
			@Pc(46) int[] local46 = this.method5635(arg0, 0);
			@Pc(56) int[] local56 = this.method5635(Static71.anInt1349 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static151.anInt2711; local58++) {
				@Pc(72) int local72 = local28 * (local56[local58] - local38[local58]) >> 12;
				@Pc(93) int local93 = local28 * (local46[Static274.anInt1078 & local58 - 1] - local46[local58 + 1 & Static274.anInt1078]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(106) int local106 = local72 >> 4;
				if (local97 > 255) {
					local97 = 255;
				}
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(138) int local138 = Class191.aByteArray83[local97 + ((local106 + 1) * local106 >> 1)] & 0xFF;
				@Pc(144) int local144 = local138 * local93 >> 8;
				@Pc(150) int local150 = local138 * 4096 >> 8;
				@Pc(156) int local156 = local138 * local72 >> 8;
				@Pc(165) int local165 = this.anIntArray95[0] * local144 >> 12;
				@Pc(174) int local174 = local156 * this.anIntArray95[1] >> 12;
				@Pc(183) int local183 = this.anIntArray95[2] * local150 >> 12;
				local11[local58] = local174 + local165 + local183;
			}
		}
		return local11;
	}
}
