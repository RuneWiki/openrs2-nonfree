import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "J")
	private long aLong218 = 0L;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "J")
	private long aLong219 = 0L;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "J")
	private long aLong220 = 0L;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	private int anInt5933 = 1;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	private int anInt5934 = 0;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class129_Sub2() {
		this.aLong218 = System.nanoTime();
		this.aLong219 = System.nanoTime();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	@Override
	public int method5342(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong218 += this.method4989();
		if (this.aLong218 < this.aLong219) {
			Static270.method5481((this.aLong219 - this.aLong218) / 1000000L);
			this.aLong220 += this.aLong219 - this.aLong218;
			this.aLong218 += this.aLong219 - this.aLong218;
			this.aLong219 += local4;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			this.aLong219 += local4;
			local29++;
		} while (local29 < 10 && this.aLong219 < this.aLong218);
		if (this.aLong219 < this.aLong218) {
			this.aLong219 = this.aLong218;
		}
		return local29;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	@Override
	public void method5343() {
		this.aLong220 = 0L;
		if (this.aLong218 < this.aLong219) {
			this.aLong218 += this.aLong219 - this.aLong218;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)J")
	private long method4989() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong220;
		this.aLong220 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt5934] = local7;
			if (this.anInt5933 < 1) {
				this.anInt5933++;
			}
			this.anInt5934 = (this.anInt5934 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt5933; local59++) {
			local51 += this.aLongArray6[(this.anInt5934 + 10 - local59) % 10];
		}
		return local51 / (long) this.anInt5933;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)J")
	@Override
	public long method5345() {
		return this.aLong218;
	}
}
