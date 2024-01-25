import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public abstract class Class80 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	static {
		for (@Pc(250) int local250 = 0; local250 < 256; local250++) {
			@Pc(254) long local254 = (long) local250;
			for (@Pc(256) int local256 = 0; local256 < 8; local256++) {
				if ((local254 & 0x1L) == 1L) {
					local254 = local254 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local254 >>>= 0x1;
				}
			}
			aLongArray4[local250] = local254;
		}
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	protected Class80() {
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public abstract void method2227();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
	public final boolean method2228() {
		return this.method2235() || this.method2237() || this.method2229();
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
	protected abstract boolean method2229();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I")
	public abstract int method2230();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Lclient!os;")
	public abstract Class4_Sub5 method2232();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)I")
	public abstract int method2234();

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)Z")
	public abstract boolean method2235();

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)V")
	public abstract void method2236();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)Z")
	protected abstract boolean method2237();
}
