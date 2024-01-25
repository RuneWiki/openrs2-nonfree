import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class33_Sub27 extends Class33 {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "[F")
	public static final float[] aFloatArray106 = new float[16384];

	@OriginalMember(owner = "client!w", name = "l", descriptor = "[F")
	public static final float[] aFloatArray107 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray107[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray106[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub27(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)I")
	public int method8670() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		super.anInt10227 = this.method8709();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return super.aClass2_Sub49_31.method8851() == Static579.aClass17_5 && super.aClass2_Sub49_31.method8847() ? 0 : 1;
	}
}
