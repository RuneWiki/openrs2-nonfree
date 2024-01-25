import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class331 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
	public static final int[] anIntArray788 = new int[256];

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public final int anInt9187;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_41;

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
			anIntArray788[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!dia;II)V")
	public Class331(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9187 = arg2;
		this.aClass13_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_41.method1956(this.anInt9187);
		super.finalize();
	}
}
