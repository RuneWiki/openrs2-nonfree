import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public class Class6_Sub4_Sub6 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "[I")
	protected int[] anIntArray153;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
	protected int anInt1847;

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
	protected int anInt1848;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	private int anInt1849 = -1;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)V")
	@Override
	public final void method7751() {
		super.method7751();
		this.anIntArray153 = null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public final void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1849 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54 && this.method1743()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = (Static88.anInt1743 == this.anInt1848 ? arg0 : arg0 * this.anInt1848 / Static88.anInt1743) * this.anInt1847;
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (this.anInt1847 == Static408.anInt7209) {
				for (local69 = 0; local69 < Static408.anInt7209; local69++) {
					local77 = this.anIntArray153[local59++];
					local39[local69] = (local77 & 0xFF) << 4;
					local35[local69] = local77 >> 4 & 0xFF0;
					local31[local69] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static408.anInt7209; local69++) {
					local77 = local69 * this.anInt1847 / Static408.anInt7209;
					@Pc(126) int local126 = this.anIntArray153[local59 + local77];
					local39[local69] = (local126 & 0xFF) << 4;
					local35[local69] = local126 >> 4 & 0xFF0;
					local31[local69] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z")
	protected final boolean method1743() {
		if (this.anIntArray153 != null) {
			return true;
		} else if (this.anInt1849 >= 0) {
			@Pc(30) Class140 local30 = Static328.anInt5995 < 0 ? Static604.method3624(Static131.aClass251_32, this.anInt1849) : Static604.method3623(Static131.aClass251_32, Static328.anInt5995, this.anInt1849);
			local30.method3626();
			this.anIntArray153 = local30.method3614();
			this.anInt1847 = local30.anInt4127;
			this.anInt1848 = local30.anInt4129;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
	@Override
	public final int method7749() {
		return this.anInt1849;
	}
}
