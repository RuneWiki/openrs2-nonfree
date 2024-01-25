import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "J")
	private long aLong78 = 0L;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	private int anInt2806 = 1;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	private int anInt2807 = 0;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class119_Sub1() {
		this.aLong78 = System.nanoTime();
		this.aLong79 = System.nanoTime();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)J")
	@Override
	protected long method4145() {
		this.aLong78 += this.method2353();
		return this.aLong79 > this.aLong78 ? (this.aLong79 - this.aLong78) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)J")
	private long method2353() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong80;
		this.aLong80 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray9[this.anInt2807] = local6;
			if (this.anInt2806 < 1) {
				this.anInt2806++;
			}
			this.anInt2807 = (this.anInt2807 + 1) % 10;
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(47) int local47 = 1; local47 <= this.anInt2806; local47++) {
			local45 += this.aLongArray9[(this.anInt2807 + 10 - local47) % 10];
		}
		return local45 / (long) this.anInt2806;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)J")
	@Override
	public long method4147() {
		return this.aLong78;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	@Override
	public void method4149() {
		if (this.aLong78 < this.aLong79) {
			this.aLong78 += this.aLong79 - this.aLong78;
		}
		this.aLong80 = 0L;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4146(@OriginalArg(1) long arg0) {
		if (this.aLong79 > this.aLong78) {
			this.aLong80 += this.aLong79 - this.aLong78;
			this.aLong78 += this.aLong79 - this.aLong78;
			this.aLong79 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			local12++;
			this.aLong79 += arg0;
		} while (local12 < 10 && this.aLong78 > this.aLong79);
		if (this.aLong79 < this.aLong78) {
			this.aLong79 = this.aLong78;
		}
		return local12;
	}
}
