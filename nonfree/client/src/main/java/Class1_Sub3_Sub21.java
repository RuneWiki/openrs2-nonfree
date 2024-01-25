import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt5175 = 4096;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	private int anInt5176 = 0;

	static {
		new Class45("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt5176 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt5175 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(21) int[] local21 = this.method8201(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static254.anInt4973; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt5176 && this.anInt5175 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
