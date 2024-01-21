import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!f", name = "U", descriptor = "[I")
	public static int[] anIntArray66 = new int[99];

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!b;")
	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Lclient!af;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public int anInt881;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "Lclient!ee;")
	public Class4_Sub9 aClass4_Sub9_1;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!ge;")
	public Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	static {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 99; local15++) {
			@Pc(20) int local20 = local15 + 1;
			@Pc(33) int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local13 += local33;
			anIntArray66[local15] = local13 / 4;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public void method610() {
		this.aClass7_1 = null;
		this.aClass4_Sub2_Sub1_1 = null;
		this.aClass4_Sub9_1 = null;
		this.aClass4_Sub1_Sub1_1 = null;
	}
}
