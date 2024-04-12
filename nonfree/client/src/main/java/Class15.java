import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class15 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_121 = Static12.method257("To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3");

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
	public static int[] anIntArray85 = new int[256];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array8;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt432;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt434;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray85[local8] = local11;
		}
		aClass40Array8 = new Class40[500];
		anInt432 = 0;
		aBoolean37 = false;
		anInt434 = 0;
	}
}
