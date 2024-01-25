import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "J")
	private long aLong32 = 0L;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	private int anInt631 = 1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "J")
	private long aLong34 = 0L;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	private int anInt632 = 0;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class21_Sub1() {
		this.aLong33 = System.nanoTime();
		this.aLong32 = System.nanoTime();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method5369() {
		this.aLong34 = 0L;
		if (this.aLong32 > this.aLong33) {
			this.aLong33 += this.aLong32 - this.aLong33;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)J")
	private long method534() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong34;
		this.aLong34 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt632] = local7;
			this.anInt632 = (this.anInt632 + 1) % 10;
			if (this.anInt631 < 1) {
				this.anInt631++;
			}
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt631; local60++) {
			local58 += this.aLongArray8[(this.anInt632 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt631;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5373(@OriginalArg(0) int arg0) {
		this.aLong33 += this.method534();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong32 > this.aLong33) {
			Static140.method2004((this.aLong32 - this.aLong33) / 1000000L);
			this.aLong34 += this.aLong32 - this.aLong33;
			this.aLong33 += this.aLong32 - this.aLong33;
			this.aLong32 += local17;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong32 += local17;
		} while (local68 < 10 && this.aLong33 > this.aLong32);
		if (this.aLong33 > this.aLong32) {
			this.aLong32 = this.aLong33;
		}
		return local68;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)J")
	@Override
	public long method5371() {
		return this.aLong33;
	}
}
