import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class2_Sub4_Sub31 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nw", name = "J", descriptor = "I")
	private int anInt6788;

	@OriginalMember(owner = "client!nw", name = "L", descriptor = "I")
	private int anInt6790;

	@OriginalMember(owner = "client!nw", name = "O", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!nw", name = "T", descriptor = "I")
	private int anInt6796 = -1;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I")
	@Override
	public int method8888() {
		return this.anInt6796;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(46) int local46 = (Static118.anInt2485 == this.anInt6788 ? arg0 : this.anInt6788 * arg0 / Static118.anInt2485) * this.anInt6790;
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (this.anInt6790 == Static395.anInt6816) {
				for (local64 = 0; local64 < Static395.anInt6816; local64++) {
					local73 = this.anIntArray447[local46++];
					local58[local64] = (local73 & 0xFF) << 4;
					local54[local64] = local73 >> 4 & 0xFF0;
					local50[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static395.anInt6816; local64++) {
					local73 = local64 * this.anInt6790 / Static395.anInt6816;
					@Pc(80) int local80 = this.anIntArray447[local73 + local46];
					local58[local64] = (local80 & 0xFF) << 4;
					local54[local64] = local80 >> 4 & 0xFF0;
					local50[local64] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BII)V")
	@Override
	public void method8891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8891(arg0, arg1);
		if (this.anInt6796 >= 0 && Static353.anInterface2_9 != null) {
			@Pc(27) int local27 = Static353.anInterface2_9.method6027(this.anInt6796).aBoolean516 ? 64 : 128;
			this.anIntArray447 = Static353.anInterface2_9.method6024(local27, this.anInt6796, false, local27, 1.0F);
			this.anInt6790 = local27;
			this.anInt6788 = local27;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6796 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8890() {
		super.method8890();
		this.anIntArray447 = null;
	}
}
