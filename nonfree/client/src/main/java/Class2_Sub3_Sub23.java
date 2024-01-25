import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	private int anInt4990 = 0;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "I")
	private int anInt4989 = 20;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "I")
	private int anInt4991 = 1365;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt4992 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			for (@Pc(19) int local19 = 0; local19 < Static263.anInt5504; local19++) {
				@Pc(33) int local33 = this.anInt4990 + (Static269.anIntArray507[local19] << 12) / this.anInt4991;
				@Pc(45) int local45 = (Static76.anIntArray121[arg0] << 12) / this.anInt4991 + this.anInt4992;
				@Pc(51) int local51 = local33;
				@Pc(53) int local53 = local45;
				@Pc(59) int local59 = local33 * local33 >> 12;
				@Pc(65) int local65 = local45 * local45 >> 12;
				@Pc(67) int local67 = 0;
				while (local65 + local59 < 16384 && this.anInt4989 > local67) {
					local53 = (local51 * local53 >> 12) * 2 + local45;
					local51 = local33 + local59 - local65;
					local67++;
					local65 = local53 * local53 >> 12;
					local59 = local51 * local51 >> 12;
				}
				local13[local19] = local67 < this.anInt4989 - 1 ? (local67 << 12) / this.anInt4989 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4991 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt4989 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt4990 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt4992 = arg1.method3104();
		}
	}
}
