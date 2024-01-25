import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "J")
	private long aLong64 = 0L;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	private int anInt1775 = 1;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	private int anInt1776 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "J")
	private long aLong65 = 0L;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)J")
	@Override
	public long method2252() {
		return this.aLong63;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)J")
	private long method1557() {
		@Pc(4) long local4 = Static282.method3962() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong64;
		this.aLong64 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt1776] = local10;
			this.anInt1776 = (this.anInt1776 + 1) % 10;
			if (this.anInt1775 < 10) {
				this.anInt1775++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1775; local57++) {
			local47 += this.aLongArray2[(this.anInt1776 + 10 - local57) % 10];
		}
		return local47 / (long) this.anInt1775;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2253(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong63 += this.method1557();
		if (this.aLong63 < this.aLong65) {
			Static435.method5503((this.aLong65 - this.aLong63) / 1000000L);
			this.aLong64 += this.aLong65 - this.aLong63;
			this.aLong63 += this.aLong65 - this.aLong63;
			this.aLong65 += local4;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			this.aLong65 += local4;
			local65++;
		} while (local65 < 10 && this.aLong65 < this.aLong63);
		if (this.aLong65 < this.aLong63) {
			this.aLong65 = this.aLong63;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	@Override
	public void method2248() {
		if (this.aLong65 > this.aLong63) {
			this.aLong63 += this.aLong65 - this.aLong63;
		}
		this.aLong64 = 0L;
	}
}
