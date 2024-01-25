import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class357 implements Interface18 {

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "Lclient!aha;")
	private final Class13_Sub1 aClass13_Sub1_10;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public final int anInt9907;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
	public final int anInt9906;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "[I")
	public final int[] anIntArray698;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Lclient!jt;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "[F")
	public float[] aFloatArray100;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!aha;Lclient!iea;Lclient!jt;)V")
	public Class357(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class190 arg2) {
		this.aClass13_Sub1_10 = arg0;
		if (arg1 instanceof Class31_Sub1_Sub3) {
			@Pc(10) Class31_Sub1_Sub3 local10 = (Class31_Sub1_Sub3) arg1;
			this.anInt9907 = local10.anInt10364;
			this.anInt9906 = local10.anInt10343;
			this.anIntArray698 = local10.anIntArray733;
		} else if (arg1 instanceof Class31_Sub1_Sub1) {
			@Pc(34) Class31_Sub1_Sub1 local34 = (Class31_Sub1_Sub1) arg1;
			this.anInt9906 = local34.anInt10343;
			this.anInt9907 = local34.anInt10364;
			this.anIntArray698 = local34.anIntArray58;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass190_1 = arg2;
			if (this.aClass190_1.anInt5109 != this.anInt9907 || this.aClass190_1.anInt5111 != this.anInt9906) {
				throw new RuntimeException();
			}
			this.aFloatArray100 = this.aClass190_1.aFloatArray39;
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static612.method7247(this.aClass13_Sub1_10.aFloatArray1, arg4 ? this.aClass13_Sub1_10.aClass2_Sub26_1.anIntArray741 : null, this.aClass13_Sub1_10.aClass2_Sub26_1.anInt10486, this.aFloatArray100, this.anIntArray698, arg2, 0, this.anInt9907, arg3, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static612.method7247(this.aFloatArray100, this.anIntArray698, this.anInt9907, this.aClass13_Sub1_10.aFloatArray1, this.aClass13_Sub1_10.aClass2_Sub26_1.anIntArray741, arg2, arg4, this.aClass13_Sub1_10.aClass2_Sub26_1.anInt10486, arg3, arg0, arg1, arg5);
	}
}
