import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
	private int anInt4035;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
	private int anInt4039;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3151(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method3151(arg0.method1271());
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)V")
	private void method3151(@OriginalArg(0) int arg0) {
		this.anInt4039 = arg0 >> 4 & 0xFF0;
		this.anInt4033 = (arg0 & 0xFF) << 4;
		this.anInt4035 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static190.anInt3865; local34++) {
				local24[local34] = this.anInt4035;
				local28[local34] = this.anInt4039;
				local32[local34] = this.anInt4033;
			}
		}
		return local11;
	}
}
