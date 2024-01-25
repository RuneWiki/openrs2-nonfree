import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class61_Sub3 extends Class61 {

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "J")
	private long aLong169 = 0L;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt5696 = 0;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	private int anInt5697 = 1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)J")
	private long method4573() {
		@Pc(4) long local4 = Static266.method3498() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong169;
		this.aLong169 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray9[this.anInt5696] = local10;
			if (this.anInt5697 < 10) {
				this.anInt5697++;
			}
			this.anInt5696 = (this.anInt5696 + 1) % 10;
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt5697; local60++) {
			local58 += this.aLongArray9[(this.anInt5696 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt5697;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)J")
	@Override
	public long method4568() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	@Override
	public void method4571() {
		if (this.aLong170 > this.aLong171) {
			this.aLong171 += this.aLong170 - this.aLong171;
		}
		this.aLong169 = 0L;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
	@Override
	public int method4572(@OriginalArg(1) int arg0) {
		this.aLong171 += this.method4573();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong170 > this.aLong171) {
			Static435.method5777((this.aLong170 - this.aLong171) / 1000000L);
			this.aLong169 += this.aLong170 - this.aLong171;
			this.aLong171 += this.aLong170 - this.aLong171;
			this.aLong170 += local20;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong170 += local20;
		} while (local32 < 10 && this.aLong170 < this.aLong171);
		if (this.aLong171 > this.aLong170) {
			this.aLong170 = this.aLong171;
		}
		return local32;
	}
}
