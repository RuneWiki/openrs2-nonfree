import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!qc;")
	public static Class47 aClass47_5 = new Class47(64);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!o;")
	public static Class40 aClass40_131 = Static12.method257("huffman");

	@OriginalMember(owner = "client!e", name = "I", descriptor = "Lclient!o;")
	public static Class40 aClass40_132 = Static12.method257("flash1:");

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!o;")
	public static Class40 aClass40_133 = Static12.method257("@or3@");

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	public static int anInt470 = 0;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_134 = Static12.method257("@or1@");

	@OriginalMember(owner = "client!e", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_135 = Static12.method257(":0");

	@OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
	public static int[] anIntArray93 = new int[5];

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!od;")
	public static Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt477 = -1;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)I", line = 7)
	@Override
	public int method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt471;
		this.anInt471 = 300;
		@Pc(14) int local14 = this.anInt467;
		this.anInt467 = 1;
		this.aLong33 = System.currentTimeMillis();
		if (this.aLongArray1[this.anInt468] == 0L) {
			this.anInt467 = local14;
			this.anInt471 = local8;
		} else if (this.aLong33 > this.aLongArray1[this.anInt468]) {
			this.anInt471 = (int) ((long) (arg0 * 2560) / (this.aLong33 - this.aLongArray1[this.anInt468]));
		}
		if (this.anInt471 < 25) {
			this.anInt471 = 25;
		}
		if (this.anInt471 > 256) {
			this.anInt471 = 256;
			this.anInt467 = (int) ((long) arg0 - (this.aLong33 - this.aLongArray1[this.anInt468]) / 10L);
		}
		if (this.anInt467 > arg0) {
			this.anInt467 = arg0;
		}
		this.aLongArray1[this.anInt468] = this.aLong33;
		this.anInt468 = (this.anInt468 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt467 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray1[local136] != 0L) {
					this.aLongArray1[local136] -= -((long) this.anInt467);
				}
			}
		}
		if (arg1 > this.anInt467) {
			this.anInt467 = arg1;
		}
		Static86.method1494((long) this.anInt467);
		local136 = 0;
		while (this.anInt463 < 256) {
			this.anInt463 += this.anInt471;
			local136++;
		}
		this.anInt463 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 166)
	@Override
	public void method1280() {
		this.anInt467 = 1;
		this.anInt471 = 256;
		this.anInt463 = 0;
		this.aLong33 = System.currentTimeMillis();
		for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
			this.aLongArray1[local19] = this.aLong33;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 189)
	@Override
	public void method1275() {
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			this.aLongArray1[local12] = 0L;
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 207)
	public Class18_Sub1() {
		this.method1280();
	}
}
