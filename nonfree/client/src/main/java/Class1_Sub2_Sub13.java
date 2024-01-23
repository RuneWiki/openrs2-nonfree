import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	private int anInt2444 = 4096;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "I")
	private int anInt2446 = 4096;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	private int anInt2448 = 4096;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2444 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt2446 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt2448 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(28) int[][] local28 = this.method4575(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static299.anInt5670; local54++) {
				@Pc(61) int local61 = local32[local54];
				@Pc(65) int local65 = local40[local54];
				@Pc(69) int local69 = local36[local54];
				if (local65 == local61 && local65 == local69) {
					local44[local54] = local61 * this.anInt2444 >> 12;
					local48[local54] = local65 * this.anInt2446 >> 12;
					local52[local54] = local69 * this.anInt2448 >> 12;
				} else {
					local44[local54] = this.anInt2444;
					local48[local54] = this.anInt2446;
					local52[local54] = this.anInt2448;
				}
			}
		}
		return local16;
	}
}
