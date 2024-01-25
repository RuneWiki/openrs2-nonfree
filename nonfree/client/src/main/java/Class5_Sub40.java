import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!qaa", name = "r", descriptor = "[J")
	public static final long[] aLongArray12 = new long[256];

	@OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
	public final int anInt7590;

	@OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
	public final int anInt7585;

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
			aLongArray12[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(II)V")
	public Class5_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7590 = arg0;
		this.anInt7585 = arg1;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(II)Z")
	public boolean method6705(@OriginalArg(1) int arg0) {
		return (this.anInt7590 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
	public boolean method6706() {
		return (this.anInt7590 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)I")
	public int method6707() {
		return Static217.method3703(this.anInt7590);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)Z")
	public boolean method6708() {
		return (this.anInt7590 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)I")
	public int method6710() {
		return this.anInt7590 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Z")
	public boolean method6711() {
		return (this.anInt7590 >> 21 & 0x1) != 0;
	}
}
