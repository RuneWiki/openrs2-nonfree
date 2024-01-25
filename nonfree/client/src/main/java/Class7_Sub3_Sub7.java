import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class7_Sub3_Sub7 extends Class7_Sub3 {

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
	private int anInt1348;

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
	private int anInt1358;

	@OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	private int anInt1349 = 0;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
	private int anInt1355 = 0;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
	private int anInt1351 = 0;

	static {
		new Class55("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
	private void method1170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >= arg0 ? arg1 : arg0;
		@Pc(27) int local27 = arg2 <= local16 ? local16 : arg2;
		@Pc(38) int local38 = arg0 >= arg1 ? arg1 : arg0;
		@Pc(55) int local55 = local38 <= arg2 ? local38 : arg2;
		@Pc(60) int local60 = local27 - local55;
		this.anInt1361 = (local27 + local55) / 2;
		if (local60 > 0) {
			@Pc(81) int local81 = (local27 - arg0 << 12) / local60;
			@Pc(90) int local90 = (local27 - arg1 << 12) / local60;
			@Pc(99) int local99 = (local27 - arg2 << 12) / local60;
			if (local27 == arg0) {
				this.anInt1358 = local55 == arg1 ? local99 + 20480 : 4096 - local90;
			} else if (local27 == arg1) {
				this.anInt1358 = arg2 == local55 ? local81 + 4096 : -local99 + 12288;
			} else {
				this.anInt1358 = local55 == arg0 ? local90 + 12288 : 20480 - local81;
			}
			this.anInt1358 /= 6;
		} else {
			this.anInt1358 = 0;
		}
		if (this.anInt1361 > 0 && this.anInt1361 < 4096) {
			this.anInt1359 = (local60 << 12) / (this.anInt1361 <= 2048 ? this.anInt1361 * 2 : 8192 - this.anInt1361 * 2);
		} else {
			this.anInt1359 = 0;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(30) int[][] local30 = this.method5597(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static58.anInt1052; local56++) {
				this.method1170(local34[local56], local38[local56], local42[local56]);
				this.anInt1358 += this.anInt1355;
				this.anInt1359 += this.anInt1349;
				this.anInt1361 += this.anInt1351;
				while (this.anInt1358 < 0) {
					this.anInt1358 += 4096;
				}
				if (this.anInt1359 < 0) {
					this.anInt1359 = 0;
				}
				while (this.anInt1358 > 4096) {
					this.anInt1358 -= 4096;
				}
				if (this.anInt1361 < 0) {
					this.anInt1361 = 0;
				}
				if (this.anInt1359 > 4096) {
					this.anInt1359 = 4096;
				}
				if (this.anInt1361 > 4096) {
					this.anInt1361 = 4096;
				}
				this.method1172(this.anInt1361, this.anInt1359, this.anInt1358);
				local46[local56] = this.anInt1346;
				local50[local56] = this.anInt1347;
				local54[local56] = this.anInt1348;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1355 = arg1.method3961();
		} else if (arg0 == 1) {
			this.anInt1349 = (arg1.method3930() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1351 = (arg1.method3930() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V")
	private void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
		if (local29 <= 0) {
			this.anInt1346 = this.anInt1347 = this.anInt1348 = arg0;
			return;
		}
		@Pc(45) int local45 = arg2 * 6;
		@Pc(52) int local52 = arg0 + arg0 - local29;
		@Pc(61) int local61 = (local29 - local52 << 12) / local29;
		@Pc(65) int local65 = local45 >> 12;
		@Pc(72) int local72 = local45 - (local65 << 12);
		@Pc(80) int local80 = local29 * local61 >> 12;
		@Pc(86) int local86 = local80 * local72 >> 12;
		@Pc(91) int local91 = local52 + local86;
		@Pc(96) int local96 = local29 - local86;
		if (local65 == 0) {
			this.anInt1348 = local52;
			this.anInt1347 = local91;
			this.anInt1346 = local29;
		} else if (local65 == 1) {
			this.anInt1346 = local96;
			this.anInt1347 = local29;
			this.anInt1348 = local52;
		} else if (local65 == 2) {
			this.anInt1347 = local29;
			this.anInt1346 = local52;
			this.anInt1348 = local91;
		} else if (local65 == 3) {
			this.anInt1347 = local96;
			this.anInt1346 = local52;
			this.anInt1348 = local29;
		} else if (local65 == 4) {
			this.anInt1346 = local91;
			this.anInt1347 = local52;
			this.anInt1348 = local29;
		} else if (local65 == 5) {
			this.anInt1346 = local29;
			this.anInt1347 = local52;
			this.anInt1348 = local96;
		}
	}
}
