import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_739 = Static12.method257("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!wc", name = "Rb", descriptor = "Lclient!o;")
	public static Class40 aClass40_740 = Static12.method257("Importing models )2 ");

	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array40 = new Class40[100];

	@OriginalMember(owner = "client!wc", name = "Yb", descriptor = "Lclient!o;")
	public static Class40 aClass40_741 = Static12.method257("You need to set*6nnew contact details)3");

	@OriginalMember(owner = "client!wc", name = "ac", descriptor = "Lclient!o;")
	public static Class40 aClass40_742 = Static12.method257("The server is being updated)3");

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
	private int anInt2599;

	@OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Lclient!be;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(B)I", line = 4)
	public int method1733() {
		return super.aByteArray24[super.anInt2546++] - this.aClass10_1.method231() & 0xFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([II)V", line = 16)
	public void method1734(@OriginalArg(0) int[] arg0) {
		this.aClass10_1 = new Class10(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(II)V", line = 58)
	public void method1736(@OriginalArg(1) int arg0) {
		super.aByteArray24[super.anInt2546++] = (byte) (this.aClass10_1.method231() + arg0);
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(Z)V", line = 75)
	public void method1737() {
		this.anInt2599 = super.anInt2546 * 8;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V", line = 95)
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)V", line = 130)
	public void method1739() {
		super.anInt2546 = (this.anInt2599 + 7) / 8;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(ZI)I", line = 655)
	public int method1742(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2599;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(II)I", line = 671)
	public int method1743(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2599 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt2599 & 0x7);
		this.anInt2599 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.aByteArray24[local10++] & Class12_Sub2.anIntArray235[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += Class12_Sub2.anIntArray235[local26] & super.aByteArray24[local10];
		} else {
			local34 += super.aByteArray24[local10] >> local26 - arg0 & Class12_Sub2.anIntArray235[arg0];
		}
		return local34;
	}
}
