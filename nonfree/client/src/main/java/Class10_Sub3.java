import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!via", name = "x", descriptor = "[F")
	public static final float[] aFloatArray78 = new float[16384];

	@OriginalMember(owner = "client!via", name = "y", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[16384];

	static {
		@Pc(16) double local16 = 3.834951969714103E-4D;
		for (@Pc(18) int local18 = 0; local18 < 16384; local18++) {
			aFloatArray79[local18] = (float) Math.sin(local16 * (double) local18);
			aFloatArray78[local18] = (float) Math.cos(local16 * (double) local18);
		}
	}

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!dw;)V")
	public Class10_Sub3(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class6_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static323.aClass5_9.method7506(arg0 - 2, arg1, super.aClass6_5.anInt2440 + 4, super.aClass6_5.anInt2436 + 2, ((Class6_Sub3) super.aClass6_5).anInt2447, 0);
		Static323.aClass5_9.method7506(arg0 - 1, arg1 + 1, super.aClass6_5.anInt2440 + 2, super.aClass6_5.anInt2436, 0, 0);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method8401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.method8402() * super.aClass6_5.anInt2440 / 10000;
		Static323.aClass5_9.aa(arg1, arg0 + 2, local18, super.aClass6_5.anInt2436 - 2, ((Class6_Sub3) super.aClass6_5).anInt2449, 0);
		Static323.aClass5_9.aa(arg1 + local18, arg0 - -2, super.aClass6_5.anInt2440 - local18, super.aClass6_5.anInt2436 + -2, 0, 0);
	}
}
