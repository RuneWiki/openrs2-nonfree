import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class104 {

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_11;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "J")
	public final long aLong103;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(14) long local14 = (long) local10;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray4[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!vj;JI)V")
	public Class104(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass172_Sub2_11 = arg0;
		this.aLong103 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass172_Sub2_11.method5612(this.aLong103);
		super.finalize();
	}
}
