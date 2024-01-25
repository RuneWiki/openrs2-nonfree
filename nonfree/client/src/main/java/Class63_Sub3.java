import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "J")
	private long aLong206 = 0L;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
	private int anInt7181 = 0;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
	private int anInt7182 = 1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class63_Sub3() {
		this.aLong207 = System.nanoTime();
		this.aLong206 = System.nanoTime();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5557() {
		if (this.aLong206 > this.aLong207) {
			this.aLong207 += this.aLong206 - this.aLong207;
		}
		this.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
	@Override
	public int method5556(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong207 += this.method5560();
		if (this.aLong206 > this.aLong207) {
			Static67.method1189((this.aLong206 - this.aLong207) / 1000000L);
			this.aLong208 += this.aLong206 - this.aLong207;
			this.aLong207 += this.aLong206 - this.aLong207;
			this.aLong206 += local4;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			local64++;
			this.aLong206 += local4;
		} while (local64 < 10 && this.aLong206 < this.aLong207);
		if (this.aLong207 > this.aLong206) {
			this.aLong206 = this.aLong207;
		}
		return local64;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)J")
	@Override
	public long method5558() {
		return this.aLong207;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)J")
	private long method5560() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong208;
		this.aLong208 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt7181] = local7;
			this.anInt7181 = (this.anInt7181 + 1) % 10;
			if (this.anInt7182 < 1) {
				this.anInt7182++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt7182; local56++) {
			local49 += this.aLongArray9[(this.anInt7181 + 10 - local56) % 10];
		}
		return local49 / (long) this.anInt7182;
	}
}
