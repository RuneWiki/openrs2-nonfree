import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tga", name = "L", descriptor = "I")
	private int anInt9720 = 0;

	@OriginalMember(owner = "client!tga", name = "M", descriptor = "I")
	private int anInt9721 = 0;

	@OriginalMember(owner = "client!tga", name = "N", descriptor = "I")
	private int anInt9722 = 1365;

	@OriginalMember(owner = "client!tga", name = "Q", descriptor = "I")
	private int anInt9724 = 20;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9722 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt9724 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt9721 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt9720 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			for (@Pc(22) int local22 = 0; local22 < Static222.anInt4971; local22++) {
				@Pc(36) int local36 = this.anInt9721 + (Static464.anIntArray556[local22] << 12) / this.anInt9722;
				@Pc(48) int local48 = this.anInt9720 + (Static547.anIntArray641[arg0] << 12) / this.anInt9722;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && local70 < this.anInt9724) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local36 + local62 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = this.anInt9724 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt9724;
			}
		}
		return local11;
	}
}
