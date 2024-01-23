import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
	private int anInt3609 = 0;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	private int anInt3611 = 1365;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
	private int anInt3613 = 20;

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
	private int anInt3616 = 0;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			for (@Pc(24) int local24 = 0; local24 < Static75.anInt1848; local24++) {
				@Pc(44) int local44 = (Static157.anIntArray331[local24] << 12) / this.anInt3611 + this.anInt3609;
				@Pc(56) int local56 = (Static98.anIntArray221[arg0] << 12) / this.anInt3611 + this.anInt3616;
				@Pc(62) int local62 = local44;
				@Pc(64) int local64 = local56;
				@Pc(70) int local70 = local44 * local44 >> 12;
				@Pc(76) int local76 = local56 * local56 >> 12;
				@Pc(78) int local78 = 0;
				while (local70 + local76 < 16384 && local78 < this.anInt3613) {
					local64 = (local64 * local62 >> 12) * 2 + local56;
					local62 = local44 + local70 - local76;
					local78++;
					local70 = local62 * local62 >> 12;
					local76 = local64 * local64 >> 12;
				}
				local11[local24] = local78 < this.anInt3613 - 1 ? (local78 << 12) / this.anInt3613 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3611 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt3613 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt3609 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt3616 = arg0.method2652();
		}
	}
}
