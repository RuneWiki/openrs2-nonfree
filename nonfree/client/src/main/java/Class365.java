import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class365 {

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "[J")
	public static final long[] aLongArray18 = new long[256];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	public final int anInt10080;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
	private final int anInt10083;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!ti;")
	private final Class324 aClass324_20;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	public final int anInt10085;

	static {
		for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
			@Pc(65) long local65 = (long) local61;
			for (@Pc(67) int local67 = 0; local67 < 8; local67++) {
				if ((local65 & 0x1L) == 1L) {
					local65 = local65 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local65 >>>= 0x1;
				}
			}
			aLongArray18[local61] = local65;
		}
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IILclient!ti;)V")
	public Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class324 arg2) {
		this.anInt10080 = arg0;
		this.anInt10083 = arg1;
		this.aClass324_20 = arg2;
		this.anInt10085 = this.aClass324_20.anInt9051 * this.anInt10083;
		if (this.anInt10080 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
