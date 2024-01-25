import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class179_Sub2 extends Class179 {

	@OriginalMember(owner = "client!sq", name = "ib", descriptor = "[I")
	public static final int[] anIntArray760 = new int[120];

	@OriginalMember(owner = "client!sq", name = "lb", descriptor = "I")
	public static int lb = 100;

	@OriginalMember(owner = "client!sq", name = "gb", descriptor = "[I")
	public final int[] anIntArray758 = new int[2200];

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "[[I")
	public final int[][] anIntArrayArray75 = new int[32][512];

	@OriginalMember(owner = "client!sq", name = "db", descriptor = "[[I")
	public final int[][] anIntArrayArray74 = new int[2200][64];

	@OriginalMember(owner = "client!sq", name = "nb", descriptor = "[I")
	public final int[] anIntArray762 = new int[12];

	@OriginalMember(owner = "client!sq", name = "mb", descriptor = "[I")
	public final int[] anIntArray761 = new int[Static485.anInt8455];

	@OriginalMember(owner = "client!sq", name = "pb", descriptor = "[[I")
	public final int[][] anIntArrayArray76 = new int[12][Static485.anInt8458 + 8191];

	@OriginalMember(owner = "client!sq", name = "qb", descriptor = "[I")
	public final int[] anIntArray764 = new int[Static485.anInt8458 + 8191];

	@OriginalMember(owner = "client!sq", name = "ob", descriptor = "[I")
	public final int[] anIntArray763 = new int[Static485.anInt8458 + 8191];

	@OriginalMember(owner = "client!sq", name = "hb", descriptor = "[I")
	public final int[] anIntArray759 = new int[12];

	@OriginalMember(owner = "client!sq", name = "rb", descriptor = "[I")
	public final int[] anIntArray765 = new int[32];

	@OriginalMember(owner = "client!sq", name = "kb", descriptor = "Lclient!qaa;")
	public Class258 aClass258_2;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 120; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local8 += local28;
			anIntArray760[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class179_Sub2(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0);
		this.aClass258_2 = new Class258(arg0);
		super.aClass23_Sub3_58 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_60 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_54 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_59 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_53 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_52 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_57 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_56 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_51 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
		super.aClass23_Sub3_55 = new Class23_Sub3_Sub2(super.aClass9_Sub1_16);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method7259() {
		this.aClass258_2 = new Class258(super.aClass9_Sub1_16);
	}
}
