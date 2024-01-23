import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
	private int anInt2131 = 4096;

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
	private int anInt2137 = 4096;

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
	private int anInt2141 = 4096;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(28) int[][] local28 = this.method3501(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(52) int[] local52 = local16[0];
			for (@Pc(54) int local54 = 0; local54 < Static105.anInt2391; local54++) {
				@Pc(60) int local60 = local40[local54];
				@Pc(64) int local64 = local32[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local60 == local68) {
					local52[local54] = this.anInt2131 * local64 >> 12;
					local44[local54] = this.anInt2137 * local60 >> 12;
					local48[local54] = this.anInt2141 * local68 >> 12;
				} else {
					local52[local54] = this.anInt2131;
					local44[local54] = this.anInt2137;
					local48[local54] = this.anInt2141;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2131 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt2137 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt2141 = arg0.method946();
		}
	}
}
