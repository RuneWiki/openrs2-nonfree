import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub5_Sub34 extends Class1_Sub5 {

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt5945 = 12288;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "I")
	private int anInt5946 = 0;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "I")
	private int anInt5957 = 2048;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
	private int anInt5960 = 4096;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	private int anInt5947 = 8192;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "I")
	private int anInt5954 = 0;

	@OriginalMember(owner = "client!th", name = "db", descriptor = "I")
	private int anInt5962 = 2048;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		Static341.method5649();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5957 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt5946 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt5954 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt5962 = arg0.method5715();
		} else if (arg1 == 4) {
			this.anInt5945 = arg0.method5715();
		} else if (arg1 == 5) {
			this.anInt5960 = arg0.method5715();
		} else if (arg1 == 6) {
			this.anInt5947 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(26) int local26 = Static191.anIntArray379[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static75.anInt1566; local28++) {
				@Pc(36) int local36 = Static49.anIntArray492[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt5957;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(67) int local67 = local26 + this.anInt5946;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(93) int local93 = local36 + this.anInt5954;
				@Pc(102) int local102 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(113) int local113 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(118) int local118 = this.anInt5962 + local26;
				@Pc(129) int local129 = local118 >= -2048 ? local118 : local118 + 4096;
				@Pc(138) int local138 = local129 > 2048 ? local129 - 4096 : local129;
				local11[local28] = this.method5185(local61, local87) || this.method5181(local138, local113) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)Z")
	private boolean method5181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt5945 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static13.anIntArray10[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt5945;
		@Pc(41) int local41 = (local34 << 12) / this.anInt5947;
		@Pc(48) int local48 = local41 * this.anInt5960 >> 12;
		return local48 > arg0 - arg1 && -local48 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(III)Z")
	private boolean method5185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt5945 >> 12;
		@Pc(31) int local31 = Static13.anIntArray10[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt5945;
		@Pc(45) int local45 = (local38 << 12) / this.anInt5947;
		@Pc(52) int local52 = this.anInt5960 * local45 >> 12;
		return arg1 + arg0 < local52 && arg0 + arg1 > -local52;
	}
}
