import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "[I")
	public static int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!je;")
	public Class40 aClass40_971;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray207[local6] = local9;
		}
	}
}
