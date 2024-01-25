import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	private int anInt730 = 4096;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "Z")
	private boolean aBoolean51 = true;

	static {
		new Class221("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(30) int[] local30 = this.method5635(arg0 - 1 & Static71.anInt1349, 0);
			@Pc(36) int[] local36 = this.method5635(arg0, 0);
			@Pc(48) int[] local48 = this.method5635(arg0 + 1 & Static71.anInt1349, 0);
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			for (@Pc(62) int local62 = 0; local62 < Static151.anInt2711; local62++) {
				@Pc(76) int local76 = (local48[local62] - local30[local62]) * this.anInt730;
				@Pc(95) int local95 = this.anInt730 * (local36[local62 + 1 & Static274.anInt1078] - local36[local62 - 1 & Static274.anInt1078]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local76 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local115 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(138) int local138;
				@Pc(140) int local140;
				if (local129 == 0) {
					local136 = 0;
					local138 = 0;
					local140 = 0;
				} else {
					local136 = local95 / local129;
					local138 = local76 / local129;
					local140 = 16777216 / local129;
				}
				if (this.aBoolean51) {
					local140 = (local140 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local52[local62] = local136;
				local56[local62] = local138;
				local60[local62] = local140;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt730 = arg0.method4245();
		} else if (arg1 == 1) {
			this.aBoolean51 = arg0.method4240() == 1;
		}
	}
}
