import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
	private long aLong58 = 0L;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "J")
	private long aLong59 = 0L;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	private int anInt2128 = 1;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	private int anInt2127 = 0;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "J")
	private long aLong60 = 0L;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class72_Sub1() {
		this.aLong58 = System.nanoTime();
		this.aLong59 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	@Override
	public void method6795() {
		this.aLong60 = 0L;
		if (this.aLong59 > this.aLong58) {
			this.aLong58 += this.aLong59 - this.aLong58;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6801() {
		this.aLong58 += this.method2112();
		return this.aLong58 < this.aLong59 ? (this.aLong59 - this.aLong58) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)J")
	private long method2112() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong60;
		this.aLong60 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt2127] = local7;
			if (this.anInt2128 < 1) {
				this.anInt2128++;
			}
			this.anInt2127 = (this.anInt2127 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt2128; local58++) {
			local56 += this.aLongArray7[(this.anInt2127 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt2128;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6800(@OriginalArg(0) long arg0) {
		if (this.aLong58 < this.aLong59) {
			this.aLong60 += this.aLong59 - this.aLong58;
			this.aLong58 += this.aLong59 - this.aLong58;
			this.aLong59 += arg0;
			return 1;
		}
		@Pc(48) int local48 = 0;
		do {
			local48++;
			this.aLong59 += arg0;
		} while (local48 < 10 && this.aLong59 < this.aLong58);
		if (this.aLong59 < this.aLong58) {
			this.aLong59 = this.aLong58;
		}
		return local48;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)J")
	@Override
	public long method6799() {
		return this.aLong58;
	}
}
