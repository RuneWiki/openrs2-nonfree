import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	private int anInt3529 = 0;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	private int anInt3530 = 1;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "J")
	private long aLong105 = 0L;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)J")
	@Override
	public long method3591() {
		return this.aLong104;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)J")
	@Override
	protected long method3594() {
		this.aLong104 += this.method2932();
		return this.aLong104 < this.aLong103 ? (this.aLong103 - this.aLong104) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	@Override
	public void method3589() {
		this.aLong105 = 0L;
		if (this.aLong103 > this.aLong104) {
			this.aLong104 += this.aLong103 - this.aLong104;
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)J")
	private long method2932() {
		@Pc(4) long local4 = Static521.method7499() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong105;
		this.aLong105 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt3529] = local10;
			this.anInt3529 = (this.anInt3529 + 1) % 10;
			if (this.anInt3530 < 10) {
				this.anInt3530++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt3530; local51++) {
			local49 += this.aLongArray4[(this.anInt3529 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt3530;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method3593(@OriginalArg(1) long arg0) {
		if (this.aLong103 > this.aLong104) {
			this.aLong105 += this.aLong103 - this.aLong104;
			this.aLong104 += this.aLong103 - this.aLong104;
			this.aLong103 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong103 += arg0;
		} while (local45 < 10 && this.aLong104 > this.aLong103);
		if (this.aLong104 > this.aLong103) {
			this.aLong103 = this.aLong104;
		}
		return local45;
	}
}
