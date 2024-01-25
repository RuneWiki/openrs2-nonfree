import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class173_Sub2 extends Class173 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "J")
	private long aLong185 = 0L;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private int anInt6393 = 0;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "J")
	private long aLong186 = 0L;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	private int anInt6394 = 1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class173_Sub2() {
		this.aLong185 = this.aLong184 = jagmisc.nanoTime();
		if (this.aLong184 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J")
	private long method4984() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong186;
		this.aLong186 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt6393] = local7;
			if (this.anInt6394 < 1) {
				this.anInt6394++;
			}
			this.anInt6393 = (this.anInt6393 + 1) % 10;
		}
		@Pc(44) long local44 = 0L;
		for (@Pc(46) int local46 = 1; local46 <= this.anInt6394; local46++) {
			local44 += this.aLongArray6[(this.anInt6393 + 10 - local46) % 10];
		}
		return local44 / (long) this.anInt6394;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public void method5213() {
		this.aLong186 = 0;
		if (this.aLong185 > this.aLong184) {
			this.aLong184 += this.aLong185 - this.aLong184;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	@Override
	public int method5212(@OriginalArg(0) int arg0) {
		this.aLong184 += this.method4984();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong185 > this.aLong184) {
			Static20.method1515((this.aLong185 - this.aLong184) / 1000000L);
			this.aLong186 += this.aLong185 - this.aLong184;
			this.aLong184 += this.aLong185 - this.aLong184;
			this.aLong185 += local12;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			local26++;
			this.aLong185 += local12;
		} while (local26 < 10 && this.aLong184 > this.aLong185);
		if (this.aLong184 > this.aLong185) {
			this.aLong185 = this.aLong184;
		}
		return local26;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J")
	@Override
	public long method5211() {
		return this.aLong184;
	}
}
