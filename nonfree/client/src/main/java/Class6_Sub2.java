import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private int anInt4101 = 1;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	private int anInt4102 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
	@Override
	public long method4655() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	@Override
	public void method4659() {
		if (this.aLong123 < this.aLong122) {
			this.aLong123 += this.aLong122 - this.aLong123;
		}
		this.aLong124 = 0L;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)J")
	private long method3706() {
		@Pc(11) long local11 = Static208.method3879() * 1000000L;
		@Pc(17) long local17 = local11 - this.aLong124;
		this.aLong124 = local11;
		if (local17 > -5000000000L && local17 < 5000000000L) {
			this.aLongArray4[this.anInt4102] = local17;
			if (this.anInt4101 < 10) {
				this.anInt4101++;
			}
			this.anInt4102 = (this.anInt4102 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4101; local58++) {
			local56 += this.aLongArray4[(this.anInt4102 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt4101;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I")
	@Override
	public int method4658(@OriginalArg(0) int arg0) {
		this.aLong123 += this.method3706();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong123 < this.aLong122) {
			Static249.method4396((this.aLong122 - this.aLong123) / 1000000L);
			this.aLong124 += this.aLong122 - this.aLong123;
			this.aLong123 += this.aLong122 - this.aLong123;
			this.aLong122 += local20;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong122 += local20;
		} while (local32 < 10 && this.aLong123 > this.aLong122);
		if (this.aLong122 < this.aLong123) {
			this.aLong122 = this.aLong123;
		}
		return local32;
	}
}
