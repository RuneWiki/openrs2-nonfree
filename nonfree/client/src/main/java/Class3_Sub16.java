import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!ew", name = "C", descriptor = "[I")
	public static final int[] anIntArray151 = new int[120];

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
	public int anInt2815;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "Lclient!lq;")
	public Class3_Sub35 aClass3_Sub35_1;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
	public int anInt2819;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
	public int anInt2821;

	@OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
	public int anInt2822;

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
	public int anInt2823;

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "Lclient!uga;")
	public Class353 aClass353_1;

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
	public int anInt2825;

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
	public int anInt2826;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
	public int anInt2827;

	@OriginalMember(owner = "client!ew", name = "A", descriptor = "Lclient!vca;")
	public Class3_Sub12_Sub4 aClass3_Sub12_Sub4_2;

	@OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
	public int anInt2828;

	@OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
	public int anInt2829;

	@OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
	public int anInt2830;

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
	public int anInt2831;

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "Lclient!pv;")
	public Class3_Sub39_Sub1 aClass3_Sub39_Sub1_2;

	@OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
	public int anInt2832;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 120; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray151[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public void method2451() {
		this.aClass353_1 = null;
		this.aClass3_Sub12_Sub4_2 = null;
		this.aClass3_Sub39_Sub1_2 = null;
		this.aClass3_Sub35_1 = null;
	}
}
