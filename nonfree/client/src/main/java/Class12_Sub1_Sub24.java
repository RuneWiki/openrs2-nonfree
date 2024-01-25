import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class12_Sub1_Sub24 extends Class12_Sub1 {

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
	private int anInt7414 = 4096;

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
	private int anInt7415 = 4096;

	@OriginalMember(owner = "client!pv", name = "H", descriptor = "I")
	private int anInt7416 = 4096;

	static {
		new Class88("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
		new Class88("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(29) int[][] local29 = this.method7790(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static357.anInt6670; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local69 == local65) {
					local45[local55] = local61 * this.anInt7416 >> 12;
					local49[local55] = this.anInt7415 * local65 >> 12;
					local53[local55] = local69 * this.anInt7414 >> 12;
				} else {
					local45[local55] = this.anInt7416;
					local49[local55] = this.anInt7415;
					local53[local55] = this.anInt7414;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7416 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt7415 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt7414 = arg0.method5199();
		}
	}
}
