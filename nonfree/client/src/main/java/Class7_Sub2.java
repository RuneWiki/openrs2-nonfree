import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method682();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
	@Override
	public int method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt844;
		this.anInt844 = 1;
		@Pc(14) int local14 = this.anInt841;
		this.anInt841 = 300;
		this.aLong32 = System.currentTimeMillis();
		if (this.aLongArray7[this.anInt839] == 0L) {
			this.anInt841 = local14;
			this.anInt844 = local8;
		} else if (this.aLong32 > this.aLongArray7[this.anInt839]) {
			this.anInt841 = (int) ((long) (arg1 * 2560) / (this.aLong32 - this.aLongArray7[this.anInt839]));
		}
		if (this.anInt841 < 25) {
			this.anInt841 = 25;
		}
		if (this.anInt841 > 256) {
			this.anInt841 = 256;
			this.anInt844 = (int) ((long) arg1 - (this.aLong32 - this.aLongArray7[this.anInt839]) / 10L);
		}
		if (arg1 < this.anInt844) {
			this.anInt844 = arg1;
		}
		this.aLongArray7[this.anInt839] = this.aLong32;
		this.anInt839 = (this.anInt839 + 1) % 10;
		@Pc(132) int local132;
		if (this.anInt844 > 1) {
			for (local132 = 0; local132 < 10; local132++) {
				if (this.aLongArray7[local132] != 0L) {
					this.aLongArray7[local132] += this.anInt844;
				}
			}
		}
		if (arg0 > this.anInt844) {
			this.anInt844 = arg0;
		}
		local132 = 0;
		Static41.method888((long) this.anInt844);
		while (this.anInt847 < 256) {
			local132++;
			this.anInt847 += this.anInt841;
		}
		this.anInt847 &= 0xFF;
		return local132;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	@Override
	public void method682() {
		this.anInt844 = 1;
		this.anInt847 = 0;
		this.anInt841 = 256;
		this.aLong32 = System.currentTimeMillis();
		for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
			this.aLongArray7[local19] = this.aLong32;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public void method684() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray7[local15] = 0L;
		}
	}
}
