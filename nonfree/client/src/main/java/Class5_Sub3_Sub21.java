import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class Class5_Sub3_Sub21 extends Class5_Sub3 {

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
	protected int anInt3602;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
	protected int[] anIntArray360;

	@OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
	protected int anInt3613;

	@OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
	private int anInt3612 = -1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	@Override
	public final void method6014() {
		super.method6014();
		this.anIntArray360 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83 && this.method3261()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static227.anInt4557 == this.anInt3613 ? arg0 : this.anInt3613 * arg0 / Static227.anInt4557) * this.anInt3602;
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt3602 == Static7.anInt129) {
				for (local61 = 0; local61 < Static7.anInt129; local61++) {
					local70 = this.anIntArray360[local51++];
					local31[local61] = (local70 & 0xFF) << 4;
					local27[local61] = local70 >> 4 & 0xFF0;
					local23[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static7.anInt129; local61++) {
					local70 = local61 * this.anInt3602 / Static7.anInt129;
					@Pc(77) int local77 = this.anIntArray360[local70 + local51];
					local31[local61] = (local77 & 0xFF) << 4;
					local27[local61] = local77 >> 4 & 0xFF0;
					local23[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)I")
	@Override
	public final int method6021() {
		return this.anInt3612;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public final void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3612 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Z")
	protected final boolean method3261() {
		if (this.anIntArray360 != null) {
			return true;
		} else if (this.anInt3612 >= 0) {
			@Pc(27) Class100 local27 = Static150.anInt2939 < 0 ? Static363.method2677(Static213.aClass93_81, this.anInt3612) : Static363.method2672(Static213.aClass93_81, Static150.anInt2939, this.anInt3612);
			local27.method2675();
			this.anIntArray360 = local27.method2684();
			this.anInt3602 = local27.anInt2902;
			this.anInt3613 = local27.anInt2901;
			return true;
		} else {
			return false;
		}
	}
}
