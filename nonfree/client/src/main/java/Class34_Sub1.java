import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "J")
	private long aLong31 = 0L;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "J")
	private long aLong32 = 0L;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	private int anInt1093 = 0;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	private int anInt1092 = 1;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[J")
	private long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.aLong32 = System.nanoTime();
		this.aLong31 = System.nanoTime();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J")
	@Override
	public long method4653() {
		return this.aLong32;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)J")
	private long method921() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong33;
		@Pc(15) long local15 = 0L;
		this.aLong33 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray3[this.anInt1093] = local6;
			if (this.anInt1092 < 1) {
				this.anInt1092++;
			}
			this.anInt1093 = (this.anInt1093 + 1) % 10;
		}
		for (@Pc(58) int local58 = 1; local58 <= this.anInt1092; local58++) {
			local15 += this.aLongArray3[(this.anInt1093 + 10 - local58) % 10];
		}
		return local15 / (long) this.anInt1092;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	@Override
	public void method4656() {
		if (this.aLong31 > this.aLong32) {
			this.aLong32 += this.aLong31 - this.aLong32;
		}
		this.aLong33 = 0L;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	@Override
	public int method4655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) arg1 * 1000000L;
		Static16.method242((long) arg0);
		this.aLong32 += this.method921();
		if (this.aLong31 > this.aLong32) {
			Static16.method242((this.aLong31 - this.aLong32) / 1000000L);
			this.aLong33 += this.aLong31 - this.aLong32;
			this.aLong32 += this.aLong31 - this.aLong32;
			this.aLong31 += local11;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong31 += local11;
		} while (local70 < 10 && this.aLong32 > this.aLong31);
		if (this.aLong32 > this.aLong31) {
			this.aLong31 = this.aLong32;
		}
		return local70;
	}
}
