import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "J")
	private long aLong77 = 0L;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt2089 = 1;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	private int anInt2088 = 0;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class10_Sub2() {
		this.aLong76 = System.nanoTime();
		this.aLong75 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	@Override
	public void method3298() {
		if (this.aLong75 > this.aLong76) {
			this.aLong76 += this.aLong75 - this.aLong76;
		}
		this.aLong77 = 0L;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)J")
	private long method2270() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong77;
		this.aLong77 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt2088] = local7;
			this.anInt2088 = (this.anInt2088 + 1) % 10;
			if (this.anInt2089 < 1) {
				this.anInt2089++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt2089; local50++) {
			local48 += this.aLongArray3[(this.anInt2088 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt2089;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)J")
	@Override
	public long method3296() {
		return this.aLong76;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	@Override
	public int method3295(@OriginalArg(1) int arg0) {
		this.aLong76 += this.method2270();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong75 > this.aLong76) {
			Static278.method5283((this.aLong75 - this.aLong76) / 1000000L);
			this.aLong77 += this.aLong75 - this.aLong76;
			this.aLong76 += this.aLong75 - this.aLong76;
			this.aLong75 += local19;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong75 += local19;
			local31++;
		} while (local31 < 10 && this.aLong76 > this.aLong75);
		if (this.aLong76 > this.aLong75) {
			this.aLong75 = this.aLong76;
		}
		return local31;
	}
}
