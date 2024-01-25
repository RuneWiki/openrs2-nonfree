import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class371 implements Interface4 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!ii;")
	private final Class95_Sub2 aClass95_Sub2_12;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
	public final int[] anIntArray681;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public final int anInt9956;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public final int anInt9965;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!st;")
	private Class324 aClass324_1;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[F")
	public float[] aFloatArray83;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ii;Lclient!cw;Lclient!st;)V")
	public Class371(@OriginalArg(0) Class95_Sub2 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class324 arg2) {
		this.aClass95_Sub2_12 = arg0;
		if (arg1 instanceof Class61_Sub1_Sub2) {
			@Pc(34) Class61_Sub1_Sub2 local34 = (Class61_Sub1_Sub2) arg1;
			this.anInt9956 = local34.anInt7645;
			this.anIntArray681 = local34.anIntArray202;
			this.anInt9965 = local34.anInt7636;
		} else if (arg1 instanceof Class61_Sub1_Sub1) {
			@Pc(13) Class61_Sub1_Sub1 local13 = (Class61_Sub1_Sub1) arg1;
			this.anIntArray681 = local13.anIntArray129;
			this.anInt9956 = local13.anInt7645;
			this.anInt9965 = local13.anInt7636;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass324_1 = arg2;
			if (this.aClass324_1.anInt8747 != this.anInt9956 || this.aClass324_1.anInt8745 != this.anInt9965) {
				throw new RuntimeException();
			}
			this.aFloatArray83 = this.aClass324_1.aFloatArray77;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static265.method3735(this.anInt9956, arg5, this.aClass95_Sub2_12.aClass2_Sub26_1.anIntArray482, arg2, this.aClass95_Sub2_12.aClass2_Sub26_1.anInt6571, arg3, this.aClass95_Sub2_12.aFloatArray18, arg0, this.anIntArray681, this.aFloatArray83, arg1, arg4);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static265.method3735(this.aClass95_Sub2_12.aClass2_Sub26_1.anInt6571, 0, this.anIntArray681, arg2, this.anInt9956, arg3, this.aFloatArray83, arg0, arg4 ? this.aClass95_Sub2_12.aClass2_Sub26_1.anIntArray482 : null, this.aClass95_Sub2_12.aFloatArray18, arg1, 0);
	}
}
