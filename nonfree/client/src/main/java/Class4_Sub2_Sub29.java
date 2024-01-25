import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class4_Sub2_Sub29 extends Class4_Sub2 {

	@OriginalMember(owner = "client!sea", name = "I", descriptor = "I")
	private int anInt9042 = 0;

	@OriginalMember(owner = "client!sea", name = "N", descriptor = "I")
	private int anInt9046 = 4096;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9042 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt9046 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(26) int[] local26 = this.method8208(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static417.anInt5248; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt9042 && local34 <= this.anInt9046 ? 4096 : 0;
			}
		}
		return local11;
	}
}
