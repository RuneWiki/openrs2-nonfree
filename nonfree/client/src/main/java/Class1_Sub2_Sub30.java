import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt6512 = 0;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
	private int anInt6510 = 4096;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6512 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt6510 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(27) int[] local27 = this.method5964(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static218.anInt3990; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = local35 >= this.anInt6512 && local35 <= this.anInt6510 ? 4096 : 0;
			}
		}
		return local17;
	}
}
