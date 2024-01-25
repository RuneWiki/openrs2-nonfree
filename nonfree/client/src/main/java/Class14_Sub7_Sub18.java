import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class14_Sub7_Sub18 extends Class14_Sub7 {

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
	private int anInt5191 = 4096;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt5192 = 0;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(28) int[] local28 = this.method9379(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static613.anInt10114; local30++) {
				@Pc(36) int local36 = local28[local30];
				local18[local30] = local36 >= this.anInt5192 && this.anInt5191 >= local36 ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5192 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt5191 = arg1.method7717(-1978450544);
		}
	}
}
