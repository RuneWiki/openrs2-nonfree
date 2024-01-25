import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt3478 = 1;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	private int anInt3479 = 0;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class115_Sub1() {
		this.aLong124 = this.aLong123 = jagmisc.nanoTime();
		if (this.aLong123 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)J")
	@Override
	public long method4524() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J")
	private long method3137() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(13) long local13 = local1 - this.aLong125;
		this.aLong125 = local1;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray7[this.anInt3479] = local13;
			this.anInt3479 = (this.anInt3479 + 1) % 10;
			if (this.anInt3478 < 1) {
				this.anInt3478++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt3478; local58++) {
			local56 += this.aLongArray7[(this.anInt3479 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt3478;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	@Override
	public void method4523() {
		this.aLong125 = 0L;
		if (this.aLong124 > this.aLong123) {
			this.aLong123 += this.aLong124 - this.aLong123;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	@Override
	public int method4522(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong123 += this.method3137();
		if (this.aLong123 < this.aLong124) {
			Static135.method2737((this.aLong124 - this.aLong123) / 1000000L);
			this.aLong125 += this.aLong124 - this.aLong123;
			this.aLong123 += this.aLong124 - this.aLong123;
			this.aLong124 += local10;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong124 += local10;
			local30++;
		} while (local30 < 10 && this.aLong123 > this.aLong124);
		if (this.aLong123 > this.aLong124) {
			this.aLong124 = this.aLong123;
		}
		return local30;
	}
}
