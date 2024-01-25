import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class245 implements Interface11 {

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Lclient!lr;")
	private final Class16_Sub2 aClass16_Sub2_10;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	public final int anInt7815;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
	public final int[] anIntArray419;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
	public final int anInt7810;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!ufa;")
	private Class341 aClass341_1;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "[F")
	public float[] aFloatArray70;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!lr;Lclient!hu;Lclient!ufa;)V")
	public Class245(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class341 arg2) {
		this.aClass16_Sub2_10 = arg0;
		if (arg1 instanceof Class21_Sub2_Sub2) {
			@Pc(12) Class21_Sub2_Sub2 local12 = (Class21_Sub2_Sub2) arg1;
			this.anInt7815 = local12.anInt5460;
			this.anIntArray419 = local12.anIntArray287;
			this.anInt7810 = local12.anInt5459;
		} else if (arg1 instanceof Class21_Sub2_Sub1) {
			@Pc(32) Class21_Sub2_Sub1 local32 = (Class21_Sub2_Sub1) arg1;
			this.anInt7810 = local32.anInt5459;
			this.anIntArray419 = local32.anIntArray86;
			this.anInt7815 = local32.anInt5460;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass341_1 = arg2;
			if (this.anInt7815 != this.aClass341_1.anInt9815 || this.anInt7810 != this.aClass341_1.anInt9819) {
				throw new RuntimeException();
			}
			this.aFloatArray70 = this.aClass341_1.aFloatArray75;
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static291.method4860(this.anInt7815, arg3, arg0, arg1, this.anIntArray419, arg4, arg5, this.aClass16_Sub2_10.aClass8_Sub10_1.anInt4339, this.aClass16_Sub2_10.aClass8_Sub10_1.anIntArray237, this.aFloatArray70, this.aClass16_Sub2_10.aFloatArray59, arg2);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static291.method4860(this.aClass16_Sub2_10.aClass8_Sub10_1.anInt4339, arg3, arg0, arg1, arg4 ? this.aClass16_Sub2_10.aClass8_Sub10_1.anIntArray237 : null, 0, 0, this.anInt7815, this.anIntArray419, this.aClass16_Sub2_10.aFloatArray59, this.aFloatArray70, arg2);
	}
}
