import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	private int anInt4111 = 1;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	private int anInt4112 = 0;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "[J")
	private long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class45_Sub2() {
		this.aLong143 = this.aLong142 = jagmisc.nanoTime();
		if (this.aLong142 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J")
	@Override
	public long method4595() {
		return this.aLong142;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	@Override
	public void method4593() {
		this.aLong144 = 0L;
		if (this.aLong142 < this.aLong143) {
			this.aLong142 += this.aLong143 - this.aLong142;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)J")
	private long method3473() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong144;
		@Pc(14) long local14 = 0L;
		this.aLong144 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray11[this.anInt4112] = local7;
			if (this.anInt4111 < 1) {
				this.anInt4111++;
			}
			this.anInt4112 = (this.anInt4112 + 1) % 10;
		}
		for (@Pc(54) int local54 = 1; local54 <= this.anInt4111; local54++) {
			local14 += this.aLongArray11[(this.anInt4112 + 10 - local54) % 10];
		}
		return local14 / (long) this.anInt4111;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)I")
	@Override
	public int method4592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static282.method4345((long) arg0);
		this.aLong142 += this.method3473();
		@Pc(21) long local21 = (long) arg1 * 1000000L;
		if (this.aLong142 < this.aLong143) {
			Static282.method4345((this.aLong143 - this.aLong142) / 1000000L);
			this.aLong144 += this.aLong143 - this.aLong142;
			this.aLong142 += this.aLong143 - this.aLong142;
			this.aLong143 += local21;
			return 1;
		}
		@Pc(33) int local33 = 0;
		do {
			this.aLong143 += local21;
			local33++;
		} while (local33 < 10 && this.aLong142 > this.aLong143);
		if (this.aLong142 > this.aLong143) {
			this.aLong143 = this.aLong142;
		}
		return local33;
	}
}
