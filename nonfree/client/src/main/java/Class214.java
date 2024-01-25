import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class214 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "[I")
	public static final int[] anIntArray581 = new int[256];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_34;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "J")
	public final long aLong213;

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
			anIntArray581[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!da;JI)V")
	public Class214(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass50_Sub1_34 = arg0;
		this.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass50_Sub1_34.method1276(this.aLong213);
		super.finalize();
	}
}
