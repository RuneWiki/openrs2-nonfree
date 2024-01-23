import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!j", name = "W", descriptor = "I")
	private int anInt2768 = 4096;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(32) int[] local32 = this.method4746(0, Static178.anInt4007 & arg0 - 1);
			@Pc(38) int[] local38 = this.method4746(0, arg0);
			@Pc(48) int[] local48 = this.method4746(0, Static178.anInt4007 & arg0 + 1);
			for (@Pc(50) int local50 = 0; local50 < Static75.anInt1848; local50++) {
				@Pc(68) int local68 = this.anInt2768 * (local48[local50] - local32[local50]);
				@Pc(88) int local88 = (local38[local50 + 1 & Static145.anInt3482] - local38[Static145.anInt3482 & local50 - 1]) * this.anInt2768;
				@Pc(92) int local92 = local88 >> 12;
				@Pc(98) int local98 = local92 * local92 >> 12;
				@Pc(102) int local102 = local68 >> 12;
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local98 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133 = local122 == 0 ? 0 : 16777216 / local122;
				local18[local50] = 4096 - local133;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2768 = arg0.method2652();
		}
	}
}
