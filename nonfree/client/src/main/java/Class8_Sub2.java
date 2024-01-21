import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[I")
	public static int[] anIntArray335 = new int[256];

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private int anInt2992;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "[J")
	private final long[] aLongArray15 = new long[10];

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(21) int local21 = local18;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1) == 1) {
					local21 = local21 >>> 1 ^ 0xEDB88320;
				} else {
					local21 >>>= 0x1;
				}
			}
			anIntArray335[local18] = local21;
		}
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.method2117();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	@Override
	public void method2113() {
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			this.aLongArray15[local12] = 0L;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public void method2117() {
		this.anInt2994 = 256;
		this.anInt2992 = 0;
		this.anInt2998 = 1;
		this.aLong99 = Static16.method286();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray15[local25] = this.aLong99;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)I")
	@Override
	public int method2114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2994;
		this.anInt2994 = 300;
		@Pc(14) int local14 = this.anInt2998;
		this.anInt2998 = 1;
		this.aLong99 = Static16.method286();
		if (this.aLongArray15[this.anInt2990] == 0L) {
			this.anInt2998 = local14;
			this.anInt2994 = local4;
		} else if (this.aLongArray15[this.anInt2990] < this.aLong99) {
			this.anInt2994 = (int) ((long) (arg1 * 2560) / (this.aLong99 - this.aLongArray15[this.anInt2990]));
		}
		if (this.anInt2994 < 25) {
			this.anInt2994 = 25;
		}
		if (this.anInt2994 > 256) {
			this.anInt2994 = 256;
			this.anInt2998 = (int) ((long) arg1 - (this.aLong99 - this.aLongArray15[this.anInt2990]) / 10L);
		}
		if (this.anInt2998 > arg1) {
			this.anInt2998 = arg1;
		}
		this.aLongArray15[this.anInt2990] = this.aLong99;
		this.anInt2990 = (this.anInt2990 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt2998 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray15[local135] != 0L) {
					this.aLongArray15[local135] -= -((long) this.anInt2998);
				}
			}
		}
		if (arg0 > this.anInt2998) {
			this.anInt2998 = arg0;
		}
		Static13.method278((long) this.anInt2998);
		local135 = 0;
		while (this.anInt2992 < 256) {
			local135++;
			this.anInt2992 += this.anInt2994;
		}
		this.anInt2992 &= 0xFF;
		return local135;
	}
}
