import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class123 implements Interface16 {

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Lclient!nia;")
	private final Class132_Sub2 aClass132_Sub2_4;

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
	public final int anInt3183;

	@OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
	public final int anInt3187;

	@OriginalMember(owner = "client!gja", name = "h", descriptor = "[I")
	public final int[] anIntArray179;

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "Lclient!bs;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!gja", name = "i", descriptor = "[F")
	public float[] aFloatArray8;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!nia;Lclient!ho;Lclient!bs;)V")
	public Class123(@OriginalArg(0) Class132_Sub2 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class42 arg2) {
		this.aClass132_Sub2_4 = arg0;
		if (arg1 instanceof Class9_Sub1_Sub1) {
			@Pc(10) Class9_Sub1_Sub1 local10 = (Class9_Sub1_Sub1) arg1;
			this.anInt3183 = local10.anInt10540;
			this.anInt3187 = local10.anInt10519;
			this.anIntArray179 = local10.anIntArray7;
		} else if (arg1 instanceof Class9_Sub1_Sub2) {
			@Pc(34) Class9_Sub1_Sub2 local34 = (Class9_Sub1_Sub2) arg1;
			this.anInt3183 = local34.anInt10540;
			this.anIntArray179 = local34.anIntArray506;
			this.anInt3187 = local34.anInt10519;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass42_1 = arg2;
			if (this.anInt3183 != this.aClass42_1.anInt1136 || this.anInt3187 != this.aClass42_1.anInt1134) {
				throw new RuntimeException();
			}
			this.aFloatArray8 = this.aClass42_1.aFloatArray3;
		}
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static573.method4495(arg4 ? this.aClass132_Sub2_4.aClass6_Sub18_1.anIntArray278 : null, this.anInt3183, 0, this.aClass132_Sub2_4.aFloatArray27, arg3, this.aClass132_Sub2_4.aClass6_Sub18_1.anInt4857, arg0, 0, arg2, this.aFloatArray8, this.anIntArray179, arg1);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static573.method4495(this.anIntArray179, this.aClass132_Sub2_4.aClass6_Sub18_1.anInt4857, arg4, this.aFloatArray8, arg3, this.anInt3183, arg0, arg5, arg2, this.aClass132_Sub2_4.aFloatArray27, this.aClass132_Sub2_4.aClass6_Sub18_1.anIntArray278, arg1);
	}
}
