import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
	public static int[] anIntArray140 = new int[256];

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray140[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub2() {
		this.method678();
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	@Override
	public void method678() {
		this.anInt899 = 256;
		this.anInt895 = 0;
		this.anInt905 = 1;
		this.aLong30 = Static80.method1369();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray4[local20] = this.aLong30;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	@Override
	public void method676() {
		for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
			this.aLongArray4[local9] = 0L;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I")
	@Override
	public int method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.anInt899;
		@Pc(12) int local12 = this.anInt905;
		this.anInt899 = 300;
		this.anInt905 = 1;
		this.aLong30 = Static80.method1369();
		if (this.aLongArray4[this.anInt901] == 0L) {
			this.anInt905 = local12;
			this.anInt899 = local9;
		} else if (this.aLongArray4[this.anInt901] < this.aLong30) {
			this.anInt899 = (int) ((long) (arg1 * 2560) / (this.aLong30 - this.aLongArray4[this.anInt901]));
		}
		if (this.anInt899 < 25) {
			this.anInt899 = 25;
		}
		if (this.anInt899 > 256) {
			this.anInt899 = 256;
			this.anInt905 = (int) ((long) arg1 - (this.aLong30 - this.aLongArray4[this.anInt901]) / 10L);
		}
		if (this.anInt905 > arg1) {
			this.anInt905 = arg1;
		}
		this.aLongArray4[this.anInt901] = this.aLong30;
		this.anInt901 = (this.anInt901 + 1) % 10;
		@Pc(138) int local138;
		if (this.anInt905 > 1) {
			for (local138 = 0; local138 < 10; local138++) {
				if (this.aLongArray4[local138] != 0L) {
					this.aLongArray4[local138] += this.anInt905;
				}
			}
		}
		if (arg0 > this.anInt905) {
			this.anInt905 = arg0;
		}
		local138 = 0;
		Static117.method2058((long) this.anInt905);
		while (this.anInt895 < 256) {
			local138++;
			this.anInt895 += this.anInt899;
		}
		this.anInt895 &= 0xFF;
		return local138;
	}
}
