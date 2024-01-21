import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
	public static int[] anIntArray125 = new int[256];

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
	public int anInt1119;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!q;")
	public Class62_Sub1 aClass62_Sub1_6;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Lclient!dd;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "[B")
	public byte[] aByteArray18;

	static {
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(35) int local35 = local32;
			for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
				if ((local35 & 0x1) == 1) {
					local35 = local35 >>> 1 ^ 0xEDB88320;
				} else {
					local35 >>>= 0x1;
				}
			}
			anIntArray125[local32] = local35;
		}
	}
}
