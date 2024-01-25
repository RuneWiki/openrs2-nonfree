import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class1_Sub8_Sub25 extends Class1_Sub8 {

	@OriginalMember(owner = "client!po", name = "I", descriptor = "[I")
	private int[] anIntArray551;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!po", name = "M", descriptor = "I")
	private int anInt5874 = 2048;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	private int anInt5871 = 0;

	@OriginalMember(owner = "client!po", name = "T", descriptor = "I")
	private int anInt5878 = 10;

	static {
		new Class158("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5878 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt5874 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt5871 = arg1.method1171();
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.method4501();
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V")
	private void method4501() {
		this.anIntArray551 = new int[this.anInt5878 + 1];
		@Pc(22) int local22 = 0;
		this.anIntArray552 = new int[this.anInt5878 + 1];
		@Pc(34) int local34 = 4096 / this.anInt5878;
		@Pc(41) int local41 = this.anInt5874 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt5878; local43++) {
			this.anIntArray551[local43] = local22;
			this.anIntArray552[local43] = local22 + local41;
			local22 += local34;
		}
		this.anIntArray551[this.anInt5878] = 4096;
		this.anIntArray552[this.anInt5878] = this.anIntArray552[0] + 4096;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(27) int local27 = Static134.anIntArray308[arg0];
			@Pc(37) int local37;
			if (this.anInt5871 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt5878; local37++) {
					if (this.anIntArray551[local37] <= local27 && local27 < this.anIntArray551[local37 + 1]) {
						if (local27 < this.anIntArray552[local37]) {
							local35 = 4096;
						}
						break;
					}
				}
				Static469.method6015(local11, 0, Static18.anInt439, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static18.anInt439; local85++) {
					local37 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static198.anIntArray749[local85];
					@Pc(98) int local98 = this.anInt5871;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local27 + local95 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt5878; local98++) {
						if (this.anIntArray551[local98] <= local37 && this.anIntArray551[local98 + 1] > local37) {
							if (local37 < this.anIntArray552[local98]) {
								local91 = 4096;
							}
							break;
						}
					}
					local11[local85] = local91;
				}
			}
		}
		return local11;
	}
}
