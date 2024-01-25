import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class162 implements Interface20 {

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Lclient!iw;")
	private final Class100_Sub2 aClass100_Sub2_9;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "[I")
	public final int[] anIntArray301;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public final int anInt5204;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public final int anInt5207;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!qb;")
	private Class266 aClass266_1;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[F")
	public float[] aFloatArray47;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!iw;Lclient!pga;Lclient!qb;)V")
	public Class162(@OriginalArg(0) Class100_Sub2 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class266 arg2) {
		this.aClass100_Sub2_9 = arg0;
		if (arg1 instanceof Class32_Sub2_Sub2) {
			@Pc(34) Class32_Sub2_Sub2 local34 = (Class32_Sub2_Sub2) arg1;
			this.anInt5204 = local34.anInt4902;
			this.anInt5207 = local34.anInt4895;
			this.anIntArray301 = local34.anIntArray176;
		} else if (arg1 instanceof Class32_Sub2_Sub3) {
			@Pc(17) Class32_Sub2_Sub3 local17 = (Class32_Sub2_Sub3) arg1;
			this.anIntArray301 = local17.anIntArray284;
			this.anInt5204 = local17.anInt4902;
			this.anInt5207 = local17.anInt4895;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass266_1 = arg2;
			if (this.anInt5204 != this.aClass266_1.anInt8049 || this.aClass266_1.anInt8048 != this.anInt5207) {
				throw new RuntimeException();
			}
			this.aFloatArray47 = this.aClass266_1.aFloatArray72;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static375.method5913(this.anInt5204, arg3, this.anIntArray301, this.aClass100_Sub2_9.aClass6_Sub27_1.anIntArray481, this.aClass100_Sub2_9.aClass6_Sub27_1.anInt7917, arg4, arg5, this.aFloatArray47, this.aClass100_Sub2_9.aFloatArray46, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static375.method5913(this.aClass100_Sub2_9.aClass6_Sub27_1.anInt7917, arg3, arg4 ? this.aClass100_Sub2_9.aClass6_Sub27_1.anIntArray481 : null, this.anIntArray301, this.anInt5204, 0, 0, this.aClass100_Sub2_9.aFloatArray46, this.aFloatArray47, arg2, arg0, arg1);
	}
}
