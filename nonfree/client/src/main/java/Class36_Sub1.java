import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "J")
	private long aLong32 = 0L;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	private int anInt869 = 1;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	private int anInt870 = 0;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "J")
	private long aLong34 = 0L;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class36_Sub1() {
		this.aLong32 = System.nanoTime();
		this.aLong33 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)J")
	private long method829() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong34;
		this.aLong34 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt870] = local7;
			this.anInt870 = (this.anInt870 + 1) % 10;
			if (this.anInt869 < 1) {
				this.anInt869++;
			}
		}
		@Pc(51) long local51 = (long) 0;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt869; local53++) {
			local51 += this.aLongArray1[(this.anInt870 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt869;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)J")
	@Override
	public long method2252() {
		return this.aLong32;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2253(@OriginalArg(1) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong32 += this.method829();
		if (this.aLong33 > this.aLong32) {
			Static435.method5503((this.aLong33 - this.aLong32) / 1000000L);
			this.aLong34 += this.aLong33 - this.aLong32;
			this.aLong32 += this.aLong33 - this.aLong32;
			this.aLong33 += local9;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong33 += local9;
		} while (local25 < 10 && this.aLong32 > this.aLong33);
		if (this.aLong33 < this.aLong32) {
			this.aLong33 = this.aLong32;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	@Override
	public void method2248() {
		this.aLong34 = 0L;
		if (this.aLong32 < this.aLong33) {
			this.aLong32 += this.aLong33 - this.aLong32;
		}
	}
}
