import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class3_Sub4_Sub14 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	private int anInt2528 = 409;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	private int anInt2529 = 4096;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
	private int anInt2532 = 4096;

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "I")
	private int anInt2534 = 4096;

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "[I")
	private final int[] anIntArray130 = new int[3];

	static {
		new Class174("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
		new Class174("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
		new Class174(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray130[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt2528 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray130[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt2528 < local69) {
						local45[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local41[local55];
					} else {
						@Pc(137) int local137 = local41[local55];
						local69 = local137 - this.anIntArray130[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt2528) {
							local45[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local137;
						} else {
							local45[local55] = this.anInt2534 * local61 >> 12;
							local49[local55] = local100 * this.anInt2532 >> 12;
							local53[local55] = this.anInt2529 * local137 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2528 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt2529 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt2532 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt2534 = arg0.method4083();
		} else if (arg1 == 4) {
			@Pc(68) int local68 = arg0.method4099();
			this.anIntArray130[2] = local68 >> 12 & 0x0;
			this.anIntArray130[1] = local68 >> 4 & 0xFF0;
			this.anIntArray130[0] = (local68 & 0xFF0000) << 4;
		}
	}
}
