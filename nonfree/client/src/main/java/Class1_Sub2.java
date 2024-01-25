import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	private int anInt7282 = 0;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	private int anInt7283 = 1;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6834(@OriginalArg(1) long arg0) {
		if (this.aLong203 > this.aLong202) {
			this.aLong204 += this.aLong203 - this.aLong202;
			this.aLong202 += this.aLong203 - this.aLong202;
			this.aLong203 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong203 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong203 < this.aLong202);
		if (this.aLong203 < this.aLong202) {
			this.aLong203 = this.aLong202;
		}
		return local42;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)J")
	@Override
	public long method6839() {
		return this.aLong202;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)J")
	private long method5927() {
		@Pc(4) long local4 = Static105.method2132() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong204;
		this.aLong204 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray7[this.anInt7282] = local10;
			this.anInt7282 = (this.anInt7282 + 1) % 10;
			if (this.anInt7283 < 10) {
				this.anInt7283++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt7283; local58++) {
			local51 += this.aLongArray7[(this.anInt7282 + 10 - local58) % 10];
		}
		return local51 / (long) this.anInt7283;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	@Override
	public void method6838() {
		if (this.aLong203 > this.aLong202) {
			this.aLong202 += this.aLong203 - this.aLong202;
		}
		this.aLong204 = 0L;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)J")
	@Override
	protected long method6840() {
		this.aLong202 += this.method5927();
		return this.aLong203 > this.aLong202 ? (this.aLong203 - this.aLong202) / 1000000L : 0L;
	}
}
