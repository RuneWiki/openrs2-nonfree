import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "[I")
	public static final int[] anIntArray532 = new int[4096];

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	protected int anInt5726;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public final int anInt5724;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	protected int anInt5727;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	protected final int anInt5725;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray532[local4] = Static293.method3878(local4);
		}
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIII)V")
	protected Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5726 = arg2;
		this.anInt5724 = arg3;
		this.anInt5727 = arg0;
		this.anInt5725 = arg1;
	}
}
