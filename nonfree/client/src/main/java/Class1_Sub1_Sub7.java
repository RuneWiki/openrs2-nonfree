import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
	protected int[] anIntArray562;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
	protected int anInt4781;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
	protected int anInt4782;

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
	private int anInt4783 = -1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)Z")
	protected final boolean method3654() {
		if (this.anIntArray562 != null) {
			return true;
		} else if (this.anInt4783 >= 0) {
			@Pc(38) Class1_Sub2_Sub2_Sub1 local38 = Static103.anInt1939 >= 0 ? Static62.method1042(Static103.anInt1939, Static239.aClass7_196, this.anInt4783) : Static44.method812(this.anInt4783, Static239.aClass7_196);
			local38.method3929();
			this.anInt4781 = local38.anInt5119;
			this.anInt4782 = local38.anInt5112;
			this.anIntArray562 = local38.anIntArray598;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)V")
	@Override
	public final void method4460() {
		super.method4460();
		this.anIntArray562 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396 && this.method3654()) {
			@Pc(30) int[] local30 = local17[0];
			@Pc(34) int[] local34 = local17[1];
			@Pc(54) int local54 = this.anInt4781 * (Static219.anInt4483 == this.anInt4782 ? arg0 : arg0 * this.anInt4782 / Static219.anInt4483);
			@Pc(58) int[] local58 = local17[2];
			@Pc(64) int local64;
			@Pc(78) int local78;
			if (this.anInt4781 == Static131.anInt2513) {
				for (local64 = 0; local64 < Static131.anInt2513; local64++) {
					local78 = this.anIntArray562[local54++];
					local58[local64] = (local78 & 0xFF) << 4;
					local34[local64] = local78 >> 4 & 0xFF0;
					local30[local64] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static131.anInt2513; local64++) {
					local78 = this.anInt4781 * local64 / Static131.anInt2513;
					@Pc(85) int local85 = this.anIntArray562[local78 + local54];
					local58[local64] = (local85 & 0xFF) << 4;
					local34[local64] = local85 >> 4 & 0xFF0;
					local30[local64] = local85 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public final void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4783 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I")
	@Override
	public final int method4453() {
		return this.anInt4783;
	}
}
