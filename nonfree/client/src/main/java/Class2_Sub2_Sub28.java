import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
	private int anInt7841 = 0;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
	private int anInt7843 = 4096;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7841 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt7843 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(21) int[] local21 = this.method7951(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static153.anInt3070; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt7841 <= local29 && this.anInt7843 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
