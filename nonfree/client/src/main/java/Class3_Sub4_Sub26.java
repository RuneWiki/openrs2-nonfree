import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class3_Sub4_Sub26 extends Class3_Sub4 {

	@OriginalMember(owner = "client!op", name = "L", descriptor = "I")
	private int anInt5222 = 4096;

	@OriginalMember(owner = "client!op", name = "N", descriptor = "I")
	private int anInt5224 = 4096;

	@OriginalMember(owner = "client!op", name = "T", descriptor = "I")
	private int anInt5228 = 4096;

	static {
		new Class174("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I")
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
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = local61 * this.anInt5224 >> 12;
					local49[local55] = local65 * this.anInt5222 >> 12;
					local53[local55] = this.anInt5228 * local69 >> 12;
				} else {
					local45[local55] = this.anInt5224;
					local49[local55] = this.anInt5222;
					local53[local55] = this.anInt5228;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5224 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt5222 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt5228 = arg0.method4083();
		}
	}
}
