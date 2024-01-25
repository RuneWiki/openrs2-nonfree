import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class3_Sub4_Sub38 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
	private int anInt7338 = 20;

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
	private int anInt7342 = 0;

	@OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
	private int anInt7346 = 0;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	private int anInt7339 = 1365;

	static {
		new Class174("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			for (@Pc(17) int local17 = 0; local17 < Static148.anInt2687; local17++) {
				@Pc(31) int local31 = this.anInt7342 + (Static401.anIntArray419[local17] << 12) / this.anInt7339;
				@Pc(43) int local43 = (Static317.anIntArray337[arg0] << 12) / this.anInt7339 + this.anInt7346;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65;
				for (local65 = 0; local57 + local63 < 16384 && this.anInt7338 > local65; local65++) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local57 + local31 - local63;
					local63 = local51 * local51 >> 12;
					local57 = local49 * local49 >> 12;
				}
				local11[local17] = this.anInt7338 - 1 <= local65 ? 0 : (local65 << 12) / this.anInt7338;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7339 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt7338 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt7342 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt7346 = arg0.method4083();
		}
	}
}
