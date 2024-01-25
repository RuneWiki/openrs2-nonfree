import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	private int anInt1164 = 0;

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
	private int anInt1169 = 4096;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	private int anInt1162 = 2048;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
	private int anInt1171 = 12288;

	@OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
	private int anInt1172 = 0;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
	private int anInt1166 = 2048;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	private int anInt1173 = 8192;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1162 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt1172 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt1164 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt1166 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt1171 = arg0.method3108();
		} else if (arg1 == 5) {
			this.anInt1169 = arg0.method3108();
		} else if (arg1 == 6) {
			this.anInt1173 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int local26 = Static168.anIntArray278[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static185.anInt4925; local28++) {
				@Pc(36) int local36 = Static53.anIntArray95[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt1162;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(64) int local64 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(70) int local70 = local26 + this.anInt1172;
				@Pc(79) int local79 = local70 < -2048 ? local70 + 4096 : local70;
				@Pc(88) int local88 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(93) int local93 = this.anInt1164 + local36;
				@Pc(102) int local102 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(111) int local111 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(117) int local117 = local26 + this.anInt1166;
				@Pc(126) int local126 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(137) int local137 = local126 > 2048 ? local126 - 4096 : local126;
				local16[local28] = this.method1052(local64, local88) || this.method1056(local111, local137) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Z")
	private boolean method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt1171 * (arg1 - arg0) >> 12;
		@Pc(22) int local22 = Static37.anIntArray640[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt1171;
		@Pc(36) int local36 = (local29 << 12) / this.anInt1173;
		@Pc(48) int local48 = local36 * this.anInt1169 >> 12;
		return local48 > arg1 + arg0 && -local48 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		Static172.method2738();
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(III)Z")
	private boolean method1056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1171 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static37.anIntArray640[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local22 << 12) / this.anInt1171;
		@Pc(41) int local41 = (local34 << 12) / this.anInt1173;
		@Pc(48) int local48 = this.anInt1169 * local41 >> 12;
		return arg1 - arg0 < local48 && -local48 < arg1 - arg0;
	}
}
