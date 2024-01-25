import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class207 implements Interface16 {

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "Lclient!gf;")
	private final Class126_Sub1 aClass126_Sub1_5;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	public final int anInt5538;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "[I")
	public final int[] anIntArray400;

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
	public final int anInt5542;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lclient!ve;")
	private Class354 aClass354_1;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "[F")
	public float[] aFloatArray30;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!gf;Lclient!hu;Lclient!ve;)V")
	public Class207(@OriginalArg(0) Class126_Sub1 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class354 arg2) {
		this.aClass126_Sub1_5 = arg0;
		if (arg1 instanceof Class44_Sub1_Sub1) {
			@Pc(34) Class44_Sub1_Sub1 local34 = (Class44_Sub1_Sub1) arg1;
			this.anInt5538 = local34.anInt6022;
			this.anIntArray400 = local34.anIntArray71;
			this.anInt5542 = local34.anInt6002;
		} else if (arg1 instanceof Class44_Sub1_Sub2) {
			@Pc(13) Class44_Sub1_Sub2 local13 = (Class44_Sub1_Sub2) arg1;
			this.anInt5538 = local13.anInt6022;
			this.anIntArray400 = local13.anIntArray77;
			this.anInt5542 = local13.anInt6002;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass354_1 = arg2;
			if (this.aClass354_1.anInt9769 != this.anInt5542 || this.aClass354_1.anInt9771 != this.anInt5538) {
				throw new RuntimeException();
			}
			this.aFloatArray30 = this.aClass354_1.aFloatArray73;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static561.method7889(this.aClass126_Sub1_5.aFloatArray9, arg2, this.aClass126_Sub1_5.aClass5_Sub1_1.anIntArray350, arg3, arg0, this.aFloatArray30, arg1, arg5, this.anInt5542, this.aClass126_Sub1_5.aClass5_Sub1_1.anInt4128, arg4, this.anIntArray400);
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static561.method7889(this.aFloatArray30, arg2, this.anIntArray400, arg3, arg0, this.aClass126_Sub1_5.aFloatArray9, arg1, 0, this.aClass126_Sub1_5.aClass5_Sub1_1.anInt4128, this.anInt5542, 0, arg4 ? this.aClass126_Sub1_5.aClass5_Sub1_1.anIntArray350 : null);
	}
}
