import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
	private int anInt7413 = 8192;

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
	private int anInt7408 = 0;

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
	private int anInt7418 = 4096;

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
	private int anInt7419 = 0;

	@OriginalMember(owner = "client!wu", name = "U", descriptor = "I")
	private int anInt7422 = 2048;

	@OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
	private int anInt7420 = 12288;

	@OriginalMember(owner = "client!wu", name = "V", descriptor = "I")
	private int anInt7423 = 2048;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(III)Z")
	private boolean method5970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 + arg0) * this.anInt7420 >> 12;
		@Pc(23) int local23 = Static117.anIntArray157[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt7420;
		@Pc(42) int local42 = (local35 << 12) / this.anInt7413;
		@Pc(49) int local49 = local42 * this.anInt7418 >> 12;
		return arg1 - arg0 < local49 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(III)Z")
	private boolean method5971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt7420 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static117.anIntArray157[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt7420;
		@Pc(45) int local45 = (local38 << 12) / this.anInt7413;
		@Pc(52) int local52 = local45 * this.anInt7418 >> 12;
		return arg0 + arg1 < local52 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7423 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt7419 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt7408 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt7422 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt7420 = arg0.method2896();
		} else if (arg1 == 5) {
			this.anInt7418 = arg0.method2896();
		} else if (arg1 == 6) {
			this.anInt7413 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		Static1.method20();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(21) int local21 = Static258.anIntArray335[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static218.anInt3990; local23++) {
				@Pc(31) int local31 = Static434.anIntArray495[local23] - 2048;
				@Pc(36) int local36 = this.anInt7423 + local31;
				@Pc(47) int local47 = local36 < -2048 ? local36 + 4096 : local36;
				@Pc(58) int local58 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(63) int local63 = this.anInt7419 + local21;
				@Pc(74) int local74 = local63 < -2048 ? local63 + 4096 : local63;
				@Pc(85) int local85 = local74 <= 2048 ? local74 : local74 - 4096;
				@Pc(90) int local90 = this.anInt7408 + local31;
				@Pc(99) int local99 = local90 >= -2048 ? local90 : local90 + 4096;
				@Pc(110) int local110 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(115) int local115 = this.anInt7422 + local21;
				@Pc(124) int local124 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local23] = this.method5971(local85, local58) || this.method5970(local110, local135) ? 4096 : 0;
			}
		}
		return local11;
	}
}
