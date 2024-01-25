import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
	private int anInt3262 = 0;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	private int anInt3263 = 1;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "J")
	private long aLong106 = 0L;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		if (this.aLong107 > this.aLong106) {
			this.aLong106 += this.aLong107 - this.aLong106;
		}
		this.aLong108 = 0L;
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)J")
	private long method2835() {
		@Pc(4) long local4 = Static279.method4058() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong108;
		this.aLong108 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt3262] = local10;
			this.anInt3262 = (this.anInt3262 + 1) % 10;
			if (this.anInt3263 < 10) {
				this.anInt3263++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt3263; local59++) {
			local57 += this.aLongArray4[(this.anInt3262 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt3263;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)J")
	@Override
	public long method3074() {
		return this.aLong106;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
	@Override
	public int method3069(@OriginalArg(1) int arg0) {
		this.aLong106 += this.method2835();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong106 < this.aLong107) {
			Static224.method3441((this.aLong107 - this.aLong106) / 1000000L);
			this.aLong108 += this.aLong107 - this.aLong106;
			this.aLong106 += this.aLong107 - this.aLong106;
			this.aLong107 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong107 += local18;
		} while (local30 < 10 && this.aLong107 < this.aLong106);
		if (this.aLong106 > this.aLong107) {
			this.aLong107 = this.aLong106;
		}
		return local30;
	}
}
