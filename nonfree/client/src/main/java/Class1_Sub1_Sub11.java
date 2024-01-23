import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
	private int anInt2308;

	@OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
	private int anInt2309;

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
	private int anInt2311;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		this(0);
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub11(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1748(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	private void method1748(@OriginalArg(1) int arg0) {
		this.anInt2308 = (arg0 & 0xFF) << 4;
		this.anInt2309 = arg0 >> 4 & 0xFF0;
		this.anInt2311 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(28) int[] local28 = local19[0];
			@Pc(32) int[] local32 = local19[1];
			@Pc(36) int[] local36 = local19[2];
			for (@Pc(38) int local38 = 0; local38 < Static75.anInt1848; local38++) {
				local28[local38] = this.anInt2311;
				local32[local38] = this.anInt2309;
				local36[local38] = this.anInt2308;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1748(arg0.method2634());
		}
	}
}
