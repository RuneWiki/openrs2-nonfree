import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class220 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "[B")
	public static final byte[] aByteArray81 = new byte[32896];

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public final int anInt6593;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
	public final int anInt6588;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public final int anInt6586;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	public final int anInt6592;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray81[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIII)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6593 = arg3;
		this.anInt6588 = arg2;
		this.anInt6586 = arg0;
		this.anInt6592 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
