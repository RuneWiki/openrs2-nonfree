import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class3_Sub5_Sub21 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "[Lclient!jg;")
	private static final Class179[] aClass179Array1 = new Class179[32];

	@OriginalMember(owner = "client!ws", name = "J", descriptor = "Z")
	public static boolean aBoolean755;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "[J")
	public static final long[] aLongArray23;

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
	public static int anInt10916;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!sn;")
	public final Class34_Sub1_Sub1_Sub5 aClass34_Sub1_Sub1_Sub5_1;

	static {
		@Pc(77) Class179[] local77 = Static316.method4542();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass179Array1[local77[local79].anInt4730] = local77[local79];
		}
		aBoolean755 = false;
		aLongArray23 = new long[256];
		anInt10916 = 0;
		for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
			@Pc(111) long local111 = (long) local107;
			for (@Pc(113) int local113 = 0; local113 < 8; local113++) {
				if ((local111 & 0x1L) == 1L) {
					local111 = local111 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local111 >>>= 0x1;
				}
			}
			aLongArray23[local107] = local111;
		}
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!sn;)V")
	public Class3_Sub5_Sub21(@OriginalArg(0) Class34_Sub1_Sub1_Sub5 arg0) {
		this.aClass34_Sub1_Sub1_Sub5_1 = arg0;
	}
}
