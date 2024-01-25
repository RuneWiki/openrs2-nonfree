import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class74_Sub3 extends Class74 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "J")
	private long aLong221 = 0L;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "J")
	private long aLong222 = 0L;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
	private long aLong223 = 0L;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	private int anInt7848 = 1;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	private int anInt7849 = 0;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class74_Sub3() {
		this.aLong221 = this.aLong222 = jagmisc.nanoTime();
		if (this.aLong222 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J")
	@Override
	public long method6076() {
		return this.aLong222;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)I")
	@Override
	public int method6075(@OriginalArg(0) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong222 += this.method6080();
		if (this.aLong222 < this.aLong221) {
			Static289.method4249((this.aLong221 - this.aLong222) / 1000000L);
			this.aLong223 += this.aLong221 - this.aLong222;
			this.aLong222 += this.aLong221 - this.aLong222;
			this.aLong221 += local11;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			this.aLong221 += local11;
			local67++;
		} while (local67 < 10 && this.aLong222 > this.aLong221);
		if (this.aLong221 < this.aLong222) {
			this.aLong221 = this.aLong222;
		}
		return local67;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)J")
	private long method6080() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong223;
		this.aLong223 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt7849] = local7;
			this.anInt7849 = (this.anInt7849 + 1) % 10;
			if (this.anInt7848 < 1) {
				this.anInt7848++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt7848; local58++) {
			local48 += this.aLongArray9[(this.anInt7849 + 10 - local58) % 10];
		}
		return local48 / (long) this.anInt7848;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	@Override
	public void method6077() {
		if (this.aLong221 > this.aLong222) {
			this.aLong222 += this.aLong221 - this.aLong222;
		}
		this.aLong223 = 0L;
	}
}
