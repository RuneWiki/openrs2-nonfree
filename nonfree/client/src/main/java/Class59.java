import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class59 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
	public static final int[] anIntArray151 = new int[4096];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public int anInt1876;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	public int anInt1878;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public int anInt1879;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
	public boolean aBoolean114;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray151[local6] = Static114.method2109(local6);
		}
	}
}
