import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class4_Sub6_Sub32 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
	private int anInt4846 = 2048;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
	private int anInt4844 = 1024;

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	private int anInt4853 = 3072;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(26) int[] local26 = this.method4372(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static2.anInt19; local28++) {
				local16[local28] = this.anInt4844 + (this.anInt4846 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4844 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt4853 = arg0.method1837();
		} else if (arg1 == 2) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(28) int[][] local28 = this.method4377(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local18[0];
			@Pc(44) int[] local44 = local18[1];
			@Pc(48) int[] local48 = local18[2];
			@Pc(52) int[] local52 = local28[2];
			for (@Pc(54) int local54 = 0; local54 < Static2.anInt19; local54++) {
				local40[local54] = this.anInt4844 + (local32[local54] * this.anInt4846 >> 12);
				local44[local54] = this.anInt4844 + (this.anInt4846 * local36[local54] >> 12);
				local48[local54] = this.anInt4844 + (local52[local54] * this.anInt4846 >> 12);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.anInt4846 = this.anInt4853 - this.anInt4844;
	}
}
