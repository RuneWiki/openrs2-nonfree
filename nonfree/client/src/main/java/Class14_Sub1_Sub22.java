import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class14_Sub1_Sub22 extends Class14_Sub1 {

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
	private int anInt6252 = 0;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
	private int anInt6263 = 0;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt6255 = 2048;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	private int anInt6261 = 8192;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
	private int anInt6260 = 4096;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
	private int anInt6264 = 12288;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
	private int anInt6259 = 2048;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIB)Z")
	private boolean method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt6264 >> 12;
		@Pc(28) int local28 = Static646.anIntArray808[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt6264;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6261;
		@Pc(49) int local49 = this.anInt6260 * local42 >> 12;
		return arg1 + arg0 < local49 && arg0 + arg1 > -local49;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)Z")
	private boolean method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt6264 >> 12;
		@Pc(22) int local22 = Static646.anIntArray808[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt6264;
		@Pc(36) int local36 = (local29 << 12) / this.anInt6261;
		@Pc(48) int local48 = this.anInt6260 * local36 >> 12;
		return arg0 - arg1 < local48 && arg0 - arg1 > -local48;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int local26 = Static336.anIntArray458[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static371.anInt6835; local28++) {
				@Pc(36) int local36 = Static160.anIntArray258[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt6259;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = local26 + this.anInt6252;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local78 > 2048 ? local78 - 4096 : local78;
				@Pc(93) int local93 = local36 + this.anInt6263;
				@Pc(102) int local102 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(111) int local111 = local102 > 2048 ? local102 - 4096 : local102;
				@Pc(116) int local116 = this.anInt6255 + local26;
				@Pc(125) int local125 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(136) int local136 = local125 <= 2048 ? local125 : local125 - 4096;
				local16[local28] = this.method5176(local62, local87) || this.method5178(local136, local111) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6259 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt6252 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt6263 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt6255 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt6264 = arg0.method5900();
		} else if (arg1 == 5) {
			this.anInt6260 = arg0.method5900();
		} else if (arg1 == 6) {
			this.anInt6261 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		Static277.method4028();
	}
}
