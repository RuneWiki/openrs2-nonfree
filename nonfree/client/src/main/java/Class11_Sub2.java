import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	private int anInt3816 = 1;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	private int anInt3817 = 0;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class11_Sub2() {
		this.aLong108 = this.aLong107 = jagmisc.nanoTime();
		if (this.aLong107 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	@Override
	public int method5105(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong107 += this.method3244();
		if (this.aLong108 > this.aLong107) {
			Static163.method2863((this.aLong108 - this.aLong107) / 1000000L);
			this.aLong109 += this.aLong108 - this.aLong107;
			this.aLong107 += this.aLong108 - this.aLong107;
			this.aLong108 += local10;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			local26++;
			this.aLong108 += local10;
		} while (local26 < 10 && this.aLong107 > this.aLong108);
		if (this.aLong107 > this.aLong108) {
			this.aLong108 = this.aLong107;
		}
		return local26;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
	@Override
	public long method5104() {
		return this.aLong107;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method5107() {
		if (this.aLong108 > this.aLong107) {
			this.aLong107 += this.aLong108 - this.aLong107;
		}
		this.aLong109 = 0L;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)J")
	private long method3244() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong109;
		this.aLong109 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt3817] = local7;
			this.anInt3817 = (this.anInt3817 + 1) % 10;
			if (this.anInt3816 < 1) {
				this.anInt3816++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt3816; local50++) {
			local48 += this.aLongArray6[(this.anInt3817 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt3816;
	}
}
