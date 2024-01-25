import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class223 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "[J")
	public static final long[] aLongArray8 = new long[256];

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!lm;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_10;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public final int anInt6205;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray8[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!lm;II)V")
	public Class223(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub1_Sub2_10 = arg0;
		this.anInt6205 = arg2;
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_10.method4885(this.anInt6205);
		super.finalize();
	}
}
