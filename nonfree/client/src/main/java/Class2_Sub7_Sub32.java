import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub7_Sub32 extends Class2_Sub7 {

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	private int anInt8187 = 1;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	private int anInt8193 = 1;

	static {
		new Class202("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(31) int local31 = this.anInt8187 + this.anInt8187 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt8193 + this.anInt8193 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt8187; local57 <= arg0 + this.anInt8187; local57++) {
				@Pc(67) int[][] local67 = this.method7589(0, local57 & Static126.anInt7690);
				@Pc(71) int[][] local71 = new int[3][Static352.anInt6485];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt8193; local93 <= this.anInt8193; local93++) {
					@Pc(99) int local99 = Static38.anInt733 & local93;
					local77 += local89[local99];
					local75 += local85[local99];
					local73 += local81[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (Static352.anInt6485 > local136) {
					local126[local136] = local73 * local48 >> 16;
					local130[local136] = local75 * local48 >> 16;
					local134[local136] = local77 * local48 >> 16;
					@Pc(170) int local170 = local136 - this.anInt8193 & Static38.anInt733;
					local77 -= local89[local170];
					local136++;
					local75 -= local85[local170];
					local73 -= local81[local170];
					@Pc(196) int local196 = Static38.anInt733 & local136 + this.anInt8193;
					local73 += local81[local196];
					local75 += local85[local196];
					local77 += local89[local196];
				}
				local51[local57 + this.anInt8187 - arg0] = local71;
			}
			@Pc(247) int[] local247 = local13[0];
			@Pc(251) int[] local251 = local13[1];
			@Pc(255) int[] local255 = local13[2];
			for (local75 = 0; local75 < Static352.anInt6485; local75++) {
				local77 = 0;
				@Pc(263) int local263 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local31; local267++) {
					@Pc(273) int[][] local273 = local51[local267];
					local77 += local273[0][local75];
					local265 += local273[2][local75];
					local263 += local273[1][local75];
				}
				local247[local75] = local77 * local35 >> 16;
				local251[local75] = local35 * local263 >> 16;
				local255[local75] = local265 * local35 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(23) int local23 = this.anInt8187 + this.anInt8187 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt8193 + this.anInt8193 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt8187; local48 <= this.anInt8187 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method7581(Static126.anInt7690 & local48, 0);
				@Pc(61) int[] local61 = new int[Static352.anInt6485];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt8193; local67 <= this.anInt8193; local67++) {
					local63 += local58[Static38.anInt733 & local67];
				}
				@Pc(84) int local84 = 0;
				while (local84 < Static352.anInt6485) {
					local61[local84] = local39 * local63 >> 16;
					local63 -= local58[Static38.anInt733 & local84 - this.anInt8193];
					local84++;
					local63 += local58[local84 + this.anInt8193 & Static38.anInt733];
				}
				local42[local48 + this.anInt8187 - arg0] = local61;
			}
			for (@Pc(145) int local145 = 0; local145 < Static352.anInt6485; local145++) {
				@Pc(149) int local149 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local149 += local42[local63][local145];
				}
				local11[local145] = local27 * local149 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt8193 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt8187 = arg1.method5170();
		} else if (arg0 == 2) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}
}
