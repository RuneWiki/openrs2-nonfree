import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public abstract class Class3 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
	public static final int[] anIntArray410 = new int[32];

	static {
		@Pc(44) int local44 = 2;
		for (@Pc(46) int local46 = 0; local46 < 32; local46++) {
			anIntArray410[local46] = local44 - 1;
			local44 += local44;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)I")
	public abstract int method3512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public abstract void method3515();
}
