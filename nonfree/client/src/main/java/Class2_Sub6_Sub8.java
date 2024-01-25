import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class2_Sub6_Sub8 extends Class2_Sub6 {

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
	private int anInt2028 = 4096;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2028 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(27) int[] local27 = this.method5635(Static71.anInt1349 & arg0 - 1, 0);
			@Pc(33) int[] local33 = this.method5635(arg0, 0);
			@Pc(43) int[] local43 = this.method5635(Static71.anInt1349 & arg0 + 1, 0);
			for (@Pc(45) int local45 = 0; local45 < Static151.anInt2711; local45++) {
				@Pc(58) int local58 = (local43[local45] - local27[local45]) * this.anInt2028;
				@Pc(78) int local78 = this.anInt2028 * (local33[local45 + 1 & Static274.anInt1078] - local33[local45 - 1 & Static274.anInt1078]);
				@Pc(82) int local82 = local78 >> 12;
				@Pc(86) int local86 = local58 >> 12;
				@Pc(92) int local92 = local82 * local82 >> 12;
				@Pc(98) int local98 = local86 * local86 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((float) (local98 + local92 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local112 == 0 ? 0 : 16777216 / local112;
				local11[local45] = 4096 - local123;
			}
		}
		return local11;
	}
}
