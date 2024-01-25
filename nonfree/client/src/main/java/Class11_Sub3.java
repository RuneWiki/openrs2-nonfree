import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	private int anInt5873 = 1;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!td", name = "o", descriptor = "J")
	private long aLong185 = 0L;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt5874 = 0;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class11_Sub3() {
		this.aLong183 = System.nanoTime();
		this.aLong184 = System.nanoTime();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	@Override
	public int method5105(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong183 += this.method5113();
		if (this.aLong183 < this.aLong184) {
			Static163.method2863((this.aLong184 - this.aLong183) / 1000000L);
			this.aLong185 += this.aLong184 - this.aLong183;
			this.aLong183 += this.aLong184 - this.aLong183;
			this.aLong184 += local10;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			this.aLong184 += local10;
			local70++;
		} while (local70 < 10 && this.aLong183 > this.aLong184);
		if (this.aLong183 > this.aLong184) {
			this.aLong184 = this.aLong183;
		}
		return local70;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)J")
	@Override
	public long method5104() {
		return this.aLong183;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)J")
	private long method5113() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong185;
		this.aLong185 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt5874] = local7;
			if (this.anInt5873 < 1) {
				this.anInt5873++;
			}
			this.anInt5874 = (this.anInt5874 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5873; local51++) {
			local49 += this.aLongArray8[(this.anInt5874 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt5873;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public void method5107() {
		if (this.aLong183 < this.aLong184) {
			this.aLong183 += this.aLong184 - this.aLong183;
		}
		this.aLong185 = 0L;
	}
}
