import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	private int anInt1294;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	private int anInt1295;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
	private int anInt1301;

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class28_Sub1() {
		this.method716();
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	@Override
	public void method717() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray2[local13] = 0L;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	@Override
	public void method716() {
		this.anInt1302 = 1;
		this.anInt1294 = 256;
		this.anInt1301 = 0;
		this.aLong35 = Static49.method877();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray2[local25] = this.aLong35;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	@Override
	public int method715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1302;
		this.anInt1302 = 1;
		@Pc(14) int local14 = this.anInt1294;
		this.anInt1294 = 300;
		this.aLong35 = Static49.method877();
		if (this.aLongArray2[this.anInt1295] == 0L) {
			this.anInt1294 = local14;
			this.anInt1302 = local8;
		} else if (this.aLong35 > this.aLongArray2[this.anInt1295]) {
			this.anInt1294 = (int) ((long) (arg1 * 2560) / (this.aLong35 - this.aLongArray2[this.anInt1295]));
		}
		if (this.anInt1294 < 25) {
			this.anInt1294 = 25;
		}
		if (this.anInt1294 > 256) {
			this.anInt1294 = 256;
			this.anInt1302 = (int) ((long) arg1 - (this.aLong35 - this.aLongArray2[this.anInt1295]) / 10L);
		}
		if (arg1 < this.anInt1302) {
			this.anInt1302 = arg1;
		}
		this.aLongArray2[this.anInt1295] = this.aLong35;
		this.anInt1295 = (this.anInt1295 + 1) % 10;
		@Pc(139) int local139;
		if (this.anInt1302 > 1) {
			for (local139 = 0; local139 < 10; local139++) {
				if (this.aLongArray2[local139] != 0L) {
					this.aLongArray2[local139] += this.anInt1302;
				}
			}
		}
		if (arg0 > this.anInt1302) {
			this.anInt1302 = arg0;
		}
		local139 = 0;
		Static62.method1070((long) this.anInt1302);
		while (this.anInt1301 < 256) {
			this.anInt1301 += this.anInt1294;
			local139++;
		}
		this.anInt1301 &= 0xFF;
		return local139;
	}
}
