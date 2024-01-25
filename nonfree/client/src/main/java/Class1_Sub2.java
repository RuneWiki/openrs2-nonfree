import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
	public static final int[] anIntArray8 = new int[256];

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!sr;")
	public final Class227 aClass227_3 = new Class227();

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
			anIntArray8[local10] = local13;
		}
	}
}
