import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class3_Sub1_Sub14_Sub2 extends Class3_Sub1_Sub14 {

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "[J")
	public static final long[] aLongArray13 = new long[256];

	@OriginalMember(owner = "client!tda", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject18;

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
			aLongArray13[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub1_Sub14_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject18 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7618() {
		return false;
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7617() {
		return this.anObject18;
	}
}
