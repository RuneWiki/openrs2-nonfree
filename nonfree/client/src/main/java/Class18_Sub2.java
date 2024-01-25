import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "J")
	private long aLong149 = 0L;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "J")
	private long aLong150 = 0L;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	private int anInt5155 = 1;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	private int anInt5156 = 0;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class18_Sub2() {
		this.aLong149 = this.aLong150 = jagmisc.nanoTime();
		if (this.aLong150 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)J")
	private long method4427() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong151;
		this.aLong151 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt5156] = local7;
			if (this.anInt5155 < 1) {
				this.anInt5155++;
			}
			this.anInt5156 = (this.anInt5156 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt5155; local58++) {
			local48 += this.aLongArray7[(this.anInt5156 + 10 - local58) % 10];
		}
		return local48 / (long) this.anInt5155;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	@Override
	public void method4635() {
		this.aLong151 = 0L;
		if (this.aLong149 > this.aLong150) {
			this.aLong150 += this.aLong149 - this.aLong150;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
	@Override
	public long method4639() {
		return this.aLong150;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)I")
	@Override
	public int method4636(@OriginalArg(0) int arg0) {
		this.aLong150 += this.method4427();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong150 < this.aLong149) {
			Static244.method4311((this.aLong149 - this.aLong150) / 1000000L);
			this.aLong151 += this.aLong149 - this.aLong150;
			this.aLong150 += this.aLong149 - this.aLong150;
			this.aLong149 += local12;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong149 += local12;
		} while (local29 < 10 && this.aLong149 < this.aLong150);
		if (this.aLong150 > this.aLong149) {
			this.aLong149 = this.aLong150;
		}
		return local29;
	}
}
