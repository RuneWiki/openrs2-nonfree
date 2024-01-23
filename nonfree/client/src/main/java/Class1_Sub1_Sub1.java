import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
	private int anInt72;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method57(arg0);
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		this(0);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(26) int[] local26 = local13[1];
			@Pc(30) int[] local30 = local13[0];
			@Pc(34) int[] local34 = local13[2];
			for (@Pc(36) int local36 = 0; local36 < Static11.anInt294; local36++) {
				local30[local36] = this.anInt71;
				local26[local36] = this.anInt64;
				local34[local36] = this.anInt72;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method57(arg0.method2937());
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V")
	private void method57(@OriginalArg(0) int arg0) {
		this.anInt64 = arg0 >> 4 & 0xFF0;
		this.anInt72 = (arg0 & 0xFF) << 4;
		this.anInt71 = arg0 >> 12 & 0xFF0;
	}
}
