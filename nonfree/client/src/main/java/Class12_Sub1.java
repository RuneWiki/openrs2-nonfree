import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "J")
	private long aLong160 = 0L;

	@OriginalMember(owner = "client!lha", name = "n", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
	private int anInt5843 = 1;

	@OriginalMember(owner = "client!lha", name = "m", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
	private int anInt5844 = 0;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	@Override
	public void method8266() {
		if (this.aLong162 < this.aLong160) {
			this.aLong162 += this.aLong160 - this.aLong162;
		}
		this.aLong161 = (long) 0;
	}

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "(B)J")
	@Override
	public long method8273() {
		return this.aLong162;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)J")
	@Override
	protected long method8271() {
		this.aLong162 += this.method4958();
		return this.aLong162 < this.aLong160 ? (this.aLong160 - this.aLong162) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8265(@OriginalArg(0) long arg0) {
		if (this.aLong162 < this.aLong160) {
			this.aLong161 += this.aLong160 - this.aLong162;
			this.aLong162 += this.aLong160 - this.aLong162;
			this.aLong160 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			this.aLong160 += arg0;
			local16++;
		} while (local16 < 10 && this.aLong160 < this.aLong162);
		if (this.aLong160 < this.aLong162) {
			this.aLong160 = this.aLong162;
		}
		return local16;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)J")
	private long method4958() {
		@Pc(4) long local4 = Static15.method380() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong161;
		this.aLong161 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray11[this.anInt5844] = local10;
			this.anInt5844 = (this.anInt5844 + 1) % 10;
			if (this.anInt5843 < 10) {
				this.anInt5843++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt5843; local53++) {
			local51 += this.aLongArray11[(this.anInt5844 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt5843;
	}
}
