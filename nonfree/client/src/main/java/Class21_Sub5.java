import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class21_Sub5 extends Class21 {

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[16384];

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray17[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray16[local11] = (float) Math.cos((double) local11 * local9);
		}
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub5(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.anInt11183 != 1 && super.anInt11183 != 0) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I")
	public int method1912() {
		return super.anInt11183;
	}
}
