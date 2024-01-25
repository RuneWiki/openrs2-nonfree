import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class125 {

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
	public static final int[] anIntArray228 = new int[256];

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString29;

	static {
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			@Pc(46) int local46 = local43;
			for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
				if ((local46 & 0x1) == 1) {
					local46 = local46 >>> 1 ^ 0xEDB88320;
				} else {
					local46 >>>= 0x1;
				}
			}
			anIntArray228[local43] = local46;
		}
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class125(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString31 = arg2;
		this.aString30 = arg1;
		this.aString29 = arg0;
	}
}
