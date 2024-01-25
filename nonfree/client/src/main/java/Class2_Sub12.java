import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!nja", name = "n", descriptor = "[F")
	public static final float[] aFloatArray49 = new float[16384];

	@OriginalMember(owner = "client!nja", name = "k", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray49[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray48[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub12(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return super.aClass5_Sub36_31.method5346().method8629() ? 3 : 2;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.anInt10576 < 1 || super.anInt10576 > 3) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "(B)I")
	public int method5866() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}
}
