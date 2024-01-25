import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	private int anInt4984 = 4096;

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
	private int anInt4985 = 4096;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
	private int anInt4986 = 4096;

	static {
		new Class209("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class209("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method5840(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static429.anInt6518; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local69 == local65) {
					local45[local55] = this.anInt4985 * local61 >> 12;
					local49[local55] = this.anInt4984 * local65 >> 12;
					local53[local55] = local69 * this.anInt4986 >> 12;
				} else {
					local45[local55] = this.anInt4985;
					local49[local55] = this.anInt4984;
					local53[local55] = this.anInt4986;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4985 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt4984 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt4986 = arg0.method5500();
		}
	}
}
