import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class145_Sub1 extends Class145 {

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "J")
	private long aLong105 = 0L;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	private int anInt3723 = 1;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	private int anInt3724 = 0;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class145_Sub1() {
		this.aLong104 = System.nanoTime();
		this.aLong103 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	@Override
	public void method8779() {
		this.aLong105 = 0L;
		if (this.aLong103 > this.aLong104) {
			this.aLong104 += this.aLong103 - this.aLong104;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8784(@OriginalArg(0) long arg0) {
		if (this.aLong104 < this.aLong103) {
			this.aLong105 += this.aLong103 - this.aLong104;
			this.aLong104 += this.aLong103 - this.aLong104;
			this.aLong103 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			local14++;
			this.aLong103 += arg0;
		} while (local14 < 10 && this.aLong104 > this.aLong103);
		if (this.aLong103 < this.aLong104) {
			this.aLong103 = this.aLong104;
		}
		return local14;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)J")
	@Override
	protected long method8781() {
		this.aLong104 += this.method3297();
		return this.aLong104 < this.aLong103 ? (this.aLong103 - this.aLong104) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)J")
	private long method3297() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong105;
		this.aLong105 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt3724] = local7;
			this.anInt3724 = (this.anInt3724 + 1) % 10;
			if (this.anInt3723 < 1) {
				this.anInt3723++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt3723; local59++) {
			local57 += this.aLongArray4[(this.anInt3724 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt3723;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)J")
	@Override
	public long method8780() {
		return this.aLong104;
	}
}
