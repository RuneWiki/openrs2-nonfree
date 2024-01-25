import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class1_Sub4_Sub18 extends Class1_Sub4 {

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "Z")
	private boolean aBoolean365 = true;

	@OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
	private int anInt3165 = 4096;

	static {
		new Class119("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3165 = arg0.method5335();
		} else if (arg1 == 1) {
			this.aBoolean365 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(30) int[] local30 = this.method5695(arg0 - 1 & Static452.anInt7487, 0);
			@Pc(36) int[] local36 = this.method5695(arg0, 0);
			@Pc(46) int[] local46 = this.method5695(Static452.anInt7487 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static395.anInt6592; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt3165;
				@Pc(93) int local93 = (local36[local60 + 1 & Static247.anInt4469] - local36[Static247.anInt4469 & local60 - 1]) * this.anInt3165;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(134) int local134;
				@Pc(132) int local132;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local134 = local73 / local128;
					local132 = 16777216 / local128;
					local136 = local93 / local128;
				}
				if (this.aBoolean365) {
					local136 = (local136 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local50[local60] = local136;
				local54[local60] = local134;
				local58[local60] = local132;
			}
		}
		return local16;
	}
}
