import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class228_Sub2 extends Class228 {

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	private int anInt7018 = 0;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	private int anInt7019 = 1;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class228_Sub2() {
		this.aLong195 = System.nanoTime();
		this.aLong194 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	@Override
	public void method6031() {
		if (this.aLong194 > this.aLong195) {
			this.aLong195 += this.aLong194 - this.aLong195;
		}
		this.aLong196 = 0L;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method6033(@OriginalArg(0) long arg0) {
		if (this.aLong195 < this.aLong194) {
			this.aLong196 += this.aLong194 - this.aLong195;
			this.aLong195 += this.aLong194 - this.aLong195;
			this.aLong194 += arg0;
			return 1;
		}
		@Pc(39) int local39 = 0;
		do {
			this.aLong194 += arg0;
			local39++;
		} while (local39 < 10 && this.aLong195 > this.aLong194);
		if (this.aLong194 < this.aLong195) {
			this.aLong194 = this.aLong195;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J")
	@Override
	public long method6032() {
		return this.aLong195;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)J")
	@Override
	protected long method6036() {
		this.aLong195 += this.method5877();
		return this.aLong195 < this.aLong194 ? (this.aLong194 - this.aLong195) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)J")
	private long method5877() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong196;
		this.aLong196 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt7018] = local7;
			if (this.anInt7019 < 1) {
				this.anInt7019++;
			}
			this.anInt7018 = (this.anInt7018 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt7019; local56++) {
			local54 += this.aLongArray12[(this.anInt7018 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt7019;
	}
}
