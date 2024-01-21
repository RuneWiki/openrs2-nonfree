import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
	private int anInt1459;

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
	private int anInt1464;

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		Static142.method2472();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(19) int local19 = Static37.anIntArray125[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static110.anInt2825; local27++) {
				@Pc(33) int local33 = Static86.anIntArray294[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt1465 == 0) {
					local53 = (local33 - local19) * this.anInt1459;
				} else {
					@Pc(66) int local66 = local39 * local39 + local25 * local25 >> 12;
					local53 = (int) (Math.sqrt((double) (local66 / 4096)) * 4096.0D);
					local53 = (int) ((double) (local53 * this.anInt1459) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt1464 == 0) {
					local53 = Static44.anIntArray145[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1464 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local11[local27] = local53;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1465 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt1464 = arg0.method861();
		} else if (arg1 == 3) {
			this.anInt1459 = arg0.method861();
		}
	}
}
