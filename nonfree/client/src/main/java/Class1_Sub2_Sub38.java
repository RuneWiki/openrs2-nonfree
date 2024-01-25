import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
	private int anInt6279 = 0;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
	private int anInt6286 = 0;

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
	private int anInt6283 = 1;

	static {
		new Class169("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		Static73.method1169();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt6286 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt6279 = arg1.method5174();
		} else if (arg0 == 3) {
			this.anInt6283 = arg1.method5174();
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(24) int local24 = Static394.anIntArray751[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static158.anInt2658; local32++) {
				@Pc(38) int local38 = Static87.anIntArray211[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(54) int local54;
				if (this.anInt6286 == 0) {
					local54 = this.anInt6283 * (local38 - local24);
				} else {
					@Pc(66) int local66 = local44 * local44 + local30 * local30 >> 12;
					local54 = (int) (Math.sqrt((double) ((float) local66 / 4096.0F)) * 4096.0D);
					local54 = (int) ((double) (local54 * this.anInt6283) * 3.141592653589793D);
				}
				local54 -= local54 & 0xFFFFF000;
				if (this.anInt6279 == 0) {
					local54 = Static355.anIntArray531[local54 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6279 == 2) {
					local54 -= 2048;
					if (local54 < 0) {
						local54 = -local54;
					}
					local54 = 2048 - local54 << 1;
				}
				local11[local32] = local54;
			}
		}
		return local11;
	}
}
