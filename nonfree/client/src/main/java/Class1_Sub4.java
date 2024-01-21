import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
	public static int[] anIntArray71 = new int[256];

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public int anInt429;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
	public int anInt436 = -1;

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
	public int anInt440 = 0;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray71[local10] = local13;
		}
	}
}
