import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class234 implements Interface1 {

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!lq;")
	private final Class145_Sub2 aClass145_Sub2_5;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	public final int anInt6083;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public final int anInt6079;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	public final int[] anIntArray417;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!vg;")
	private Class382 aClass382_1;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "[F")
	public float[] aFloatArray39;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!lq;Lclient!ug;Lclient!vg;)V")
	public Class234(@OriginalArg(0) Class145_Sub2 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class382 arg2) {
		this.aClass145_Sub2_5 = arg0;
		if (arg1 instanceof Class43_Sub2_Sub3) {
			@Pc(35) Class43_Sub2_Sub3 local35 = (Class43_Sub2_Sub3) arg1;
			this.anInt6079 = local35.anInt10988;
			this.anInt6083 = local35.anInt10991;
			this.anIntArray417 = local35.anIntArray759;
		} else if (arg1 instanceof Class43_Sub2_Sub1) {
			@Pc(13) Class43_Sub2_Sub1 local13 = (Class43_Sub2_Sub1) arg1;
			this.anInt6083 = local13.anInt10991;
			this.anInt6079 = local13.anInt10988;
			this.anIntArray417 = local13.anIntArray313;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass382_1 = arg2;
			if (this.aClass382_1.anInt10483 != this.anInt6079 || this.anInt6083 != this.aClass382_1.anInt10482) {
				throw new RuntimeException();
			}
			this.aFloatArray39 = this.aClass382_1.aFloatArray67;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static576.method8012(this.anInt6079, this.aClass145_Sub2_5.aFloatArray38, 0, this.anIntArray417, this.aFloatArray39, arg0, arg2, this.aClass145_Sub2_5.aClass2_Sub40_1.anInt8472, arg4 ? this.aClass145_Sub2_5.aClass2_Sub40_1.anIntArray602 : null, arg1, 0, arg3);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static576.method8012(this.aClass145_Sub2_5.aClass2_Sub40_1.anInt8472, this.aFloatArray39, arg4, this.aClass145_Sub2_5.aClass2_Sub40_1.anIntArray602, this.aClass145_Sub2_5.aFloatArray38, arg0, arg2, this.anInt6079, this.anIntArray417, arg1, arg5, arg3);
	}
}
