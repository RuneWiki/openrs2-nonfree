import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	private int anInt3989 = 0;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[J")
	private long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	private int anInt3990 = 1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.aLong170 = System.nanoTime();
		this.aLong171 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)J")
	private long method3367() {
		@Pc(8) long local8 = System.nanoTime();
		@Pc(14) long local14 = local8 - this.aLong172;
		this.aLong172 = local8;
		@Pc(19) long local19 = 0L;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray7[this.anInt3989] = local14;
			if (this.anInt3990 < 1) {
				this.anInt3990++;
			}
			this.anInt3989 = (this.anInt3989 + 1) % 10;
		}
		for (@Pc(60) int local60 = 1; local60 <= this.anInt3990; local60++) {
			local19 += this.aLongArray7[(this.anInt3989 + 10 - local60) % 10];
		}
		return local19 / (long) this.anInt3990;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)J")
	@Override
	public long method5033() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	@Override
	public void method5034() {
		if (this.aLong171 > this.aLong170) {
			this.aLong170 += this.aLong171 - this.aLong170;
		}
		this.aLong172 = 0L;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)I")
	@Override
	public int method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		Static150.method2552((long) arg1);
		this.aLong170 += this.method3367();
		if (this.aLong170 < this.aLong171) {
			Static150.method2552((this.aLong171 - this.aLong170) / 1000000L);
			this.aLong172 += this.aLong171 - this.aLong170;
			this.aLong170 += this.aLong171 - this.aLong170;
			this.aLong171 += local4;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong171 += local4;
		} while (local29 < 10 && this.aLong171 < this.aLong170);
		if (this.aLong170 > this.aLong171) {
			this.aLong171 = this.aLong170;
		}
		return local29;
	}
}
