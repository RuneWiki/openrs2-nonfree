import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
	protected int anInt7491;

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
	protected int anInt7495;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
	protected int[] anIntArray575;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	private int anInt7492 = -1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76 && this.method5961()) {
			@Pc(30) int[] local30 = local13[0];
			@Pc(34) int[] local34 = local13[1];
			@Pc(38) int[] local38 = local13[2];
			@Pc(58) int local58 = this.anInt7491 * (this.anInt7495 == Static52.anInt1010 ? arg0 : this.anInt7495 * arg0 / Static52.anInt1010);
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (this.anInt7491 == Static279.anInt4906) {
				for (local64 = 0; local64 < Static279.anInt4906; local64++) {
					local72 = this.anIntArray575[local58++];
					local38[local64] = (local72 & 0xFF) << 4;
					local34[local64] = local72 >> 4 & 0xFF0;
					local30[local64] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static279.anInt4906; local64++) {
					local72 = this.anInt7491 * local64 / Static279.anInt4906;
					@Pc(124) int local124 = this.anIntArray575[local72 + local58];
					local38[local64] = (local124 & 0xFF) << 4;
					local34[local64] = local124 >> 4 & 0xFF0;
					local30[local64] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Z")
	protected final boolean method5961() {
		if (this.anIntArray575 != null) {
			return true;
		} else if (this.anInt7492 >= 0) {
			@Pc(25) Class102 local25 = Static524.anInt2122 >= 0 ? Static601.method2070(Static543.aClass270_113, Static524.anInt2122, this.anInt7492) : Static601.method2081(Static543.aClass270_113, this.anInt7492);
			local25.method2076();
			this.anIntArray575 = local25.method2082();
			this.anInt7495 = local25.anInt2626;
			this.anInt7491 = local25.anInt2624;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	@Override
	public final void method7710() {
		super.method7710();
		this.anIntArray575 = null;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
	@Override
	public final int method7704() {
		return this.anInt7492;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public final void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7492 = arg0.method5771();
		}
	}
}
