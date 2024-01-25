import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class177 {

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "[I")
	public static final int[] anIntArray252 = new int[4096];

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
	public int anInt4233;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "Z")
	public boolean aBoolean283;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
	public int anInt4235;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
	public int anInt4236;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray252[local4] = Static233.method3327(local4);
		}
	}
}
