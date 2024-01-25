import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
	protected int anInt1398;

	@OriginalMember(owner = "client!wba", name = "K", descriptor = "[I")
	protected int[] anIntArray59;

	@OriginalMember(owner = "client!wba", name = "L", descriptor = "I")
	protected int anInt1401;

	@OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
	private int anInt1396 = -1;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233 && this.method1366()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = this.anInt1401 * (this.anInt1398 == Static157.anInt2964 ? arg0 : arg0 * this.anInt1398 / Static157.anInt2964);
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt1401 == Static30.anInt908) {
				for (local65 = 0; local65 < Static30.anInt908; local65++) {
					local74 = this.anIntArray59[local59++];
					local39[local65] = (local74 & 0xFF) << 4;
					local35[local65] = local74 >> 4 & 0xFF0;
					local31[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static30.anInt908; local65++) {
					local74 = local65 * this.anInt1401 / Static30.anInt908;
					@Pc(82) int local82 = this.anIntArray59[local59 + local74];
					local39[local65] = (local82 & 0xFF) << 4;
					local35[local65] = local82 >> 4 & 0xFF0;
					local31[local65] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
	@Override
	public final void method8715() {
		super.method8715();
		this.anIntArray59 = null;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public final void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1396 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I")
	@Override
	public final int method8717() {
		return this.anInt1396;
	}

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)Z")
	protected final boolean method1366() {
		if (this.anIntArray59 != null) {
			return true;
		} else if (this.anInt1396 >= 0) {
			@Pc(31) Class150 local31 = Static206.anInt3825 < 0 ? Static683.method3279(Static1.aClass143_140, this.anInt1396) : Static683.method3275(Static1.aClass143_140, Static206.anInt3825, this.anInt1396);
			local31.method3276();
			this.anIntArray59 = local31.method3286();
			this.anInt1398 = local31.anInt3828;
			this.anInt1401 = local31.anInt3831;
			return true;
		} else {
			return false;
		}
	}
}
