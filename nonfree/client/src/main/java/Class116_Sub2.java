import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
	private int anInt8080 = 1;

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
	private int anInt8079 = 0;

	@OriginalMember(owner = "client!qaa", name = "l", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!qaa", name = "m", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)J")
	@Override
	protected long method7963() {
		this.aLong200 += this.method6758();
		return this.aLong202 > this.aLong200 ? (this.aLong202 - this.aLong200) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7958(@OriginalArg(1) long arg0) {
		if (this.aLong202 > this.aLong200) {
			this.aLong201 += this.aLong202 - this.aLong200;
			this.aLong200 += this.aLong202 - this.aLong200;
			this.aLong202 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			local46++;
			this.aLong202 += arg0;
		} while (local46 < 10 && this.aLong202 < this.aLong200);
		if (this.aLong200 > this.aLong202) {
			this.aLong202 = this.aLong200;
		}
		return local46;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7962() {
		this.aLong201 = 0L;
		if (this.aLong202 > this.aLong200) {
			this.aLong200 += this.aLong202 - this.aLong200;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)J")
	private long method6758() {
		@Pc(10) long local10 = Static444.method6719() * 1000000L;
		@Pc(16) long local16 = local10 - this.aLong201;
		this.aLong201 = local10;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray12[this.anInt8079] = local16;
			this.anInt8079 = (this.anInt8079 + 1) % 10;
			if (this.anInt8080 < 10) {
				this.anInt8080++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt8080; local59++) {
			local57 += this.aLongArray12[(this.anInt8079 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt8080;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)J")
	@Override
	public long method7956() {
		return this.aLong200;
	}
}
