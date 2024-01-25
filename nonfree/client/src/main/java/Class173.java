import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class173 {

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "[J")
	public static final long[] aLongArray14 = new long[256];

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Lclient!lca;")
	public Interface5 anInterface5_8;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "Lclient!lca;")
	public Interface5 anInterface5_9;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Z")
	public boolean aBoolean354;

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(11) long local11 = (long) local7;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1L) == 1L) {
					local11 = local11 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local11 >>>= 0x1;
				}
			}
			aLongArray14[local7] = local11;
		}
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Z)V")
	public Class173(@OriginalArg(0) boolean arg0) {
		this.aBoolean354 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
	public boolean method4367() {
		return this.aBoolean353 && !this.aBoolean354;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public void method4369() {
		if (this.anInterface5_8 != null) {
			this.anInterface5_8.method5728();
		}
		this.aBoolean353 = false;
	}
}
