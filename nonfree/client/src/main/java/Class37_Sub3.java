import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "J")
	private long aLong137 = 0L;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
	private long aLong138 = 0L;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private int anInt3647 = 1;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	private int anInt3646 = 0;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "J")
	private long aLong139 = 0L;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[J")
	private long[] aLongArray76 = new long[10];

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class37_Sub3() {
		this.aLong138 = this.aLong137 = jagmisc.nanoTime();
		if (this.aLong137 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	@Override
	public void method2928() {
		if (this.aLong138 > this.aLong137) {
			this.aLong137 += this.aLong138 - this.aLong137;
		}
		this.aLong139 = 0L;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)J")
	@Override
	public long method2929() {
		return this.aLong137;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)J")
	private long method2937() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(3) long local3 = 0L;
		@Pc(9) long local9 = local1 - this.aLong139;
		this.aLong139 = local1;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray76[this.anInt3646] = local9;
			if (this.anInt3647 < 1) {
				this.anInt3647++;
			}
			this.anInt3646 = (this.anInt3646 + 1) % 10;
		}
		for (@Pc(48) int local48 = 1; local48 <= this.anInt3647; local48++) {
			local3 += this.aLongArray76[(this.anInt3646 + 10 - local48) % 10];
		}
		return local3 / (long) this.anInt3647;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
	@Override
	public int method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static202.method3246((long) arg0);
		@Pc(13) long local13 = (long) arg1 * 1000000L;
		this.aLong137 += this.method2937();
		if (this.aLong137 < this.aLong138) {
			Static202.method3246((this.aLong138 - this.aLong137) / 1000000L);
			this.aLong139 += this.aLong138 - this.aLong137;
			this.aLong137 += this.aLong138 - this.aLong137;
			this.aLong138 += local13;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong138 += local13;
			local69++;
		} while (local69 < 10 && this.aLong138 < this.aLong137);
		if (this.aLong138 < this.aLong137) {
			this.aLong138 = this.aLong137;
		}
		return local69;
	}
}
