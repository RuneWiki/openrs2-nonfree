import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[J")
	public static long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public int anInt2552;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray11;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	public int anInt2553;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "Ljava/lang/String;")
	public String aString79;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "[Lclient!ol;")
	public Class117[] aClass117Array1;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt2554;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	public int anInt2555;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(10) long local10 = (long) local4;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray8[local4] = local10;
		}
	}
}
