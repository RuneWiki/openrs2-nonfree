import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
	private int anInt6640 = 12288;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
	private int anInt6637 = 8192;

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
	private int anInt6644 = 4096;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
	private int anInt6638 = 2048;

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
	private int anInt6647 = 0;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	private int anInt6648 = 2048;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
	private int anInt6639 = 0;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)Z")
	private boolean method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = (arg0 - arg1) * this.anInt6640 >> 12;
		@Pc(30) int local30 = Static90.anIntArray171[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt6640;
		@Pc(44) int local44 = (local37 << 12) / this.anInt6637;
		@Pc(51) int local51 = this.anInt6644 * local44 >> 12;
		return local51 > arg1 + arg0 && arg1 + arg0 > -local51;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(26) int local26 = Static318.anIntArray565[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static429.anInt6518; local28++) {
				@Pc(36) int local36 = Static365.anIntArray535[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt6648;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = this.anInt6647 + local26;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(92) int local92 = this.anInt6639 + local36;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(117) int local117 = this.anInt6638 + local26;
				@Pc(128) int local128 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local16[local28] = this.method5258(local87, local62) || this.method5261(local112, local139) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)Z")
	private boolean method5261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt6640 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static90.anIntArray171[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt6640;
		@Pc(41) int local41 = (local34 << 12) / this.anInt6637;
		@Pc(48) int local48 = local41 * this.anInt6644 >> 12;
		return arg1 - arg0 < local48 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6648 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt6647 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt6639 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt6638 = arg0.method5500();
		} else if (arg1 == 4) {
			this.anInt6640 = arg0.method5500();
		} else if (arg1 == 5) {
			this.anInt6644 = arg0.method5500();
		} else if (arg1 == 6) {
			this.anInt6637 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		Static180.method2885();
	}
}
