import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qia", name = "z", descriptor = "I")
	private int anInt8280 = 3072;

	@OriginalMember(owner = "client!qia", name = "E", descriptor = "I")
	private int anInt8284 = 2048;

	@OriginalMember(owner = "client!qia", name = "K", descriptor = "I")
	private int anInt8288 = 1024;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[][] local26 = this.method8718(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static30.anInt908; local52++) {
				local42[local52] = (local30[local52] * this.anInt8284 >> 12) + this.anInt8288;
				local46[local52] = this.anInt8288 + (local34[local52] * this.anInt8284 >> 12);
				local50[local52] = this.anInt8288 + (this.anInt8284 * local38[local52] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8288 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt8280 = arg0.method4858();
		} else if (arg1 == 2) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(28) int[] local28 = this.method8716(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static30.anInt908; local30++) {
				local16[local30] = (local28[local30] * this.anInt8284 >> 12) + this.anInt8288;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.anInt8284 = this.anInt8280 - this.anInt8288;
	}
}
