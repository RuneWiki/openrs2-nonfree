import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "J")
	private long aLong223 = 0L;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "J")
	private long aLong224 = 0L;

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
	private int anInt7048 = 0;

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "[J")
	private final long[] aLongArray21 = new long[10];

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	private int anInt7049 = 1;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class102_Sub2() {
		this.aLong223 = System.nanoTime();
		this.aLong224 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)J")
	private long method6294() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong225;
		this.aLong225 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray21[this.anInt7048] = local6;
			if (this.anInt7049 < 1) {
				this.anInt7049++;
			}
			this.anInt7048 = (this.anInt7048 + 1) % 10;
		}
		@Pc(47) long local47 = (long) 0;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt7049; local49++) {
			local47 += this.aLongArray21[(this.anInt7048 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt7049;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
	@Override
	public void method8796() {
		this.aLong225 = 0L;
		if (this.aLong224 > this.aLong223) {
			this.aLong223 += this.aLong224 - this.aLong223;
		}
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(B)J")
	@Override
	public long method8799() {
		return this.aLong223;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8795(@OriginalArg(0) long arg0) {
		if (this.aLong223 < this.aLong224) {
			this.aLong225 += this.aLong224 - this.aLong223;
			this.aLong223 += this.aLong224 - this.aLong223;
			this.aLong224 += arg0;
			return 1;
		}
		@Pc(41) int local41 = 0;
		do {
			this.aLong224 += arg0;
			local41++;
		} while (local41 < 10 && this.aLong223 > this.aLong224);
		if (this.aLong224 < this.aLong223) {
			this.aLong224 = this.aLong223;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)J")
	@Override
	protected long method8797() {
		this.aLong223 += this.method6294();
		return this.aLong224 > this.aLong223 ? (this.aLong224 - this.aLong223) / 1000000L : 0L;
	}
}
