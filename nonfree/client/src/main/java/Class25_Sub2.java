import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	private int anInt1787 = 0;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private int anInt1788 = 1;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[J")
	private long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class25_Sub2() {
		this.aLong70 = System.nanoTime();
		this.aLong71 = System.nanoTime();
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)J")
	@Override
	public long method1357() {
		return this.aLong70;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZII)I")
	@Override
	public int method1355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		Static162.method2645((long) arg1);
		this.aLong70 += this.method1358();
		if (this.aLong71 > this.aLong70) {
			Static162.method2645((this.aLong71 - this.aLong70) / 1000000L);
			this.aLong72 += this.aLong71 - this.aLong70;
			this.aLong70 += this.aLong71 - this.aLong70;
			this.aLong71 += local4;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			this.aLong71 += local4;
			local32++;
		} while (local32 < 10 && this.aLong70 > this.aLong71);
		if (this.aLong70 > this.aLong71) {
			this.aLong71 = this.aLong70;
		}
		return local32;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	@Override
	public void method1352() {
		this.aLong72 = 0L;
		if (this.aLong71 > this.aLong70) {
			this.aLong70 += this.aLong71 - this.aLong70;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)J")
	private long method1358() {
		@Pc(8) long local8 = 0L;
		@Pc(10) long local10 = System.nanoTime();
		@Pc(16) long local16 = local10 - this.aLong72;
		this.aLong72 = local10;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray5[this.anInt1787] = local16;
			if (this.anInt1788 < 1) {
				this.anInt1788++;
			}
			this.anInt1787 = (this.anInt1787 + 1) % 10;
		}
		for (@Pc(59) int local59 = 1; local59 <= this.anInt1788; local59++) {
			local8 += this.aLongArray5[(this.anInt1787 + 10 - local59) % 10];
		}
		return local8 / (long) this.anInt1788;
	}
}
