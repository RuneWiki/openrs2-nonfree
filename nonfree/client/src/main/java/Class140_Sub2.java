import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class140_Sub2 extends Class140 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private int anInt3699 = 1;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	private int anInt3698 = 0;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class140_Sub2() {
		this.aLong124 = this.aLong123 = jagmisc.nanoTime();
		if (this.aLong123 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I")
	@Override
	public int method5400(@OriginalArg(1) int arg0) {
		this.aLong123 += this.method2979();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong124 > this.aLong123) {
			Static429.method5376((this.aLong124 - this.aLong123) / 1000000L);
			this.aLong125 += this.aLong124 - this.aLong123;
			this.aLong123 += this.aLong124 - this.aLong123;
			this.aLong124 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong124 += local18;
		} while (local30 < 10 && this.aLong123 > this.aLong124);
		if (this.aLong123 > this.aLong124) {
			this.aLong124 = this.aLong123;
		}
		return local30;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	@Override
	public void method5399() {
		if (this.aLong123 < this.aLong124) {
			this.aLong123 += this.aLong124 - this.aLong123;
		}
		this.aLong125 = 0L;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)J")
	@Override
	public long method5403() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)J")
	private long method2979() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong125;
		this.aLong125 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt3698] = local7;
			this.anInt3698 = (this.anInt3698 + 1) % 10;
			if (this.anInt3699 < 1) {
				this.anInt3699++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt3699; local60++) {
			local50 += this.aLongArray7[(this.anInt3698 + 10 - local60) % 10];
		}
		return local50 / (long) this.anInt3699;
	}
}
