import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class166 {

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "[J")
	public static final long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "J")
	public final long aLong119;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!rda;")
	private final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_8;

	static {
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			@Pc(46) long local46 = (long) local42;
			for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
				if ((local46 & 0x1L) == 1L) {
					local46 = local46 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local46 >>>= 0x1;
				}
			}
			aLongArray10[local42] = local46;
		}
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!rda;JI)V")
	public Class166(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong119 = arg1;
		this.aClass57_Sub3_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub3_Sub1_8.method7398(this.aLong119);
		super.finalize();
	}
}
