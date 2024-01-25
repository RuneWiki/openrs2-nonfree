import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class10_Sub2_Sub14 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
	private int anInt2558;

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub14() {
		this(0);
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V")
	private Class10_Sub2_Sub14(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2181(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.method2181(arg1.method2507());
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static121.anInt2458; local36++) {
				local26[local36] = this.anInt2557;
				local30[local36] = this.anInt2560;
				local34[local36] = this.anInt2558;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)V")
	private void method2181(@OriginalArg(1) int arg0) {
		this.anInt2560 = arg0 >> 4 & 0xFF0;
		this.anInt2558 = (arg0 & 0xFF) << 4;
		this.anInt2557 = arg0 >> 12 & 0xFF0;
	}
}
