import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class5_Sub6_Sub11 extends Class5_Sub6 {

	@OriginalMember(owner = "client!eja", name = "A", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!eja", name = "C", descriptor = "I")
	private int anInt2249;

	@OriginalMember(owner = "client!eja", name = "D", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub11() {
		this(0);
	}

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(I)V")
	private Class5_Sub6_Sub11(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2035(arg0);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2035(arg0.method3633());
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)V")
	private void method2035(@OriginalArg(1) int arg0) {
		this.anInt2249 = (arg0 & 0xFF) << 4;
		this.anInt2250 = arg0 >> 4 & 0xFF0;
		this.anInt2247 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static421.anInt7443; local34++) {
				local24[local34] = this.anInt2247;
				local28[local34] = this.anInt2250;
				local32[local34] = this.anInt2249;
			}
		}
		return local11;
	}
}
