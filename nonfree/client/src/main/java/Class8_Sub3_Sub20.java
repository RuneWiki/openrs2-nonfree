import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class8_Sub3_Sub20 extends Class8_Sub3 {

	@OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
	private int anInt2551;

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
	private int anInt2558;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	private Class8_Sub3_Sub20(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2063(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub20() {
		this(0);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(24) int[] local24 = local9[0];
			@Pc(28) int[] local28 = local9[2];
			@Pc(32) int[] local32 = local9[1];
			for (@Pc(34) int local34 = 0; local34 < Static239.anInt4789; local34++) {
				local24[local34] = this.anInt2551;
				local32[local34] = this.anInt2558;
				local28[local34] = this.anInt2557;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.method2063(arg1.method2323());
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	private void method2063(@OriginalArg(1) int arg0) {
		this.anInt2551 = arg0 >> 12 & 0xFF0;
		this.anInt2558 = arg0 >> 4 & 0xFF0;
		this.anInt2557 = (arg0 & 0xFF) << 4;
	}
}
