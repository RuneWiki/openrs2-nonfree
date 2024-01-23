import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private int anInt2976 = 20;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	private int anInt2978 = 0;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
	private int anInt2979 = 1365;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
	private int anInt2983 = 0;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2979 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt2976 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt2978 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt2983 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			for (@Pc(23) int local23 = 0; local23 < Static227.anInt4511; local23++) {
				@Pc(39) int local39 = (Static209.anIntArray377[local23] << 12) / this.anInt2979 + this.anInt2978;
				@Pc(41) int local41 = local39;
				@Pc(56) int local56 = (Static132.anIntArray265[arg0] << 12) / this.anInt2979 + this.anInt2983;
				@Pc(58) int local58 = local56;
				@Pc(64) int local64 = local39 * local39 >> 12;
				@Pc(70) int local70 = local56 * local56 >> 12;
				@Pc(74) int local74;
				for (local74 = 0; local64 + local70 < 16384 && this.anInt2976 > local74; local74++) {
					local58 = (local41 * local58 >> 12) * 2 + local56;
					local41 = local39 + local64 - local70;
					local64 = local41 * local41 >> 12;
					local70 = local58 * local58 >> 12;
				}
				local17[local23] = local74 >= this.anInt2976 - 1 ? 0 : (local74 << 12) / this.anInt2976;
			}
		}
		return local17;
	}
}
