import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class14_Sub1_Sub35 extends Class14_Sub1 {

	@OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
	private int anInt10010 = 4096;

	@OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
	private int anInt10016 = 0;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10016 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt10010 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(21) int[] local21 = this.method8897(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static371.anInt6835; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt10016 && this.anInt10010 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
