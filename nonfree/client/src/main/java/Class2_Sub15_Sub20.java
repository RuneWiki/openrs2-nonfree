import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class2_Sub15_Sub20 extends Class2_Sub15 {

	@OriginalMember(owner = "client!np", name = "N", descriptor = "I")
	private int anInt7628 = 0;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "I")
	private int anInt7627 = 1365;

	@OriginalMember(owner = "client!np", name = "O", descriptor = "I")
	private int anInt7629 = 20;

	@OriginalMember(owner = "client!np", name = "P", descriptor = "I")
	private int anInt7630 = 0;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			for (@Pc(22) int local22 = 0; local22 < Static329.anInt6017; local22++) {
				@Pc(36) int local36 = this.anInt7630 + (Static537.anIntArray480[local22] << 12) / this.anInt7627;
				@Pc(48) int local48 = this.anInt7628 + (Static401.anIntArray357[arg0] << 12) / this.anInt7627;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && this.anInt7629 > local70) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = local70 >= this.anInt7629 - 1 ? 0 : (local70 << 12) / this.anInt7629;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7627 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt7629 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt7630 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt7628 = arg1.method5211();
		}
	}
}
