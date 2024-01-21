import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method925();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
	@Override
	public int method922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt260;
		this.anInt260 = 300;
		@Pc(14) int local14 = this.anInt257;
		this.anInt257 = 1;
		this.aLong12 = Static10.method244();
		if (this.aLongArray5[this.anInt259] == 0L) {
			this.anInt257 = local14;
			this.anInt260 = local8;
		} else if (this.aLongArray5[this.anInt259] < this.aLong12) {
			this.anInt260 = (int) ((long) (arg1 * 2560) / (this.aLong12 - this.aLongArray5[this.anInt259]));
		}
		if (this.anInt260 < 25) {
			this.anInt260 = 25;
		}
		if (this.anInt260 > 256) {
			this.anInt260 = 256;
			this.anInt257 = (int) ((long) arg1 - (this.aLong12 - this.aLongArray5[this.anInt259]) / 10L);
		}
		if (this.anInt257 > arg1) {
			this.anInt257 = arg1;
		}
		this.aLongArray5[this.anInt259] = this.aLong12;
		this.anInt259 = (this.anInt259 + 1) % 10;
		@Pc(133) int local133;
		if (this.anInt257 > 1) {
			for (local133 = 0; local133 < 10; local133++) {
				if (this.aLongArray5[local133] != 0L) {
					this.aLongArray5[local133] += this.anInt257;
				}
			}
		}
		local133 = 0;
		if (this.anInt257 < arg0) {
			this.anInt257 = arg0;
		}
		Static80.method1260((long) this.anInt257);
		while (this.anInt265 < 256) {
			this.anInt265 += this.anInt260;
			local133++;
		}
		this.anInt265 &= 0xFF;
		return local133;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	@Override
	public void method925() {
		this.anInt257 = 1;
		this.anInt260 = 256;
		this.anInt265 = 0;
		this.aLong12 = Static10.method244();
		for (@Pc(18) int local18 = 0; local18 < 10; local18++) {
			this.aLongArray5[local18] = this.aLong12;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public void method923() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray5[local3] = 0L;
		}
	}
}
