import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class7_Sub4_Sub34 extends Class7_Sub4 {

	@OriginalMember(owner = "client!un", name = "I", descriptor = "I")
	private int anInt6163 = 1;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	private int anInt6166 = 1;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	private int anInt6164 = 204;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6163 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt6166 = arg0.method2772();
		} else if (arg1 == 2) {
			this.anInt6164 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			for (@Pc(25) int local25 = 0; local25 < Static201.anInt4174; local25++) {
				@Pc(31) int local31 = Static129.anIntArray375[local25];
				@Pc(35) int local35 = Static314.anIntArray756[arg0];
				@Pc(42) int local42 = local31 * this.anInt6163 >> 12;
				@Pc(49) int local49 = local35 * this.anInt6166 >> 12;
				@Pc(59) int local59 = this.anInt6163 * (local31 % (4096 / this.anInt6163));
				@Pc(69) int local69 = local35 % (4096 / this.anInt6166) * this.anInt6166;
				if (local69 < this.anInt6164) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt6164 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt6164 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}
}
