import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	private int anInt1541 = 1;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "J")
	private long aLong46 = 0L;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	private int anInt1540 = 0;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)J")
	private long method1200() {
		@Pc(6) long local6 = Static118.method1934() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong46;
		this.aLong46 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt1540] = local12;
			this.anInt1540 = (this.anInt1540 + 1) % 10;
			if (this.anInt1541 < 10) {
				this.anInt1541++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt1541; local58++) {
			local49 += this.aLongArray1[(this.anInt1540 + 10 - local58) % 10];
		}
		return local49 / (long) this.anInt1541;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
	@Override
	public int method3067(@OriginalArg(1) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong45 += this.method1200();
		if (this.aLong44 > this.aLong45) {
			Static360.method4758((this.aLong44 - this.aLong45) / 1000000L);
			this.aLong46 += this.aLong44 - this.aLong45;
			this.aLong45 += this.aLong44 - this.aLong45;
			this.aLong44 += local9;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong44 += local9;
		} while (local68 < 10 && this.aLong44 < this.aLong45);
		if (this.aLong45 > this.aLong44) {
			this.aLong44 = this.aLong45;
		}
		return local68;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	@Override
	public void method3065() {
		this.aLong46 = 0L;
		if (this.aLong44 > this.aLong45) {
			this.aLong45 += this.aLong44 - this.aLong45;
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)J")
	@Override
	public long method3068() {
		return this.aLong45;
	}
}
