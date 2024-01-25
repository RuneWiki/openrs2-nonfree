import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class116_Sub3 extends Class116 {

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "J")
	private long aLong250 = 0L;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "J")
	private long aLong251 = 0L;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "J")
	private long aLong252 = 0L;

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
	private int anInt9620 = 1;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
	private int anInt9619 = 0;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class116_Sub3() {
		this.aLong250 = this.aLong251 = jagmisc.nanoTime();
		if (this.aLong251 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)J")
	@Override
	public long method7956() {
		return this.aLong251;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)J")
	@Override
	protected long method7963() {
		this.aLong251 += this.method7964();
		return this.aLong250 > this.aLong251 ? (this.aLong250 - this.aLong251) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)J")
	private long method7964() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong252;
		this.aLong252 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt9619] = local7;
			this.anInt9619 = (this.anInt9619 + 1) % 10;
			if (this.anInt9620 < 1) {
				this.anInt9620++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt9620; local50++) {
			local48 += this.aLongArray14[(this.anInt9619 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt9620;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7958(@OriginalArg(1) long arg0) {
		if (this.aLong250 > this.aLong251) {
			this.aLong252 += this.aLong250 - this.aLong251;
			this.aLong251 += this.aLong250 - this.aLong251;
			this.aLong250 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong250 += arg0;
		} while (local16 < 10 && this.aLong251 > this.aLong250);
		if (this.aLong251 > this.aLong250) {
			this.aLong250 = this.aLong251;
		}
		return local16;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	@Override
	public void method7962() {
		this.aLong252 = 0L;
		if (this.aLong250 > this.aLong251) {
			this.aLong251 += this.aLong250 - this.aLong251;
		}
	}
}
