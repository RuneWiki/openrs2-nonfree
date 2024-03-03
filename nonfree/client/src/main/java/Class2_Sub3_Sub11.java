import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_45 = new Class79("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ft", name = "X", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_79 = new Class145(11, 16);

	@OriginalMember(owner = "client!ft", name = "bb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
	private int anInt2176 = 20;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	private int anInt2175 = 1365;

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
	private int anInt2181 = 0;

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
	private int anInt2179 = 0;

	static {
		new Class79("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 4)
	public Class2_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I", line = 35)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			for (@Pc(22) int local22 = 0; local22 < Static211.anInt4031; local22++) {
				@Pc(36) int local36 = this.anInt2181 + (Static311.anIntArray424[local22] << 12) / this.anInt2175;
				@Pc(48) int local48 = (Static16.anIntArray322[arg0] << 12) / this.anInt2175 + this.anInt2179;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt2176 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local68 = local56 * local56 >> 12;
					local70++;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = local70 < this.anInt2176 - 1 ? (local70 << 12) / this.anInt2176 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!bt;I)V", line = 300)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2175 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt2176 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt2181 = arg1.method4830();
		} else if (arg0 == 3) {
			this.anInt2179 = arg1.method4830();
		}
	}
}
