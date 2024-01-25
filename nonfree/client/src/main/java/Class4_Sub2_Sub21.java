import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class4_Sub2_Sub21 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
	private int anInt3993 = 4096;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "Z")
	private boolean aBoolean300 = true;

	static {
		new Class242("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(25) int[] local25 = this.method5847(0, Static323.anInt5763 & arg0 - 1);
			@Pc(31) int[] local31 = this.method5847(0, arg0);
			@Pc(41) int[] local41 = this.method5847(0, Static323.anInt5763 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static350.anInt6330; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt3993;
				@Pc(89) int local89 = this.anInt3993 * (local31[local55 + 1 & Static144.anInt2707] - local31[Static144.anInt2707 & local55 - 1]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130;
				@Pc(132) int local132;
				@Pc(134) int local134;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local132 = local69 / local123;
					local130 = local89 / local123;
					local134 = 16777216 / local123;
				}
				if (this.aBoolean300) {
					local134 = (local134 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local45[local55] = local130;
				local49[local55] = local132;
				local53[local55] = local134;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3993 = arg1.method4877();
		} else if (arg0 == 1) {
			this.aBoolean300 = arg1.method4864() == 1;
		}
	}
}
