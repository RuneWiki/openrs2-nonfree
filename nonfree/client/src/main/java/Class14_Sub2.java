import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "J")
	private long aLong121 = 0L;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
	private int anInt4326 = 0;

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
	private int anInt4327 = 1;

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)J")
	@Override
	public long method3833() {
		return this.aLong122;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)J")
	@Override
	protected long method3831() {
		this.aLong122 += this.method3819();
		return this.aLong121 > this.aLong122 ? (this.aLong121 - this.aLong122) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)J")
	private long method3819() {
		@Pc(4) long local4 = Static374.method6036() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong123;
		this.aLong123 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray13[this.anInt4326] = local9;
			if (this.anInt4327 < 10) {
				this.anInt4327++;
			}
			this.anInt4326 = (this.anInt4326 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4327; local58++) {
			local48 += this.aLongArray13[(this.anInt4326 + 10 - local58) % 10];
		}
		return local48 / (long) this.anInt4327;
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V")
	@Override
	public void method3834() {
		this.aLong123 = 0L;
		if (this.aLong121 > this.aLong122) {
			this.aLong122 += this.aLong121 - this.aLong122;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3830(@OriginalArg(0) long arg0) {
		if (this.aLong121 > this.aLong122) {
			this.aLong123 += this.aLong121 - this.aLong122;
			this.aLong122 += this.aLong121 - this.aLong122;
			this.aLong121 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			local43++;
			this.aLong121 += arg0;
		} while (local43 < 10 && this.aLong121 < this.aLong122);
		if (this.aLong122 > this.aLong121) {
			this.aLong121 = this.aLong122;
		}
		return local43;
	}
}
