import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
	public static int[] anIntArray155 = new int[256];

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!jc;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Lclient!md;")
	public Class40_Sub1 aClass40_Sub1_21;

	static {
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(24) int local24 = local21;
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				if ((local24 & 0x1) == 1) {
					local24 = local24 >>> 1 ^ 0xEDB88320;
				} else {
					local24 >>>= 0x1;
				}
			}
			anIntArray155[local21] = local24;
		}
	}
}
