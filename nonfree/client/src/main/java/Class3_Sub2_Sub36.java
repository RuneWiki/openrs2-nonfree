import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	private int anInt6867;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	private int anInt6870;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	private int anInt6872;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5366(arg0);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
	private void method5366(@OriginalArg(0) int arg0) {
		this.anInt6872 = arg0 >> 4 & 0xFF0;
		this.anInt6870 = (arg0 & 0xFF) << 4;
		this.anInt6867 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static406.anInt6694; local34++) {
				local24[local34] = this.anInt6867;
				local28[local34] = this.anInt6872;
				local32[local34] = this.anInt6870;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5366(arg0.method2604());
		}
	}
}
