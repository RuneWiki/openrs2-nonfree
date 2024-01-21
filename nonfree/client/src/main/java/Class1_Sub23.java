import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[32896];

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Lclient!ve;")
	public Class3_Sub1 aClass3_Sub1_22;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!s;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "[B")
	public byte[] aByteArray45;

	static {
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			for (@Pc(22) int local22 = 0; local22 <= local19; local22++) {
				aByteArray44[local17++] = (byte) (255.0D / Math.sqrt((double) ((float) (local22 * local22 + local19 * local19 + 65535) / 65535.0F)));
			}
		}
	}
}
