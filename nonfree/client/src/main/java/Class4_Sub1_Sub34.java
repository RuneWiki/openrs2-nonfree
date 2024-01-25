import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class4_Sub1_Sub34 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	private int anInt9303 = 3072;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
	private int anInt9304 = 1024;

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
	private int anInt9305 = 2048;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int[] local29 = this.method8392(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static376.anInt7260; local31++) {
				local11[local31] = this.anInt9304 + (local29[local31] * this.anInt9305 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[][] local26 = this.method8385(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static376.anInt7260; local52++) {
				local42[local52] = (local30[local52] * this.anInt9305 >> 12) + this.anInt9304;
				local46[local52] = this.anInt9304 + (local34[local52] * this.anInt9305 >> 12);
				local50[local52] = this.anInt9304 + (this.anInt9305 * local38[local52] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.anInt9305 = this.anInt9303 - this.anInt9304;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9304 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt9303 = arg1.method4936();
		} else if (arg0 == 2) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}
}
