import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "[J")
	private final long[] aLongArray38 = new long[10];

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt4612 = 1;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	private int anInt4617 = 0;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	private int anInt4620 = 256;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "J")
	private long aLong146 = Static24.method503();

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class3_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray38[local22] = this.aLong146;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)I")
	@Override
	public int method3512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt4620;
		this.anInt4620 = 300;
		@Pc(14) int local14 = this.anInt4612;
		this.anInt4612 = 1;
		this.aLong146 = Static24.method503();
		if (this.aLongArray38[this.anInt4619] == 0L) {
			this.anInt4612 = local14;
			this.anInt4620 = local4;
		} else if (this.aLongArray38[this.anInt4619] < this.aLong146) {
			this.anInt4620 = (int) ((long) (arg0 * 2560) / (this.aLong146 - this.aLongArray38[this.anInt4619]));
		}
		if (this.anInt4620 < 25) {
			this.anInt4620 = 25;
		}
		if (this.anInt4620 > 256) {
			this.anInt4620 = 256;
			this.anInt4612 = (int) ((long) arg0 - (this.aLong146 - this.aLongArray38[this.anInt4619]) / 10L);
		}
		if (this.anInt4612 > arg0) {
			this.anInt4612 = arg0;
		}
		this.aLongArray38[this.anInt4619] = this.aLong146;
		this.anInt4619 = (this.anInt4619 + 1) % 10;
		@Pc(129) int local129;
		if (this.anInt4612 > 1) {
			for (local129 = 0; local129 < 10; local129++) {
				if (this.aLongArray38[local129] != 0L) {
					this.aLongArray38[local129] += this.anInt4612;
				}
			}
		}
		if (this.anInt4612 < arg1) {
			this.anInt4612 = arg1;
		}
		Static75.method3577((long) this.anInt4612);
		local129 = 0;
		while (this.anInt4617 < 256) {
			this.anInt4617 += this.anInt4620;
			local129++;
		}
		this.anInt4617 &= 0xFF;
		return local129;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	@Override
	public void method3515() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray38[local11] = 0L;
		}
	}
}
