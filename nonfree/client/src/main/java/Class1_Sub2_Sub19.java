import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "[I")
	protected int[] anIntArray430;

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
	protected int anInt3331;

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
	protected int anInt3332;

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
	private int anInt3330 = -1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)Z")
	protected final boolean method2546() {
		if (this.anIntArray430 != null) {
			return true;
		} else if (this.anInt3330 >= 0) {
			@Pc(22) Class1_Sub1_Sub6_Sub1 local22 = Static22.method375(Static125.aClass7_23, this.anInt3330);
			local22.method2171();
			this.anInt3332 = local22.anInt2839;
			this.anInt3331 = local22.anInt2841;
			this.anIntArray430 = local22.anIntArray366;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)I")
	@Override
	public final int method3510() {
		return this.anInt3330;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175 && this.method2546()) {
			@Pc(30) int[] local30 = local18[0];
			@Pc(34) int[] local34 = local18[1];
			@Pc(54) int local54 = this.anInt3332 * (Static53.anInt1436 == this.anInt3331 ? arg0 : this.anInt3331 * arg0 / Static53.anInt1436);
			@Pc(58) int[] local58 = local18[2];
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (Static105.anInt2391 == this.anInt3332) {
				for (local64 = 0; local64 < Static105.anInt2391; local64++) {
					local73 = this.anIntArray430[local54++];
					local58[local64] = (local73 & 0xFF) << 4;
					local34[local64] = local73 >> 4 & 0xFF0;
					local30[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static105.anInt2391; local64++) {
					local73 = local64 * this.anInt3332 / Static105.anInt2391;
					@Pc(80) int local80 = this.anIntArray430[local73 + local54];
					local58[local64] = (local80 & 0xFF) << 4;
					local34[local64] = local80 >> 4 & 0xFF0;
					local30[local64] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public final void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3330 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	@Override
	public final void method3509() {
		super.method3509();
		this.anIntArray430 = null;
	}
}
