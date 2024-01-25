import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class195 {

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "[I")
	public static final int[] anIntArray393 = new int[256];

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "J")
	public final long aLong151;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "Lclient!bga;")
	private final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_7;

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

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!bga;J[Lclient!ifa;)V")
	public Class195(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class150[] arg2) {
		this.aLong151 = arg1;
		this.aClass20_Sub2_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!lha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub2_Sub2_7.method1586(this.aLong151);
		super.finalize();
	}
}
