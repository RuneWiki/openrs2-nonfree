import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!od", name = "F", descriptor = "[I")
	public static final int[] anIntArray393 = new int[256];

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Z")
	public final boolean aBoolean509;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public int anInt7137;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "I")
	public final int anInt7143;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
	public String aString145;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	public final int anInt7135;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "J")
	public final long aLong194;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public final int anInt7142;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public final int anInt7141;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString146;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Z")
	public final boolean aBoolean510;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray393[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub36(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean509 = arg9;
		this.anInt7137 = arg3;
		this.anInt7143 = arg7;
		this.aString145 = arg1;
		this.anInt7135 = arg6;
		this.aLong194 = arg5;
		this.anInt7142 = arg4;
		this.anInt7141 = arg2;
		this.aString146 = arg0;
		this.aBoolean510 = arg8;
	}
}
