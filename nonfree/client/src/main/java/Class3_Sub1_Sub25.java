import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "[Lclient!fh;")
	public static final Class90[] aClass90Array1 = new Class90[5];

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	private int anInt6125 = 2048;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	private int anInt6126 = 1024;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	private int anInt6124 = 3072;

	static {
		for (@Pc(11) int local11 = 0; local11 < aClass90Array1.length; local11++) {
			aClass90Array1[local11] = new Class90();
		}
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.anInt6125 = this.anInt6124 - this.anInt6126;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt6126 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt6124 = arg1.method7591();
		} else if (arg0 == 2) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(21) int[] local21 = this.method7778(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static307.anInt4846; local23++) {
				local11[local23] = this.anInt6126 + (this.anInt6125 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(26) int[][] local26 = this.method7779(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static307.anInt4846; local52++) {
				local42[local52] = this.anInt6126 + (local30[local52] * this.anInt6125 >> 12);
				local46[local52] = this.anInt6126 + (local34[local52] * this.anInt6125 >> 12);
				local50[local52] = (this.anInt6125 * local38[local52] >> 12) + this.anInt6126;
			}
		}
		return local11;
	}
}
