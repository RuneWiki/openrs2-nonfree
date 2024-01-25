import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class4_Sub4_Sub34 extends Class4_Sub4 {

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt6126 = 0;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
	private int anInt6128 = 4096;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(27) int[] local27 = this.method5386(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static124.anInt3576; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = this.anInt6126 <= local35 && local35 <= this.anInt6128 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6126 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt6128 = arg1.method2404();
		}
	}
}
