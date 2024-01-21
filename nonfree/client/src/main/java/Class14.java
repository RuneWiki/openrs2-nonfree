import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public abstract class Class14 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "[I")
	public static int[] anIntArray366 = new int[99];

	static {
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 99; local21++) {
			@Pc(26) int local26 = local21 + 1;
			@Pc(39) int local39 = (int) ((double) local26 + Math.pow(2.0D, (double) local26 / 7.0D) * 300.0D);
			local19 += local39;
			anIntArray366[local21] = local19 / 4;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public abstract void method1548();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public abstract void method1549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public abstract void method1550();

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public abstract void method1554();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BZIZ)V")
	public abstract void method1555(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	public abstract void method1557(@OriginalArg(1) int arg0);
}
