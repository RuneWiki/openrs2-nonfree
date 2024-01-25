import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
	private int anInt2042 = 0;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
	private int anInt2045 = 4096;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2042 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt2045 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int[] local26 = this.method6139(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2687; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt2042 <= local34 && local34 <= this.anInt2045 ? 4096 : 0;
			}
		}
		return local16;
	}
}
