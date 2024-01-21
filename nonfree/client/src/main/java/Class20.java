import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class20 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[J")
	public static final long[] aLongArray11 = new long[256];

	static {
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(20) long local20 = (long) local16;
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				if ((local20 & 0x1L) == 1L) {
					local20 = local20 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local20 >>>= 0x1;
				}
			}
			aLongArray11[local16] = local20;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method2653(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method2656(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
	public abstract int method2658();
}
