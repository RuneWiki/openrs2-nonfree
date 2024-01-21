import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "[I")
	public static int[] anIntArray201 = new int[256];

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
	public final int anInt2113;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(27) int local27 = local24;
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				if ((local27 & 0x1) == 1) {
					local27 = local27 >>> 1 ^ 0xEDB88320;
				} else {
					local27 >>>= 0x1;
				}
			}
			anIntArray201[local24] = local27;
		}
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt2113 = arg0;
	}
}
