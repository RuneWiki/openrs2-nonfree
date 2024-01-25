import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class2_Sub4_Sub8 extends Class2_Sub4 {

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
	private int anInt1185 = 2048;

	@OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
	private int anInt1186 = 4096;

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
	private int anInt1183 = 8192;

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
	private int anInt1187 = 2048;

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
	private int anInt1191 = 12288;

	@OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
	private int anInt1189 = 0;

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
	private int anInt1192 = 0;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(27) int local27 = Static347.anIntArray1193[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static76.anInt1458; local29++) {
				@Pc(37) int local37 = Static40.anIntArray173[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt1187;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(67) int local67 = this.anInt1189 + local27;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(92) int local92 = this.anInt1192 + local37;
				@Pc(103) int local103 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local103 > 2048 ? local103 - 4096 : local103;
				@Pc(117) int local117 = this.anInt1185 + local27;
				@Pc(126) int local126 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(137) int local137 = local126 > 2048 ? local126 - 4096 : local126;
				local17[local29] = this.method1002(local62, local87) || this.method1001(local137, local112) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
	private boolean method1001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt1191 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static61.anIntArray261[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt1191;
		@Pc(37) int local37 = (local30 << 12) / this.anInt1183;
		@Pc(49) int local49 = this.anInt1186 * local37 >> 12;
		return local49 > arg0 - arg1 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIB)Z")
	private boolean method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt1191 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static61.anIntArray261[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt1191;
		@Pc(37) int local37 = (local30 << 12) / this.anInt1183;
		@Pc(44) int local44 = local37 * this.anInt1186 >> 12;
		return local44 > arg0 + arg1 && arg1 + arg0 > -local44;
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		Static299.method4462();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1187 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt1189 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt1192 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt1185 = arg0.method5312();
		} else if (arg1 == 4) {
			this.anInt1191 = arg0.method5312();
		} else if (arg1 == 5) {
			this.anInt1186 = arg0.method5312();
		} else if (arg1 == 6) {
			this.anInt1183 = arg0.method5312();
		}
	}
}
