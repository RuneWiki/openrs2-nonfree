import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "J")
	private long aLong180 = 0L;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	private int anInt5740 = 1;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	private int anInt5741 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class50_Sub2() {
		this.aLong181 = System.nanoTime();
		this.aLong180 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)J")
	@Override
	public long method5057() {
		return this.aLong181;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)J")
	private long method4934() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong182;
		this.aLong182 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt5741] = local7;
			this.anInt5741 = (this.anInt5741 + 1) % 10;
			if (this.anInt5740 < 1) {
				this.anInt5740++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt5740; local50++) {
			local48 += this.aLongArray6[(this.anInt5741 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt5740;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
	@Override
	public int method5055(@OriginalArg(1) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong181 += this.method4934();
		if (this.aLong180 > this.aLong181) {
			Static57.method5056((this.aLong180 - this.aLong181) / 1000000L);
			this.aLong182 += this.aLong180 - this.aLong181;
			this.aLong181 += this.aLong180 - this.aLong181;
			this.aLong180 += local12;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong180 += local12;
		} while (local32 < 10 && this.aLong181 > this.aLong180);
		if (this.aLong180 < this.aLong181) {
			this.aLong180 = this.aLong181;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	@Override
	public void method5053() {
		if (this.aLong181 < this.aLong180) {
			this.aLong181 += this.aLong180 - this.aLong181;
		}
		this.aLong182 = 0L;
	}
}
