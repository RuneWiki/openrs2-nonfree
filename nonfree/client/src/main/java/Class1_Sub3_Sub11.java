import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
	private int anInt1720 = 4096;

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
	private int anInt1718 = 0;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(27) int[] local27 = this.method4117(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static110.anInt2934; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = local35 >= this.anInt1718 && this.anInt1720 >= local35 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1718 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt1720 = arg0.method1764();
		}
	}
}
