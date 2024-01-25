import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class86 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "[B")
	public static final byte[] aByteArray22;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	public final int anInt1714;

	static {
		@Pc(74) int local74 = 0;
		aByteArray22 = new byte[32896];
		for (@Pc(79) int local79 = 0; local79 < 256; local79++) {
			for (@Pc(82) int local82 = 0; local82 <= local79; local82++) {
				aByteArray22[local74++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local79 * local79 + local82 * local82 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt1714 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
