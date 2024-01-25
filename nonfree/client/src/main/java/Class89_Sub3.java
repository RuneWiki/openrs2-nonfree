import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class89_Sub3 extends Class89 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
	private long aLong127 = 0L;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	private int anInt3820 = 1;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	private int anInt3819 = 0;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class89_Sub3() {
		this.aLong125 = System.nanoTime();
		this.aLong126 = System.nanoTime();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)J")
	@Override
	public long method3425() {
		return this.aLong125;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
	@Override
	public int method3423(@OriginalArg(1) int arg0) {
		this.aLong125 += this.method3427();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong126 > this.aLong125) {
			Static77.method1653((this.aLong126 - this.aLong125) / 1000000L);
			this.aLong127 += this.aLong126 - this.aLong125;
			this.aLong125 += this.aLong126 - this.aLong125;
			this.aLong126 += local19;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong126 += local19;
		} while (local31 < 10 && this.aLong126 < this.aLong125);
		if (this.aLong125 > this.aLong126) {
			this.aLong126 = this.aLong125;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)J")
	private long method3427() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong127;
		this.aLong127 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt3819] = local7;
			this.anInt3819 = (this.anInt3819 + 1) % 10;
			if (this.anInt3820 < 1) {
				this.anInt3820++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt3820; local49++) {
			local47 += this.aLongArray4[(this.anInt3819 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt3820;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	@Override
	public void method3424() {
		if (this.aLong126 > this.aLong125) {
			this.aLong125 += this.aLong126 - this.aLong125;
		}
		this.aLong127 = 0L;
	}
}
