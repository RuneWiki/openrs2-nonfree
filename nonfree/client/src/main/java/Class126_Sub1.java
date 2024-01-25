import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class126_Sub1 extends Class126 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private int anInt3698 = 1;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "J")
	private long aLong138 = 0L;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	private int anInt3699 = 0;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!md", name = "k", descriptor = "J")
	private long aLong137 = 0L;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J")
	@Override
	public long method5252() {
		return this.aLong136;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)J")
	private long method3418() {
		@Pc(4) long local4 = Static284.method4783() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong138;
		this.aLong138 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray6[this.anInt3699] = local10;
			this.anInt3699 = (this.anInt3699 + 1) % 10;
			if (this.anInt3698 < 10) {
				this.anInt3698++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3698; local56++) {
			local54 += this.aLongArray6[(this.anInt3699 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt3698;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
	@Override
	public int method5255(@OriginalArg(0) int arg0) {
		this.aLong136 += this.method3418();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong136 < this.aLong137) {
			Static105.method2138((this.aLong137 - this.aLong136) / 1000000L);
			this.aLong138 += this.aLong137 - this.aLong136;
			this.aLong136 += this.aLong137 - this.aLong136;
			this.aLong137 += local20;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			this.aLong137 += local20;
			local72++;
		} while (local72 < 10 && this.aLong137 < this.aLong136);
		if (this.aLong136 > this.aLong137) {
			this.aLong137 = this.aLong136;
		}
		return local72;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	@Override
	public void method5254() {
		this.aLong138 = 0L;
		if (this.aLong137 > this.aLong136) {
			this.aLong136 += this.aLong137 - this.aLong136;
		}
	}
}
