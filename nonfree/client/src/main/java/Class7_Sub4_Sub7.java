import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class7_Sub4_Sub7 extends Class7_Sub4 {

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "[I")
	public static final int[] anIntArray296 = new int[99];

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	private int anInt2189;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
	private int anInt2191;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 99; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray296[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub7() {
		this(0);
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	private Class7_Sub4_Sub7(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1784(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static201.anInt4174; local29++) {
				local19[local29] = this.anInt2184;
				local23[local29] = this.anInt2191;
				local27[local29] = this.anInt2189;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	private void method1784(@OriginalArg(0) int arg0) {
		this.anInt2184 = arg0 >> 12 & 0xFF0;
		this.anInt2191 = arg0 >> 4 & 0xFF0;
		this.anInt2189 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1784(arg0.method2791());
		}
	}
}
