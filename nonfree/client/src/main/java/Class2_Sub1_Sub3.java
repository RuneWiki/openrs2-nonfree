import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	private int anInt373 = 0;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
	private int anInt376 = 4096;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(27) int[] local27 = this.method4601(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static281.anInt5558; local29++) {
				@Pc(40) int local40 = local27[local29];
				local11[local29] = this.anInt373 <= local40 && this.anInt376 >= local40 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt373 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt376 = arg0.method2130();
		}
	}
}
