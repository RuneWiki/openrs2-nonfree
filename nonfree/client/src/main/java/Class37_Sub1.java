import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "J")
	private long aLong54 = 0L;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private int anInt1342 = 0;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	private int anInt1343 = 1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	@Override
	public void method3580() {
		this.aLong56 = 0L;
		if (this.aLong54 < this.aLong55) {
			this.aLong54 += this.aLong55 - this.aLong54;
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)J")
	@Override
	public long method3585() {
		return this.aLong54;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I")
	@Override
	public int method3581(@OriginalArg(1) int arg0) {
		this.aLong54 += this.method1306();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong54 < this.aLong55) {
			Static134.method2598((this.aLong55 - this.aLong54) / 1000000L);
			this.aLong56 += this.aLong55 - this.aLong54;
			this.aLong54 += this.aLong55 - this.aLong54;
			this.aLong55 += local19;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong55 += local19;
			local31++;
		} while (local31 < 10 && this.aLong54 > this.aLong55);
		if (this.aLong55 < this.aLong54) {
			this.aLong55 = this.aLong54;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)J")
	private long method1306() {
		@Pc(4) long local4 = Static349.method5647() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong56;
		this.aLong56 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt1342] = local10;
			this.anInt1342 = (this.anInt1342 + 1) % 10;
			if (this.anInt1343 < 10) {
				this.anInt1343++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt1343; local53++) {
			local51 += this.aLongArray4[(this.anInt1342 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt1343;
	}
}
