import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
	private int anInt4147;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
	private int anInt4151;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3169(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(24) int[] local24 = local11[1];
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static135.anInt2897; local34++) {
				local28[local34] = this.anInt4151;
				local24[local34] = this.anInt4153;
				local32[local34] = this.anInt4147;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	private void method3169(@OriginalArg(0) int arg0) {
		this.anInt4147 = (arg0 & 0xFF) << 4;
		this.anInt4153 = arg0 >> 4 & 0xFF0;
		this.anInt4151 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method3169(arg0.method261());
		}
	}
}
