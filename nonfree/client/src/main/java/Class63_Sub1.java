import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "J")
	private long aLong43 = 0L;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	private int anInt1641 = 1;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private int anInt1642 = 0;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class63_Sub1() {
		this.aLong44 = this.aLong43 = jagmisc.nanoTime();
		if (this.aLong43 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	@Override
	public int method5556(@OriginalArg(1) int arg0) {
		this.aLong43 += this.method1421();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong43 < this.aLong44) {
			Static67.method1189((this.aLong44 - this.aLong43) / 1000000L);
			this.aLong45 += this.aLong44 - this.aLong43;
			this.aLong43 += this.aLong44 - this.aLong43;
			this.aLong44 += local18;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong44 += local18;
			local69++;
		} while (local69 < 10 && this.aLong43 > this.aLong44);
		if (this.aLong44 < this.aLong43) {
			this.aLong44 = this.aLong43;
		}
		return local69;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5557() {
		this.aLong45 = 0L;
		if (this.aLong43 < this.aLong44) {
			this.aLong43 += this.aLong44 - this.aLong43;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J")
	@Override
	public long method5558() {
		return this.aLong43;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)J")
	private long method1421() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong45;
		this.aLong45 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt1642] = local7;
			this.anInt1642 = (this.anInt1642 + 1) % 10;
			if (this.anInt1641 < 1) {
				this.anInt1641++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt1641; local50++) {
			local48 += this.aLongArray2[(this.anInt1642 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt1641;
	}
}
