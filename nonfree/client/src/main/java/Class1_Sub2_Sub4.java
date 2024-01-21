import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
	public int anInt378 = 0;

	static {
		for (@Pc(28) int local28 = 0; local28 < 256; local28++) {
			@Pc(32) long local32 = (long) local28;
			for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
				if ((local32 & 0x1L) == 1L) {
					local32 = local32 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local32 >>>= 0x1;
				}
			}
			aLongArray7[local28] = local32;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLclient!fj;)V")
	private void method365(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 2) {
			this.anInt378 = arg1.method2765();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!fj;)V")
	public void method368(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2771();
			if (local12 == 0) {
				return;
			}
			this.method365(local12, arg0);
		}
	}
}
