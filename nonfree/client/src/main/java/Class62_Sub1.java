import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	private int anInt1995 = 1;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "J")
	private long aLong64 = 0L;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "I")
	private int anInt1994 = 0;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class62_Sub1() {
		this.aLong62 = System.nanoTime();
		this.aLong63 = System.nanoTime();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
	@Override
	public int method3914(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong62 += this.method1744();
		if (this.aLong63 > this.aLong62) {
			Static190.method3690((this.aLong63 - this.aLong62) / 1000000L);
			this.aLong64 += this.aLong63 - this.aLong62;
			this.aLong62 += this.aLong63 - this.aLong62;
			this.aLong63 += local10;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			this.aLong63 += local10;
			local70++;
		} while (local70 < 10 && this.aLong62 > this.aLong63);
		if (this.aLong62 > this.aLong63) {
			this.aLong63 = this.aLong62;
		}
		return local70;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)J")
	@Override
	public long method3917() {
		return this.aLong62;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)J")
	private long method1744() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong64;
		this.aLong64 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray3[this.anInt1994] = local6;
			this.anInt1994 = (this.anInt1994 + 1) % 10;
			if (this.anInt1995 < 1) {
				this.anInt1995++;
			}
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt1995; local53++) {
			local45 += this.aLongArray3[(this.anInt1994 + 10 - local53) % 10];
		}
		return local45 / (long) this.anInt1995;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	@Override
	public void method3920() {
		this.aLong64 = 0L;
		if (this.aLong62 < this.aLong63) {
			this.aLong62 += this.aLong63 - this.aLong62;
		}
	}
}
