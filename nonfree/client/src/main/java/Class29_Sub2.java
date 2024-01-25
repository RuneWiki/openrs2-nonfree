import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	private int anInt4843 = 1;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	private int anInt4842 = 0;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "J")
	private long aLong156 = 0L;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class29_Sub2() {
		this.aLong154 = this.aLong155 = jagmisc.nanoTime();
		if (this.aLong155 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method5290() {
		if (this.aLong154 > this.aLong155) {
			this.aLong155 += this.aLong154 - this.aLong155;
		}
		this.aLong156 = 0L;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)I")
	@Override
	public int method5293(@OriginalArg(1) int arg0) {
		this.aLong155 += this.method4363();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong155 < this.aLong154) {
			Static15.method5425((this.aLong154 - this.aLong155) / 1000000L);
			this.aLong156 += this.aLong154 - this.aLong155;
			this.aLong155 += this.aLong154 - this.aLong155;
			this.aLong154 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong154 += local18;
			local30++;
		} while (local30 < 10 && this.aLong154 < this.aLong155);
		if (this.aLong155 > this.aLong154) {
			this.aLong154 = this.aLong155;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)J")
	@Override
	public long method5287() {
		return this.aLong155;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)J")
	private long method4363() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong156;
		this.aLong156 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray7[this.anInt4842] = local13;
			if (this.anInt4843 < 1) {
				this.anInt4843++;
			}
			this.anInt4842 = (this.anInt4842 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt4843; local56++) {
			local54 += this.aLongArray7[(this.anInt4842 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt4843;
	}
}
