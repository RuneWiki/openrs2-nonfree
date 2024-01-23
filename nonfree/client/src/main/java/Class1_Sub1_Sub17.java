import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!in", name = "N", descriptor = "I")
	protected int anInt6249;

	@OriginalMember(owner = "client!in", name = "O", descriptor = "[I")
	protected int[] anIntArray565;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "I")
	protected int anInt6252;

	@OriginalMember(owner = "client!in", name = "X", descriptor = "I")
	private int anInt6255 = -1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public final void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6255 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)I")
	@Override
	public final int method4725() {
		return this.anInt6255;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95 && this.method4731()) {
			@Pc(31) int[] local31 = local18[0];
			@Pc(35) int[] local35 = local18[2];
			@Pc(51) int local51 = (Static265.anInt5306 == this.anInt6249 ? arg0 : this.anInt6249 * arg0 / Static265.anInt5306) * this.anInt6252;
			@Pc(55) int[] local55 = local18[1];
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (this.anInt6252 == Static62.anInt1350) {
				for (local65 = 0; local65 < Static62.anInt1350; local65++) {
					local75 = this.anIntArray565[local51++];
					local35[local65] = (local75 & 0xFF) << 4;
					local55[local65] = local75 >> 4 & 0xFF0;
					local31[local65] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static62.anInt1350; local65++) {
					local75 = local65 * this.anInt6252 / Static62.anInt1350;
					@Pc(82) int local82 = this.anIntArray565[local51 + local75];
					local35[local65] = (local82 & 0xFF) << 4;
					local55[local65] = local82 >> 4 & 0xFF0;
					local31[local65] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	@Override
	public final void method4726() {
		super.method4726();
		this.anIntArray565 = null;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)Z")
	protected final boolean method4731() {
		if (this.anIntArray565 != null) {
			return true;
		} else if (this.anInt6255 >= 0) {
			@Pc(30) Class1_Sub3_Sub13_Sub2 local30 = Static200.anInt4361 < 0 ? Static85.method1466(this.anInt6255, Static16.aClass168_19) : Static190.method3080(Static16.aClass168_19, Static200.anInt4361, this.anInt6255);
			local30.method4221();
			this.anIntArray565 = local30.anIntArray504;
			this.anInt6249 = local30.anInt5573;
			this.anInt6252 = local30.anInt5571;
			return true;
		} else {
			return false;
		}
	}
}
