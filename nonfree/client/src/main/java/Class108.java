import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class108 implements Interface16 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!pga;")
	private final Class133_Sub2 aClass133_Sub2_5;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "[I")
	public final int[] anIntArray155;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public final int anInt2626;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!jba;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "[F")
	public float[] aFloatArray2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!pga;Lclient!it;Lclient!jba;)V")
	public Class108(@OriginalArg(0) Class133_Sub2 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass133_Sub2_5 = arg0;
		if (arg1 instanceof Class28_Sub1_Sub1) {
			@Pc(34) Class28_Sub1_Sub1 local34 = (Class28_Sub1_Sub1) arg1;
			this.anIntArray155 = local34.anIntArray32;
			this.anInt2625 = local34.anInt4215;
			this.anInt2626 = local34.anInt4228;
		} else if (arg1 instanceof Class28_Sub1_Sub2) {
			@Pc(13) Class28_Sub1_Sub2 local13 = (Class28_Sub1_Sub2) arg1;
			this.anInt2625 = local13.anInt4215;
			this.anIntArray155 = local13.anIntArray213;
			this.anInt2626 = local13.anInt4228;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass171_1 = arg2;
			if (this.anInt2625 != this.aClass171_1.anInt4499 || this.anInt2626 != this.aClass171_1.anInt4497) {
				throw new RuntimeException();
			}
			this.aFloatArray2 = this.aClass171_1.aFloatArray29;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static480.method7088(this.anIntArray155, arg1, this.aClass133_Sub2_5.aFloatArray60, arg3, this.aFloatArray2, arg5, arg4, arg2, this.aClass133_Sub2_5.aClass5_Sub24_1.anInt4055, this.aClass133_Sub2_5.aClass5_Sub24_1.anIntArray204, this.anInt2625, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static480.method7088(arg4 ? this.aClass133_Sub2_5.aClass5_Sub24_1.anIntArray204 : null, arg1, this.aFloatArray2, arg3, this.aClass133_Sub2_5.aFloatArray60, 0, 0, arg2, this.anInt2625, this.anIntArray155, this.aClass133_Sub2_5.aClass5_Sub24_1.anInt4055, arg0);
	}
}
