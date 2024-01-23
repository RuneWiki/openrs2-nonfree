import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class4_Sub6_Sub25 extends Class4_Sub6 {

	@OriginalMember(owner = "client!on", name = "H", descriptor = "I")
	private int anInt3872 = 0;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	private int anInt3877 = 4096;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(27) int[] local27 = this.method4372(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static2.anInt19; local29++) {
				@Pc(40) int local40 = local27[local29];
				local11[local29] = this.anInt3872 <= local40 && local40 <= this.anInt3877 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3872 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt3877 = arg0.method1837();
		}
	}
}
