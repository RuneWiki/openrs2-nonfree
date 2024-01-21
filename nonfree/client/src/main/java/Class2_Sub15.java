import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
	public static final int[] anIntArray206 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public int anInt2075;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public int anInt2079 = -1;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
	public int anInt2077 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray206[local4] = Static112.method1578(local4);
		}
	}
}
