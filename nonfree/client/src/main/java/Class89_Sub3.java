import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class89_Sub3 extends Class89 {

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "J")
	private long aLong205 = 0L;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "J")
	private long aLong206 = 0L;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
	private int anInt8092 = 1;

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
	private int anInt8093 = 0;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
	public Class89_Sub3() {
		this.aLong206 = this.aLong205 = jagmisc.nanoTime();
		if (this.aLong205 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)J")
	@Override
	public long method6694() {
		return this.aLong205;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)J")
	@Override
	protected long method6692() {
		this.aLong205 += this.method6701();
		return this.aLong205 < this.aLong206 ? (this.aLong206 - this.aLong205) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method6700(@OriginalArg(1) long arg0) {
		if (this.aLong206 > this.aLong205) {
			this.aLong207 += this.aLong206 - this.aLong205;
			this.aLong205 += this.aLong206 - this.aLong205;
			this.aLong206 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			this.aLong206 += arg0;
			local45++;
		} while (local45 < 10 && this.aLong205 > this.aLong206);
		if (this.aLong206 < this.aLong205) {
			this.aLong206 = this.aLong205;
		}
		return local45;
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)J")
	private long method6701() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong207;
		this.aLong207 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray19[this.anInt8093] = local6;
			if (this.anInt8092 < 1) {
				this.anInt8092++;
			}
			this.anInt8093 = (this.anInt8093 + 1) % 10;
		}
		@Pc(50) long local50 = (long) 0;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt8092; local52++) {
			local50 += this.aLongArray19[(this.anInt8093 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt8092;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6696() {
		if (this.aLong205 < this.aLong206) {
			this.aLong205 += this.aLong206 - this.aLong205;
		}
		this.aLong207 = 0L;
	}
}
