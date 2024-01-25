import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!paa", name = "P", descriptor = "I")
	private int anInt6542 = 1;

	@OriginalMember(owner = "client!paa", name = "U", descriptor = "I")
	private int anInt6546 = 0;

	@OriginalMember(owner = "client!paa", name = "X", descriptor = "I")
	private int anInt6547 = 0;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		Static371.method5980();
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(28) int local28 = Static392.anIntArray673[arg0];
			@Pc(34) int local34 = local28 - 2048 >> 1;
			for (@Pc(36) int local36 = 0; local36 < Static254.anInt4973; local36++) {
				@Pc(42) int local42 = Static457.anIntArray732[local36];
				@Pc(48) int local48 = local42 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt6546 == 0) {
					local58 = (local42 - local28) * this.anInt6542;
				} else {
					@Pc(70) int local70 = local34 * local34 + local48 * local48 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt6542 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt6547 == 0) {
					local58 = Static494.anIntArray759[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6547 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local11[local36] = local58;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt6546 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt6547 = arg1.method4487();
		} else if (arg0 == 3) {
			this.anInt6542 = arg1.method4487();
		}
	}
}
