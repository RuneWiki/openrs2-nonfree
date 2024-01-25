import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class4_Sub2_Sub25 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "[I")
	private final int[] anIntArray384 = new int[3];

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
	private int anInt4608 = 3216;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	private int anInt4606 = 4096;

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "I")
	private int anInt4613 = 3216;

	static {
		new Class242("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.method3492();
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)V")
	private void method3492() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4608 / 4096.0F));
		this.anIntArray384[0] = (int) (local11 * Math.sin((double) ((float) this.anInt4613 / 4096.0F)) * 4096.0D);
		this.anIntArray384[1] = (int) (local11 * Math.cos((double) ((float) this.anInt4613 / 4096.0F)) * 4096.0D);
		this.anIntArray384[2] = (int) (Math.sin((double) ((float) this.anInt4608 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray384[0] * this.anIntArray384[0] >> 12;
		@Pc(87) int local87 = this.anIntArray384[1] * this.anIntArray384[1] >> 12;
		@Pc(99) int local99 = this.anIntArray384[2] * this.anIntArray384[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local75 + local87 + local99 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray384[2] = (this.anIntArray384[2] << 12) / local112;
			this.anIntArray384[1] = (this.anIntArray384[1] << 12) / local112;
			this.anIntArray384[0] = (this.anIntArray384[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(28) int local28 = this.anInt4606 * Static136.anInt2636 >> 12;
			@Pc(38) int[] local38 = this.method5847(0, arg0 - 1 & Static323.anInt5763);
			@Pc(44) int[] local44 = this.method5847(0, arg0);
			@Pc(54) int[] local54 = this.method5847(0, Static323.anInt5763 & arg0 + 1);
			for (@Pc(56) int local56 = 0; local56 < Static350.anInt6330; local56++) {
				@Pc(71) int local71 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(92) int local92 = local28 * (local44[local56 - 1 & Static144.anInt2707] - local44[local56 + 1 & Static144.anInt2707]) >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local71 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(134) int local134 = Class4_Sub1_Sub6.aByteArray12[local96 + ((local100 + 1) * local100 >> 1)] & 0xFF;
				@Pc(140) int local140 = local134 * local71 >> 8;
				@Pc(146) int local146 = local92 * local134 >> 8;
				@Pc(152) int local152 = local134 * 4096 >> 8;
				@Pc(161) int local161 = local152 * this.anIntArray384[2] >> 12;
				@Pc(170) int local170 = local146 * this.anIntArray384[0] >> 12;
				@Pc(179) int local179 = local140 * this.anIntArray384[1] >> 12;
				local11[local56] = local161 + local170 + local179;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt4606 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt4613 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt4608 = arg1.method4877();
		}
	}
}
