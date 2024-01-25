import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
	private int anInt4625 = 0;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	private int anInt4627 = 20;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
	private int anInt4624 = 0;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	private int anInt4635 = 1365;

	static {
		new Class189("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4635 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt4627 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt4625 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt4624 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			for (@Pc(22) int local22 = 0; local22 < Static406.anInt6694; local22++) {
				@Pc(36) int local36 = (Static86.anIntArray125[local22] << 12) / this.anInt4635 + this.anInt4625;
				@Pc(48) int local48 = this.anInt4624 + (Static441.anIntArray522[arg0] << 12) / this.anInt4635;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt4627 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local70++;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt4627 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt4627;
			}
		}
		return local16;
	}
}
