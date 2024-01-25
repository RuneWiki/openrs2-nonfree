import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class14_Sub3_Sub12 extends Class14_Sub3 {

	@OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
	private int anInt2425 = 4096;

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
	private int anInt2424 = 0;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2424 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt2425 = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(26) int[] local26 = this.method6004(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static294.anInt5657; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt2424 && local34 <= this.anInt2425 ? 4096 : 0;
			}
		}
		return local11;
	}
}
