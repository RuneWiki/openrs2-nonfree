import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class4_Sub3_Sub23 extends Class4_Sub3 {

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
	private int anInt4560 = 4096;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	private int anInt4562 = 4096;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
	private int anInt4563 = 4096;

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "[I")
	private final int[] anIntArray364 = new int[3];

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	private int anInt4564 = 409;

	static {
		new Class21("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
		new Class21("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(29) int[][] local29 = this.method6331(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static304.anInt5637; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray364[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt4564 < local68) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(106) int local106 = local37[local55];
					local68 = local106 - this.anIntArray364[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt4564 < local68) {
						local45[local55] = local61;
						local49[local55] = local106;
						local53[local55] = local41[local55];
					} else {
						@Pc(146) int local146 = local41[local55];
						local68 = local146 - this.anIntArray364[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt4564) {
							local45[local55] = local61;
							local49[local55] = local106;
							local53[local55] = local146;
						} else {
							local45[local55] = local61 * this.anInt4562 >> 12;
							local49[local55] = local106 * this.anInt4560 >> 12;
							local53[local55] = local146 * this.anInt4563 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4564 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt4563 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt4560 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt4562 = arg1.method4560();
		} else if (arg0 == 4) {
			@Pc(65) int local65 = arg1.method4582();
			this.anIntArray364[2] = local65 >> 12 & 0x0;
			this.anIntArray364[0] = (local65 & 0xFF0000) << 4;
			this.anIntArray364[1] = local65 >> 4 & 0xFF0;
		}
	}
}
