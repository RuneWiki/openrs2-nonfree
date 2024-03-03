import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class28 {

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Lclient!h;")
	public static final Class89 aClass89_27 = new Class89(76, -1);

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "F")
	public static float aFloat27 = 1024.0F;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt752 = -1;

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	public int anInt743 = 0;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public int anInt746 = 0;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 19)
	public void method945() {
		this.anInt738 = Class19.anIntArray177[this.anInt736 << 3];
		this.anInt740 = (int) Math.sqrt((double) (this.anInt748 * this.anInt748 + this.anInt754 * this.anInt754 + this.anInt741 * this.anInt741));
		if (this.anInt750 == 0) {
			this.anInt750 = 1;
		}
		if (this.anInt753 == 0) {
			this.aLong23 = 2147483647L;
		} else if (this.anInt753 == 1) {
			this.aLong23 = this.anInt740 * 8 / this.anInt750;
			this.aLong23 *= this.aLong23;
		} else if (this.anInt753 == 2) {
			this.aLong23 = this.anInt740 * 8 / this.anInt750;
		}
		if (this.aBoolean67) {
			this.anInt740 *= -1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!bt;ZI)V", line = 73)
	private void method947(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt736 = arg0.method4830();
		} else if (arg1 == 2) {
			arg0.method4816();
		} else if (arg1 == 3) {
			this.anInt754 = arg0.method4837();
			this.anInt748 = arg0.method4837();
			this.anInt741 = arg0.method4837();
		} else if (arg1 == 4) {
			this.anInt753 = arg0.method4816();
			this.anInt750 = arg0.method4837();
		} else if (arg1 == 6) {
			this.anInt737 = arg0.method4816();
		} else if (arg1 == 8) {
			this.anInt743 = 1;
		} else if (arg1 == 9) {
			this.anInt746 = 1;
		} else if (arg1 == 10) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLclient!bt;)V", line = 166)
	public void method949(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4816();
			if (local14 == 0) {
				return;
			}
			this.method947(arg0, local14);
		}
	}
}
