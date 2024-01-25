import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class210 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
	public static final int[] anIntArray553 = new int[256];

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "J")
	public final long aLong180;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_39;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray553[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!bv;J[Lclient!fk;)V")
	public Class210(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class79[] arg2) {
		this.aLong180 = arg1;
		this.aClass30_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_39.method949(this.aLong180);
		super.finalize();
	}
}
