import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	private int anInt1456 = 1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "J")
	private long aLong46 = 0L;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	private int anInt1457 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	@Override
	public void method4765() {
		this.aLong46 = 0L;
		if (this.aLong44 < this.aLong45) {
			this.aLong44 += this.aLong45 - this.aLong44;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)J")
	private long method1344() {
		@Pc(4) long local4 = Static220.method3314() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong46;
		this.aLong46 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray1[this.anInt1457] = local10;
			this.anInt1457 = (this.anInt1457 + 1) % 10;
			if (this.anInt1456 < 10) {
				this.anInt1456++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt1456; local55++) {
			local53 += this.aLongArray1[(this.anInt1457 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt1456;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)J")
	@Override
	public long method4763() {
		return this.aLong44;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
	@Override
	public int method4764(@OriginalArg(0) int arg0) {
		this.aLong44 += this.method1344();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong44 < this.aLong45) {
			Static328.method5696((this.aLong45 - this.aLong44) / 1000000L);
			this.aLong46 += this.aLong45 - this.aLong44;
			this.aLong44 += this.aLong45 - this.aLong44;
			this.aLong45 += local17;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			local64++;
			this.aLong45 += local17;
		} while (local64 < 10 && this.aLong45 < this.aLong44);
		if (this.aLong45 < this.aLong44) {
			this.aLong45 = this.aLong44;
		}
		return local64;
	}
}
