import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "J")
	private long aLong94 = 0L;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
	private long aLong93 = 0L;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	private int anInt3707 = 0;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "J")
	private long aLong95 = 0L;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	private int anInt3708 = 1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class59_Sub2() {
		this.aLong93 = System.nanoTime();
		this.aLong94 = System.nanoTime();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
	@Override
	public long method4364() {
		return this.aLong93;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
	@Override
	public int method4362(@OriginalArg(0) int arg0) {
		this.aLong93 += this.method2966();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong93 < this.aLong94) {
			Static443.method5991((this.aLong94 - this.aLong93) / 1000000L);
			this.aLong95 += this.aLong94 - this.aLong93;
			this.aLong93 += this.aLong94 - this.aLong93;
			this.aLong94 += local12;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			local65++;
			this.aLong94 += local12;
		} while (local65 < 10 && this.aLong94 < this.aLong93);
		if (this.aLong93 > this.aLong94) {
			this.aLong94 = this.aLong93;
		}
		return local65;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)J")
	private long method2966() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong95;
		this.aLong95 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt3707] = local7;
			this.anInt3707 = (this.anInt3707 + 1) % 10;
			if (this.anInt3708 < 1) {
				this.anInt3708++;
			}
		}
		@Pc(59) long local59 = 0L;
		for (@Pc(61) int local61 = 1; local61 <= this.anInt3708; local61++) {
			local59 += this.aLongArray3[(this.anInt3707 + 10 - local61) % 10];
		}
		return local59 / (long) this.anInt3708;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	@Override
	public void method4363() {
		if (this.aLong93 < this.aLong94) {
			this.aLong93 += this.aLong94 - this.aLong93;
		}
		this.aLong95 = 0L;
	}
}
