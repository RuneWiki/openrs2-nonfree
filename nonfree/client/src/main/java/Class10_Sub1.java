import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!an", name = "h", descriptor = "J")
	private long aLong14 = 0L;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "J")
	private long aLong15 = 0L;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	private int anInt263 = 1;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "J")
	private long aLong16 = 0L;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	private int anInt264 = 0;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class10_Sub1() {
		this.aLong15 = this.aLong14 = jagmisc.nanoTime();
		if (this.aLong14 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)V")
	@Override
	public void method3939() {
		this.aLong16 = 0L;
		if (this.aLong15 > this.aLong14) {
			this.aLong14 += this.aLong15 - this.aLong14;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)I")
	@Override
	public int method3935(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong14 += this.method253();
		if (this.aLong14 < this.aLong15) {
			Static20.method408((this.aLong15 - this.aLong14) / 1000000L);
			this.aLong16 += this.aLong15 - this.aLong14;
			this.aLong14 += this.aLong15 - this.aLong14;
			this.aLong15 += local4;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			this.aLong15 += local4;
			local29++;
		} while (local29 < 10 && this.aLong15 < this.aLong14);
		if (this.aLong15 < this.aLong14) {
			this.aLong15 = this.aLong14;
		}
		return local29;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)J")
	@Override
	public long method3937() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)J")
	private long method253() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong16;
		this.aLong16 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt264] = local7;
			if (this.anInt263 < 1) {
				this.anInt263++;
			}
			this.anInt264 = (this.anInt264 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt263; local48++) {
			local46 += this.aLongArray1[(this.anInt264 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt263;
	}
}
