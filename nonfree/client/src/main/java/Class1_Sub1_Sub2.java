import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
	private int anInt217 = 2048;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	private int anInt216 = 8192;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	private int anInt213 = 12288;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	private int anInt219 = 4096;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	private int anInt221 = 2048;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
	private int anInt215 = 0;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	private int anInt214 = 0;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZ)Z")
	private boolean method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt213 >> 12;
		@Pc(22) int local22 = Static366.anIntArray375[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt213;
		@Pc(42) int local42 = (local29 << 12) / this.anInt216;
		@Pc(49) int local49 = this.anInt219 * local42 >> 12;
		return local49 > arg1 + arg0 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
	private boolean method179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = (arg1 + arg0) * this.anInt213 >> 12;
		@Pc(27) int local27 = Static366.anIntArray375[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt213;
		@Pc(41) int local41 = (local34 << 12) / this.anInt216;
		@Pc(48) int local48 = this.anInt219 * local41 >> 12;
		return arg0 - arg1 < local48 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		Static103.method1475();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(21) int local21 = Static221.anIntArray194[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static434.anInt4326; local23++) {
				@Pc(31) int local31 = Static280.anIntArray238[local23] - 2048;
				@Pc(36) int local36 = this.anInt217 + local31;
				@Pc(45) int local45 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(56) int local56 = local45 <= 2048 ? local45 : local45 - 4096;
				@Pc(61) int local61 = this.anInt215 + local21;
				@Pc(72) int local72 = local61 >= -2048 ? local61 : local61 + 4096;
				@Pc(81) int local81 = local72 > 2048 ? local72 - 4096 : local72;
				@Pc(86) int local86 = this.anInt214 + local31;
				@Pc(95) int local95 = local86 < -2048 ? local86 + 4096 : local86;
				@Pc(106) int local106 = local95 <= 2048 ? local95 : local95 - 4096;
				@Pc(111) int local111 = this.anInt221 + local21;
				@Pc(122) int local122 = local111 >= -2048 ? local111 : local111 + 4096;
				@Pc(133) int local133 = local122 > 2048 ? local122 - 4096 : local122;
				local11[local23] = this.method177(local81, local56) || this.method179(local133, local106) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt217 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt215 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt214 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt221 = arg1.method4485();
		} else if (arg0 == 4) {
			this.anInt213 = arg1.method4485();
		} else if (arg0 == 5) {
			this.anInt219 = arg1.method4485();
		} else if (arg0 == 6) {
			this.anInt216 = arg1.method4485();
		}
	}
}
