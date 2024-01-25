import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[J")
	public static final long[] aLongArray1;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "[B")
	public final byte[] aByteArray20;

	static {
		new Class34("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
		aLongArray1 = new long[256];
		for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
			@Pc(67) long local67 = (long) local63;
			for (@Pc(69) int local69 = 0; local69 < 8; local69++) {
				if ((local67 & 0x1L) == 1L) {
					local67 = local67 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local67 >>>= 0x1;
				}
			}
			aLongArray1[local63] = local67;
		}
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub4_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}
}
