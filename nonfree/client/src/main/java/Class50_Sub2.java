import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!md", name = "e", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private int anInt6868 = 0;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	private int anInt6869 = 1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class50_Sub2() {
		this.aLong166 = this.aLong167 = jagmisc.nanoTime();
		if (this.aLong167 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)J")
	private long method5872() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong168;
		this.aLong168 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt6868] = local7;
			if (this.anInt6869 < 1) {
				this.anInt6869++;
			}
			this.anInt6868 = (this.anInt6868 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt6869; local57++) {
			local48 += this.aLongArray14[(this.anInt6868 + 10 - local57) % 10];
		}
		return local48 / (long) this.anInt6869;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)J")
	@Override
	protected long method6599() {
		this.aLong167 += this.method5872();
		return this.aLong167 < this.aLong166 ? (this.aLong166 - this.aLong167) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	@Override
	public void method6597() {
		this.aLong168 = 0L;
		if (this.aLong166 > this.aLong167) {
			this.aLong167 += this.aLong166 - this.aLong167;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)J")
	@Override
	public long method6603() {
		return this.aLong167;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6600(@OriginalArg(1) long arg0) {
		if (this.aLong167 < this.aLong166) {
			this.aLong168 += this.aLong166 - this.aLong167;
			this.aLong167 += this.aLong166 - this.aLong167;
			this.aLong166 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong166 += arg0;
		} while (local45 < 10 && this.aLong167 > this.aLong166);
		if (this.aLong167 > this.aLong166) {
			this.aLong166 = this.aLong167;
		}
		return local45;
	}
}
