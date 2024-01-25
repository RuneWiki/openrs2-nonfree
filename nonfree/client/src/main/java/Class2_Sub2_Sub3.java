import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
	protected int[] anIntArray40;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	protected int anInt443;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
	protected int anInt448;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
	private int anInt446 = -1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I")
	@Override
	public final int method5468() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	@Override
	public final void method5467() {
		super.method5467();
		this.anIntArray40 = null;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Z")
	protected final boolean method359() {
		if (this.anIntArray40 != null) {
			return true;
		} else if (this.anInt446 >= 0) {
			@Pc(27) Class17 local27 = Static5.anInt74 < 0 ? Static461.method259(Static316.aClass54_86, this.anInt446) : Static461.method262(Static316.aClass54_86, Static5.anInt74, this.anInt446);
			local27.method257();
			this.anIntArray40 = local27.method261();
			this.anInt443 = local27.anInt345;
			this.anInt448 = local27.anInt342;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public final void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt446 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419 && this.method359()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(57) int local57 = this.anInt448 * (this.anInt443 == Static290.anInt4775 ? arg0 : this.anInt443 * arg0 / Static290.anInt4775);
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (this.anInt448 == Static217.anInt3574) {
				for (local67 = 0; local67 < Static217.anInt3574; local67++) {
					local76 = this.anIntArray40[local57++];
					local37[local67] = (local76 & 0xFF) << 4;
					local33[local67] = local76 >> 4 & 0xFF0;
					local29[local67] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static217.anInt3574; local67++) {
					local76 = this.anInt448 * local67 / Static217.anInt3574;
					@Pc(83) int local83 = this.anIntArray40[local76 + local57];
					local37[local67] = (local83 & 0xFF) << 4;
					local33[local67] = local83 >> 4 & 0xFF0;
					local29[local67] = local83 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
