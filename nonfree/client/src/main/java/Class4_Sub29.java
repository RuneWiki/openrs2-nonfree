import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
	public static final int[] anIntArray327 = new int[4096];

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "Lclient!d;")
	public final Class21_Sub1_Sub1_Sub1_Sub1 aClass21_Sub1_Sub1_Sub1_Sub1_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray327[local4] = Static37.method1061(local4);
		}
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class4_Sub29(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub1 arg0) {
		this.aClass21_Sub1_Sub1_Sub1_Sub1_1 = arg0;
	}
}
