import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class267 implements Interface8 {

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Lclient!sa;")
	private final Class5_Sub3 aClass5_Sub3_9;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public final int anInt7951;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public final int anInt7949;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[I")
	public final int[] anIntArray492;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!qga;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[F")
	public float[] aFloatArray68;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!sa;Lclient!td;Lclient!qga;)V")
	public Class267(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class276 arg2) {
		this.aClass5_Sub3_9 = arg0;
		if (arg1 instanceof Class24_Sub1_Sub3) {
			@Pc(12) Class24_Sub1_Sub3 local12 = (Class24_Sub1_Sub3) arg1;
			this.anInt7951 = local12.anInt10002;
			this.anInt7949 = local12.anInt9995;
			this.anIntArray492 = local12.anIntArray652;
		} else if (arg1 instanceof Class24_Sub1_Sub1) {
			@Pc(32) Class24_Sub1_Sub1 local32 = (Class24_Sub1_Sub1) arg1;
			this.anInt7951 = local32.anInt10002;
			this.anInt7949 = local32.anInt9995;
			this.anIntArray492 = local32.anIntArray26;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass276_1 = arg2;
			if (this.aClass276_1.anInt8087 != this.anInt7949 || this.aClass276_1.anInt8089 != this.anInt7951) {
				throw new RuntimeException();
			}
			this.aFloatArray68 = this.aClass276_1.aFloatArray70;
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static584.method8244(arg3, 0, this.aClass5_Sub3_9.aFloatArray74, this.anIntArray492, this.aClass5_Sub3_9.aClass3_Sub12_1.anInt6770, this.anInt7949, arg4 ? this.aClass5_Sub3_9.aClass3_Sub12_1.anIntArray406 : null, arg2, this.aFloatArray68, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method8529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static584.method8244(arg3, arg5, this.aFloatArray68, this.aClass5_Sub3_9.aClass3_Sub12_1.anIntArray406, this.anInt7949, this.aClass5_Sub3_9.aClass3_Sub12_1.anInt6770, this.anIntArray492, arg2, this.aClass5_Sub3_9.aFloatArray74, arg0, arg1, arg4);
	}
}
