import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class2_Sub6_Sub35 extends Class2_Sub6 {

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
	private int anInt9817 = 0;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
	private int anInt9826 = 1365;

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
	private int anInt9819 = 20;

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
	private int anInt9825 = 0;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			for (@Pc(22) int local22 = 0; local22 < Static51.anInt1085; local22++) {
				@Pc(36) int local36 = this.anInt9817 + (Static586.anIntArray653[local22] << 12) / this.anInt9826;
				@Pc(48) int local48 = (Static564.anIntArray630[arg0] << 12) / this.anInt9826 + this.anInt9825;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && local70 < this.anInt9819) {
					local56 = local48 + (local54 * local56 >> 12) * 2;
					local54 = local36 + local62 - local68;
					local70++;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt9819 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt9819;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt9826 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt9819 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt9817 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt9825 = arg1.method8546();
		}
	}
}
