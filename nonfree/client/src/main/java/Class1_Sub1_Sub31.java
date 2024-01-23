import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	private int anInt4915 = 4096;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	private int anInt4919 = 4096;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
	private int anInt4918 = 4096;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4915 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt4918 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt4919 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(28) int[][] local28 = this.method4456(arg0, 0);
			@Pc(32) int[] local32 = local28[2];
			@Pc(36) int[] local36 = local28[0];
			@Pc(40) int[] local40 = local18[0];
			@Pc(44) int[] local44 = local28[1];
			@Pc(48) int[] local48 = local18[2];
			@Pc(52) int[] local52 = local18[1];
			for (@Pc(54) int local54 = 0; local54 < Static6.anInt4960; local54++) {
				@Pc(61) int local61 = local36[local54];
				@Pc(65) int local65 = local32[local54];
				@Pc(69) int local69 = local44[local54];
				if (local61 == local65 && local69 == local65) {
					local40[local54] = local61 * this.anInt4915 >> 12;
					local52[local54] = this.anInt4918 * local65 >> 12;
					local48[local54] = local69 * this.anInt4919 >> 12;
				} else {
					local40[local54] = this.anInt4915;
					local52[local54] = this.anInt4918;
					local48[local54] = this.anInt4919;
				}
			}
		}
		return local18;
	}
}
